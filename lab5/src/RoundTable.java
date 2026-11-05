public class RoundTable {
    double diameter;
    String material;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if(diameter<=0){
            System.out.print("Диаметр не может быть меньше либо равен 0");
            this.diameter=1;
        }
        this.diameter = diameter;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public RoundTable(double diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    public void area(){
        System.out.print("Площадь: "+ diameter*3.147);
    }
}
