public class Hello {

    public static void main(String[] args) {
        var name = System.getProperty("java.runtime.name");
        var version = System.getProperty("java.runtime.version");
        System.out.println("Java: " + name + " " + version);
    }

}
