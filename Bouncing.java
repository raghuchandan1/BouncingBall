import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Bouncing
{
	private Rectangle location;
	private double dx,dy;
	protected Color c;
	public Bouncing(int x,int y,int r,Color c)
	{
		location=new Rectangle(x-r,y-r,2*r,2*r);
		dx=0;
		dy=0;
		public void setMotion(double dx,double dy)
		{
			this.dx=dx;
			this.dy=dy;
		}
		public int radius()
		{
			return location.width/2;
		}
		public int x()
		{
			return location.x+radius();
		}
		public int y()
		{
			return location.y+radius();
		}
		public double xMotion()
		{
			return dx;
		}
		public double yMotionMotion()
		{
			return dy;
		}
		public void moveTo(int x,int y)
		{
			location.setLocation(x,y);
		}
		public void move()
		{
			location.translate((int)dx,(int)dy);
		}
		public void paint(Graphics g)
		{
			g.setColor(c);
			g.fillOval(location.x,location.y,location.width,location.height);
		}
	}
}
