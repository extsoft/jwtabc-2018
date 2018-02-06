package net.comments.sample;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public class App {
    public static void main(String[] args) {
        Student andrey = new AttentiveStudent("Andrey");
        Student nastya = new AttentiveStudent("Nastya");
        Student dima = new BadStudent("Dima");
        go(andrey);
        go(nastya);
        go(dima);
    }

    private static void go(Student someone) {
        System.out.println(String.format("There is %s in the room!", someone.name()));
        someone.learn();
    }
}
