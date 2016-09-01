package seedu.addressbook.data.person;

/**
 * Represents a Person's postal code in his address.
 */
public class PostalCode {
    
    private final String postalCode;

    public PostalCode(String postal) {
        this.postalCode = postal;
    }
    
    /**
    * @return the postal code
    */
    public String getPostalCode() {
        return this.postalCode;
    }
    
    @Override
    public String toString() {
        return "" + this.postalCode;
    }

}