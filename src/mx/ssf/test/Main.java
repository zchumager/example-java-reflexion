package mx.ssf.test;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JProgressBar;

public class Main
{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBounds(30, 34, 380, 53);
		frame.getContentPane().add(panel);
		
		JRadioButton rdbtnChicago = new JRadioButton("Chicago");
		rdbtnChicago.setName("chicago");
		panel.add(rdbtnChicago);
		
		JRadioButton rdbtnMexicana = new JRadioButton("Mexicana");
		rdbtnMexicana.setName("mexicana");
		panel.add(rdbtnMexicana);
		
		JRadioButton rdbtnHawaiiana = new JRadioButton("Hawaiiana");
		rdbtnHawaiiana.setName("hawaiiana");
		panel.add(rdbtnHawaiiana);
		
		JRadioButton rdbtnClasica = new JRadioButton("Clasica");
		rdbtnClasica.setName("clasica");
		panel.add(rdbtnClasica);
		
		final ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnChicago);
		buttonGroup.add(rdbtnMexicana);
		buttonGroup.add(rdbtnHawaiiana);
		buttonGroup.add(rdbtnClasica);
		
		final JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(30, 183, 380, 25);
		frame.getContentPane().add(progressBar);
		
		final JButton btnOrder = new JButton("Order");
		btnOrder.setBounds(42, 119, 353, 25);
		frame.getContentPane().add(btnOrder);
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(Component component : panel.getComponents()){
					JRadioButton aux = (JRadioButton)component;
					if(aux.isSelected()){
						try {
							Pizza pizza = (Pizza)Class.forName(this.getClass().getPackage().getName() +"."+ aux.getText()).newInstance();
							
							Oven oven1 = new Oven(panel, btnOrder, progressBar);
							oven1.addDish(pizza);
							oven1.setName("Oven1");
							oven1.setCelciusDegress(250.0f);
							oven1.setTime(35.0f);
							oven1.start();
							
						} catch (InstantiationException e) {
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							e.printStackTrace();
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						} catch (SecurityException e) {
							e.printStackTrace();
						}
					}
						
				}
				
			}
		});
	}
}
