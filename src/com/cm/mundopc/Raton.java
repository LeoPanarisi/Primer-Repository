package com.cm.mundopc;

/**
 *
 * @author Leo Panarisi
 */
public class Raton extends DispositivoDeEntrada {
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{idRaton=").append(idRaton);
        sb.append('}');
        return sb.toString();
    }
   
    
}
