package root.entities;

public class Activity {
    private int id;
    private String area;
    private String branchOffice;
    private String typology;
    private String description;
    private int time;
    private boolean interruptible;
    private int week;
    private String notes;
    private ActivityType type;
    private String[] materials;
    private String[] competences;
    
    
    public enum ActivityType {PLANNED, UNPLANNED, EXTRA};

    public Activity(int id, String area, String branchOffice, String typology, String description, int time, boolean interruptible, int week, String notes, ActivityType type) {
        this.id = id;
        this.area = area;
        this.branchOffice = branchOffice;
        this.typology = typology;
        this.description = description;
        this.time = time;
        this.interruptible = interruptible;
        this.week = week;
        this.notes = notes;
        this.type = type;
    }
    
    public Activity(int id, String area, String branchOffice, String typology, String description, int time, boolean interruptible, int week, String notes, ActivityType type, String[] materials, String[] competences) {
        this(id, area, branchOffice, typology, description, time, interruptible, week, notes, type);
        this.materials = materials;
        this.competences = competences;
    }
    
    public Activity(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBranchOffice() {
        return branchOffice;
    }

    public void setBranchOffice(String branchOffice) {
        this.branchOffice = branchOffice;
    }

    public String getTypology() {
        return typology;
    }

    public void setTypology(String typology) {
        this.typology = typology;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isInterruptible() {
        return interruptible;
    }

    public void setInterruptible(boolean interruptible) {
        this.interruptible = interruptible;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ActivityType getType() {
        return type;
    }

    public void setType(ActivityType type) {
        this.type = type;
    }

    public String[] getMaterials() {
        return materials;
    }

    public void setMaterials(String[] materials) {
        this.materials = materials;
    }

    public String[] getCompetences() {
        return competences;
    }

    public void setCompetences(String[] competences) {
        this.competences = competences;
    }
    
    /**
     * Convert a string that rappresent an activity type, to its enumeration.
     * The convertion is case sensitive (type should be upper case).
     * @param type the raw string
     * @return ActivityType value if the string is valid; otherwise null
     */
    public static ActivityType convertRawType(String type) {
        if (type == null) return null;
        switch (type) {
            case "PLANNED": return ActivityType.PLANNED;
            case "UNPLANNED": return ActivityType.UNPLANNED;
            case "EXTRA": return ActivityType.EXTRA;
            default: return null;
        }
    }

    @Override
    public String toString() {
        return "Activity{" + "id=" + id + ", area=" + area + ", branchOffice=" + branchOffice + ", typology=" + typology + ", description=" + description + ", time=" + time + ", interruptible=" + interruptible + ", week=" + week + ", notes=" + notes + ", type=" + type + '}';
    }
}
