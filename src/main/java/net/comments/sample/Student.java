package net.comments.sample;

/**
 * The interface represents a student. The student can learn some staffs in addition to {@link Person}'s abilities.
 *
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public interface Student extends Person {

    /**
     * Allows to learn some materials.
     */
    void learn();
}
