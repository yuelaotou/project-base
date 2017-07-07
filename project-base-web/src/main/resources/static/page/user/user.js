

$(document).ready(function() {
    $('#table').bootstrapTable({
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
                    var e = '<a href="javascript:void(0)" onclick="onEditClick(\''+ row.id + '\')">编辑</a> ';
                    var d = '<a href="javascript:void(0)" onclick="onDeleteClick(\''+ row.id + '\')">删除</a> ';
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

function onEditClick(id){
    alert("edit:"+id);
}
function onDeleteClick(id){
    alert("delete:"+id);
}

/**
 * 查询按钮
 */
function onSearchBtnClick(){
    //刷新表格并且重置当前页为第1页
    $('#table').bootstrapTable('refreshOptions',{pageNumber:1, pageSize:10});
}

/**
 * 关闭【新增modal】时清空 modal缓存（否则不走url链接页面）
 * 解决：modal.href仅第一次请求url链接，以后不再请求（使用本地缓存，输入框上仍有上次输入内容）->每次都请求url链接页面
 */
$("#addUserModal").on("hidden.bs.modal", function() {
    $(this).removeData("bs.modal");
});