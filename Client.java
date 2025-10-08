public class Client {
    private String name;
    private String company;
    private String contact;
    private String email;

    public Client(String name, String company, String contact, String email) {
        this.name = name;
        this.company = company;
        this.contact = contact;
        this.email = email;
    }

    public void display() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client Name: " + name +
               ", Company: " + company +
               ", Contact: " + contact +
               ", Email: " + email;
    }
}
