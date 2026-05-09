public class Rectangle {
    private double Length;
    private double Width;

    public double getLength() {
        return Length;
    }
    public Rectangle add (Rectangle Room1 , Rectangle Room2){
        Rectangle Result = new Rectangle();
        Result.Length = Room1.Length + Room2.Length;
        Result.Width = Room1.Width + Room2.Width;


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

    private static void main(String[] args){
        Rectangle R1 = new Rectangle(); //Creating a new object from the rectangle class

        R1.setLength(2);
        R1.setWidth(4);
        System.out.println(R1.getarea());


        Rectangle R2 = new Rectangle();

        R2.setWidth(4);
        R2.setLength(4);
        System.out.println(R2.getarea());

        Rectangle room1 = new Rectangle();
        double roomLength = 50;
        room1.setLength(roomLength);

        System.out.println(roomLength);


    }
}
