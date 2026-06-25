package dto;

public class Contacts {
    private final String salutation;
    private final String firstName;
    private final String lastName;
    private final String officePhone;
    private final String mobilePhone;
    private final String jobTitle;
    private final String department;
    private final String fax;
    private final String primaryStreet;
    private final String primaryCity;
    private final String primaryState;
    private final String primaryPostalCode;
    private final String primaryCountry;
    private final String otherStreet;
    private final String otherCity;
    private final String otherState;
    private final String otherPostalCode;
    private final String otherCountry;
    private final String description;
    private final String leadSource;

    public Contacts(String salutation, String firstName, String lastName,
                    String officePhone, String mobilePhone, String jobTitle,
                    String department, String fax,
                    String primaryStreet, String primaryCity, String primaryState,
                    String primaryPostalCode, String primaryCountry,
                    String otherStreet, String otherCity, String otherState,
                    String otherPostalCode, String otherCountry,
                    String description, String leadSource) {
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.officePhone = officePhone;
        this.mobilePhone = mobilePhone;
        this.jobTitle = jobTitle;
        this.department = department;
        this.fax = fax;
        this.primaryStreet = primaryStreet;
        this.primaryCity = primaryCity;
        this.primaryState = primaryState;
        this.primaryPostalCode = primaryPostalCode;
        this.primaryCountry = primaryCountry;
        this.otherStreet = otherStreet;
        this.otherCity = otherCity;
        this.otherState = otherState;
        this.otherPostalCode = otherPostalCode;
        this.otherCountry = otherCountry;
        this.description = description;
        this.leadSource = leadSource;
    }

    public String getSalutation() {
        return salutation;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getOfficePhone() {
        return officePhone;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public String getDepartment() {
        return department;
    }
    public String getFax() {
        return fax;
    }
    public String getPrimaryStreet() {
        return primaryStreet;
    }
    public String getPrimaryCity() {
        return primaryCity;
    }
    public String getPrimaryState() {
        return primaryState;
    }
    public String getPrimaryPostalCode() {
        return primaryPostalCode;
    }
    public String getPrimaryCountry() {
        return primaryCountry;
    }
    public String getOtherStreet() {
        return otherStreet;
    }
    public String getOtherCity() {
        return otherCity;
    }
    public String getOtherState() {
        return otherState;
    }
    public String getOtherPostalCode() {
        return otherPostalCode;
    }
    public String getOtherCountry() {
        return otherCountry;
    }
    public String getDescription() {
        return description;
    }
    public String getLeadSource() {
        return leadSource;
    }
}