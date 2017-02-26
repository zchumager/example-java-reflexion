package mx.ssf.test;

import java.util.List;

public abstract class Pizza implements Eatable
{
	private float preparation_percentage;
	
	public String getType(){return this.getClass().getSimpleName() + " " + this.getClass().getSuperclass().getSimpleName();}
	
	public void cooking(float time, float celciusDegress){
		this.preparation_percentage = this.preparation_percentage + ((celciusDegress/time)/10);
	}
	
	public float getPreparation_percentage(){
		return this.preparation_percentage;
	}
	
	public abstract List<Object> getIngredients();
}
