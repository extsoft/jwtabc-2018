package net.comments.ft;

import net.comments.objects.BCommentPage;
import net.comments.objects.CommentPage;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public class TestPresentComment extends BaseDriver {
    private final CommentPage commentPage;

    public TestPresentComment() {
        super();
        this.commentPage = new BCommentPage(this.driver);
    }

    @Test
    public void testIfCommentIsPresentById() {
        commentPage.open();
        MatcherAssert.assertThat(
                "Comment Text 0 is present",
                commentPage.currentComments().hasCommentWithId(0)
        );
    }

    @Test
    public void testIfCommentIsNotPresentById() {
        commentPage.open();
        MatcherAssert.assertThat(
                "Comment Text 100 isn't present",
                !commentPage.currentComments().hasCommentWithId(100)
        );
    }

    @Test
    public void testIfCommentIsPresentByName() {
        commentPage.open();
        MatcherAssert.assertThat(
                "Comment Text 0 isn't present",
                commentPage.currentComments().hasCommentWithName("Comment Text 0")
        );
    }
}
