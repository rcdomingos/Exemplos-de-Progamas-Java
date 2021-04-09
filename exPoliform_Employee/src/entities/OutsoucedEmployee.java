package entities;

public class OutsoucedEmployee extends Employee{

    private Double additinoalCharge;

    public OutsoucedEmployee(){
        super();
    }

    public OutsoucedEmployee(String name, Integer hours, Double valuePerHour, Double additinoalCharge) {
        super(name, hours, valuePerHour);
        this.additinoalCharge = additinoalCharge;
    }

    public Double getAdditinoalCharge() {
        return additinoalCharge;
    }

    public void setAdditinoalCharge(Double additinoalCharge) {
        this.additinoalCharge = additinoalCharge;
    }

    //Sobresquevendo o metodo de pagamento
    @Override
    public double payment() {
        return super.payment() + additinoalCharge * 1.1;
    }
}
