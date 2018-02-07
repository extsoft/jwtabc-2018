package net.comments.sample;

/**
 * The object represents a student who is learning not very well.
 *
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public class BadStudent implements Student {
    private final String name;

    /**
     * Allows creating {@link BadStudent}'s object with a given name.
     *
     * @param name a name of the student
     */
    public BadStudent(String name) {
        this.name = name;
    }

    /**
     * Allows to sleep during a learning process.
     */
    public void learn() {
        System.out.println(this.name + " is sleeping.");
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
