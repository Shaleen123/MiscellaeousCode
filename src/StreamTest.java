import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {

        Student student1 = new Student(
                "Jayesh",
                20,
                new Address("1234"),
                Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

        Student student2 = new Student(
                "Khyati",
                20,
                new Address("1235"),
                Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

        Student student3 = new Student(
                "Jason",
                20,
                new Address("1236"),
                Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

        List<Student> students = Arrays.asList(student1, student2, student3);

        /*****************************************************
         Get student with exact match name "jayesh"
         *****************************************************/
        Optional name = students.stream().filter(stud -> stud.getName().equalsIgnoreCase("jayesh")).findFirst();
        // System.out.println(name);

        /*****************************************************
         Get student with matching address "1235"
         *****************************************************/
        Optional add = students.stream().filter(stud1 -> stud1.getAddress().getZipcode().equals("1235")).findAny();
        //  System.out.println(add);

        /*****************************************************
         Get all student having mobile numbers 3333.
         *****************************************************/
        Optional mobileNumber = students.stream().filter(stud -> stud.getMobileNumbers().stream().anyMatch(x -> x.getNumber().equalsIgnoreCase("4444") || (x.getNumber().equalsIgnoreCase("3333")))).findAny();
        System.out.println(mobileNumber);

        /*****************************************************
         Convert List<Student> to List<String> of student name
         *****************************************************/
        TempStudent tmpStud1 = new TempStudent(
                "Jayesh1",
                201,
                new Address("12341"),
                Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));

        TempStudent tmpStud2 = new TempStudent(
                "Khyati1",
                202,
                new Address("12351"),
                Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));

        List<TempStudent> tmpStudents = Arrays.asList(tmpStud1, tmpStud2);

        List<Student> studentList = tmpStudents.stream()
                .map(tmpStud -> new Student(tmpStud.name, tmpStud.age, tmpStud.address, tmpStud.mobileNumbers))
                .collect(Collectors.toList());


        List<String> studentsName = studentList.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(studentsName);

        // students.stream().filter(stud -> stud.getMobileNumbers().stream().filter(mobileNumber1 -> mobileNumber1.getNumber().equalsIgnoreCase(""))).findAny();

        //  students.stream().filter(student -> student1.getMobileNumbers().stream()
        //        .filter(mobileNumber1 -> mobileNumber1.getNumber().equalsIgnoreCase("1233")));
    }


}
