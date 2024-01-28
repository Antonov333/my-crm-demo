package com.example.mycrm.model.product;

import com.example.mycrm.model.organization.BusinessEntity;

/**
 * <h2>public class ProductDetails</h2>
 * Product details modelled by this class: manufacturer, batch No., date of manufacturing, unique product number, supplier...
 * <br> Fields to be exacted if necessary by development and field usage of application
 * <br>Real detail set very depends on industry, so only basic fields are created so far.<br>Upon particular case all necessary fields will be added to class and logic implemented by service class
 */
public class ProductDetails {
    private Long id;

    private long productId;

    private BusinessEntity manufacturer;

    private BusinessEntity supplier;

    private String productionDate;

    private String batchNumber;

    private String uniqueProductNumber;

    /**
     * Link on user manual, datasheet, etc.
     */
    private String publicDocumentationLink;
}
