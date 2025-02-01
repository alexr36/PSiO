package List12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stopnie extends JFrame {
    //  ==  Class fields  ==============================================================================================

    //  Constants for window components
    private static final String TITLE = "Konwerter stopni";
    private static final JLabel CELSIUS_LABEL = new JLabel("Celsjusz");
    private static final JLabel FAHRENHEITS_LABEL = new JLabel("Fahrenheit");
    private static final JButton CLEAR_BUTTON = new JButton("Wyczyść pola");

    //  Constants for window properties
    private static final int WINDOW_HEIGHT = 200;
    private static final int WINDOW_WIDTH = 500;
    private static final int ROWS = 3;
    private static final int COLUMNS = 2;
    private static final int TEXT_FIELD_LENGTH = 10;

    //  Editable fields
    private JTextField celsiusField = new JTextField(TEXT_FIELD_LENGTH);
    private JTextField fahrenheitField = new JTextField(TEXT_FIELD_LENGTH);


    //  ==  Constructor  ===============================================================================================

    public Stopnie() {
        //  Setting content pane and layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(ROWS, COLUMNS));
        add(panel);

        //  Adding components
        panel.add(CELSIUS_LABEL);      panel.add(celsiusField);
        panel.add(FAHRENHEITS_LABEL);  panel.add(fahrenheitField);
        panel.add(CLEAR_BUTTON);

        //  Adding ActionListeners
        CLEAR_BUTTON.addActionListener(new clearButtonListener());
        celsiusField.addActionListener(new celsiusFieldListener());
        fahrenheitField.addActionListener(new fahrenheitFieldListener());


        //  Setting window properties
        setTitle(TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setResizable(false);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Stopnie();
    }


    //  ==  ActionListeners implementations  ===========================================================================

    private class clearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            celsiusField.setText("");
            fahrenheitField.setText("");
        }
    }


    private class celsiusFieldListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double newValue = Konwerter.celsiusToFahrenheit(Double.parseDouble(celsiusField.getText()));
                fahrenheitField.setText(String.format("%.1f", newValue));
            }
            catch (Exception exception) {
                showNumberFormatError();
            }
        }
    }


    private class fahrenheitFieldListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double newValue = Konwerter.fahrenheitToCelsius(Double.parseDouble(fahrenheitField.getText()));
                celsiusField.setText(String.format("%.1f", newValue));
            }
            catch (Exception exception) {
                showNumberFormatError();
            }
        }
    }


    private void showNumberFormatError() {
        JOptionPane.showMessageDialog(null, "Nieprawidłowy format liczby", "", JOptionPane.ERROR_MESSAGE);
    }
}
