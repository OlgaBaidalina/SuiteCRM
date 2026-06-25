package dto;

import lombok.*;

@Data
@Builder
public class Contacts {
    private String salutation;
    private String firstName;
    private String lastName;
    private String officePhone;
    private String mobilePhone;
    private String jobTitle;
    private String department;
    private String fax;
    private String primaryStreet;
    private String primaryCity;
    private String primaryState;
    private String primaryPostalCode;
    private String primaryCountry;
    private String otherStreet;
    private String otherCity;
    private String otherState;
    private String otherPostalCode;
    private String otherCountry;
    private String description;
    private String leadSource;
}