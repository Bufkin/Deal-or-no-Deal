package deal;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;

class ValueButton extends JButton {

	private static final long serialVersionUID = -5799597332533519813L;

	private String name;
	private String text;
	private int value;
	private int index;
	private static volatile List<String> possibleValues = new ArrayList<>();

	static volatile List<Integer> values = new ArrayList<>(Arrays.asList(1, 2, 5, 10, 20, 50, 100, 250, 500, 750, 1000,
			2000, 5000, 10000, 20000, 25000, 50000, 100000, 150000, 250000));

	ValueButton(int index) {

		super();
		this.fillAvailableValueList();

		this.index = index;
		this.text = ValueButton.possibleValues.get(index);
		this.value = ValueButton.values.get(index);
		this.name = "label" + index;
		this.setBackground(Color.YELLOW);
		this.setText(this.text);
		this.setFont(new Font("Arial", Font.BOLD, 15));
		this.setName(this.name);

		this.setVisible(Boolean.valueOf(true));
	}

	public void setOpened(String value) {
		this.setBackground(Color.YELLOW);
	}

	private void fillAvailableValueList() {

		for (int i : values) {
			String s = String.format("%,d", i);
			ValueButton.possibleValues.add(s + " €");
		}
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getText() {
		return this.text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

	public int getIndex() {
		return this.index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
