package designpattern.chainofresponsibility;

public class InfoLogProcessor extends LogProcessor {
	public InfoLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }
    
    public void log(Log level, String msg){
        if(level == Log.INFO){
            System.out.println("INFO => " + msg);
        }
        else{
            super.log(level, msg);
        }
    }
}
