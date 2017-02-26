package mx.ssf.test;

import java.util.ArrayList;
import java.util.List;

public class Chicago extends Pizza
{	
	private List<Object> ingredients = new ArrayList<Object>();
	
	public Chicago(){
		ingredients.add((Object)new String("sauce"));
		ingredients.add((Object)new String("mushroom"));
		ingredients.add((Object)new String("onion"));
	}

	@Override
	public List<Object> getIngredients() {
		return this.ingredients;
	}
}
