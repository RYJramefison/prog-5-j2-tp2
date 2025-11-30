package org.folder.entity.rentable;
import org.folder.entity.renter.AbstractRenter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Rent {
    private int id;
    private AbstractRenter renter;
    private double price;
}
