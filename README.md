# SecureCompanySystem

A modular Java-based company management system that simulates real-world IT workflows with layered architecture and role-based access control.

## Features
- Employee Management — Add, search, and list employees by department
- Client Management — Track client details and company associations
- Project Management — Manage project timelines, clients, and status
- Finance Management — Record transactions, salaries, and payments
- Policy Management — View and search company policies

## Role-Based Dashboards
- Founder — Full access to all modules
- HR — Access to employee and policy modules
- Employee — View own profile and company policies

## Sample Emails for Testing
Use these emails to simulate different roles:
- founder@company.com
- bob.smith@company.com (HR)
- alice.johnson@company.com (Employee)

## Technologies Used
- Java (Core + Collections)
- Eclipse IDE
- Git & GitHub

## Project Structure

SecureCompanySystem/
├── Main.java
├── DataStore.java
├── AccessControl.java
├── Employee.java
├── EmployeeModule.java
├── EmployeeDashboard.java
├── Client.java
├── ClientModule.java
├── Project.java
├── ProjectModule.java
├── Finance.java
├── FinanceModule.java
├── Policy.java
├── PolicyModule.java
├── FounderDashboard.java
├── HRDashboard.java
## How to Run

1. Clone the repository:
git clone https://github.com/VINAYAGAMP/SecureCompanySystem.git
2. Open the project in Eclipse or any Java IDE
3. Run `Main.java`
4. Enter one of the sample emails to access the dashboard
   
## Author

Vinayagam  
Aspiring systems architect and backend developer  
Focused on building scalable, realistic enterprise-grade Java applications

## Future Enhancements

- GUI integration using Swing or JavaFX
- Charting with JFreeChart
- File/database persistence
- Password-based login and authentication
- Admin panel for managing roles and access


