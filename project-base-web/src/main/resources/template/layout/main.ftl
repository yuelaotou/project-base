<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>和宝贝 | </title>

    <!-- Bootstrap -->
    <link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- Bootstrap table -->
    <link href="vendors/bootstrap-table/bootstrap-table.css" rel="stylesheet">
    <!-- Bootstrap datetime picker -->
    <link href="vendors/bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="build/css/custom.css" rel="stylesheet">
${(customCss)?default("")}
</head>

<body class="nav-md">
<div class="container body">
    <div class="main_container">

        <!-- header content -->
    <#include "header.ftl" >
        <!-- /header content -->

        <!-- page content -->
        <div class="right_col" role="main">
        ${contentBody}
        </div>
        <!-- /page content -->

        <!-- footer content -->
    <#include "footer.ftl" >
        <!-- /footer content -->
    </div>
</div>

<!-- jQuery -->
<script src="vendors/jquery/dist/jquery.min-1.11.1.js"></script>
<!-- Bootstrap -->
<script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="vendors/fastclick/lib/fastclick.js"></script>
<!-- NProgress -->
<script src="vendors/nprogress/nprogress.js"></script>
<!-- Bootstrap table -->
<script src="vendors/bootstrap-table/bootstrap-table.js"></script>
<script src="vendors/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<!--Bootstrap datetime picker-->
<script src="vendors/moment/min/moment-with-locales.min.js"></script>
<script src="vendors/bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"></script>


<!-- Custom Theme Scripts -->
<script src="build/js/custom.js"></script>

${(customScript)?default("")}
</body>
</html>
