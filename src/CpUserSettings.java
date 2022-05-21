@Entity(name = "cp_user_settings");
public class CpUserSettings {
    //Data-Fields of the Table cp_user_settings
    @Column(name="cp_user_settings")
    private int id;
    @Column(name="user_id")
    private int userId;
    @Column(name="property_name")
    private String propertyName;
    @Column(name="property_value")
    private String propertyValue;
    @Column(name="status")
    private String status;

    //creating getter and setter of all the variables= status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //constructor of the class
    public CpUserSettings(int id, int user_id, String propertyName, String propertyValue, String status){
        this.id = id;
        this.userId = user_id;
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
        this.status = status;
    }

}
