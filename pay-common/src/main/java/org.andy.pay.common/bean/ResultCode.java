package org.andy.pay.common.bean;

/**
 * descritpion: 结果返回信息
 * author: andy
 * Created by andy on 2016/11/9.
 */
public class ResultCode {

    private int errcode;        //状态码

    private String errormsg;       //返回消息码

    private boolean success;       //true表示成功　　false　表示失败

    private Object data;        //

    public ResultCode() {
    }

    public ResultCode(int errcode, String errormsg, boolean success, Object data) {
        this.errcode = errcode;
        this.errormsg = errormsg;
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
