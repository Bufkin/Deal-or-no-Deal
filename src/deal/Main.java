package deal;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

class Main {

	static int casesToOpen;

	public static void main(String[] args) throws InterruptedException {

		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			System.err.print("LookAndFeel kann nicht gefunden werden.");
		}

		UI ui = new UI();
		JFrame frame = ui.createUI(ui);

		int sleepTime = 100;

		// ABLAUF==============================================================

		// Eigenen Koffer wählen-----------------------------------------------
		ui.setText("Bitte wähle einen Koffer.");

		while (!IconButton.firstFlag) {
			Thread.sleep(sleepTime);
		}

		// 7 Koffer �ffnen-----------------------------------------------------
		casesToOpen = 7;

		ui.setText("Bitte " + casesToOpen + " Koffer �ffnen.");

		while (IconButton.openedCases != 8) {
			Thread.sleep(sleepTime);
		}

		// Bankerangebot-------------------------------------------------------
		BankerOffer offer = new BankerOffer(IconButton.remainingCases);
		ui.showOfferWindow(frame, offer.calculateOffer());

		// 6 Koffer �ffnen-----------------------------------------------------
		casesToOpen = 6;

		ui.setText("Bitte " + casesToOpen + " Koffer �ffnen.");

		while (IconButton.openedCases != 14) {
			Thread.sleep(sleepTime);
		}

		// Bankerangebot-------------------------------------------------------
		offer = new BankerOffer(IconButton.remainingCases);
		ui.showOfferWindow(frame, offer.calculateOffer());

		// 5 Koffer �ffnen-----------------------------------------------------
		casesToOpen = 5;

		ui.setText("Bitte " + casesToOpen + " Koffer �ffnen.");

		while (IconButton.openedCases != 19) {
			Thread.sleep(sleepTime);
		}

		// Bankerangebot-------------------------------------------------------
		offer = new BankerOffer(IconButton.remainingCases);
		ui.showOfferWindow(frame, offer.calculateOffer());

		// gew�hlten Koffer behalten oder anderen Koffer w�hlen----------------
		ui.setText("M�chten Sie ihren Koffer behalten oder den anderen verbleibenden �ffnen?");

	}
}
