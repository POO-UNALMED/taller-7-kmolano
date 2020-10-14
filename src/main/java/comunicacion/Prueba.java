package comunicacion;

public class Prueba {
    public static void main(String[] args) {
        String[ ]letras =new String [] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String z="";

        for(int i=0; i< letras.length; i++){
            z+=letras[i]+", ";
        }
        System.out.println(z.substring(0, z.length()-2));
    }
}
