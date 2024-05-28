package view;

import java.sql.Timestamp;
import java.sql.Date;
import java.util.Scanner;

public class View {

    private Scanner sc;

    public View() {
        sc = new Scanner(System.in);
    }

    public int readInt() {
        return Integer.parseInt(sc.nextLine());
    }

    public String readString() {
        return sc.nextLine();
    }

    public Float readFloat() {
        return Float.parseFloat(sc.nextLine());
    }

    public Date readDate() {
        return Date.valueOf(sc.nextLine());
    }

    public Timestamp readTimestamp() {
        return Timestamp.valueOf(sc.nextLine());
    }
    
}
