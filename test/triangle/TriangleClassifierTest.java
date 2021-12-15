package triangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("Test lần 1")
    void testTriangleClassifier1() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expect = "Tam giác đều";
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Test lần 2")
    void testTriangleClassifier2() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expect = "Tam giác cân";
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expect, result);
    }
    @Test
    @DisplayName("Test lần 3")
    void testTriangleClassifier3() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expect = "Tam giác thường";
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Test lần 4")
    void testTriangleClassifier4() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expect = "Không phải tam giác";
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Test lần 5")
    void testTriangleClassifier5() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expect = "Không phải tam giác";
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Test lần 6")
    void testTriangleClassifier6() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expect = "Không phải tam giác";
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expect, result);
    }

}