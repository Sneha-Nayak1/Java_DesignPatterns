package visitor_DP;

import java.util.ArrayList;
import java.util.List;

public class Directory2 implements Element{
	
	String filename;
	List<Element> list;
	
	public Directory2(String filename) {
		this.filename=filename;
		this.list=new ArrayList<>();
	}
	
	public String getFilename() {
		return filename;
	}
	
	public List<Element> getList()
	{
		return list;
	}
	
	public void addElement(Element e) {
		list.add(e);
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
