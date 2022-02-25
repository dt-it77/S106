package nivell1_ex1;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("No Generic amb integers: ");
        NoGenericMethods nogenericInteger = new NoGenericMethods(1,2,3);
        System.out.println(nogenericInteger.toString());
        //System.out.println(nogenericInteger.get1());
        //System.out.println(nogenericInteger.get2());
        //System.out.println(nogenericInteger.get3());
        System.out.println("Cambiem ordre: ");
        NoGenericMethods nogenericInteger2 = new NoGenericMethods(3,2,1);
        System.out.println(nogenericInteger2.toString());

    }
}
