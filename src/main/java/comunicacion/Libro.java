package comunicacion;

public class Libro extends Escrito{

    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    //constructor
    public Libro(String origen,String titulo,String autor,int paginas,String co_autor, String editorial,String edicion,String interpretacion){
        super(origen,titulo,autor,paginas);
        this.co_autor=co_autor;
        this.editorial=editorial;
        this.edicion=edicion;
        this.interpretacion=interpretacion;
    }

    //getters
    public String getCo_autor(){
        return co_autor;
    }
    public String getEditorial(){
        return editorial;
    }
    public String getEdicion() {
        return edicion;
    }

    //setters
    public void setCo_autor(String co_autor){
        this.co_autor=co_autor;
    }
    public void setEditorial(String editorial){
        this.editorial=editorial;
    }
    public void setEdicion(String edicion){
        this.edicion=edicion;
    }
    public void setInterpretacion(String interpretacion){
        this.interpretacion=interpretacion;
    }

    //metodos
    public int palabrasTotales(int palabrasPagina){
        return (super.getPaginas()*palabrasPagina*2);
    }
    public String interpretacion(){
        return interpretacion;
    }
    public String toString(){
        return super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+getPaginas()+"\n"+getCo_autor()+"\n"+getEditorial()+"\n"+getEdicion();
    }
}
