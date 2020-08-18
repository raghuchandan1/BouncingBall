import java.util.*;
import java.awt.*;
import java.awt.event.*;
class BouncingBall extends Frame
{
	public static void main()throws InterruptedException
	{
		BouncingBall bb=new BouncingBall(Color.RED);
		bb.setVisible(true);
		bb.setSize(1000,1000);
		bb.setTitle("Bouncing Ball");
	}
	public static final int FrameWidth=1000;
	public static final int FrameHeight=1000;
	private Bouncing b;
	private int counter=0;
	public BouncingBall(Color c)
	{
		b=new Bouncing(10,20,20);
		b.setMotion(20,20);
		repaint();
		this.addWindowListener(new WindowAdapter()
			{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}});
	}
	public void paint(Graphics g)
	{
		b.paint();
		b.move();
		if(b.x(),0||b.x()>FrameWidth)
		{
			b.setMotion(-b.xMotion(),b.yMotion());
		}
		if(b.y(),0||b.y()>FrameHeight)
		{
			b.setMotion(b.xMotion(),-b.yMotion());
		}
		while(counter<5000)
		{
			repaint();
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
			}
			counter++;
		}
	}
}