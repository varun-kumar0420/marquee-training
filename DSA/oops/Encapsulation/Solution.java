import java.util.*;

class Thermostat {
  private int temperature = 32;

  public int getTemperature() {

    return this.temperature;
  }

  public void setTemperature(int target) {
    if (target >= 15 && target <= 30) {
      this.temperature = target;
    } else {
      System.out.println("Error");
    }
  }

}

public class Solution {
  public static void main(String[] args) {
    Thermostat roomtemp = new Thermostat();
    roomtemp.setTemperature(25);
    System.out.println(roomtemp.getTemperature());

    roomtemp.setTemperature(85);
    System.out.println(roomtemp.getTemperature());
  }
}
