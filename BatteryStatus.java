public class BatteryStatus {
  public static void main(String[] args) {
    int batteryLevel = 96;
    switch (batteryLevel / 10) {
      case 10:
      case 9:
      case 8:
        System.out.println("High"); 
        break;
      case 7:
      case 6:
      case 5:
        System.out.println("Medium");
        break;
      default:
        System.out.println("Low");
    }
  }
}
