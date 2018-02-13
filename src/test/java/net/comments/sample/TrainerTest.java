package net.comments.sample;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public class TrainerTest {

    @Test
    public void checkName() {
        MatcherAssert.assertThat(new Trainer("ffff").name(), Matchers.is("ffff"));
        /* The line above is equivalent to the following code:
        Trainer trainer = new Trainer("ffff");
        String name = trainer.name();
        MatcherAssert.assertThat(name, Matchers.is("ffff"));
        */
    }
}