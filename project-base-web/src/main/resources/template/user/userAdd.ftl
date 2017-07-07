<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span>
    </button>
    <h4 class="modal-title" id="myModalLabel">新增用户</h4>
</div>
<div class="modal-body">
    <form id="userAddForm" class="form-horizontal form-label-left" novalidate="">
        <span class="section">用户信息</span>

        <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="userAddName">用户姓名： <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
                <input id="userAddName" class="form-control col-md-7 col-xs-12" data-validate-length-range="2,5" data-validate-words="2" name="userAddName" placeholder="" required="required" type="text">
            </div>
        </div>

        <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="userAddAge">年龄：<span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
                <input type="number" id="userAddAge" name="userAddAge" required="required" data-validate-minmax="1,150" class="form-control col-md-7 col-xs-12">
            </div>
        </div>


        <#--<div class="item form-group">-->
            <#--<label for="userAddPassword" class="control-label col-md-3">密码：</label>-->
            <#--<div class="col-md-6 col-sm-6 col-xs-12">-->
                <#--<input id="userAddPassword" type="password" name="userAddPassword" data-validate-length="6,8" class="form-control col-md-7 col-xs-12" required="required">-->
            <#--</div>-->
        <#--</div>-->
        <#--<div class="item form-group">-->
            <#--<label for="userAdd.password2" class="control-label col-md-3 col-sm-3 col-xs-12">确认密码：</label>-->
            <#--<div class="col-md-6 col-sm-6 col-xs-12">-->
                <#--<input id="userAddPassword2" type="password" name="userAddaPassword2" data-validate-linked="password" class="form-control col-md-7 col-xs-12" required="required">-->
            <#--</div>-->
        <#--</div>-->
        <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="userAddPhone">电话： <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12">
                <input type="tel" id="userAddPhone" name="userAddPhone" required="required" data-validate-length-range="8,20" class="form-control col-md-7 col-xs-12">
            </div>
        </div>

    </form>


</div>
<div class="modal-footer">
    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
    <button id="saveBtn" type="button" class="btn btn-primary">保&nbsp;存</button>
</div>



<script src="page/user/userAdd.js"></script>