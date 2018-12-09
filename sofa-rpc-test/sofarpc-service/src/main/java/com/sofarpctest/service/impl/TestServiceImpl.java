package com.sofarpctest.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.sofarpctest.service.ITestService;
import org.springframework.stereotype.Component;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/12/9_4:02 PM
 */
@Component
@SofaService(interfaceType = ITestService.class, uniqueId = "boltService", bindings = {@SofaServiceBinding(timeout = 6000, bindingType = "bolt")})
public class TestServiceImpl implements ITestService {
    @Override
    public String getData(int i) {
        switch (i) {
            case 0:
                return "server response:0";
            case 1:
                return "server response:1";
            case 2:
                return "server response:2";
            default:
                return "server response:exception";
        }
    }
}
