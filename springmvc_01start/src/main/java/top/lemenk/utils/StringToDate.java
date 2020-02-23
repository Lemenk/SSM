package top.lemenk.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.utils
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/14 14:27
 * @Description: 类型转换：字符串转换成日期
 */
public class StringToDate implements Converter<String,Date> {

    /**
     * String source:表示传进的参数
     * @param source
     * @return
     */
    public Date convert(String source) {

        if(source == null){
            throw new RuntimeException("参数不能为空");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}
