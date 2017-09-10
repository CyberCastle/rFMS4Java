package cl.cc.rfms.client;

import cl.cc.rfms.entity.response.list.VehicleListResponse;
import cl.cc.rfms.entity.response.position.GNSSPositionType;
import cl.cc.rfms.entity.response.position.VehiclePositionResponse;
import cl.cc.rfms.entity.response.status.VehicleStatusResponse;
import cl.cc.rfms.entity.response.status.VehicleStatusType;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author CyberCastle
 */
public class RFMSRestClient {

    private static final Logger log = LoggerFactory.getLogger(RFMSRestClient.class);

    @Inject
    RestTemplate rFMSRestTemplate;

    //https://fmsextapi.scania.com/RFMS/v1.0/vehicle/List
    public Map<String, String> getVehicleList() {

        String urlBase = "/RFMS/v1.0/vehicle/List";
        VehicleListResponse response = rFMSRestTemplate.getForObject(urlBase, VehicleListResponse.class);

        final Map<String, String> vehicleList = new HashMap<>();
        response.getVehicle().forEach((vehicle) -> {
            String licensePlate = vehicle.getLicensePlate();
            String vin = vehicle.getVIN();
            vehicleList.put(licensePlate, vin);
        });

        return vehicleList;
    }

    //https://fmsextapi.scania.com/RFMS/v1.0/vehicle/position/Current?vin=
    public GNSSPositionType getVehicleCurrentPosition(String vin) {

        String urlBase = "/RFMS/v1.0/vehicle/position/Current";
        UriComponentsBuilder builder = UriComponentsBuilder
                .fromUriString(urlBase)
                .queryParam("vin", vin);
        String url = builder.build().encode().toUriString();
        VehiclePositionResponse response = rFMSRestTemplate.getForObject(url, VehiclePositionResponse.class);

        return response.getVehiclePosition().get(0).getGNSSPosition();
    }

    //https://fmsextapi.scania.com/RFMS/v1.0/vehicle/status/History?vin=&startTime=&stopTime=&dateType=
    public List<VehicleStatusType> getVehicleHistoryStatus(String vin, LocalDateTime startTime, LocalDateTime stopTime) {

        String urlBase = "/RFMS/v1.0/vehicle/status/History";
        UriComponentsBuilder builder = UriComponentsBuilder
                .fromUriString(urlBase)
                .queryParam("vin", vin)
                .queryParam("startTime", startTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .queryParam("stopTime", stopTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .queryParam("dateType", "Created");
        String url = builder.build().encode().toUriString();
        VehicleStatusResponse response = rFMSRestTemplate.getForObject(url, VehicleStatusResponse.class);

        return response.getVehicleStatus();
    }

}
