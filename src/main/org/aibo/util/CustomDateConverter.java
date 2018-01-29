//package org.aibo.util;
//
//import org.springframework.core.convert.converter.Converter;
//
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///**
// * Created by Squirrel-Chen on 2018/1/29.
// */
//
//public class CustomDateConverter implements Converter<String, Date> {
//
//    public Date convert(String source) {
//        //将实际的字符串转为date类型
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        try {
//            //转换成功直接返回
//            return sdf.parse(source);
//        } catch (ParseException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        //转换失败返回null
//        return null;
//    }
//}
