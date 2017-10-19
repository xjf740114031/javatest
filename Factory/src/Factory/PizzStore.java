package Factory;

public class PizzStore {
	private SimplePizzaFactory spf;
	public PizzStore() {
		// TODO Auto-generated constructor stub
		spf=new SimplePizzaFactory();
		
		
	}
	public Pizza orderPizza(String type){
		Pizza  pizza=spf.createPizza(type);
		
		return pizza;
	}

}
