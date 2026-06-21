package dto;

public class Account {
    private final String name;
    private final String phone;
    private final String website;
    private final String fax;
    private final String billingStreet;
    private final String billingCity;
    private final String billingState;
    private final String billingPostalCode;
    private final String billingCountry;
    private final String shippingStreet;
    private final String shippingCity;
    private final String shippingState;
    private final String shippingPostalCode;
    private final String shippingCountry;
    private final String description;
    private final String type;
    private final String annualRevenue;
    private final String industry;
    private final String employees;

    public Account (String name, String phone, String website, String fax,
                    String billingStreet, String billingCity, String billingState,
                    String billingPostalCode, String billingCountry,
                    String shippingStreet, String shippingCity, String shippingState,
                    String shippingPostalCode, String shippingCountry,
                    String description, String type, String annualRevenue,
                    String industry, String employees) {
        this.name = name;
        this.phone = phone;
        this.website = website;
        this.fax = fax;
        this.billingStreet = billingStreet;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingPostalCode = billingPostalCode;
        this.billingCountry = billingCountry;
        this.shippingStreet = shippingStreet;
        this.shippingCity = shippingCity;
        this.shippingState = shippingState;
        this.shippingPostalCode = shippingPostalCode;
        this.shippingCountry = shippingCountry;
        this.description = description;
        this.type = type;
        this.annualRevenue = annualRevenue;
        this.industry = industry;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getWebsite() {
        return website;
    }
    public String getFax() {
        return fax;
    }
    public String getBillingStreet() {
        return billingStreet;
    }
    public String getBillingCity() {
        return billingCity;
    }
    public String getBillingState() {
        return billingState;
    }
    public String getBillingPostalCode() {
        return billingPostalCode;
    }
    public String getBillingCountry() {
        return billingCountry;
    }
    public String getShippingStreet() {
        return shippingStreet;
    }
    public String getShippingCity() {
        return shippingCity;
    }
    public String getShippingState() {
        return shippingState;
    }
    public String getShippingPostalCode() {
        return shippingPostalCode;
    }
    public String getShippingCountry() {
        return shippingCountry;
    }
    public String getDescription() {
        return description;
    }
    public String getType() {
        return type;
    }
    public String getAnnualRevenue() {
        return annualRevenue;
    }
    public String getIndustry() {
        return industry;
    }
    public String getEmployees() {
        return employees;
    }
}