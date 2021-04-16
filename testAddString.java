package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
        jUnitTesting addString = new jUnitTesting();
        String result = addString.addStrings("Software","Engineering");
        assertEquals("SoftwareEngineering",result);
        result = addString.addStrings("Bennett","University");
        assertEquals("BennettUniversity",result);
        result = addString.addStrings("Corona","Virus");
        assertEquals("covid19",result);
    }

}
