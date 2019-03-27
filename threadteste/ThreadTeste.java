/*
 * Testando formas de ultizar thread em java.
 */

/**
 @author Proton
 @version 1.0
 @since 2019-03-27
*/

package threadteste;

public class ThreadTeste {

    public static void main(String[] args) {
        new Thread(f1).start();
        new Execute("exe1", 1000).start();
        new Execute("exe2", 3000).start();
    }
    
    private static Runnable f1 = new Runnable(){
        
        @Override
        public void run(){
            System.out.println("Ok");
        }
    };
}
