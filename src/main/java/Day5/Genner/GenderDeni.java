package Day5.Genner;
//泛型类
public class GenderDeni <T>{
    private  T  name;

    public GenderDeni() {
    }

    public GenderDeni(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
