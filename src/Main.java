public class Main {
    public static void main(String[] args) {
        Director a = new Director(new CseStudent());
        Student z = a.create();

        System.out.println(z.S());
    }
}