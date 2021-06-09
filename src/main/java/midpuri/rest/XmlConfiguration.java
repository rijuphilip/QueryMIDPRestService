package midpuri.rest;

import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;

@Configuration
public class XmlConfiguration {

    @Bean
    MappingJackson2XmlHttpMessageConverter getMappingJackson2XmlHttpMessageConverter() {
        JaxbAnnotationModule jaxbAnnotationModule = new JaxbAnnotationModule();
        MappingJackson2XmlHttpMessageConverter mappingJackson2XmlHttpMessageConverter = new MappingJackson2XmlHttpMessageConverter();
        mappingJackson2XmlHttpMessageConverter.getObjectMapper().registerModule(jaxbAnnotationModule);
        return mappingJackson2XmlHttpMessageConverter;
    }
}