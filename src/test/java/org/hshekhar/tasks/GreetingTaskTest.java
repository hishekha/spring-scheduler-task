package org.hshekhar.tasks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by 609080540 on 15/09/2016.
 */
public class GreetingTaskTest {

    private GreetingTask greetingTask;

    @Before
    public void setUp() {
        greetingTask = new GreetingTask();
    }

    @Test
    public void testThatGreetReturnsTrue() {
        Assert.assertTrue("Greeting should return true.", greetingTask.greet());
    }
}
