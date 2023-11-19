public class main {
    public static void main(String[] args) {
        //convert Universal and Universal to asciiText
        
        String s = "asciitexthere";
        
        String[] split = s.split("\\\\u");

        String out = "";
        for (String ste : split) {
            try {
                out += ((char) ((int) (Integer.valueOf(ste, 16))));
            } catch (Exception e) {

            }
        }
        System.out.println(out);
        String as = "";
        for (int i = 0; i < out.length(); i++) {
            as += "\\u" + Integer.toHexString(out.charAt(i));
        }
        System.out.println(as);
        System.out.println(s);

        try {
            String asciiText = StringEscapeUtils.escapeJava(out);
            String unicodeText = StringEscapeUtils.unescapeJava(asciiText);

            System.out.println(asciiText);
            System.out.println(unicodeText);
        } catch (Exception e) {
        }


    }
}
