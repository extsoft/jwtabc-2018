package net.comments.ft;

import net.comments.selenium.CommentsDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public class BaseDriver {
    protected final CommentsDriver driver;

    protected BaseDriver() {
        this.driver = new CommentsDriver();
    }

    @BeforeMethod
    public void createDriver() {
        this.driver.define();
    }

    @AfterMethod
    public void closeDriver() {
        this.driver.close();
    }
}
