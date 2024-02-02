package com.example.mycrm.model.organization;

import com.example.mycrm.model.human.Person;
import com.example.mycrm.model.human.PersonProps;

/**
 * <h2>public class OurCompany </h2>
 * Keeps information regarding our company, i.e. business entity running this application
 */
public class OurCompany {
    private BusinessEntity company;

    public void assignHeadOfOurCompany(Person newHeadOfOurCompany) {
        throwIfNull(company, "Company instance is null");
        throwIfNull(newHeadOfOurCompany, "Head of company instance is null");
        company.setHeadOfCompany(newHeadOfOurCompany);
    }

    private void throwIfNull(Object object, String message) {
        if (object == null) {
            throw new RuntimeException(message);
        }
    }

    /**
     * Normally this method must be a getter. Now it is dummy method returns example of entity
     *
     * @return BusinessEntity instance
     */
    public BusinessEntity getCompany() {
        return exampleOfOurCompany();
    }

    private BusinessEntity exampleOfOurCompany() {
        return BusinessEntity.builder().entityType(BusinessEntityType.BUSINESS)
                .headOfCompany(Person.builder()
                        .assumedName("Head Of Our Company").personProps(PersonProps.builder()
                                .firstName("John")
                                .lastName("Smith")
                                .build())
                        .build())
                .build();
    }

    public Person getExampleOfSalesPerson() {
        return Person.builder()
                .assumedName("Our sales person")
                .build();
    }
}
