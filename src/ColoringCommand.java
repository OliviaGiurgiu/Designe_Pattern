
public class ColoringCommand implements Command {
    private SalonManager salonManager;
    private String clientName;

    public ColoringCommand(SalonManager salonManager, String clientName) {
        this.salonManager = salonManager;
        this.clientName = clientName;
    }

    @Override
    public void execute() {
        salonManager.bookAppointment(clientName, "Coloring");
    }
}
