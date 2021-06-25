public class ImmutableStudent {
    private String id;
    private String name;
    private final Age age;


    public ImmutableStudent(String id, String name, Age age) {
        this.id = id;
        this.name = name;
        Age clonedAge = new Age();
        clonedAge.setDay(age.getDay());
        clonedAge.setMonth(age.getMonth());
        clonedAge.setYear(age.getYear());
        this.age = clonedAge;
    }

    public Age getAge() {
        Age cloneAge = new Age();
        cloneAge.setDay(this.age.getDay());
        cloneAge.setMonth(this.age.getMonth());
        cloneAge.setYear(this.age.getYear());
        return cloneAge;
    }

    public static void main(String[] args) {

        Age age = new Age();
        age.setDay(1);
        age.setMonth(07);
        age.setYear(2021);
        ImmutableStudent immutableStudent = new ImmutableStudent("1", "shaleen", age);

        System.out.println("Age of shaleen before modification" + ":" + immutableStudent.getAge().getYear());

        immutableStudent.getAge().setYear(1987);
        System.out.println("Age of shaleen after modification" + ":" + immutableStudent.getAge().getYear());
    }
}
