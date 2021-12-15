package absolutenumber;

import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberTest {


    @Test
    void testfFndAbsoluteNumber0() {
        int number = 0;
        int expect = 0;

        int result = AbsoluteNumber.findAbsoluteNumber(number);
        assertEquals(expect,result);
    }

    @Test
    void testfFndAbsoluteNumber1() {
        int number = 1;
        int expect = 1;

        int result = AbsoluteNumber.findAbsoluteNumber(number);
        assertEquals(expect,result);
    }

    @Test
    void testfFndAbsoluteNumber2() {
        int number = -1;
        int expect = 1;

        int result = AbsoluteNumber.findAbsoluteNumber(number);
        assertEquals(expect,result);
    }

}