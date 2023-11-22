package EDDRacional;

public class simp {
	public void Simp(Racional r,Racional r2)
	 {
		 int a=r.getNum();
		 int b=r.getDen();
		 int c=r2.getNum();
		 int d=r2.getDen();
		 int s1=0,s2=0,s3=0,s4=0;
		 
		  while(a != c) {
        if(a>c)
            s1= a-c;
        else
            s2= c-a;
		  }
		  while(b != d)
		         if(b>d)
		             s3= b-d;
		         else
		             s4= d-b;
		  
		  if(s1>0)
		  {
			a=a/s1; 
			c=c/s1;
		  }
		  else 
		  {
			a=a/s2; 
			c=c/s2;
		  }
		  
		  if (s3>0)
		  {
			  b=b/s3;
			  d=d/s3;
		  }
		  else
		  {
			  b=b/s4;
			  d=d/s4;
		  }
		 System.out.println(a+"/"+b+" + "+c+"/"+d);
	 }

	 
	



}
