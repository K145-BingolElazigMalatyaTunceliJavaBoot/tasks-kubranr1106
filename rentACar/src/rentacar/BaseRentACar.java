
package rentacar;

public class BaseRentACar {
    
    private int id;
    private String model;
    private double motorGucu;
    private double bagajKapasitesi;
   
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getModel() {
        return model;
    }

    
    public void setModel(String model) {
        this.model = model;
    }

   
    public double getMotorGucu() {
        return motorGucu;
    }

    
    public void setMotorGucu(double motorGucu) {
        this.motorGucu = motorGucu;
    }

    
    public double getBagajKapasitesi() {
        return bagajKapasitesi;
    }

    
    public void setBagajKapasitesi(double bagajKapasitesi) {
        this.bagajKapasitesi = bagajKapasitesi;
    }
}

