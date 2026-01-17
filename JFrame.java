package lesson11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class KeyCalc extends JFrame{

    private double a = 10;  // example values
    private double b = 5;

    public KeyCalc() {
        setTitle("Key Calculator");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Press keys: SHIFT+PLUS, -, *, /, %, ESC to quit");
        add(label);

        // KEY LISTENER
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                int key = e.getKeyCode();

                switch (key) {

                    case KeyEvent.VK_ESCAPE:
                        System.out.println("ESC pressed → quitting...");
                        System.exit(0);
                        break;

                    case KeyEvent.VK_EQUALS:  // SHIFT + '=' → '+'
                        if (e.isShiftDown()) {
                            System.out.println("a + b = " + (a + b));
                        }
                        break;

                    case KeyEvent.VK_MINUS:
                        System.out.println("a - b = " + (a - b));
                        break;

                    case KeyEvent.VK_8: // SHIFT + 8 = '*'
                        if (e.isShiftDown()) {
                            System.out.println("a * b = " + (a * b));
                        }
                        break;

                    case KeyEvent.VK_SLASH:
                        System.out.println("a / b = " + (a / b));
                        break;

                    case KeyEvent.VK_5:  // SHIFT + 5 = '%'
                        if (e.isShiftDown()) {
                            System.out.println("a % b = " + (a % b));
                        }
                        break;
                }
            }
        });

        setVisible(true);
        // Necessary to focus the window for key events
        setFocusable(true);
        requestFocusInWindow();
    }

    public static void main(String[] args) {
        new KeyCalc();
    }
}
