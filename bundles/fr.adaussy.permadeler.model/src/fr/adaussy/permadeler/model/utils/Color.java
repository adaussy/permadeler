package fr.adaussy.permadeler.model.utils;

public class Color {

	private static final int SHIFT = 8;

	private static final int MASK = (1 << SHIFT) - 1;

	private static final int RSHIFT = SHIFT * 2;

	private static final int GSHIFT = SHIFT * 1;

	private static final int BSHIFT = SHIFT * 0;

	private int red;

	private int blue;

	private int green;

	public Color(int red, int green, int blue) {
		this.red = red;
		this.blue = blue;
		this.green = green;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Color)) {
			return false;
		}
		return toHex() == ((Color)obj).toHex();
	}

	@Override
	public int hashCode() {
		return toHex();
	}

	public int toHex() {
		return ((red & MASK) << RSHIFT) //
				| ((green & MASK) << GSHIFT)//
				| ((blue & MASK) << BSHIFT);
	}

	public String encode() {
		return Integer.toString(toHex());
	}

	public static String encode(Color c) {
		return Integer.toString(c.toHex());
	}

	public static Color decode(String text) throws IllegalArgumentException {
		if (text == null || text.isEmpty()) {
			return null;
		}
		int i = Integer.decode(text).intValue();
		return new Color((i >> RSHIFT) & MASK, (i >> GSHIFT) & MASK, (i >> BSHIFT) & MASK);
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

}
