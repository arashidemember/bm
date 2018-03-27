package cn.com.week3.test1117;
class A{
	interface B{
		void f();
	}
	public class BImp implements B{
		public void f() {
			
		}
	}
	private class BImp2 implements B{
		public void f() {}
	}
	public interface C{
		void f();
	}
	class CImp implements C{
		public void f() {
		}
	}
	private class CImp2 implements C{
		public void f() {
		}
		
	}
	private interface D {
		void f();
	}
	private class DImp implements D{
		public void f() {
			
		}
	}
	private class DImp2 implements D{
		public void f() {
			
		}
	}
	public D getD() {
		return new DImp2();
	}
	private D dRef;
	public void receiveD(D d) {
		dRef = d;
		dRef.f();
	}
	interface E{
		interface G{
			void f();
		}
		public interface H{
			void f();
		}
		void g();
	}
}	
	public class NestingInterfaces {
		public class BImp implements A.B{
			public void f() {
				
			}
		}
	}


















