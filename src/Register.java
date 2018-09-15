import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    private JTextField textUser;
    private JTextField textPassword;
    private JTextField textRePassword;
    private JButton registerButton;
    private JPanel mainPanel;


    public Register() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null,txtUsername.getText()+" "+
//                        new String(txtPassword.getPassword())+" "+ txtEmail.getText());


                PreparedStatement pst;
                if( new String(textPassword.getPassword()).equals( new String(textRePassword.getPassword()))){


                    try{
                        String serverName = "sql12.freemysqlhosting.net";
                        String mydatabase = "sql12255832";
                        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
                        String username = "sql12255832";
                        String password = "VqusRaY3qH";
                        Connection connection = DriverManager.getConnection(url, username, password);
                        connection.createStatement();

                        String sql ="Insert into User(User_Name, User_Email, User_Password) values (?,?,?)";

                        pst=connection.prepareStatement(sql);
                        pst.setString(1, textUsername.getText());
                        pst.setString(2, textEmail.getText());
                        pst.setString(3,  new String(textPassword.getPassword()));
                        pst.execute();


                        JOptionPane.showMessageDialog(null, "ลงทะเบียนเสร็จสิ้น");




                    }

                    catch(Exception String) {
                        JOptionPane.showMessageDialog(null, e);

                    }


                }
                else{
                    JOptionPane.showMessageDialog(null, "รหัสผ่านไม่ตรงกัน");

                }

            }

        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    public Container getMainPanel() {

    }
}
