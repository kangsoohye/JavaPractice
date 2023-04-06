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

class JR4 extends JFrame implements ActionListener
{
	JLabel jl1, jl2, result;
	JRadioButton jr[] = new JRadioButton[5];
	String hobbies[] = {"걷기", "등산", "골프", "스킨스쿠버", "페러글라이딩"};
	JCheckBox jc[] = new JCheckBox[5];
	String ages[] = {"20대", "30대", "40대", "50대", "60대"};
	ButtonGroup bg;
	
	public JR4()
	{
		JPanel jp1 = new JPanel();
		JPanel hobby = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel age = new JPanel();
		JPanel jp3 = new JPanel();
		bg = new ButtonGroup();
		
		jl1 = new JLabel("당신의 취미는?");
		jl2 = new JLabel("당신의 나이는?");
		result = new JLabel();
		
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3,1));
		
		for(int i=0; i<jr.length; i++)
		{
			jr[i] = new JRadioButton(hobbies[i]);
			jc[i] = new JCheckBox(ages[i]);
			
			jr[i].addActionListener(this);
			jc[i].addActionListener(this);
			
			
			hobby.add(jr[i]);
			age.add(jc[i]);
			bg.add(jc[i]);
			
		}
		
		jp1.add(jl1);
		jp1.add(hobby);
		
		jp2.add(jl2);
		jp2.add(age);
		
		jp3.add(result);
		
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		
		setTitle("JRadioButton Test1");
		setSize(370,300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String s1 = "당신의 취미는: ";
		String s2 = " 당신의 나이는: ";
		String data = "";
		
		for(int j=0; j<jr.length; j++)
		{
			if(jr[j].isSelected() == true)
			{
				data += jr[j].getText(); 
				result.setText(data);
			}
		}
		
		for(int j=0; j<jc.length; j++)
		{
			if(jc[j].isSelected() == true)
			{
				result.setText(s1 + data + s2 + ages[j]);
			}
		}
	}
	
}

public class JRadio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JR4();
	}

}
