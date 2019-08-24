package deal;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

class CasesPanel extends JPanel {

	private UI ui;
	private RemainingValuesPanel rvpLeft;
	private RemainingValuesPanel rvpRight;
	private JPanel panel;
	private IconButton button1;
	private IconButton button2;
	private IconButton button3;
	private IconButton button4;
	private IconButton button5;
	private IconButton button6;
	private IconButton button7;
	private IconButton button8;
	private IconButton button9;
	private IconButton button10;
	private IconButton button11;
	private IconButton button12;
	private IconButton button13;
	private IconButton button14;
	private IconButton button15;
	private IconButton button16;
	private IconButton button17;
	private IconButton button18;
	private IconButton button19;
	private IconButton button20;
	private List<IconButton> buttons = new ArrayList<>();

	private static final long serialVersionUID = -2449830916003593421L;

	CasesPanel(UI ui, RemainingValuesPanel rvpLeft, RemainingValuesPanel rvpRight) {

		this.ui = ui;
		this.rvpLeft = rvpLeft;
		this.rvpRight = rvpRight;
		this.panel = new JPanel();
		GridLayout layout = new GridLayout(5, 4, 15, 15);
		this.panel.setLayout(layout);

		this.button1 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button2 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button3 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button4 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button5 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button6 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button7 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button8 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button9 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button10 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button11 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button12 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button13 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button14 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button15 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button16 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button17 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button18 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button19 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);
		this.button20 = new IconButton(this.ui, this.rvpLeft, this.rvpRight, this);

		this.buttons.add(this.button1);
		this.buttons.add(this.button2);
		this.buttons.add(this.button3);
		this.buttons.add(this.button4);
		this.buttons.add(this.button5);
		this.buttons.add(this.button6);
		this.buttons.add(this.button7);
		this.buttons.add(this.button8);
		this.buttons.add(this.button9);
		this.buttons.add(this.button10);
		this.buttons.add(this.button11);
		this.buttons.add(this.button12);
		this.buttons.add(this.button13);
		this.buttons.add(this.button14);
		this.buttons.add(this.button15);
		this.buttons.add(this.button16);
		this.buttons.add(this.button17);
		this.buttons.add(this.button18);
		this.buttons.add(this.button19);
		this.buttons.add(this.button20);

	}

	JPanel createPanel() {

		this.panel.add(this.button1);
		this.panel.add(this.button2);
		this.panel.add(this.button3);
		this.panel.add(this.button4);
		this.panel.add(this.button5);
		this.panel.add(this.button6);
		this.panel.add(this.button7);
		this.panel.add(this.button8);
		this.panel.add(this.button9);
		this.panel.add(this.button10);
		this.panel.add(this.button11);
		this.panel.add(this.button12);
		this.panel.add(this.button13);
		this.panel.add(this.button14);
		this.panel.add(this.button15);
		this.panel.add(this.button16);
		this.panel.add(this.button17);
		this.panel.add(this.button18);
		this.panel.add(this.button19);
		this.panel.add(this.button20);

		IconButton.remainingCases.add(this.button1);
		IconButton.remainingCases.add(this.button2);
		IconButton.remainingCases.add(this.button3);
		IconButton.remainingCases.add(this.button4);
		IconButton.remainingCases.add(this.button5);
		IconButton.remainingCases.add(this.button6);
		IconButton.remainingCases.add(this.button7);
		IconButton.remainingCases.add(this.button8);
		IconButton.remainingCases.add(this.button9);
		IconButton.remainingCases.add(this.button10);
		IconButton.remainingCases.add(this.button11);
		IconButton.remainingCases.add(this.button12);
		IconButton.remainingCases.add(this.button13);
		IconButton.remainingCases.add(this.button14);
		IconButton.remainingCases.add(this.button15);
		IconButton.remainingCases.add(this.button16);
		IconButton.remainingCases.add(this.button17);
		IconButton.remainingCases.add(this.button18);
		IconButton.remainingCases.add(this.button19);
		IconButton.remainingCases.add(this.button20);

		return this.panel;
	}

}
