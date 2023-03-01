package deal;

import static org.junit.jupiter.api.Assertions.*;

class ValueButtonTest {

	@org.junit.jupiter.api.Test
	void getName() {
	}

	@org.junit.jupiter.api.Test
	void getText() {
		String str = ValueButton.createText();
		assertEquals(ValueButton.text, str);
	}

	@org.junit.jupiter.api.Test
	void getIndex() {
	}

	@org.junit.jupiter.api.Test
	void getValue() {
	}
}