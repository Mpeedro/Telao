
package testand;

import java.util.Scanner;


public class Telão{
   
    private Time Nomea;
    private Time Nomeb;
    private int PontuacaoA;
    private int PontuacaoB;

    Telão(Time Nomea, Time Nomeb, int PontuacaoA, int PontuacaoB) {
        this.Nomea = Nomea;
        this.Nomeb = Nomeb;
        this.PontuacaoA = 0;
        this.PontuacaoB = 0;
    }

    public void Partida(int voto){
     Scanner teclado = new Scanner(System.in);
        for(int i =0; i<=4; i++){
        System.out.println("Vamos Iniciar a partida, estamos com os times " + "\n" + this.getNomea() + " " + PontuacaoA + " X " + PontuacaoB + " " +this.getNomeb());
        System.out.println("Digite 1 para marcar ponto pra " + this.getNomea() + " // Digite 2" + " para marcar ponto pra " + this.getNomeb());
           resultado();
             voto = teclado.nextInt();
             if(voto ==1){
             this.PontuacaoA++;
             } else{
             this.PontuacaoB++;
             } if(this.PontuacaoA==5){
                 System.out.println("O Time: " + Nomea + " Ganhou de " + PontuacaoA + " a " + PontuacaoB + Nomeb );
                 this.Nomea.vitoria();
                 this.Nomeb.derrota();
                   }else if(this.PontuacaoB==5){
                 System.out.println("O time: " + Nomeb + " Ganhou de: " + PontuacaoB + " a " + PontuacaoA + Nomea);
                 this.Nomeb.vitoria();
                 this.Nomea.derrota();
             }           
               resultado(); 
        }
      
       
        
       
}

    
    public void espaço(){
          System.out.println("==================================");
         
    }
 
    public void resultado(){
    espaço();
        System.out.println("-----------Placar---------------");
     System.out.println(" " +  this.getNomea() + " "+ this.getPontuacaoA() + " X " + this.getPontuacaoB() + " " + this.getNomeb() );
       
    }

    public Time getNomea() {
        return Nomea;
    }

    public void setNomea(Time Nomea) {
        this.Nomea = Nomea;
    }

    public Time getNomeb() {
        return Nomeb;
    }

    public void setNomeb(Time Nomeb) {
        this.Nomeb = Nomeb;
    }

    public int getPontuacaoA() {
        return PontuacaoA;
    }

    public void setPontuacaoA(int PontuacaoA) {
        this.PontuacaoA = PontuacaoA;
    }

    public int getPontuacaoB() {
        return PontuacaoB;
    }

    public void setPontuacaoB(int PontuacaoB) {
        this.PontuacaoB = PontuacaoB;
    }
     
   
   

    
  
    }

    
    
    

    


    

