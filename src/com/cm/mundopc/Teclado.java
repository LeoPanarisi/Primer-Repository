package com.cm.mundopc;

/**
 *
 * @author Leo Panarisi
 */
public class Teclado extends DispositivoDeEntrada{
    private final int idTeclado;
    private static int contadorTeclados;
    
    public Teclado(String tipoEntrada, String marca){
        super (tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{idTeclado=").append(idTeclado);
        sb.append('}');
        return sb.toString();
    }

  
}
