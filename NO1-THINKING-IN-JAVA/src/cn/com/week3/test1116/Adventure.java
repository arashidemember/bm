package cn.com.week3.test1116;

interface CanFight{
	void fight();
}
interface CanSwim{
	void swim();
}
interface CanFly{
	void fly();
}
abstract class ActionCharacter{
	
	public abstract void fight();
	
	public void exec() {
		System.out.println("...");
	}
	
}
class Hero extends ActionCharacter implements CanFight,CanSwim, CanFly{

	public void fly() {
	}

	public void swim() {
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Adventure {
	public static void t(CanFight x) {
		x.fight();
	}
	public static void u(CanSwim x) {
		x.swim();
	}
	public static void v(CanFly x) {
		x.fly();
	}
	public static void w(ActionCharacter x) {
		x.fight();
	}
	public static void main(String[] args) {
		Hero h = new Hero();
		CanFly c = new Hero();
	}
}
