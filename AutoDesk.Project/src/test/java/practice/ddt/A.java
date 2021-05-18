package practice.ddt;

import java.util.Date;

import org.testng.annotations.Test;

public class A {
	@Test
public void main() {
	String currentDate=new Date().toString().replace(":", "_").replace(" ", "_");
	System.out.println(currentDate);
	
	}
}
