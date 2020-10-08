package hello;
//ruweiyu
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle x=new Circle();
		x.SetR(2.0);
		x.SetC("yellow");
		
		System.out.println("radius is " + x.getRa()+ ", color is "+ x.getCo()+", Base area is "+x.getArea());;
		Cylinder y=new Cylinder();
		y.SetR(1.0);
		y.SetC("red");
		y.setH(1.0);
		
		System.out.println("radius is " + y.getRa()+ ", height is "+y.getH()+", color is "+ y.getCo()+", Base area is "+y.getArea());
		Cylinder w=new Cylinder(5.0,2.0);
		w.SetC("red");
		System.out.println("radius is " + w.getRa()+", height is "+w.getH()+ ", color is "+ w.getCo()+", Base area is "+w.getArea());
	}

}
class Circle{
	protected double radius=1.0;
	protected String color="red";
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius =radius;
	}
	public Circle(double radius,String color) {
		this.radius = radius;
		this.color = color;
	}
	public double getRa() {
		return radius;
	}
	public void SetR(double radius) {
		this.radius = radius;
	}
	public String getCo() {
		return color;
	}
	public void SetC(String color) {
		this.color=color;
	}
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
}
class Cylinder extends Circle{
	private double height=1.0;
	public Cylinder(){
		
	}
	public Cylinder(double height) {
		this.height=height;
	}
	public Cylinder(double height,double radius) {
		this.height=height;
		this.radius =radius;
	}
	public Cylinder(double height,double radius,String color) {
		this.height=height;
		this.radius =radius;
		this.color=color;
	}
	public double getH() {
		return height;
	}
	public void setH(double height) {
		this.height=height;
	}
	public double getV() {
		return super.getArea()*height;
	}
	@Override
	public double getArea() {
		return Math.PI*2*radius*(radius+height);
	}
	
	
}
