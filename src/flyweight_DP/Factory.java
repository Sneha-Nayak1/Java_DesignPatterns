package flyweight_DP;

import java.util.HashMap;
import java.util.Map;

public class Factory {
	 Map<Character, CharacterFlyweight> map = new HashMap<>();

    public CharacterFlyweight getChar(char ch) {
        CharacterFlyweight flyweight = map.get(ch);
        if (flyweight == null) {
            flyweight = new CharacterFlyweight(ch);
            System.out.println(flyweight);
            map.put(ch, flyweight);
        }
        return flyweight;
    }
	

}


