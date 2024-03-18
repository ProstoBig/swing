package zodiac;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame {

    private JPanel Merp;
    private JTextField merping;
    private JTextField merpster;
    private JButton okButton;
    private JLabel merper;

    public main() {
        setContentPane(Merp);
        setTitle("Додаток Знак Зодіаку");
        setSize(450, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Ініціалізація довідкового вікна
        initializeHelpWindow();

        // Внутрішній клас для обробки подій кнопки "OK"
        okButton.addActionListener(new OKButtonListener());
    }

    // Метод для ініціалізації довідкового вікна
    private void initializeHelpWindow() {
        // Додавання меню
        JMenuBar menuBar = new JMenuBar();

        // Меню "Довідка"
        JMenu helpMenu = new JMenu("Довідка");
        JMenuItem aboutMenuItem = new JMenuItem("Про програму");
        helpMenu.add(aboutMenuItem);
        menuBar.add(helpMenu);

        aboutMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(main.this,
                        "Додаток Знак Зодіаку\nВерсія 1.0\nАвтор: Новача Шкварка\n" +
                                "Введіть свій день народження у форматі ММ-ДД і натисніть 'ОК', щоб побачити свій знак зодіаку.",
                        "Про програму", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Додавання меню до вікна
        setJMenuBar(menuBar);
        setVisible(true); // Робимо довідкове вікно видимим
    }

    // Внутрішній клас для обробки подій кнопки "OK"
    private class OKButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String monthString = merping.getText();
            String dayString = merpster.getText();

            // Перевірка, чи введені дані є числами
            try {
                int month = Integer.parseInt(monthString);
                int day = Integer.parseInt(dayString);

                // Перевірка правильності введених даних
                if (month < 1 || month > 12 || day < 1 || day > 31) {
                    JOptionPane.showMessageDialog(main.this,
                            "Неправильний ввід. Введіть дату народження у форматі ММ-ДД.",
                            "Помилка", JOptionPane.ERROR_MESSAGE);
                } else {
                    String dateOfBirth = month + "-" + day;
                    String zodiacSign = zodiac(dateOfBirth);
                    merper.setText("Ваш знак Зодіаку: " + zodiacSign);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(main.this,
                        "Неправильний ввід. Введіть дату народження у форматі ММ-ДД.",
                        "Помилка", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private String zodiac(String dateOfBirth) {
        String[] parts = dateOfBirth.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Овен";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Телець";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Близнюки";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Рак";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Лев";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Діва";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Терези";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Скорпіон";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Стрілець";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Козеріг";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Водолій";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Риби";
        } else {
            return "Неправильний ввід.";
        }
    }

    public static void main(String[] args) {
        main n = new main();
    }
}
