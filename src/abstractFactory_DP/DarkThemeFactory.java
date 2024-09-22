package abstractFactory_DP;

public class DarkThemeFactory implements GUIFactory{

	@Override
	public Button button() {
		// TODO Auto-generated method stub
		return new DarkButton();
	}

	@Override
	public TextField text() {
		// TODO Auto-generated method stub
		return new DarkTextField();
	}

}
