/**
 * Created by Home on 16.12.2020.
 */import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui1 extends JFrame {
    JButton b1,b2,b3,b4;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    int i,k;
    String a,b;
    eHandler handler =new eHandler();
    public Gui1(String s){
        super(s);
        setLayout(new FlowLayout());
        b1 =new JButton("ПОЛУЧИТЬ СУММУ" );
        b2 =new JButton("ПОЛУЧИТЬ РАЗНИЦУ");
        b3 =new JButton("ПОЛУЧИТЬ ПРОИЗВЕДЕНИЕ" );
        b4 =new JButton("ПОЛУЧИТЬ ОСТАТОК ОТ ДЕЛЕНИЯ");
        l1= new JLabel("Первое число");
        l2 =new JLabel("Второе число ");
        l3 =new JLabel("");
        l4 =new JLabel("");
        t1 =new JTextField(10);
        t2 =new JTextField(10);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(l4);
        b2.addActionListener(handler);
        b1.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);

    }
    public class eHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
            if(e.getSource()==b1){
                String s =t1.getText();
                String s2=t2.getText();
                i =Integer.parseInt(s);
                k=Integer.parseInt(s2);
                int plusResult =i+k;
                String Plusres=""+plusResult;
                l3.setText(Plusres);
            }
                if (e.getSource()==b3){
                    String s =t1.getText();
                    String s2=t2.getText();
                    i =Integer.parseInt(s);
                    k=Integer.parseInt(s2);
                    int Multyiresult =i*k;
                    String Plusres=""+Multyiresult;
                    l3.setText(Plusres);

                }
                if(e.getSource()==b4){
                    String s =t1.getText();
                    String s2=t2.getText();
                    i =Integer.parseInt(s);
                    k=Integer.parseInt(s2);
                    int divisRes =i%k;
                    String divisResult=""+divisRes;
                    l3.setText(divisResult);
                }
            if(e.getSource()==b2){
                String s =t1.getText();
                String s2 =t2.getText();
                i =Integer.parseInt(s);
                k=Integer.parseInt(s2);
                int minusResult =i-k;
                String Minusres=""+minusResult;
                l3.setText( Minusres);

            }

        }catch (Exception e1 ){JOptionPane.showMessageDialog(null,"Введите число");}
    }

        }}


