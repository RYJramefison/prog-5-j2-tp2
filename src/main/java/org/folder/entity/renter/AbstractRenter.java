package org.folder.entity.renter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.folder.entity.rentable.Asset;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class AbstractRenter implements Renter {
    protected String name;
    protected String contact;


    @Override
    public void rent(Asset asset) {
        System.out.println("rent item: " + asset.getLabel());
    }

}
