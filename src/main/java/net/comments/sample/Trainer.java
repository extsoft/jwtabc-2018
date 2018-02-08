package net.comments.sample;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public class Trainer implements Teacher {
    private final String name;

    public Trainer(String name) {
        this.name = name;
    }

    public void teach() {
        System.out.println(this.name + " is going to present material and give a couple of practical tasks.");
    }

    public String name() {
        return this.name;
    }
}
