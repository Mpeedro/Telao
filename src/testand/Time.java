
package testand;

public class Time {
    
    private String Nome;
    private int Qvitorias;
    private int Qderrotas;

    public Time(String Nome, int Qvitorias, int Qderrotas) {
        this.Nome = Nome;
        this.Qvitorias = Qvitorias;
        this.Qderrotas = Qderrotas;
    }

    @Override
    public String toString() {
        return Nome;
    }

    
    Time() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void vitoria(){
        this.setQvitorias(Qvitorias ++);  
    }
    public void derrota(){
    this.setQderrotas(Qderrotas ++);  
    }    
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public int getQvitorias() {
        return Qvitorias;
    }

    public void setQvitorias(int Qvitorias) {
        this.Qvitorias = Qvitorias;
    }

    public int getQderrotas() {
        return Qderrotas;
    }

    public void setQderrotas(int Qderrotas) {
        this.Qderrotas = Qderrotas;
    }
    

    
}
