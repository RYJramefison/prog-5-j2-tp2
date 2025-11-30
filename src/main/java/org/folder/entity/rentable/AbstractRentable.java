package org.folder.entity.rentable;

public abstract class AbstractRentable implements Rentable {
    protected double basePrice;

    public abstract double calculateRent();
}
