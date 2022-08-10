package caixeiroviajante;

public class Adjacente {
    
    //como se fossem as estradas entre as cidades
    //são as cidade próximas da cidade atual
    
    private Vertice cidade; //vértice
    private int custo;

    public Adjacente(){
        
    }
    public Adjacente(Vertice cidade, int custo) {
        this.cidade = cidade;
        this.custo = custo;
    }
    
    public Vertice getCidade() {
        return cidade;
    }

    public void setCidade(Vertice cidade) {
        this.cidade = cidade;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }
    
}
