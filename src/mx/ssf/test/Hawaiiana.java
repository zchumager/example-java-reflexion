package mx.ssf.test;

import java.util.ArrayList;
import java.util.List;

public class Hawaiiana extends Pizza
{
	private List<Object> ingredients = new ArrayList<Object>();
	
	public Hawaiiana(){
		ingredients.add(new String("ham"));
		ingredients.add(new String("pineapple"));
	}
	
	@Override
	public List<Object> getIngredients() {
		return this.ingredients;
	}
}
