package com.toolkit.webtoolkit.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author lcs
 * @Description
 * @Date Created in 19:48 2019/12/18
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebResult {

    /*状态码*/
    private Integer status;

    /*描述消息*/
    private String msg;

    /*实际的响应数据*/
    private Object data;

}
