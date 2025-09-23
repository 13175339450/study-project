package com.hxl.Reflect;

import com.hxl.Optional.User;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class ReflectTest {

    @Test
    public void test01() {
        User hxl = User.builder().name("hxl").age(18).build();

        // 获取所有属性
        Field[] fields = hxl.getClass().getDeclaredFields();

        for (Field field : fields) {
            // 打破访问修饰符的限制
            field.setAccessible(true);
            try {
                // 从 hxl对象中 获取对应的field字段的 属性值
                Object o = field.get(hxl);
                System.out.println("o = " + o);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
