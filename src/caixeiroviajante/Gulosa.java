package caixeiroviajante;

public class Gulosa {

    private final Vertice objetivo;
    private boolean encontrado;

    public Gulosa(Vertice objetivo) {
        this.objetivo = objetivo;
        this.encontrado = encontrado;
    }

    public boolean isEncontrado() {
        return encontrado;
    }

    public void setEncontrado(boolean encontrado) {
        this.encontrado = encontrado;
    }

    public void buscaIterativa(Vertice atual) {
        Vertice aux = atual;
        if (atual.getRotulo().equals(objetivo.getRotulo())) {
            this.encontrado = true;
        } else {
            while (!atual.getRotulo().equals(objetivo.getRotulo()) && atual.getAdjacentes() != null) {
                System.out.println("---------------------------");
                System.out.println("Atual: " + atual.getRotulo());
                atual.setVisitado(true); //a cidade atual precisa ser marcada como visitada
                
                
                for (int i = 0; i < atual.getAdjacentes().size(); i++) {
                    System.out.println(i + " - " + atual.getAdjacentes().get(i).getCidade().getRotulo() + " - " + atual.getAdjacentes().get(i).getCidade().getDistanciaObjetivo());

                //if (!aux.getAdjacentes().get(i).getCidade().isVisitado()) {
                  if(!atual.getAdjacentes().get(i).getCidade().isVisitado()){
                        //atual.getAdjacentes().get(i).getCidade().setVisitado(true);
                        //System.out.println(aux.getDistanciaObjetivo());
                        
                        if (atual.getAdjacentes().get(i).getCidade().getDistanciaObjetivo() < aux.getDistanciaObjetivo()) {
                            aux = atual.getAdjacentes().get(i).getCidade();
                        }
                    }
                }
                atual = aux;
            }
            System.out.println("---------------------------");
            System.out.println("Atual: " + atual.getRotulo());
        }
    }
}
