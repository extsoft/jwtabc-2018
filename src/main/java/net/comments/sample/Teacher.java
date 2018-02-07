package net.comments.sample;

/**
 * The interface represents a teacher. The teacher can teach some staffs in addition to {@link Person}'s abilities.
 *
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public interface Teacher extends Person {

    /**
     * Allows to teach some materials.
     */
    void teach();
}
