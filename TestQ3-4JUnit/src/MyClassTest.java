import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import MainPackage.MyClass;


public class MyClassTest {

	@Test
	public void test() {
		//testing ReturnTrue method
		assertTrue("The method ReturnTrue does not return true", MyClass.ReturnTrue());
	}
	@Test
	public void test2(){
		int num1= 5;
		int num2= 7;
		int num3= 12;
		//testing AddTwoNumbers method
		assertEquals("num3 does not equal num1 plus num2", MyClass.AddTwoNumbers(num1, num2), num3);
		
	}
}
