package seedu.addressbook.data.person;

/**
 * Represents a Person's unit in his address.
 */
public class Unit {
    
    private final String unit;

    public Unit(String unit) {
        this.unit = unit;
    }
    
    /**
    * @return the unit
    */
    public String getUnit() {
        return this.unit;
    }
    
    @Override
    public String toString() {
        return "" + this.unit;
    }

}