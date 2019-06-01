package annotation.functional;

import java.util.Calendar;
import java.util.Date;

/**
 * @author liuhuihai
 * @date 2019-05-09 21:33
 * @description 时间测试
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Calendar cal = Calendar.getInstance();
        date = cal.getTime();


//        LocalDate.of("");
        System.out.println(cal);
    }

}
