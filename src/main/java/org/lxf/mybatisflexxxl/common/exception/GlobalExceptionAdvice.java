package org.lxf.mybatisflexxxl.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.lxf.mybatisflexxxl.common.response.Result;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 全局异常捕捉
 *
 * @author lxf
 * @version 1.0
 * @since 2025/4/6 16:31
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result<?> exceptionHandler(Exception ex) {
        if (ex instanceof BusinessException e) {
            log.error(e.getMessage(), e);
            return Result.fail(e.getCode(), e.getMessage());
        }
        if (ex instanceof MethodArgumentNotValidException e) {
            BindingResult exceptions = e.getBindingResult();
            // 判断异常中是否有错误信息，如果存在就使用异常中的消息，否则使用默认消息
            if (exceptions.hasErrors()) {
                List<ObjectError> errors = exceptions.getAllErrors();
                if (!errors.isEmpty()) {
                    FieldError fieldError = (FieldError) errors.get(0);
                    log.error(fieldError.getDefaultMessage(), e);
                    return Result.fail(fieldError.getDefaultMessage(), null);
                }
            }
            log.error(e.getMessage(), e);
            return Result.fail(e.getMessage(), null);
        }
        log.error(ex.getMessage(), ex);
        return Result.fail(ex.getMessage());
    }
}
