package football.ticket.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login1 {
    private JPanel panel1;
    private JButton userLoginButton;
    private JButton adminLoginButton;

    public Login1() {
        userLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Aici se va loga user-ul.");
            }
        });
        adminLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Aici se va loga admin-ul.");

            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login1");
        frame.setContentPane(new Login1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
       frame.setVisible(true);
    }
}
