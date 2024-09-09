
public class ObserveerPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Subject subject = new Subject();
        
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        
        System.out.println("First time of change is value 15");
        subject.setState(15);
        
        System.out.println("Second time of change is value 10");
        subject.setState(10);
        
	}

}
