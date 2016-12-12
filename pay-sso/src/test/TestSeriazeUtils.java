import org.andy.pay.sso.utils.SerializeUtil;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试序列化
 * Created by andy on 16-12-2.
 */
public class TestSeriazeUtils {

    /**
     * 测试序列化与反序列化
     */
    @org.junit.Test
    public void testSeriazeUtils(){
        String content="\\xac\\xed\\x00\\x05sr\\x00\\x0ejava.lang.Long;\\x8b\\xe4\\x90\\xcc\\x8f#\\xdf\\x02\\x00\\x01J\\x00\\x05valuexr\\x00\\x10java.lang.Number\\x86\\xac\\x95\\x1d\\x0b\\x94\\xe0\\x8b\\x02\\x00\\x00xp\\x00\\x00\\x01X\\xbe\\xd1)\\xaa";
        Object obj = SerializeUtil.unserialize(content.getBytes());
        System.out.println();
    }

    /**
     * 转换为时间轴
     */
    @Test
   public void testDate()throws Exception{

        SimpleDateFormat format =  new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
        Long time=new Long(1);

        String d = format.format(time);

        Date date=format.parse(d);

        System.out.println("Format To String(Date):"+d);

        System.out.println("Format To Date:"+date);

   }



}
