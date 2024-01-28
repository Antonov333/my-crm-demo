package com.example.mycrm.model.organization;

import com.example.mycrm.model.human.Person;

/**
 * <h2>public class JobPosition</h2>
 * Models employee position in company by simplest way: has fields only for job title and person at this position
 * <br>Real positions must have job description and job contract. Fields to model mentioned features could be added later upon required.
 * <br>Must understand job descriptions and especially job contracts reachable only in same company you work at.
 * You may know only job titles of persons from other company you negotiate with for business purposes
 * <br> By the way, simplest model of job position looks nice to run customer database
 */
public class JobPosition {
    private String jobTitle;

    /**
     * Person occupied the position
     * Null value of occupiedBy field means position is vacant
     */
    private Person occupiedBy;
}
