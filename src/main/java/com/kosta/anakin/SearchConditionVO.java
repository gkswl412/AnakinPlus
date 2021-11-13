package com.kosta.anakin;

public class SearchConditionVO {
	String sido;
	String gugun;
	String checkin;
	String checkout;
	String cat;
	
	public SearchConditionVO() {}
	
	public SearchConditionVO(String sido, String gugun, String checkin, String checkout, String cat) {
		super();
		this.sido = sido;
		this.gugun = gugun;
		this.checkin = checkin;
		this.checkout = checkout;
		this.cat = cat;
	}

	public String getSido() {
		return sido;
	}

	public void setSido(String sido) {
		this.sido = sido;
	}

	public String getGugun() {
		return gugun;
	}

	public void setGugun(String gugun) {
		this.gugun = gugun;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SearchConditionVO [sido=").append(sido).append(", gugun=").append(gugun).append(", checkin=")
				.append(checkin).append(", checkout=").append(checkout).append(", cat=").append(cat).append("]");
		return builder.toString();
	}
	
}
