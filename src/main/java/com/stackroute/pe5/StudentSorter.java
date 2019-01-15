package com.stackroute.pe5;

import com.stackroute.pe5.Student;
import java.util.Comparator;

public class StudentSorter implements Comparator {

    public int compare(Object o1,Object o2) {

        Student student1=(Student)o1;
        Student student2=(Student)o2;

        //comparing on the basis of age
        if(student1.getAge()==student2.getAge())
        {
            if(student1.getId()>student2.getId())
                return 1;
            else
                return -1;
        }
        else if(student1.getAge()<student2.getAge())
            return 1;
        else
            return -1;
    }
}