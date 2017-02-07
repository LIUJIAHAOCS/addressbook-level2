package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
    private Person person;
    private Tag tag;
    private String type;
    
    public Tagging(Person person, Tag tag, String type) {
        this.person = person;
        this.tag = tag;
        this.type = type;
    }
    
    public Person getPerson() {
        return person;
    }
    
    public Tag getTag() {
        return tag;
    }
    
    public String getType() {
        return type;
    }
    
    public String toString() {
        return type + person.toString() + tag.toString();
    }
    
}
