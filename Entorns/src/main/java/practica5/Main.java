package practica5;

/**
 * @author Xavi Torrens
 */
public class Main {

    public static void main(String[] args) {

        StudentDAO dao = new LogArrayStudentDAO();


        dao.addStudent(new Student());
        dao.addStudent(new Student());




    }
}
