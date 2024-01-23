package com.example.mycrm.model;

/**<h2>Person</h2>
 * This class represents user entity of the application<br>
 * It could be User class of Spring Security Framework, but at the moment I prefer to compose my own custom model.
 * That is why it's named Person not User: to prevent misunderstanding of entities used in code
 * Also we have to model another entity which is a human in real world - buyer (or representative
 * of buyer company)
 * I consider Person class should be used also to represent buyers persons
 *
 */
public class Person {

    /**
     * identifier for database
     */
    private Long id;

    /**
     * Login to enter the application
     */
    private String LoginName;

    /**
     * password for authorization
     */
    private String password;

    /**
     * person's role in application
     */
    private Role role;

    /**
     * Surname could help instantly remind who is it<br>
     * May be moved to PersonProps later if will be considered reasonable
     */
    private String assumedName;

    /**
     * Must help quickly understand role of person in company business<br>
     * May be moved to PersonProps later if will be considered reasonable
     */
    private String shortDescription;

    /**
     * <h3>Customer ranking</h3><br>Decided to make it simply whole number
     * it is also applicable to employees.
     * Sure, measuring customer ranking is quite different from employee one
     * At the moment we arrange very simple field for ranking (kind of points counter), while it could be very complex to meet real business requirements
     */
    private long ranking;

    /**
     * Fields above provide very basic information necessary to enter and authorize in system, and ranking
     * For normal operation of company sales force much more information is required. At the other hand
     * it very depends on particular situation of particular company or private negotiating with customers
     * So, I consider it is reasonable to create basic entity with major properties and another
     * entity with detailed user information. PersonProps supposed to be flexible and custom
     */
    private PersonProps personProps;
}
