package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
    private String symbol;
    private Person person;
    private Tag tag;
    
    public Tagging(String symbol, Tag tag, Person person) {
        this.symbol = symbol;
        this.tag = tag;
        this.person = person;
    }
    
    public String getSymbol() {
        return symbol;
    }

    public Tag getTag() {
        return tag;
    }

    public Person getPerson() {
        return person;
    }
    
    public String toString(){
        return symbol.toString() + " " + person.getName().toString() + " " + tag.toString();
    }
}