package org.ktm;

import org.testng.annotations.Test;

public class PracticeSuite1 {
	@Test (groups="sanity")
	public void test111() {
		System.out.println("test111");
	}
	@Test(groups="smoke")
	public void test222() {
		System.out.println("test222");
	}
	@Test(groups="regression")
	public void test333() {
		System.out.println("test333");
}
}
