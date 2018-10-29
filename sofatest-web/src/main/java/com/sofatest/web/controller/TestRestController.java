package com.sofatest.web.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.sofatest.app.SampleJvmService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-10-29 15:39
 * @Description:
 */
@RestController
@RequestMapping("/sofatest")
public class TestRestController {
    @SofaReference
    private SampleJvmService sampleJvmService;

    @RequestMapping("test1")
    public void test() {
        System.out.println(sampleJvmService.getMessage());
    }
}
