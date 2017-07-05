

$(document).ready(function() {
	$('#table').bootstrapTable({
	    url: '/user/selectPage',//服务器数据的加载地址 
	    columns: [{
	        field: 'id',
	        title: '用户ID'
	    }, {
	        field: 'name',
	        title: '用户名'
	    }, {
	        field: 'age',
	        title: '年龄'
	    }, {
	        field: 'phone',
	        title: '电话'
	    }, {
	        field: 'createTime',
	        title: '创建日期'
	    }, {
	        field: 'createPin',
	        title: '创建人'
	    }],//页面需要展示的列，后端交互对象的属性  
	    method: 'post',
        dataType: "json",
        striped: true,     //使表格带有条纹
        pagination: true,    //在表格底部显示分页工具栏
        pageSize: 10,
        pageNumber: 1,
        pageList: [10, 20, 50, 100, 200, 500],
        idField: "id",  //标识哪个字段为id主键
        showToggle: false,   //名片格式
        cardView: false,//设置为True时显示名片（card）布局
        showColumns: true, //显示隐藏列  
        showRefresh: true,  //显示刷新按钮
        singleSelect: true,//复选框只能选择一条记录
        search: false,//是否显示右上角的搜索框
        clickToSelect: true,//点击行即可选中单选/复选框
        sidePagination: "server",//表格分页的位置
        queryParamsType: "limit", //参数格式,发送标准的RESTFul类型的参数请求
        toolbar: "#toolbar", //设置工具栏的Id或者class
        silent: true,  //刷新事件必须设置
        formatLoadingMessage: function () {
            return "请稍等，正在加载中...";
        },
        formatNoMatches: function () {  //没有匹配的结果
            return '无符合条件的记录';
        },
        onLoadSuccess: function () {
            
        },
        onLoadError: function (data) {
            //$('#reportTable').bootstrapTable('removeAll');
        },
        onClickRow: function (row) {
            //window.location.href = "/qStock/qProInfo/" + row.ProductId;
        },
        responseHandler: function(res) {
            if(res.code == 1){
                return {
                    "total": res.data.total,//总页数
                    "rows": res.data.rows   //数据
                 };
                
            }
        }
	});
});