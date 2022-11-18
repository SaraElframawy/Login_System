import javax.swing.*;
import java.awt.*;

public class WelcomePage { //to open a new frame when log in with correct username and password
    JFrame frame = new JFrame();
    JLabel welcomeLabel= new JLabel("Hello");
    WelcomePage(String userId){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Hello "+ userId);
        frame.add(welcomeLabel);

    }
}
