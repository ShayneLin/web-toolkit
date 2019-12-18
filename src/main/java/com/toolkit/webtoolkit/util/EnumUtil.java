package com.toolkit.webtoolkit.util;

import com.toolkit.webtoolkit.constant.IBaseEnum;
import org.springframework.util.StringUtils;

import java.util.EnumSet;

/**
 * @Author lcs
 * @Description
 * @Date Created in 19:55 2019/12/18
 */
public class EnumUtil {

    /*根据code获取指定的EnumType的Enum值描述,如果不存在在返回null*/
    public static <T extends Enum<T> & IBaseEnum> T getEnumByCode(Class<T> clazz, Object code) {
        if (code == null || StringUtils.isEmpty(code)){
            return null;
        }
        /*获取指定EnumType的所有枚举值*/
        EnumSet<T> enumSet = EnumSet.allOf(clazz);
        for(T enumObj : enumSet){
            if(enumObj.getCode().equals(code)){
                return enumObj;
            }
        }
        return null;
    }
}
