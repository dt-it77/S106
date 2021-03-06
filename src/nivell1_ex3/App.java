package nivell1_ex3;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Generic Integer");
        GenericMethods<Integer> genericInteger = new GenericMethods<>();
        genericInteger.f(1, 2, 3);

        System.out.println("Generic String");
        GenericMethods<String> genericString = new GenericMethods<>();
        genericString.f("Java", "a", "itAcademy");

        System.out.println("Generic Mix");
        GenericMethods<Object> genericMix = new GenericMethods<>();
        genericMix.f(1, 2.5, "3");

        System.out.println("Nomes dos parametres");
        GenericMethods<Object> nome2Parametres = new GenericMethods<>();
        nome2Parametres.f(2, "Parametres");
    }
}
