

$(document).ready(function() {
    $('#userTable').bootstrapTable({
        url: '/user/selectPage',//服务器数据的加载地址
        columns: [
            {checkbox: true},
            {field: 'id', title: '用户ID', align:'center', valign:'middle'},
            {field: 'name', title: '用户名', align:'center', valign:'middle'},
            {field: 'age', title: '年龄', align:'center', valign:'middle'},
            {field: 'phone', title: '电话', align:'center', valign:'middle'},
            {field: 'createTime', title: '创建日期', align:'center', valign:'middle',
                formatter:function(value,row,index){
                    return formatDate(value);
                }
            },
            {field: 'createPin', title: '创建人', align:'center', valign:'middle'},
            {field: '#', title: '操作', align: 'center', valign:'middle',
                formatter:function(value,row,index){
                    // var e = '<a href="javascript:void(0)" onclick="onEditClick(\''+ row.id + '\')">编辑</a> ';
                    console.info("row.id=" + row.id);
                    var e = '<a data-toggle="modal" href="/user/toUserEditPage?id=' + row.id + '" data-target="#editUserModal" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i>编辑</a> ';
                    var d = '<a href="javascript:void(0)" onclick="onDeleteClick(\''+ row.id + '\')" class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i>删除</a> ';


                    return e+d;
                }
            }
        ],//页面需要展示的列，后端交互对象的属性
        queryParams:function(params){
            $("#search-form .form-control").each(function() {
                if ($(this).val() && $.trim($(this).val()) != '') {
                    params[$(this).attr("id")] = $(this).val();
                }
                console.info(params);
            });
            return params;
        },
        queryParamsType:"",//取消"limit"格式（current,offset,limit）而改用(pageNumber,pageSize)
        method: 'get',
        pagination: true,
        sidePagination: "server",
        singleSelect: true,
        clickToSelect: true
    });

    $('#createTimeStart').datetimepicker({
        format: 'YYYY-MM-DD',
        locale: moment.locale('zh-cn')
    }).on("dp.change", function(e) {
        $('#createTimeEnd').data("DateTimePicker").minDate(e.date);
    });


    $("#createTimeEnd").datetimepicker({
        format: 'YYYY-MM-DD',
        locale: moment.locale('zh-cn')
    }).on("dp.change", function(e) {
        $('#createTimeStart').data("DateTimePicker").maxDate(e.date);
    });

});

// function onEditClick(id){
//     alert("edit:"+id);
// }
function onDeleteClick(id){
    confirmModal("确认删除该记录？", function() {
        $.ajax({
            url:"/user/deleteUser",    //请求的url地址
            dataType:"json",   //返回格式为json
            async:true,//请求是否异步，默认为异步，这也是ajax重要特性
            data:{id: id},    //参数值
            type:"GET",   //请求方式
            success:function(result){
                debugger;
                //请求成功时处理
                if (result && true == result.success) {
                    //关闭对话框
                    //alert("删除用户成功！");
                    new PNotify({
                        title: '成功提示',
                        text: '删除用户成功！',
                        type: 'success',
                        styling: 'bootstrap3'
                    });
                    //刷新查询列表
                    $('#userTable').bootstrapTable('refresh');
                } else {
                    //alert("删除用户失败：" + result.message);
                    new PNotify({
                        title: '失败提示',
                        text: '删除用户失败：' + result.message,
                        type: 'error',
                        styling: 'bootstrap3'
                    });
                }
            },
            beforeSend:function(){
                //请求前的处理
            },
            complete:function(){
                //请求完成的处理
            },
            error:function(){
                //请求出错处理
            }
        });
    });
}

/**
 * 查询按钮
 */
function onSearchBtnClick(){
    var curPageSize = 10 ;
    if($(".dropdown-toggle .page-size").length > 0) {
        curPageSize = parseInt($(".dropdown-toggle .page-size").text());
    }
    //刷新表格并且重置当前页为第1页
    $('#userTable').bootstrapTable('refreshOptions',{pageNumber:1, pageSize:curPageSize});
}

/**
 * 关闭【modal】时清空 modal缓存（否则不走url链接页面）
 * 解决：modal.href仅第一次请求url链接，以后不再请求（使用本地缓存，输入框上仍有上次输入内容）->每次都请求url链接页面
 */
$("#addUserModal, #editUserModal").on("hidden.bs.modal", function() {
    $(this).removeData("bs.modal");
});