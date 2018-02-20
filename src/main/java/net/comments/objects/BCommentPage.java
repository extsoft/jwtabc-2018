package net.comments.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public class BCommentPage implements CommentPage {
    private final WebDriver driver;

    public BCommentPage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void open() {
        this.driver.get("http://commentssprintone.azurewebsites.net");
    }

    public void newComment() {
        this.driver.findElement(By.xpath("//*[@id=\"newbutton\"]")).click();
    }

    public CommentActions commentsActions() {
        return new BCommentActions();
    }

    public CommentsTable currentComments() {
        return new BCommentsTable();
    }

    public CommentsTable commentsFrom(int page) {
        throw new UnsupportedOperationException("Please implement");
    }

    public int commentsPagesSize() {
        throw new UnsupportedOperationException("Please implement");
    }
}
