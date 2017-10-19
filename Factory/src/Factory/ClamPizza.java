package Factory;

public class ClamPizza extends Pizza {

	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("prepare ClamPizza");

	}

	@Override
	void bake() {
		// TODO Auto-generated method stub
		System.out.println("bake ClamPizza");
	}

	@Override
	void cut() {
		// TODO Auto-generated method stub
		System.out.println("cut ClamPizza");
	}

	@Override
	void box() {
		// TODO Auto-generated method stub
		System.out.println("box ClamPizza");
	}

}
