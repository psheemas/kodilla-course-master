package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        //Given
        //Create Countries

        //Europe
        Country albania = new Country("Albania",new BigDecimal("3195000"));
        Country andora = new Country("Andora",new BigDecimal("84525"));
        Country austria = new Country("Austria",new BigDecimal("8402549"));
        Country belgia = new Country("Belgia",new BigDecimal("10584534"));
        Country bialorus = new Country("Bialorus",new BigDecimal("9474200"));
        Country bosniaIHercegowina = new Country("Bosnia i Hercegowina",new BigDecimal("4590310"));
        Country bulgaria = new Country("Bulgaria",new BigDecimal("7531000"));
        Country chorwacja = new Country("Chorwacja",new BigDecimal("4437460"));

        //Africa
        Country algieria = new Country("Algieria",new BigDecimal("34178188"));
        Country angola = new Country("Angola",new BigDecimal("17312000"));
        Country benin = new Country("Benin",new BigDecimal("8295000"));
        Country botswana = new Country("Botswana",new BigDecimal("1842000"));
        Country burkina = new Country("Burkina Faso",new BigDecimal("15746232"));
        Country burundi = new Country("Burundi",new BigDecimal("8691000"));
        Country czad = new Country("Czad",new BigDecimal("10758945"));
        Country kongo = new Country("Demokratyczna Republika Konga",new BigDecimal("66515000"));

        //South America
        Country argentyna = new Country("Argentyna",new BigDecimal("40913584"));
        Country boliwia = new Country("Boliwia",new BigDecimal("9248000"));
        Country brazylia = new Country("Brazylia",new BigDecimal("201103330"));
        Country chile = new Country("Chile",new BigDecimal("16601707"));
        Country ekwador = new Country("Ekwador",new BigDecimal("13928000"));
        Country gujana = new Country("Gujana",new BigDecimal("769095"));
        Country kolumbia = new Country("Kolumbia",new BigDecimal("45730834"));
        Country paragwaj = new Country("Paragwaj",new BigDecimal("6670000"));

        //North America
        Country antiguaIBarbuda = new Country("Antigua i Barbuda",new BigDecimal("85420"));
        Country bahamy = new Country("Bahamy",new BigDecimal("307451"));
        Country barbados = new Country("Barbados",new BigDecimal("281968"));
        Country belize = new Country("Belize",new BigDecimal("266440"));
        Country dominika = new Country("Dominika",new BigDecimal("72000"));
        Country dominikana = new Country("Dominikana",new BigDecimal("9049595"));
        Country grenada = new Country("Grenada",new BigDecimal("89258"));
        Country gwatemala = new Country("Gwatemala",new BigDecimal("12013907"));

        //Asia
        Country afganistan = new Country("Afganistan",new BigDecimal("30419928"));
        Country arabiaSaudyjska = new Country("Arabia Saudyjska",new BigDecimal("28686633"));
        Country armenia = new Country("Armenia",new BigDecimal("3259100"));
        Country azerbejdzan = new Country("Azerbejdzan",new BigDecimal("9493600"));
        Country bahrajn = new Country("Bahrajn",new BigDecimal("1323535"));
        Country bangladesz = new Country("Bangladesz",new BigDecimal("162221000"));;
        Country bhutan = new Country("Bhutan",new BigDecimal("682321"));
        Country brunei = new Country("Brunei",new BigDecimal("381371"));


        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent southAmerica = new Continent("South America");
        Continent northAmerica = new Continent("North America");
        Continent asia = new Continent("Asia");

        //When

        //Europe
        europe.addCountry(albania);
        europe.addCountry(andora);
        europe.addCountry(austria);
        europe.addCountry(belgia);
        europe.addCountry(bialorus);
        europe.addCountry(bosniaIHercegowina);
        europe.addCountry(bulgaria);
        europe.addCountry(chorwacja);

        //Africa
        africa.addCountry(algieria);
        asia.addCountry(angola);
        asia.addCountry(benin);
        asia.addCountry(botswana);
        asia.addCountry(burkina);
        asia.addCountry(burundi);
        asia.addCountry(czad);
        asia.addCountry(kongo);

        //South America
        southAmerica.addCountry(argentyna);
        southAmerica.addCountry(boliwia);
        southAmerica.addCountry(brazylia);
        southAmerica.addCountry(chile);
        southAmerica.addCountry(ekwador);
        southAmerica.addCountry(gujana);
        southAmerica.addCountry(kolumbia);
        southAmerica.addCountry(paragwaj);

        //North America
        northAmerica.addCountry(antiguaIBarbuda);
        northAmerica.addCountry(bahamy);
        northAmerica.addCountry(barbados);
        northAmerica.addCountry(belize);
        northAmerica.addCountry(dominika);
        northAmerica.addCountry(dominikana);
        northAmerica.addCountry(grenada);
        northAmerica.addCountry(gwatemala);

        //Asia
        asia.addCountry(afganistan);
        asia.addCountry(arabiaSaudyjska);
        asia.addCountry(armenia);
        asia.addCountry(azerbejdzan);
        asia.addCountry(bahrajn);
        asia.addCountry(bangladesz);
        asia.addCountry(bhutan);
        asia.addCountry(brunei);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(southAmerica);
        world.addContinent(northAmerica);
        world.addContinent(asia);

        //Then
        Assert.assertEquals(new BigDecimal("805236020"),world.totalPeople());

    }
}
