package com.org.fourfly.exception;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandle {
	class ExceptionResponse {
		// 响应业务状态
		private Integer status;
		// 响应消息
		private String message;

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@ExceptionHandler(InvalidArgumentException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ExceptionResponse handleInvalidArgumentException(InvalidArgumentException ex) {
		ExceptionResponse response = new ExceptionResponse();
		response.setStatus(400);
		response.setMessage(ex.getMessage());
		return response;
	}

	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ResponseBody
	public ExceptionResponse handleNotFoundException(NotFoundException ex) {
		ExceptionResponse response = new ExceptionResponse();
		response.setStatus(404);
		response.setMessage(ex.getMessage());
		return response;
	}

    /**
     * 拦截业务异常
     *
     * @param e        异常信息
     * @param response Http响应
     * @return 全局异常响应
     */
    @ExceptionHandler(ApiRequestException.class)
    @ResponseBody
    public ExceptionResponse handleApiRequestException(ApiRequestException e, HttpServletResponse response) {
        response.setStatus(e.getCode());
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setStatus(e.getCode());
        exceptionResponse.setMessage(e.getMessage());
        return exceptionResponse;
    }

}
