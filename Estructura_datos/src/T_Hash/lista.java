package T_Hash;

public class lista {
	private nodo pri;
	private nodo las;
	
	public void ag(int va)
	{
		nodo niu=new nodo();
		niu.SetVal(va);
		
		if(pri!=null)
		{
			las.setSig(niu);
			las=niu;
		}else {
			pri=niu;
			las=pri;
		}
	}
	
	public void bor(int va)
	{
		if(pri!=null)
		{
			if(pri.getval()==va)
			{
				pri=pri.getSig();
			}else {
				nodo bor=pri.getSig();
				nodo ant = pri;
				while (bor!=null)
				{
					if(bor.getval()==va)
					{
						break;
					}
					ant=bor;
					bor=bor.getSig();
				}
				if(bor!=null) {
					ant.setSig(bor.getSig());
				}
			}
		}//fin del primer if
	}

	public void imp() {
		nodo tem=pri;
		String txt="";
		
		while (tem!=null) {
			txt+=tem.getval()+"->";
			tem=tem.getSig();
		}
		txt=txt.substring(0,txt.length()-2);
		System.out.println(txt);
	}
	public String txtgrap()
	{
		nodo tem=pri;
		String txt="";
		while (tem!=null) {
			txt+=tem.getval()+"->";
			tem=tem.getSig();
		}
		txt=txt.substring(0,txt.length()-2)+"\n";
		return txt;
	}

}
