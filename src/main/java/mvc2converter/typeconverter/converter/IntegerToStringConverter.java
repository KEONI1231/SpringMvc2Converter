package mvc2converter.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

@Slf4j
public class IntegerToStringConverter implements Converter<Integer, String>{

    //인티저를 스트링으로
    @Override
    public String convert(Integer source) {

        log.info("convert source = {}", source);
        return String.valueOf(source);
    }
}
