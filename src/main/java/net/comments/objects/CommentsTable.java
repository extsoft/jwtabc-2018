package net.comments.objects;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public interface CommentsTable {

    boolean hasCommentWithId(int id);

    boolean hasCommentWithName(String name);
}
