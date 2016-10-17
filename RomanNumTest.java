package proj;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

public class RomanNumTest {

    String[] arg;

    @Before
    public void setUp() throws Exception {
        arg = new String[2];
        arg[0] = "test.txt";
        // arg[1] = "5D KS KC QH JC";
    }

    @Test
    public void test() throws FileNotFoundException {
        RomanNum romNum = new RomanNum();
        assertNotNull(romNum);
        romNum.main(arg);
    }
}
