package cn.com.week7.test1215.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Controls {
	
	List<Control> controls;

	public Controls(List<Control> controls) {
		super();
		this.controls = controls;
	}

	public Controls() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return controls + "]";
	}

	public List<Control> getControls() {
		return controls;
	}

	public void setControls(List<Control> controls) {
		this.controls = controls;
	}

	public String marshal(Map map) {
		StringBuilder sb = new StringBuilder();
		
		Map headerMap = (Map) map.get(controls.get(0).getId());
		sb.append(controls.get(0).marshal(headerMap));
		
		List<Map> bodys = (List<Map>) map.get(controls.get(1).getId());
		for (Map map2 : bodys) {
			sb.append(controls.get(1).marshal(map2));
		}
		
		Map tailMap = (Map) map.get(controls.get(2).getId());
		sb.append(controls.get(2).marshal(tailMap));
		return sb.toString();
		
	}
	
	
	
	/*public String marshal(Map map) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(header.marshal((Map) map.get(header.getId())));
		
		for (Map map2 : bodys) {
			sb.append(body.marshal(map2));
		}
		
		sb.append(tail.marshal((Map) map.get(tail.getId())));
		
		return  sb.toString();
	}*/

	
	
	
}
