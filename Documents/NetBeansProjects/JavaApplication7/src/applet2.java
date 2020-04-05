/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import javax.swing.*;
import java.awt.event.*;
 import java.awt.*;
import java.applet.*;
class kesh extends JFrame implements ActionListener
{
    JFrame f1;
    Panel p1,p2,p3,p4;
    TextArea ta; 
    JButton mb[]=new JButton[7];
    String ms[]={"mr","ms","m-","m+","<-","clr","mc"};
    JButton md[]=new JButton[10];
    String me[]={"0","1","2","3","4","5","6","7","8","9"};
    JButton mo[]=new JButton[7];
    String sm[]={"sq"," --","/","*","+","%","="};
    int sum;
    String op;
    int pp;
    int add;
kesh()
{
 sum=0;
 op="+";   
f1=new JFrame("my frame");
f1.setSize(530,520);
f1.setBackground(Color.blue); 
f1.setLayout(null);
p1=new Panel();
p2=new Panel();
p3=new Panel();
p4=new Panel();
ta=new TextArea();
p1.setBounds(0,30,530,40);
p2.setBounds(0,80,530,50);
p3.setBounds(0,140,530,270);
p4.setBounds(0,420,520,70);
f1.add(p1);
f1.add(p2);
f1.add(p3);
f1.add(p4);
p1.add(ta);
p2.setLayout(new GridLayout(1,7));
p3.setLayout(new GridLayout(4,3));
p4.setLayout(new GridLayout(1,7));

for(int i=0;i<7;i++)
{
    mb[i]=new JButton(ms[i]);
    mb[i].addActionListener(this);
    p2.add(mb[i]);
   
}

for(int i=0;i<10;i++)
{ 
    md[i]=new JButton(me[i]);
    md[i].addActionListener(this);
    p3.add(md[i]);
}

for(int i=0;i<7;i++)
{
    mo[i]=new JButton(sm[i]);
    mo[i].addActionListener(this);
    p4.add(mo[i]);
}
 f1.setVisible(true); 
}
public void actionPerformed(ActionEvent e)
{   int i;
    
    for( i=0;i<10;i++)
    {
       if(e.getSource()==md[i])
      {
        ta.append(String.valueOf(i));
      }
    }
   for(i=1;i<6;i++)
   {
   if(e.getSource()==mo[i])
   {
     pp=Integer.parseInt(ta.getText());
   
       if(op.equals("+"))
       {
           sum=sum+pp;
       }
       else if(op.equals("-"))
       {
           sum=sum-pp;
       }
       else if(op.equals("/"))
       {
           sum=sum/pp;
       }
       else if(op.equals("*"))
       {
           sum=sum*pp;
       }
              
       else if(op.equals("%"))
       {
           sum=sum%pp;
       }
        op=sm[i];
       ta.setText("");    
       System.out.println(sum);
   }
}  

     if(e.getSource()==mo[6])
     {
         
     pp=Integer.parseInt(ta.getText());
   
       if(op.equals("+"))
       {
           sum=sum+pp;
       }
       else if(op.equals("-"))
       {
           sum=sum-pp;
       }
       else if(op.equals("/"))
       {
           sum=sum/pp;
       }
       else if(op.equals("*"))
       {
           sum=sum*pp;
       }
       
       else if(op.equals("%"))
       {
           sum=sum%pp;
       } 
     
        ta.setText(String.valueOf(sum));         
     }

       if(e.getSource()==mb[5])
       {
       ta.setText("");
        sum=0;
        op="+";
       }
       if(e.getSource()==mo[0])
       {
       int sq=Integer.parseInt(ta.getText());
       sq=sq*sq;         
       ta.setText(String.valueOf(sq));
       }
        if(e.getSource()==mb[1])
        {
        add=Integer.parseInt(ta.getText());
        ta.setText("");
        }
        if(e.getSource()==mb[0])
        {
           ta.setText(String.valueOf(add));
        }
        if(e.getSource()==mb[2])
        {
       add=add-Integer.parseInt(ta.getText());
        }
        if(e.getSource()==mb[3])
        {
            add=add+Integer.parseInt(ta.getText());
        }
        if(e.getSource()==mb[6])
        {
            add=0;
        }
        if(e.getSource()==mb[4])
        {
        int test=Integer.parseInt(ta.getText());
        test=test/10;
        ta.setText(String.valueOf(test));
        }    
    } 

}
public class applet2 {
    public static void main(String args[])
    {
        kesh L=new kesh();
    }
}
