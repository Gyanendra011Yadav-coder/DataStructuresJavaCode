package FirstPhaseLearning.TestingNewThings;


import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-06-27,Jun,2023
 * in Project: DataStructuresJavaCode
 */
public class MainClassToTest {
    public static void main(String[] args) {
        int playerId=1;
        TestingMaps testingMap=new TestingMaps();

        Map<Integer, Boolean> map2=new HashMap<Integer, Boolean>();
        map2.put(playerId,true);
        testingMap.setLeaveGameRequests(map2);

        Boolean leaveGameMode = null;
        leaveGameMode=testingMap.getLeaveGameRequests().get(playerId);

        Map<Integer, Boolean> leaveGameRequests =testingMap.getLeaveGameRequests();
        if(leaveGameRequests!=null && leaveGameRequests.size()>0) {
            for (Map.Entry<Integer, Boolean> entry : leaveGameRequests.entrySet()) {
                System.out.println("Key: " + String.valueOf(entry.getKey()) + ", Value: " + entry.getValue());
            }
        }else{
            System.out.println("Getting map as empty...");
        }

    }

}
