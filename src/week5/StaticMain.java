package week5;

import java.util.Scanner;

public class StaticMain {

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        LinkedList<Integer> secondL = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            l.addLast(scanner.nextInt());
        }
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            secondL.addLast(scanner.nextInt());
        }

System.out.println("The reversed list is: ");
        System.out.println(StaticLinkedList.reverse(l));
        System.out.println("The sorted list is:");
        System.out.println(StaticLinkedList.sort(l));
        System.out.println("The two merged lists are:");
        System.out.println(StaticLinkedList.merge(l,secondL));
    }

}