public class Train {
    private String destination;
    private String trainNumber;
    private String departureTime;

    public Train(String destination, String trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        setDepartureTime(departureTime);
    }

    public String getDestination() {
        return destination;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setDepartureTime(String departureTime) {
        if (!departureTime.matches("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$")) {
            System.out.println("Ошибка введенного времени отправления: " + departureTime);
            return;
        }
        this.departureTime = departureTime;
    }

    public void isDelayed(int minutes) {
        String[] timeParts = departureTime.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int currentMinutes = Integer.parseInt(timeParts[1]);
        String seconds = timeParts[2];

        int totalMinutes = currentMinutes + minutes;
        hours = (hours + totalMinutes / 60) % 24;
        currentMinutes = totalMinutes % 60;

        String newDepartureTime = String.format("%02d:%02d:%s", hours, currentMinutes, seconds);

        this.departureTime = newDepartureTime;
    }

    public static void main(String[] args) {
        Train train = new Train("Минск", "740B", "14:45:00");

        System.out.println("Поезд №" + train.getTrainNumber() + " до станции " + train.getDestination());
        System.out.println("Плановое время отправления: " + train.getDepartureTime());

        train.isDelayed(30);

        System.out.println("новое время отправления (после задержки): " + train.getDepartureTime());
    }

    @Override
    public String toString() {
        return "Train{trainNumber='" + trainNumber + "', destination='" + destination + "', departureTime='" + departureTime + "'}";
    }
}
