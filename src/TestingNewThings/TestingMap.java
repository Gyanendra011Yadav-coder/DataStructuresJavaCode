package TestingNewThings;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-31,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class TestingMap {
    public class UserAccountUtil {
        public static final String CHIP_DUMMY = "dummy";
        public static final String CHIP_REAL = "real";
        public static final String CHIP_PROMO = "promo";
        public static final String CHIP_TB = "TB";

        public static final String CHIP_RCB = "rummy_rcb";
        public static final String CHIP_VIP ="VIP";
        public static final String CHIP_VIP_IB ="VIP_IB";
        public static final String CHIP_VIP_TB ="VIP_TB";
    }


    private static boolean isTicketChip(String chipType) {
        return !chipType.equals(UserAccountUtil.CHIP_VIP) &&
//                !chipType.equals(CpUserAccountUtil.CHIP_FREEROLL) &&
                !chipType.equals(UserAccountUtil.CHIP_REAL) &&
                !chipType.equals(UserAccountUtil.CHIP_PROMO) &&
                !chipType.equals(UserAccountUtil.CHIP_DUMMY);
    }

    public static void main(String[] args) {
        System.out.println(!isTicketChip("TICKET"));
    }
}
