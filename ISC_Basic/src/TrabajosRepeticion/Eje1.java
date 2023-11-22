package TrabajosRepeticion;

public class Eje1 {

	public static void main(String[] args) {
		multiplo5for();
		multiplo5do();
		multiplo5dowhile();
	}

	private static void multiplo5dowhile() {
	int i=0;
	do {
		if (i%5==0)
			System.out.println(i+"\t");
		i++;
	  }while(i<=100);
	}

	private static void multiplo5do() {
        int i=0;
        while (i<=100)
        {
        	if (i%5==0)
        		System.out.println(i+"\t");
        	i++;
        }
		
	}

	private static void multiplo5for() {
		for(int i=0;i<=100;i++)
			if (i%5==0)
			System.out.println(i+"\t");
			
		
	}

}
