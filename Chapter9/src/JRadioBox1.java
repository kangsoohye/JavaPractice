import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class JRadio extends JFrame implements ActionListener
{
   JLabel jl1, jl2, result;
   JCheckBox jcb1, jcb2, jcb3, jcb4, jcb5;
   JRadioButton jr1, jr2, jr3, jr4, jr5;
   ButtonGroup bg;
   
   public JRadio()
   {
      jl1 = new JLabel("당신의 취미는?");
      jl2 = new JLabel("당신의 나이는?");
      result = new JLabel("");
      
      jr1 = new JRadioButton("걷기");
      jr2 = new JRadioButton("등산");
      jr3 = new JRadioButton("골프");
      jr4 = new JRadioButton("스킨스쿠버");
      jr5 = new JRadioButton("페러글라이딩");
      
      jcb1 = new JCheckBox("20대");
      jcb2 = new JCheckBox("30대");
      jcb3 = new JCheckBox("40대");
      jcb4 = new JCheckBox("50대");
      jcb5 = new JCheckBox("60대");
      
      bg = new ButtonGroup();
      bg.add(jcb1);
      bg.add(jcb2);
      bg.add(jcb3);
      bg.add(jcb4);
      bg.add(jcb5);
      
      jr1.addActionListener(this);
      jr2.addActionListener(this);
      jr3.addActionListener(this);
      jr4.addActionListener(this);
      jr5.addActionListener(this);
      
      jcb1.addActionListener(this);
      jcb2.addActionListener(this);
      jcb3.addActionListener(this);
      jcb4.addActionListener(this);
      jcb5.addActionListener(this);
      
      Container ct = getContentPane();
      ct.setLayout(new GridLayout(3,1));
      
      JPanel jp1 = new JPanel();
      JPanel hobbies = new JPanel();
      JPanel jp2 = new JPanel();
      JPanel age = new JPanel();
      JPanel jp3 = new JPanel();
      
      hobbies.add(jr1);
      hobbies.add(jr2);
      hobbies.add(jr3);
      hobbies.add(jr4);
      hobbies.add(jr5);
      
      jp1.add(jl1);
      jp1.add(hobbies);
      
      age.add(jcb1);
      age.add(jcb2);
      age.add(jcb3);
      age.add(jcb4);
      age.add(jcb5);
      
      jp2.add(jl2);
      jp2.add(age);
      
      jp3.add(result);
      
      ct.add(jp1);
      ct.add(jp2);
      ct.add(jp3);
      
      setTitle("JRadioButton Test1");
      setSize(400,400);
      setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      String s = "당신의 취미: ";
      String ss = e.getActionCommand();
      
      if(jr1.isSelected() == true)
      {
         System.out.println("걷기 선택!");
      }
      
      if(jr2.isSelected() == true)
      {
         System.out.println("등산 선택!");
      }
      
      if(jr3.isSelected() == true)
      {
         System.out.println("골프 선택!");
      }
      
      if(jr4.isSelected() == true)
      {
         System.out.println("스킨스쿠버 선택!");
      }
      
      if(jr5.isSelected() == true)
      {
         System.out.println("페러글라이딩 선택!");
      }
      
      
   }
   
}

public class JRadioBox1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      new JRadio();
   }

}