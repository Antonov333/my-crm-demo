package com.example.mycrm.model;

/**
 * <h2>public class DealParty</h2>
 * combines business entity and its' role in deal
 */
public class DealParty {
    private BusinessEntity businessEntity;
    private DealPartyRole partyRole;

    /**
     * Name of Non-standard role
     */
    private String otherRoleName;
}
