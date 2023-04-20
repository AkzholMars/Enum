import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String fullname = scanner.next();

        if (Blacklist.TERRORIST.getList().contains(fullname)
                || Blacklist.EXTREMIST.getList().contains(fullname)){
            System.out.println("Заблокирован");
        } else if (Blacklist.OTMYV.getList().contains(fullname)) {
            list.add(fullname);
            System.out.println("Под наблюдением");
        }
        else
            System.out.println("Одобрено");





    }
}