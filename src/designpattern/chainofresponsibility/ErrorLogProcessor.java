package designpattern.chainofresponsibility;

public class ErrorLogProcessor extends LogProcessor {
	public ErrorLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }
    
    public void log(Log level, String msg){
        if(level == Log.ERROR){
            System.out.println("ERROR => " + msg);
        }
        else{
            super.log(level, msg);
        }
    }
}
