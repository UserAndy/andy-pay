/**
 * Created by andy on 17-2-27.
 */
/**
 * 用户登录
 */
function login(){
    var options = {
        dataType:"json",
        success: function (data) {
            if(data.errcode==200){
               var path = $("#indexPath").val();
                window.location.href=path;
            }else{
                if(data.errcode==1){
                    $("#errormsg").html("帐号不存在!");
                }else if(data.errcode==2){
                    $("#errormsg").html("密码不正确!");
                }else if(data.errcode==3){
                    $("#errormsg").html("帐号被锁定!");
                }else if(data.errcode==4){
                    $("#errormsg").html("未知错误,请联系管理员!");
                }else{
                    $("#errormsg").html("未知错误!");
                }
            }
        }
    };
    // ajaxForm
    $("#loginForm").ajaxForm(options);

    // ajaxSubmit
    $("#btnAjaxSubmit").click(function () {
        var result = validateParams();
        if(result){
            $("#password").val(md5($("#password").val().trim()));
            $("#loginForm").ajaxSubmit(options);
        }
    });
}

/**
 * 验证参数
 */
function validateParams(){
    var email = $("#email").val().trim();
    if(email==null||email==""){
        $("#errormsg").html("请输入邮箱!");
        return false;
    }
    if(!validateEmail(email)){
        $("#errormsg").html("邮箱格式不正确!");
        return false;
    }
    return true;
}

/**
 * 验证邮箱是否可用
 * @param email  待验证的邮箱
 * @returns {boolean}  true 表示验证成功(可用)    false表示验证失败(不可用)
 */
function validateEmail(email){
    var match = "^([a-z0-9A-Z]+[-|\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\.)+[a-zA-Z]{2,}$";
    var patch=new RegExp(match);
    return patch.test(email);
}