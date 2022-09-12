package bai_4.fan;

public class MainFan {
    public static void main(String[] args) {
        Fan quat1 = new Fan(3, 10, "vàng", true);
        Fan quat2 = new Fan(2, 5, "xanh", false);
        System.out.println(quat1.toString());
        System.out.println(quat2.toString());
    }
}
