package org.folder.service;

import org.folder.entity.rentable.Rent;

import java.util.List;

public interface RentService {
    Rent fetchRent(int id);

    List<Rent> searchRent(String name);
}
