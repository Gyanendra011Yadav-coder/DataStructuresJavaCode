package TestingNewThings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-06-27,Jun,2023
 * in Project: DataStructuresJavaCode
 */
public class TestingMaps {
    Map<Integer, Boolean> leaveGameRequests=new HashMap<>();


    public Map<Integer, Boolean> getLeaveGameRequests() {
        return leaveGameRequests;
    }

    public void setLeaveGameRequests(Map<Integer, Boolean> leaveGameRequests) {
        this.leaveGameRequests = leaveGameRequests;
    }
}
