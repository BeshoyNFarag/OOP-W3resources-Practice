public class House {

    public void calculateArea() {

        final double length = 12.5;
        final double width = 7.0;

        class Room {

            public double getArea() {
                return length * width;
            }
        }

        Room room = new Room();

        double area = room.getArea();
        System.out.println("Area of the room: " + area);


    }
}