package com.example.mycrm.model.human;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
/**
 * <h2>PersonProps</h2>
 * Detailed person information related to entity of {@link Person}
 */
public class PersonProps {
    private long personId;

    private String firstName;

    private String lastName;

    private String address;

    private String phone;

    private String email;
}
