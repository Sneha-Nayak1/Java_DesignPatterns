package buildet_DP;

public class Computer {
	
	private String cpu;
	private int ram;
	private int storage;
	private String graphics_card;
	private String os;
	
	
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + ", graphics_card=" + graphics_card
				+ ", os=" + os + "]";
	}


	
	
	private Computer(Builder b) {
		super();
		this.cpu = b.cpu;
		this.ram = b.ram;
		this.storage = b.storage;
		this.graphics_card =b. graphics_card;
		this.os =b. os;
	}
	
//	public Computer(Builder builder) {
//		// TODO Auto-generated constructor stub
//	}

	public static class Builder{
		
		private String cpu;
		private int ram;
		private int storage;
		private String graphics_card;
		private String os;
		
		public Builder(String cpu,int ram) {
			this.cpu=cpu;
			this.ram=ram;
		}
//		
//		public Builder setCpu(String cpu) {
//			this.cpu = cpu;
//			return this;
//		}
//
//		public Builder setRam(int ram) {
//			this.ram = ram;
//			return this;
//		}

		public Builder setStorage(int storage) {
			this.storage = storage;
			return this;
		}

		public Builder setGraphics_card(String graphics_card) {
			this.graphics_card = graphics_card;
			return this;
		}

		public Builder setOs(String os) {
			this.os = os;
			return this;
		}
//		
		
		public Computer getComputer(){
//			Computer c= new Computer(this);
//			return c;
			return new Computer(this);
		}
		
	}
	
	
	
}
