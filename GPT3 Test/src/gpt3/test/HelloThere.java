import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloThere extends JFrame implements ActionListener {
  private JButton button;
  private JLabel label;

  public HelloThere() {
    // Set the window title and size
    setTitle("Hello There Button");
    setSize(300, 100);

    // Set the layout to use a FlowLayout
    setLayout(new FlowLayout());

    // Create the button and add it to the window
    button = new JButton("Click me");
    add(button);

    // Add an ActionListener to the button
    button.addActionListener(this);

    // Create the label and add it to the window
    label = new JLabel("", SwingConstants.CENTER);
    label.setForeground(Color.RED);
    add(label);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // Hide the button and show the label when the button is clicked
    button.setVisible(false);
    label.setText("Hello there!");
  }

  public static void main(String[] args) {
    // Create a new HelloThereButton object and make it visible
    HelloThere htb = new HelloThere();
    htb.setVisible(true);
  }
}
