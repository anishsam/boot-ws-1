package com.anishsam.myboot1.endpoints;

import com.anishsam.myboot.schema.cities.City;
import com.anishsam.myboot.schema.cities.GetCityByCodeRequest;
import com.anishsam.myboot.schema.cities.GetCityByCodeResponse;
import com.anishsam.myboot1.persistence.CityRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

/**
 * Created by if993744 on 3/5/2017.
 */
@Endpoint
public class GetCityByCodeEndpoint {

    static final Logger logger = LogManager.getLogger(GetCityByCodeEndpoint.class);

    @Autowired
    CityRepository cityRepository;

//    public GetCityByCodeEndpoint(CityRepository cityRepository) {
//        this.cityRepository = cityRepository;
//    }


    public GetCityByCodeResponse getCityByCode(@RequestPayload GetCityByCodeRequest request) {
        logger.info("Entering endpoint");
        GetCityByCodeResponse response = new GetCityByCodeResponse();
        City city = cityRepository.findCity(request.getCode());
        response.setCity(city);
        return response;
    }
}
