package com.minimerce.core.component.item;

import com.minimerce.core.support.object.type.ProductType;
import lombok.Getter;

/**
 * Created by gemini on 03/06/2017.
 */
@Getter
public class Stock {
    private ProductType type;
    private long optionId;
    private long itemId;
    private int quantity;

    public Stock(ProductType type, long optionId, long itemId, int quantity) {
        this.type = type;
        this.optionId = optionId;
        this.itemId = itemId;
        this.quantity = quantity;
    }
}