import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class CheckBoxListener implements ItemListener {
    public void itemStateChanged(ItemEvent e)
        {
			JCheckBox chk=(JCheckBox)e.getItem();
			if(chk.isSelected())
			{
				if(ButtonClickListener.col=="PINK")
				{
					chk.getParent().setBackground(Color.PINK);
				}
				else if(ButtonClickListener.col=="GREEN")
				{
					chk.getParent().setBackground(Color.GREEN);
				}
				else
				{
					chk.getParent().setBackground(Color.CYAN);
				}
				
			}
			else
			{
				chk.getParent().setBackground(null);
			}
			
			
     
       }
}
 
