import math.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    void test1() {
        Assertions.assertEquals(5, A.radius(), "Formula nije tacna");
    }

    @Test
    void test2() {
        Assertions.assertEquals(2, A.distance(B.getX(), B.getY()));
    }

    static Point A, B;

    @BeforeAll
    static void init() {
        A = new Point(3,4);
        B = new Point(3,6);
    }

}