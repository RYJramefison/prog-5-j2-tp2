package org.folder.service;

import org.folder.entity.materiel.Rent;
import org.folder.repository.RentRepository;
import org.folder.repository.RentRepositoryImpl;

import java.util.List;
import java.util.logging.Logger;

public class RentServiceImpl implements RentService{
    private final RentRepository repository;
    private static Logger logger = Logger.getLogger(RentRepositoryImpl.class.getName());

    @Override
    public Rent fetchRent(int id) {
        try {
            return repository.getRent(id);

        } catch (Exception e) {
            logger.severe("Error fetching ret: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Rent> searchRent(String name) {
        try {
            return repository.findRent(name);

        } catch (Exception e) {
            logger.severe("Error searching rent: " + e.getMessage());
        }
        return List.of();
    }
}
