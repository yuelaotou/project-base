

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
	    method: 'get',
        pagination: true,
        sidePagination: "server",
        singleSelect: true,
        clickToSelect: true
	});
});

function onEditClick(id){
	alert("edit:"+id);
}
function onDeleteClick(id){
	alert("delete:"+id);
}