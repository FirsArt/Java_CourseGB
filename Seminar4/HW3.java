import java.util.LinkedList;
import java.util.Scanner;

/*
 * Ввод: 1
Ввод: +
Ввод: 2
Вывод: 3
Ввод:+
Ввод:4
Вывод 7
Ввод:*
Ввод:3
Вывод 21
Отмена
Вывод 7
Отмена
Вывод 3
Ввод:-
Ввод:1
Вывод 2
 */

public class task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Cp866");
        LinkedList<Integer> results = new LinkedList<>();
        int first;
        int second;
        String zn;
        boolean firts_or_not = true;
        while(true){
            if (firts_or_not==true){
                System.out.print("Ввод числа ->");
                first = sc.nextInt();
                sc.nextLine();
                firts_or_not = false;
            }
            else {
                first = results.getLast();
            }
            System.out.print("Ввод знака ->");
            zn = sc.nextLine();
            if(zn.equals("Отмена")){
                results.removeLast();
                System.out.println(results.getLast());
                if(results.size()==0) firts_or_not=true;
                continue;
            }
            if(zn.equals("Стоп")) break;
            System.out.print("Ввод числа ->");
            second = sc.nextInt();
            sc.nextLine();
            if (zn.equals("+")) {
                System.out.println((first+second));
                results.add(first+second);
            }
            else if (zn.equals("-")){
                System.out.println(first-second);
                results.add(first-second);
            }
            else if (zn.equals("*")) {
                System.out.println(first*second);
                results.add(first*second);
            }
            else if (zn.equals("/")) {
                System.out.println(first/second);
                results.add(first-second);
            }
        }
        sc.close();
    }
}
