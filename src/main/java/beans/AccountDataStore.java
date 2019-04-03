package beans;

import java.util.Hashtable;

public class AccountDataStore {
    private Hashtable<String, AccountSummery> accountStore = new Hashtable<String, AccountSummery>();
    private AccountSummery objAccountSummery;
    private int cashAccountID;
    private String CashACcountName;
    private double CashAccountBalance;
    private double CashAccountSummery;

    private static AccountDataStore self;

    public static AccountDataStore getSharedInstance() {
        if (self == null)
            self = new AccountDataStore();

        return self;
    }



    public void processCashAccountResponse(CashAccount cashAccount) {

                    AccountSummery  objAccountSummery = new AccountSummery(cashAccount.getCashAcntId());
                    
                    objAccountSummery.setBalance(cashAccount.getBalance());
                    objAccountSummery.setBlkAmt(cashAccount.getBlkAmt());
                    objAccountSummery.setReceivable(cashAccount.getReceivable());
                    objAccountSummery.setCashForWith(cashAccount.getCashForWith());
                    objAccountSummery.setCurr(cashAccount.getCurr());
                    objAccountSummery.setBuyPwr(cashAccount.getBuyPwr());
                    objAccountSummery.setTradingLimit(cashAccount.getTradingLimit());
                    objAccountSummery.setOpenBuyBlock(cashAccount.getOpenBuyBlock());
                    objAccountSummery.setPayAmt(cashAccount.getPayAmt());
                    objAccountSummery.setPenSet(cashAccount.getPenSet());
                    objAccountSummery.setOdLmt(cashAccount.getOdLmt());
                    objAccountSummery.setMarLmt(cashAccount.getMarLmt());
                    objAccountSummery.setUnrealSales(cashAccount.getUnrealSales());
                    objAccountSummery.setMarBlk(cashAccount.getMarBlk());
                    objAccountSummery.setMarDue(cashAccount.getMarDue());
                    objAccountSummery.setMar(cashAccount.isMar());
                    objAccountSummery.setCashAmt(cashAccount.getCashAmt());
                    objAccountSummery.setGroupBuyingPower(cashAccount.getGroupBuyingPower());
                    objAccountSummery.setOtherBlk(cashAccount.getOtherBlk());

                    accountStore.put(cashAccount.getCashAcntId(), objAccountSummery);

            }

}
