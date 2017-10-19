package Factory;

public class SimplePizzaFactory {
	public Pizza createPizza(String type){
		if(type.equals("CheesePizza"))
		{
			CheesePizza cp=new CheesePizza();
			cp.prepare();
			cp.bake();
			cp.cut();
			cp.box();
			return cp;
		}
		else if(type.equals("PepperoniPizza"))
		{
			PepperoniPizza pp=new PepperoniPizza();
			pp.prepare();
			pp.bake();
			pp.cut();
			pp.box();
		}
		else if(type.equals("ClamPizza"))
		{
			ClamPizza clp=new ClamPizza();
			clp.prepare();
			clp.bake();
			clp.cut();
			clp.box();
		}
		else{
			System.out.println("Ãû×Ö´íÎó");
		}
		
		return null;
		
	}
	

}
