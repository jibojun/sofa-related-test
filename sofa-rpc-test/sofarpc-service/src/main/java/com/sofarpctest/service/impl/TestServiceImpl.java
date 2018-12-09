package com.sofarpctest.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.sofarpctest.service.ITestService;
import com.sofarpctest.service.TestRequest;
import com.sofarpctest.service.TestResponse;
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
    public TestResponse getData(TestRequest testRequest) {
        switch (testRequest.getCode()) {
            case 0:
                return new TestResponse("server response:0");
            case 1:
                return new TestResponse("server response:1");
            case 2:
                return new TestResponse("server response:2");
            default:
                return new TestResponse("server response:exception");
        }
    }
}
