package org.folder.entity.renter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.folder.entity.rentable.Asset;

@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractRenter implements Renter {
    protected String name;


    @Override
    public void rent(Asset asset) {
        System.out.println("rent item: " + asset.getLabel());
    }

}
