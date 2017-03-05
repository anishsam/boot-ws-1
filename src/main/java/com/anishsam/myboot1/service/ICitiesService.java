package com.anishsam.myboot1.service;

import com.anishsam.myboot.schema.cities.City;

/**
 * Created by if993744 on 3/5/2017.
 */
public interface ICitiesService {
    City getCityByCode(int code);
    String getCountryByCityName(String cityName);
}
