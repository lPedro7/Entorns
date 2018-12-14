package practica5;

/**
 * @author Xavi Torrens
 */
public interface StudentDAO {

    Student getStudent(Student student);

    void removeStudent(Student student);

    void addStudent(Student student);

    void contractStudent(Student student);

}
