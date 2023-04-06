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
      jl1 = new JLabel("����� ��̴�?");
      jl2 = new JLabel("����� ���̴�?");
      result = new JLabel("");
      
      jr1 = new JRadioButton("�ȱ�");
      jr2 = new JRadioButton("���");
      jr3 = new JRadioButton("����");
      jr4 = new JRadioButton("��Ų�����");
      jr5 = new JRadioButton("�䷯�۶��̵�");
      
      jcb1 = new JCheckBox("20��");
      jcb2 = new JCheckBox("30��");
      jcb3 = new JCheckBox("40��");
      jcb4 = new JCheckBox("50��");
      jcb5 = new JCheckBox("60��");
      
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
      String s = "����� ���: ";
      String ss = e.getActionCommand();
      
      if(jr1.isSelected() == true)
      {
         System.out.println("�ȱ� ����!");
      }
      
      if(jr2.isSelected() == true)
      {
         System.out.println("��� ����!");
      }
      
      if(jr3.isSelected() == true)
      {
         System.out.println("���� ����!");
      }
      
      if(jr4.isSelected() == true)
      {
         System.out.println("��Ų����� ����!");
      }
      
      if(jr5.isSelected() == true)
      {
         System.out.println("�䷯�۶��̵� ����!");
      }
      
      
   }
   
}

public class JRadioBox1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      new JRadio();
   }

}