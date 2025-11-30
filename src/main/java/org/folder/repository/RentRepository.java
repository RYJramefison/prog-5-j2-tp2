package org.folder.repository;

import org.folder.entity.rentable.Rent;

import java.util.List;


public interface RentRepository {
    Rent getRent(int id);

    List<Rent> findRent(String renterName);
}
