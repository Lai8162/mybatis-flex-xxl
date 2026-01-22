package org.lxf.mybatisflexxxl.common.response;

import lombok.Data;
import org.lxf.mybatisflexxxl.common.enumcase.ResponseCodeEnum;

/**
 * 统一返回响应
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/5 23:31
 */
@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public Result() {
    }

    public static <T> Result<T> ok() {
        Result<T> result = new Result<>();
        result.setCode(ResponseCodeEnum.OK.getCode());
        result.setMessage(ResponseCodeEnum.OK.getMessage());
        return result;
    }

    public static <T> Result<T> ok(T data) {
        Result<T> result = ok();
        result.setData(data);
        return result;
    }

    public static <T> Result<T> ok(Integer code, T data) {
        Result<T> result = ok();
        result.setCode(code);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> ok(Integer code, String message) {
        Result<T> result = ok();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static <T> Result<T> ok(String message, T data) {
        Result<T> result = ok();
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> ok(Integer code, String message, T data) {
        Result<T> result = ok();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> fail() {
        Result<T> result = new Result<>();
        result.setCode(ResponseCodeEnum.BAD_REQUEST.getCode());
        result.setMessage(ResponseCodeEnum.BAD_REQUEST.getMessage());
        return result;
    }

    public static <T> Result<T> fail(T data) {
        Result<T> result = fail();
        result.setData(data);
        return result;
    }

    public static <T> Result<T> fail(String message) {
        Result<T> result = fail();
        result.setMessage(message);
        return result;
    }

    public static <T> Result<T> fail(Integer code, T data) {
        Result<T> result = fail();
        result.setCode(code);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> fail(Integer code, String message) {
        Result<T> result = fail();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static <T> Result<T> fail(String message, T data) {
        Result<T> result = fail();
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> fail(Integer code, String message, T data) {
        Result<T> result = fail();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> forbidden() {
        Result<T> result = fail();
        result.setCode(ResponseCodeEnum.FORBIDDEN.getCode());
        result.setMessage(ResponseCodeEnum.FORBIDDEN.getMessage());
        return result;
    }

    public static <T> Result<T> forbidden(String message) {
        Result<T> result = forbidden();
        result.setMessage(message);
        return result;
    }
}
