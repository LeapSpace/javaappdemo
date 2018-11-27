package xyz.yukee.javaappdemo;

import org.apache.commons.lang3.StringUtils;

import javax.swing.*;

/**
 * @author space
 * @date 2018/11/27 上午9:50
 */
public class DemoApplication {
    private JTextField username;
    private JTextField password;
    private JButton loginBtn;
    private JPanel jpanl;
    private JPanel title;
    private JPanel params;
    private JPanel btns;

    private DemoApplication() {
        loginBtn.addActionListener(e -> {
            String un = username.getText();
            String pwd = password.getText();
            JOptionPane.showMessageDialog(null, "Hello! " + StringUtils.defaultString(un, "test"));
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DemoApplication");
        frame.setContentPane(new DemoApplication().jpanl);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
