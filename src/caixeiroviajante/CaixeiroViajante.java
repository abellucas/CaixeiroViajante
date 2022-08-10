package caixeiroviajante;

public class CaixeiroViajante {

    public static void main(String[] args) {
        
        Grafo mapa = new Grafo();
        
        Gulosa gulosa = new Gulosa(mapa.bucharest);
        
        gulosa.buscaIterativa(mapa.arad);        
    }
    
}
