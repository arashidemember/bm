package cn.com.week3.test1114;

class Useful{
	public void f() {
		
	}
	public void g() {
		
	}
}
class MoreUseful extends Useful{
	public void f() {
		
	}
	public void g() {
		
	}
	public void u() {
			
		}
	public void v() {
		
	}
	public void w() {
			
	}
	
}
	public class RTTI{
		public static void main(String[] args) {
			Useful[] x= {
				new Useful(),
				new MoreUseful()
			};
			x[0].f();
			x[1].g();
			
			System.out.println(x[0].getClass());
			System.out.println(x[1].getClass());
			
			((MoreUseful)x[1]).u();
			
		}
		
	}
















