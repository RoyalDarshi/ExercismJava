public class LogLevels {
    
    public static String message(String logLine) {
        
        return logLine.substring(logLine.indexOf(' '),logLine.length()).trim();
    }

    public static String logLevel(String logLine) {
        int index=5;
        for(;index<logLine.length();index++){
            if(logLine.charAt(index)==']'){
                break;
            }
        }
        return logLine.substring(logLine.indexOf('[')+1,index).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine)+" ("+logLevel(logLine)+")";
    }
}
