/*
 * Classe Execute
 */

/**
 @author Proton
 @version 1.0
 @since 2019-03-27
*/

package threadteste;


public class Execute extends Thread{
    
    public String nome;
    public int time;
    
    Execute(String nome, int time){
        this.nome = nome;
        this.time = time;
    }
    
    @Override
    public void run(){
        int count = 0;
        while(count < 100){
            System.out.printf("Execcutando thread %s, loop: %s\n", nome, count++);
            try{Thread.sleep(this.time);}catch(Exception e){}
        }
    }
}
