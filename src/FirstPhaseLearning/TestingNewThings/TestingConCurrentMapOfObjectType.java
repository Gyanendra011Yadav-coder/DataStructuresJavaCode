package FirstPhaseLearning.TestingNewThings;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-21,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class TestingConCurrentMapOfObjectType {
    private final ConcurrentMap<Object, Object> properties;
    TestingConCurrentMapOfObjectType(ConcurrentMap<Object, Object> properties) {
        this.properties = properties;
    }
    public void setProperty(Object key, Object val) {
        this.properties.put(key, val);
    }

    public ConcurrentMap<Object, Object> getProperties() {
        return properties;
    }

    public static void main(String[] args) {
        // Create a ConcurrentMap to store the properties.
        ConcurrentMap<Object, Object> properties = new ConcurrentHashMap<>();

        // Create a Solution object.
        TestingConCurrentMapOfObjectType solution = new TestingConCurrentMapOfObjectType(properties);

        // Store a Boolean value in the properties.
        solution.setProperty("is_active", true);

        solution.setProperty("is_active", false);


        // Get the Boolean value from the properties.
        Boolean isActive = (Boolean) solution.getProperties().get("is_active");

        // Print the Boolean value.
        System.out.println(isActive);
    }
}
