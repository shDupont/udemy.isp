package br.com.dupont;

public interface IVehicle {
    public void configureCar(String color, String year, double engine, int seats);
    public void configureMotorcycle(String color, String year, double engine);
    public void startVehicle();
}
