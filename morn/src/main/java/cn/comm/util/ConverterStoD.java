package cn.comm.util;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConverterStoD implements Converter<String, Date> {

    /**
     * String source
     * @param source
     * @return
     */
    public Date convert(String source) {
        if(StringUtils.isEmpty(source)){
            throw new RuntimeException("请传入数据");
        }
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try{
            df.parse(source);
        }catch (Exception e){
            throw new RuntimeException("数据类型转换异常");
        }
        return null;
    }
}
