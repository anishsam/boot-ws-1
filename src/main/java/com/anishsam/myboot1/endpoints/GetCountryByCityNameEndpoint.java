package com.anishsam.myboot1.endpoints;

import com.anishsam.myboot.schema.cities.GetCountryByCityNameRequest;
import com.anishsam.myboot.schema.cities.GetCountryByCityNameResponse;
import com.anishsam.myboot1.persistence.CityRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

@Endpoint
public class GetCountryByCityNameEndpoint {
    static final Logger logger = LogManager.getLogger(GetCountryByCityNameEndpoint.class);

    @Autowired
    CityRepository cityRepository;

    public GetCountryByCityNameResponse getCountryByCity(@RequestPayload GetCountryByCityNameRequest request) {
        logger.info("Entering Endpoint");
        GetCountryByCityNameResponse response = new GetCountryByCityNameResponse();
        String country = cityRepository.findCountry(request.getCityName());
        response.setCountry(country);
        return response;
    }
}
