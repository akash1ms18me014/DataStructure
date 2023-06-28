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

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("STACK DATA STRUCTURE");
		heading.setFont(new Font("Tahoma", Font.BOLD, 18));
		heading.setBounds(106, 10, 234, 22);
		contentPane.add(heading);
		
		JLabel lblEnterStackSize = new JLabel("Enter stack size");
		lblEnterStackSize.setForeground(new Color(72, 61, 139));
		lblEnterStackSize.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnterStackSize.setBounds(23, 55, 153, 22);
		contentPane.add(lblEnterStackSize);
		
		JLabel lblEnterAnElement = new JLabel("Enter an element");
		lblEnterAnElement.setForeground(new Color(72, 61, 139));
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnterAnElement.setBounds(10, 123, 180, 22);
		contentPane.add(lblEnterAnElement);
		
		sizefield = new JTextField();
		sizefield.setBounds(206, 60, 96, 19);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(206, 128, 96, 19);
		contentPane.add(element);
		
		JButton stack = new JButton("Create Stack");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for stack creation
				size=Integer.valueOf(sizefield.getText());
				s=new int[size];
				String msg="Stack of size "+size+" is created";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		stack.setFont(new Font("Tahoma", Font.BOLD, 16));
		stack.setBounds(136, 87, 135, 29);
		contentPane.add(stack);
		
		JButton push = new JButton("Push");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for push
				int elem;
				if(top==size-1)
				{
				JOptionPane.showMessageDialog(contentPane, "Push not possible");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "Push successful");
					element.setText("");
				}
			}
		});
		push.setFont(new Font("Tahoma", Font.BOLD, 16));
		push.setBounds(321, 121, 77, 29);
		contentPane.add(push);
		
		JButton pop = new JButton("Pop");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for pop
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "pop not possible");
				}
				else
				{
					String msg="Element deleted is "+s[top];
					JOptionPane.showMessageDialog(contentPane, msg);
					--top;
				}
			}
		});
		pop.setFont(new Font("Tahoma", Font.BOLD, 16));
		pop.setBounds(206, 157, 77, 29);
		contentPane.add(pop);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					for(int i=top;i>=0;i--)
					{
					msg=msg+" "+s[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 16));
		display.setBounds(33, 207, 91, 29);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(164, 207, 234, 26);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
