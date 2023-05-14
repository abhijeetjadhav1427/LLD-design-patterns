package designpattern.chainofresponsibility;

public class ChainOfLogger {
	public static void main(String[] args) {
		LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
		logger.log(Log.INFO, "info msg");
		logger.log(Log.DEBUG, "DEBUG msg");
		logger.log(Log.ERROR, "error msg");
	}
}
