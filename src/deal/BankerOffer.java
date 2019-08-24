package deal;

import java.util.List;

class BankerOffer {

	private int casesLeft;
	private List<IconButton> remainingCases;
	private double offerValue;
	private double multiplicator;

	BankerOffer(List<IconButton> remainingCases) {
		this.casesLeft = remainingCases.size();
		this.remainingCases = remainingCases;
		this.offerValue = 0;
		this.multiplicator = 0.25;
	}

	double calculateOffer() {

		double offer = 0;

		for (int i = 0; i < this.remainingCases.size(); i++) {
			offer += Math.pow(this.remainingCases.get(i).getValue(), 2);
		}

		offer /= this.casesLeft;
		offer = Math.sqrt(offer);
		offer = this.roundToHundreds(offer);

		this.offerValue = offer;

		return offer;
	}

	private double roundToHundreds(double value) {

		value *= this.multiplicator;
		value = Math.floor(value);
		value = value / 100;
		value = Math.round(value);
		value = value * 100;

		this.multiplicator += 0.25;

		return value;
	}

	public double getOfferValue() {
		return this.offerValue;
	}

	public void setOfferValue(double offerValue) {
		this.offerValue = offerValue;
	}

}
