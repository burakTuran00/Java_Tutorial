import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class From1 {
    private JButton button1;
    private JLabel Selam;

    public From1() {
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.printf("Hello");

        }
    });
}
}
