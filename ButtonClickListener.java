import javax.swing.*;
import java.awt.event.*;

public class ButtonClickListener implements ActionListener
{
  public static String col="";
  public void actionPerformed(ActionEvent event)
  {
	   if(event.getActionCommand().equals("PINK"))
	   {
		   //System.out.println("Hello");
		   col="PINK";
	   }
	   else if(event.getActionCommand().equals("GREEN"))
	   {
		   col="GREEN";
		   
	   }
	 
  }
   
}