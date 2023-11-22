package T_Hash;

public class TablaH {

	public static void main(String[] args) {
		metodo_hash h=new metodo_hash();
		h.agre(38);
		h.agre(48);
		h.agre(98);
		h.agre(18);
		h.agre(1);
		h.agre(25);
		h.agre(78);
		h.agre(55);
		h.agre(16);
		h.agre(13);
		h.agre(3);
		h.agre(63);
		h.agre(67);
		h.agre(30);
		
		h.impri();
		
		h.delete(1);
		h.delete(3);
		h.delete(5);
		
		h.impri();
		
		h.dibGra();

	}

}
