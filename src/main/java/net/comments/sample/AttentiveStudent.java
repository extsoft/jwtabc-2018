package net.comments.sample;

/**
 * The object represents a student who is learning very well.
 *
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public class AttentiveStudent implements Student {
    private final String name;

    /**
     * Allows creating {@link AttentiveStudent}'s object with a given name.
     *
     * @param name a name of the student
     */
    public AttentiveStudent(String name) {
        this.name = name;
    }

    /**
     * Allows to listen during a learning process.
     */
    public void learn() {
        System.out.println(this.name + " is listening...");
    }

    /**
     * Give a name of the student.
     *
     * @return a name
     */
    public String name() {
        return this.name;
    }
}
