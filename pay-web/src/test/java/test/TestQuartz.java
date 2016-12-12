package test;

import org.junit.Test;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

/**
 * description: 这是用来演示Quartz
 *
 * @author: andy
 * Created by 2016/11/14 9:48
 */
public class TestQuartz {

    /**
     * 获取实例
     */
    @Test
    public void testQuartzMethod01(){
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            // and start it off
            scheduler.start();
            //
            scheduler.shutdown();
        }catch(org.quartz.SchedulerException ex){
            ex.getMessage();
        }
    }
}
