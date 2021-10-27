package by.jonline.module04.composition.task02;

public class Wheel {
	private String side;
	private String psd;
	private int diametr;
	private String profile;

	public Wheel() {
		side = "spare";
	}

	public Wheel(String side, String psd, int diametr, String profile) {
		this.side = side;
		this.psd = psd;
		this.diametr = diametr;
		this.profile = profile;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String getPsd() {
		return psd;
	}

	public void setPsd(String psd) {
		this.psd = psd;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[side=" + side + ", psd=" + psd + ", diametr=" + diametr
				+ ", profile=" + profile + "]";
	}
}
