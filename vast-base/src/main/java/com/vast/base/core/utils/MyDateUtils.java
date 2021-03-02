package com.vast.base.core.utils;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ====================================================
 *
 * @ProjectName: vastinbk
 * @Package: com.vast.base.core.utils
 * @ClassName: MyDateUtils
 * @Author: Administrator
 * @Description:
 * @Date: 2021/3/2 10:06
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public class MyDateUtils {

    static Logger logger = LoggerFactory.getLogger(MyDateUtils.class);
    private static final String FULL_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String DATE_FORMAT = "yyyy-MM-dd";

    public static String convertDate2StrFull(Date dt) {
        return convertDate2StrFull(dt,null);
    }

    public static String convertDate2StrFull(Date dt,String format) {
        try {
            if(StringUtils.isBlank(format)) {
                format = FULL_DATE_TIME_FORMAT;
            }
            if(null != dt) {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                return sdf.format(dt);
            }
        }catch (Exception e) {
            logger.error("转换日期错误");
        }
        return null;
    }

    public static String getFullDateTime() {
        return convertDate2StrFull(new Date());
    }

    public static String getStrDate(Date dt) {
        return convertDate2StrFull(dt,DATE_FORMAT);
    }
}
