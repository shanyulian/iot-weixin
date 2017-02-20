package weixin;

import com.haro.iot.weixin.util.StringUtil;
import org.junit.Test;

/**
 * Created by shan on 2017/2/19.
 */
public class TimeTest {

    @Test
    public void timeTest(){
        System.out.println(StringUtil.subStrNotEncode("AYSH10200A",1));
        String s = "AYSH10200D";
        String e = s.substring(9,10);
        System.out.println("e:"+e+"+leng = "+e.length());

    }
}
