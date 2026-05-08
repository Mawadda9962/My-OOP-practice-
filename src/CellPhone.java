public class CellPhone {
    private String manufact;
    private  String modle;
    private  double retailPrice;

    public CellPhone(String iPhone, String number, double v) {
    }

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
fgmdff
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

    public CellPhone() {
        this.manufact = manufact;
        this.modle = modle;
        this.retailPrice = retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public static void main(String[] args) {

        CellPhone Cell2 = new CellPhone();
        CellPhone myInputObject = new CellPhone("iPhone", "4873", 300.31);

        myInputObject.getManufact();






    }

}
