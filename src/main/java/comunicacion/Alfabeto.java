package comunicacion;

public class Alfabeto extends Pictograma{

    private String[] letras;
    private String interpretacion;

    //constructor
    public Alfabeto(String origen, String[] letras,String interpretacion){
        super(origen);
        this.letras=letras;
        this.interpretacion=interpretacion;
    }
    //getters
    public String[] getLetras(){
        return letras;
    }
    public String getInterpretacion(){
        return interpretacion;
    }

    //metodos
    public int cantidadLetras(){
        return letras.length;
    }
    public String interpretacion(){
        return interpretacion;
    }
    public String toString(){
        String z="";
        for(int i=0; i<cantidadLetras(); i++){
            z+=letras[i]+", ";
        }

        return z.substring(0, z.length()-2);
    }
}