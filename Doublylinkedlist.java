package miniproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import miniproject.Singlylinkedlist.node;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Doublylinkedlist extends JFrame {

	private JPanel contentPane;
	private JTextField rearele;
	private JTextField frontele;
	private JTextField displaybox;
	class node
	{
		node prelink;
		int data;
		node nextlink;
	}
	private node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doublylinkedlist frame = new Doublylinkedlist();
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
	public Doublylinkedlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		heading.setForeground(new Color(139, 0, 139));
		heading.setFont(new Font("Tahoma", Font.BOLD, 18));
		heading.setBounds(38, 10, 375, 22);
		contentPane.add(heading);
		
		JLabel lblNewLabel = new JLabel("Enter an Element");
		lblNewLabel.setForeground(new Color(75, 0, 130));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 42, 144, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter an Element");
		lblNewLabel_1.setForeground(new Color(75, 0, 130));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 86, 144, 20);
		contentPane.add(lblNewLabel_1);
		
		rearele = new JTextField();
		rearele.setBounds(160, 42, 59, 19);
		contentPane.add(rearele);
		rearele.setColumns(10);
		
		frontele = new JTextField();
		frontele.setColumns(10);
		frontele.setBounds(160, 89, 59, 19);
		contentPane.add(frontele);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(79, 221, 275, 19);
		contentPane.add(displaybox);
		
		JButton rinsert = new JButton("Insert Rear");
		rinsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert rear
				node temp;
				int ele=Integer.valueOf(rearele.getText());
				node newnode=new node();
				newnode.data=ele;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "insertion at rear is successful");
					rearele.setText("");
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
					JOptionPane.showMessageDialog(contentPane, "insertion at rear is successful");
					rearele.setText("");
				}
			}
		});
		rinsert.setForeground(new Color(47, 79, 79));
		rinsert.setFont(new Font("Verdana", Font.BOLD, 16));
		rinsert.setBounds(235, 42, 135, 29);
		contentPane.add(rinsert);
		
		JButton finsert = new JButton("Insert Front");
		finsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert front
				int ele=Integer.valueOf(frontele.getText());
				node newnode=new node();
				newnode.data=ele;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "insertion at front is successful");
					frontele.setText("");
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "insertion at front is successful");
					frontele.setText("");
				}
			}
		});
		finsert.setForeground(new Color(47, 79, 79));
		finsert.setFont(new Font("Verdana", Font.BOLD, 16));
		finsert.setBounds(235, 81, 141, 29);
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
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.nextlink.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+temp.nextlink.data);
					temp.nextlink=null;
				}
			}
		});
		rdelete.setForeground(new Color(47, 79, 79));
		rdelete.setFont(new Font("Verdana", Font.BOLD, 16));
		rdelete.setBounds(45, 130, 137, 29);
		contentPane.add(rdelete);
		
		JButton fdelete = new JButton("Delete Front");
		fdelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete front
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}
				else
				{
					first=first.nextlink;
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.prelink.data);
					first.prelink=null;
				}
			}
		});
		fdelete.setForeground(new Color(47, 79, 79));
		fdelete.setFont(new Font("Verdana", Font.BOLD, 16));
		fdelete.setBounds(217, 130, 143, 29);
		contentPane.add(fdelete);
		
		JButton Fdisplay = new JButton("Display Forward");
		Fdisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display forward
				String msg="";
				node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.nextlink==null)
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
						temp=temp.nextlink;
					}
					displaybox.setText(msg);
				}
			}
		});
		Fdisplay.setForeground(new Color(47, 79, 79));
		Fdisplay.setFont(new Font("Verdana", Font.BOLD, 16));
		Fdisplay.setBounds(24, 182, 179, 29);
		contentPane.add(Fdisplay);
		
		JButton Rdisplay = new JButton("Display Reverse");
		Rdisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display reverse
				String msg="";
				node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.nextlink==null)
				{
					msg=msg+" "+first.data;
					displaybox.setText(msg);
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.prelink;
					}
					displaybox.setText(msg);
				}
			}
		});
		Rdisplay.setForeground(new Color(47, 79, 79));
		Rdisplay.setFont(new Font("Verdana", Font.BOLD, 16));
		Rdisplay.setBounds(234, 182, 179, 29);
		contentPane.add(Rdisplay);
	}

}
