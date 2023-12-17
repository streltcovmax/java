import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyPanel extends JPanel
{
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField f1, f2, f3, f4, f5, f6;
    JTextArea a;
    JButton b1, b2, b3;
    Group group;
    MyPanel()
    {
        group = new Group();
        l1=new JLabel("FIO");
        add(l1);
        f1=new JTextField();
        f1.setColumns(10);
        add(f1);
        l2=new JLabel("Course");
        add(l2);
        f2=new JTextField();
        f2.setColumns(10);
        add(f2);
        l3=new JLabel("Mark 1");
        add(l3);
        f3=new JTextField();
        f3.setColumns(10);
        add(f3);
        l4=new JLabel("Mark 2");
        add(l4);
        f4=new JTextField();
        f4.setColumns(10);
        add(f4);
        l5=new JLabel("Mark 3");
        add(l5);
        f5=new JTextField();
        f5.setColumns(10);
        add(f5);
        l6=new JLabel("Na otchislenie");
        add(l6);
        f6=new JTextField();
        f6.setColumns(10);
        add(f6);
        a=new JTextArea();
        a.setColumns(30);
        a.setRows(10);
        add(a);
        b1=new JButton("Add");
        add(b1);
        b2=new JButton("Del");
        add(b2);
        b3=new JButton("Sort");
        add(b3);
        MyListener1 listener1 = new MyListener1();
        MyListener2 listener2 = new MyListener2();
        MyListener3 listener3 = new MyListener3();
        b1.addActionListener(listener1);
        b2.addActionListener(listener2);
        b3.addActionListener(listener3);
    }
    class MyListener1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            group.add(new Student(f1.getText(), Integer.parseInt(f2.getText()), Integer.parseInt(f3.getText()),
                    Integer.parseInt(f4.getText()), Integer.parseInt(f5.getText())));
            ResetFields();
            a.setText(group.toString());
        }
    }
    class MyListener2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            group.del(f6.getText());
            a.setText(group.toString());
            ResetFields();
        }
    }

    class MyListener3 implements  ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            group.sort();
            a.setText(group.toString());
        }
    }

    void ResetFields()
    {
        f1.setText("");
        f2.setText("");
        f3.setText("");
        f4.setText("");
        f5.setText("");
        f6.setText("");
    }
}