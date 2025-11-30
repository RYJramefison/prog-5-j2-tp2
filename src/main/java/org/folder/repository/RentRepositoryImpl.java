package org.folder.repository;

import org.folder.entity.materiel.Rent;
import org.folder.manager.DataSourceManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RentRepositoryImpl implements RentRepository{

    private final DataSourceManager db = new DataSourceManager();
    @Override
    public Rent getRent(int id) {
        try (Connection con = db.getConnection()){
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM rent WHERE id = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()){
                Rent rent = new Rent();

                rent.setId(rs.getInt("id"));
                rent.setRenterName(rs.getString("renter_name"));
                rent.setPrice(rs.getDouble("price"));
                return rent;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error in getRent " + e);
        }
        return null;
    }

    @Override
    public List<Rent> findRent(String renterName) {
        List<Rent> list = new ArrayList<>();

        try (Connection con = db.getConnection()){
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM rent WHERE renter_name ILIKE ?");
            stmt.setString(1,"%" + renterName + "%");
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Rent rent = new Rent();
                rent.setId(rs.getInt("id"));
                rent.setRenterName(rs.getString("renter_name"));
                rent.setPrice(rs.getDouble("price"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error in findRent " + e);
        }
        return list;
    }
}
