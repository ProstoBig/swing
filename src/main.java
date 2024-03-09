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

        // Внутрішній клас для обробки подій кнопки "OK"
        okButton.addActionListener(new OKButtonListener());

        // Внутрішній клас для обробки подій кнопки "Clear"
        clearButton.addActionListener(new ClearButtonListener());
    }

    // Внутрішній клас для обробки подій кнопки "OK"
    private class OKButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String uno = merping.getText();
            String dos = merpster.getText();
            String res = (uno.isEmpty() && dos.isEmpty()) ? "мавпа" : "Вітаю " + uno + " " + dos;
            merper.setText(res);
        }
    }

    // Внутрішній клас для обробки подій кнопки "Clear"
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
