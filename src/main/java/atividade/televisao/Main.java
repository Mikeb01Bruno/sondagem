package atividade.televisao;

public class Main {

    public static void main(String[] args) {
        Televisao TVsala = new Televisao();
        Televisao TVquarto = new Televisao();
        
        TVsala.Desligar();
        TVsala.AlterarCanal(5);
        TVsala.AumentarVolume();
        TVsala.DiminuirVolume();
        
        TVquarto.Ligar();
        TVquarto.AlterarCanal(4);
        TVquarto.AumentarVolume();
        TVquarto.AumentarVolume();
        TVquarto.AumentarVolume();
        TVquarto.DiminuirVolume();
        
        
    }

}
