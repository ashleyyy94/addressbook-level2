package seedu.addressbook.data.person;

/**
 * Represents a Person's street in his address.
 */
public class Street {
    
    private final String street;

    public Street(String street) {
        this.street = street;
    }
    
    /**
    * @return the street
    */
    public String getStreet() {
        return this.street;
    }
    
    @Override
    public String toString() {
        return "" + this.street;
    }

}