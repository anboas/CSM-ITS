package Assignment01;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class ScrollableTaxCalculator extends JFrame {
	private static final long serialVersionUID = 1L;

	// Panels
	private static JPanel purchaseAmountPanel;
	private static JPanel salesTaxSliderPanel;
	private static JPanel salesTaxAmountPanel;
	private static JPanel totalPurchaseAmountPanel;

	// Labels
	private static JLabel purchaseAmountLabel;
	private static JLabel salesTaxSliderLabel;
	private static JLabel salesTaxAmountLabel;
	private static JLabel totalPurchaseAmountLabel;

	// Text Fields
	private static JTextField purchaseAmountValue;
	private static JTextField salesTaxAmountValue;
	private static JTextField totalPurchaseAmountValue;

	// Slider
	private static JSlider salesTaxAmountSlider;

	// Strings
	private static String windowTitle = "Scrollable Tax Calculator";

	// Other Declarations
	private static DecimalFormat decFormat = new DecimalFormat("##.##");
	private static double purchaseAmount, salesTax, totalPurchaseAmount;
	private static String salesTaxString, totalPurchaseAmountString;

	public ScrollableTaxCalculator() {

		// Define JFrame Properties
		setTitle(windowTitle);
		setLayout(new BorderLayout());
		setSize(750, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		isAlwaysOnTop();
		
		// Labels
		purchaseAmountLabel = new JLabel("Purchase Amount: ");
		salesTaxSliderLabel = new JLabel("Sales Tax Percent ");
		salesTaxAmountLabel = new JLabel("Sales Tax Amount: ");
		totalPurchaseAmountLabel = new JLabel("Total Purchase Amount: ");

		// Text Fields
		purchaseAmountValue = new JTextField("0.0", 10);
		purchaseAmountValue.setEditable(true);
		salesTaxAmountValue = new JTextField("0.0", 10);
		salesTaxAmountValue.setEditable(false);
		totalPurchaseAmountValue = new JTextField("0.0", 10);
		totalPurchaseAmountValue.setEditable(false);

		// Slider
		salesTaxAmountSlider = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
		salesTaxAmountSlider.setMajorTickSpacing(1);
		salesTaxAmountSlider.setMinorTickSpacing(1);
		salesTaxAmountSlider.setPaintTicks(true);
		salesTaxAmountSlider.setPaintLabels(true);
		salesTaxAmountSlider.addChangeListener(new changeListener());

		// Panels
		purchaseAmountPanel = new JPanel();
		purchaseAmountPanel.add(purchaseAmountLabel);
		purchaseAmountPanel.add(purchaseAmountValue);
		salesTaxSliderPanel = new JPanel();
		salesTaxSliderPanel.add(salesTaxSliderLabel);
		salesTaxSliderPanel.add(salesTaxAmountSlider);
		salesTaxAmountPanel = new JPanel();
		salesTaxAmountPanel.add(salesTaxAmountLabel);
		salesTaxAmountPanel.add(salesTaxAmountValue);
		totalPurchaseAmountPanel = new JPanel();
		totalPurchaseAmountPanel.add(totalPurchaseAmountLabel);
		totalPurchaseAmountPanel.add(totalPurchaseAmountValue);

		// Define Layout
		setLayout(new GridLayout(4, 1));

		// Add Panels
		add(purchaseAmountPanel);
		add(salesTaxSliderPanel);
		add(salesTaxAmountPanel);
		add(totalPurchaseAmountPanel);

		// Load JFrame
		pack();
		setVisible(true);

	}

	private class changeListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {

			salesTaxAmountValue.setText(purchaseAmountValue.getText());
			purchaseAmount = Double.parseDouble(purchaseAmountValue.getText());
			salesTax = salesTaxAmountSlider.getValue();
			totalPurchaseAmount = purchaseAmount * (1 + (salesTax / 100));

			salesTaxString = decFormat.format(totalPurchaseAmount - purchaseAmount);
			totalPurchaseAmountString = decFormat.format(totalPurchaseAmount);
			
			salesTaxAmountValue.setText(salesTaxString);
			totalPurchaseAmountValue.setText(totalPurchaseAmountString);
		}
	}

}
