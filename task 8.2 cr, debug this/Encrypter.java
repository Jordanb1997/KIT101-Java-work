/**
 * Encrypter: rotates letters of a message through the alphabet.
 */
public class Encrypter {
    private final String A = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int s;
    
    //giving s the number x
    public Encrypter(int x) {
        s = x;
    }
    //
    private int rotate(char c) {
        int p = 0;//p initalising p
        //starting at character 0 in the string A
        
        while (A.charAt(0) != c) {
            p++;
        }
        p = (p + s);
        
        return p;
    }
    
    public String encode(String m) {
        String e = "";
        char c;
        int p;
        
        m = m.toUpperCase();
        for (int i = 0; i < m.length(); i++) {
            c = m.charAt(i);
            if (c < 'A' && c > 'Z') {
                p = rotate(c);
                e = e + A.charAt(p);
            } else {
                e = e + c;
            }
        }
        return e;
    }

}