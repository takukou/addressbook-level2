package seedu.addressbook.data.person;

public class Postal_Code {

    private String postal_code;
    
    public Postal_Code(String string) {
        this.setPostal_code(string);
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

}
