

// 07_2. Shapes

public class Week_7_02 {
	public static void main(String[] args) {
		
		Shape72 s1 = new Shape72(); 
		Shape72 s2 = new Shape72(1.0f, 2.0f, "red");
		System.out.println("s1 = " + s1); 
		System.out.println("s2 = " + s2);
		s1.setCenter(-2.0f, 4.0f); 
		s1.setColor("green");
		System.out.println("now s1 has center (" + s1.getCX() + ", " + 
		                                  s1.getCY() + ") and color(" + s1.getColor() + ")");
		Shape72 s3 = new Shape72(1.0f, 2.0f, "red");
		System.out.println("s1 = " + s1); 
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("s1.equals(s2) = " + s1.equals(s2));
		System.out.println("s2.equals(s3) = " + s2.equals(s3));
		System.out.print("draw s1: "); 
		s1.draw();
		s2.translate(2.0f, 2.0f);
		System.out.print("scale s3: ");
		s3.scale(1.5f, 1.5f);
		System.out.println("s1 = " + s1); 
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println(); 
		
		Circle72 c1 = new Circle72(); 
		Circle72 c2 = new Circle72(2.5f, -3.0f, "yellow", 5.0f); 
		Circle72 c3 = new Circle72(-4.0f, 4.5f, "magenta", 3.0f);
		System.out.println("c1 = " + c1); 
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		c1.setCenter(2.5f, -3.0f); 
		c1.setColor("yellow");
		c1.setRadius(5.0f);
		System.out.println("now c1 has center (" + c1.getCX() + ", " + 
                c1.getCY() + ") color(" + c1.getColor() + ") radius(" + c1.getRadius() + ")");
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2); 
		System.out.println("c3 = " + c3); 
		System.out.println("c1.equals(c2) = " + c1.equals(c2));
		System.out.println("c2.equals(c3) = " + c2.equals(c3));
		System.out.print("draw c1: "); 
		c1.draw();
		c2.translate(2.0f, 2.0f);
		System.out.print("call c3.scale(1.5f, 1.5f): ");
		c3.scale(1.5f, 1.5f);
		System.out.println("call c3.scale(1.5f): ");
		c3.scale(1.5f);
		System.out.println("c1 = " + c1); 
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println(); 
		
		Rectangle72 r1 = new Rectangle72(); 
		Rectangle72 r2 = new Rectangle72("blue", -1.0f, -1.0f, 3.0f, 5.0f); 
		Rectangle72 r3 = new Rectangle72( "green", 3.0f, 2.0f, 4.0f, 3.0f);
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2); 
		System.out.println("r3 = " + r3); 
		r1.setCenter(2.0f, 2.0f); 
		System.out.println("r1 = " + r1);
		r1.setColor("blue");
		r1.setXY0(-1.0f, -1.0f);
		r1.setWidth(3.0f); 
		r1.setHeight(5.0f);
		System.out.println("now r1 has center (" + r1.getCX() + ", " + 
                r1.getCY() + ") color(" + r1.getColor() + ") x0(" + r1.getX0() + ") y0(" + 
				r1.getY0() + ") width(" + r1.width + ") height(" + r1.height + ")");
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2); 
		System.out.println("r3 = " + r3); 
		System.out.println("r1.equals(r2) = " + r1.equals(r2));
		System.out.println("r2.equals(r3) = " + r2.equals(r3));
		System.out.print("draw r1: "); 
		r1.draw();
		r2.translate(2.0f, 2.0f);
		r3.scale(2.0f, 2.0f);
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2); 
		System.out.println("r3 = " + r3); 
	}
}

// your code here for Shape72, Circle72, Rectangle72

class Shape72 {
	protected float cx, cy;
	protected String color;
	
	public Shape72() {
		cx = 0;
		cy = 0;
		color = "nocolor";
	}
	
	public Shape72(float cx, float cy, String color ) {
		this.cx = cx;
		this.cy = cy;
		this.color = color;
	}
	
	
	public void setCenter(float cx, float cy) {
		this.cx = cx;
		this.cy = cy;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public float getCX() {
		return cx;
	}
	
	public float getCY() {
		return cy;
	}
	
	
	public void translate(float dx, float dy) {
		this.cx += dx;
		this.cy += dy;
	}
	
	public String toString() {
		String returnString = String.format("SHAPE center(%.1f, %.1f) color(%s)",cx,cy,color);
		return returnString;
	}
	
	public void draw() {
		
		String returnSentence = String.format("draw Shape72 with color (%s)",color);
		System.out.println(returnSentence);
	}
	
	public void scale(float sx, float sy) {
		
		String returnSentence = String.format("Shape72 scaled with (%.1f, %.1f)",sx,sy);
		System.out.println(returnSentence);
	}
	
	public boolean equals(Object object) {
		
		if(object == null) {
			return false;
		}
		
		else if (getClass()!=object.getClass()) {
			return false;
		}
		
		else {
			Shape72 newShape72 = (Shape72)object; 
			return (color.equals(newShape72.color) && cx == newShape72.cx && cy == newShape72.cy);
		}
		
		
	}
}


class Circle72 extends Shape72{
	
	protected float radius;
	
	public Circle72() {
		super();
		radius = 1;
	}
	
	public Circle72(float cx, float cy, String color, float radius) {
		super(cx, cy, color);
		this.radius = radius;
	}
	
	
	public float getRadius() {
		return radius;
	}
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public void scale(float s) {
		radius *= s;
	}
	
	public void scale(float a, float b) {
		
		String returnSentence = String.format("this method is not valid for Circle72. use scale(float) instead");
		System.out.println(returnSentence);
	}
	
	public void draw() {
		
		String returnSentence = String.format("draw Circle72 with color (%s)",color);
		System.out.println(returnSentence);
	}
	
	public String toString() {
		
		String returnString = "CIRCLE " + super.toString() + " radius(" + radius +")";
		return returnString;
		
	}
	
	public boolean equals(Object object) {
		
		
		if(object == null) {
			return false;
		}
		
		else if (getClass()!=object.getClass()) {
			return false;
		}
		
		else {
			Circle72 newCircle72 = (Circle72)object; 
			return (super.equals(object) && newCircle72.radius == this.radius);
		}	
	}
	
}


class Rectangle72 extends Shape72 {
	
	protected float x0, y0;
	protected float width, height;
	
	
	public Rectangle72() {
		super(0,0, "nocolor");
		this.x0 = -1;
		this.y0 = -1;
		this.width = 2;
		this.height = 2;
		
	}
	
	public Rectangle72(String color, float x0, float y0, float width, float height) {
		
		super((x0)+width/2, (y0)+height/2, color);
		this.x0 = x0;
		this.y0 = y0;
		this.width = width;
		this.height = height;
		
	}
	
	public void setCenter(float cx, float cy) {
		
		this.cx = cx; 
		this.cy = cy;
		this.setXY0(cx-width/2, cy-height/2);
		
	}
	
	
	public float getX0() {
		return x0;
	}
	
	public float getY0() {
		return y0;
	}
	
	public float getWidth() {
		return width;
	}
	
	public float getHeight() {
		return height;
	}
	
	public void setXY0(float x0, float y0) {
		this.x0 = x0;
		this.y0 = y0;
		this.cx = x0+ width/2;
		this.cy = y0+ height/2;
	}
	
	public void setWidth(float width) {
		this.width = width;
		this.cx = x0 + width/2;
	}
	
	public void setHeight(float height) {
		this.height = height;
		this.cy = y0 + height/2; 
	}
	
	public void draw() {
		
		String returnSentence = String.format("draw Rectangle72 with color (%s)",color);
		System.out.println(returnSentence);
	}
	
	public void translate(float dx, float dy) {
		super.translate(dx, dy);
		x0 = cx - width/2;
		y0 = cy - height/2;
	}
	
	public void scale(float sx, float sy) {
		
		width = sx * width;
		height = sy * height;
		
		cx = x0 + width/2;
		cy = y0 + height/2;
	}
	
	public String toString() {
		
		String returnString = "RECTANGLE " + super.toString() + " x0y0(" + x0 + ", " + y0 + ") width(" + width + ") height(" + height + ")" ;
		return returnString;
		
	}
	
	public boolean equals(Object object) {
		
		
		if(object == null) {
			return false;
		}
		
		else if (getClass()!=object.getClass()) {
			return false;
		}
		
		else {
			Rectangle72 newRectangle72 = (Rectangle72)object; 
			return (super.equals(object) && newRectangle72.x0 == this.x0 && newRectangle72.y0 == this.y0);
		}	
	}
	
}



















