package rvt;

public class MinesansSpele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int PC_chosse = random.nextInt(9) + 1;
        int User_chosse;

        System.out.println("Es domāju par skaitli no 1 līdz 10.");
        System.out.println("Tev tas jāuzmin trīs meginajumos.");
        System.out.println("Ievadi munejumu:");
        for (int i = 0; i < 3; i++) {
            User_chosse = Integer.valueOf(scanner.nextLine());
            if (User_chosse == PC_chosse) {
                System.out.println("PAREIZI!");
                System.out.println("Tu esi uzvarejis speli.");
                break;
            } else {
                System.out.println("nepareizi");
            }
            if (i == 2) {
                System.out.println("Pareizais skaitlis bija " + PC_chosse + ".");
                System.out.println("Tu esi zaudejis speli");
                break;
            }
        }
    }
}
