public class Main {
    public static void main(String[] args) {
        SalonManager salonManager = SalonManager.getInstance();

        SalonInvoker invoker = new SalonInvoker();

        Command haircutCommand = new HaircutCommand(salonManager, "Bumabac Daniela");
        Command coloringCommand = new ColoringCommand(salonManager, "Olivia Giurgiu");
        Command stylingCommand = new StylingCommand(salonManager, "Maria Lup");

        invoker.setCommand(haircutCommand);
        invoker.executeCommand();

        invoker.setCommand(coloringCommand);
        invoker.executeCommand();

        invoker.setCommand(stylingCommand);
        invoker.executeCommand();
    }
}
