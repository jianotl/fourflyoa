package com.org.fourfly.exception;

/**
 * @Description：异常枚举抽象接口
 * @author: Jian
 * @Date: 2018/10/10
 */
public interface ServiceExceptionEnum {

    /**
     * 获取异常编码
     */
    Integer getCode();

    /**
     * 获取异常信息
     */
    String getMessage();

}
