package com.toolkit.webtoolkit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;

/**
 * @Author lcs
 * @Description
 * @Date Created in 19:45 2019/12/18
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignParamDTO {
    private String privateKeyName;
    private String keystorePassword;
    private String privateKeyPassword;
    private String plainText;
    private File pfxFile;
}
