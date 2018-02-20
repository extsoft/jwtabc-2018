package net.comments.objects;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public interface CommentPage {

    void open();

    void newComment();

    CommentActions commentsActions();

    CommentsTable currentComments();

    CommentsTable commentsFrom(int page);

    int commentsPagesSize();
}
