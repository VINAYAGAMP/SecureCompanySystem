import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to SecureCompanySystem");
        System.out.print("Enter your email: ");
        String email = sc.nextLine().trim();

        String role = DataStore.userRoles.getOrDefault(email, "Guest");
        System.out.println("Logged in as: " + role);

        switch (role) {
            case "Founder" -> FounderDashboard.show(sc, email);
            case "HR" -> HRDashboard.show(sc, email);
            case "Employee" -> EmployeeDashboard.show(sc, email);
            default -> System.out.println("Access denied or limited view.");
        }
    }
}
