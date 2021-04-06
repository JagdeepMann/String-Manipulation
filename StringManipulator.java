public class StringManipulator {
    //  #1
    public String trimAndConcat(String a, String b) {
        // trim off the white spaces around the strings, and concatenate them together
        // pre-built String method called "trim"
        String d= a.trim();
        String e = b.trim();
        String tc = d.concat(e);
        return tc;
    }

    public Integer getIndexOrNull(String str, char c) {
        // Get the index of the character and return either the index or null. If the character appears multiple times, return the first index. 
        // Feel free to use the "indexOf" method of the String class.
        int idx = str.indexOf(c);
        return idx;
    }

    public Integer getIndexOrNull(String a, String b){
        // Get the index of the start of the substring and return either the index or null.
        // Feel free to use the "indexOf" method of the String class.
        int idx = a.indexOf(b);
        return idx;
    }

    public String concatSubstring(String a, int x, int y, String b) {
        // Get a substring using a starting and ending index, and concatenate that with the second string input to our method. 
        // Feel free to use the "substring" method of the String class.
        String f = a.substring(x, y);
        String cs = f.concat(b);
        return cs;
    } 

}