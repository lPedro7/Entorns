package practica5;

/**
 * @author Xavi Torrens
 */
public class LogArrayStudentDAO extends ArrayListStudentDAO {

    public void addStudent(Student s){
        super.addStudent(s);

        System.out.println(s.toString());
    }
}
