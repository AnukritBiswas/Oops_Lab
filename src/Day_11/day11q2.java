package Day_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StringGUI extends JFrame implements ActionListener {

    JTextField t1 = new JTextField(25);
    JTextField t2 = new JTextField(25);

    String b[]={"IN CAPS","IN SMALL","CONVERT CASE","WORDS","LETTERS",
            "REVERSE","VOWELS","FREQUENCY","BEGIN CAPS","RESET"};

    JButton bt[]=new JButton[10];

    public StringGUI(){

        setTitle("String Operations");
        setLayout(new BorderLayout());

        JPanel top=new JPanel(new GridLayout(2,2,5,5));
        top.add(new JLabel("Enter the string:"));
        top.add(t1);
        top.add(new JLabel("Result:"));
        top.add(t2);

        add(top,BorderLayout.NORTH);

        JPanel mid=new JPanel(new GridLayout(2,5,10,10));

        for(int i=0;i<10;i++){
            bt[i]=new JButton(b[i]);
            mid.add(bt[i]);
            bt[i].addActionListener(this);
        }

        add(mid,BorderLayout.CENTER);

        setSize(700,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){

        String s=t1.getText();
        String r="";

        if(e.getActionCommand().equals("IN CAPS"))
            r=s.toUpperCase();

        if(e.getActionCommand().equals("IN SMALL"))
            r=s.toLowerCase();

        if(e.getActionCommand().equals("CONVERT CASE")){
            for(char c:s.toCharArray())
                r+=Character.isUpperCase(c)?Character.toLowerCase(c):Character.toUpperCase(c);
        }

        if(e.getActionCommand().equals("WORDS"))
            r="Words: "+s.trim().split("\\s+").length;

        if(e.getActionCommand().equals("LETTERS"))
            r="Letters: "+s.replace(" ","").length();

        if(e.getActionCommand().equals("REVERSE"))
            r=new StringBuilder(s).reverse().toString();

        if(e.getActionCommand().equals("VOWELS")){
            int v=0;
            for(char c:s.toLowerCase().toCharArray())
                if("aeiou".indexOf(c)>=0) v++;
            r="Vowels: "+v;
        }

        if(e.getActionCommand().equals("FREQUENCY")){
            if(s.length()==0) return;
            char c=s.charAt(0);
            int f=0;
            for(char x:s.toCharArray())
                if(x==c) f++;
            r="Frequency of '"+c+"' = "+f;
        }

        if(e.getActionCommand().equals("BEGIN CAPS")){
            String w[]=s.split(" ");
            for(String x:w)
                r+=Character.toUpperCase(x.charAt(0))+x.substring(1).toLowerCase()+" ";
        }

        if(e.getActionCommand().equals("RESET")){
            t1.setText("");
            t2.setText("");
            return;
        }

        t2.setText(r);
    }

    public static void main(String args[]){
        new StringGUI();
    }
}
