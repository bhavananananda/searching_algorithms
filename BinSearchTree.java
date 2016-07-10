import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.applet.Applet;
import java.net.URL;
import java.awt.image.*;
import java.lang.*;
import java.util.*;
import MyPack.*;

public class BinSearchTree extends Applet
                          implements ActionListener,Runnable,MouseListener,MouseMotionListener {
   Label Status,Action,l1;
   TextField status,action;
   int a[];
   int x[],y[];
   int counter=0,counter2=0;
   int prevx=1,prevy=1;
   int t=0,i=0,j=0,n,nextl=0;  
   String names[]={" ","Julia","Elton","Micheal","Cleopatra","Harry","Lopez","Nicolo","Beniditt"," "," ","Ian","Kate"," "," "};
   Image im0,im1,im2,im3,im4,im5,im6,im7,im8,im9,c1,c2,c3,c4,s,alpha;
   URL url1,url2,url3,url4,url5,url6,url7,url8,url9,url0,urlc,urlcb,urlcl,urlclb,urls;
   int k=0,prev=0,l=0;
   int start=0;
   int choice=0;
   Thread th;
   String[] Name={"Searching","Algorithms"};
   String msg=" ";
   int mx,my,mvx,mvy,element;
   //Toolkit tk = Toolkit.getDefaultToolkit();
   Color col=new Color(64,128,128);
   Color col1=new Color(192,192,192);
   Color col2=new Color(48,97,97);
   Color col3=new Color(0,128,192); 

 public void init()
   {
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
{g.setColor(col);
g.fillRect(200,195,470,70);

//item1
g.setColor(Color.white);
g.drawImage(im0,307,67,this);g.drawString("Julia",267,81); 
status.setText( "Julia is at root" );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}
action.setText( "First item is inserted" );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}

//item2
g.drawLine(330,112,180,67+f1);
g.drawImage(im1,307-150,67+f1,this);g.drawString("Elton",105,181);
status.setText( "Elton is inserted to left of Julia" );
action.setText( "                                  " );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}
action.setText( "This is because E occurs before J" );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}

//item3
g.drawLine(330,112,480,67+f1);
g.drawImage(im2,307+150,67+f1,this);g.drawString("Michael",517,181);
status.setText( "Michael is inserted to right of Julia" );
action.setText( "                                  " );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}
action.setText( "This is because M occurs after J" );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}

//item4
g.drawLine(180,67+f1+45,130,67+2*f1);
g.drawImage(im3,307-150-f,67+2*f1,this);g.drawString("Cleopatra",38,295);
status.setText( "Cleopatra is inserted to the left of Elton" );
action.setText( "                                  " );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}
action.setText( "This is because C occurs before E" );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}

//item5
g.drawLine(180,67+f1+45,230,67+2*f1);
g.drawImage(im4,307-150+f,67+2*f1,this);g.drawString("Harry",263,295);
status.setText( "Harry is inserted to the right of Elton" );
action.setText( "                                  " );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}
action.setText( "This is because H occurs after E" );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}

//item6
g.drawLine(130,67+2*f1+45,80,67+3*f1);
g.drawImage(im5,307-150-2*f,67+3*f1,this);g.drawString("Beniditt",14,393);
status.setText( "Beniditt is inserted to the left of Cleopatra" );
action.setText( "                                  " );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}
action.setText( "This is because B occurs before C" );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}

//item7
g.drawLine(230,67+2*f1+45,280,67+3*f1);
g.drawImage(im6,307-150+2*f,67+3*f1,this);g.drawString("Ian",197,393);
status.setText( "Ian is inserted to the right of Harry" );
action.setText( "                                  " );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}
action.setText( "This is because I occurs after H" );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}

//item8
g.drawLine(480,67+f1+45,307+150-f+23,67+2*f1);
g.drawImage(im7,307+150-f,67+2*f1,this);g.drawString("Lopez",353,295);
status.setText( "Lopez is inserted to the left of Micheal" );
action.setText( "                                  " );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}
action.setText( "This is because L occurs before M" );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}

//item9
g.drawLine(480,67+f1+45,307+150+f+23,67+2*f1);  
g.drawImage(im8,307+150+f,67+2*f1,this);g.drawString("Nicolo",561,295);
status.setText( "Nicolo is inserted to the right of Micheal" );
action.setText( "                                  " );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}
action.setText( "This is because N occurs after M" );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}

//item10
g.drawLine(307+150-f+23,67+2*f1+45,380,67+3*f1);
g.drawImage(im9,307+150-2*f,67+3*f1,this);g.drawString("Kate",421,393); 
status.setText( "Kate is inserted to the left of Lopez" );
action.setText( "                                  " );
for(int p=0;p<30000;p++)
for(int q=0;q<20000;q++)
{;}
action.setText( "This is because K occurs before L" );
for(int p=0;p<30000;p++)
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
   //repaint();
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


