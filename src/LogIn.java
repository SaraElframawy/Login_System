import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LogIn implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton =new JButton("Login");
   JButton resetButton = new JButton("Reset");
   JTextField userIdField = new JTextField();
   JPasswordField userPasswordField= new JPasswordField();
   JLabel userIDLabel = new JLabel("User ID");
   JLabel userPasswordLabel = new JLabel("Password");
   JLabel messageLabel = new JLabel();
    HashMap<String,String> loginInfo = new HashMap<>();

     LogIn(HashMap <String,String> loginInfoOriginal) {
         userIDLabel.setBounds(50,100,75,25);
         userPasswordLabel.setBounds(50,150,75,25);
         messageLabel.setBounds(125,250,250,350);
         messageLabel.setFont(new Font(null,Font.ITALIC,25));
         userIdField.setBounds(125,100,200,25);
         //the label and the field has to be on the same x and change the y with the width and plus space
         userPasswordField.setBounds(125,150,200,25);
         loginButton.setBounds(125,200,100,25);
         loginButton.addActionListener(this);
         resetButton.setBounds(225,200,100,25);
         //the difference in the between the buttons is the width of the first button
         resetButton.addActionListener(this);

         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(500,600);
         frame.setVisible(true);
         frame.setLayout(null);
         loginInfo = loginInfoOriginal;
         frame.add(messageLabel);
         frame.add(userIDLabel);
         frame.add(userPasswordLabel);
         frame.add(userIdField);
         frame.add(userPasswordField);
         frame.add(loginButton);
         frame.add(resetButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == resetButton){
             userIdField.setText("");
             userPasswordField.setText("");
         }
         if(e.getSource()== loginButton) {
             String userId = userIdField.getText();
             String password = String.valueOf(userPasswordField.getPassword());
             if (loginInfo.containsKey(userId)) {
                 if(loginInfo.get(userId).equals(password)){
                     //if the list has the email then does it equal the password too
                     messageLabel.setForeground(Color.green);
                     messageLabel.setText("login successful!");
                     frame.dispose();
                       new WelcomePage(userId);

                 } else {
                     messageLabel.setForeground(Color.red);
                     messageLabel.setText("Wrong password");
                 }

                 } else {
                 messageLabel.setForeground(Color.red);
                 messageLabel.setText("user name not found");


             }
         }



    }
}
