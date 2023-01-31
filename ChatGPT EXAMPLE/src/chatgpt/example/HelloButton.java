import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloButton extends JFrame {
    public HelloButton() {
        setTitle("Hello Button");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        button.setBackground(Color.RED);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello There", "Greeting", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JLabel label = new JLabel("Hello There",SwingConstants.CENTER);
        label.setForeground(Color.BLUE);
        label.setVisible(false);

        add(button, BorderLayout.NORTH);
        add(label, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        HelloButton frame = new HelloButton();
        frame.setVisible(true);
    }
}