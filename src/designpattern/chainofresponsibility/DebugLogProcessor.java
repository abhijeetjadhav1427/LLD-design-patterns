package designpattern.chainofresponsibility;

public class DebugLogProcessor extends LogProcessor {

	public DebugLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
	}

	public void log(Log level, String msg) {
		if (level == Log.DEBUG) {
			System.out.println("DEBUG => " + msg);
		} else {
			super.log(level, msg);
		}
	}
}
