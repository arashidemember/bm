package cn.com.week3.test1115;

public class FilterAdapter implements IProcessor {
	Filter filter;
	
	public FilterAdapter(Filter filter) {
		super();
		this.filter = filter;
	}
	public String name() {
		return filter.name();
	}
	public Object process(Object input) {
		return filter.process((Waveform) input);
	}

}
