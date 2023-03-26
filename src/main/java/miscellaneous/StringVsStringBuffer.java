package miscellaneous;

public class StringVsStringBuffer {
    public static void main(String[] args) {
        String s = new String("Gaurav");
        String s1 = new String("Gaurav");
        System.out.println(s.equals(s1)); //content comparision as equal methods override
        StringBuffer buffer = new StringBuffer("Gaurav");
        StringBuffer buffer1 = new StringBuffer("Gaurav");
        System.out.println(buffer.equals(buffer1));//no content comparision as equal methods not override
        StringBuilder builder = new StringBuilder("Gaurav");
        StringBuilder builder1 = new StringBuilder("Gaurav");
        System.out.println(builder.equals(builder1));//no content comparision as equal methods not override

        String ss = "Kabir";
        System.out.println(ss);
        ss.concat("Kamra");
        System.out.println(ss);
        ss.concat("Aadi");
        System.out.println(ss);
        ss="Kabir Kamra";
        System.out.println(ss);

        String name = new String("Monu");
        name.concat("Kamra");
        System.out.println(name);
        String name2  = name.concat("KAmra");
        System.out.println(name2);
        name= name+"Kamra";
        System.out.println(name);
    }
}
