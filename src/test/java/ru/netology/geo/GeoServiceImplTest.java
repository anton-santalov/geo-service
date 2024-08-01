package ru.netology.geo;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {

    @Test
    public void testGetLocationByRussianIp() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location location = geoService.byIp("172.0.32.11");
        assertEquals(Country.RUSSIA, location.getCountry());
    }

    @Test
    public void testGetLocationByAmericanIp() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location location = geoService.byIp("96.44.183.149");
        assertEquals(Country.USA, location.getCountry());
    }
}