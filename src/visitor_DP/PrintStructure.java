package visitor_DP;

public class PrintStructure implements Visitor{

	@Override
	public void visit(File2 f) {
		System.out.println("File name is: "+f.getFilename());
	}

	@Override
	public void visit(Directory2 d) {
		System.out.println("Director name is: "+d.getFilename());
		for(Element e:d.getList()) {
			e.accept(this);
			
		}

		
	}

}
