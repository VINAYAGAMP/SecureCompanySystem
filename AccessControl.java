public class AccessControl {

    public static boolean isFounder(String email) {
        return DataStore.userRoles.getOrDefault(email, "Guest").equals("Founder");
    }

    public static boolean canView(String email, String module) {
        String access = DataStore.employeeAccess.getOrDefault(email, "NONE");
        return access.equals("ALL") || access.contains(module + "_VIEW");
    }

    public static boolean canEdit(String email, String module) {
        String access = DataStore.employeeAccess.getOrDefault(email, "NONE");
        return access.equals("ALL") || access.contains(module + "_MANAGE");
    }

    public static boolean canDelete(String email, String module) {
        String access = DataStore.employeeAccess.getOrDefault(email, "NONE");
        return access.equals("ALL") || access.contains(module + "_DELETE");
    }
}
