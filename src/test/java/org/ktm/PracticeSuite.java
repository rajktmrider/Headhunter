package org.ktm;

import org.testng.annotations.Test;

public class PracticeSuite {
		@Test (groups="smoke")
		public void test11() {
			System.out.println("test11");
		}
		@Test(groups="regression")
		public void test22() {
			System.out.println("test22");
		}
		@Test(groups="sanity")
		public void test33() {
			System.out.println("test33");
		}
	    @Test(groups="regression")
	    public void test44() {
		System.out.println("test44");
	}
	}




