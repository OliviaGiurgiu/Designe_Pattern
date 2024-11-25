// HaircutCommand.java
public class HaircutCommand implements Command {
    private SalonManager salonManager;
    private String clientName;

    public HaircutCommand(SalonManager salonManager, String clientName) {
        this.salonManager = salonManager;
        this.clientName = clientName;
    }

    @Override
    public void execute() {
        salonManager.bookAppointment(clientName, "Haircut");
    }
}

