package SemanaUno;

public class PruebaMotocicleta {
    public static void main(String[] args) {
        defMotocicleta();
    }

    public static void defMotocicleta() {

        Motocicleta dukati = new Motocicleta();
        dukati.setColor("Naranja");
        dukati.setTipo("Sport Bikes");
        dukati.setMotor("Motor Tetracilindrico");
        dukati.setNeumaticos("Tractionator Dessert H/T");
        dukati.setCilindros(4);
        dukati.setVelocidad(352.2);

        String caracteristicas = "Soy una Moto Dukati, " +
                " mis carateriscicas son: ";

        caracteristicas += "\n Color: " + dukati.getColor();
        caracteristicas += "\n Tipo: " + dukati.getTipo();
        caracteristicas += "\n Motor: " + dukati.getMotor();
        caracteristicas += "\n Neumaticos: " + dukati.getNeumaticos();
        caracteristicas += "\n Cilindros: " + dukati.getCilindros();
        caracteristicas += "\n Velocidad: " + dukati.getVelocidad()+"km/h";

        System.out.println(caracteristicas);
    }
}
