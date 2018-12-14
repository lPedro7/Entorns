package practica5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xavi Torrens
 */
public class ArrayListStudentDAO implements StudentDAO {

    private List list = new ArrayList();

    public Student getStudent(Student student) {
        return null;
    }

    public void removeStudent(Student student) {

    }

    public void addStudent(Student student) {
        list.add(student);
    }

    public void contractStudent(Student student) {

    }
}
