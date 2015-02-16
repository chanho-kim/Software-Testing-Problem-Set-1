package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class EqualsTester {
	/*
	* P1: For any non-null reference value x, x.equals(null) should return false.
	*/
	@Test public void t0() {
		assertFalse(new Object().equals(null));
	}
	
	@Test public void t1() {
		assertFalse(new C(0).equals(null));
	}
	
	@Test public void t2() {
		assertFalse(new D(0,0).equals(null));
	}

	/*
	* P2: It is reflexive: for any non-null reference value x, x.equals(x)
	* should return true.
	*/
	
	// your test methods for P2 go here
	
	@Test public void t3() {
		Object o = new Object();		
		assertTrue(o.equals(o));
	}
		
	@Test public void t4() {
		C c = new C(0);
		assertTrue(c.equals(c));
	}
	
	@Test public void t5() {
		D d = new D(0,0);
		assertTrue(d.equals(d));
	}
		
	/*
	* P3: It is symmetric: for any non-null reference values x and y, x.equals(y)
	* should return true if and only if y.equals(x) returns true.
	*/
	
	@Test public void t6() {
		C c1 = new C(0);
		C c2 = new C(0);
		assertTrue(c1.equals(c2) == c2.equals(c1));		
	}
	
	@Test public void t7() {
		C c = new C(0);
		D d = new D(0,0);
		assertTrue(c.equals(d) == d.equals(c));		
	}	

	@Test public void t8() {
		C c = new C(0);
		Object o = new Object();
		assertTrue(c.equals(o) == o.equals(c));		
	}
	
	@Test public void t9() {
		D d = new D(0,0);
		C c = new C(0);
		assertTrue(d.equals(c) == c.equals(d));		
	}
	
	@Test public void t10() {
		D d1 = new D(0,0);
		D d2 = new D(0,0);
		assertTrue(d1.equals(d2) == d2.equals(d1));		
	}
	
	@Test public void t11() {
		D d = new D(0,0);
		Object o = new D(0,0);
		assertTrue(d.equals(o) == o.equals(d));		
	}

	@Test public void t12() {
		Object o = new Object();
		C c = new C(0);
		assertTrue(o.equals(c) == c.equals(o));
	}
	
	@Test public void t13() {
		Object o = new Object();
		D d = new D(0,0);
		assertTrue(o.equals(d) == d.equals(o));		
	}
	
	@Test public void t14() {
		Object o1 = new Object();
		Object o2 = new Object();
		assertTrue(o1.equals(o2) == o2.equals(o1));				
	}
	
	/*
	* P4: It is transitive: for any non-null reference values x, y, and z,
	* if x.equals(y) returns true and y.equals(z) returns true, then
	* x.equals(z) should return true.
	*/
	// you do not need to write tests for P4
}