package com.sofatest.app.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.sofatest.app.SampleJvmService;

/**
 * @Author: Bojun Ji
 * @Date: Created in 2018-10-29 15:24
 * @Description: default is JVM, can change to bolt, dubbo etc
 */
@SofaService(bindings = {@SofaServiceBinding(bindingType = "jvm")})
public class SampleJvmServiceImpl implements SampleJvmService {
    @Override
    public String getMessage() {
        return "JvmServiceTest";
    }
}
