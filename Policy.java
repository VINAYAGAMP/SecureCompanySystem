public class Policy {
    private String title;
    private String description;

    // Constructor
    public Policy(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Display method
    public void display() {
        System.out.println("Title       : " + title);
        System.out.println("Description : " + description);
    }
}
