import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Maintest {

    public static void main(String[]  args)
    {
        List<Student> studentList=new ArrayList<>();
        Student obj1 = new Student(111,"Harry", 27);
        Student obj2 = new Student(112,"Soms", 23);
        Student obj3 = new Student(123,"Stephan", 37);
        Student obj4 = new Student(101,"Jon", 22);
        Student obj5 = new Student(134,"Elena", 29);
        Student obj6 = new Student(102,"Jon", 22);

        studentList.add(obj1);
        studentList.add(obj2);
        studentList.add(obj3);
        studentList.add(obj4);
        studentList.add(obj5);
        studentList.add(obj6);

        //Iterator<Student> it = studentList.iterator();

        Collections.sort(studentList,new StudentSorter().reversed());

        for( Student stud : studentList)
        {
            System.out.println(stud);
        }

    }

}
