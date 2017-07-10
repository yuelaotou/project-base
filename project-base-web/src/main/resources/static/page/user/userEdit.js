/**
 * Created by dmin on 2017/7/7.
 */
$(function() {
    //初始化验证
    init_validator();
    //点击更新按钮
   $("#updateBtn").click(function() {
       //表单验证未通过
       if (!validator.checkAll($("#userEditForm"))) {
           //直接返回
           return ;
       }
       var paramObj = {
           id: $("#userEditId").val(),
           name: $("#userEditName").val(),
           age: $("#userEditAge").val(),
           phone: $("#userEditPhone").val()
       };
       $.ajax({
           url:"/user/updateUser",    //请求的url地址
           dataType:"json",   //返回格式为json
           async:true,//请求是否异步，默认为异步，这也是ajax重要特性
           data:paramObj,    //参数值
           type:"GET",   //请求方式
           success:function(result){
               //请求成功时处理
               if (result && true == result.success) {
                   //关闭对话框
                   $('#editUserModal').modal('hide');
                   //alert("编辑用户成功！");
                   new PNotify({
                       title: '成功提示',
                       text: '编辑用户成功！',
                       type: 'success',
                       styling: 'bootstrap3'
                   });
                   //刷新查询列表
                   $('#userTable').bootstrapTable('refresh');
               } else {
                   //alert("编辑用户失败：" + result.message);
                   new PNotify({
                       title: '失败提示',
                       text: '编辑用户失败：' + result.message,
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
});