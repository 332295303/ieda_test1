package Day5.Genner;

public class GenderInterfaceClass<T> implements GenderInterfaceDemo<T>  {

    @Override
    public void show(T t) {
        System.out.println(t);
    }

}
