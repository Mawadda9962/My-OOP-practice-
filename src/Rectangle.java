public class Rectangle {
    private double Length;
    private double Width;

    public Rectangle(double L, double W) {
    }

    public double getLength() {
        return Length;
    }
    public Rectangle add (Rectangle Room2){
        Rectangle Result = new Rectangle( );
        Result.Length = this.Length + Room2.Length;
        Result.Width = this.Width + Room2.Width;

        return Result;
    }

    public void setLength(double length) {
        length =70;
        Length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getarea(){
       return Length * Width;
    }

    public boolean isEqual (Rectangle object2){
        if (this.Length == this.Length && this.Width == this.Width){
            return true;

        }else {
            return false;
        }
    }

    private static void main(String[] args){
        Rectangle R1 = new Rectangle(10 ,50); //Creating a new object from the rectangle class
        Rectangle R2 = new Rectangle(10 ,50);

        R1 =R2;

kk
     if (R1.equals(R2)){
         System.out.println("The object is equal");
     }else {
         System.out.println("The object is not equal");
     }


    }
}
