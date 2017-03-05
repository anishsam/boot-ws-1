package com.anishsam.myboot1.service;

import com.anishsam.myboot.schema.cities.City;
import com.anishsam.myboot1.persistence.CityRepository;

/**
 * Created by if993744 on 3/5/2017.
 */
public class CitiesService implements ICitiesService {

    CityRepository cityRepository;

    @Override
    public City getCityByCode(int code) {
        cityRepository = new CityRepository();
        City city = cityRepository.findCity(code);
        return city;
    }

    @Override
    public String getCountryByCityName(String cityName) {
        cityRepository = new CityRepository();
        String country = cityRepository.findCountry(cityName);
        return country;
    }
}
