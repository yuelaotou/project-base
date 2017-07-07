<#assign contentBody>
<div class="">
<#--<div class="page-title">-->
<#--<div class="title_left">-->
<#--<h3>User Page</h3>-->
<#--</div>-->
<#--</div>-->

    <div class="clearfix"></div>

    <div class="row" class="searchBar">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel">
                <div class="x_title">
                    <h2>家长管理 <small>-副标题</small></h2>

                    <ul class="nav navbar-right panel_toolbox">
                        <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="#">Settings 1</a>
                                </li>
                                <li><a href="#">Settings 2</a>
                                </li>
                            </ul>
                        </li>
                        <li><a class="close-link"><i class="fa fa-close"></i></a>
                        </li>
                    </ul>
                    <div class="clearfix"></div>
                </div>

                <div class="x_content">
                    <fieldset>
                        <legend>查询条件</legend>
                        <form id="search-form" data-parsley-validate="" class="form-horizontal form-label-left" novalidate="">
                            <div class="row">
                                <div class="item form-group col-md-3">
                                    <label class="control-label col-md-4 col-sm-4 col-xs-12" for="id">用户ID： </label>
                                    <div class="col-md-8 col-sm-8 col-xs-12">
                                        <input type="text" id="id" name="id" class="form-control col-md-7 col-xs-12" required="required">
                                    </div>
                                </div>
                                <div class="item form-group col-md-3">
                                    <label class="control-label col-md-4 col-sm-4 col-xs-12" for="name">姓名： </label>
                                    <div class="col-md-8 col-sm-8 col-xs-12">
                                        <input type="text" id="name" name="name" class="form-control col-md-7 col-xs-12">
                                    </div>
                                </div>
                                <div class="item form-group col-md-3">
                                    <label for="age" class="control-label col-md-4 col-sm-4 col-xs-12">年龄：</label>
                                    <div class="col-md-8 col-sm-8 col-xs-12">
                                        <input id="age" name="age" class="form-control col-md-7 col-xs-12" type="text">
                                    </div>
                                </div>

                                <div class="item form-group col-md-3">
                                    <label class="control-label col-md-4 col-sm-4 col-xs-12" for="name">电话： </label>
                                    <div class="col-md-8 col-sm-8 col-xs-12">
                                        <input type="text" id="phone" name="phone" class="form-control col-md-7 col-xs-12">
                                    </div>
                                </div>

                            </div>

                            <div class="row">
                            <#--<div class="form-group col-md-3">-->
                            <#--<label class="control-label col-md-3 col-sm-3 col-xs-12">性别</label>-->
                            <#--<div class="col-md-9 col-sm-9 col-xs-12">-->
                            <#--<div id="gender" class="btn-group" data-toggle="buttons">-->
                            <#--<label class="btn btn-default" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">-->
                            <#--<input type="radio" name="gender" value="male" data-parsley-multiple="gender"> &nbsp; Male &nbsp;-->
                            <#--</label>-->
                            <#--<label class="btn btn-primary" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">-->
                            <#--<input type="radio" name="gender" value="female" data-parsley-multiple="gender"> Female-->
                            <#--</label>-->
                            <#--</div>-->
                            <#--</div>-->
                            <#--</div>-->
                                <div class="item form-group col-md-3">
                                    <label class="control-label col-md-4 col-sm-4 col-xs-12">出生日期： </label>
                                    <div class="col-md-8 col-sm-8 col-xs-12">
                                        <input type="text" id="createTimeStart" style="padding-left:50px;" name="createTimeStart" class="form-control col-md-7 col-xs-12">
                                        <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>
                                    </div>
                                </div>

                                <div class="item form-group col-md-3">
                                    <label class="control-label col-md-4 col-sm-4 col-xs-12">至 </label>
                                    <div class="col-md-8 col-sm-8 col-xs-12">
                                        <input type="text" id="createTimeEnd" name="createTimeEnd" style="padding-left:50px;" class="form-control col-md-7 col-xs-12">
                                        <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>
                                    </div>
                                </div>


                                <div class="form-group col-md-6">
                                    <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                        <button class="btn btn-primary" type="button" onclick="onSearchBtnClick()">查&nbsp;询</button>
                                        <button type="button" class="btn btn-success" data-toggle="modal" href="/user/toUserAddPage" data-target="#addUserModal">新&nbsp;增</button>
                                    </div>
                                </div>
                            </div>
                            <div class="ln_solid"></div>
                        </form>
                    </fieldset>



                    <div class="row">
                        <table id="table"></table>
                    </div>
                    <#--<div class="row">-->
                        <#--<form class="form-horizontal form-label-left" novalidate>-->

                            <#--<div class="item form-group">-->
                                <#--<label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Name <span class="required">*</span>-->
                                <#--</label>-->
                                <#--<div class="col-md-6 col-sm-6 col-xs-12">-->
                                    <#--<input id="name" class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" name="name" placeholder="both name(s) e.g Jon Doe" required="required" type="text">-->
                                <#--</div>-->
                            <#--</div>-->

                        <#--</form>-->

                    <#--</div>-->


                </div>



                    <!-- modals -->
                    <!-- Large modal -->
                    <div id="addUserModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
                        <div class="modal-dialog modal-lg">
                            <div class="modal-content">
                            </div>
                        </div>
                    </div>
                    <!-- /modals -->
            </div>
        </div>

            </div>
        </div>
    </div>

<#--<div class="row">-->
<#--<div class="col-md-12 col-sm-12 col-xs-12">-->
<#--<div class="x_panel">-->
<#--<div class="x_title">-->
<#--<h2>Plain Page</h2>-->
<#--<ul class="nav navbar-right panel_toolbox">-->
<#--<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>-->
<#--</li>-->
<#--<li class="dropdown">-->
<#--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>-->
<#--<ul class="dropdown-menu" role="menu">-->
<#--<li><a href="#">Settings 1</a>-->
<#--</li>-->
<#--<li><a href="#">Settings 2</a>-->
<#--</li>-->
<#--</ul>-->
<#--</li>-->
<#--<li><a class="close-link"><i class="fa fa-close"></i></a>-->
<#--</li>-->
<#--</ul>-->
<#--<div class="clearfix"></div>-->
<#--</div>-->
<#--<div class="x_content">-->
<#--<table id="table"></table>-->
<#--</div>-->
<#--</div>-->
<#--</div>-->
<#--</div>-->


</div>
</#assign>
<#assign customScript>
<script src="page/user/user.js"></script>
<#--<script src="../Js/jquery-1.11.3.min.js"></script>-->
<#--<link href="../Js/bootstrap-3.3.5-dist/css/bootstrap.css" rel="stylesheet" />-->
<#--<script src="../Js/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>-->
<!-- validator -->
<script src="vendors/validator/validator.js"></script>
</#assign>
<#include "../layout/main.ftl" />