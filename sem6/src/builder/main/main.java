package builder.main;

import builder.clase.Pacient;
import builder.clase.PacientBuilder;

public class main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder=new PacientBuilder("Ion");
//        Pacient pacient=pacientBuilder.setNume("Ion").setMicDejun(true).setPapuciDeCamera(true).build();
        Pacient pacient=pacientBuilder.setMicDejunInclus(true).setPapuciDeCamera(true).build();

        Pacient pacient1=new PacientBuilder("MAria").build();
        Pacient pacient2=new PacientBuilder("Vasile").setMicDejunInclus(true).setPatRabatabil(true).build();
        Pacient pacient3=pacientBuilder.setPatRabatabil(true).setNume("Ana").build();
        System.out.println(pacient.toString());
        System.out.println(pacient1.toString());
//        pacient.setMicDejunInclus(false);

    }
}
