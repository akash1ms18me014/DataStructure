package miniproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Singlylinkedlist extends JFrame {

	private JPanel contentPane;
	private JTextField rearele;
	private JTextField frontele;
	private JTextField displaybox;
	class node
	{
	int data;
	node link;
	}
	private node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Singlylinkedlist frame = new Singlylinkedlist();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Singlylinkedlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		heading.setForeground(new Color(0, 0, 205));
		heading.setFont(new Font("Tahoma", Font.BOLD, 18));
		heading.setBounds(36, 10, 370, 22);
		contentPane.add(heading);
		
		JLabel lblNewLabel = new JLabel("Enter an Element");
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 60, 147, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter an Element");
		lblNewLabel_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 96, 147, 20);
		contentPane.add(lblNewLabel_1);
		
		rearele = new JTextField();
		rearele.setBounds(167, 63, 61, 19);
		contentPane.add(rearele);
		rearele.setColumns(10);
		
		frontele = new JTextField();
		frontele.setColumns(10);
		frontele.setBounds(167, 99, 61, 19);
		contentPane.add(frontele);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(117, 218, 289, 22);
		contentPane.add(displaybox);
		
		JButton rinsert = new JButton("Insert Rear");
		rinsert.setForeground(new Color(128, 0, 0));
		rinsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert rear
				node temp;
				int ele=Integer.valueOf(rearele.getText());
				node newnode=new node();
				newnode.data=ele;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "insertion at rear is successful");
					rearele.setText("");
				}
				else
				{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
					}
					temp.link=newnode;
					JOptionPane.showMessageDialog(contentPane, "insertion at rear is successful");
					rearele.setText("");
				}
			}
		});
		rinsert.setFont(new Font("Tahoma", Font.BOLD, 16));
		rinsert.setBackground(new Color(230, 230, 250));
		rinsert.setBounds(257, 56, 125, 29);
		contentPane.add(rinsert);
		
		JButton finsert = new JButton("Insert Front");
		finsert.setForeground(new Color(128, 0, 0));
		finsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert front
				int ele=Integer.valueOf(frontele.getText());
				node newnode=new node();
				newnode.data=ele;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "insertion at front is successful");
					frontele.setText("");
				}
				else
				{
					newnode.link=first;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "insertion at front is successful");
					frontele.setText("");
				}
			}
		});
		finsert.setFont(new Font("Tahoma", Font.BOLD, 16));
		finsert.setBackground(new Color(230, 230, 250));
		finsert.setBounds(257, 92, 131, 29);
		contentPane.add(finsert);
		
		JButton rdelete = new JButton("Delete Rear");
		rdelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete rear
				node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.link.link!=null)
					{
						temp=temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+temp.link.data);
					temp.link=null;
				}
			}
		});
		rdelete.setForeground(new Color(128, 0, 0));
		rdelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdelete.setBackground(new Color(230, 230, 250));
		rdelete.setBounds(133, 130, 127, 29);
		contentPane.add(rdelete);
		
		JButton fdelete = new JButton("Delete Front");
		fdelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete front
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=first.link;
				}
			}
		});
		fdelete.setForeground(new Color(128, 0, 0));
		fdelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		fdelete.setBackground(new Color(230, 230, 250));
		fdelete.setBounds(133, 169, 133, 29);
		contentPane.add(fdelete);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.link==null)
				{
					msg=msg+" "+first.data;
					displaybox.setText(msg);
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.link;
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(128, 0, 0));
		display.setFont(new Font("Tahoma", Font.BOLD, 16));
		display.setBackground(new Color(230, 230, 250));
		display.setBounds(10, 212, 91, 29);
		contentPane.add(display);
	}

}
