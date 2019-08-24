package deal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class IconButton extends JButton implements ActionListener {

	private static final long serialVersionUID = -3761057170156106141L;

	private UI ui;
	private RemainingValuesPanel rvpLeft;
	private RemainingValuesPanel rvpRight;
	private CasesPanel casesPanel;
	public String text;
	public String name;
	public int value;
	private ImageIcon image;
	public int number;
	private Boolean pressed;
	public static volatile Boolean firstFlag;
	private static volatile IconButton firstCase;
	public static volatile IconButton secondCase;
	public static volatile int openedCases;
	public static volatile List<IconButton> remainingCases;
	private static volatile List<Integer> usedValues = new ArrayList<>();
	private static volatile List<Integer> availableValues = new LinkedList<>(Arrays.asList(1, 2, 5, 10, 20, 50, 100,
			250, 500, 750, 1000, 2000, 5000, 10000, 20000, 25000, 50000, 100000, 150000, 250000));
	private static volatile int caseNumber = 1;

	public IconButton(UI ui, RemainingValuesPanel rvpLeft, RemainingValuesPanel rvpRight, CasesPanel casesPanel) {

		super();

		this.ui = ui;
		this.rvpLeft = rvpLeft;
		this.rvpRight = rvpRight;
		this.setCasesPanel(casesPanel);

		this.value = this.getRandomValue();
		this.text = this.getDisplayText();
		this.setFont(new Font("Arial", Font.BOLD, 30));
		this.image = new ImageIcon("images/briefcase2.png");
		this.pressed = Boolean.valueOf(false);
		this.name = this.generateName();
		this.number = caseNumber;
		caseNumber++;
		this.setText(String.valueOf(this.number));
		this.setIcon(this.image);

		this.addActionListener(this);

		IconButton.remainingCases = new ArrayList<IconButton>();
		IconButton.openedCases = 0;
		IconButton.firstFlag = Boolean.valueOf(false);

		this.setEnabled(Boolean.valueOf(true));

		this.setHorizontalTextPosition(JButton.CENTER);
		this.setVerticalTextPosition(JButton.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (!IconButton.this.pressed) {

			IconButton.openedCases++;
			IconButton.remainingCases.remove(e.getSource());

			IconButton.this.pressed = Boolean.valueOf(true);

			if (!IconButton.firstFlag) {
				IconButton.this.setFirstCase();
				IconButton.firstFlag = Boolean.valueOf(true);
			} else {
				IconButton.this.setIcon(new ImageIcon("images/briefcase3.png"));
				IconButton.this.setBackground(Color.GRAY);
				IconButton.this.setText(String.valueOf(IconButton.this.getDisplayText()));

				this.rvpLeft.deactivateValueButton(this.getValue());
				this.rvpRight.deactivateValueButton(this.getValue());

				super.repaint();
				Main.casesToOpen--;
				this.ui.setText("Bitte " + Main.casesToOpen + " Koffer öffnen.");
			}
		}
	}

	public void setFirstCase() {
		this.setForeground(Color.BLACK);
		this.setIcon(new ImageIcon("images/briefcase_gold.png"));
		IconButton.firstCase = this;
	}

	public void getSecondCase() {
		IconButton.remainingCases.remove(remainingCases.indexOf(firstCase));

		IconButton.secondCase = remainingCases.get(0);
	}

	private int getRandomValue() {

		List<Integer> possibleValues = new ArrayList<>();
		possibleValues = IconButton.availableValues;
		possibleValues.removeAll(IconButton.usedValues);

		int rand = ThreadLocalRandom.current().nextInt(0, possibleValues.size());

		IconButton.usedValues.add(possibleValues.get(rand));

		return possibleValues.get(rand);

	}

	public String generateName() {
		return "button" + this.value;
	}

	public String getDisplayText() {

		String text = NumberFormat.getNumberInstance(Locale.GERMAN).format(IconButton.this.value);

		return text += " €";
	}

	@Override
	public String getText() {
		return this.text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public CasesPanel getCasesPanel() {
		return this.casesPanel;
	}

	public void setCasesPanel(CasesPanel casesPanel) {
		this.casesPanel = casesPanel;
	}

}
