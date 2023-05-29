package Programs.LoginSystem;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {
                public static String name;
                public static String passWord;
    public static void main(String[] args) {
        
        
        JTextField uname = new JTextField();
        JPasswordField pword = new JPasswordField();
       

        JFrame frame = new JFrame("Login");
        frame.setSize(400, 300);
        JLabel username = new JLabel();
        JLabel label = new JLabel("Please register.");
        username.setText("Username :");
        JLabel password = new JLabel();
        password.setText("Password :");
        JButton btn = new JButton("Register");
        JButton btn2 = new JButton("Submit");
        label.setBounds(50, 10, 200, 15);
        username.setBounds(50, 55, 200, 10);
        password.setBounds(50, 110, 200, 10);
        pword.setBounds(140, 105, 200, 25);
        uname.setBounds(140, 50, 200, 25);
        btn.setBounds(50, 200, 100, 20);
        btn2.setBounds(225, 200, 100, 20);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                JOptionPane.showMessageDialog(frame,"Enter username");
                name = JOptionPane.showInputDialog("Username :");
                JOptionPane.showMessageDialog(frame,"Enter password");
                passWord = JOptionPane.showInputDialog("Password :");
             }
            
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pwd = new String(pword.getPassword());
                if((name.equals(uname.getText().toString())) && (passWord.equals(pwd))){
                    System.out.println("Authorized User Access Granted");
                }else{
                    System.out.println("Nooo");
                  
                }
             }
            
        });
        

        frame.add(uname);
        frame.add(pword);
        frame.add(username);
        frame.add(password);
        frame.add(btn);
        frame.add(btn2);
        frame.add(label);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
