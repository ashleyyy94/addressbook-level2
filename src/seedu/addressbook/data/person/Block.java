package seedu.addressbook.data.person;

/**
 * Represents a Person's block in his address.
 */
public class Block {
    
    private final String block;

    public Block(String block) {
        this.block = block;
    }
    
    /**
    * @return the block
    */
    public String getBlockNum() {
        return this.block;
    }
    
    @Override
    public String toString() {
        return "" + this.block;
    }

}