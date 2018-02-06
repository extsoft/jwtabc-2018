package net.comments.sample;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public class AttentiveStudent implements Student {
    private final String name;

    public AttentiveStudent(String name){
        this.name = name;
    }

    public void learn() {
        System.out.println(this.name + " is listening...");
    }

    public String name() {
        return this.name;
    }
}
