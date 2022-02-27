package nivell1_ex3;

public class GenericMethods<T> {
   public void f(T t1, T t2, T...t3){
      if(t3.length == 0){
         System.out.println("Valor 1: " + t1 + " | Valor2: " + t2);   
      }else{
         System.out.println("Valor 1: " + t1 + " | Valor2: " + t2 + " | Valor3: " + t3[0]);
      }
   }
}
