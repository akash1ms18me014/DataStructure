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
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deletepos;
	private JTextField insertpos;
	private int arr[];
	private JTextField displaybox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(220, 20, 60));
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("ARRAY DATA STRUCTURE");
		heading.setForeground(new Color(220, 20, 60));
		heading.setFont(new Font("Tahoma", Font.BOLD, 18));
		heading.setBounds(89, 10, 238, 22);
		contentPane.add(heading);
		
		JLabel lblEnterArrayLength = new JLabel("Enter Array Length");
		lblEnterArrayLength.setForeground(new Color(220, 20, 60));
		lblEnterArrayLength.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterArrayLength.setBounds(10, 42, 183, 22);
		contentPane.add(lblEnterArrayLength);
		
		length = new JTextField();
		length.setBounds(203, 46, 96, 19);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("Create Array");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating array
				int len=Integer.valueOf(length.getText());
				arr=new int[len];
				String msg="Array of length "+len+" is created";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		create.setFont(new Font("Tahoma", Font.BOLD, 16));
		create.setBounds(108, 74, 135, 29);
		contentPane.add(create);
		
		JLabel lblInsertAnInteger = new JLabel("Insert an Integer Element");
		lblInsertAnInteger.setForeground(new Color(220, 20, 60));
		lblInsertAnInteger.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInsertAnInteger.setBounds(10, 113, 217, 22);
		contentPane.add(lblInsertAnInteger);
		
		element = new JTextField();
		element.setBounds(231, 117, 47, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("Insert");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertpos.getText());
				arr[pos]=elem;
				String msg="Element "+elem+" is inserted at position "+pos;
				JOptionPane.showMessageDialog(contentPane, msg);
				element.setText("");
				insertpos.setText("");
			}
		});
		insert.setFont(new Font("Tahoma", Font.BOLD, 16));
		insert.setBounds(300, 146, 83, 29);
		contentPane.add(insert);
		
		JLabel lblDeletePosition = new JLabel("Delete Position");
		lblDeletePosition.setForeground(new Color(220, 20, 60));
		lblDeletePosition.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDeletePosition.setBounds(76, 181, 145, 22);
		contentPane.add(lblDeletePosition);
		
		deletepos = new JTextField();
		deletepos.setBounds(231, 185, 47, 19);
		contentPane.add(deletepos);
		deletepos.setColumns(10);
		
		insertpos = new JTextField();
		insertpos.setColumns(10);
		insertpos.setBounds(369, 117, 47, 19);
		contentPane.add(insertpos);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setForeground(new Color(220, 20, 60));
		lblPosition.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPosition.setBounds(300, 113, 73, 22);
		contentPane.add(lblPosition);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos=Integer.valueOf(deletepos.getText());
				arr[pos]=0;
				String msg="Elemnnt deleted at the position "+pos;
				JOptionPane.showMessageDialog(contentPane, msg);
				deletepos.setText("");
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 16));
		delete.setBounds(300, 185, 85, 29);
		contentPane.add(delete);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				for(int i=0;i<arr.length;i++)
				{
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 16));
		display.setBounds(35, 224, 91, 29);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(185, 224, 211, 26);
		contentPane.add(displaybox);
	}
}
