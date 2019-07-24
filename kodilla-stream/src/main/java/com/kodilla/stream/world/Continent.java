package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class Continent {
    private String continentName;
    private final Set<Country> continentList = new HashSet<>();

    public Continent(final String continentName){
        this.continentName=continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getContinents() {
        return continentList;
    }

    public void addCountry(Country country){
            continentList.add(country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        if (continentName != null ? !continentName.equals(continent.continentName) : continent.continentName != null)
            return false;
        return continentList != null ? continentList.equals(continent.continentList) : continent.continentList == null;
    }

    @Override
    public int hashCode() {
        int result = continentName != null ? continentName.hashCode() : 0;
        result = 31 * result + (continentList != null ? continentList.hashCode() : 0);
        return result;
    }
}