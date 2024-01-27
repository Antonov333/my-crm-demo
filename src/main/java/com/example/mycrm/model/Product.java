package com.example.mycrm.model;

/**
 * <h2>public class Products</h2>
 * models all items having value and could be sold and/or bought, or used by company somehow
 */
public class Product {

    private Long id;

    private String partNumber;

    private String description;

    private ProductUsageType usage;

    private ProductType productType;

    /**
     * unit to measure quantity of product
     */
    private MeasurementUnit unit;

    /**
     * cost to get 1 unit of product
     */
    private long buyingCost;

    /**
     * price of which company agrees to sell product.
     * Specified for 1 unit of product
     */
    private long sellingPrice;

    private ProductDetails productDetails;

}
