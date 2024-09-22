package visitor_DP;

public class CalculateTotalSize implements Visitor{
	int totalSize=0;
	public int getTotalSize() {
		return totalSize;
	}
	
	
	@Override
	public void visit(File2 f) {
		totalSize=totalSize+f.getSize();
	}

	@Override
	public void visit(Directory2 d) {
		for(Element e: d.getList()) {
			e.accept(this);
		}
	}

}
