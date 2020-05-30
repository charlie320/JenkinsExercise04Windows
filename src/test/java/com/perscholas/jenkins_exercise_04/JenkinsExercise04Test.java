package com.perscholas.jenkins_exercise_04;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class JenkinsExercise04Test 
{
    @Test
    public void sayHelloTrueTest()
    {
        String expected = JenkinsExercise04.sayHello();
        assertTrue(expected.equals("Hello Maven from JenkinsExercise04!!!"));
    }

    public void sayHelloFalseTest ()
    {
        String expected = JenkinsExercise04.sayHello();
        assertFalse(expected.equals("Goodbye Maven from JenkinsExercise04!!!"));
    }
}
