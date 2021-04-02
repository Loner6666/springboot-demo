package com.example.demo;

import com.example.demo.enums.CodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 单元测试
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemoApplication.class)
class SpringbootDemoApplicationTests {

    /**
     * 单元测试：打印枚举
     */
    @Test
    public void outEnum() {
        CodeEnum success = CodeEnum.SUCCESS;
        System.out.println("=====>" + success.toString());
    }

}
