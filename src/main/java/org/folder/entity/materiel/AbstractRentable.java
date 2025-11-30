package org.folder.entity.materiel;

public abstract class AbstractRentable implements Rentable {
    protected double basePrice;

    public abstract double calculateRent();
}
