package com.example.mycrm.model.deal;

import com.example.mycrm.model.metrics.MeasurementUnit;
import com.example.mycrm.model.product.Product;

import java.util.Currency;

/**
 * <h2>public class CommercialItem</h2>
 * Models position in commercial contract
 */
public class CommercialItem {
    private Long id;
    private Product product;

    private long quantityLong;

    private double quantityDouble;

    private MeasurementUnit measurementUnit;

    /**
     * selling price per unit
     */
    private long sellingPrice;

    private Currency currency;
}
