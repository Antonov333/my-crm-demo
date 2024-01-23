package com.example.springsecurityscratch.model;

/**<h2>Person</h2>
 * This class represents user entity of the application<br>
 * It could be User class of Spring Security Framework, but at the moment I prefer to compose my own custom model.
 * That is why it's named Person not User: to prevent misunderstanding of entities used in code
 *
 * Also we have to model another entity which is a human in real world - buyer (or representative
 * of buyer company)
 * I consider Person class should be used also to represent buyers persons
 *
 */
public class Person {

    /**
     * identifier for database
     */
    private long id;

    /**
     * Name, person normally has some name
     */

    private String name;

    /**
     * Login to enter the application
     */
    private String LoginName;

    /**
     * for authorization
     */
    private String password;

    /**
     * person's role in application
     */
    private Role role;



    /**
     * Fields above provide very basic information necessary to enter and authorize in system
     * For normal operation of company sales force much more information is required. At the other hand
     * it very depends on particular situation of particular company or private negotiating with customers
     * So, I consider it is reasonable to create basic entity with major properties and extended
     * entity with detailed user information. PersonProps supposed to be flexible and custom
     */
    private PersonProps personProps;
}
