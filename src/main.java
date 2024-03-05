import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame{

    private JPanel Merp;
    private JTextField cumshot;
    private JTextField Negromancer;
    private JButton okButton;
    private JButton clearButton;
    private JLabel merper;

    public main() {
        setContentPane(Merp);
        setTitle("Brown");
        setSize(450, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uno = cumshot.getText();
                String dos = Negromancer.getText();
                merper.setText("Erm " + uno + " " + dos);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cumshot.setText("");
                Negromancer.setText("");
                merper.setText("");
            }
        });
    }

    public static void main(String[] args){
        main n = new main();
    }
}
