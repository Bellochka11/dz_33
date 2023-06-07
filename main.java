package dz_33;

public class Main {
    public static void main(String[] args) {
        dz list = new dz();
        list.add(5);
        list.add(12);
        list.add(78);
        list.add(90);
        list.add(103);
        list.add(34);
        list.printdz(list);
        list.reverse();
        list.printdz(list);


    }
}