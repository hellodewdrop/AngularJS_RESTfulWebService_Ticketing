package kamal;

public class Bus_Ticketing {

    int id;
    String currentDate;
    String startDate;
    String passengerName;
    String passengerAge;
    String passengerSex;
    String phoneNumber;
    String passengerDestination;
    String busNumber;
    String busName;
    String busType;
    String ticketType;
    String totalAmount;

    public Bus_Ticketing() {
        super();
    }

    public Bus_Ticketing(int i, String currentDate, String startDate, String passengerName, String passengerAge, String passengerSex, String phoneNumber, String passengerDestination, String busNumber, String busName, String busType, String ticketType, String totalAmount) {
        super();
        this.id = i;
        this.currentDate = currentDate;
        this.startDate = startDate;
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.passengerSex = passengerSex;
        this.phoneNumber = phoneNumber;
        this.passengerDestination = passengerDestination;
        this.busNumber = busNumber;
        this.busName = busName;
        this.busType = busType;
        this.ticketType = ticketType;
        this.totalAmount = totalAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(String passengerAge) {
        this.passengerAge = passengerAge;
    }

    public String getPassengerSex() {
        return passengerSex;
    }

    public void setPassengerSex(String passengerSex) {
        this.passengerSex = passengerSex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassengerDestination() {
        return passengerDestination;
    }

    public void setPassengerDestination(String passengerDestination) {
        this.passengerDestination = passengerDestination;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

}
