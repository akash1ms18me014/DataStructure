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

public class CQueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CQueue frame = new CQueue();
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
	public CQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		heading.setForeground(new Color(0, 0, 139));
		heading.setFont(new Font("Tahoma", Font.BOLD, 18));
		heading.setBounds(49, 10, 340, 22);
		contentPane.add(heading);
		
		JLabel lblNewLabel = new JLabel("Enter Queue Size");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(75, 0, 130));
		lblNewLabel.setBounds(31, 59, 138, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterAnElement = new JLabel("Enter an Element");
		lblEnterAnElement.setForeground(new Color(75, 0, 130));
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterAnElement.setBounds(31, 131, 146, 20);
		contentPane.add(lblEnterAnElement);
		
		sizefield = new JTextField();
		sizefield.setBounds(195, 62, 96, 19);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(195, 134, 96, 19);
		contentPane.add(element);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(142, 219, 247, 22);
		contentPane.add(displaybox);
		
		JButton queue = new JButton("Create Queue");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for circular queue creation
				size=Integer.valueOf(sizefield.getText());
				cq=new int[size];
				String msg="Circular Queue of size "+size+" is created";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		queue.setForeground(new Color(199, 21, 133));
		queue.setFont(new Font("Tahoma", Font.BOLD, 16));
		queue.setBounds(190, 91, 143, 29);
		contentPane.add(queue);
		
		JButton insert = new JButton("Insert");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int ele;
				if(count==size)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
				else
				{
					ele=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=ele;
					count++;
					JOptionPane.showMessageDialog(contentPane, "Insertion successgul");
					element.setText("");
				}
			}
		});
		insert.setForeground(new Color(199, 21, 133));
		insert.setFont(new Font("Tahoma", Font.BOLD, 16));
		insert.setBounds(306, 127, 83, 29);
		contentPane.add(insert);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else
				{
					String msg="Element deleted is "+cq[f];
					JOptionPane.showMessageDialog(contentPane, msg);
					f=(f+1)%size;
					count--;
				}
			}
		});
		delete.setForeground(new Color(199, 21, 133));
		delete.setFont(new Font("Tahoma", Font.BOLD, 16));
		delete.setBounds(195, 169, 85, 29);
		contentPane.add(delete);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					int f1=f;
					for(int i=0;i<=count-1;i++)
					{
						msg=msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(199, 21, 133));
		display.setFont(new Font("Tahoma", Font.BOLD, 16));
		display.setBounds(22, 213, 91, 29);
		contentPane.add(display);
	}

}
