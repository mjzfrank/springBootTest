package com.wlg.core;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 2018/2/26.
 */
/*测试定时任务*/
@Component
public class ScheduledTasks {
    private Logger logger = Logger.getLogger(ScheduledTasks.class);

    private int fixedDelayCount = 1;
    private int fixedRateCount = 1;
    private int initialDelayCount = 1;
    private int cronCount = 1;

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

//
//    @Scheduled(fixedDelay = 5000)        //fixedDelay = 5000表示当前方法执行完毕5000ms后，Spring scheduling会再次调用该方法
//    public void testFixDelay() {
//        logger.info("===fixedDelay: 第{"+fixedDelayCount+++"}fixedDelay");
//        logger.info("现在时间"+simpleDateFormat.format(new Date()));
//    }
//
//    @Scheduled(fixedRate = 5000)        //fixedRate = 5000表示当前方法开始执行5000ms后，Spring scheduling会再次调用该方法
//    public void testFixedRate() {
//        logger.info("===fixedRate: 第{"+fixedRateCount+++"}次执行fixedRate方法");
//        logger.info("现在时间"+simpleDateFormat.format(new Date()));
//    }
//
//    @Scheduled(initialDelay = 1000, fixedRate = 5000)   //initialDelay = 1000表示延迟1000ms执行第一次任务
//    public void testInitialDelay() {
//        logger.info("===initialDelay: 第{"+initialDelayCount+++"}次执行initialDelay方法");
//        logger.info("现在时间"+simpleDateFormat.format(new Date()));
//    }

/*    秒：可出现", - * /"四个字符，有效范围为0-59的整数

    分：可出现", - * /"四个字符，有效范围为0-59的整数

    时：可出现", - * /"四个字符，有效范围为0-23的整数

    每月第几天：可出现", - * / ? L W C"八个字符，有效范围为0-31的整数

    月：可出现", - * /"四个字符，有效范围为1-12的整数或JAN-DEc

    星期：可出现", - * / ? L C #"四个字符，有效范围为1-7的整数或SUN-SAT两个范围。1表示星期天，2表示星期一， 依次类推*/
/*    * : 表示匹配该域的任意值，比如在秒*, 就表示每秒都会触发事件。；

      ? : 只能用在每月第几天和星期两个域。表示不指定值，当2个子表达式其中之一被指定了值以后，为了避免冲突，需要将另一个子表达式的值设为“?”；

      - : 表示范围，例如在分域使用5-20，表示从5分到20分钟每分钟触发一次

      / : 表示起始时间开始触发，然后每隔固定时间触发一次，例如在分域使用5/20,则意味着5分，25分，45分，分别触发一次.

      , : 表示列出枚举值。例如：在分域使用5,20，则意味着在5和20分时触发一次。

      L : 表示最后，只能出现在星期和每月第几天域，如果在星期域使用1L,意味着在最后的一个星期日触发。

      W : 表示有效工作日(周一到周五),只能出现在每月第几日域，系统将在离指定日期的最近的有效工作日触发事件。注意一点，W的最近寻找不会跨过月份

      LW : 这两个字符可以连用，表示在某个月最后一个工作日，即最后一个星期五。

      # : 用于确定每个月第几个星期几，只能出现在每月第几天域。例如在1#3，表示某月的第三个星期日。*/
//    "0 0 * * * *"                      表示每小时0分0秒执行一次
//
//    " */10 * * * * *"                 表示每10秒执行一次
//
//    "0 0 8-10 * * *"                 表示每天8，9，10点执行
//
//    "0 0/30 8-10 * * *"            表示每天8点到10点，每半小时执行
//
//    "0 0 9-17 * * MON-FRI"     表示每周一至周五，9点到17点的0分0秒执行
//
//    "0 0 0 25 12 ?"                  表示每年圣诞节（12月25日）0时0分0秒执行
//    按顺序依次为
//
//    秒（0~59）
//
//    分钟（0~59）
//
//    小时（0~23）
//
//    天（月）（0~31，但是你需要考虑你月的天数）
//
//    月（0~11）
//
//    天（星期）（1~7 1=SUN 或 SUN，MON，TUE，WED，THU，FRI，SAT）
//
//    年份（1970－2099
//    @Scheduled(cron = "0 21 14 26 2 ?")  //2.26 14.20分执行
//    public void testCron() {
//        logger.info("===initialDelay: 第{"+cronCount+++"}次执行cron方法");
//        logger.info("现在时间"+simpleDateFormat.format(new Date()));
//    }
}
