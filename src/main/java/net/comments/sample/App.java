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
        Room c123 = new TrainingRoom("c123");
        c123.accept(andrey);
        c123.accept(dima);
        c123.accept(nastya);
        c123.accept(volodya);
        introduce(andrey, volodya, nastya, dima);
        startLesson(volodya, andrey, nastya, dima);
    }

    private static void introduce(Person... persons) {
        for (Person person : persons) {
            System.out.println(String.format("Hello there! My name is %s.", person.name()));
        }
    }

    private static void startLesson(Teacher teacher, Student... students) {
        teacher.teach();
        for (Student student : students) {
            student.learn();
        }
    }
}
