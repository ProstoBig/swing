import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame {

    private JPanel Merp;
    private JTextField merping;
    private JTextField merpster;
    private JButton okButton;
    private JButton clearButton;
    private JLabel merper;

    public main() {
        setContentPane(Merp);
        setTitle("Brown");
        setSize(450, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        okButton.addActionListener(new OKButtonListener());
        clearButton.addActionListener(new ClearButtonListener());
    }
    private class OKButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String uno = merping.getText();
            String dos = merpster.getText();
            String res = (uno.isEmpty() && dos.isEmpty()) ? "Введіть дані" : "Вітаю " + uno + " " + dos;
            merper.setText(res);
        }
    }
    private class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            merping.setText("");
            merpster.setText("");
            merper.setText("");
        }
    }

    public static void main(String[] args) {
        main n = new main();
    }
}
