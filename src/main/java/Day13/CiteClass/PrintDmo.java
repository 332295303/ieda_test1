package Day13.CiteClass;

public class PrintDmo {
    public static void main(String[] args) {
        userprinter((String s)->{
            new PrintString().toUpString(s   );
        });
        //引用类方法必须时静态方法  引用对象的实例方法
        userprinter(PrintString::toUpString);
    }
    private static void userprinter(Printer printer){
        printer.printUpperCase("Hello world");
        //System.out.println(printer);
    }
}
