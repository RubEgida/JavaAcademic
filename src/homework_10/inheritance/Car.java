package homework_10.inheritance;

public class Car {
    private int passengerCount;
    private String engineType;

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount > 1) {
            this.passengerCount = passengerCount;
        } else {
            System.out.println("Passenger min count for car 2!!!");
        }
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if (engineType.length() > 0 && Character.isLetter(engineType.charAt(0))) {
            this.engineType = engineType;
        } else {
            System.out.println("Engine type is one letter ('a-z' or 'A-Z')!!!");
        }
    }
}
