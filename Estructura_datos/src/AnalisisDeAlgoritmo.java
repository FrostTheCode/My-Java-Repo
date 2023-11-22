
public class AnalisisDeAlgoritmo {
		
		public static int ejemplo1(int n){

            int cuenta=0;
 
            for (int i=0;i<5;i++)
                     cuenta++;

            return cuenta;
            
  }
		
		public static int ejemplo2(int n){

            int cuenta=0, n1=10;

            for (int i=0;i<n1;i++)

                     cuenta++;

            return cuenta;
  }
		 public static int ejemplo3(int n){

             int cuenta=0,n1=10;

             for (int i=0;i<n1;i++)

                      for (int j=0;j<n1;j++)
                                cuenta++;

             return cuenta;

   }

  public static int ejemplo4(int n){

             int cuenta=0,n1=10;

             for (int i=0;i<n1;i++)

                      for (int j=0;j<i;j++)

                                cuenta++;

             return cuenta;

   }

 public static int ejemplo5(int n){

             int cuenta=0,n1=10;

             for (int i=0;i<n1;i+=2)

                                cuenta++;

             return cuenta;

   }







 public static int ejemplo6(int n){

             int cuenta= 0,i=1,n1=10;

             while (i <=n1)

             { cuenta++;

             i= 2*i; }

             return cuenta;

   }

 public static int ejemplo7(int n){

             int cuenta=0,n1=10,i=n1;

             while (i >0)

             { cuenta++;

             i= i/2; }

             return cuenta;

   }

 public static int ejemplo8(int n){

             int cuenta=0;int k,n1=10;

             for (int i=0;i<n1;i++){

                      k=i;

                      while (k >0)

                      { cuenta++;

                      k= k/2;

                      }

             }

             return cuenta;

   }

 public static int ejemplo9(int n){

             int cuenta=0,n1=10;

             for (int i=0;i<n1;i++)

                      for (int j=0;j<n1;j++)

                                for (int k=0;k<n1;k++)

                                         cuenta++;

             return cuenta;

   }

       public static int ejemplo10(int n){

             int cuenta=0;

             for (int i=n;i>0;i--)

                      cuenta++;

             return cuenta;

   }
		
	}


