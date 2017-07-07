<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span>
    </button>
    <h4 class="modal-title" id="myModalLabel">编辑用户</h4>
</div>
<div class="modal-body">
    <form id="userEditForm" class="form-horizontal form-label-left" novalidate="">
        <span class="section">用户信息</span>

        <input type="hidden" id="userEditId" value="${user.id}"/>

        <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="userEditName">用户姓名： <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
                <input id="userEditName" class="form-control col-md-7 col-xs-12" data-validate-length-range="2,5" data-validate-words="2" name="userEditName" placeholder="" required="required" type="text" value="${user.name}">
            </div>
        </div>

        <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="userEditAge">年龄：<span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
                <input type="number" id="userEditAge" name="userEditAge" required="required" data-validate-minmax="1,150" class="form-control col-md-7 col-xs-12" value="${user.age}">
            </div>
        </div>


        <#--<div class="item form-group">-->
            <#--<label for="userEditPassword" class="control-label col-md-3">密码：</label>-->
            <#--<div class="col-md-6 col-sm-6 col-xs-12">-->
                <#--<input id="userEditPassword" type="password" name="userEditPassword" data-validate-length="6,8" class="form-control col-md-7 col-xs-12" required="required">-->
            <#--</div>-->
        <#--</div>-->
        <#--<div class="item form-group">-->
            <#--<label for="userEdit.password2" class="control-label col-md-3 col-sm-3 col-xs-12">确认密码：</label>-->
            <#--<div class="col-md-6 col-sm-6 col-xs-12">-->
                <#--<input id="userEditPassword2" type="password" name="userEditaPassword2" data-validate-linked="password" class="form-control col-md-7 col-xs-12" required="required">-->
            <#--</div>-->
        <#--</div>-->
        <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="userEditPhone">电话： <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
                <input type="tel" id="userEditPhone" name="userEditPhone" required="required" data-validate-length-range="8,20" class="form-control col-md-7 col-xs-12" value="${user.phone}">
            </div>
        </div>

    </form>


</div>
<div class="modal-footer">
    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
    <button id="updateBtn" type="button" class="btn btn-primary">修&nbsp;改</button>
</div>



<script src="page/user/userEdit.js"></script>