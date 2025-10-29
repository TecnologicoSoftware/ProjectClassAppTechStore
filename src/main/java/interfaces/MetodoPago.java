package interfaces;

public interface MetodoPago {
    boolean procesarPago(double monto);
    boolean validar();
}
