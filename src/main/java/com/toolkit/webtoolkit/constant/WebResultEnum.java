package com.toolkit.webtoolkit.constant;

/**
 * @Author lcs
 * @Description
 * @Date Created in 19:52 2019/12/18
 */
public enum WebResultEnum implements IBaseEnum {
    SUCCESS(0,"成功"),
    ERROR(-1,"失败");

    private Integer code;
    private String description;

    WebResultEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
