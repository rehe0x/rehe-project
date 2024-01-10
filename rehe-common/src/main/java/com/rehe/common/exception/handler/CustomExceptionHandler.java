package com.rehe.common.exception.handler;

import com.rehe.common.exception.BusinessException;
import com.rehe.common.result.HttpError;
import com.rehe.common.result.Result;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

/**
 * @author xiech
 * @description
 * @date 2024/1/10
 */
@RestControllerAdvice
public class CustomExceptionHandler {
//
//    @ExceptionHandler(Throwable.class)
//    public ResponseEntity handleException(Throwable e){
//        // 打印堆栈信息
//        HttpError httpError = new HttpError(BAD_REQUEST.value(),e.getMessage());
//        return buildResponseEntity(apiError);
//    }

    @ExceptionHandler(BusinessException.class)
    public Result<String> businessException(BusinessException e){
        return Result.fail(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(BadCredentialsException.class)
    public Result<String> badCredentialsException(BadCredentialsException e){
        return Result.fail("用户名或密码不正确");
    }
//
//    /**
//     * 统一返回
//     */
//    private ResponseEntity<HttpError> responseEntity(Object httpError) {
//        return new ResponseEntity<>(httpError, HttpStatus.valueOf(httpError.getError()));
//    }
}
