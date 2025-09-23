package com.hxl.EnvironmentVariables;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentVariablesTest {

    @Value("${hxl:true}")
    private String env;

    @Test
    public void test01() {
        System.out.println(env);
    }
}
