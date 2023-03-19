package bai_tap_them.service;

public class IntructorIml implements IManagement {
    static ArrayList<Intructor> intructors = new ArrayList<>();

    static {
        intructors.add(new Intructor(1, "01", "nu", "Be Dep", "Intructor"));
    }

    static Scanner sc = new Scanner(System.in);
    Intructor intructor = new Intructor();

    @Override
    public void add() {
        System.out.println("Nhap ma gv");
        int code = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i < intructors.size(); i++) {
            if (code == intructors.get(i).getCode()) {
                System.out.println("ma nay da ton tai ");
                return;
            } else {
                count++;
            }
        }
        if (count == intructors.size()) {
        }
        System.out.println("Nhap ten gv");
        String name = sc.nextLine();
        System.out.println("Nhap ngay sinh gv");
        String birday = sc.nextLine();
        System.out.println("Nhap gioi tinh gv");
        String gender = sc.nextLine();
        System.out.println("Nhap vi tri cong viec cua gv ");
        String specialize = sc.nextLine();
        Intructor intructor = new Intructor(code, name, birday, gender, specialize);
        intructors.add(intructor);
    }

    @Override
    public void update() {
    }

    @Override
    public void detele() {
        System.out.println("Nhap ma gv muon xoa :");
        Scanner sc = new Scanner(System.in);
        int code = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < intructors.size(); i++) {
            if (intructors.get(i).getCode() == code) {
                System.out.println("Ban muon xoa ma  " + code + " nay khong  " +
                        "\n 1. Co " +
                        "\n 2. Khong ");
                System.out.println("Chon chuc nang ");
                int choss = Integer.parseInt(sc.nextLine());
                switch (choss) {
                    case 1:
                        intructors.remove(intructors.get(i));
                        System.out.println("Xoa thanh cong ");
                        break;
                    case 2:
                        System.out.println("Ban khong xoa ");
                }
                return;
            }
        }
        System.out.println("Khong tim thay ma gv ");
    }

    public void display() {
        System.out.println("Hien thi danh sach:");
        for (Intructor i : intructors) {
            System.out.println(i);
        }
    }
}
