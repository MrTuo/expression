package experiment_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import java.util.ArrayList;
import experiment_1.Expressions;
import org.junit.Test;

public class ExpressionsTest {

	private static Expressions  test = new Expressions();
	
	String str1="1+x+ y+	2+2x+2*x-y+x^3";
	String str2="1+xhsdfjhaskfhdkashfkasdf+0-sd---";
	String str3="1/2";
	String str41="5^",str42="^",str43="5^x",str44="x^5x+2";
	String str5="1+x+y";
	
	String wrong="The expression is wrong!Stupid!";
	String newstr;
	ArrayList<String> fuhao;
	@Test
	public void testSetExpressions1() {
		fuhao=experiment_1.myfuhao(str1);
		newstr=experiment_1.change(str1, fuhao);
		assertEquals(true,test.checkExpressionByRE(newstr));
	}
	@Test
	public void testSetExpressions2() {
		fuhao=experiment_1.myfuhao(str2);
		newstr=experiment_1.change(str2, fuhao);
		assertEquals(false,test.checkExpressionByRE(newstr));
	}
	@Test
	public void testSetExpressions3() {
		fuhao=experiment_1.myfuhao(str3);
		newstr=experiment_1.change(str3, fuhao);
		assertEquals(false,test.checkExpressionByRE(newstr));
	}
	@Test
	public void testSetExpressions41() {
		fuhao=experiment_1.myfuhao(str41);
		newstr=experiment_1.change(str41, fuhao);
		assertEquals(false,test.checkExpressionByRE(newstr));
	}
	@Test
	public void testSetExpressions42() {
		fuhao=experiment_1.myfuhao(str42);
		newstr=experiment_1.change(str42, fuhao);
		assertEquals(false,test.checkExpressionByRE(newstr));
	}
	@Test
	public void testSetExpressions43() {
		fuhao=experiment_1.myfuhao(str43);
		newstr=experiment_1.change(str43, fuhao);
		assertEquals(false,test.checkExpressionByRE(newstr));
	}
	@Test
	public void testSetExpressions44() {
		fuhao=experiment_1.myfuhao(str44);
		newstr=experiment_1.change(str44, fuhao);
		assertEquals(true,test.checkExpressionByRE(newstr));
	}
	@Test
	public void testSetExpressions5() {
		fuhao=experiment_1.myfuhao(str5);
		newstr=experiment_1.change(str5, fuhao);
		assertEquals(true,test.checkExpressionByRE(newstr));
	}
	
}
