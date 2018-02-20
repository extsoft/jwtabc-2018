package net.comments;

import net.comments.objects.BCommentPage;
import net.comments.objects.CommentPage;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    private final WebDriver[] driver = new WebDriver[1];

    @Test
    public void test() {
        CommentPage commentPage = new BCommentPage(this.driver());
        commentPage.open();
        commentPage.newComment();
        this.driver().findElement(By.xpath("//*[@id=\"Text\"]")).clear();
        this.driver().findElement(By.xpath("//*[@id=\"Text\"]")).sendKeys("Newly created comment 987");
        this.driver().findElements(By.id("Categories")).get(0).click();
        this.driver().findElements(By.id("Categories")).get(4).click();
        this.driver().findElement(By.xpath("//*[@id=\"categoryselector\"]/div[2]/input[2]")).click();
        this.driver().findElement(By.xpath("//*[@id=\"editor-navigation\"]/input[2]")).click();
        this.driver().findElement(By.xpath("//*[@id=\"main\"]/div/div[5]/form/table/tfoot/tr/td/a[3]")).click();

        final String page = this.driver().getPageSource();
        MatcherAssert.assertThat("New comment is present", page.contains("Newly created comment 987"));
    }

    @BeforeMethod
    public void createDriver() {
        driver[0] = new FirefoxDriver();
    }

    @AfterMethod
    public void closeDriver() {
        driver[0].close();
    }

    private WebDriver driver() {
        return this.driver[0];
    }
}