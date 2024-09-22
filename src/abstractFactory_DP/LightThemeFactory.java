package abstractFactory_DP;

public class LightThemeFactory implements GUIFactory{

	@Override
	public Button button() {
		// TODO Auto-generated method stub
		return new LightButton();
	}

	@Override
	public TextField text() {
		// TODO Auto-generated method stub
		return new LightTextField();
	}

}
