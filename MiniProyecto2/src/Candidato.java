public class Candidato extends Ciudadano {
    private boolean derecha;
    private PartidosPoliticos partidoPolitico;
    private Promesas promesa;
    private Promesas promesa2;

    public Candidato(String nombre, String cedula, String ciudad, boolean derecha, PartidosPoliticos partidoPolitico, Promesas promesa, Promesas promesa2) {
        super(nombre, cedula, ciudad);
        this.derecha = derecha;
        this.partidoPolitico = partidoPolitico;
        this.promesa = promesa;
        this.promesa2 = promesa2;
    }

    public boolean isDerecha() {
        return derecha;
    }

    public void setDerecha(boolean derecha) {
        this.derecha = derecha;
    }

    public PartidosPoliticos getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(PartidosPoliticos partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public Promesas getPromesa() {
        return promesa;
    }

    public void setPromesa(Promesas promesa) {
        this.promesa = promesa;
    }

    public Promesas getPromesa2() {
        return promesa2;
    }

    public void setPromesa2(Promesas promesa2) {
        this.promesa2 = promesa2;
    }

    
}

