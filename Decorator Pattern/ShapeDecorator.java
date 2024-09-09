
public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratorShape) {
		System.out.println("This is ShapeDecorator's constructor");
		this.decoratedShape = decoratorShape;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is abstract class ShapeDecorator's draw()");
		decoratedShape.draw();
	}
	
	public void specialMessageToSon() {
		System.out.println("Hello Son!");
	}

}
