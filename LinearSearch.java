import java.awt.*;
import java.util.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.awt.Frame.*;
import java.net.URL;
import java.awt.image.*;
import java.lang.*;
import MyPack.*;
import java.awt.*;
import java.applet.Applet;



/////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
class CloseableFrame extends Frame
{
	public Font butFont = new Font("Lucida Casual",Font.BOLD,15);
	public CloseableFrame(String a)
	{
		setTitle(a);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int screenHeight = d.height;
		int screenWidth = d.width;
		setSize(screenWidth, screenHeight);
	}
}





/////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////

  class ChooseFrame extends CloseableFrame implements ActionListener,Runnable
{
   AudioClip main1;
   Cursor cursor,newcursor;
   Toolkit tk=Toolkit.getDefaultToolkit();
   Dimension 	bestSize = tk.getBestCursorSize(32,32);
   int 		maxColors = tk.getMaximumCursorColors();	
   Color col=new Color(64,128,128);
   Image ia,key;
   URL u,urlmain1;
   int start=1;
   Applet app;
     String Name[] = {"MAITHRY","BHAVANA"};
	int counter;
      Thread t,t1;

    
	Label l1,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
	Button  lBut,bBut,tBut;
        

	GridBagLayout g1;
	GridBagConstraints  gbc;

         Font font = new Font("Arial", Font.BOLD,25);
	 Font font1 = new Font("Arial", Font.BOLD,15);

    public ChooseFrame(String title)
    {
		super(title);
            Graphics g=getGraphics();
		g1 = new GridBagLayout();
                gbc = new GridBagConstraints();
                   setLayout(g1);

      urlmain1=getClass().getResource("main1.wav");
	app=new Applet();
      try{
      main1=app.newAudioClip(urlmain1);    
      }
       catch(NullPointerException e){ }
       for(int p=0;p<=110000;p++)
       for(int q=0;q<=20000;q++)
        ;start=0;
       
      
     
       newcursor=Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
      if(maxColors == 0) 
			System.out.println("custom cursors not supported");
		else {
			key = tk.getImage("smileCursor.gif");
			cursor 		= tk.createCustomCursor(key, 
											new Point(1,1), 
											"smile cursor");
			//setCursor(cursor);
		} 
       
       setBackground(col);

       /*g.setColor(new Color(128,64,0));
       for(int i=12,col=300,row=20;row<=500;i+=10,col-=20,row+=(40+i-10))
       {
         g.setFont(new Font("Arial",Font.BOLD,i));
         g.drawString("Searching Algorithms",col,row);
       }*/





            l6 = new Label("BY");
		l6.setFont(font);
		gbc.gridx=1;
		gbc.gridy=1;
		g1.setConstraints(l6,gbc);
       	add(l6);
		
	l1 = new Label("                                         ");
        l1.setFont(font);
		gbc.gridx=1;
        gbc.gridy=4;
        g1.setConstraints(l1,gbc);
        add(l1);


		l5 = new Label("                                                      ");
		l5.setFont(font);
		gbc.gridx=1;
		gbc.gridy=6;
		g1.setConstraints(l5,gbc);
        //add(l5);

		

		l7 = new Label("                                                      ");
		l7.setFont(font);
		gbc.gridx=1;
		gbc.gridy=10;
		g1.setConstraints(l7,gbc);
        //add(l7);

		l8 = new Label("           CHOOSE ONE OF THE FOLLOWING                ");
		l8.setFont(font);
		gbc.gridx=1;
		gbc.gridy=10;
		g1.setConstraints(l8,gbc);
       	add(l8);
            /* try {
		 u = getClass().getResource("search.gif");
			ia= createImage((ImageProducer)u.getContent());

		}
            catch(Exception e) {
			e.printStackTrace();
		}

            MediaTracker mtba = new MediaTracker(this);
		mtba.addImage(ia, 0);

try {
			mtba.waitForID(0);
}

catch(Exception e) {
			e.printStackTrace();
		}
 g.drawImage(ia,100,447,this);*/

		l10 = new Label("                                                      ");
		l10.setFont(font);
		gbc.gridx=1;
		gbc.gridy=9;
		g1.setConstraints(l10,gbc);
       add(l10);

		l11 = new Label("                                                      ");
		l11.setFont(font);
		gbc.gridx=1;
		gbc.gridy=12;
		g1.setConstraints(l11,gbc);
       	add(l11);

		lBut = new Button("      LINEAR SEARCH     ");
        lBut.setBounds(500,500,100,30);
        lBut.setFont(butFont);
		gbc.gridx=1;
        gbc.gridy=13;
        g1.setConstraints(lBut,gbc);
        add(lBut);
		lBut.addActionListener(this);

        l12 = new Label("                                                      ");
		l12.setFont(font);
		gbc.gridx=1;
		gbc.gridy=14;
		g1.setConstraints(l12,gbc);
       	add(l12);

        bBut = new Button("     BINARY SEARCH     ");
        bBut.setBounds(500,500,100,30);
        bBut.setFont(butFont);
		gbc.gridx=1;
        gbc.gridy=15;
        g1.setConstraints(bBut,gbc);
        add(bBut);
		bBut.addActionListener(this);

        l13 = new Label("                                                      ");
		l13.setFont(font);
		gbc.gridx=1;
		gbc.gridy=16;
		g1.setConstraints(l13,gbc);
		add(l13);

        tBut = new Button("       BINARY SEARCH TREE      ");
		tBut.setBounds(500,500,100,30);
        tBut.setFont(butFont);
		gbc.gridx=1;
		gbc.gridy=17;
		g1.setConstraints(tBut,gbc);
        add(tBut);
		tBut.addActionListener(this);
		
		l3 = new Label("                                                            ");
		l3.setFont(font);
		gbc.gridx=1;
		gbc.gridy=19;
		g1.setConstraints(l3,gbc);
       add(l3);
		
		t = new Thread(this);
        t.start();
	  main1.loop();

	}


public void paint(Graphics g)
{     
       g.setColor(new Color(192,192,192));
       for(int i=12,col=1,row=60;row<=200;i+=2,row+=(40+i-10))
       {
         g.setFont(new Font("Arial",Font.BOLD,i));
         g.drawString("Searching Algorithms",col,row);
       }
	for(int i=12,col=670,row=60;row<=200;col-=20,i+=2,row+=(40+i-10))
       {
         g.setFont(new Font("Arial",Font.BOLD,i));
         g.drawString("Searching Algorithms",col,row);
       }

}


public void run()
    {
		for(;t != null;)
		{

            display();
			try
			{
                t.sleep(0);
			}
			catch(InterruptedException e)
			{
			}
			//display();
			try
			{
                t.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		}
    }

    public void display()
    {
        Font font = new Font("Monotype Corsiva", Font.BOLD,50);
        l1.setFont(font);
        l1.setText(Name[counter]);
        counter++;
        if(counter>=2)
        {
            counter=0;
        }
    }


	public void actionPerformed(ActionEvent evt)
	{
		Object source = evt.getSource();
		if(source == lBut)
		{     main1.stop();
			dispose();
			JOptionPane.showMessageDialog(null,"LOADING LINEAR SEARCH PAGE ... ");
			LinearSearch1 f = new LinearSearch1("LINEAR SEARCH");
			f.show();
		}
		else if(source == bBut)
		{     main1.stop();
			dispose();
			JOptionPane.showMessageDialog(null,"LOADING BINARY SEARCH PAGE ... ");
			BinarySearch f = new BinarySearch("BINARY SEARCH");
			f.show();
		}
		else if(source == tBut)
		{     main1.stop();
			dispose();
			JOptionPane.showMessageDialog(null,"LOADING BINARY SEARCH TREE PAGE ... ");
			BinSearchTree f = new BinSearchTree("BINARY SEARCH TREE");
			f.show();
		}
	}	

}










 /////////////////////////////////////////////////////////////////////////////////////////////
 /////////////////////////////////////////////////////////////////////////////////////////////

 class LinearSearch1 extends CloseableFrame
                          implements ActionListener,Runnable,MouseListener,MouseMotionListener {
   Label enterLabel, resultLabel,array,l1;
   TextField enter, result,arraysize;
   int a[],counter=0,counter2=0;
   int t=0,i=0,j=0,n=0,nextl=0;
   Image im,imb,imred,im1,alpha,imn,imba,key,imh;
   int k=0,prev=0,l=0;
   int xpoly[]={0,0,0,0,0,0};
   int ypoly[]={0,0,0,0,0,0};
   int x[]={0,0,0,0,0,0};
   int y[]={0,0,0,0,0,0};
   Thread th;
   String[] Name={"Searching","Algorithms"};
   String msg=" ";
   int mx,my,mvx,mvy,element,start=1;
   int lastpolyx=0,lastpolyy=0;
   //Toolkit tk = Toolkit.getDefaultToolkit();
   Color col=new Color(64,128,128);
   Color col1=new Color(192,192,192);
   Color col2=new Color(48,97,97);
   Color col3=new Color(0,128,192); 
   Applet app;
   URL url,url1,url2,url3,url4,url5,url6,urllin1,urllin2;
   AudioClip lin1,lin2;
   Cursor cursor,newcursor;
   Toolkit tk=Toolkit.getDefaultToolkit();
   Dimension 	bestSize = tk.getBestCursorSize(32,32);
   int 		maxColors = tk.getMaximumCursorColors();	

 


 public LinearSearch1(String title)
   {
      super(title);

      newcursor=Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
      if(maxColors == 0) 
			System.out.println("custom cursors not supported");
		else {
			key = tk.getImage("smileCursor.gif");
			cursor 		= tk.createCustomCursor(key, 
											new Point(1,1), 
											"smile cursor");
			setCursor(cursor);
		}

      app=new Applet();
      addMouseListener(this);
      addMouseMotionListener(this);
      Font font = new Font("Arial", Font.BOLD,60);
      setLayout( new FlowLayout() );
      setBackground(col);
      array=new Label("Array size ");
      add(array);

      arraysize = new TextField( 3 );
      arraysize.addActionListener( this );
      add( arraysize );

         
      enterLabel = new Label( "Enter search key" );
      add( enterLabel );
      enterLabel.setForeground(Color.white);

      enter = new TextField( 3 );
      enter.addActionListener( this );
      add( enter );
            

      resultLabel = new Label( "Result" );
      add( resultLabel );
      resultLabel.setForeground(Color.white);

      result = new TextField( 23 );
      result.setEditable( false );
      add( result );
      result.setForeground(Color.white);
        
     
     
      // //////////// /////////
      a = new int[15 ];
      n=a.length;
      for ( int i = 0; i < a.length; i++ )
      a[ i ] = 2 * i;
      loadImage();
      filterImage();
  

   
}




  
 int linearSearch( int array[], int key ) 
   {    //repaint(60,211,60+44*14,214);
	repaint(60,190,83+44*14,214);
	prev=k;
 	k=60;
	Graphics g1=getGraphics();
	g1.setColor(col1);
      g1.drawRect(k,212,45,45);
      g1.setColor(col2);
      g1.fillRect(k+1,212+1,44,44);
	xpoly[0]=k+2;
	xpoly[1]=k+23+2;
	xpoly[2]=k+23+45;
	xpoly[3]=k+45;
	ypoly[0]=212-1; 
	ypoly[1]=190+1;
	ypoly[2]=190+1;
	ypoly[3]=212-1;
      //int xpoly[]={k+2,k+23+2,k+23+45,k+45};
	//int ypoly[]={212-1,190+1,190+1,212-1}; 
      g1.fillPolygon(xpoly,ypoly,4);
      xpoly[0]=k+1;
	xpoly[1]=k+23+1;
	xpoly[2]=k+23+46;
	xpoly[3]=k+46;
	ypoly[0]=212-1; 
	ypoly[1]=190+1;
	ypoly[2]=190+1;
	ypoly[3]=212-1;
	g1.setColor(col1);
        g1.drawPolygon(xpoly,ypoly,4);
    
        g1.setColor(col1);
        g1.setFont(new Font("SansSarif",Font.BOLD,12));
        FontMetrics fm=g1.getFontMetrics();
        g1.drawString(Integer.toString(a[0]),k+1+22,240);
	g1.drawImage(im,15+k,260,this);
	for(int p=0;p<20000;p++)
	 for(int q=0;q<10000;q++)
 	{;}	
	for ( int n = 0; n < a.length; n++ ) 
	    {
	j=0; 
         
        if ( array[ n ] == key )
        {return n;}
        prev=k; 
        k=k+45;  
        g1.setColor(col);
 	g1.fillRect(15+prev,260,16,40);
        if(n==a.length-1)g1.drawImage(im,15+15*45+245,260,this);
	else { 
	xpoly[0]=k+2;
	xpoly[1]=k+23+2;
	xpoly[2]=k+23+45;
	xpoly[3]=k+45;
	ypoly[0]=212-1; 
	ypoly[1]=190+1;
	ypoly[2]=190+1;
	ypoly[3]=212-1;
	g1.setColor(col2);
        g1.fillPolygon(xpoly,ypoly,4);

	xpoly[0]=k+1;
	xpoly[1]=k+23+1;
	xpoly[2]=k+23+46;
	xpoly[3]=k+46;
	ypoly[0]=212-1; 
	ypoly[1]=190+1;
	ypoly[2]=190+1;
	ypoly[3]=212-1;
	g1.setColor(col1);
        g1.drawPolygon(xpoly,ypoly,4);
	
	
	if(k==60+45*(a.length-1))
	{
        
        int x1[]={lastpolyx,lastpolyy,lastpolyy,lastpolyx};
        int y1[]={211,191,235,257};
        
	g1.setColor(col2);
        g1.fillPolygon(x1,y1,4);
	g1.setColor(Color.white);
	g1.drawPolygon(x1,y1,4);
	}
	
        g1.setColor(col1);
        g1.drawRect(k,212,45,45);
        g1.setColor(col2);
        g1.fillRect(k+1,212+1,44,44);
        g1.setColor(col1);
        g1.setFont(new Font("SansSarif",Font.BOLD,12));
        fm=g1.getFontMetrics();
        g1.drawString(Integer.toString(a[n+1]),k+1+22,240);
        g1.drawImage(im,15+k,260,this);}
	for(int p=0;p<20000;p++)
 	for(int q=0;q<10000;q++)
 	{;}
          
     }
       return -1;
  }


public void update(Graphics g)
{
 paint(g);
}



public void paint(Graphics g)
  { 
    if(start==1)
     { try{
      lin1=app.newAudioClip(urllin1);    
      lin1.play();}
      catch(NullPointerException e){ }
      for(int p=0;p<=110000;p++)
      for(int q=0;q<=20000;q++)
      ;
     
      start=0;
   }
           
     g.setColor(col2);
     g.fillRoundRect(53,322,690,100,15,15);
     g.setColor(Color.black);
     g.drawRoundRect(53,322,690,100,15,15);
     g.setColor(Color.white);
     g.setFont(new Font("SansSarif",Font.BOLD,12));
     g.drawString("Linear Search:",88,339);
     g.drawString("Enter the search key in the text box and press enter",88,370);
     g.drawString("Watch the algorithm go, to find the key !!!",88,395);

     g.drawString("Press next to know about LinearSearch",510,410);
     
     //int x1[]={735,758,758,735};
     //int y1[]={212,190,235,257};
 
      j=60;
      k=60; 
      l=83;
      
     for(int i=0;i<a.length;i++)
       {
        
        x[0]=j;
        x[1]=l;
	x[2]=l+45;
	x[3]=j+45;
	y[0]=212-1; 
	y[1]=190+1;
	y[2]=190+1;
	y[3]=212-1;
	g.setColor(col1);
        g. fillPolygon(x,y,4);
        g.setColor(Color.black);
        g.drawPolygon(x,y,4);

        //g.drawString(msg,mx,my);
        
        g.setColor(Color.black);
        g.drawRect(j,212,45,45); 
        g.setColor(col1);
        g.fillRect(j+1,212+1,44,44);
        g.setColor(Color.black);
        g.setFont(new Font("SansSarif",Font.BOLD,12));
        FontMetrics fm=g.getFontMetrics();
        g.drawString(Integer.toString(a[i]),j+22,240);
        j=j+45; 
        l=l+45;
        
       g.drawImage(im,15+k,260,this); 
       
       }
              
       g.setColor(col1);
       //int x1[]={735,758,758,735};
       //int y1[]={212,190,235,257};

       int x1[]={j,l,l,j};lastpolyx=j;lastpolyy=l;
       int y1[]={211,191,235,257};
       g.fillPolygon(x1,y1,4);
       g.setColor(Color.black);
       g.drawPolygon(x1,y1,4);
       g.drawImage(imn,629,447,this);g.drawImage(imba,100,447,this);
       g.drawImage(imh,375,117,this);
       g.drawImage(alpha,0,50,this); 
       g.drawImage(alpha,770,50,this);
       
   }



private void loadImage() {
		try {
			 url = getClass().getResource("arrow.jpg");
			im = createImage((ImageProducer)url.getContent());

		       url1=getClass().getResource("white.jpg");
                        imb = createImage((ImageProducer)url1.getContent());
				
			 url2=getClass().getResource("red.jpg");
                        imred = createImage((ImageProducer)url2.getContent());
			
			 url3=getClass().getResource("linear.jpg");
                        im1 = createImage((ImageProducer)url3.getContent());
			 url5=getClass().getResource("back.jpg");
                        imba = createImage((ImageProducer)url5.getContent());

                   url4=getClass().getResource("next.jpg");
                        imn = createImage((ImageProducer)url4.getContent());

			 url6=getClass().getResource("help.jpg");
                        imh = createImage((ImageProducer)url6.getContent());

		
        	       urllin1=getClass().getResource("lin1.wav");
                   urllin2=getClass().getResource("help.wav");
  
			
                    }
		catch(Exception e) {
			e.printStackTrace();
		}

		MediaTracker mt = new MediaTracker(this);
		mt.addImage(im, 0);
            MediaTracker mtb = new MediaTracker(this);
		mtb.addImage(imb, 0);
		MediaTracker mtr = new MediaTracker(this);
		mtr.addImage(imred, 0);
		MediaTracker mt1 = new MediaTracker(this);
		mt1.addImage(im1, 0);
            MediaTracker mtba = new MediaTracker(this);
		mtba.addImage(imba, 0);
            MediaTracker mtn = new MediaTracker(this);
		mtn.addImage(imn, 0);
            MediaTracker mth = new MediaTracker(this);
		mth.addImage(imh, 0);

		try {
			mt.waitForID(0);
                  mtb.waitForID(0);
			mtr.waitForID(0);
			mt1.waitForID(0);
                  mtba.waitForID(0);
                  mtn.waitForID(0);
			mth.waitForID(0);

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


private void filterImage() {
		alpha = createImage(new FilteredImageSource(
		im1.getSource(), new DissolveFilter(50)));
	}



public void actionPerformed( ActionEvent e )
 {  Graphics g=getGraphics();
   
  
         

      if(e.getSource()==enter)
      {
      k=60;
      String searchKey = e.getActionCommand();
      
      Graphics g1=getGraphics();
      int position,previ=0;;
     
      previ=0;
      try{
      element =
      linearSearch( a, Integer.parseInt( searchKey ) );
      }
      catch(Exception ex){
      previ=1;
      JOptionPane.showMessageDialog(null,"You must enter an integer value !!");
      }

    
      if(previ==0)
      { 
      if ( element != -1 )
      { position=element+1;
        result.setText( "Element fount at position =  " +
                         position );
        xpoly[0]=k+2;
	xpoly[1]=k+23+2;
	xpoly[2]=k+23+45;
	xpoly[3]=k+45;
	ypoly[0]=212-1; 
	ypoly[1]=190+1;
	ypoly[2]=190+1;
	ypoly[3]=212-1;
	g1.setColor(Color.white);
        g1.fillPolygon(xpoly,ypoly,4);

        if(k==60+45*(n-1))
	{
        
        int x1[]={lastpolyx,lastpolyy,lastpolyy,lastpolyx};
        int y1[]={211,191,235,257};
	g1.setColor(Color.white);
        g1.fillPolygon(x1,y1,4);
	g1.setColor(Color.black);
	g1.drawPolygon(x1,y1,4);
	}

	g1.setColor(Color.white);
        g1.fillRect(k+1,212+1,44,44);
        g1.setColor(Color.black);
        g1.drawRect(k,212,45,45);
        g1.setFont(new Font("SansSarif",Font.BOLD,12));
        FontMetrics fm=g1.getFontMetrics();
        g1.drawString(Integer.toString(a[element]),k+1+22,240);
        g1.drawImage(imred,15+k,260,this); 
        for(int p=0;p<20000;p++)
        for(int q=0;q<10000;q++)
        {;}
        g1.setColor(col);
	g1.fillRect(15+k,260,16,40);
        for(int p=0;p<20000;p++)
        for(int q=0;q<10000;q++)
         {;}
        g1.drawImage(imred,15+k,260,this);
      }
      else
      result.setText( "Value not found" );
      for(int p=0;p<20000;p++)
      for(int q=0;q<30000;q++)
      {;}
      g1.setColor(col);
      g1.fillRect(15+k,260,16,40);
   }
 }
   else if(e.getSource()==arraysize)

   { String size = e.getActionCommand();         
      int prevn=n,previi=0;
      
      try{
      n=Integer.parseInt(size);
      }
      catch(Exception ex)
      { previi=1;
        JOptionPane.showMessageDialog(null,"You must enter an integer value !!");
      } 
      if( n <=15 && previi==0)
      {
       a = new int[ n ];
       int previ=0;
       n=a.length;
       for ( int i = 0; i < a.length;)
       {
        previ=0;
        String s="Enter a["+i+"] such that -999<=a[i]<=999",s1;
        s1=JOptionPane.showInputDialog(s);
         try{
              a[ i ] =Integer.parseInt(s1);
            }
        catch(Exception ex) {previ=1; 
        JOptionPane.showMessageDialog(null,"You must enter an integer value !!");
                             }
       if(previ==0 && a[i]>=-999 && a[i]<=999) {i++;}
       }
    
       g.setColor(col);  
       g.fillRect(60,190,83+44*14,214);
       repaint(60,190,83+44*14,214); 
      }

     if(n>15 && previi==0)
     {
        n=prevn;
       JOptionPane.showMessageDialog(null,"You must enter a number<=15 !!");
     }
    }//end of if<=15
    
   }
public void mouseClicked(MouseEvent me)
{

  mx=me.getX();my=me.getY();
  msg=mx+"and"+my;
  //repaint();

 }

  public void mouseEntered(MouseEvent me)
  {
   mx=0;my=24;
   msg="mouse just entered applet window";
   //repaint();
  }

  public void mouseExited(MouseEvent me)
  {
     mx=0;my=24;
     msg="mouse just left applet window";
  // repaint();
  }

  public void mouseReleased(MouseEvent me)
  {
   mx=me.getX();my=me.getY();
   msg="up";
 //  repaint();
  }

  public void mouseDragged(MouseEvent me)
  {
   mx=me.getX();my=me.getY();
   mvx=me.getX();mvy=me.getY();
   msg="*";
//   repaint();
  }

  public void mouseMoved(MouseEvent me)
  {
   mx=me.getX();my=me.getY();
   if(mx>=98 && mx<=167 && my>=443 && my<=478)
   {
     setCursor(newcursor);
    }
   else if(mx>=622 && mx<=694 && my>=440 && my<=478)
   {
     setCursor(newcursor);
    }
   else if(mx>=375 && mx<=438 && my>=117 && my<=144)
   {
     setCursor(newcursor);
    }

   else
     setCursor(cursor);
   //repaint();
  }

  public void mousePressed(MouseEvent me)
  {Graphics g=getGraphics();
    mx=me.getX();my=me.getY();
  
  if(mx>375 && mx<=438 && my>=117 && my<=144)
  {
   lin2=app.newAudioClip(urllin2);    
   lin2.play();
  }
  else if(mx>=98 && mx<=167 && my>=443 && my<=478)
 {try{
  lin2.stop();} catch(NullPointerException e) { ;}
  dispose();
  ChooseFrame f = new ChooseFrame("SEARCHING ALGORITHMS");
  f.show();
}
else 
if(mx>=622 && mx<=694 && my>=440 && my<=478)
     {
	nextl++;
        if(nextl>=3) nextl=0;
      switch(nextl) 
     {
           
     case 0:
     g.setColor(col2);
     g.fillRoundRect(53,322,690,100,15,15);
     g.setColor(Color.black);
     g.drawRoundRect(53,322,690,100,15,15);
     g.setColor(Color.white);
     g.setFont(new Font("SansSarif",Font.BOLD,12));
     g.drawString("Linear Search:-",88,339);
     g.drawString("Enter the search key in the text box and press enter",88,370);
     g.drawString("Watch the algorithm go, to find the key !!!",88,395);
     g.drawString("Press next to know about LinearSearch",510,410);
     break;
     

     case 1:
     g.setColor(col2);
     g.fillRoundRect(53,322,690,100,15,15);
     g.setColor(Color.black);
     g.drawRoundRect(53,322,690,100,15,15);
     g.setColor(Color.white);
     g.setFont(new Font("SansSarif",Font.BOLD,12));
     g.drawString("Linear Search:-",88,339);
     g.drawString("Linear Search compares each element of the array with the search key.",88,355);
     g.drawString("It works well for small arrays or for unsorted arrays.",88,375);
     g.drawString("If the array is sorted the high-speed binary search is used.",88,395);
     	
     g.drawString("Press next to know about LinearSearch",510,410);
     break;	


     case 2:
     g.setColor(col2);
     g.fillRoundRect(53,322,690,100,15,15);
     g.setColor(Color.black);
     g.drawRoundRect(53,322,690,100,15,15);
     g.setColor(Color.white);
     g.setFont(new Font("SansSarif",Font.BOLD,12));
     g.drawString("Linear Search:-",88,339);
     //g.drawString("The Linear Search compares each element of the array with the search key.",88,3550);
     g.drawString("Best Case       :    Element found at the beginning",88,355);
     g.drawString("Average Case:    For comparisons done half the array size number of times",88,375);
     g.drawString("Worst Case   :     Element found at the end",88,395);	
     g.drawString("Press next to know about LinearSearch",510,410);
     break;



default:;
}
}

else {;}
     msg="mouse="+mx+","+my;
   //  repaint();
  }

public void run()
    {             
	for(;th != null;)
	{

           display();
	     try
	   {
             th.sleep(1000);
	   }
	   catch(InterruptedException e)
           {
           }
			
	   }                
    }


public void display()
    {
        Font font = new Font("Monotype Corsiva", Font.BOLD,50);
        l1.setFont(font);
        l1.setText(Name[counter]);
        counter++;
        if(counter>=2)
        {
            counter=0;
        }
    }
   
}












 /////////////////////////////////////////////////////////////////////////////////////////////
 /////////////////////////////////////////////////////////////////////////////////////////////
 class BinarySearch extends CloseableFrame
                          implements ActionListener,Runnable,MouseListener,MouseMotionListener {
   Label enterLabel, resultLabel,l1,array;
   TextField enter, result,arraysize;
   String display = "";
   int a[],counter=0;
   int t=0,i=0,j=0,k=0,prev=0,mid,nextl=0,l=0;
   Image im,imb,imred,im1,alpha,imn,imba,key,imh;
   int xpoly[]={0,0,0,0,0,0};
   int ypoly[]={0,0,0,0,0,0};
   int x[]={0,0,0,0,0,0};
   int y[]={0,0,0,0,0,0};
   int lastpolyx=0,lastpolyy=0,n;
   int mx,my,mvx,mvy,element,start=1;
   String[] Name={"Searching","Algorithms"};
   String msg=" ";
   Thread th;
   Color col=new Color(64,128,128);
   Color col1=new Color(192,192,192);
   Color col2=new Color(48,97,97);
   Color col3=new Color(0,128,192); 
   Cursor cursor,newcursor;
   Toolkit tk=Toolkit.getDefaultToolkit();
   Dimension 	bestSize = tk.getBestCursorSize(32,32);
   int 		maxColors = tk.getMaximumCursorColors();	
   URL urlbin1,url,url1,url2,url3,url4,url5,url6,urlbin2;
   AudioClip bin1,bin2;
   Applet app;

public  BinarySearch(String title)
   {    
      super(title);
      newcursor=Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
      if(maxColors == 0) 
			System.out.println("custom cursors not supported");
		else {
			key = tk.getImage("smileCursor.gif");
			cursor 		= tk.createCustomCursor(key, 
											new Point(1,1), 
											"smile cursor");
			setCursor(cursor);
		}

      app=new Applet();




      addMouseListener(this);
      addMouseMotionListener(this);
      Font font = new Font("Arial", Font.BOLD,50);
      setLayout( new FlowLayout() );
      setBackground(col);
      
      array=new Label("Array size ");
      add(array);

      arraysize = new TextField( 3 );
      arraysize.addActionListener( this );
      add( arraysize );

      enterLabel = new Label( "Enter search key" );
      add( enterLabel );
      enterLabel.setForeground(Color.white);

      enter = new TextField( 3 );
      enter.addActionListener( this );
      add( enter );

      resultLabel = new Label( "Result" );
      add( resultLabel );
      resultLabel.setForeground(Color.white);

      result = new TextField( 22 );
      result.setEditable( false );
      add( result );   
      result.setForeground(Color.white);
      // create array and fill with even integers 0 to 28

      a = new int[ 15 ];
      n=a.length;  
      for ( int i = 0; i < a.length; i++ ) 
      a[ i ] = 2 * i;
      loadImage(); 
      filterImage();
      
      

 }

   
public void update(Graphics g)
{
 paint(g);
}

  public void paint(Graphics g)
  { 
     if(start==1)
     { try{
      bin1=app.newAudioClip(urlbin1);    
      bin1.play();}
       catch(NullPointerException e){ }
       for(int p=0;p<=110000;p++)
       for(int q=0;q<=20000;q++)
        ;start=0;
       
      
     }
           
     
     g.setColor(col2);
     g.fillRoundRect(53,322,690,100,15,15);
     g.setColor(Color.black);
     g.drawRoundRect(53,322,690,100,15,15);
     g.setColor(Color.white);
     g.setFont(new Font("SansSarif",Font.BOLD,12));
     g.drawString("Binary Search:",88,339);
     g.drawString("Enter the search key in the text box and press enter",88,370);
     g.drawString("Watch the algorithm go, to find the key !!!",88,395);

     g.drawString("Press next to know about LinearSearch",510,410);
     
     //int x1[]={735,758,758,735};
     //int y1[]={212,190,235,257};
 
      j=60;
      k=60; 
      l=83;
      
     for(int i=0;i<a.length;i++)
       {
        
        x[0]=j;
        x[1]=l;
	x[2]=l+45;
	x[3]=j+45;
	y[0]=212-1; 
	y[1]=190+1;
	y[2]=190+1;
	y[3]=212-1;
	g.setColor(col1);
        g. fillPolygon(x,y,4);
        g.setColor(Color.black);
        g.drawPolygon(x,y,4);

        //g.drawString(msg,mx,my);

        g.setColor(Color.black);
        g.drawRect(j,212,45,45); 
        //g.drawLine(j,212,l,190);       
        g.setColor(col1);
        g.fillRect(j+1,212+1,44,44);
        g.setColor(Color.black);
        g.setFont(new Font("SansSarif",Font.BOLD,12));
        FontMetrics fm=g.getFontMetrics();
        g.drawString(Integer.toString(a[i]),j+22,240);
        j=j+45; 
        l=l+45;
        
       g.drawImage(im,15+k,260,this); 
       
       }

       g.setColor(col1);
       //int x1[]={735,758,758,735};
       //int y1[]={212,190,235,257};

       int x1[]={j,l,l,j};lastpolyx=j;lastpolyy=l;
       int y1[]={211,191,235,257};
       g.fillPolygon(x1,y1,4);
       g.setColor(Color.black);
       g.drawPolygon(x1,y1,4);
       g.drawImage(imba,100,447,this);
       g.drawImage(imn,629,447,this);
       g.drawImage(imh,375,117,this);
       g.drawImage(alpha,0,50,this); 
       g.drawImage(alpha,770,50,this);
   }


      
   private void loadImage() {
		try {
			url = getClass().getResource("arrow.jpg");
			im = createImage((ImageProducer)url.getContent());

		      url1=getClass().getResource("white.jpg");
                        imb = createImage((ImageProducer)url1.getContent());
				
			url2=getClass().getResource("red.jpg");
                        imred = createImage((ImageProducer)url2.getContent());
			
			url3=getClass().getResource("binary.jpg");
                        im1 = createImage((ImageProducer)url3.getContent());
			url5=getClass().getResource("back.jpg");
                        imba = createImage((ImageProducer)url5.getContent());

                  url4=getClass().getResource("next.jpg");
                   imn = createImage((ImageProducer)url4.getContent());
 
                  url6=getClass().getResource("help.jpg");
                   imh = createImage((ImageProducer)url6.getContent());

                  urlbin1=getClass().getResource("bin1.wav");
                  urlbin2=getClass().getResource("help.wav");
 
 }
		catch(Exception e) {
			e.printStackTrace();
		}

		MediaTracker mt = new MediaTracker(this);
		mt.addImage(im, 0);
                MediaTracker mtb = new MediaTracker(this);
		mtb.addImage(imb, 0);
		MediaTracker mtr = new MediaTracker(this);
		mtr.addImage(imred, 0);
		MediaTracker mt1 = new MediaTracker(this);
		mt1.addImage(im1, 0);
 MediaTracker mtba = new MediaTracker(this);
		mtba.addImage(imba, 0);
               
 MediaTracker mtn = new MediaTracker(this);
		mtn.addImage(imn, 0);
MediaTracker mth = new MediaTracker(this);
		mth.addImage(imh, 0);


		try {
			mt.waitForID(0);
                        mtb.waitForID(0);
			mtr.waitForID(0);
			mt1.waitForID(0);
                        mtn.waitForID(0);
 			mtba.waitForID(0);
                  mth.waitForID(0);

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


private void filterImage() {
		alpha = createImage(new FilteredImageSource(
		im1.getSource(), new DissolveFilter(50)));
	}






   public void actionPerformed( ActionEvent e )
   {
      Graphics g1=getGraphics();
      int element=0;
          
            


     if(e.getSource()==enter)
      {
        String searchKey = e.getActionCommand();
	
        int position=0;
        // initialize display string for the new search
        display = "Portions of array searched\n";
        // perform the binary search
        int ii=0; 
     
     try{
     element =
         binarySearch( a, Integer.parseInt( searchKey ) ); 
     }
     catch(Exception ex)
     { 
      ii=1;
      JOptionPane.showMessageDialog(null,"You must enter an integer value !!");
     }

      if(ii==0)
      { 
      if ( element != -1 )
        {
         position=element+1;
         result.setText("Element found at position= " + position );
	xpoly[0]=element*45+60;
	xpoly[1]=element*45+60+23;
	xpoly[2]=element*45+60+23+45;
	xpoly[3]=element*45+60+45;
	ypoly[0]=212-1; 
	ypoly[1]=190+1;
	ypoly[2]=190+1;
	ypoly[3]=212-1;
        //int xpoly[]={k+2,k+23+2,k+23+45,k+45};
	//int ypoly[]={212-1,190+1,190+1,212-1}; 
	g1.setColor(Color.white);
        g1.fillPolygon(xpoly,ypoly,4);
        xpoly[0]=element*45+60;
	xpoly[1]=element*45+60+23;
	xpoly[2]=element*45+60+23+45;
	xpoly[3]=element*45+60+45;
	ypoly[0]=212-1; 
	ypoly[1]=190+1;
	ypoly[2]=190+1;
	ypoly[3]=212-1;
	g1.setColor(Color.black);
        g1.drawPolygon(xpoly,ypoly,4);
    
	g1.setColor(Color.white);

	if(element==n-1)
	{
        int x1[]={lastpolyx,lastpolyy,lastpolyy,lastpolyx};
        int y1[]={211,191,235,257};
	g1.setColor(Color.white);
        g1.fillPolygon(x1,y1,4);
	g1.setColor(Color.black);
	g1.drawPolygon(x1,y1,4);
	}
	
	g1.setColor(Color.white);
        g1.fillRect(element*45+60+1,212+1,44,44);
        g1.setColor(Color.black);
        g1.drawRect(element*45+60+1,212+1,44,44);
        g1.setFont(new Font("SansSarif",Font.BOLD,12));
        FontMetrics fm=g1.getFontMetrics();
        g1.drawString(Integer.toString(a[element]),element*45+60+1+22,240);
        g1.drawImage(imred,element*45+60+15,260,this); 
        for(int p=0;p<20000;p++)
        for(int q=0;q<10000;q++)
        {;}
        g1.setColor(col);
	g1.fillRect(element*45+60+15,260,16,40);
        for(int p=0;p<20000;p++)
        for(int q=0;q<10000;q++)
         {;}
        g1.drawImage(imred,element*45+60+15,260,this);
	}
      else
         result.setText( "Value not found" );
   
                for(int p=0;p<20000;p++)
      		for(int q=0;q<20000;q++)
      		{;}
         g1.setColor(col);
    	 g1.fillRect(mid*45+15+60,260,16,40);
   }
 }

    
   else if(e.getSource()==arraysize)

   { String size = e.getActionCommand();
      int previ=0,previi=0,prevn=0;          
      prevn=n;
      try{
       n=Integer.parseInt(size);
       }
      catch(Exception ex)
        { n=prevn;
          previi=1;
          JOptionPane.showMessageDialog(null,"You must enter an integer value !!");
        }
      if(n<=15 && previi==0 )
       {
        a = new int[ n ];
     
        n=a.length;
        for ( int i = 0; i < a.length;)
        {previ=0;
        String s="Enter a["+i+"] such that -999<=a[i]<=999",s1;
		s1=JOptionPane.showInputDialog(s);
         try{
            a[ i ] =Integer.parseInt(s1);
            }
          catch(Exception ex) {previ=1;
            JOptionPane.showMessageDialog(null,"You must enter an integer value !!");
            }
          if(previ==0 && a[i]>=-999 && a[i]<=999) {i++;}
       }
       
       
       //Sorting
       for (int i = a.length; --i>=0; )
       {
        for (int j = 0; j<i; j++) {
         if (a[j] > a[j+1]) {
                               int T = a[j];
		               a[j] = a[j+1];
		               a[j+1] = T;}
                 
                            }
       }



       g1.setColor(col);  
       g1.fillRect(60,190,83+44*14,214);
       repaint(60,190,83+44*14,214); 
      }

     if(n>15 && previi==0)
     {
        n=prevn;
       JOptionPane.showMessageDialog(null,"You must enter a number<=15 !!");
     }
     
   }

}



   //Binary search

 public int binarySearch( int array[], int key ) 
   {
      int low = 0;                  // low subscript
      int high = array.length - 1;  // high subscript
      int middle=0,position=0;                   // middle subscript
	Graphics g1=getGraphics();
        while ( low <= high ) {
        prev=middle;
        middle = ( low + high ) / 2;
        mid=middle;

	repaint(60,190,83+44*14,214);    
        xpoly[0]=middle*45+60;
	xpoly[1]=middle*45+60+23;
	xpoly[2]=middle*45+60+23+45;
	xpoly[3]=middle*45+60+45;
	ypoly[0]=212-1; 
	ypoly[1]=190+1;
	ypoly[2]=190+1;
	ypoly[3]=212-1;
        //int xpoly[]={k+2,k+23+2,k+23+45,k+45};
	//int ypoly[]={212-1,190+1,190+1,212-1}; 
	g1.setColor(col2);
        g1.fillPolygon(xpoly,ypoly,4);
        xpoly[0]=middle*45+60;
	xpoly[1]=middle*45+60+23;
	xpoly[2]=middle*45+60+23+45;
	xpoly[3]=middle*45+60+45;
	ypoly[0]=212-1; 
	ypoly[1]=190+1;
	ypoly[2]=190+1;
	ypoly[3]=212-1;
	g1.setColor(col1);
        g1.drawPolygon(xpoly,ypoly,4);
    

	if(middle==n-1)
	{
        int x1[]={lastpolyx,lastpolyy,lastpolyy,lastpolyx};
        int y1[]={211,191,235,257};
	g1.setColor(col2);
        g1.fillPolygon(x1,y1,4);
	g1.setColor(Color.white);
	g1.drawPolygon(x1,y1,4);
	}

	 g1.setColor(col2);
         g1.fillRect(middle*45+60+1,212+1,44,44);
         g1.setColor(col1);
         g1.drawRect(middle*45+60,212,45,45);
         g1.setColor(col);
         g1.fillRect(60+15+prev*45,260,16,40);
         g1.drawImage(im,60+15+middle*45,260,this);
	  g1.setColor(col1);
         g1.setFont(new Font("SansSarif",Font.BOLD,12));
         FontMetrics fm=g1.getFontMetrics();
         g1.drawString(Integer.toString(a[middle]),middle*45+60+1+22,240);
	 for(int p=0;p<20000;p++)
	 for(int q=0;q<20000;q++)
 	  {;}	
         // The following line is used to display the part
         // of the array currently being manipulated during
         // each iteration of the binary search loop.
         //buildOutput( low, middle, high ); 

         if ( key == array[ middle ] )  // match
             {return middle;}
	 else if ( key < array[ middle ] )
            high = middle - 1;  // search low end of array
         else
            low = middle + 1;   // search high end of array
      }

      return -1;   // searchKey not found
   }









 public void mouseClicked(MouseEvent me){ }

  public void mouseEntered(MouseEvent me)
  {
   mx=0;my=24;
   msg="mouse just entered applet window";
  // repaint();
  }

  public void mouseExited(MouseEvent me)
  {
     mx=0;my=24;
     msg="mouse just left applet window";
  // repaint();
  }

  public void mouseReleased(MouseEvent me)
  {
   mx=me.getX();my=me.getY();
   msg="up";
 //  repaint();
  }

  public void mouseDragged(MouseEvent me)
  {
   mx=me.getX();my=me.getY();
   mvx=me.getX();mvy=me.getY();
   msg="*";
//   repaint();
  }

  public void mouseMoved(MouseEvent me)
  {
   mx=me.getX();my=me.getY();

    mx=me.getX();my=me.getY();
   if(mx>=98 && mx<=167 && my>=443 && my<=478)
   {
     setCursor(newcursor);
    }
   else if(mx>=622 && mx<=694 && my>=440 && my<=478)
   {
     setCursor(newcursor);
    }

 else if(mx>=375 && mx<=438 && my>=117 && my<=144)
   {
     setCursor(newcursor);
    }

   else
     setCursor(cursor);


   //repaint();
  }

  public void mousePressed(MouseEvent me)
  {Graphics g=getGraphics();
    mx=me.getX();my=me.getY();
  if(mx>375 && mx<=438 && my>=117 && my<=144)
  {
   bin2=app.newAudioClip(urlbin2);    
   bin2.play();
  }


  if(mx>=98 && mx<=167 && my>=443 && my<=478)
 {try{
  bin2.stop(); }catch(NullPointerException e) { ;}

  dispose();
  ChooseFrame f = new ChooseFrame("SEARCHING ALGORITHMS");
  f.show();
}
if(mx>=622 && mx<=694 && my>=440 && my<=478)
     {
	nextl++;
        if(nextl>=4) nextl=0;
      switch(nextl) 
     {
           
     case 0:
     g.setColor(col2);
     g.fillRoundRect(53,322,690,100,15,15);
     g.setColor(Color.black);
     g.drawRoundRect(53,322,690,100,15,15);
     g.setColor(Color.white);
     g.setFont(new Font("SansSarif",Font.BOLD,12));
     g.drawString("Binary Search:-",88,339);
     g.drawString("Enter the search key in the text box and press enter",88,370);
     g.drawString("Watch the algorithm go, to find the key !!!",88,395);
     g.drawString("Press next to know about Binary Search",510,410);
     break;
     
     case 1:
     g.setColor(col2);
     g.fillRoundRect(53,322,690,100,15,15);
     g.setColor(Color.black);
     g.drawRoundRect(53,322,690,100,15,15);
     g.setColor(Color.white);
     g.setFont(new Font("SansSarif",Font.BOLD,12));
     g.drawString("Binary Search:-",88,339);
     g.drawString("The Binary Search algorithm eleminates one half of the elements in a sorted array after each comparison.",88,355);
     g.drawString("The algorithm locates the middle element of the array and compares it to the search key.",88,375);
     g.drawString("If they are equal, the search is found. If they are not equal, the problem is reduced to one half of the array.",88,395);
     g.drawString("Press next to know about Binary Search",510,410);
     break;
      
     case 2:
     g.setColor(col2);
     g.fillRoundRect(53,322,690,100,15,15);
     g.setColor(Color.black);
     g.drawRoundRect(53,322,690,100,15,15);
     g.setColor(Color.white);
     g.setFont(new Font("SansSarif",Font.BOLD,12));
     g.drawString("Binary Search:-",88,339);
     g.drawString("If the key is less than the middle element of the array, the first half of the array is searched. Otherwise the second",88,355);
     g.drawString("half of the array is searched. If the search key is not found in the specified array, the algorithm is repeated on one",88,375);
     g.drawString("quarter of the original array. The search continues until the search key is equal to the mid element of a subarray,",88,395);
     g.drawString("Press next to know about Binary Search",510,410);
     break;
    
     case 3:
     g.setColor(col2);
     g.fillRoundRect(53,322,690,100,15,15);
     g.setColor(Color.black);
     g.drawRoundRect(53,322,690,100,15,15);
     g.setColor(Color.white);
     g.setFont(new Font("SansSarif",Font.BOLD,12));
     g.drawString("Binary Search:-",88,339);
     g.drawString("or until the subarray consists of one element that is not equal to the search key.",88,355);
     g.drawString("Best case  : Array sorted",88,375);
     g.drawString("Worst case : n comparisons for the array size equl to 2^n",88,395);
    g.drawString("Press next to know about Binary Search",510,410);
     break;
default:;
}
}
     msg="mouse="+mx+","+my;
     //repaint();
  }

public void run()
    {             
	for(;th != null;)
	{

           display();
	     try
	   {
             th.sleep(1000);
	   }
	   catch(InterruptedException e)
           {
           }
			
	   }                
    }


public void display()
    {
        Font font = new Font("Monotype Corsiva", Font.BOLD,50);
        l1.setFont(font);
        l1.setText(Name[counter]);
        counter++;
        if(counter>=2)
        {
            counter=0;
        }
    }
   
   
}//End of BinarySearch class












 /////////////////////////////////////////////////////////////////////////////////////////////
 /////////////////////////////////////////////////////////////////////////////////////////////
 class BinSearchTree extends CloseableFrame
 implements ActionListener,Runnable,MouseListener,MouseMotionListener {
   Label Status,Action,l1;
   TextField status,action;
   int a[];
   int x[],y[];
   int counter=0,counter2=0;
   int prevx=1,prevy=1;
   int t=0,i=0,j=0,n,nextl=0;  
   String names[]={" ","Julia","Elton","Micheal","Cleopatra","Harry","Lopez","Nicolo","Beniditt"," "," ","Ian","Kate"," "," "};
   Image im0,im1,im2,im3,im4,im5,im6,im7,im8,im9,c1,c2,c3,c4,s,alpha,im15,key;
   URL url1,url2,url3,url4,url5,url6,url7,url8,url9,url0,urlc,urlcb,urlcl,urlclb,urls,url20,urlkey;;
   URL urltree1,urltree2,urltree3,urltree4,urltree5,urltree6,urltree7,urltree8,urltree9,urltree10,urltree11;
   int k=0,prev=0,l=0;
   int start=0;
   int choice=0;
   Thread th;
   String[] Name={"Searching","Algorithms"};
   String msg=" ";
   int mx,my,mvx,mvy,element;
   Color col=new Color(64,128,128);
   Color col1=new Color(192,192,192);
   Color col2=new Color(48,97,97);
   Color col3=new Color(0,128,192); 
   AudioClip tree1,tree2,tree3,tree4,tree5,tree6,tree7,tree8,tree9,tree10,tree11; 
   Cursor cursor, newcursor;
   Applet app;
   Toolkit tk=Toolkit.getDefaultToolkit();
   Dimension 	bestSize = tk.getBestCursorSize(32,32);
   int 		maxColors = tk.getMaximumCursorColors();	

 

 public BinSearchTree(String title)
   {  super(title);
      

	newcursor=Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
      if(maxColors == 0) 
			System.out.println("custom cursors not supported");
		else {
			key = tk.getImage("smileCursor.gif");
			cursor 		= tk.createCustomCursor(key, 
											new Point(1,1), 
											"smile cursor");
			setCursor(cursor);
		}

      addMouseListener(this);
      addMouseMotionListener(this);
      
      setBackground(col);
      
      Font font = new Font("Arial", Font.BOLD,10);
      setLayout( new FlowLayout() );
      
      Status=new Label("Status");
      Status.setFont(font);
      add(Status);
      Status.setForeground(Color.white);
           
      status = new TextField( 30 );
      status.setEditable( false );
      add( status );
      status.setForeground(Color.white);

      Action = new Label( "Why ?" );
      Action.setFont(font);
      add( Action);
      Action.setForeground(Color.white);
      
      action = new TextField( 25 );
      action.setEditable( false );
      add( action );
      action.setForeground(Color.white);
a = new int[ 16 ];
a[0]=0;
a[1]=10;
a[2]=5;
a[3]=13;
a[4]=3;
a[5]=8;
a[6]=12;
a[7]=14;
a[8]=2;
a[9]=0;
a[10]=0;
a[11]=9;
a[12]=11;
a[13]=0;
a[14]=0;
a[15]=0;

/*{322,17,172,117,472,117,122,217,222,217,422,217,522,217,72,317,272,317,372,317}*/
x = new int[ 16 ];
y = new int[ 16 ];
x[0]=0;y[0]=0;
x[1]=322;y[1]=17;
x[2]=172;y[2]=117;
x[3]=472;y[3]=117;
x[4]=122;y[4]=217;
x[5]=222;y[5]=217;
x[6]=422;y[6]=217;
x[7]=522;y[7]=217;
x[8]=72;y[8]=317;
x[9]=0;y[9]=0;
x[10]=0;y[10]=0;
x[11]=272;y[11]=317;
x[12]=372;y[12]=317;
x[13]=0;y[13]=0;
x[14]=0;y[14]=0;
x[15]=0;y[15]=0;

      loadImage();
      filterImage();
      app= new Applet();
   try{
       tree1=app.newAudioClip(urltree1);
       tree1.play();
      }
    catch(NullPointerException e){ }
     
  }



public void binSearchTree(int array[],int key,int barray[])
{
 Graphics g=getGraphics();
 int i=1;
 
 while(i<16)
 {

  for(int p=0;p<20000;p++) 
  for(int q=0;q<20000;q++)
  {;}
  g.setColor(col);
  g.fillRect(x[prevx],y[prevy],15,40); 
  g.drawImage(c1,x[i],y[i],this); 
  if(key==a[i]) 
  { 
  status.setText( "Key found at "+i ); 
  g.setColor(Color.yellow);
  g.drawString(names[i]+"   Found!!!",300,462);
  for(int p=0;p<20000;p++) 
  for(int q=0;q<20000;q++)
  {;}
  g.setColor(col);
  g.fillRect(x[prevx],y[prevy],15,40); 
  g.fillRect(x[i],y[i],15,40);
  for(int p=0;p<20000;p++) 
  for(int q=0;q<20000;q++)
  {;}
  g.drawImage(c1,x[i],y[i],this);
  for(int p=0;p<30000;p++) 
  for(int q=0;q<20000;q++)
  {;}
  g.setColor(col);
  g.fillRect(x[prevx],y[prevy],15,40); 
  g.fillRect(x[i],y[i],15,40);
  /********/
  g.setColor(col);
  g.drawString(names[i]+"   Found!!!",300,462);
   /********/
  /*g.fillRect(x[prevx],y[prevy],15,40); 
  g.drawImage(c2,x[prevx],y[prevy],this); 
  g.drawImage(c2,322,17,this);
  g.drawImage(c2,x[i],y[i],this);*/
  break;
  }
  else if(key<a[i]) { prevx=i;prevy=i; i=2*i; }
  else if(key>a[i]) { prevx=i;prevy=i; i=2*i+1;}
  if(i>=16)  
  {
  status.setText( "Key not found" ); break;}
  } 
  for(int p=0;p<30000;p++) 
  for(int q=0;q<20000;q++)
  {;}
 
 }  

public void update(Graphics g)

   {
 
       paint(g);
       
   }




public void paint(Graphics g)
   { 
       int f=50,f1=100;
 app=new Applet();


//g.drawString(msg,mx,my);


if(start==0)
{
 
 
 g.drawImage(c3,200,195,this);  
 g.setColor(Color.pink);
 g.drawLine(200,195,665,195);
 g.drawLine(200,195,200,263);
 g.setColor(Color.red);
 g.drawLine(200,263,665,263);
 g.drawLine(665,263,665,195);
 

}

if(start==1)
{
 
g.drawImage(im15,100,447,this); 
  
tree1.stop();
g.setColor(col);
g.fillRect(200,195,470,70);


//item1
g.setColor(Color.white);
g.drawImage(im0,307,67,this);g.drawString("Julia",267,81); 
status.setText( "Julia is placed at the root" );
action.setText( "First item is inserted" );
      //tree2=getAudioClip(getDocumentBase(),"tree2.wav");
	tree2=app.newAudioClip(urltree2);
      tree2.play();

for(int p=0;p<110000;p++)
for(int q=0;q<20000;q++)
{;}

//item2
g.drawLine(330,112,180,67+f1);
g.drawImage(im1,307-150,67+f1,this);g.drawString("Elton",105,181);
status.setText( "Elton is inserted to left of Julia" );
action.setText( "This is because E occurs before J" );
     //tree3=getAudioClip(getDocumentBase(),"tree3.wav");
      tree3=app.newAudioClip(urltree3);    
      tree3.play();
for(int p=0;p<110000;p++)
for(int q=0;q<20000;q++)
{;}


//item3
g.drawLine(330,112,480,67+f1);
g.drawImage(im2,307+150,67+f1,this);g.drawString("Michael",517,181);
status.setText( "Michael is inserted to right of Julia" );
action.setText( "This is because M occurs after J" );
      //tree4=getAudioClip(getDocumentBase(),"tree4.wav");
	tree4=app.newAudioClip(urltree4);
      tree4.play();
for(int p=0;p<110000;p++)
for(int q=0;q<20000;q++)
{;}

//item4
g.drawLine(180,67+f1+45,130,67+2*f1);
g.drawImage(im3,307-150-f,67+2*f1,this);g.drawString("Cleopatra",38,295);
status.setText( "Cleopatra is inserted to the left of Elton" );
action.setText( "This is because C occurs before E" );
      //tree5=getAudioClip(getDocumentBase(),"tree5.wav");
      tree5=app.newAudioClip(urltree5);
      tree5.play();
for(int p=0;p<110000;p++)
for(int q=0;q<20000;q++)
{;}

//item5
g.drawLine(180,67+f1+45,230,67+2*f1);
g.drawImage(im4,307-150+f,67+2*f1,this);g.drawString("Harry",263,295);
status.setText( "Harry is inserted to the right of Elton" );
action.setText( "This is because H occurs after E" );
      //tree6=getAudioClip(getCodeBase(),"tree6.wav");
	tree6=app.newAudioClip(urltree6);
      tree6.play();
for(int p=0;p<110000;p++)
for(int q=0;q<20000;q++)
{;}

//item6
g.drawLine(130,67+2*f1+45,80,67+3*f1);
g.drawImage(im5,307-150-2*f,67+3*f1,this);g.drawString("Beniditt",14,393);
status.setText( "Beniditt is inserted to the left of Cleopatra" );
action.setText( "This is because B occurs before C" );
      //tree7=getAudioClip(getDocumentBase(),"tree7.wav");
	tree7=app.newAudioClip(urltree7);
      tree7.play();
for(int p=0;p<110000;p++)
for(int q=0;q<20000;q++)
{;}

//item7
g.drawLine(230,67+2*f1+45,280,67+3*f1);
g.drawImage(im6,307-150+2*f,67+3*f1,this);g.drawString("Ian",197,393);
status.setText( "Ian is inserted to the right of Harry" );
action.setText( "This is because I occurs after H" );
      //tree8=getAudioClip(getDocumentBase(),"tree8.wav");
	tree8=app.newAudioClip(urltree8);
      tree8.play();
for(int p=0;p<110000;p++)
for(int q=0;q<20000;q++)
{;}

//item8
g.drawLine(480,67+f1+45,307+150-f+23,67+2*f1);
g.drawImage(im7,307+150-f,67+2*f1,this);g.drawString("Lopez",353,295);
status.setText( "Lopez is inserted to the left of Michael" );
action.setText( "This is because L occurs before M" );
      //tree9=getAudioClip(getDocumentBase(),"tree9.wav");
	tree9=app.newAudioClip(urltree9);
      tree9.play();
for(int p=0;p<110000;p++)
for(int q=0;q<20000;q++)
{;}

//item9
g.drawLine(480,67+f1+45,307+150+f+23,67+2*f1);  
g.drawImage(im8,307+150+f,67+2*f1,this);g.drawString("Nicolo",561,295);
status.setText( "Nicolo is inserted to the right of Michael" );
action.setText( "This is because N occurs after M" );
      //tree10=getAudioClip(getDocumentBase(),"tree10.wav");
	tree10=app.newAudioClip(urltree10);
      tree10.play();
for(int p=0;p<110000;p++)
for(int q=0;q<20000;q++)
{;} 


//item10
g.drawLine(307+150-f+23,67+2*f1+45,380,67+3*f1);
g.drawImage(im9,307+150-2*f,67+3*f1,this);g.drawString("Kate",421,393); 
status.setText( "Kate is inserted to the left of Lopez" );
action.setText( "This is because K occurs before L" );
      //tree11=getAudioClip(getDocumentBase(),"tree11.wav");
	tree11=app.newAudioClip(urltree11);
      tree11.play();
for(int p=0;p<110000;p++)
for(int q=0;q<20000;q++)
{;}
status.setText( "" );
action.setText( "" );




g.setColor(Color.cyan);
g.drawString("J",267,81); 
g.drawString("E",105,181);
g.drawString("M",517,181);
g.drawString("C",38,295);
g.drawString("H",263,295);
g.drawString("L",353,295);
g.drawString("N",561,295);
g.drawString("B",14,393);
g.drawString("I",197,393);
g.drawString("K",421,393); 
 


	g.drawImage(im0,680,10,this);
g.setColor(Color.white);
g.drawLine(680,10,725,10);
g.drawLine(680,10,680,55);
g.setColor(Color.black);
g.drawLine(680,55,725,55);
g.drawLine(725,55,725,10);

	g.drawImage(im1,680,58,this);
g.setColor(Color.white);
g.drawLine(680,58,680,103);
g.drawLine(680,58,725,58);
g.setColor(Color.black);
g.drawLine(680,103,725,103);
g.drawLine(725,103,725,58);

	g.drawImage(im2,680,106,this);
g.setColor(Color.white);
g.drawLine(680,106,680,151);
g.drawLine(680,106,725,106);
g.setColor(Color.black);
g.drawLine(680,151,725,151);
g.drawLine(725,151,725,106);

	g.drawImage(im3,680,154,this);
g.setColor(Color.white);
g.drawLine(680,154,680,199);
g.drawLine(680,154,725,154);
g.setColor(Color.black);
g.drawLine(680,199,725,199);
g.drawLine(725,199,725,154);

	g.drawImage(im4,680,202,this);
g.setColor(Color.white);
g.drawLine(680,202,680,247);
g.drawLine(680,202,725,202);
g.setColor(Color.black);
g.drawLine(680,247,725,247);
g.drawLine(725,247,725,202);

	g.drawImage(im5,680,250,this);
g.setColor(Color.white);
g.drawLine(680,250,680,295);
g.drawLine(680,250,725,250);
g.setColor(Color.black);
g.drawLine(680,295,725,295);
g.drawLine(725,295,725,250);

	g.drawImage(im6,680,298,this);
g.setColor(Color.white);
g.drawLine(680,298,680,343);
g.drawLine(680,298,725,298);
g.setColor(Color.black);
g.drawLine(683,343,725,343);
g.drawLine(725,343,725,298);

	g.drawImage(im7,680,346,this);
g.setColor(Color.white);
g.drawLine(680,346,680,391);
g.drawLine(680,346,725,346);
g.setColor(Color.black);
g.drawLine(680,391,725,391);
g.drawLine(725,391,725,346);

	g.drawImage(im8,680,394,this);
g.setColor(Color.white);
g.drawLine(680,394,680,439);
g.drawLine(680,394,725,394);
g.setColor(Color.black);
g.drawLine(680,439,725,439);
g.drawLine(725,439,725,394);

	g.drawImage(im9,680,442,this);
g.setColor(Color.white);
g.drawLine(680,442,680,487);
g.drawLine(680,442,725,442);
g.setColor(Color.black);
g.drawLine(680,487,725,487);
g.drawLine(725,487,725,442);

/*end of image appearence*/
/************************/

	

        g.setColor(Color.white);
        g.drawString("10",730,10+23);
	g.drawString("05",730,58+23);
	g.drawString("13",730,106+23);
	g.drawString("03",730,154+23);
	g.drawString("08",730,202+23);
	g.drawString("02",730,250+23);
	g.drawString("09",730,298+23);
	g.drawString("12",730,346+23);
	g.drawString("14",730,394+23);
	g.drawString("11",730,442+23);
/*
for(int i=0;i<20;i=i+2)
{
g.drawImage(c1,x[i],x[i+1],this);
}*/

}/*end of if start=0*/


       g.drawImage(alpha,0,50,this); 
       g.drawImage(alpha,770,50,this);
}






public void run()
    {             
	for(;th != null;)
	{

           display();
	     try
	   {
             th.sleep(1000);
	   }
	   catch(InterruptedException e)
           {
           }
			
	   }                
    }



public void display()
    {
        Font font = new Font("Monotype Corsiva", Font.BOLD,50);
        l1.setFont(font);
        l1.setText(Name[counter]);
        counter++;
        if(counter>=2)
        {
            counter=0;
        }
    }


private void loadImage() {
		try {   
			//urlkey = getClass().getResource("key.jpg");
			//key= createImage((ImageProducer)urlkey.getContent());
			urls = getClass().getResource("tree.jpg");
			s= createImage((ImageProducer)urls.getContent()); 
 			urlc = getClass().getResource("crown.jpg");
			c1= createImage((ImageProducer)urlc.getContent()); 
		        urlcb = getClass().getResource("crownb.jpg");
			c2 = createImage((ImageProducer)urlcb.getContent());
			urlcl = getClass().getResource("clickhere.jpg");
			c3 = createImage((ImageProducer)urlcl.getContent());
       			urlclb = getClass().getResource("clickblank.jpg");
			c4 = createImage((ImageProducer)urlclb.getContent());

			url0 = getClass().getResource("bin0.jpg");
			im0 = createImage((ImageProducer)url0.getContent()); 
		        url1 = getClass().getResource("bin1.jpg");
			im1 = createImage((ImageProducer)url1.getContent());
			url2 = getClass().getResource("bin2.jpg");
			im2 = createImage((ImageProducer)url2.getContent());
			url3 = getClass().getResource("bin3.jpg");
			im3 = createImage((ImageProducer)url3.getContent());
			url4 = getClass().getResource("bin4.jpg");
			im4 = createImage((ImageProducer)url4.getContent());
			url5 = getClass().getResource("bin5.jpg");
			im5 = createImage((ImageProducer)url5.getContent());
			url6 = getClass().getResource("bin6.jpg");
			im6 = createImage((ImageProducer)url6.getContent());
			url7 = getClass().getResource("bin7.jpg");
			im7 = createImage((ImageProducer)url7.getContent()); 
		        url8 = getClass().getResource("bin8.jpg");
			im8= createImage((ImageProducer)url8.getContent());
			url9 = getClass().getResource("bin9.jpg");
			im9 = createImage((ImageProducer)url9.getContent());
			url20 = getClass().getResource("back.jpg");
			im15 = createImage((ImageProducer)url20.getContent());


                  urltree1 = getClass().getResource("tree1.wav");
			urltree2 = getClass().getResource("tree2.wav");
			urltree3 = getClass().getResource("tree3.wav");
			urltree4 = getClass().getResource("tree4.wav");
			urltree5 = getClass().getResource("tree5.wav");
			urltree6 = getClass().getResource("tree6.wav");
			urltree7 = getClass().getResource("tree7.wav");
			urltree8 = getClass().getResource("tree8.wav");
			urltree9 = getClass().getResource("tree9.wav");
			urltree10 = getClass().getResource("tree10.wav");
			urltree11 = getClass().getResource("tree11.wav");


			
			}
		catch(Exception e) {
			e.printStackTrace();
		}
			MediaTracker mt0 = new MediaTracker(this);mt0.addImage(im0, 0);
			MediaTracker mt1 = new MediaTracker(this);mt1.addImage(im1, 0);
                  MediaTracker mt2 = new MediaTracker(this);mt2.addImage(im2, 0);
                  MediaTracker mt3 = new MediaTracker(this);mt3.addImage(im3, 0);
			MediaTracker mt4 = new MediaTracker(this);mt4.addImage(im4, 0);
			MediaTracker mt5 = new MediaTracker(this);mt5.addImage(im5, 0);
			MediaTracker mt6 = new MediaTracker(this);mt6.addImage(im6, 0);
			MediaTracker mt7 = new MediaTracker(this);mt7.addImage(im7, 0);
			MediaTracker mt8 = new MediaTracker(this);mt8.addImage(im8, 0);
                                                         
                  MediaTracker mt9 = new MediaTracker(this); mt9.addImage(im9, 0);
                  MediaTracker mt10 = new MediaTracker(this);mt10.addImage(c1, 0);
			MediaTracker mt11 = new MediaTracker(this);mt11.addImage(c2, 0);
			MediaTracker mt12 = new MediaTracker(this);mt12.addImage(c3, 0);
			MediaTracker mt13 = new MediaTracker(this);mt13.addImage(c4, 0);
			MediaTracker mt14 = new MediaTracker(this);mt14.addImage(s, 0);
			MediaTracker mt15 = new MediaTracker(this);mt15.addImage(im15, 0);


                        try{
			 mt0.waitForID(0);
			 mt1.waitForID(0);
                   mt2.waitForID(0);
                   mt3.waitForID(0);
			 mt4.waitForID(0);
			 mt5.waitForID(0);
			 mt6.waitForID(0);
			 mt7.waitForID(0);
			 mt8.waitForID(0);
                   mt9.waitForID(0);
			 mt10.waitForID(0);
			 mt11.waitForID(0);
			 mt12.waitForID(0);
			 mt13.waitForID(0);
			 mt14.waitForID(0);
			 mt15.waitForID(0);
                         }                                
		
		
			catch(Exception e) {
			e.printStackTrace();
		}
	}
private void filterImage()
        {
		alpha = createImage(new FilteredImageSource(
		s.getSource(), new DissolveFilter(50)));
	}



public void actionPerformed( ActionEvent e )
   {

	/*if(e.getSource() == backBut)
		{
			dispose();
			ChooseFrame f = new ChooseFrame("SEARCHING ALGORITHMS");
			f.show();
		}


*/
;
   }

public void mouseClicked(MouseEvent me){ }

  public void mouseEntered(MouseEvent me)
  {
   mx=0;my=24;
   msg="mouse just entered applet window";
  // repaint();
  }

  public void mouseExited(MouseEvent me)
  {
     mx=0;my=24;
     msg="mouse just left applet window";
  // repaint();
  }

  public void mouseReleased(MouseEvent me)
  {
   mx=me.getX();my=me.getY();
   msg="up";
 //  repaint();
  }

  public void mouseDragged(MouseEvent me)
  {
   mx=me.getX();my=me.getY();
   mvx=me.getX();mvy=me.getY();
   msg="*";
//   repaint();
  }

  public void mouseMoved(MouseEvent me)
  {
   mx=me.getX();my=me.getY();
   mx=me.getX();my=me.getY();
   if(mx>=660 && mx<=725 && my>=10 && my<=487 && start==1)
   {

       setCursor(newcursor);
   }
   else if(mx>=98 && mx<=167 && my>=443 && my<=478 && start==1)
   {

       setCursor(newcursor);
   }
   else if(mx>=200 && mx<=665 && my>=195 && my<=263 && start==0)
 {
       setCursor(newcursor);
 }

   else
  {
      setCursor(cursor);
  }//repaint();
  }

  public void mousePressed(MouseEvent me)
  {
    Graphics g=getGraphics(); 
    int key=0;;
 msg=mx+","+my;
 mx=me.getX();my=me.getY();
if(mx>=660 && mx<=725 && my>=10 && my<=55 && start==1)choice=1;
if(mx>=660 && mx<=725 && my>=58 && my<=103 && start==1)choice=2;
if(mx>=660 && mx<=725 && my>=106 && my<=151 && start==1)choice=3;
if(mx>=660 && mx<=725 && my>=154 && my<=199 && start==1)choice=4;
if(mx>=660 && mx<=725 && my>=207 && my<=247 && start==1)choice=5;
if(mx>=660 && mx<=725 && my>=250 && my<=295 && start==1)choice=6;
if(mx>=660 && mx<=725 && my>=298 && my<=343 && start==1)choice=7;
if(mx>=660 && mx<=725 && my>=346 && my<=391 && start==1)choice=8;
if(mx>=660 && mx<=725 && my>=394 && my<=439 && start==1)choice=9;
if(mx>=660 && mx<=725 && my>=442 && my<=487 && start==1)choice=10;
if(mx>=200 && mx<=665 && my>=195 && my<=263)choice=11;
if(mx>=98 && mx<=167 && my>=443 && my<=478)
 {
  dispose();
  ChooseFrame f = new ChooseFrame("SEARCHING ALGORITHMS");
  f.show();
 }

switch(choice)
{
 case 1: key=10;
g.setColor(Color.black);
g.drawLine(680,10,725,10);
g.drawLine(680,10,680,55);
g.setColor(Color.white);
g.drawLine(680,55,725,55);
g.drawLine(725,55,725,10);
binSearchTree(a,key,x);
g.setColor(Color.white);
g.drawLine(680,10,725,10);
g.drawLine(680,10,680,55);
g.setColor(Color.black);
g.drawLine(680,55,725,55);
g.drawLine(725,55,725,10);
break;


case 2: key=5;
g.setColor(Color.black);
g.drawLine(680,58,680,103);
g.drawLine(680,58,725,58);
g.setColor(Color.white);
g.drawLine(680,103,725,103);
g.drawLine(725,103,725,58);
binSearchTree(a,key,x);
g.setColor(Color.white);
g.drawLine(680,58,680,103);
g.drawLine(680,58,725,58);
g.setColor(Color.black);
g.drawLine(680,103,725,103);
g.drawLine(725,103,725,58);
break;


case 3: key=13;
g.setColor(Color.black);
g.drawLine(680,106,680,151);
g.drawLine(680,106,725,106);
g.setColor(Color.white);
g.drawLine(680,151,725,151);
g.drawLine(725,151,725,106);
binSearchTree(a,key,x);
g.setColor(Color.white);
g.drawLine(680,106,680,151);
g.drawLine(680,106,725,106);
g.setColor(Color.black);
g.drawLine(680,151,725,151);
g.drawLine(725,151,725,106);
break;


case 4: key=3;
g.setColor(Color.black);
g.drawLine(680,154,680,199);
g.drawLine(680,154,725,154);
g.setColor(Color.white);
g.drawLine(680,199,725,199);
g.drawLine(725,199,725,154);
binSearchTree(a,key,x);
g.setColor(Color.white);
g.drawLine(680,154,680,199);
g.drawLine(680,154,725,154);
g.setColor(Color.black);
g.drawLine(680,199,725,199);
g.drawLine(725,199,725,154);
break;



case 5: key=8;
g.setColor(Color.black);
g.drawLine(680,202,680,247);
g.drawLine(680,202,725,202);
g.setColor(Color.white);
g.drawLine(680,247,725,247);
g.drawLine(725,247,725,202);
binSearchTree(a,key,x);
g.setColor(Color.white);
g.drawLine(680,202,680,247);
g.drawLine(680,202,725,202);
g.setColor(Color.black);
g.drawLine(680,247,725,247);
g.drawLine(725,247,725,202);
break;


case 6: key=2;
g.setColor(Color.black);
g.drawLine(680,250,680,295);
g.drawLine(680,250,725,250);
g.setColor(Color.white);
g.drawLine(680,295,725,295);
g.drawLine(725,295,725,250);
binSearchTree(a,key,x);
g.setColor(Color.white);
g.drawLine(680,250,680,295);
g.drawLine(680,250,725,250);
g.setColor(Color.black);
g.drawLine(680,295,725,295);
g.drawLine(725,295,725,250);
break;


case 7: key=9;
g.setColor(Color.black);
g.drawLine(680,298,680,343);
g.drawLine(680,298,725,298);
g.setColor(Color.white);
g.drawLine(683,343,725,343);
g.drawLine(725,343,725,298);
binSearchTree(a,key,x);
g.setColor(Color.white);
g.drawLine(680,298,680,343);
g.drawLine(680,298,725,298);
g.setColor(Color.black);
g.drawLine(683,343,725,343);
g.drawLine(725,343,725,298);
break;
	

case 8: key=12;
g.setColor(Color.black);
g.drawLine(680,346,680,391);
g.drawLine(680,346,725,346);
g.setColor(Color.white);
g.drawLine(680,391,725,391);
g.drawLine(725,391,725,346);
binSearchTree(a,key,x);
g.setColor(Color.white);
g.drawLine(680,346,680,391);
g.drawLine(680,346,725,346);
g.setColor(Color.black);
g.drawLine(680,391,725,391);
g.drawLine(725,391,725,346);
break;
	

case 9: key=14;
g.setColor(Color.black);
g.drawLine(680,394,680,439);
g.drawLine(680,394,725,394);
g.setColor(Color.white);
g.drawLine(680,439,725,439);
g.drawLine(725,439,725,394);
binSearchTree(a,key,x);
g.setColor(Color.white);
g.drawLine(680,394,680,439);
g.drawLine(680,394,725,394);
g.setColor(Color.black);
g.drawLine(680,439,725,439);
g.drawLine(725,439,725,394);
break;
	

case 10: key=11;
g.setColor(Color.black);
g.drawLine(680,442,680,487);
g.drawLine(680,442,725,442);
g.setColor(Color.white);
g.drawLine(680,487,725,487);
g.drawLine(725,487,725,442);
binSearchTree(a,key,x);
g.setColor(Color.white);
g.drawLine(680,442,680,487);
g.drawLine(680,442,725,442);
g.setColor(Color.black);
g.drawLine(680,487,725,487);
g.drawLine(725,487,725,442);
break;
	

case 11:
start=1;
repaint();
break;

 default:;
}


//repaint();
}


}


////////////////////////////////////////////////////////
/******************************************************/
////////////////////////////////////////////////////////

public class LinearSearch
{ 
	public static void main(String args[])
	{
		Frame f = new ChooseFrame("Linear Search");
		f.show();
	}
}
