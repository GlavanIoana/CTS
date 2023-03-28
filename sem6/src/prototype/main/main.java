package prototype.main;

import prototype.model.IReteta;
import prototype.model.Reteta;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Map<String,Float> solutii=new HashMap<String,Float>();
        solutii.put("solutia1", 20.0F);
        solutii.put("solutia2",30.0F);
        solutii.put("solutia3",10.0F);
        IReteta prototype=new Reteta("Reteta",solutii,60);
        Reteta farmacie= (Reteta) prototype.copiaza();
        farmacie.setNume("Reteta framaciei");
        Reteta laborator= (Reteta) prototype.copiaza();
        laborator.setNume("reteta lab");
        System.out.println(farmacie.toString());
        System.out.println(laborator.toString());
    }
}
