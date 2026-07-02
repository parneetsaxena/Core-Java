package foundations.problems;
 interface authorization{
    public String getPermissions();
}
public class EmployeeRole {
    enum Role implements authorization{
        ADMIN{
            @Override
            public String getPermissions() {
                permissions = "Read, Write, Delete, Manage Users";
                return permissions;
            }
        },
        MANAGER{
            @Override
            public String getPermissions() {
                permissions = "Read, Write, Approve";
                return permissions;
            }
        },
        DEVELOPER{
            @Override
            public String getPermissions() {
                permissions = "Read, Write";
                return permissions;
            }
        },
        INTERN{
            @Override
            public String getPermissions() {
                permissions = "Read";
                return permissions;
            }
        };
        String permissions;



    }

    public static void main(String[] args) {
        Role r = Role.INTERN;
        System.out.println("Role: "+r);
        System.out.println("Permissions: "+r.getPermissions());
    }
}
