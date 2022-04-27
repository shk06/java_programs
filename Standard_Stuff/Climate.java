import java.util.ArrayList;

public class Climate {
	private String location;
	private String biome;
	private boolean generalFeeling;

	public Climate(String loc, String bi, boolean gf) {
		location = loc;
		bi = biome;
		generalFeeling = gf;
	}

	public Climate() {
		location = "";
		biome = "";
		generalFeeling = true;
	}
}
