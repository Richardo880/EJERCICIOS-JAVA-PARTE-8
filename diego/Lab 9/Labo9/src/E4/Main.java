package E4;

public class Main {
    public static void main (String [] args) throws Exception{
        validarCadena("hola");
        validarCadena("hola amigos de youtube");
        validarCadena("hola amigos de youtube, en est");
        validarCadena("?");
    }
    
    public static void validarCadena (String cadena) throws ErrorDeCadenaLongitud, ErrorDeCadenaCaracteres{
        if (cadena.length() > 30)
            throw new ErrorDeCadenaLongitud();
        
        boolean valido = false;
        String caracteresPermitidos = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char caracterCadena;
        for (int i = 0; i < cadena.length(); i++) {
            caracterCadena = cadena.charAt(i);
            valido = false;
            for (int j = 0; j < caracteresPermitidos.length(); j++) {
                if (caracterCadena == caracteresPermitidos.charAt(j))
                    valido = true;
            }
        }
        
        if (!valido)
            throw new ErrorDeCadenaCaracteres();
        
        System.out.println(cadena + " -> Cadena valida");
    }
}
