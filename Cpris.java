package Actividad7;

public class Cpris {

    public boolean Nprimo(int num){
        
        if(num == 0 || num == 1 || num == 4){
            
            return false;
        }
        for(int i = 2; i < num / 2; i++){
            
            if(num % i == 0){
                
                return false;
            }
        }
        
        return true;
    }
    
}
