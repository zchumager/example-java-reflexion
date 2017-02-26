package mx.ssf.test;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Oven extends Thread
{
	private float celciusDegress;
	private float time;
	private Eatable food;
	private JPanel panel;
	private JButton button;
	private JProgressBar progressBar;
	
	public Oven(JPanel panel, JButton button, JProgressBar progressBar){
		this.panel = panel;
		this.button = button;
		this.progressBar = progressBar;
	}
	
	public void addDish(Eatable food)
	{
		this.food = food;
	}
	
	
	public void setCelciusDegress(float celciusDegress){
		this.celciusDegress = celciusDegress;
	}
	
	public void setTime(float time)
	{
		this.time = time;
	}
	
	public void toggleComponents(boolean value){
		for(Component component : this.panel.getComponents()){
			component.setEnabled(value);
		}
		this.button.setEnabled(value);
	}
	
	public void run() {
		System.out.println("a "+this.food.getType()+ " is been cooked in " + this.getName());
		toggleComponents(false);
		
		while(this.time > 0){
			this.food.cooking(this.time, this.celciusDegress);
			this.progressBar.setValue((int)food.getPreparation_percentage());
			this.time--;
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(progressBar.getValue() >= 100){
				JOptionPane.showMessageDialog(this.panel, "Completed");
				toggleComponents(true);
			}
		}
	}
}
