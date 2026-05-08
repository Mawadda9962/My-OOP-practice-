public class Rectangle {
    private double Length;
    private double Width;

    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
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

    private static void main(String[] args){
        Rectangle R1 = new Rectangle(); //Creating a new object from the rectangle class

        R1.setLength(2);
        R1.setWidth(4);
        System.out.println(R1.getarea());


        Rectangle R2 = new Rectangle();

        R2.setWidth(4);
        R2.setLength(4);
        System.out.println(R2.getarea());

    }
}
