package ch_03.sect_20;


public class task_03_20_02 {
    public static void main(String[] args) {
        DayType today = DayType.WEEKDAY;

        System.out.println(today.getDescription()); // Work day

        DayType found = DayType.findByDescription("Relax day");
        System.out.println(found); // WEEKEND
    }

    enum DayType {
        WEEKDAY("Work day"),
        WEEKEND("Relax day");

        private final String description;

        DayType(String description) {
            this.description = description;
        }

        public static DayType findByDescription(String desc) {
            for (DayType type : values()) {
                if (type.getDescription().equalsIgnoreCase(desc)) {
                    return type;
                }
            }
            throw new IllegalArgumentException("No matching DayType for description: " + desc);
        }

        public String getDescription() {
            return description;
        }
    }
}
