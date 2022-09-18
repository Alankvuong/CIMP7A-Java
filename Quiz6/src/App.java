public class App {
    public static void main(String[] args) {
    String s = "Java";
    StringBuffer buffer = new StringBuffer(s);
    change(buffer);
    System.out.println(buffer);
    }
    
    private static void change(StringBuffer buffer) {
    buffer.append(" and HTML");
    }
    }