/**
 * Created by andy on 17-3-1.
 */
$().ready(function() {
    //表单验证
    var e = "<i class='fa fa-times-circle'></i> ";
    $("#signupForm").validate({
        debug:true,   //只验证,不提交
        rules: {
            salt: {
                required: !0,
                minlength: 6
            },
            password: {
                required: !0,
                minlength: 6
            },
            confirm_password: {
                required: !0,
                minlength: 6,
                equalTo: "#password"
            },
        },
        messages: {
            salt: {
                required: e + "请输入您当前登录密码",
                minlength: e + "密码必须6个字符以上"
            },
            password: {
                required: e + "请输入您的密码",
                minlength: e + "密码必须6个字符以上"
            },
            confirm_password: {
                required: e + "请再次输入密码",
                minlength: e + "密码必须5个字符以上",
                equalTo: e + "两次输入的密码不一致"
            },
        },
        submitHandler:function(form){
            resetPassword();
        }
    })
});

/**
 * 重置密码
 */
function resetPassword(){
    var options = {
        dataType:"json",
        success: function (data) {
            if(data.errcode==200){
                clearData();
                $("#errmsg").css("color","green").html("修改成功!");
            }else if(data.errcode==2){
                $("#errmsg").css("color","red").html("新密码与确认密码不一致");
            }else if(data.errcode==3){
                $("#errmsg").css("color","red").html("当前密码不正确");
            }else if(data.errcode==1){
                $("#errmsg").css("color","red").html("请检查参数");
            }
        }
    };
    // ajaxForm
    $("#signupForm").ajaxForm(options);
    //
    $("#salt").val(md5($("#salt").val()));
    $("#password").val(md5($("#password").val()));
    $("#confirm_password").val(md5($("#confirm_password").val()));
    $("#signupForm").ajaxSubmit(options);
}

/**
 * 清除数据
 */
function clearData(){
    $("#salt").val("");
    $("#password").val("");
    $("#confirm_password").val("");
}