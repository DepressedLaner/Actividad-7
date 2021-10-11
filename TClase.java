package Actividad7;

public class TClase {
    Cpris Prime = new Cpris();
    
    public int[] Aprimo(int[] i){
        
        int Nm = 0;
        int psc = 0;
        boolean primo = true;
        
        while(psc != i.length){
            
            primo = Prime.Nprimo(Nm);
            
            if(primo){
                
                i[psc] = Nm;
                psc++;
            }
            
            Nm++;
        }   
        return i;
    }
    
    public int[] Afibonacci(int[] j){
        
        int ans = 1, cur = 0, temp;
        j[0] = cur;
        
        for(int i = 1; i < j.length; i++){
            
            temp = ans + cur;
            
            j[i] = temp;
            
            ans = cur;
            cur = temp;
            
        }       
        return j;
    }


    public void Printer(int[] x){
        
        System.out.print("Secuencia: ");
        
        for(int i = 1; i < x.length; i++){
            
            
            System.out.print(x[i] + ", ");
            
            if(i%5 == 0){
                System.out.println("");
            }
            
        }
        System.out.println("");
    }


}
