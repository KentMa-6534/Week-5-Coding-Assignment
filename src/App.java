
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		logger.log("Hello");
		logger.error("Hello");
		logger2.log("Hello");
		logger2.error("Hello");
		
	}

}
