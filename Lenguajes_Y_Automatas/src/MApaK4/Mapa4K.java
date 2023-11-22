package MApaK4;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Mapa4K extends JFrame  {
	 
	 static String output="";
	 static int A[][]=new int[4][4];
	 static int checked[][]=new int[4][4];
	 static int value[]=new int[16];
	 JButton btn[]=new JButton[16];
	 JLabel lbl[]=new JLabel[10];
	 JPanel table;
	 JLabel text;
	 JButton Resolver,Reinicar;
	 public Mapa4K()
	 {
	  JFrame f =new JFrame();
	  f.setTitle("Mapas de Karnaugh Para 4 Variables");
	  f.setSize(580, 430);
	  f.setVisible(true);
	  f.setLocation(300,50);
	  f.setBackground(Color.black);
	  f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	  f.setResizable(false);
	  f.getContentPane().setLayout(null);
	  table=new JPanel();
	  text=new JLabel();
	  table.setBounds(140, 30, 400, 300);
	  table.setBackground(Color.BLUE);
	  
	  text.setBounds(0,330,580,100);
	  text.setBackground(Color.black);
	  //ading button in table
	  table.setLayout(new GridLayout(4,4));
	 
	  for(int i=0;i<16;i++)
	  {
	   btn[i]=new JButton();
	   btn[i].setText(" ");
	   table.add(btn[i]);
	   table.validate();
	   value[i]=2;
	  }
	  //
	  JLabel cerocero = new JLabel("00");
	  cerocero.setBounds(110,30,30,75);
	  cerocero.setBackground(Color.white);
	  f.getContentPane().add(cerocero);
	  
	  
	  
	  lbl[0]=new JLabel("00");
	  lbl[0].setBounds(110,30,30,75);
	  f.getContentPane().add(lbl[0]);
	  lbl[1]=new JLabel("01");
	  lbl[1].setBounds(110,105,30,75);
	  f.getContentPane().add(lbl[1]);
	  lbl[2]=new JLabel("11");
	  lbl[2].setBounds(110,180,30,75);
	  f.getContentPane().add(lbl[2]);
	  lbl[3]=new JLabel("10'");
	  lbl[3].setBounds(110,255,30,75);
	  f.getContentPane().add(lbl[3]);
	  lbl[4]=new JLabel("00");
	  lbl[4].setBounds(160,0,80,30);
	  f.getContentPane().add(lbl[4]);
	  lbl[5]=new JLabel("01");
	  lbl[5].setBounds(260,0,80,30);
	  f.getContentPane().add(lbl[5]);
	  lbl[6]=new JLabel("11");
	  lbl[6].setBounds(360,0,80,30);
	  f.getContentPane().add(lbl[6]);
	  lbl[7]=new JLabel("10'");
	  lbl[7].setBounds(460,0,80,30);
	  f.getContentPane().add(lbl[7]);
	  f.validate();
	  //
	  //button dading
	  
	 // f.add(button);
	  Resolver=new JButton("RESOLVER");
	  Resolver.setBackground(Color.white);
	  Resolver.setForeground(Color.GREEN);
	  Resolver.setBounds(5, 77, 110, 40);
	  f.getContentPane().add(Resolver);
	  //compute.setIcon(new ImageIcon("compute.png"));
	  Reinicar=new JButton("REINICAR");
	  Reinicar.setBackground(Color.white);
	  Reinicar.setForeground(Color.RED);
	  Reinicar.setBounds(5, 147, 110, 40);
	  f.getContentPane().add(Reinicar);
	  f.getContentPane().add(table);
	  Resolver.validate();
	  Reinicar.validate();
	  f.getContentPane().add(text);
	  f.validate();
	  //zero - one change change over
	  btn[0].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    
	    value[0]++;
	    value[0]%=2;
	    if(value[0]==0)
	    {
	     btn[0].setText(" ");
	    }
	    if(value[0]==1)
	    {
	     btn[0].setText("o");
	    }
	   }
	  });
	  
	  btn[1].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    //text.setText("");
	    value[1]++;
	    value[1]%=2;
	     if(value[1]==0)
	    {
	     btn[1].setText(" ");
	    }
	    if(value[1]==1)
	    {
	     btn[1].setText("o");
	    }
	   }
	  });
	  btn[2].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    value[2]++;
	    value[2]%=2;
	    if(value[2]==0)
	    {
	     btn[2].setText(" ");
	    }
	    if(value[2]==1)
	    {
	     btn[2].setText("o");
	    }/*
	    if(value[2]==2)
	    {
	     btn[2].setIcon(new ImageIcon("C:\\Automatasll\\src\\Recursos\\x.png"));
	    }*/
	   }
	  });
	  btn[3].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    value[3]++;
	    value[3]%=2;
	    if(value[3]==0)
	    {
	     btn[3].setText(" ");
	    }
	    if(value[3]==1)
	    {
	     btn[3].setText("o");
	    }/*
	    if(value[3]==2)
	    {
	     btn[3].setIcon(new ImageIcon("C:\\Automatasll\\src\\Recursos\\x.png"));
	    }*/
	   }
	  });
	  btn[4].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    value[4]++;
	    value[4]%=2;
	    if(value[4]==0)
	    {
	     btn[4].setText(" ");
	    }
	    if(value[4]==1)
	    {
	     btn[4].setText("o");
	    }/*
	    if(value[4]==2)
	    {
	     btn[4].setIcon(new ImageIcon("C:\\Automatasll\\src\\Recursos\\x.png"));
	    }*/
	   }
	  });
	  btn[5].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    value[5]++;
	    value[5]%=2;
	    if(value[5]==0)
	    {
	     btn[5].setText(" ");
	    }
	    if(value[5]==1)
	    {
	     btn[5].setText("o");
	    }/*
	    if(value[5]==2)
	    {
	     btn[5].setIcon(new ImageIcon("C:\\Automatasll\\src\\Recursos\\x.png"));
	    }*/
	   }
	  });
	  btn[6].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    value[6]++;
	    value[6]%=2;
	    if(value[6]==0)
	    {
	     btn[6].setText(" ");
	    }
	    if(value[6]==1)
	    {
	     btn[6].setText("o");
	    }
	   }
	  });
	  btn[7].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    value[7]++;
	    value[7]%=2;
	    if(value[7]==0)
	    {
	     btn[7].setText(" ");
	    }
	    if(value[7]==1)
	    {
	     btn[7].setText("o");
	    }
	   }
	  });
	  btn[8].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    value[8]++;
	    value[8]%=2;
	    if(value[8]==0)
	    {
	     btn[8].setText(" ");
	    }
	    if(value[8]==1)
	    {
	     btn[8].setText("o");
	    }
	   }
	  });
	  btn[9].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    value[9]++;
	    value[9]%=2;
	    if(value[9]==0)
	    {
	     btn[9].setText(" ");
	    }
	    if(value[9]==1)
	    {
	     btn[9].setText("o");
	    }/*
	    if(value[9]==2)
	    {
	     btn[9].setIcon(new ImageIcon("C:\\Automatasll\\src\\Recursos\\x.png"));
	    }*/
	   }
	  });
	  btn[10].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    value[10]++;
	    value[10]%=2;
	    if(value[10]==0)
	    {
	     btn[10].setText(" ");
	    }
	    if(value[10]==1)
	    {
	     btn[10].setText("o");
	    }
	   }
	  });
	  btn[11].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    value[11]++;
	    value[11]%=2;
	    if(value[11]==0)
	    {
	     btn[11].setText(" ");
	    }
	    if(value[11]==1)
	    {
	     btn[11].setText("o");
	    }
	    
	   }
	  });
	  btn[12].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    value[12]++;
	    value[12]%=2;
	    if(value[12]==0)
	    {
	     btn[12].setText(" ");
	    }
	    if(value[12]==1)
	    {
	     btn[12].setText("o");
	    }/*
	    if(value[12]==2)
	    {
	     btn[12].setIcon(new ImageIcon("C:\\Automatasll\\src\\Recursos\\x.png"));
	    }*/
	   }
	  });
	  btn[13].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    value[13]++;
	    value[13]%=2;
	    if(value[13]==0)
	    {
	     btn[13].setText(" ");
	    }
	    if(value[13]==1)
	    {
	     btn[13].setText("o");
	    }/*
	    if(value[13]==2)
	    {
	     btn[13].setIcon(new ImageIcon("C:\\Automatasll\\src\\Recursos\\x.png"));
	    }*/
	   }
	  });
	  btn[14].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    value[14]++;
	    value[14]%=2;
	    if(value[14]==0)
	    {
	     btn[14].setText(" ");
	    }
	    if(value[14]==1)
	    {
	     btn[14].setText("o");
	    }/*
	    if(value[14]==2)
	    {
	     btn[14].setIcon(new ImageIcon("C:\\Automatasll\\src\\Recursos\\x.png"));
	    }*/
	   }
	  });
	  btn[15].addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    value[15]++;
	    value[15]%=2;
	    if(value[15]==0)
	    {
	     btn[15].setText(" ");
	    }
	    if(value[15]==1)
	    {
	     btn[15].setText("o");
	    }/*
	    if(value[15]==2)
	    {
	     btn[15].setIcon(new ImageIcon("C:\\Automatasll\\src\\Recursos\\x.png"));
	    }*/
	   }
	  });
	  //reset
	  Reinicar.addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    text.setText("");
	    output="";
	   
	    for(int i=0;i<16;i++)
	    {
	     btn[i].setText(" ");
	     value[i]=2;
	    }
	   }
	  });
	  //compute
	  Resolver.addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	    if(btn[0].getText()==" " && btn[1].getText()==" " && btn[2].getText()==" " && btn[3].getText()==" " && btn[4].getText()==" " && btn[5].getText()==" " && btn[6].getText()==" " && btn[7].getText()==" " && btn[8].getText()==" " && btn[9].getText()==" " && btn[10].getText()==" " && btn[11].getText()==" " && btn[12].getText()==" " && btn[13].getText()==" " && btn[14].getText()==" " && btn[15].getText()==" " ) {
	    	JOptionPane.showMessageDialog(null, "no ah seleccionado algun boton","error!!!!",JOptionPane.ERROR_MESSAGE);
	    }else {
	    	compute();
		    text.setText("");
		  
		    text.setText("F="+output.substring(1));
	    	
	    }
	   }
	  });
	 }
	 //end of constructor
	 //compute Algorithm for K-MAP
	 static void compute()
	 {
	  initialize();
	  // algo bigins
	  
	  for(int i=0;i<4;i++)
	  {
	   for(int j=0;j<4;j++)
	   {
	    if(A[i][j]==1&&checked[i][j]==0)
	    {
	     int pass8=check8(i,j);
	     if(pass8==0)
	     {
	      int pass4=check4(i,j);
	      if(pass4==0)
	      {
	       int pass2=check2(i,j);
	       if(pass2==0)
	       {
	        nogrouping(i,j);
	       }
	      }
	     }
	    }
	   }
	  }
	  
	 }
	 //algo ends
	 //function for checking 8
	 static int check8(int r,int c)
	 {
	  int result=0;
	  //case1
	  if(A[r][0]==1&&A[r][1]==1&&A[r][2]==1&&A[r][3]==1&&A[(r+1)%4][0]==1&&A[(r+1)%4][1]==1&&A[(r+1)%4][2]==1&&A[(r+1)%4][3]==1)
	  {
	   String local="";
	   if(r==0)
	   {
	     local="A'";
	   }
	   if(r==1)
	   {
	     local="B";
	   }
	   if(r==2)
	   {
	     local="A";
	   }
	   if(r==3)
	   {
	     local="B'";
	   }
	   output=output+"+"+local;
	   result=1;
	   //make checked
	   checked[r][0]=1;checked[r][1]=1;checked[r][2]=1;checked[r][3]=1;
	   checked[(r+1)%4][0]=1;checked[(r+1)%4][1]=1;checked[(r+1)%4][2]=1;checked[(r+1)%4][3]=1;
	   // make it color
	  // makecolor(r,c);
	  }else
	  //case2
	  if(A[r][0]==1&&A[r][1]==1&&A[r][2]==1&&A[r][3]==1&&A[(4+(r-1))%4][0]==1&&A[(4+(r-1))%4][1]==1&&A[(4+(r-1))%4][2]==1&&A[(4+(r-1))%4][3]==1)
	  {
	   String local="";
	   if(r==0)
	   {
	     local="B'";
	   }
	   if(r==1)
	   {
	     local="A'";
	   }
	   if(r==2)
	   {
	     local="B";
	   }
	   if(r==3)
	   {
	     local="A";
	   }
	   output=output+"+"+local;
	   result=1;
	   //make checked
	   checked[r][0]=1;checked[r][1]=1;checked[r][2]=1;checked[r][3]=1;
	   checked[(4+(r-1))%4][0]=1;checked[(4+(r-1))%4][1]=1;checked[(4+(r-1))%4][2]=1;checked[(4+(r-1))%4][3]=1;
	  }else
	  //case3
	  if(A[0][c]==1&&A[1][c]==1&&A[2][c]==1&&A[3][c]==1&&A[0][(c+1)%4]==1&&A[1][(c+1)%4]==1&&A[2][(c+1)%4]==1&&A[3][(c+1)%4]==1)
	  {
	   String local="";
	   if(c==0)
	   {
	     local="C'";
	   }
	   if(c==1)
	   {
	     local="D";
	   }
	   if(c==2)
	   {
	     local="C";
	   }
	   if(c==3)
	   {
	     local="D'";
	   }
	   output=output+"+"+local;
	   result=1;
	   //make checked
	   checked[0][c]=1;checked[1][c]=1;checked[2][c]=1;checked[3][c]=1;
	   checked[0][(c+1)%4]=1;checked[1][(c+1)%4]=1;checked[2][(c+1)%4]=1;checked[3][(c+1)%4]=1;
	  }else
	  //case 4
	  if(A[0][c]==1&&A[1][c]==1&&A[2][c]==1&&A[3][c]==1&&A[0][(4+(c-1))%4]==1&&A[1][(4+(c-1))%4]==1&&A[2][(4+(c-1))%4]==1&&A[3][(4+(c-1))%4]==1)
	  {
	   String local="";
	   if(c==0)
	   {
	     local="D'";
	   }
	   if(c==1)
	   {
	     local="C'";
	   }
	   if(c==2)
	   {
	     local="D";
	   }
	   if(c==3)
	   {
	     local="C";
	   }
	   output=output+"+"+local;
	   result=1;
	   //make checked
	   checked[0][c]=1;checked[1][c]=1;checked[2][c]=1;checked[3][c]=1;
	   checked[0][(4+(c-1))%4]=1;checked[1][(4+(c-1))%4]=1;checked[2][(4+(c-1))%4]=1;checked[3][(4+(c-1))%4]=1;
	  }
	  
	  return result;
	 }
	 //ends of check8
	 //check4 start
	 static int check4(int r,int c)
	 {
	  int result=0;
	  String local="";
	  //case1
	  if(A[r][0]==1&&A[r][1]==1&&A[r][2]==1&&A[r][3]==1)
	  {
	   if(r==0)
	   {
	    local="A'B'";
	   }
	   if(r==1)
	   {
	    local="A'B";
	   }
	   if(r==2)
	   {
	    local="AB";
	   }
	   if(r==3)
	   {
	    local="AB'";
	   }
	   output=output+"+"+local;
	   result=1;
	   //make checked
	   checked[r][0]=1;checked[r][1]=1;checked[r][2]=1;checked[r][3]=1;
	  }else
	  //case2
	  if(A[0][c]==1&&A[1][c]==1&&A[2][c]==1&&A[3][c]==1)
	  {
	   if(c==0)
	   {
	    local="C'D'";
	   }
	   if(c==1)
	   {
	    local="C'D";
	   }
	   if(c==2)
	   {
	    local="CD";
	   }
	   if(c==3)
	   {
	    local="CD'";
	    
	   }
	   output=output+"+"+local;
	   result=1;
	   //make checked
	   checked[0][c]=1;checked[1][c]=1;checked[2][c]=1;checked[3][c]=1;
	  }else
	  //case3 row+ col+
	  if(A[r][c]==1&&A[r][(c+1)%4]==1&&A[(r+1)%4][c]==1&&A[(r+1)%4][(c+1)%4]==1)
	  {
	   if(r==0)
	   {
	    local="A'";
	   }
	   if(r==1)
	   {
	    local="B";
	   }
	   if(r==2)
	   {
	    local="A";
	   }
	   if(r==3)
	   {
	    local="B'";
	   }
	   if(c==0)
	   {
	    local=local+"C'";
	   }
	   if(c==1)
	   {
	    local=local+"D";
	   }
	   if(c==2)
	   {
	    local=local+"C";
	   }
	   if(c==3)
	   {
	    local=local+"D'";
	   }
	   output=output+"+"+local;
	   result=1;
	   //make checked
	   checked[r][c]=1;checked[r][(c+1)%4]=1;checked[(r+1)%4][c]=1;checked[(r+1)%4][(c+1)%4]=1;
	  }else
	  //case4 row+ col--
	  if(A[r][(4+(c-1))%4]==1&&A[r][c]==1&&A[(r+1)%4][(4+(c-1))%4]==1&&A[(r+1)%4][c]==1)
	  {
	   if(r==0)
	   {
	    local="A'";
	   }
	   if(r==1)
	   {
	    local="B";
	   }
	   if(r==2)
	   {
	    local="A";
	   }
	   if(r==3)
	   {
	    local="B'";
	   }
	   if(c==0)
	   {
	    local=local+"D'";
	   }
	   if(c==1)
	   {
	    local=local+"C'";
	   }
	   if(c==2)
	   {
	    local=local+"D";
	   }
	   if(c==3)
	   {
	    local=local+"C'";
	   }
	   output=output+"+"+local;
	   result=1;
	   //make checked
	   checked[r][(4+(c-1))%4]=1;checked[r][c]=1;checked[(r+1)%4][(4+(c-1))%4]=1;checked[(r+1)%4][c]=1;
	   
	  }else
	  //case5 row - and col -
	  if(A[(4+(r-1))%4][(4+(c-1))%4]==1&&A[(4+(r-1))%4][c]==1&&A[r][(4+(c-1))%4]==1&&A[r][c]==1)
	  {
	   if(r==0)
	   {
	    local="B'";
	   }
	   if(r==1)
	   {
	    local="A'";
	   }
	   if(r==2)
	   {
	    local="B";
	   }
	   if(r==3)
	   {
	    local="A";
	   }
	   if(c==0)
	   {
	    local=local+"D'";
	   }
	   if(c==1)
	   {
	    local=local+"C'";
	   }
	   if(c==2)
	   {
	    local=local+"D";
	   }
	   if(c==3)
	   {
	    local=local+"C'";
	   }
	   output=output+"+"+local;
	   result=1;
	   //make checked
	   checked[(4+(r-1))%4][(4+(c-1))%4]=1;checked[(4+(r-1))%4][c]=1;checked[r][(4+(c-1))%4]=1;checked[r][c]=1;
	  }else
	  //case6 row- col+
	  if(A[(4+(r-1))%4][c]==1&&A[(4+(r-1))%4][(c+1)%4]==1&&A[r][c]==1&&A[r][(c+1)%4]==1)
	  {
	   if(r==0)
	   {
	    local="B'";
	   }
	   if(r==1)
	   {
	    local="A'";
	   }
	   if(r==2)
	   {
	    local="B";
	   }
	   if(r==3)
	   {
	    local="A";
	   }
	   if(c==0)
	   {
	    local=local+"C'";
	   }
	   if(c==1)
	   {
	    local=local+"D";
	   }
	   if(c==2)
	   {
	    local=local+"C";
	   }
	   if(c==3)
	   {
	    local=local+"D'";
	   }
	   output=output+"+"+local;
	   result=1;
	   //make checked
	   checked[(4+(r-1))%4][c]=1;checked[(4+(r-1))%4][(c+1)%4]=1;checked[r][c]=1;checked[r][(c+1)%4]=1;
	  }
	  
	  return result;
	 }
	 //check for 2 check2
	 static int check2(int r,int c)
	 {
	  int result=0;
	  String local="";
	  //case 1 col++
	  if(A[r][c]==1&&A[r][(c+1)%4]==1)
	  {
	   if(r==0)
	   {
	    local="A'B'";
	   }
	   if(r==1)
	   {
	    local="A'B";
	   }
	   if(r==2)
	   {
	    local="AB";
	   }
	   if(r==3)
	   {
	    local="AB'";
	   }
	   if(c==0)
	   {
	    local=local+"C'";
	   }
	   if(c==1)
	   {
	    local=local+"D";
	   }
	   if(c==2)
	   {
	    local=local+"C";
	   }
	   if(c==3)
	   {
	    local=local+"D'";
	   }
	   output=output+"+"+local;
	   result=1;
	   //make checked
	   checked[r][c]=1;checked[r][(c+1)%4]=1;
	   
	  }else
	  //case 2 col--
	  if(A[r][(4+(c-1))%4]==1&&A[r][c]==1)
	  {
	   if(r==0)
	   {
	    local="A'B'";
	   }
	   if(r==1)
	   {
	    local="A'B";
	   }
	   if(r==2)
	   {
	    local="AB";
	   }
	   if(r==3)
	   {
	    local="AB'";
	   }
	   if(c==0)
	   {
	    local=local+"D'";
	   }
	   if(c==1)
	   {
	    local=local+"C'";
	   }
	   if(c==2)
	   {
	    local=local+"D";
	   }
	   if(c==3)
	   {
	    local=local+"C";
	   }
	   output=output+"+"+local;
	   result=1;
	   //make checked
	   checked[r][(4+(c-1))%4]=1;checked[r][c]=1;  
	  }else
	  //case3 row++
	  if(A[r][c]==1&&A[(r+1)%4][c]==1)
	  {
	   if(r==0)
	   {
	    local="A'";
	   }
	   if(r==1)
	   {
	    local="B";
	   }
	   if(r==2)
	   {
	    local="A";
	   }
	   if(r==3)
	   {
	    local="B'";
	   }
	   if(c==0)
	   {
	    local=local+"C'D'";
	   }
	   if(c==1)
	   {
	    local=local+"C'D";
	   }
	   if(c==2)
	   {
	    local=local+"CD";
	   }
	   if(c==3)
	   {
	    local=local+"CD'";
	   }
	   output=output+"+"+local;
	   result=1;
	   //make checked
	   checked[r][c]=1;checked[(r+1)%4][c]=1;
	   }else
	  // case4 row--
	  if(A[r][c]==1&&A[(4+(r-1))%4][c]==1)
	  {
	   if(r==0)
	   {
	    local="B'";
	   }
	   if(r==1)
	   {
	    local="A'";
	   }
	   if(r==2)
	   {
	    local="B";
	   }
	   if(r==3)
	   {
	    local="A";
	   }
	   if(c==0)
	   {
	    local=local+"C'D'";
	   }
	   if(c==1)
	   {
	    local=local+"C'D";
	   }
	   if(c==2)
	   {
	    local=local+"CD";
	   }
	   if(c==3)
	   {
	    local=local+"CD'";
	   }
	   output=output+"+"+local;
	   result=1;
	   //make checked
	   checked[r][c]=1;checked[(4+(r-1))%4][c]=1;
	   }
	  return result;
	 }
	 // no grouping
	 static void nogrouping(int r, int c)
	 {
	  String local="";
	  if(r==0)
	  {
	   local="A'B'";
	  }
	  if(r==1)
	  {
	   local="A'B";
	  }
	  if(r==2)
	  {
	   local="AB";
	  }
	  if(r==3)
	  {
	   local="AB'";
	  }
	  if(c==0)
	  {
	   local=local+"C'D'";
	  }
	  if(c==1)
	  {
	   local=local+"C'D";
	  }
	  if(c==2)
	  {
	   local=local+"CD";
	  }
	  if(c==3)
	  {
	   local=local+"CD'";
	  }
	  output=output+"+"+local;
	  
	  checked[r][c]=1;
	 }
	 
	 // initialize 2D-Array
	 static void initialize()
	 {
	  int count=0;
	  for(int i=0;i<4;i++)
	  {
	   for(int j=0;j<4;j++)
	   {
	    A[i][j]=value[count];
	    checked[i][j]=0;
	    count++;
	   }
	  }
	 }
	 //end of initialize
	 
	 
	 
	 public static void main(String args[])
	 {
	  Mapa4K object =new Mapa4K();
	 }

	}


