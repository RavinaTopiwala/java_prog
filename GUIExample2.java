import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
class GUIExample2 
{
  public static void main(String args[]){
    JFrame f = new JFrame("My Frame");
    f.setLayout(new BorderLayout());
	EtchedBorder edge=new EtchedBorder(EtchedBorder.RAISED);
    JPanel panel1 = new JPanel();
	panel1.setBorder(edge);
	
    //p.add(new JLabel("A Panel"));
	JPanel panel2=new JPanel();	
	panel2.setBorder(edge);
	JButton btn1=new JButton("PINK");
	btn1.setName("PINK");	
	JButton btn2=new JButton("GREEN");
	btn2.setName("GREEN");
	/*btn1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
                panel2.setBackground(Color.PINK);
        }
    });*/
	/*btn2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
                panel2.setBackground(Color.GREEN);
        }
    });*/


	btn1.addActionListener(new ButtonClickListener());
	btn2.addActionListener(new ButtonClickListener());
	panel2.add(btn1);
	panel2.add(btn2);
	
	JPanel panel3=new JPanel();
	panel3.setBorder(edge);
	JPanel panel4=new JPanel();
	panel4.setBorder(edge);
	JPanel panel5=new JPanel();
	panel5.setBorder(edge);
	JCheckBox cb1=new JCheckBox ("EAST");
	cb1.addItemListener(new CheckBoxListener());
    
	JCheckBox cb2=new JCheckBox("WEST");
	cb2.addItemListener(new CheckBoxListener());
	JCheckBox cb3=new JCheckBox("NORTH");
	cb3.addItemListener(new CheckBoxListener());
	JCheckBox cb4=new JCheckBox("SOUTH");
	cb4.addItemListener(new CheckBoxListener());
	JCheckBox cb5=new JCheckBox("CENTER");
	cb5.addItemListener(new CheckBoxListener());
	//ActionListener actionListener = new ActionHandler();
    //cb1.addComponentListener();
    //cb2.addActionListener(actionListener);
    //cb3.addActionListener(actionListener);


	panel1.add(cb1);
	panel2.add(cb2);
	panel3.add(cb3);
	panel4.add(cb4);
	panel5.add(cb5);	
	
    f.add(panel1, BorderLayout.EAST);
	f.add(panel2, BorderLayout.WEST);
	f.add(panel3, BorderLayout.NORTH);
	f.add(panel4, BorderLayout.SOUTH);
	f.add(panel5, BorderLayout.CENTER);
	
    f.setBounds(50,100,400,400);
	//panel1.setLayout(new BorderLayout());

   
    f.setVisible(true);
	
}
}

 

  

