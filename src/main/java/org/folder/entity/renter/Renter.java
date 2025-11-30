package org.folder.entity.renter;

import org.folder.entity.rentable.Asset;

public interface Renter {
    void rent(Asset asset);
    String getRenterType();

}
