package com.toolkit.webtoolkit.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.toolkit.webtoolkit.constant.WebResultEnum;
import com.toolkit.webtoolkit.dto.resp.WebResult;

/**
 * @Author lsc
 * @Description
 * @Date Created in 19:50 2019/12/18
 */
public class WebResultUtil {
    private static final Gson gson = new GsonBuilder().create();

    public static String success(){
        WebResult webResult = WebResult.builder()
                .status(WebResultEnum.SUCCESS.getCode())
                .msg(WebResultEnum.SUCCESS.getDescription())
                .build();
        return gson.toJson(webResult);
    }

    public static String error(){
        WebResult webResult = WebResult.builder()
                .status(WebResultEnum.ERROR.getCode())
                .msg(WebResultEnum.ERROR.getDescription())
                .build();
        return gson.toJson(webResult);
    }
}
