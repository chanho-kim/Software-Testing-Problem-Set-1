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
		if()
		
	}
	
	/*
	* P4: It is transitive: for any non-null reference values x, y, and z,
	* if x.equals(y) returns true and y.equals(z) returns true, then
	* x.equals(z) should return true.
	*/
	// you do not need to write tests for P4
}