package net.comments.objects;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public interface CommentActions {

    void duplicate(String comment);

    void edit(String comment);

    void delete(String comment);
}
