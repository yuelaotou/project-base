<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span>
    </button>
    <h4 class="modal-title" id="myModalLabel">新增用户</h4>
</div>
<div class="modal-body">
    <#--<form id="userAddForm" class="form-horizontal form-label-left" novalidate="">-->
        <#--<span class="section">用户信息</span>-->

        <#--<div class="item form-group bad">-->
            <#--<label class="control-label col-md-3 col-sm-3 col-xs-12" for="userAddName">用户姓名： <span class="required">*</span>-->
            <#--</label>-->
            <#--<div class="col-md-6 col-sm-6 col-xs-12">-->
                <#--<input id="userAddName" class="form-control col-md-7 col-xs-12" data-validate-length-range="2,5" data-validate-words="2" name="userAddName" placeholder="both name(s) e.g Jon Doe" required="required" type="text">-->
            <#--</div>-->
            <#--<div class="alert">必填</div>-->
        <#--</div>-->

        <#--<div class="item form-group bad">-->
            <#--<label class="control-label col-md-3 col-sm-3 col-xs-12" for="userAddAge">年龄：<span class="required">*</span>-->
            <#--</label>-->
            <#--<div class="col-md-6 col-sm-6 col-xs-12">-->
                <#--<input type="number" id="userAddAge" name="userAddAge" required="required" data-validate-minmax="1,150" class="form-control col-md-7 col-xs-12">-->
            <#--</div>-->
            <#--<div class="alert">必填</div>-->
        <#--</div>-->


        <#--<div class="item form-group bad">-->
            <#--<label for="userAddPassword" class="control-label col-md-3">密码：</label>-->
            <#--<div class="col-md-6 col-sm-6 col-xs-12">-->
                <#--<input id="userAddPassword" type="password" name="userAddPassword" data-validate-length="6,8" class="form-control col-md-7 col-xs-12" required="required">-->
            <#--</div>-->
            <#--<div class="alert">必填</div></div>-->
        <#--<div class="item form-group">-->
            <#--<label for="userAdd.password2" class="control-label col-md-3 col-sm-3 col-xs-12">确认密码：</label>-->
            <#--<div class="col-md-6 col-sm-6 col-xs-12">-->
                <#--<input id="userAddPassword2" type="password" name="userAddaPassword2" data-validate-linked="password" class="form-control col-md-7 col-xs-12" required="required">-->
            <#--</div>-->
        <#--</div>-->
        <#--<div class="item form-group">-->
            <#--<label class="control-label col-md-3 col-sm-3 col-xs-12" for="userAddPhone">电话： <span class="required">*</span>-->
            <#--</label>-->
            <#--<div class="col-md-6 col-sm-6 col-xs-12">-->
                <#--<input type="tel" id="userAddPhone" name="userAddPhone" required="required" data-validate-length-range="8,20" class="form-control col-md-7 col-xs-12">-->
            <#--</div>-->
        <#--</div>-->

        <#--<div class="item form-group">-->
            <#--<label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Name <span class="required">*</span>-->
            <#--</label>-->
            <#--<div class="col-md-6 col-sm-6 col-xs-12">-->
                <#--<input id="name" class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" name="name" placeholder="both name(s) e.g Jon Doe" required="required" type="text">-->
            <#--</div>-->
        <#--</div>-->

    <#--</form>-->


        <form class="form-horizontal form-label-left" novalidate>

            <p>For alternative validation library <code>parsleyJS</code> check out in the <a href="form.html">form page</a>
            </p>
            <span class="section">Personal Info</span>

            <div class="item form-group">
                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Name <span class="required">*</span>
                </label>
                <div class="col-md-6 col-sm-6 col-xs-12">
                    <input id="name" class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" name="name" placeholder="both name(s) e.g Jon Doe" required="required" type="text">
                </div>
            </div>
            <div class="item form-group">
                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="email">Email <span class="required">*</span>
                </label>
                <div class="col-md-6 col-sm-6 col-xs-12">
                    <input type="email" id="email" name="email" required="required" class="form-control col-md-7 col-xs-12">
                </div>
            </div>
            <div class="item form-group">
                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="email">Confirm Email <span class="required">*</span>
                </label>
                <div class="col-md-6 col-sm-6 col-xs-12">
                    <input type="email" id="email2" name="confirm_email" data-validate-linked="email" required="required" class="form-control col-md-7 col-xs-12">
                </div>
            </div>
            <div class="item form-group">
                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="number">Number <span class="required">*</span>
                </label>
                <div class="col-md-6 col-sm-6 col-xs-12">
                    <input type="number" id="number" name="number" required="required" data-validate-minmax="10,100" class="form-control col-md-7 col-xs-12">
                </div>
            </div>
            <div class="item form-group">
                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="website">Website URL <span class="required">*</span>
                </label>
                <div class="col-md-6 col-sm-6 col-xs-12">
                    <input type="url" id="website" name="website" required="required" placeholder="www.website.com" class="form-control col-md-7 col-xs-12">
                </div>
            </div>
            <div class="item form-group">
                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="occupation">Occupation <span class="required">*</span>
                </label>
                <div class="col-md-6 col-sm-6 col-xs-12">
                    <input id="occupation" type="text" name="occupation" data-validate-length-range="5,20" class="optional form-control col-md-7 col-xs-12">
                </div>
            </div>
            <div class="item form-group">
                <label for="password" class="control-label col-md-3">Password</label>
                <div class="col-md-6 col-sm-6 col-xs-12">
                    <input id="password" type="password" name="password" data-validate-length="6,8" class="form-control col-md-7 col-xs-12" required="required">
                </div>
            </div>
            <div class="item form-group">
                <label for="password2" class="control-label col-md-3 col-sm-3 col-xs-12">Repeat Password</label>
                <div class="col-md-6 col-sm-6 col-xs-12">
                    <input id="password2" type="password" name="password2" data-validate-linked="password" class="form-control col-md-7 col-xs-12" required="required">
                </div>
            </div>
            <div class="item form-group">
                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="telephone">Telephone <span class="required">*</span>
                </label>
                <div class="col-md-6 col-sm-6 col-xs-12">
                    <input type="tel" id="telephone" name="phone" required="required" data-validate-length-range="8,20" class="form-control col-md-7 col-xs-12">
                </div>
            </div>
            <div class="item form-group">
                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">Textarea <span class="required">*</span>
                </label>
                <div class="col-md-6 col-sm-6 col-xs-12">
                    <textarea id="textarea" required="required" name="textarea" class="form-control col-md-7 col-xs-12"></textarea>
                </div>
            </div>
            <div class="ln_solid"></div>
            <div class="form-group">
                <div class="col-md-6 col-md-offset-3">
                    <button type="submit" class="btn btn-primary">Cancel</button>
                    <button id="send" type="submit" class="btn btn-success">Submit</button>
                </div>
            </div>
        </form>


</div>
<div class="modal-footer">
    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
    <button type="button" class="btn btn-primary">保&nbsp;存</button>
</div>



<script src="page/user/userAdd.js"></script>