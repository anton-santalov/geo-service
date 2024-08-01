package ru.netology.i18n;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @Test
    public void testLocaleForRussia() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        assertEquals("Добро пожаловать", localizationService.locale(Country.RUSSIA));
    }

    @Test
    public void testLocaleForUSA() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        assertEquals("Welcome", localizationService.locale(Country.USA));
    }
}