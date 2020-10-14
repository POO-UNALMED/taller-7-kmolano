package comunicacion;

public class Tesis extends Escrito{

    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    //constructor
    public Tesis(String origen, String titulo, String autor, int paginas,String idea,String[] argumentos,String conclusion,String referencia,String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea=idea;
        this.argumentos=argumentos;
        this.conclusion=conclusion;
        this.referencias=referencia;
        this.interpretacion=interpretacion;
    }

    //getters
    public String getIdea(){
        return idea;
    }
    public String getConclusion(){
        return conclusion;
    }
    public String getReferencias(){
        return referencias;
    }
    public String[] getArgumentos(){
        return argumentos;
    }

    //setters
    public void setIdea(String idea){
        this.idea=idea;
    }
    public void setConclusion(String conclusion){
        this.conclusion=conclusion;
    }
    public void setReferencias(String referencias){
        this.referencias=referencias;
    }
    public void setInterpretacion(String interpretacion){
        this.interpretacion=interpretacion;
    }

    //metodos
    public int palabrasTotales(int palabrasPagina){
        return (super.getPaginas()*palabrasPagina*5);
    }
    public String interpretacion(){
        return interpretacion;
    }
    public String toString(){
        return super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+getIdea()+"\n"+argumentos.length+"\n"+getConclusion()+"\n"+getReferencias();
    }
}
