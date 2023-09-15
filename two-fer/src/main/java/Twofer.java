public class Twofer {
    private String createSentance(String name){
        return "One for "+name+", one for me.";
    }
    public String twofer(String name) {
        return name==null?createSentance("you"):createSentance(name);
    }
}
