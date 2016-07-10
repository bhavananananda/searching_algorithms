import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.applet.Applet;
import java.net.URL;
import java.awt.image.*;
import java.lang.*;
import MyPack.*;
import java.applet.*;

public class LinearSearch extends Applet
                          implements ActionListener,Runnable,MouseListener,MouseMotionListener {
   Label enterLabel, resultLabel,array,l1;
   TextField enter, result,arraysize;
   int a[],counter=0,counter2=0;
   int t=0,i=0,j=0,n=0,nextl=0;
   Image im,imb,imred,im1,alpha,imn,help;
   int k=0,prev=0,l=0;
   int xpoly[]={0,0,0,0,0,0};
   int ypoly[]={0,0,0,0,0,0};
   int x[]={0,0,0,0,0,0};
   int y[]={0,0,0,0,0,0};
   Thread th;
   String[] Name={"Searching","Algorithms"};
   String msg=" ";
   int mx,my,mvx,mvy,element;
   int lastpolyx=0,lastpolyy=0;
   //Toolkit tk = Toolkit.getDefaultToolkit();
   Color col=new Color(64,128,128);
   Color col1=new Color(192,192,192);
   Color col2=new Color(48,97,97);
   Color col3=new Color(0,128,192); 
   private AudioClip lin1; 


  public static void main(String args[])
  {
   
   Main app= new Main("Starter Application");
   app.setSize(300,100);
   app.show();
  }  

  public void init()
   {
      addMouseListener(this);
      addMouseMotionListener(this);
      Font font = new Font("Arial", Font.BOLD,60);
      setLayout( new FlowLayout() );
      setBackground(col);
      array=new Label("Array size ");
      add(array);

      arraysize = new TextField( 10 );
      arraysize.addActionListener( this );
      add( arraysize );

         
      enterLabel = new Label( "Enter search key" );
      add( enterLabel );
      enterLabel.setForeground(Color.white);

      enter = new TextField( 10 );
      enter.addActionListener( this );
      add( enter );
            

      resultLabel = new Label( "Result" );
      add( resultLabel );
      resultLabel.setForeground(Color.white);

      result = new TextField( 23 );
      result.setEditable( false );
      add( result );
      result.setForeground(Color.white);
        
     

      // create array and populate with even integers 0 to 198
      a = new int[15 ];
      n=a.length;
      for ( int i = 0; i < a.length; i++ )
      a[ i ] = 2 * i;
      //th= new Thread(this);th.start();
      loadImage();
      filterImage();
      lin1=getAudioClip(getDocumentBase(),"lin1.wav");
      lin1.play();
   }



   // Search "array" for the specified "key" value
public int linearSearch( int array[], int key ) 
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
       g.drawImage(imn,629,447,this);
       g.drawImage(help,629,55,this);
       g.drawImage(alpha,0,0,this); 
       g.drawImage(alpha,770,0,this);
      
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
			URL url = getClass().getResource("arrow.jpg");
			im = createImage((ImageProducer)url.getContent());

		        URL url1=getClass().getResource("white.jpg");
                        imb = createImage((ImageProducer)url1.getContent());
				
			URL url2=getClass().getResource("red.jpg");
                        imred = createImage((ImageProducer)url2.getContent());
			
			URL url3=getClass().getResource("linear.jpg");
                        im1 = createImage((ImageProducer)url3.getContent());
			
                        URL url4=getClass().getResource("next.jpg");
                        imn = createImage((ImageProducer)url4.getContent());

			URL url5=getClass().getResource("handhelp.jpg");
                       help = createImage((ImageProducer)url5.getContent());
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
                MediaTracker mtn = new MediaTracker(this);
		mtn.addImage(imn, 0);
		MediaTracker mth = new MediaTracker(this);
		mth.addImage(help, 0);
		try {
			mt.waitForID(0);
                        mtb.waitForID(0);
			mtr.waitForID(0);
			mt1.waitForID(0);
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
 {    Graphics g=getGraphics();
      
      if(e.getSource()==enter)
      {
      k=60;
      String searchKey = e.getActionCommand();
      Graphics g1=getGraphics();
      int position,previ=0;;
      // Array a is passed to linearSearch even though it
      // is an instance variable. Normally an array will
      // be passed to a method for searching.
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
        String s="Enter a["+i+"]";
         try{
         a[ i ] =Integer.parseInt(JOptionPane.showInputDialog(s));
            }
        catch(Exception ex) {previ=1; 
        JOptionPane.showMessageDialog(null,"You must enter an integer value !!");
                             }
       if(previ==0) {i++;}
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


public void mouseClicked(MouseEvent me){ mx=0;my=24;
   //msg=mx+"+"+my; repaint();
}

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
   //repaint();
  }

  public void mousePressed(MouseEvent me)
  {Graphics g=getGraphics();
    mx=me.getX();my=me.getY();
   if(mx>=629 && mx<=680 && my>=447 && my<=500)
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
     msg="mouse="+mx+","+my;
   //  repaint();
  }



/*public void addNotify() {
		super.addNotify(); // this instantiates the peer

		Insets 	  insets = getInsets();
		Dimension scrnsz = tk.getScreenSize();
		Dimension globesz = new Dimension(im1.getWidth(this), 
											im1.getHeight(this));

		setBounds((scrnsz.width/2) - (globesz.width/2),
				  (scrnsz.height/2) - (globesz.height/2),
				  globesz.width + insets.left + insets.right, 
				  globesz.height + insets.top + insets.bottom);
	}*/
}




class Main extends Frame
{
 
  public Main(String frameTitle)
  {
   super(frameTitle);
   LinearSearch linear=new LinearSearch();
   linear.init();
  
   add(linear,"Center"); 
   
   addWindowListener(new WindowAdapter(){
   public void WindowClosing(WindowEvent event)
   {
    dispose();
    System.exit(0);
    }
});
}
}