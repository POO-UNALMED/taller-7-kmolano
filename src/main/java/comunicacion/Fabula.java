package comunicacion;

public class Fabula extends Escrito{

    private String ensenanza;
    private String interpretacion;

    //constructor
    public Fabula(String origen,String titulo,String autor,int paginas,String ensenanza, String interpretacion){
        super(origen,titulo,autor,paginas);
        this.ensenanza=ensenanza;
        this.interpretacion=interpretacion;
    }

    //getters
    public String getEnsenanza(){
        return ensenanza;
    }

    //setters
    public void setEnsenanza(String ensenanza){
        this.ensenanza=ensenanza;
    }
    public void setInterpretacion(String interpertacion){
        this.interpretacion=interpertacion;
    }

    //metodos
    public int palabrasTotales(int palabrasPagina){
        return (super.getPaginas()*palabrasPagina*1);
    }
    public String interpretacion(){
        return interpretacion;
    }
    public String toString(){
        return super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+getEnsenanza();
    }
}
