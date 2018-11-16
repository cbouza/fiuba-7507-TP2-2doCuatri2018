package atenea.fiuba.algoIII.ageoOfEmpires;

public class Abajo implements Direccion {
    @Override
    public Posicion desplazarPos(Posicion posicion) {
        int y = posicion.getCasillerosOcupados().get(0).getCoordendadaEnY();
        int x = posicion.getCasillerosOcupados().get(0).getCoordenadaEnX();

        return new PosicionDeUnCasillero(x,y-1);
    }
}