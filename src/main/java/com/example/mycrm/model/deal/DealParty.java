package com.example.mycrm.model.deal;

import com.example.mycrm.model.organization.BusinessEntity;

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
