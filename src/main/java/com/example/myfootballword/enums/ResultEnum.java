package com.example.myfootballword.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 返回的code统一管理
 */
@Getter
@AllArgsConstructor
public enum ResultEnum {
    // 成功
    SUCCESS(0, "成功"),
    // token异常  3开头
    TOKEN_PAST(301, "token过期"),
    TOKEN_ERROR(302, "token异常"),
    // 登录异常
    LOGIN_ERROR(303, "登录异常"),
    LOGIN_LOCK(304, "用户被禁用"),

    LOGIN_NAME(305, "用户名错误"),
    LOGIN_NAME_NULL(306, "用户名为空"),
    LOGIN_PASSWORD(307, "密码错误"),
    LOGIN_CODE(308, "验证码错误"),
    LOGOUT_CODE(309, "退出失败，token 为空"),
    LOGIN_TENTANT(400, "租户不存在或者租户停用中"),


    // crud异常，4开头
    CRUD_SAVE_FAIL(403, "添加失败"),
    CRUD_UPDATE_FAIL(404, "更新失败"),
    CRUD_DELETE_FAIL(405, "删除失败"),
    CRUD_DELETE_NOT(406, "不允许删除"),
    CRUD_VALID_NOT(407, "字段校验异常"),
    CRUD_NOT_OPERATE(408, "无操作权限"),
    CRUD_LOCK_OPERATE(409, "没有获取到锁"),

    // 默认错误
    ERROR(999, "错误"),


    // 1000-2000 为sentinel异常 ///////////////////////////////

    SENTINEL_DEGRADE_ERROR(1000, "被降级规则阻挡"),
    SENTINEL_PARAM_ERROR(1001, "被热点参数规则阻挡"),
    SENTINEL_SYSTEM_ERROR(1002, "被系统规则阻挡"),
    SENTINEL_AUTHORITY_ERROR(1003, "被授权规则阻挡"),
    SENTINEL_ERROR(1999, "Unknown"),


    ////////////////2000-3000 为参数校验异常 ///////////////////////////

    //地址类异常
    PARAM_ADDR(2000, "参数邮件抄送地址为空,无法发送邮件!"),
    PARAM_ADDR_ATTACH(2001, "参数附件地址为空,无法发送邮件!"),
    PARAM_ADDR_ASC(2002, "参数邮件静态资源路径和文件名为空,无法发送邮件!"),

    PARAM_REGISTER(2003, "邮箱或者手机号或者登陆名已被注册!"),


    ////////////////////// 3000-4000系统级别错误 ///////////////////////////

    SYSTEM_REQUEST_METHOD_NOT_SUPPORTED(3000, "请求方法不支持访问方式");

    /**
     * 业务异常定义6位整数：模块（2位）+ 模块中的功能(2位) + 功能中的接口（2位）
     * 错误码范围：100000-999999
     * 1、模块（2位）：第1位大模块名，如好物，第2位小模块名，如商品
     *    health-admin -- 后台管理[10]
     *    health-advice -- 服务[20]
     *    health-community -- 圈圈[30]
     *    health-news -- 发现[40]
     *    health-shopping -- 好物
     *    health-goods -- 商品管理[51]
     *    health-order -- 订单管理[52]
     *    health-me -- 我的模块[60]
     * 2、模块中的小功能(2位)：自定义
     * 3、功能中的接口（2位）：自定义
     * 异常抛出示例：后面都需要带上错误码，可根据上面约定定义
     * 1、不指定错误码：throw new BaseException("异常信息")  错误码会默认999999
     * 2、指定错误码：throw new BaseException(600100, "异常信息")
     */


    private Integer code;

    private String desc;
}
