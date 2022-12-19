import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
  private JTextField num1Field;
  private JTextField num2Field;
  private JLabel resultLabel;
  private JButton addButton;
  private JButton subtractButton;
  private JButton multiplyButton;
  private JButton divideButton;

  public Calculator() {
    setLayout(new FlowLayout());

    num1Field = new JTextField(10);
    add(num1Field);

    num2Field = new JTextField(10);
    add(num2Field);

    addButton = new JButton("+");
    add(addButton);
    addButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = num1 + num2;
        resultLabel.setText(Double.toString(result));
      }
    });

    subtractButton = new JButton("-");
    add(subtractButton);
    subtractButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = num1 - num2;
        resultLabel.setText(Double.toString(result));
      }
    });

    multiplyButton = new JButton("*");
    add(multiplyButton);
    multiplyButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = num1 * num2;
        resultLabel.setText(Double.toString(result));
      }
    });

    divideButton = new JButton("/");
    add(divideButton);
    divideButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = num1 / num2;
        resultLabel.setText(Double.toString(result));
      }
    });

    resultLabel = new JLabel("");
    add(resultLabel);
  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.setTitle("Calculator");
    calculator.setSize(250, 100);
	calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    calculator.setVisible(true);
  }
}

