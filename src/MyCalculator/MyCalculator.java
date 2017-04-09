package MyCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator {
    MyCalculator(String name) {
        JFrame jFrame = new JFrame(name);
        jFrame.setLayout(null);
        jFrame.setSize(330, 305);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);

        final TextField display = new TextField("");

        display.setEditable(false);
        display.setBounds(10, 4, 300, 22);
        display.setBackground(Color.WHITE);
        jFrame.add(display);

        Button b1 = new Button("1");
        b1.setBounds(10, 30, 60, 40);
        jFrame.add(b1);
        Button b2 = new Button("2");
        b2.setBounds(80, 30, 60, 40);
        jFrame.add(b2);
        Button b3 = new Button("3");
        b3.setBounds(150, 30, 60, 40);
        jFrame.add(b3);
        Button b4 = new Button("4");
        b4.setBounds(10, 80, 60, 40);
        jFrame.add(b4);
        Button b5 = new Button("5");
        b5.setBounds(80, 80, 60, 40);
        jFrame.add(b5);
        Button b6 = new Button("6");
        b6.setBounds(150, 80, 60, 40);
        jFrame.add(b6);
        Button b7 = new Button("7");
        b7.setBounds(10, 130, 60, 40);
        jFrame.add(b7);
        Button b8 = new Button("8");
        b8.setBounds(80, 130, 60, 40);
        jFrame.add(b8);
        Button b9 = new Button("9");
        b9.setBounds(150, 130, 60, 40);
        jFrame.add(b9);
        Button b0 = new Button("0");
        b0.setBounds(60, 180, 100, 40);
        jFrame.add(b0);
        Button result = new Button("=");
        result.setBounds(10, 230, 210, 40);
        result.setBackground(Color.GRAY);
        jFrame.add(result);
        Button bplusminus = new Button("+/-");
        bplusminus.setBounds(10, 180, 40, 40);
        jFrame.add(bplusminus);
        Button bPlus = new Button("+");
        bPlus.setBounds(230, 30, 80, 40);
        bPlus.setBackground(Color.gray);
        jFrame.add(bPlus);
        Button bMinus = new Button("-");
        bMinus.setBounds(230, 80, 80, 40);
        bMinus.setBackground(Color.gray);
        jFrame.add(bMinus);
        Button bMultiplication = new Button("*");
        bMultiplication.setBounds(230, 130, 80, 40);
        bMultiplication.setBackground(Color.gray);
        jFrame.add(bMultiplication);
        Button bDivision = new Button("/");
        bDivision.setBounds(230, 180, 80, 40);
        bDivision.setBackground(Color.gray);
        jFrame.add(bDivision);
        Button c = new Button("C");
        c.setBounds(230, 230, 80, 40);
        c.setBackground(Color.gray);
        jFrame.add(c);


        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + "1");
            }
        });



        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + "2");
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + "3");
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + "4");
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + "5");
            }
        });
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + "6");
            }
        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + "7");
            }
        });
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + "8");
            }
        });
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + "9");
            }
        });
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + "0");
            }
        });

        bplusminus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                StringBuffer s = new StringBuffer(String.valueOf(display.getText()));
                if (s.charAt(0) != '-') {
                    display.setText("-" + s);
                } else {
                    s.deleteCharAt(0);
                    display.setText(String.valueOf(s));
                }
            }
        });

        bPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + '+');
            }
        });
        bMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + '-');
            }
        });
        bDivision.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + '/');
            }
        });
        bMultiplication.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                display.setText(display.getText() + '*');
            }
        });
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                display.setText("");
            }
        });

        result.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String str = display.getText();
                String res = "";
                if (stringOperation(str) == -1) {
                    display.setText("Во введенной строке нет доступных операций!");
                } else {
                    char op = str.charAt(stringOperation(str));
                    String firstNumber = str.substring(0, stringOperation(str));
                    String secondNumber = str.substring(stringOperation(str) + 1, str.length());
                    int number1 = Integer.parseInt(firstNumber);
                    int number2 = Integer.parseInt(secondNumber);
                    switch (op) {
                        case '+':
                            res = "" + (number1 + number2);
                            break;
                        case '-':
                            res = "" + (number1 - number2);
                            break;
                        case '*':
                            res = "" + (number1 * number2);
                            break;
                        case '/':
                            if (op == '/' && number2 == 0) {
                                res = "На 0 делить нельзя!";
                                break;
                            } else {
                                res = "" + (number1 / number2);
                                break;
                            }
                    }
                    display.setText(res);
                }
            }
        });
    }

    private int stringOperation(String str) {
        for (int count = 0; count < str.length(); count++) {
            if (str.charAt(count) == '-' || str.charAt(count) == '+' || str.charAt(count) == '*' || str.charAt(count) == '/') {
                if (count == 0) {
                    continue;
                }
                return count;
            }
        }
        return -1;
    }
}
