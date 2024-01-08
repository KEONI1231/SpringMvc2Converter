package mvc2converter.typeconverter;

import mvc2converter.typeconverter.converter.IntegerToStringConverter;
import mvc2converter.typeconverter.converter.IpPortToStringConverter;
import mvc2converter.typeconverter.converter.StringToIntegerConverter;
import mvc2converter.typeconverter.converter.StringToIpPortConverter;
import mvc2converter.typeconverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        //registry.addConverter(new StringToIntegerConverter());
        //registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new IpPortToStringConverter());
        registry.addConverter(new StringToIpPortConverter());

        //추가
        registry.addFormatter(new MyNumberFormatter());

    }
}
