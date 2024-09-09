
public class RedShapeDecorator extends ShapeDecorator {
	
    public RedShapeDecorator (Shape decoratorShape) {
    	super(decoratorShape);
    }
    
    @Override
    public void draw() {
    	System.out.println("This is class RedShapeDecorator's draw()");
    	decoratedShape.draw();
    	setRedBorder(decoratedShape);
    	super.specialMessageToSon();
    }
    
    private void setRedBorder(Shape decoratedShape) {
    	System.out.println("Border Color: Red");
    }
    
}