package mvc2converter.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

@Slf4j
public class StringToIntegerConverter implements Converter<String, Integer> {

    //스트링을 인티져로
    @Override
    public Integer convert(String source) {
        log.info("convert source = {}", source);
        return Integer.valueOf(source);
    }
}
