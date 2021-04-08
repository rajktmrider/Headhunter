package org.ktm;

import org.testng.annotations.Test;

public class Priority {
	@Test (groups="smoke")
	public void test1() {
		System.out.println("test1");
		
	}
	@Test(groups="regression")
	public void test2() {
		System.out.println("test2");
	}
	@Test(groups="sanity")
	public void test3() {
		System.out.println("test3");
	}
    @Test(groups="smoke")
    public void test4() {
	System.out.println("test4");
}


}
