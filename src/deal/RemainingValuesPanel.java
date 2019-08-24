package deal;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

class RemainingValuesPanel extends JPanel {

	private char leftOrRight;
	private ValueButton label0;
	private ValueButton label1;
	private ValueButton label2;
	private ValueButton label3;
	private ValueButton label4;
	private ValueButton label5;
	private ValueButton label6;
	private ValueButton label7;
	private ValueButton label8;
	private ValueButton label9;
	private ValueButton label10;
	private ValueButton label11;
	private ValueButton label12;
	private ValueButton label13;
	private ValueButton label14;
	private ValueButton label15;
	private ValueButton label16;
	private ValueButton label17;
	private ValueButton label18;
	private ValueButton label19;
	private JPanel panel;
	private List<ValueButton> buttonArray;

	private static final long serialVersionUID = -4545323445301422353L;

	RemainingValuesPanel(final char leftOrRight) {
		this.leftOrRight = leftOrRight;
		this.label0 = new ValueButton(0);
		this.label1 = new ValueButton(1);
		this.label2 = new ValueButton(2);
		this.label3 = new ValueButton(3);
		this.label4 = new ValueButton(4);
		this.label5 = new ValueButton(5);
		this.label6 = new ValueButton(6);
		this.label7 = new ValueButton(7);
		this.label8 = new ValueButton(8);
		this.label9 = new ValueButton(9);
		this.label10 = new ValueButton(10);
		this.label11 = new ValueButton(11);
		this.label12 = new ValueButton(12);
		this.label13 = new ValueButton(13);
		this.label14 = new ValueButton(14);
		this.label15 = new ValueButton(15);
		this.label16 = new ValueButton(16);
		this.label17 = new ValueButton(17);
		this.label18 = new ValueButton(18);
		this.label19 = new ValueButton(19);
		this.panel = new JPanel();
		this.buttonArray = new ArrayList<>();

		this.buttonArray.add(this.label0);
		this.buttonArray.add(this.label1);
		this.buttonArray.add(this.label2);
		this.buttonArray.add(this.label3);
		this.buttonArray.add(this.label4);
		this.buttonArray.add(this.label5);
		this.buttonArray.add(this.label6);
		this.buttonArray.add(this.label7);
		this.buttonArray.add(this.label8);
		this.buttonArray.add(this.label9);
		this.buttonArray.add(this.label10);
		this.buttonArray.add(this.label11);
		this.buttonArray.add(this.label12);
		this.buttonArray.add(this.label13);
		this.buttonArray.add(this.label14);
		this.buttonArray.add(this.label15);
		this.buttonArray.add(this.label16);
		this.buttonArray.add(this.label17);
		this.buttonArray.add(this.label18);
		this.buttonArray.add(this.label19);

	}

	void deactivateValueButton(int value) {

		this.buttonArray.get(ValueButton.values.indexOf(value)).setBackground(Color.GRAY);

	}

	JPanel createPanel() {

		Dimension dim = new Dimension(30, 35);

		this.panel.setLayout(new BoxLayout(this.panel, BoxLayout.PAGE_AXIS));

		if (this.leftOrRight == 'L') {

			this.panel.add(this.label0);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label1);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label2);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label3);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label4);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label5);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label6);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label7);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label8);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label9);

			this.panel.setAlignmentX(JPanel.LEFT_ALIGNMENT);

			return this.panel;

		} else if (this.leftOrRight == 'R') {

			this.label10.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
			this.label11.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
			this.label12.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
			this.label13.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
			this.label14.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
			this.label15.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
			this.label16.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
			this.label17.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
			this.label18.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
			this.label19.setAlignmentX(JLabel.RIGHT_ALIGNMENT);

			this.panel.add(this.label10);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label11);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label12);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label13);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label14);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label15);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label16);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label17);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label18);
			this.panel.add(Box.createRigidArea(dim));
			this.panel.add(this.label19);

			return this.panel;
		} else {
			return null;
		}
	}
}
