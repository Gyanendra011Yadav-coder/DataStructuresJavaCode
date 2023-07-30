package TestingNewThings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-25,Jul,2023
 * in Project: DataStructuresJavaCode
 */


public class CpGameAccTypeTest {

    public static void main(String[] args) {
        // Create a list to simulate the data returned by CpGameAccTypeUtil.findAccTypeByChipType
        List<CpGameAccType> entryInfoLst = new ArrayList<>();

        // Create dummy CpGameAccType objects and add them to the entryInfoLst
        CpGameAccType entry1 = new CpGameAccType("223456", 1000, "VIP", 50);
        CpGameAccType entry2 = new CpGameAccType("223456", 1000, "TktName2", 75);

        // Add the dummy objects to the list
        entryInfoLst.add(entry1);
        entryInfoLst.add(entry2);

        // Now simulate the behavior of adding the elements to entryInfoList based on the condition
        List<CpGameAccType> entryInfoList = new ArrayList<>();
        String chipType = "223456";

        if (entryInfoLst != null && !entryInfoLst.isEmpty()) {
            for (CpGameAccType entryInfo : entryInfoLst) {
                // Perform any filtering or other operations based on the condition
                if (entryInfo.getChipType().equals(chipType)) {
                    entryInfoList.add(entryInfo);
                }
            }
        }

        // Print the contents of entryInfoList to verify the output
        for (CpGameAccType entryInfo : entryInfoList) {
            System.out.println("Chip Type: " + entryInfo.getChipType());
            System.out.println("Initial Amount: " + entryInfo.getInitialAmount());
            System.out.println("Entry Chip Type: " + entryInfo.getEntryChipType());
            System.out.println("Entry Amount: " + entryInfo.getEntryAmount());
            System.out.println("-------------------");
        }
    }

    public static class CpGameAccType extends AbstractCpGameAccType {

        // Constructors

        /** default constructor */
        public CpGameAccType() {
        }

        /** full constructor */
        public CpGameAccType(String chipType, Integer initialAmount,
                             String entryChipType, Integer entryAmount) {
            super(chipType, initialAmount, entryChipType, entryAmount);
        }


        public CpGameAccType(String chipType, Integer initialAmount,
                             String entryChipType, Integer entryAmount,String remarkswebsite,String remarkstourney) {
            super(chipType, initialAmount, entryChipType, entryAmount,remarkswebsite,remarkstourney);
        }

        public CpGameAccType(String chipType, Integer initialAmount,
                             String entryChipType, Integer entryAmount,String remarkswebsite,String remarkstourney, Integer extraFeature) {
            super(chipType, initialAmount, entryChipType, entryAmount,remarkswebsite,remarkstourney, extraFeature);
        }
    }

    public static class AbstractCpGameAccType {

        // Fields

        private Integer id;
        private String chipType;
        private Integer initialAmount;
        private String entryChipType;
        private Integer entryAmount;
        private String remarkswebsite;
        private String remarkstourney;
        private Integer extraFeature; //0-default; 1-rebuy

        // Constructors
        /** default constructor */
        public AbstractCpGameAccType() {
        }

        /** full constructor */
        public AbstractCpGameAccType(String chipType, Integer initialAmount,
                                     String entryChipType, Integer entryAmount) {
            this.chipType = chipType;
            this.initialAmount = initialAmount;
            this.entryChipType = entryChipType;
            this.entryAmount = entryAmount;
        }
        /** full constructor */
        public AbstractCpGameAccType(String chipType, Integer initialAmount,
                                     String entryChipType, Integer entryAmount,String remarkswebsite,String remarkstourney) {
            this.chipType = chipType;
            this.initialAmount = initialAmount;
            this.entryChipType = entryChipType;
            this.entryAmount = entryAmount;
            this.remarkswebsite = remarkswebsite;
            this.remarkstourney = remarkstourney;
        }

        /** full constructor */
        public AbstractCpGameAccType(String chipType, Integer initialAmount,
                                     String entryChipType, Integer entryAmount,String remarkswebsite,String remarkstourney, Integer extraFeature) {
            this.chipType = chipType;
            this.initialAmount = initialAmount;
            this.entryChipType = entryChipType;
            this.entryAmount = entryAmount;
            this.remarkswebsite = remarkswebsite;
            this.remarkstourney = remarkstourney;
            this.extraFeature = extraFeature;
        }

        // Property accessors

        public Integer getId() {
            return this.id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getChipType() {
            return this.chipType;
        }

        public void setChipType(String chipType) {
            this.chipType = chipType;
        }

        public Integer getInitialAmount() {
            return this.initialAmount;
        }

        public void setInitialAmount(Integer initialAmount) {
            this.initialAmount = initialAmount;
        }

        public String getEntryChipType() {
            return this.entryChipType;
        }

        public void setEntryChipType(String entryChipType) {
            this.entryChipType = entryChipType;
        }

        public Integer getEntryAmount() {
            return this.entryAmount;
        }

        public void setEntryAmount(Integer entryAmount) {
            this.entryAmount = entryAmount;
        }

        public String getRemarkswebsite() {
            return remarkswebsite;
        }

        public void setRemarkswebsite(String remarkswebsite) {
            this.remarkswebsite = remarkswebsite;
        }

        public String getRemarkstourney() {
            return remarkstourney;
        }

        public void setRemarkstourney(String remarkstourney) {
            this.remarkstourney = remarkstourney;
        }

        public void setExtraFeature(Integer extraFeature) {
            this.extraFeature = extraFeature;
        }

        public Integer getExtraFeature() {
            return extraFeature;
        }
    }
}

