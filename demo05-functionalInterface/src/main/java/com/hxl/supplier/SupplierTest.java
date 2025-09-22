package com.hxl.supplier;

import org.junit.Test;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

    // 供给型接口
    Supplier<Integer> supplier = () -> new Random().nextInt(10) + 1;

    @Test
    public void test() {
        // 需求是 获取一个 1 ~ 10 的随机数
        Integer random = supplier.get();
        System.out.println(random);
    }
}
