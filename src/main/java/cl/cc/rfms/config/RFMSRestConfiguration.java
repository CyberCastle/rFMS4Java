package cl.cc.rfms.config;

import cl.cc.http.client.AcceptHeaderRequestInterceptor;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriTemplateHandler;

/**
 *
 * @author CyberCastle
 */
@Configuration
public class RFMSRestConfiguration {

    @Value("${rFMSRest.url}")
    private String rFMSRestUrl;
    @Value("${rFMSRest.username}")
    private String username;
    @Value("${rFMSRest.password}")
    private String password;
    
    
    @Bean
    public RestTemplate rFMSRestTemplate(RestTemplateBuilder builder) {

        DefaultUriTemplateHandler uriTemplateHandler = new DefaultUriTemplateHandler();
        uriTemplateHandler.setBaseUrl(this.rFMSRestUrl);

        return builder
                .basicAuthorization(this.username, this.password)
                .uriTemplateHandler(uriTemplateHandler)
                .additionalInterceptors(new AcceptHeaderRequestInterceptor(Arrays.asList(MediaType.TEXT_XML)))
                .build();
    }
}
