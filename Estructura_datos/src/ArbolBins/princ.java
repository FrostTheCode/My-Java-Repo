package ArbolBins;

public class princ {

	public static void main(String[] args) {
		Tree ar=new Tree();
		ar.inse(10);
		ar.inse(5);
		ar.inse(13);
		ar.inse(1);
		ar.inse(6);
		ar.inse(17);
		ar.preor(ar.obtra());

	}

}
