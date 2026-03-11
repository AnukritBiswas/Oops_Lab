package Day_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {

    JTextField t1, t2;
    JButton caps, small, convert, words, letters, reverse, vowels, freq, begin, reset;

    public MyFrame() {

        setTitle("My Frame");
        setSize(900,500);
        setLayout(null);

        getContentPane().setBackground(new Color(230,150,150));

        JLabel l1 = new JLabel("Enter the string:");
        l1.setBounds(120,100,120,25);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(250,100,300,25);
        add(t1);

        JLabel l2 = new JLabel("String in upper case:");
        l2.setBounds(100,150,150,25);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(250,150,300,25);
        add(t2);

        caps = new JButton("IN CAPS");
        caps.setBounds(60,320,100,30);

        small = new JButton("IN SMALL");
        small.setBounds(200,320,120,30);

        convert = new JButton("CONVERT CASE");
        convert.setBounds(360,320,150,30);

        words = new JButton("WORDS");
        words.setBounds(560,320,100,30);

        letters = new JButton("LETTERS");
        letters.setBounds(700,320,100,30);

        reverse = new JButton("REVERSE");
        reverse.setBounds(120,360,120,30);

        vowels = new JButton("VOWELS");
        vowels.setBounds(300,360,120,30);

        freq = new JButton("FREQUENCY");
        freq.setBounds(480,360,130,30);

        begin = new JButton("BEGIN CAPS");
        begin.setBounds(650,360,130,30);

        reset = new JButton("RESET");
        reset.setBounds(380,410,120,35);
        reset.setBackground(Color.blue);
        reset.setForeground(Color.white);

        add(caps); add(small); add(convert); add(words); add(letters);
        add(reverse); add(vowels); add(freq); add(begin); add(reset);

        caps.addActionListener(this);
        small.addActionListener(this);
        convert.addActionListener(this);
        words.addActionListener(this);
        letters.addActionListener(this);
        reverse.addActionListener(this);
        vowels.addActionListener(this);
        freq.addActionListener(this);
        begin.addActionListener(this);
        reset.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String str = t1.getText();

        if(e.getSource()==caps)
            t2.setText(str.toUpperCase());

        else if(e.getSource()==small)
            t2.setText(str.toLowerCase());

        else if(e.getSource()==convert) {
            String result="";
            for(char c: str.toCharArray()){
                if(Character.isUpperCase(c))
                    result+=Character.toLowerCase(c);
                else
                    result+=Character.toUpperCase(c);
            }
            t2.setText(result);
        }

        else if(e.getSource()==words) {
            String[] w = str.trim().split("\\s+");
            t2.setText("Total Words: "+w.length);
        }

        else if(e.getSource()==letters) {
            int count=0;
            for(char c: str.toCharArray())
                if(Character.isLetter(c))
                    count++;
            t2.setText("Letters: "+count);
        }

        else if(e.getSource()==reverse) {
            String rev="";
            for(int i=str.length()-1;i>=0;i--)
                rev+=str.charAt(i);
            t2.setText(rev);
        }

        else if(e.getSource()==vowels) {
            int v=0;
            for(char c:str.toLowerCase().toCharArray())
                if("aeiou".indexOf(c)!=-1)
                    v++;
            t2.setText("Vowels: "+v);
        }

        else if(e.getSource()==freq) {
            int f=0;
            if(str.length()>0){
                char ch=str.charAt(0);
                for(char c:str.toCharArray())
                    if(c==ch)
                        f++;
                t2.setText("Frequency of '"+ch+"' = "+f);
            }
        }

        else if(e.getSource()==begin) {
            String[] w=str.split(" ");
            String res="";
            for(String word:w)
                res+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
            t2.setText(res);
        }

        else if(e.getSource()==reset) {
            t1.setText("");
            t2.setText("");
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
