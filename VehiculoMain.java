// Archivo: /Users/rodrigorojas/Desktop/vehiculo/vehiculo.java

class Vehiculo {
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}

class Auto extends Vehiculo {
    private int numeroPuertas;
    private boolean esAutomatico;

    public Auto(String marca, String modelo, int año, int numeroPuertas, boolean esAutomatico) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.esAutomatico = esAutomatico;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public boolean getEsAutomatico() {
        return esAutomatico;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Puertas: " + numeroPuertas);
        System.out.println("Es Automático: " + (esAutomatico ? "Sí" : "No"));
    }
}

class Moto extends Vehiculo {
    private int cilindraje;
    private String tipo;

    public Moto(String marca, String modelo, int año, int cilindraje, String tipo) {
        super(marca, modelo, año);
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Tipo: " + tipo);
    }
}

public class VehiculoMain {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", "Corolla", 2020, 4, true);
        Auto auto2 = new Auto("Honda", "Civic", 2019, 4, false);
        Moto moto1 = new Moto("Yamaha", "MT-07", 2021, 689, "Deportiva");
        Moto moto2 = new Moto("Honda", "PCX", 2022, 150, "Scooter");

        Vehiculo[] vehiculos = {auto1, auto2, moto1, moto2};

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInfo();
            System.out.println("-------------------");
        }
    }
}