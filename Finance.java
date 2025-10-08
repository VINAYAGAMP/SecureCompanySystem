public class Finance {
    private String type;
    private double amount;
    private String description;
    private String date;

    public Finance(String type, double amount, String description, String date) {
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    public void display() {
        System.out.println(this);
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Type: " + type +
               ", Amount: ₹" + amount +
               ", Description: " + description +
               ", Date: " + date;
    }
}
