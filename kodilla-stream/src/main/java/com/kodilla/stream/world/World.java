package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private final Set<Continent> worldContinents = new HashSet<>();


    public void addContinent(Continent continent) {
        worldContinents.add(continent);
    }

    public BigDecimal totalPeople(){
        return worldContinents.stream()
                .flatMap(cnt -> cnt.getContinents().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
