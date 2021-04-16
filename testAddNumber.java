package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumber {

	@Test
	public void test() {
        jUnitTesting addNum = new jUnitTesting();
        int result = addNum.addNumbers(70, 36);
        assertEquals (106,result);
        result = addNum.addNumbers(240, 167);
        assertEquals (156, result);
    }

}
