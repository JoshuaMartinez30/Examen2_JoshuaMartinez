package examen2_joshuamartinez;
public class OEnsamblaje {

    private Computadora computadora;
    private Tecnico tecnico;

    public OEnsamblaje() {
    }

    public OEnsamblaje(Computadora computadora, Tecnico tecnico) {
        this.computadora = computadora;
        this.tecnico = tecnico;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "OrdenEnsamblaje{" + "computadora=" + computadora + ", tecnico=" + tecnico + '}';
    }

}
