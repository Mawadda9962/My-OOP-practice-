public class CellPhone {
    private String manufact;
    private  String modle;
    private  double retailPrice;

    public String getManufact() {
        return manufact;
    }

    public void setManufact(String manufact) {
        if (manufact.equals("iPhone") || manufact.equals("Samsung")){
            this.manufact = manufact;
        }else{
            System.out.println("Error!");
        }
    }

    public String getModle() {
        return modle;
    }

    public void setModle(String modle) {
        if (modle.equals("2021") || modle.equals("2023")){
            this.modle = modle;

        }else{
            System.out.println("Invalid Model!");
        }
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public static void main(String[] args){

        CellPhone Cell1 = new CellPhone();
        CellPhone Cell2 = new CellPhone();

        Cell1.setManufact("iPhone");
        Cell1.setModle("2021");

        Cell2.setManufact("Samsung");
        Cell2.setModle("2023");



    }

}
