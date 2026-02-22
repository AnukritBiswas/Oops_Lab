package Day_6;

class University {

    private String universityName;
    private String location;

    University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }

    class Department {
        private String deptName;
        private String hodName;

        Department(String deptName, String hodName) {
            this.deptName = deptName;
            this.hodName = hodName;
        }

        void display() {
            System.out.println("University Name: " + universityName);
            System.out.println("Location: " + location);
            System.out.println("Department Name: " + deptName);
            System.out.println("HOD Name: " + hodName);
        }
    }

    void createDepartment(String deptName, String hodName) {
        Department dept = new Department(deptName, hodName);
        dept.display();
    }

    public static void main(String[] args) {
        University uni = new University("ABC University", "Delhi");
        uni.createDepartment("Computer Science", "Dr. Sharma");
    }
}
