package cn.com.week3.test1113;
class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}
	Glyph(){
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph{
	private Object obj;
	private int radius;
	RoundGlyph (int r){
		
		radius = r;
		System.out.println("RoundGlyph().radius = "+ radius);
		radius = 1;
	}
	@Override
	void draw() {
		System.out.println("RoundGlyph.draw(),radius = "+ radius);
	}
}
public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}
