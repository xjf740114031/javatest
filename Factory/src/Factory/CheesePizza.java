package Factory;

public class CheesePizza extends Pizza {

	@Override
	void prepare() {
		System.out.println("prepare CheesePizza");

	}

	@Override
	void bake() {
		// TODO Auto-generated method stub
		System.out.println("bake CheesePizza");

	}

	@Override
	void cut() {
		// TODO Auto-generated method stub
		System.out.println("cut CheesePizza");
	}

	@Override
	void box() {
		// TODO Auto-generated method stub
		System.out.println("box CheesePizza");
	}

}
