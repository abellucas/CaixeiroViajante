package caixeiroviajante;
import java.util.ArrayList;

//Vertice irá representar a cidade
public class Vertice {
    
    private String rotulo; //nome da cidade
    private int distanciaObjetivo;
    private boolean visitado; //detectar se foi visitado ou não
    private ArrayList<Adjacente> adjacentes;
    
    public Vertice(){
        
    }

    public Vertice(String rotulo, int distancia) {
        this.rotulo = rotulo;
        this.distanciaObjetivo = distancia;
        this.visitado = false;
        this.adjacentes = new ArrayList<>();
    }
    
    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public int getDistanciaObjetivo() {
        return distanciaObjetivo;
    }

    public void setDistanciaObjetivo(int distanciaObjetivo) {
        this.distanciaObjetivo = distanciaObjetivo;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public ArrayList<Adjacente> getAdjacentes() {
        return adjacentes;
    }

    public void setAdjacentes(ArrayList<Adjacente> adjacentes) {
        this.adjacentes = adjacentes;
    }

    //adiciona um vértice adjacente dentro da lista de adjacentes
    public void adicionaAdjacente(Adjacente a){
        adjacentes.add(a);
    }
    
    public void exibirAdjacentes(){
        
        for(int i = 0; i <= adjacentes.size(); i++){
            System.out.println(adjacentes.get(i).getCidade().getRotulo() + ", ");
            System.out.println(adjacentes.get(i).getCidade().getDistanciaObjetivo());
        }
    }
    
}
