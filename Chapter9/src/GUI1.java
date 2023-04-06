import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

class GG1 extends JFrame implements ActionListener
{
	JTextField jtf;
	String op1, op2;
	double dd;
	
	public GG1()
	{
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout(5,5));
		
		jp1.setLayout(new GridLayout(1,1,5,5));
		jtf = new JTextField(20);
		jp1.add(jtf);
		jtf.setText("");
		jtf.setEditable(false);
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		jp1.setBorder(new TitledBorder("계산 결과 창"));
		
		
		jp2.setLayout(new GridLayout(1,2,5,5));
		jp2.setBorder(new TitledBorder("지우기 버튼"));
		JButton jb1 = new JButton("Backspace");
		JButton jb2 = new JButton("C");
		jp2.add(jb1);
		jp2.add(jb2);
		
		jp3.setLayout(new GridLayout(4,5,5,5));
		jp3.setBorder(new TitledBorder("계산기 입력 버튼"));
		JButton jb3 = new JButton("7");
		JButton jb4 = new JButton("8");
		JButton jb5 = new JButton("9");
		JButton jb6 = new JButton("/");
		JButton jb7 = new JButton("sqrt");
		JButton jb8 = new JButton("4");
		JButton jb9 = new JButton("5");
		JButton jb10 = new JButton("6");
		JButton jb11 = new JButton("*");
		JButton jb12 = new JButton("%");
		JButton jb13 = new JButton("1");
		JButton jb14 = new JButton("2");
		JButton jb15 = new JButton("3");
		JButton jb16 = new JButton("-");
		JButton jb17 = new JButton("1/x");
		JButton jb18 = new JButton("0");
		JButton jb19 = new JButton("+/-");
		JButton jb20 = new JButton(".");
		JButton jb21 = new JButton("+");
		JButton jb22 = new JButton("=");
		
		jp3.add(jb3);
		jp3.add(jb4);
		jp3.add(jb5);
		jp3.add(jb6);
		jp3.add(jb7);
		jp3.add(jb8);
		jp3.add(jb9);
		jp3.add(jb10);
		jp3.add(jb11);
		jp3.add(jb12);
		jp3.add(jb13);
		jp3.add(jb14);
		jp3.add(jb15);
		jp3.add(jb16);
		jp3.add(jb17);
		jp3.add(jb18);
		jp3.add(jb19);
		jp3.add(jb20);
		jp3.add(jb21);
		jp3.add(jb22);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		jb7.addActionListener(this);
		jb8.addActionListener(this);
		jb9.addActionListener(this);
		jb10.addActionListener(this);
		jb11.addActionListener(this);
		jb12.addActionListener(this);
		jb13.addActionListener(this);
		jb14.addActionListener(this);
		jb15.addActionListener(this);
		jb16.addActionListener(this);
		jb17.addActionListener(this);
		jb18.addActionListener(this);
		jb19.addActionListener(this);
		jb20.addActionListener(this);
		jb21.addActionListener(this);
		jb22.addActionListener(this);
		
		ct.add(jp1, BorderLayout.NORTH);
		ct.add(jp2, BorderLayout.CENTER);
		ct.add(jp3, BorderLayout.SOUTH);
		
		setTitle("Calculator");
		setSize(400,300);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

		String s = e.getActionCommand();
		String jtfs = jtf.getText();
		
		if(s == "Backspace")
		{
			String a = jtf.getText();
			a = a.substring(0, a.length()-1);
			jtf.setText(a);
		}
		
		if(s == "C")
		{
			jtf.setText("");
		}
		
		if(s == "0" || s == "1" || s == "2" || s == "3" || s == "4" || s == "5" || s == "6" || s == "7" || s == "8" || s == "9" || s == ".")
		{
			
			jtf.setText(jtfs + s);
		}
		
		if(s == "+" || s == "-" || s == "*" || s == "/")
		{
			jtf.setText("");
			op1 = jtfs;
			op2 = s;
		}
		
		if(s == "=")
		{
			char c = op2.charAt(0);
			
			switch(c)
			{
			case '+' : dd = Double.parseDouble(op1) + Double.parseDouble(jtfs);
			jtf.setText(dd + "");
			break;
			
			case '-' : dd = Double.parseDouble(op1) - Double.parseDouble(jtfs);
			jtf.setText(dd + "");
			break;
			
			case '*' : dd = Double.parseDouble(op1) * Double.parseDouble(jtfs);
			jtf.setText(dd + "");
			break;
			
			case '/' : dd = Double.parseDouble(op1) / Double.parseDouble(jtfs);
			jtf.setText(dd + "");
			break;
			}
			
		}
		
		if(s == "sqrt")
		{
			dd = Math.sqrt(Double.parseDouble(jtfs));
			jtf.setText(dd + "");
		}
		
		if(s == "%")
		{
			dd = Double.parseDouble(op1)/100*Double.parseDouble(jtfs);
			jtf.setText(dd + "");
		}
		
		if(s == "1/x")
		{
			dd = 1/Double.parseDouble(jtfs);
			jtf.setText(dd + "");
		}
		
		if(s == "+/-")
		{
			dd = (-1) * Double.parseDouble(jtfs);
			jtf.setText(dd + "");
		}
	}
	
}
public class GUI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		new GG1(); 
	}

}
