public class main {
    public static void main(String[] args) {
        //convert Universal
        String s="universal text here";
        String[] split = s.split("\\\\u");

        String out="";
        for (String ste : split) {
            try {
                out+=((char)((int)(Integer.valueOf(ste,16))));
            }
           catch (Exception e){

           }
        }
        System.out.println(out);
    }
