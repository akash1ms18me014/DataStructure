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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int r=-1;
	private int f=0;
	private int size;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 127));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("QUEUE DATA STRUCTURE");
		heading.setFont(new Font("Tahoma", Font.BOLD, 18));
		heading.setBounds(105, 10, 238, 22);
		contentPane.add(heading);
		
		JLabel lblNewLabel = new JLabel("Enter Queue Size");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(27, 52, 138, 20);
		contentPane.add(lblNewLabel);
		
		sizefield = new JTextField();
		sizefield.setBounds(207, 55, 96, 19);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton queue = new JButton("Create Queue");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Queue creation
				size=Integer.valueOf(sizefield.getText());
				q=new int[size];
				String msg="Queue of size "+size+" is created";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		queue.setForeground(new Color(139, 0, 0));
		queue.setFont(new Font("Tahoma", Font.BOLD, 16));
		queue.setBounds(160, 84, 143, 29);
		contentPane.add(queue);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(207, 121, 96, 19);
		contentPane.add(element);
		
		JLabel lblEnterAnElement = new JLabel("Enter an Element");
		lblEnterAnElement.setForeground(new Color(128, 0, 0));
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterAnElement.setBounds(27, 121, 148, 20);
		contentPane.add(lblEnterAnElement);
		
		JButton insert = new JButton("Insert");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int ele;
				if(r==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
				else
				{
					ele=Integer.valueOf(element.getText());
					++r;
					q[r]=ele;
					JOptionPane.showMessageDialog(contentPane, "Insertion successgul");
					element.setText("");
				}
			}
		});
		insert.setForeground(new Color(139, 0, 0));
		insert.setFont(new Font("Tahoma", Font.BOLD, 16));
		insert.setBounds(315, 114, 83, 29);
		contentPane.add(insert);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				if(r==-1 || f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else
				{
					String msg="Element deleted is "+q[f];
					JOptionPane.showMessageDialog(contentPane, msg);
					++f;
				}
			}
		});
		delete.setForeground(new Color(139, 0, 0));
		delete.setFont(new Font("Tahoma", Font.BOLD, 16));
		delete.setBounds(218, 151, 85, 29);
		contentPane.add(delete);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				if(r==-1 || f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					for(int i=f;i<=r;i++)
					{
						msg=msg+" "+q[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(139, 0, 0));
		display.setFont(new Font("Tahoma", Font.BOLD, 16));
		display.setBounds(22, 199, 91, 29);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(160, 206, 238, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
