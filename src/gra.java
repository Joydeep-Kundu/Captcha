import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
public class gra {
    design d=new design();
    String a;
    public gra() {
        a=new String(d.genStrCap());
        JFrame f=new JFrame("Button Example");

        JLabel l1=new JLabel(a);JLabel l2=new JLabel();
        l2.setBounds(250,140,100,30);
        l1.setBounds(50,110, 100,30);
        l1.setFont(new Font("Verdana", Font.PLAIN, 18));
        l2.setFont(new Font("Verdana", Font.PLAIN, 18));
        l2.setForeground(new Color(127, 0, 0));
        f.add(l1);
        f.add(l2);
        final JTextField tf=new JTextField();
        tf.setBounds(50,150, 150,20);
        JButton b=new JButton("Submit");
        b.setBounds(50,200,95,30);
        JButton b1=new JButton("Reset");
        b1.setBounds(150,200,95,30);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                a=new String(d.genStrCap());
                l1.setText(a);

            }});
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(a.equals(tf.getText())){
                    System.out.println("right");
                    System.exit(0);
                }
                l2.setText("worng");
                tf.setText("");

            }
        });
        f.add(b);f.add(tf);
        f.add(b1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}