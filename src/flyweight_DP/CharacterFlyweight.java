package flyweight_DP;

public class CharacterFlyweight implements CharacterInt{

	private char character;
	
	public CharacterFlyweight(char character) {
		this.character = character;
	}
	

	@Override
	public void render(String font, String color) {
		System.out.println("The font is "+font+" and color is "+color);
		
	}

}
