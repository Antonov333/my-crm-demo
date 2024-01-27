package com.example.mycrm.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * <h2>public class Deal</h2>
 * Models company deals (contracts, agreements, etc.) with other companies and individuals
 */
public class Deal {
    private Long id;
    private Project project;
    private DealType dealType;
    private DealParty counterParty;
    private HashSet<DealParty> otherParties;
    private String termsAndConditions;
    private List<CommercialItem> itemList;
}
