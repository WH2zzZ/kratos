package com.oowanghan.kratos.web.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 自定义返回值
 *
 * @Author WangHan
 * @Create 2019/12/6 12:56 下午
 */
@Data
public class KratosResponse<T> {

    protected static final int SUCCESS_STATUS = 200;
    protected static final String SUCCESS_MESSAGE = "success";
    
    @JsonProperty("data")
    private T data;
    @JsonProperty("message")
    private String message;
    @JsonProperty("status")
    private int code;

    public static <T> KratosResponse<T> success() {
        return success(null);
    }

    public static <T> KratosResponse<T> success(T data) {
        return success(data, "success", "");
    }

    public static <T> KratosResponse<T> success(T data, String message, String moreInfo) {
        KratosResponse<T> response = new KratosResponse<>();
        response.setData(data);
        response.setCode(SUCCESS_STATUS);
        response.setMessage(message);
        return response;
    }

    public static <T> KratosResponse<T> error(int code, String message, String moreInfo) {
        KratosResponse<T> response = new KratosResponse<>();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    public static <T> KratosResponse<T> error(int responseStatus, String message) {
        return error(responseStatus, message, (String)null);
    }

    public static <T> KratosResponse<T> error(int responseStatus) {
        return error(responseStatus, (String)null, (String)null);
    }
}
