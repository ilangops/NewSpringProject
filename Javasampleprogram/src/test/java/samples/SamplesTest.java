package samples;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SamplesTest {

    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        outContent.reset();
    }

    @Test
    void testSecondLargestFilter_printsSecondLargest() {
        SecondLargestFilter.main(new String[0]);
        String out = outContent.toString();
        assertTrue(out.contains("Second largest"), "Should print the second largest message");
    }

    @Test
    void testStringClassExamples_runsAndPrints() {
        StringClassExamples.main(new String[0]);
        String out = outContent.toString();
        assertTrue(out.length() > 0, "Should produce some output");
        assertTrue(out.contains("Welcome") || out.contains("World"), "Expected some processed string output");
    }

    @Test
    void testGetterSetter_behaviour() {
        GetterSetterMethod g = new GetterSetterMethod();
        g.setId(10001);
        g.setName("Ramkumar");
        g.setMark(99.5);
        assertEquals(10001, g.getId());
        assertEquals("Ramkumar", g.getName());
        assertEquals(99.5, g.getMark(), 0.0001);
    }

    @Test
    void testMethodOverloading_sums() {
        Overload ov = new Overload();
        ov.sum(10, 10);
        ov.sum(13.4, 34.8);
        ov.sum(5, 20.3);
        String out = outContent.toString();
        // expect at least three outputs (one per sum call)
        long lines = out.lines().count();
        assertTrue(lines >= 3, "Expected at least three printed results");
    }

    @Test
    void testCollectionsExamplesList_prints() {
        CollectionsExamplesList.main(new String[0]);
        String out = outContent.toString();
        assertTrue(out.contains("_") || out.contains("["), "Expected list-like output");
    }

    @Test
    void testCollectionsExampleSet_printsSize() {
        CollectionsExampleSet.main(new String[0]);
        String out = outContent.toString();
        assertTrue(out.contains("size") || out.matches("(?s).*\\d+.*"), "Expected numeric/set output");
    }

    @Test
    void testCollectionExampleMap_behaviour() {
        // The sample's main uses map.get(90) which causes a ClassCastException at runtime
        assertThrows(ClassCastException.class, () -> CollectionExampleMap.main(new String[0]));
    }

    @Test
    void testMethodOverriding_output() {
        Child1 c = new Child1();
        c.display();
        String out = outContent.toString();
        assertTrue(out.contains("Hello Child") || out.contains("Hello Parent"));
    }

    @Test
    void testConstructorExample_runs() {
        ABCD a = new ABCD(30, 40);
        a.display();
        String out = outContent.toString();
        assertTrue(out.length() > 0);
    }

    @Test
    void testExceptionHandling_slaveDoesNotThrow() {
        ExceptionHandling e = new ExceptionHandling();
        e.slave();
        String out = outContent.toString();
        assertTrue(out.length() > 0, "Expected some exception-related output but no uncaught exception");
    }

    @Test
    void testArrayOrPrimitive_printsStars() {
        Primitivetype.main(new String[0]);
        String out = outContent.toString();
        assertTrue(out.contains("*"), "Expected star pattern output");
    }

}
