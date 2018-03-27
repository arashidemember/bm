package cn.com.week8.test1220;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
	Toy(){
		
	}
	Toy(int i){
		
	}
}


public class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
	FancyToy(){
		super(1);
	}
}


