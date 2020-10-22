
public class PolyMain {

	public static void main(String[] args) {
		Poly po = new Poly();
		System.out.println(po.add(2, 5));
		System.out.println(po.add(5, 9, 5));

		Poly a = new PolyOverride();
		PolyOverride overrideObj = new PolyOverride();
		overrideObj.editValue();
		a.editValue();
	}
}
