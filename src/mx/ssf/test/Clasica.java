package mx.ssf.test;

import java.util.ArrayList;
import java.util.List;

public class Clasica extends Pizza
{
	private List<Object> ingredients = new ArrayList<Object>();
	
	public Clasica(){
		ingredients.add(new String("ham"));
		ingredients.add(new String("mushroms"));
	}
	
	@Override
	public List<Object> getIngredients() {
		return this.ingredients;
	}
}
