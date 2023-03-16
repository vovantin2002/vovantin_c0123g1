package bai_10;

public class Main {
        public static void main(String[] args) {
            MyList<String> list = new MyList<>(0);
            list.add(0,"dat");
            list.add(1,"123");
            list.add("pp");
            list.add("p");
            list.add(2,"...");
            System.out.println(list.add("p"));
            System.out.println(list.remove(1));
            System.out.println(list.print());
            System.out.println(list.size());
            System.out.println(list.clone());
            System.out.println(list.indexOf("pp"));
            System.out.println(list.contains(".."));
            System.out.println(list.get(2));
            list.clear();
            System.out.println(list.print());

        }

}
