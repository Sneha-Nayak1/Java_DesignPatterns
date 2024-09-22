package composite_DP;

public class File implements FileSystemComponent{
	String name;
	String size;
	public File(String name,String size) {
		this.name=name;
		this.size=size;
	}

	@Override
	public void display() {
		System.out.println("File name is: "+name+" and size is: "+size);
		
	}

}
