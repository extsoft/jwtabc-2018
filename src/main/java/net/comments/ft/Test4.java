package net.comments.ft;

import net.comments.objects.BCommentPage;
import net.comments.objects.CommentPage;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public class Test4 extends BaseDriver {
    private final CommentPage commentPage;

    public Test4() {
        super();
        this.commentPage = new BCommentPage(this.driver);
    }

    @Test
    public void test() {
        commentPage.open();
        this.driver.findElements(By.name("SelectedId")).get(0).click();
        this.driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
        this.driver.findElement(By.xpath("//span[text()=\"Yes\"]")).click();
        final String page = this.driver.getPageSource();
        MatcherAssert.assertThat("Comment Text 0 is present", !page.contains("Comment Text 0"));
    }
}
