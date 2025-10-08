import java.util.*;

public class DataStore {
    public static List<Employee> employees = new ArrayList<>();
    public static List<Client> clients = new ArrayList<>();
    public static List<Project> projects = new ArrayList<>();
    public static List<Finance> finances = new ArrayList<>();
    public static List<Policy> policies = new ArrayList<>();

    public static Map<String, String> userRoles = new HashMap<>();
    public static Map<String, String> employeeAccess = new HashMap<>();

    static {
        // Role assignments
        userRoles.put("vinayagam@cims.com", "Founder");
        userRoles.put("deepa@cims.com", "HR");
        userRoles.put("arun@cims.com", "Employee");

        // Access control
        employeeAccess.put("vinayagam@cims.com", "ALL");
        employeeAccess.put("deepa@cims.com", "EMPLOYEE_MANAGE");
        employeeAccess.put("arun@cims.com", "SELF_VIEW");

        // Employees
        employees.add(new Employee(1, "Vinayagam", "Engineering", 85000, "Founder", "Active"));
        employees.add(new Employee(2, "Deepa", "HR", 75000, "HR Manager", "Active"));
        employees.add(new Employee(3, "Arun Kumar", "Engineering", 78000, "Developer", "Active"));
        employees.add(new Employee(4, "Meena R", "Design", 72000, "UI Designer", "Active"));
        employees.add(new Employee(5, "Karthik S", "Engineering", 81000, "Backend Developer", "Active"));
        employees.add(new Employee(6, "Priya D", "HR", 70000, "HR", "Active"));
        employees.add(new Employee(7, "Ravi T", "Engineering", 76000, "Frontend Developer", "Active"));
        employees.add(new Employee(8, "Sneha M", "Finance", 69000, "Accountant", "Active"));
        employees.add(new Employee(9, "Vishnu V", "Engineering", 85000, "DevOps Engineer", "Active"));
        employees.add(new Employee(10, "Lakshmi N", "Design", 73000, "UX Designer", "Active"));
        employees.add(new Employee(11, "Ajay P", "Engineering", 79000, "QA Engineer", "Active"));
        employees.add(new Employee(12, "Divya S", "HR", 71000, "HR", "Active"));
        employees.add(new Employee(13, "Manoj K", "Engineering", 82000, "Full Stack Developer", "Active"));
        employees.add(new Employee(14, "Geetha L", "Finance", 68000, "Finance Analyst", "Active"));
        employees.add(new Employee(15, "Suresh B", "Engineering", 77000, "Developer", "Active"));
        employees.add(new Employee(16, "Anjali V", "Design", 74000, "Graphic Designer", "Active"));
        employees.add(new Employee(17, "Rahul C", "Engineering", 80000, "Software Engineer", "Active"));
        employees.add(new Employee(18, "Nithya R", "HR", 72000, "HR", "Active"));
        employees.add(new Employee(19, "Dinesh M", "Engineering", 76000, "Frontend Developer", "Active"));
        employees.add(new Employee(20, "Kavitha J", "Finance", 70000, "Accountant", "Active"));
        employees.add(new Employee(21, "Bala G", "Engineering", 83000, "Backend Developer", "Active"));
        employees.add(new Employee(22, "Shalini T", "Design", 75000, "UI Designer", "Active"));
        employees.add(new Employee(23, "Vikram S", "Engineering", 79000, "QA Engineer", "Active"));
        employees.add(new Employee(24, "Pooja N", "HR", 71000, "HR", "Active"));
        employees.add(new Employee(25, "Ramesh K", "Engineering", 82000, "Full Stack Developer", "Active"));
        employees.add(new Employee(26, "Lavanya D", "Finance", 69000, "Finance Analyst", "Active"));
        employees.add(new Employee(27, "Harish V", "Engineering", 77000, "Developer", "Active"));
        employees.add(new Employee(28, "Swathi M", "Design", 74000, "UX Designer", "Active"));
        employees.add(new Employee(29, "Gokul R", "Engineering", 80000, "Software Engineer", "Active"));
        employees.add(new Employee(30, "Janani S", "HR", 72000, "HR", "Active"));
        employees.add(new Employee(31, "Kiran A", "Engineering", 76000, "Frontend Developer", "Active"));
        employees.add(new Employee(32, "Ramya P", "Finance", 70000, "Accountant", "Active"));
        employees.add(new Employee(33, "Sathish T", "Engineering", 83000, "Backend Developer", "Active"));
        employees.add(new Employee(34, "Bhavani L", "Design", 75000, "UI Designer", "Active"));
        employees.add(new Employee(35, "Naveen S", "Engineering", 79000, "QA Engineer", "Active"));
        employees.add(new Employee(36, "Sindhu R", "HR", 71000, "HR", "Active"));
        employees.add(new Employee(37, "Vimal K", "Engineering", 82000, "Full Stack Developer", "Active"));
        employees.add(new Employee(38, "Keerthi N", "Finance", 69000, "Finance Analyst", "Active"));
        employees.add(new Employee(39, "Abhishek M", "Engineering", 77000, "Developer", "Active"));
        employees.add(new Employee(40, "Shruthi D", "Design", 74000, "UX Designer", "Active"));
        employees.add(new Employee(41, "Rajesh B", "Engineering", 80000, "Software Engineer", "Active"));
        employees.add(new Employee(42, "Monika V", "HR", 72000, "HR", "Active"));
        employees.add(new Employee(43, "Yogesh C", "Engineering", 76000, "Frontend Developer", "Active"));
        employees.add(new Employee(44, "Preethi S", "Finance", 70000, "Accountant", "Active"));
        employees.add(new Employee(45, "Aravind G", "Engineering", 83000, "Backend Developer", "Active"));
        employees.add(new Employee(46, "Revathi T", "Design", 75000, "UI Designer", "Active"));
        employees.add(new Employee(47, "Kishore S", "Engineering", 79000, "QA Engineer", "Active"));
        employees.add(new Employee(48, "Sangeetha R", "HR", 71000, "HR", "Active"));
        employees.add(new Employee(49, "Prakash M", "Engineering", 82000, "Full Stack Developer", "Active"));
        employees.add(new Employee(50, "Vaishnavi N", "Finance", 69000, "Finance Analyst", "Active"));
        employees.add(new Employee(51, "Murali V", "Engineering", 77000, "Developer", "Active"));
        employees.add(new Employee(52, "Anitha D", "Design", 74000, "UX Designer", "Active"));
        employees.add(new Employee(53, "Siddharth R", "Engineering", 80000, "Software Engineer", "Active"));
        employees.add(new Employee(54, "Rithika S", "HR", 72000, "HR", "Active"));
        employees.add(new Employee(55, "Vivek A", "Engineering", 76000, "Frontend Developer", "Active"));
        employees.add(new Employee(56, "Haritha P", "Finance", 70000, "Accountant", "Active"));
        employees.add(new Employee(57, "Ganesh T", "Engineering", 83000, "Backend Developer", "Active"));
        employees.add(new Employee(58, "Dhivya L", "Design", 75000, "UI Designer", "Active"));
        employees.add(new Employee(59, "Surya S", "Engineering", 79000, "QA Engineer", "Active"));
        employees.add(new Employee(60, "Nandhini R", "HR", 71000, "HR", "Active"));
        employees.add(new Employee(61, "Kavin M", "Engineering", 82000, "Full Stack Developer", "Active"));
        employees.add(new Employee(62, "Ishwarya N", "Finance", 69000, "Finance Analyst", "Active"));

        // Clients
        clients.add(new Client("ClientX", "TechCorp", "9876543210", "clientx@techcorp.com"));
        clients.add(new Client("ClientY", "DesignHub", "9123456789", "clienty@designhub.com"));
        clients.add(new Client("ClientZ", "FinServe", "9988776655", "clientz@finserve.com"));

        // Projects
        projects.add(new Project("Website Revamp", "ClientX", "01/10/2025", "30/11/2025", "Ongoing"));
        projects.add(new Project("Mobile App Launch", "ClientY", "15/09/2025", "15/12/2025", "Planning"));
        projects.add(new Project("Accounting Automation", "ClientZ", "01/08/2025", "30/10/2025", "Completed"));

        // Finance Records
        finances.add(new Finance("Salary", 85000, "October salary for Vinayagam", "01/10/2025"));
        finances.add(new Finance("Salary", 75000, "October salary for Deepa", "01/10/2025"));
        finances.add(new Finance("Project Payment", 120000, "ClientX payment for Website Revamp", "05/10/2025"));

        // Policies
        policies.add(new Policy("Leave Policy", "Employees can take 12 paid leaves per year."));
        policies.add(new Policy("Remote Work Policy", "Remote work allowed up to 3 days per week."));
        policies.add(new Policy("Code of Conduct", "All employees must follow professional behavior and ethics."));
    }
}
