/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hw3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void firstTest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);        
        assertTrue(App.calc(arrayList, 12, 12, 12));
    }

    @Test
    void isEmptyArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        assertTrue(App.calc(arrayList, 1, 1, 1));
    }

}
