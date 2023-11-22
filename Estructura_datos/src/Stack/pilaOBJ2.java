package Stack;

import java.util.Scanner;
import java.util.Stack;

public class pilaOBJ2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Stack<pilaOBJ1>p=new Stack<pilaOBJ1>();
		pilaOBJ1 pro;
		System.out.println("ingresa la cantidad de producto: ");
		int cant=in.nextInt();
		for(int i=0;i<cant;i++)
		{
			pro=new pilaOBJ1(in.next(),in.nextInt(),in.nextInt());
			p.push(pro);
		}
		while(!p.isEmpty())
		{
			pro=p.pop();
			int ab=pro.getStock();
			if (ab<10)
				pro.mos();
		}
		

	}

}
