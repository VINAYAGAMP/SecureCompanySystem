import java.util.List;
import java.util.Scanner;

public class ProjectModule {

    public static void searchByName(Scanner sc) {
        System.out.print("Enter Project Name to search: ");
        String name = sc.nextLine().trim().toLowerCase();

        for (Project p : DataStore.projects) {
            if (p.getName().toLowerCase().contains(name)) {
                System.out.println("Match found:");
                p.display();
            }
        }
    }

    public static void searchByClient(Scanner sc) {
        System.out.print("Enter Client Name to search projects: ");
        String client = sc.nextLine().trim().toLowerCase();

        for (Project p : DataStore.projects) {
            if (p.getClient().toLowerCase().contains(client)) {
                System.out.println("Match found:");
                p.display();
            }
        }
    }

    public static void filterByStatus(Scanner sc) {
        System.out.print("Enter Project Status to filter (e.g., Ongoing, Completed): ");
        String status = sc.nextLine().trim().toLowerCase();

        List<Project> list = DataStore.projects.stream()
            .filter(p -> p.getStatus().toLowerCase().equals(status))
            .toList();

        if (list.isEmpty()) {
            System.out.println("No projects found with status: " + status);
        } else {
            System.out.println("Projects with status '" + status + "':");
            list.forEach(Project::display);
        }
    }

    public static void listAll() {
        System.out.println("\n--- All Projects ---");
        for (Project p : DataStore.projects) {
            p.display();
        }
    }

    public static void addProject(Scanner sc) {
        System.out.println("\n--- Add New Project ---");
        System.out.print("Project Name: ");
        String name = sc.nextLine();
        System.out.print("Client Name: ");
        String client = sc.nextLine();
        System.out.print("Start Date (dd/mm/yyyy): ");
        String startDate = sc.nextLine();
        System.out.print("End Date (dd/mm/yyyy): ");
        String endDate = sc.nextLine();
        System.out.print("Status: ");
        String status = sc.nextLine();

        Project newProject = new Project(name, client, startDate, endDate, status);
        DataStore.projects.add(newProject);
        System.out.println("Project added successfully.");
    }
}
