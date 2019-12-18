package com.toolkit.webtoolkit.controller;

import com.toolkit.webtoolkit.dto.SignParamDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lcs
 * @Description
 * @Date Created in 19:44 2019/12/18
 */
@RestController
@RequestMapping("/sign")
public class SignatureController {

    @RequestMapping("/rsa/p7")
    public String signRSAP7(SignParamDTO signParamDTO){

        return null;
    }
}
