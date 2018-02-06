package net.comments.sample;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public class BadStudent implements Student {
    private final String name;

    public BadStudent(String name) {
        this.name = name;
    }

    public void learn() {
        System.out.println(this.name + " is sleeping.");
    }

    public String name() {
        return this.name;
    }
}
