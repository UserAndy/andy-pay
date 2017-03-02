/**
 * Created by andy on 17-2-27.
 */
/**
 * 用户注册
 */
function register(){
    //加密处理
    var options = {
        dataType:"json",
        success: function (data) {
            if(data.errcode==200){
                //清除数据
                clearData();
                //
                showSuccessMsg();
            }else{
                $("#errormsg").html("注册失败:"+data.errcode);
            }
        }
    };
    // ajaxForm
    $("#registerFrom").ajaxForm(options);

    // ajaxSubmit
    $("#btn_register").click(function () {
        //验证表单
        var result = registerForm();
        if(result){
            $("#password").val(md5($("#password").val().trim()));
            $("#confirm_password").val(md5($("#confirm_password").val().trim()));
            $("#registerFrom").ajaxSubmit(options);
        }
    });
}

/**
 * 验证表单
 */
function registerForm(){
    var email  = $("#email").val();
    var password = $("#password").val();
    var confrim_password = $("#confirm_password").val();
    if(email==null||email==""){
        $("#errormsg").html("邮箱不能为空!");
        return false;
    }
    if(password==null||password==""){
        $("#errormsg").html("密码不能为空!");
        return false;
    }
    if(password.length<6){
        $("#errormsg").html("密码长度不应少于6位!");
        return false;
    }
    if(confrim_password==null||confrim_password==""){
        $("#errormsg").html("确认密码不能为空!");
        return false;
    }
    if(confrim_password!=password){
        $("#errormsg").html("密码与确认密码不一致!");
        return false;
    }
    if(!$("#agree").prop("checked")){
        $("#errormsg").html("请同意注册协议");
        return false;
    }
    return true;
}

/**
 * 清除表单数据
 */
function clearData(){
    $("#email").val("");
    $("#password").val("");
    $("#confirm_password").val("");
    //清空数据
    $("#errormsg").html("");

    $("#agree").removeProp("checked").removeAttr("checked");
}

/**
 * 显示成功信息
 */
function showSuccessMsg(){
    $("#errormsg").css("color","green").html("注册成功!");
}

/**
 * 通过ajax 验证邮箱的唯一性
 */
function ajaxValidateEmail(){
    var email = $("#email").val().trim();
    if(email!=null&&email!=""){
            $.ajax({
                url:"user/validateEmail",
                type:"POST",
                dataType:"json",
                data:{"email":email},
                success:function(data){
                    if(data.errcode==200){
                        //验证通过
                        $("#errormsg").html("");     //清除信息
                    }else if(data.errcode==1){
                        $("#errormsg").html("邮箱不能为空!");
                        $("#email").focus();
                    }else if(data.errcode==2) {
                        $("#errormsg").html("非合法邮箱!");
                        $("#email").focus();
                    }else if(data.errcode==3){
                        $("#errormsg").html("邮箱已注册!");
                        $("#email").focus();
                    }
                },
                error:function(data){
                    $("#errormsg").html("网络请求失败...");
                }
            })
    }else{
        $("#errormsg").html("请填写邮箱");
    }
}