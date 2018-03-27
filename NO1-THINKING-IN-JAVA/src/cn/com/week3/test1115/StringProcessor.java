package cn.com.week3.test1115;

class IProcesserAdapter extends StringProcessor{

	IProcessor iProcessor;
	
	public IProcesserAdapter(IProcessor p) {
		this.iProcessor = p;
	}
	
	@Override
	public String process(Object input) {
		// TODO Auto-generated method stub
		return (String) iProcessor.process(input);
	}
	
}



public abstract class StringProcessor implements IProcessor{
	public String name() {
		return getClass().getSimpleName();
	}
	public abstract String process(Object input);
	public static String s = "If she weighs the same as a duck, she's made of wood";
	public static void main(String[] args) {
	
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(), s);
	}
}
