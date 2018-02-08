package net.comments.sample;

/**
 * The main class to run the application (code).
 *
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public class App {
    public static void main(String[] args) {
        Teacher volodya = new Trainer("Volodya");
        Student andrey = new AttentiveStudent("Andrey");
        Student nastya = new AttentiveStudent("Nastya");
        Student dima = new BadStudent("Dima");
        introduce(andrey, volodya, nastya, dima);
        startLesson(volodya, andrey, nastya, dima);
    }

    private static void introduce(Person p1, Person p2, Person p3, Person p4) {
        printName(p1);
        printName(p2);
        printName(p3);
        printName(p4);
    }

    private static void printName(Person person) {
        System.out.println(String.format("There is %s in the room!", person.name()));
    }

    private static void startLesson(Teacher teacher, Student s1, Student s2, Student s3) {
        teacher.teach();
        s1.learn();
        s2.learn();
        s3.learn();
    }
}
