import javax.swing.*;
import java.awt.*;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Register registerPanel = new Register();
        frame.setContentPane(registerPanel.getMainPanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500,600));
        frame.setVisible(true);

        String serverName = "sql12.freemysqlhosting.net";
        String mydatabase = "sql12255832";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
        String username = "sql12255832";
        String password = "VqusRaY3qH";
        Connection connection = DriverManager.getConnection(url, username, password);
        connection.createStatement();
    }
}
