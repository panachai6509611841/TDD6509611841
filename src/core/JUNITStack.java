	package core;
	
	import junit.framework.TestCase;
	
	public class JUNITStack extends TestCase {
	
		public void testCreateNewEmptyStack()
		{
			Stack s1 = new Stack();
			
			assertEquals(3, s1.getSize());
			assertEquals(true,s1.isEmpty());
		}
		
		public void PushEleToTop()
		{
			
			Stack s2= new Stack();
			s2.push(1);
			int one = 1;
			assertEquals(false,s2.isEmpty());
			assertEquals(one,s2.top());
		}

		
		public void LastInFirstOut()
		{
			Stack s3= new Stack();
			s3.push(1);
			s3.push(2);
			s3.push(3);
			assertEquals(3, s3.pop());
			assertEquals(2, s3.pop());
			assertEquals(1, s3.pop());
	
	
		}
		
		public void PushElmToLimitedSizeStack()
		{
			Stack s4= new Stack();
			s4.push(1);
			s4.push(2);
			s4.push(3);
			s4.push(4);
			assertEquals(3, s4.pop());
			assertEquals(2, s4.pop());
			assertEquals(1, s4.pop());
			
		}
		
		
	}
	
	