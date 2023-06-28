package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 250, 154));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("CHOOSE A DATA STRUCTURE");
		heading.setFont(new Font("Tahoma", Font.BOLD, 18));
		heading.setBounds(86, 10, 270, 22);
		contentPane.add(heading);
		
		JButton array = new JButton("Array");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display array window
				new Array().setVisible(true);
			}
		});
		array.setForeground(new Color(25, 25, 112));
		array.setFont(new Font("Tahoma", Font.BOLD, 16));
		array.setBounds(149, 54, 77, 29);
		contentPane.add(array);
		
		JButton stack = new JButton("Stack");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display stack window
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(new Color(25, 25, 112));
		stack.setFont(new Font("Tahoma", Font.BOLD, 16));
		stack.setBounds(41, 86, 77, 29);
		contentPane.add(stack);
		
		JButton queue = new JButton("Queue");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display Queue window
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(25, 25, 112));
		queue.setFont(new Font("Tahoma", Font.BOLD, 16));
		queue.setBounds(279, 86, 85, 29);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("Circular Queue");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display circular queue window
				new CQueue().setVisible(true);
			}
		});
		cqueue.setForeground(new Color(25, 25, 112));
		cqueue.setFont(new Font("Tahoma", Font.BOLD, 16));
		cqueue.setBounds(21, 138, 153, 29);
		contentPane.add(cqueue);
		
		JButton sll = new JButton("Singly Linked List");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display singly linked list window
				new Singlylinkedlist().setVisible(true);
			}
		});
		sll.setForeground(new Color(25, 25, 112));
		sll.setFont(new Font("Tahoma", Font.BOLD, 16));
		sll.setBounds(251, 138, 175, 29);
		contentPane.add(sll);
		
		JButton dll = new JButton("Doubly Linked List");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display doubly linked list
				new Doublylinkedlist().setVisible(true);
			}
		});
		dll.setForeground(new Color(25, 25, 112));
		dll.setFont(new Font("Tahoma", Font.BOLD, 16));
		dll.setBounds(127, 202, 181, 29);
		contentPane.add(dll);
	}
}
