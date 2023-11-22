package arreglos3;

public class arrordapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamMax=30;
		arrord ord;
		ord=new arrord(tamMax);
		
		ord.ins(77);
		ord.ins(99);
		ord.ins(44);
		ord.ins(55);
		ord.ins(22);
		ord.ins(89);
		ord.ins(11);
		ord.ins(0);
		ord.ins(66);
		ord.ins(34);
		
		ord.mues();
		
		long bus=55;
		int pos;
		pos=ord.busbin(bus);
		
		if(pos!=-1)
			System.out.println("se encontro elemento "+bus+" en la posicion "+pos);
		else
			System.out.println("no se encontro el elemento "+bus);
		
		ord.eli(0);
		ord.eli(55);
		ord.eli(99);
		
		ord.mues();

	}

}
