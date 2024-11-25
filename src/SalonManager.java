
    public class SalonManager {
        private static SalonManager instance;

        private SalonManager() {
            // Private constructor to prevent instantiation
        }

        public static SalonManager getInstance() {
            if (instance == null) {
                instance = new SalonManager();
            }
            return instance;
        }

        public void bookAppointment(String clientName, String service) {
            System.out.println("Booking appointment for " + clientName + " for service: " + service);
        }
    }

