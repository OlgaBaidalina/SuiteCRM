package dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
    private String name;
    private String phone;
    private String website;
    private String fax;
    private String billingStreet;
    private String billingCity;
    private String billingState;
    private String billingPostalCode;
    private String billingCountry;
    private String shippingStreet;
    private String shippingCity;
    private String shippingState;
    private String shippingPostalCode;
    private String shippingCountry;
    private String description;
    private String type;
    private String annualRevenue;
    private String industry;
    private String employees;
}