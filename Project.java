public class Project {
    private String name;
    private String client;
    private String startDate;
    private String endDate;
    private String status;

    public Project(String name, String client, String startDate, String endDate, String status) {
        this.name = name;
        this.client = client;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public void display() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public String getClient() {
        return client;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Project Name: " + name +
               ", Client: " + client +
               ", Start Date: " + startDate +
               ", End Date: " + endDate +
               ", Status: " + status;
    }
}
