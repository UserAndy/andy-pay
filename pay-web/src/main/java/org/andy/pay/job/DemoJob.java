package org.andy.pay.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * description: 这是用来演示job的定时任务
 * 待办:  在
 * @author: andy
 * Created by 2016/11/11 14:56
 */
@Component
public class DemoJob {


    /**
     * 该方法会执行两次，待修改
     */
    @Scheduled(cron="0/5 * *  * * ? ")   //每5秒执行一次
    protected void execute() {
        System.out.println("执行定时任务");
    }

}
