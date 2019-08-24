package deal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class UI {

	private JTextField middleTextField;
	private JFrame frame;
	private RemainingValuesPanel panelLeft;
	private RemainingValuesPanel panelRight;
	private JPanel left;
	private JPanel right;
	private JPanel center;
	private JPanel mid;

	public UI() {
		this.middleTextField = new JTextField("");
		this.frame = new JFrame();
	}

	public void setText(String input) {
		this.middleTextField.setText(input);
		this.middleTextField.repaint();
		this.middleTextField.validate();
	}

	public String getText() {
		return this.middleTextField.getText();
	}

	JFrame createUI(UI ui) {

		this.panelLeft = new RemainingValuesPanel('L');
		this.panelRight = new RemainingValuesPanel('R');
		CasesPanel panelCenter = new CasesPanel(ui, this.panelLeft, this.panelRight);

		Dimension dim = new Dimension(1000, 800);

		this.frame.setLayout(new BorderLayout());
		this.frame.setSize(dim);
		this.frame.setPreferredSize(dim);

		this.left = this.panelLeft.createPanel();
		this.right = this.panelRight.createPanel();
		this.center = panelCenter.createPanel();

		this.mid = new JPanel();
		this.mid.setLayout(new BorderLayout());

		this.middleTextField.setEditable(Boolean.valueOf(false));

		this.mid.add(this.middleTextField, BorderLayout.PAGE_START);
		this.mid.add(this.center, BorderLayout.CENTER);

		this.frame.getContentPane().add(this.left, BorderLayout.WEST);
		this.frame.getContentPane().add(this.right, BorderLayout.EAST);
		this.frame.getContentPane().add(this.mid, BorderLayout.CENTER);

		this.frame.setVisible(Boolean.valueOf(true));
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		return this.frame;
	}

	final int showOfferWindow(JFrame frame, double offer) {

		String s = String.format("%,d", Math.round(offer));

		Object[] options = {
				"Deal", "No Deal"
		};
		int n = JOptionPane.showOptionDialog(frame, "Wollen Sie das Angebot von " + s + " � annehmen?",
				"Bankerangebot", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		if (n == 0) {
			JOptionPane.showMessageDialog(frame, "Herzlichen Gl�ckwunsch zu " + s + " �!");
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		}

		return n;
	}
}
