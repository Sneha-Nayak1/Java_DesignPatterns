package visitor_DP;

public class FindFile implements Visitor{
	
	String fileName;
	File2 file;
	
	FindFile(String fileName){
		this.fileName=fileName;
	}
	
	public File2 foundFile() {
		return file;
	}
	@Override
	public void visit(File2 f) {
		if(f.getFilename().equals(fileName)) {
			file=f;
		}
	}

	@Override
	public void visit(Directory2 d) {
		for(Element e: d.getList()) {
			e.accept(this);
		}
	}

}
