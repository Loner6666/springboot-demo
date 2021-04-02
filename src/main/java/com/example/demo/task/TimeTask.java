package com.example.demo.task;

import com.example.demo.utils.TimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description：定时任务
 * @Author：GuoFeng
 * @CreateTime：2021-04-01
 */
@Slf4j
@Component
public class TimeTask {

    /**
     * 每隔十秒输出一下当前时间
     */
    @Scheduled(cron = "*/10 * * * * ?")
    public void execute() {
        long timeMillis = System.currentTimeMillis();
        String now = TimeUtil.dateFormat(timeMillis);
        log.info("====>定时任务：" + now);
    }

}
