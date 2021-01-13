import java.util.Scanner;

public class HotelDatabaseSimple1 {

    public static void main(String[] args) {

        double[] roomReservation = { 250.00, 350.00, 520.00, 480.00 };

        double roomRate = 0;
        int num, roomType;
        Scanner inputDevice = new Scanner(System.in);

        System.out
                .println("Type of Room: \n 1 - Deluxe Room\n 2- Superior Room\n 3 - Suite Garden View\n 4- Budget Room");

        System.out.println("Enter Types Of Room");
        roomType = inputDevice.nextInt();

        for (num = 0; num < roomReservation.length; ++num) {
            if (roomReservation[roomType - 1] == roomReservation[num])
                roomRate = roomReservation[roomType - 1];
        }

        System.out.println("Room rate is RM:" + roomRate);

    }

}
