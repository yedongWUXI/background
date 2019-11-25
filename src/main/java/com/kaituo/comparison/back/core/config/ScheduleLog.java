package com.kaituo.comparison.back.core.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @Description: 测试logback
 * @Author: yedong
 * @Date: 2019/11/24 22:11
 * @Modified by:
 */

@Component
@Configuration
@EnableScheduling
@Slf4j
public class ScheduleLog {
    //    @Scheduled(cron = "0/5 * * * * ?")
    //或直接指定时间间隔 单位:milliSecond
    @Scheduled(fixedRate = 50)
    private void configureTasks() {

        log.info("执行静态定时任务时间: " + LocalDateTime.now());
//        throw new NullPointerException();
    }
}
