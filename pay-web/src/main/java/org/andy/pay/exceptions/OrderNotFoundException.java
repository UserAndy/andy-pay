package org.andy.pay.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * description: 这是自定义异常类
 *
 * @author: andy
 * Created by 2016/11/17 1:08
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such Order")  // 404
public class OrderNotFoundException extends  RuntimeException {
    private String message;


    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
