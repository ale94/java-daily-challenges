package ar.com.ale94.day03;

public class Supplier {
    private String name;
    private String contact;

    public Supplier(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supplier{");
        sb.append("name='").append(name).append('\'');
        sb.append(", contact='").append(contact).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
