
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("\n");
        
        Shape rectangle = new Rectangle();
        System.out.println("Rectangle with normal border");
        rectangle.draw();
        System.out.println("\n");
        
        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("Circle with red border");
        redCircle.draw();
        System.out.println("\n");
        
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Rectangle with red border");
        redRectangle.draw();
        System.out.println("\n");
	}

}
