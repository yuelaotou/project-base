/**
 * Created by dmin on 2017/7/7.
 */
$(function() {
    alert($("#userAddName").attr("class"));

    var validate= new FormValidator();
    debugger;
    document.forms[0].addEventListener('blur', function(e){
        debugger;
        validator.checkField.call(validate, e.target)
    }, true);
});