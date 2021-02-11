package com.org.fourfly.exception;

/**
 * @Description：组织操作异常枚举类
 * @author: Jian
 * @Date: 2018/10/10
 */
public enum BusinessExceptionEnum implements ServiceExceptionEnum {

    /**
     * 字典异常
     */
    USER_ORG_MISMATCH(404, "不存在此字典信息；"),

    /**
     * 组件异常
     */
    PLAT_COMPONENT_NOT_EXIST(404, "组件不存在；"),
    PARENT_PLAT_COMPONENT_NOT_EXIST(404, "上级组件不存在；"),

    /**
     * 角色信息异常
     */
    ROLE_NOT_EXIST(404, "角色不存在；"),

    /**
     * 角色权限异常
     */
    PERMISSION_NOT_EXIST(404, "权限信息不存在；"),
    ROLE_PERMISSION_ALREADY_EXIST(400, "角色与权限关联关系已存在；"),
    ROLE_PERMISSION_NOT_EXIST(404, "角色与权限关联关系不存在；"),


    /**
     * 通用业务异常
     */
    REQUEST_PARAMETER_ERROR(400, "请求参数错误；"),
    UNKNOWN_IDENTITY(401, "未知身份：访问此接口需上送当前用户授权、当前用户所在当前组织信息；"),
    PERMISSION_DENIED(403, "权限不足，当前用户没有权限进行此操作；"),
    NOT_FOUND(404, "未找到资源；");

    private Integer code;
    private String message;

    BusinessExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public BusinessExceptionEnum builderMsg(String msg) {
        this.message = this.message + msg;
        return this;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
