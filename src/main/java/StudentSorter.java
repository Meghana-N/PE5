import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

public int compare( Student student1,Student student2)
{
   // Integer studentAge1=student1.getAge();
  //  Integer studentAge2=student2.getAge();
    int ageCompare = student1.getAge()-student2.getAge();
    int nameCompare = student1.getName().compareTo(student2.getName());

    int idCompare=student1.getId()-student2.getId();

    if( ageCompare != 0 )
    {
        return ageCompare;
    }
    else if( nameCompare != 0 )
    {
        return nameCompare;
    }
    else
        return idCompare;
}
}

