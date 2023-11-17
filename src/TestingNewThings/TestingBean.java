//package TestingNewThings;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created By:  Gyanendra_Yadav
// * on 2023-07-26,Jul,2023
// * in Project: DataStructuresJavaCode
// */
//public class TestingBean {
//
//    public static void main(String[] args) {
//
//        SttChipValidationBean sttBean = new SttChipValidationBean();
//
//        List<ChipTypeBean> list=new ArrayList<>();
//        ChipTypeBean chipTypeBean1 =new ChipTypeBean();
//        chipTypeBean1.setType("VIP");
//        chipTypeBean1.setAmt(234);
//        chipTypeBean1.setTicketName("Ticket1");
//        chipTypeBean1.setTktRealValue(677);
//        chipTypeBean1.setTktCount(3);
//
//
//        ChipTypeBean chipTypeBean2 = new ChipTypeBean();
//        chipTypeBean2.setType("TICKET2");
//        chipTypeBean2.setAmt(100);
//        chipTypeBean2.setTicketName("TKT2");
//        chipTypeBean2.setTktRealValue(345);
//        chipTypeBean2.setTktCount(10);
//
//
//        list.add(chipTypeBean1);
//        list.add(chipTypeBean2);
//        Gson gson = new Gson();
//
//        sttBean.setChipType(chipTypeBean1);
//        sttBean.setGameType("STT");
//        sttBean.setBounty(false);
//        sttBean.setBountyAmount(0);
//        sttBean.setSpecificBounty(false);
//
//        String sttValidBean = gson.toJson(sttBean);
//
//        System.out.println(sttValidBean);
//
//
//    }
//
//    public static class ChipTypeBean {
//
//        private String type;
//        private int amt;
//        private String ticketName ;
//        private boolean isConvertable = false;
//        private int tktRealValue = 0;
//        private int tktCount =0;
//
//
//        public String getType() {
//            return type;
//        }
//        public void setType(String type) {
//            this.type = type;
//        }
//        public int getAmt() {
//            return amt;
//        }
//        public void setAmt(int amt) {
//            this.amt = amt;
//        }
//        public String getTicketName() {
//            return ticketName;
//        }
//        public void setTicketName(String ticketName) {
//            this.ticketName = ticketName;
//        }
//        public boolean isConvertable() {
//            return isConvertable;
//        }
//        public void setConvertable(boolean isConvertable) {
//            this.isConvertable = isConvertable;
//        }
//        public int getTktRealValue() {
//            return tktRealValue;
//        }
//        public void setTktRealValue(int tktRealValue) {
//            this.tktRealValue = tktRealValue;
//        }
//        public int getTktCount() {
//            return tktCount;
//        }
//        public void setTktCount(int tktCount) {
//            this.tktCount = tktCount;
//        }
//
//
//
//    }
//
//    public static class SttChipValidationBean {
//        private String gameType;
//        private ChipTypeBean chipType;
//        private boolean isBounty;
//        private boolean isSpecificBounty;
//        private int bountyAmount;
//
//        public String getGameType() {
//            return gameType;
//        }
//
//        public void setGameType(String gameType) {
//            this.gameType = gameType;
//        }
//
//        public ChipTypeBean getChipType() {
//            return chipType;
//        }
//
//        public void setChipType(ChipTypeBean chipType) {
//            this.chipType = chipType;
//        }
//
//        public boolean isBounty() {
//            return isBounty;
//        }
//
//        public void setBounty(boolean bounty) {
//            isBounty = bounty;
//        }
//
//        public boolean isSpecificBounty() {
//            return isSpecificBounty;
//        }
//
//        public void setSpecificBounty(boolean specificBounty) {
//            isSpecificBounty = specificBounty;
//        }
//
//        public int getBountyAmount() {
//            return bountyAmount;
//        }
//
//        public void setBountyAmount(int bountyAmount) {
//            this.bountyAmount = bountyAmount;
//        }
//
//        @Override
//        public String toString() {
//            return "GameEntry{" +
//                    "gameType='" + gameType + '\'' +
//                    ", chipType=" + chipType +
//                    ", isBounty=" + isBounty +
//                    ", isSpecificBounty=" + isSpecificBounty +
//                    ", bountyAmount=" + bountyAmount +
//                    '}';
//        }
//
//    }
//}
