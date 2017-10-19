package Factory;

public class factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="CheesePizza";
		String str2="PepperoniPizza";
		String str3="ClamPizza";

		PizzStore ps=new PizzStore();
		ps.orderPizza(str1);
		ps.orderPizza(str2);
		ps.orderPizza(str3);

	}

}
