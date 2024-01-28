package com.example.mycrm.model;

import lombok.Data;
import java.util.HashSet;
import java.util.List;

@Data
/**
 * <h2>public class Deal</h2>
 * Models company deals (contracts, agreements, etc.) with other companies and individuals
 */
public class Deal {
    private Long id;
    /**
     * We follow project vision on relationship with business customer in B2B marketing, so everything company do with customers is a part of some project
     * Any action could be done unless it is a part of some project
     */
    private Project project;

    /**
     * First of all, we make clear whether we sell or buy
     * <br>Other type of deals may be defined upon it become reasonable during development of running the application in the field
     */
    private DealType dealType;

    /**
     * Other party of a deal: buyer, or seller most often, maybe other roles in contract
     */
    private DealParty counterParty;

    /**
     * Also may be more parties of a deal
     */
    private HashSet<DealParty> otherParties;
    private String termsAndConditions;

    /**
     * We must specify particular product, its' quantity, price per unit and sum cost of position
     * <br>Let's do it with itemlist field of {@link CommercialItem} type.
     * Total sum of a deal supposed to provide by method to be created later in service class
     */
    private List<CommercialItem> itemList;
}
