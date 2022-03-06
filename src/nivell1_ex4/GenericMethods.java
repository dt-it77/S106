package nivell1_ex4;

public class GenericMethods<T> {
   //public void f(ArrayList<T> array){
   public void f(T... t){
      for (T tValue : t) {
         System.out.println(tValue);   
      }
   }
}
