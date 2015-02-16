package pset1;

	import static org.junit.Assert.*;
	import org.junit.Test;
	import pset1.SLList.Node;

	public class SLListRepOkTester {
		@Test public void t0() {
			SLList l = new SLList();
			assertTrue(l.repOk());
		}

		@Test public void t1() {
			SLList l = new SLList();
			Node n = new Node();
			l.header = n;
			assertTrue(l.repOk());
		}
		
		@Test public void t2() {
			SLList l = new SLList();
			Node n1 = new Node();
			Node n2 = new Node();
			l.header = n1;
			n1.next = n2;
			assertTrue(l.repOk());
		}

		@Test public void t3() {
			SLList l = new SLList();
			Node n1 = new Node();
			Node n2 = new Node();
			l.header = n1;
			n1.next = n2;
			n2.next = n1;
			assertFalse(l.repOk());
		}
	}