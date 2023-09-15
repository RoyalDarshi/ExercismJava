class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder reform=new StringBuilder();
        for(int i=0;i<identifier.length();i++){
            if(identifier.charAt(i)==' '){
                reform.append("_");
            } else if(identifier.charAt(i)>=0&&identifier.charAt(i)<=31){
                reform.append("CTRL");
            }
            else if(identifier.charAt(i)=='-'){
                reform.append((char)(identifier.charAt(i)-32));
                i++;
            }
            else if((identifier.charAt(i)>=65&&identifier.charAt(i)<=90)||
                    (identifier.charAt(i) >= 97 && identifier.charAt(i) <= 122)) {
                reform.append(identifier.charAt(i));
            }
                    
        }
        return reform.toString();
    }
}
