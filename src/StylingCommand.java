
public class StylingCommand implements Command {
    private SalonManager salonManager;
    private String clientName;

    public StylingCommand(SalonManager salonManager, String clientName) {
        this.salonManager = salonManager;
        this.clientName = clientName;
    }

    @Override
    public void execute() {
        salonManager.bookAppointment(clientName, "Styling");
    }
}
