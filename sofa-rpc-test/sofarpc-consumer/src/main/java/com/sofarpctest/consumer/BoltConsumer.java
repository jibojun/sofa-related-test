package com.sofarpctest.consumer;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.sofarpctest.service.ITestService;
import com.sofarpctest.service.TestRequest;
import org.springframework.stereotype.Component;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/12/9_4:53 PM
 */
@Component("boltConsumer")
public class BoltConsumer {

    @SofaReference(interfaceType = ITestService.class, uniqueId = "boltService", binding = @SofaReferenceBinding(bindingType = "bolt", directUrl = "bolt://127.0.0.1:8099", retries = 3, timeout = 6000))
    private ITestService testService;

    public void clientOps(int i) {
        System.out.println(testService.getData(new TestRequest(i)));
    }

}
