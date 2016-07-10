import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.applet.Applet;
import java.net.URL;
import java.awt.image.*;
import java.lang.*;
import MyPack.*;

public class BBinarySearch extends Applet
                          implements ActionListener,Runnable,MouseListener,MouseMotionListener {
   Label enterLabel, resultLabel,l1,array;
   TextField enter, result,arraysize;
   String display = "";
   int a[],counter=0;
   int t=0,i=0,j=0,k=0,prev=0,mid,nextl=0,l=0;
   Image im,imb,imred,im1,alpha,imn;
   int xpoly[]={0,0,0,0,0,0};
   int ypoly[]={0,0,0,0,0,0};
   int x[]={0,0,0,0,0,0};
   int y[]={0,0,0,0,0,0};
   int lastpolyx=0,lastpolyy=0,n;
   int mx,my,mvx,mvy,element;
   String[] Name={"Searching","Algorithms"};
   String msg=" ";
   Thread th;
   Color col=new Color(64,128,128);
   Color col1=new Color(192,192,192);
   Color col2=new Color(48,97,97);
   Color col3=new Color(0,128,192); 


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
      Font font = new Font("Arial", Font.BOLD,50);
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

      enter = new TextField( 5 );
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
       g.drawImage(imn,629,447,this);
       g.drawImage(alpha,0,0,this); 
       g.drawImage(alpha,770,0,this);
   }


      
   

  private void loadImage() {
		try {
			URL url = getClass().getResource("arrow.jpg");
			im = createImage((ImageProducer)url.getContent());

		        URL url1=getClass().getResource("white.jpg");
                        imb = createImage((ImageProducer)url1.getContent());
				
			URL url2=getClass().getResource("red.jpg");
                        imred = createImage((ImageProducer)url2.getContent());
			
			URL url3=getClass().getResource("binary.jpg");
                        im1 = createImage((ImageProducer)url3.getContent());
			
                        URL url4=getClass().getResource("next.jpg");
                        imn = createImage((ImageProducer)url4.getContent());
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
		try {
			mt.waitForID(0);
                        mtb.waitForID(0);
			mtr.waitForID(0);
			mt1.waitForID(0);
                        mtn.waitForID(0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
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
        String s="Enter a["+i+"]";
         try{
            a[ i ] =Integer.parseInt(JOptionPane.showInputDialog(s));
            }
          catch(Exception ex) {previ=1;
            JOptionPane.showMessageDialog(null,"You must enter an integer value !!");
            }
          if(previ==0) {i++;}
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








private void filterImage() {
		alpha = createImage(new FilteredImageSource(
		im1.getSource(), new DissolveFilter(50)));
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
   //repaint();
  }

  public void mousePressed(MouseEvent me)
  {Graphics g=getGraphics();
    mx=me.getX();my=me.getY();
   if(mx>=629 && mx<=680 && my>=447 && my<=500)
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








/*
class BubbleSortAlgorithm extends SortAlgorithm {
    void sort(int a[]) throws Exception {
	for (int i = a.length; --i>=0; ) {
	    boolean swapped = false;
	    for (int j = 0; j<i; j++) {
		if (stopRequested) {
		    return;
		}
		if (a[j] > a[j+1]) {
		    int T = a[j];
		    a[j] = a[j+1];
		    a[j+1] = T;
		    swapped = true;
		}
		pause(i,j);
	    }
	    if (!swapped)
		return;
	}
    }
}


for (int i = a.length; --i>=0; ){
for (int j = 0; j<i; j++) {
                    if (a[j] > a[j+1]) {
		    int T = a[j];
		    a[j] = a[j+1];
		    a[j+1] = T;
                 
}*/



class Main extends Frame
{
  int searchtype=0;
  public Main(String frameTitle)
  {
   super(frameTitle);
   BBinarySearch binary=new BBinarySearch();
  

   binary.init(); 
   add(binary,"Center"); 
       
   addWindowListener(new WindowAdapter(){
   public void WindowClosing(WindowEvent event)
   {
    dispose();
    System.exit(0);
    }
});
}
}











