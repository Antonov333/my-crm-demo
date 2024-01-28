package com.example.mycrm.model.organization;

import com.example.mycrm.model.metrics.Indicator;
import com.example.mycrm.model.human.Person;

import java.util.List;
import java.util.Set;

/**<h2>public class BusinessEntity</h2>
 * Any customer is a business entity
 */
public class BusinessEntity {
    private Long id;

    private String name;

    private BusinessEntityType entityType;

    private List<Person> crew;

    /**
     * Counterparty rating (customer, supplier, etc. rating)
     */
    private Set<Indicator> ranking;

    private BusinessEntityDetails details;
}
