package com.kaituo.comparison.back.core.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * 任务Handler示例（Bean模式）
 * 开发步骤：
 * 1、继承"IJobHandler"：“com.xxl.job.core.handler.IJobHandler”；
 * 2、注册到Spring容器：添加“@Component”注解，被Spring容器扫描为Bean实例；
 * 3、注册到执行器工厂：添加“@JobHandler(value="自定义jobhandler名称")”注解，注解value值对应的是调度中心新建任务的JobHandler属性的值。
 * 4、执行日志：需要通过 "XxlJobLogger.log" 打印执行日志；
 * @Author: yedong
 * @Date: 2019/5/27 12:16
 * @Modified by:
 */

@JobHandler(value = "myJobHandlerTest")
@Component
public class MyJobHandlerTest extends IJobHandler {

    Logger logger = Logger.getLogger(MyJobHandlerTest.class);
    @Override
    public ReturnT<String> execute(String param) throws Exception {
        //任务参数
        logger.info(param);
        logger.info("===============MyJobHandlerTest  Start ===========================");
        return SUCCESS;
    }
}
