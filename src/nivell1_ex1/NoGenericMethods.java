package nivell1_ex1;

public class NoGenericMethods {
    private Integer i1;
    private Integer i2;
    private Integer i3;    

    public NoGenericMethods(Integer o1,Integer o2,Integer o3){
        i1 = o1;
        i2 = o2;
        i3 = o3;
    }

    public void sei1(Integer i1) { this.i1 = i1; }
    public Integer gei1() { return i1; }

    public void sei2(Integer i2) { this.i2 = i2; }
    public Integer gei2() { return i2; }

    public void sei3(Integer i3) { this.i3 = i3; }
    public Integer gei3() { return i3; }

    @Override
    public String toString(){
        return "Valor 1: " + i1 + " | Valor2: " + i2 + " | Valor3: " + i3;
    }
}
