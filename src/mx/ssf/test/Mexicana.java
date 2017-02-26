package mx.ssf.test;

import java.util.ArrayList;
import java.util.List;

public class Mexicana extends Pizza
{	
private List<Object> ingredients = new ArrayList<Object>();
	
	public Mexicana(){
		ingredients.add(new String("chilie"));
		ingredients.add(new String("pork sausage"));
	}
	
	@Override
	public List<Object> getIngredients() {
		return this.ingredients;
	}
}
