package designpattern.chainofresponsibility;

public abstract class LogProcessor{
    private LogProcessor logProcessor;
    public LogProcessor(LogProcessor logProcessor){
        this.logProcessor = logProcessor;
    }
    
    public void log(Log level, String msg){
        if(logProcessor != null){
            logProcessor.log(level, msg);
        }
    }
}