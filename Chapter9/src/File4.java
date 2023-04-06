import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class FT7 extends JFrame implements ActionListener
{
	JTextField jtf1, jtf2;
	JTextArea jta;
	JButton jb1, jb2;
	
	public FT7()
	{
		jtf1 = new JTextField(20);
		jtf2 = new JTextField(20);
		jta = new JTextArea(10,20);
		jb1 = new JButton("파일 읽어오기");
		jb2 = new JButton("파일 저장하기");
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		jp1.add(jtf1);
		jp1.add(jb1);
		
		jp2.add(jtf2);
		jp2.add(jb2);
		
		ct.add(jp1);
		ct.add(jta);
		ct.add(jp2);
		
		setTitle("JTFJTA4 Test");
		setSize(500,400);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String s = e.getActionCommand();
		
		if(s == "파일 읽어오기")
		{
			try
			{
				String t = jtf1.getText();
				FileInputStream fis = new FileInputStream(t);
				DataInputStream dis = new DataInputStream(fis);
				jta.setText(dis.readUTF());
				
				fis.close();
				dis.close();
				System.out.println("파일 읽어오기 성공");
				
			}
			catch(Exception ee)
			{
				System.out.println("파일 읽어오기 실패");
			}
		}
		else
		{
			if(s == "파일 저장하기")
			{
				try
				{
					String t = jtf2.getText();
					FileOutputStream fos = new FileOutputStream(t);
					DataOutputStream dos = new DataOutputStream(fos);
					dos.writeUTF(jta.getText());
					
					fos.close();
					dos.close();
					System.out.println("파일 저장하기 성공");
					
				}
				catch(Exception ee)
				{
					System.out.println("파일 저장하기 실패");
				}
			}
		}
	}
	
}
public class File4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new FT7();
	}

}
