package cl.cc;

import cl.cc.rfms.client.RFMSRestClient;
import java.time.LocalDateTime;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author CyberCastle
 */
@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication app = new SpringApplication(Application.class);
        app.setAdditionalProfiles("dev");
        app.run("");
    }

    @Bean
    public CommandLineRunner run(RFMSRestClient rFMSRestClient) throws Exception {
        return args -> {

            Map<String,String> vehicles = rFMSRestClient.getVehicleList();
            vehicles.forEach((licensePlate, vin) -> {
                log.info(licensePlate + " <-> " + vin);
            });            
            
        };
    }

    @Bean
    public RFMSRestClient rFMSRestClient() {
        return new RFMSRestClient();
    }

}
