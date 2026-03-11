package Day_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {

    JTextField t = new JTextField();
    double n1 = 0;
    String op = "";

    Calculator() {
        setTitle("Calculator");
        setSize(250,300);
        setLayout(new BorderLayout());

        t.setEditable(false);
        add(t, BorderLayout.NORTH);

        String b[] = {"1","2","3","+",
                "4","5","6","-",
                "7","8","9","*",
                "/","0","%","="};

        JPanel p = new JPanel(new GridLayout(4,4));

        for(String x : b){
            JButton bt = new JButton(x);
            bt.addActionListener(this);
            p.add(bt);
        }

        add(p, BorderLayout.CENTER);

        JButton off = new JButton("OFF");
        off.addActionListener(e -> System.exit(0));
        add(off, BorderLayout.SOUTH);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        if("0123456789".contains(s))
            t.setText(t.getText()+s);

        else if("+-*/%".contains(s)) {
            n1 = Double.parseDouble(t.getText());
            op = s;
            t.setText("");
        }

        else if(s.equals("=")) {
            double n2 = Double.parseDouble(t.getText());
            double r = 0;

            switch(op){
                case "+": r = n1+n2; break;
                case "-": r = n1-n2; break;
                case "*": r = n1*n2; break;
                case "/": r = n1/n2; break;
                case "%": r = n1%n2; break;
            }

            t.setText(""+r);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
