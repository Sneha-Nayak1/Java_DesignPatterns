package visitor_DP;

public class File2 implements Element{
	String filename;
	int size;
	File2(String filename, int size){
		this.filename=filename;
		this.size=size;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getFilename() {
		return filename;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
}
