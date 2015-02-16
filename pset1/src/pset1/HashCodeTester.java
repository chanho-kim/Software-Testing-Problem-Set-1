package pset1;
import static org.junit.Assert.*;
import org.junit.Test;
public class HashCodeTester {
/*
* P5: If two objects are equal according to the equals(Object)
* method, then calling the hashCode method on each of
* the two objects must produce the same integer result.
*/
// your test methods go here
	
	@Test public void t0(){
		C c1 = new C(0);
		C c2 = new C(0);
		assertTrue(c1.equals(c2) == (c1.hashCode() == c2.hashCode()));
	}

	@Test public void t1(){
		C c = new C(0);
		D d = new D(0,0);
		assertTrue(c.equals(d) == (c.hashCode() == d.hashCode()));
	}
	
	@Test public void t2(){
		C c = new C(0);
		Object o = new C(0);
		assertTrue(c.equals(o) == (c.hashCode() == o.hashCode()));
	}
	
	@Test public void t3(){
		D d = new D(0,0);
		C c = new C(0);
		assertTrue(d.equals(c) == (d.hashCode() == c.hashCode()));
	}
	
	@Test public void t4(){
		D d1 = new D(0,0);
		D d2 = new D(0,0);
		assertTrue(d1.equals(d2) == (d1.hashCode() == d2.hashCode()));
	}
	
	@Test public void t5(){
		D d = new D(0,0);
		Object o = new Object();
		assertTrue(d.equals(o) == (d.hashCode() == o.hashCode()));
	}
	
	@Test public void t6(){
		Object o = new Object();
		C c = new C(0);
		assertTrue(o.equals(c) == (o.hashCode() == c.hashCode()));
	}
	
	@Test public void t7(){
		Object o = new Object();
		D d = new D(0,0);
		assertTrue(o.equals(d) == (o.hashCode() == d.hashCode()));
	}
	
	@Test public void t8(){
		Object o1 = new Object();
		Object o2 = new Object();
		assertTrue(o1.equals(o2) == (o1.hashCode() == o2.hashCode()));
	}
}
