package net.comments.sample;

/**
 * The interface declares a behaviour of a room.
 *
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public interface Room {

    /**
     * Allows a person to enter the room.
     *
     * @param person a rerson
     */
    void accept(Person person);
}
