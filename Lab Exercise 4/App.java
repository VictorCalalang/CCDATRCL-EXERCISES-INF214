import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> SchoolEnrollment = new LinkedList<>();

        //Add elements
        SchoolEnrollment.add("Justine Nica Abella");
        SchoolEnrollment.add("Ronn Adia");
        SchoolEnrollment.add("Almocera Alliyah");
        SchoolEnrollment.add("Idel Lawrence Aranilla");
        SchoolEnrollment.add("Winna Jane Bablis");

        //Display Elements
        System.out.println(SchoolEnrollment);

        //Returns the number
        System.out.println(SchoolEnrollment.size());

        //Shows the element
        System.out.println(SchoolEnrollment.peek());

        //Removes the element on the front of the queue
        SchoolEnrollment.remove();
        SchoolEnrollment.remove();
        SchoolEnrollment.remove();
        SchoolEnrollment.remove();
        SchoolEnrollment.remove();
        
        SchoolEnrollment.add("Mopses Christian Bantegui");
        SchoolEnrollment.add("Jap Bolanos");
        SchoolEnrollment.add("Victor Calalang");
        SchoolEnrollment.add("Brandon Kenneth Cinco");
        SchoolEnrollment.add("Kean John Dapitillo");
        
        
        System.out.println(SchoolEnrollment.size());
        System.out.println(SchoolEnrollment.peek());
        System.out.println(SchoolEnrollment);
    }
}