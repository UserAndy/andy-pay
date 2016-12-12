package log;


import org.apache.log4j.Logger;

/**
 * Created by andy on 2016/11/9.
 */
public class TestLog4J {

    /**
     * main对
     * @param args
     */
    public static void main(String[] args){
        //<editor-fold desc="This is create code">
        Logger log = Logger.getLogger(TestLog4J.class);
        log.debug("debug start");
        log.debug("debug end!");
        System.out.println("debug finish!");
        //</editor-fold>
        // TODO: 2016/11/10
    }
}
