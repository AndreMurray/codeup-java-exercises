class Student {
    public String name;
    public String cohort;
    public Student(String studentName) {
        name = studentName;
        cohort = "Unassigned";
    }
    public Student(String studentName, String assignedCohort) {
        name = studentName;
        cohort = assignedCohort;
    }

    public static void main(String[] args) {
        Student jane = new Student("Jane Doe", "Zion");
        System.out.print(jane.name + " - ");
        System.out.println(jane.cohort);
// prints "Jane Doe - Zion"
        Student john = new Student("John Doe");
        System.out.print(john.name + " - ");
        System.out.println(john.cohort);
// prints "John Doe - Unassigned"

    }
}


