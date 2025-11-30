package org.folder.controller;

import lombok.AllArgsConstructor;
import org.folder.entity.materiel.Rent;
import org.folder.service.RentService;

import java.util.List;

@AllArgsConstructor
public class RentController {
    private final RentService service;

    public Rent getRentById(int id) {
        return service.fetchRent(id);
    }

    public List<Rent> getRentByName(String name){
        return service.searchRent(name);
    }

}
