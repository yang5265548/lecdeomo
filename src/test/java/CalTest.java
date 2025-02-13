import junit.framework.TestCase;

public class CalTest extends TestCase {

    public void testAdd() {
        //测试用例1
        Cal cal = new Cal();
        double result = cal.add(1, 1);
        assertEquals(2.0, result);

    }

    public void testSub() {

        //测试用例2
        Cal cal = new Cal();
        double result = cal.sub(1, 1);
        assertEquals(0.0, result);
    }

    public void testMul() {
        //测试用例3
        Cal cal = new Cal();
        double result = cal.mul(1, 1);
        assertEquals(1.0, result);
    }

    public void testDiv() {
        //测试用例4
        Cal cal = new Cal();
        double result = cal.div(1, 1);
        assertEquals(1.0, result);

        try {
            cal.div(1, 0);
            fail("Exception was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("除数不能为0", e.getMessage());
        }

    }

    public void testGetResult() {
        //测试用例5
        Cal cal = new Cal();
        double result = cal.getResult();
        assertEquals(0.0, result);
    }
}