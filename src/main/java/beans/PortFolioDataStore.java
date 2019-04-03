package beans;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class PortFolioDataStore {
    private static Hashtable<Integer, ArrayList<PortfolioRecords>> accountStore = new Hashtable<Integer, ArrayList<PortfolioRecords>>();


    public void processPortfolioResponse(HoldingResponse holdingsdata){
        ArrayList<PortfolioRecords> portfolioSummery = holdingsdata.getHoldings();
        Iterator<PortfolioRecords> itr = portfolioSummery.iterator();
        PortfolioRecords element = null;
        while (itr.hasNext()){
            element = itr.next();

        if (element != null) {
            accountStore.put(element.getTradingAccId(), portfolioSummery);
            }if (accountStore.get(element.getTradingAccId()) == null) {

//            System.out.println(accountStore.get(element.getTradingAccId());
        }

        }
}}
