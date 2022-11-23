package SemanaUno;

public class Motocicleta {

    public String color, tipo, motor, neumaticos;
    public int cilindros;
    public double velocidad;

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMotor() {
        return motor;
    }

    public String getNeumaticos() {
        return neumaticos;
    }

    public int getCilindros() {
        return cilindros;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public boolean setColor(String color) {
        if (!color.isEmpty()) {
            this.color = color;
            return true;
        } else return false;
    }

    public boolean setTipo(String tipo) {
        if (!tipo.isEmpty()) {
            this.tipo = tipo;
            return true;
        } else return false;
    }

    public boolean setMotor(String motor) {
        if (!motor.isEmpty()) {
            this.motor = motor;
            return true;
        } else return false;
    }

    public boolean setNeumaticos(String neumaticos) {
        if (!neumaticos.isEmpty()) {
            this.neumaticos = neumaticos;
            return true;
        } else return false;
    }

    public boolean setCilindros(int cilindros) {
        if (cilindros > 0) {
            this.cilindros = cilindros;
            return true;
        } else return false;
    }

    public boolean setVelocidad(double velocidad) {
        if (velocidad >= 0) {
            this.velocidad = velocidad;
            return true;
        } else return false;
    }
}
