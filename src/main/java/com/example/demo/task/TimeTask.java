package com.example.demo.task;

import com.example.demo.utils.TimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description：定时任务，异步处理
 * @Author：GuoFeng
 * @CreateTime：2021-04-01
 */
@Slf4j
@EnableAsync
@Component
public class TimeTask {

    /**
     * 每隔5秒输出一下当前时间
     */
    @Async
    @Scheduled(cron = "*/5 * * * * ?")
    public void task1() {
        long timeMillis = System.currentTimeMillis();
        String now = TimeUtil.dateFormat(timeMillis);
        log.info("====>定时任务1：" + Thread.currentThread().getName() + now);
    }

    /**
     * 每隔10秒输出一下当前时间
     */
    @Async
    @Scheduled(cron = "*/10 * * * * ?")
    public void task2() {
        long timeMillis = System.currentTimeMillis();
        String now = TimeUtil.dateFormat(timeMillis);
        log.info("====>定时任务2：" + Thread.currentThread().getName() + now);
    }

    /**
     * import org.springframework.scheduling.annotation.EnableAsync;
     * @EnableAsync用在类上，开启异步注解的支持
     *
     * import org.springframework.scheduling.annotation.Async;
     * @Async标注的方法，称之为异步方法；这些方法在执行的时候，将会在独立的线程中被执行，调用者无需等待它的完成，即可继续其他的操作。
     * @Configuration配置类中声明的方法不支持@Async
     * @Async在目标方法签名方面，支持任何参数类型。但是，返回值类型只能是void或Future
     * @Async若把注解放在类上或者接口上，那么他所有的方法都会异步执行了~~~~（包括私有方法）
     *
     * @Async加不加的区别：
     * 加：两个定时任务是两个线程，互不干扰
     * 不加：同一个线程处理这两个定时任务，有先后顺序
     *
     */

}
