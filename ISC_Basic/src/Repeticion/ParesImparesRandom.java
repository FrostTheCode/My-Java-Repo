package Repeticion;

import java.util.Random;

import javax.swing.JOptionPane;

public class ParesImparesRandom {

	public static void main(String[] args) {
		Random nr =new Random();
		int opc;
		do {
		opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.- Pares \n2.- Impares \n3.- salir","Menu Principal",JOptionPane.INFORMATION_MESSAGE));
		switch (opc)
		{
		case 1:
		{   int nPar=0;
			for (int i=0;i<=200;i++)
			{
				int nRandom =nr.nextInt(50);
				if(nRandom%2==0)
					nPar+=nRandom;
			}
			JOptionPane.showMessageDialog(null, nPar,"sumatoria de numeros pares",JOptionPane.INFORMATION_MESSAGE);
		}
			break;
		
		case 2:
		{
			int i = 0,nRandom=0,nInpar=0;
			while(i<=200)
			{
				nRandom=nr.nextInt(50);
			if(nRandom%2==0)
				nInpar+=nRandom;
			i++;
			}
			JOptionPane.showMessageDialog(null, nInpar,"sumatoria de numeros impares",JOptionPane.INFORMATION_MESSAGE);
		}//fin del case 2
			break;
		case 3:
			System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null,"opcion invalida","error !!!!!",JOptionPane.ERROR_MESSAGE);
		}//fin
		}while (opc!=3);

	}

}
