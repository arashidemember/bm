package cn.com.week2.test1108;

class Instrument{
	public void play(Note n) {
		System.out.println("Instrument.play()");
	}
}
public class Music {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		Wind wind = new Wind();
		tune(wind);
	}
}
