package Factory;

public class PepperoniPizza extends Pizza {

	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("prepare PepperoniPizza");
	}

	@Override
	void bake() {
		// TODO Auto-generated method stub
		System.out.println("bake PepperoniPizza");
	}

	@Override
	void cut() {
		// TODO Auto-generated method stub
		System.out.println("cut PepperoniPizza");
	}

	@Override
	void box() {
		// TODO Auto-generated method stub
		System.out.println("box PepperoniPizza");
	}

}
