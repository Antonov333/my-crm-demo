package com.example.mycrm.model;

import java.util.List;

/**
 * As any (at least many of) process in company could be represented as sequence of projects, so we created Project entity
 */
public class Project {
    private Long id;

    private String name;

    private Person responsible;

    private List<Person> crew;

    private List<Person> customers;

    /**
     * external suppliers
     */
    private List<Person> suppliers;

    private List<Person> thirdParties;

    // TODO: consider regarding business entity class

}
