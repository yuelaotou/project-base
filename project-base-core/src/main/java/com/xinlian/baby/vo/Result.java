package com.xinlian.baby.vo;


/**
 * Created by Administrator on 2017/7/7/007.
 */
public class Result<T> {
    /**
     * 是否成功
     */
    private Boolean success;

    /**
     * 返回结果
     */
    private T data;

    /**
     * 提示信息
     */
    private String message;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
