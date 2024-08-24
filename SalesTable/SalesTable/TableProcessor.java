package SalesTable;

import java.util.*;
import SalesTable.data.Profit;
import SalesTable.data.StatsType;

public class TableProcessor {
    HashMap<String, Profit> hm;
    TableProcessor(){
        hm = new HashMap<>();
    }

    public void createTable(String[][] records){
        for(String[] record:records){
            String prodId = record[0];
            String state = record[3];
            double sales = Double.parseDouble(record[1]);
            double cost = Double.parseDouble(record[2]);
            updateProfitNodeByKey(prodId, cost, sales);
            updateProfitNodeByKey(state, cost, sales);
        }
    }
    public double getTotalSales(String key, StatsType type){
        if(!hm.containsKey(key)) return -1;
        Profit prof = hm.get(key);
        switch (type) {
            case SALES:
                return prof.getSales();
            case COST:
                return prof.getCost();
            case PROFIT:
                return prof.getSales()-prof.getCost();
            default:
                return -1;
        }
        
    }
    public void pringTable(){
        for(String key:hm.keySet()){
            System.out.println();
            System.out.print(key+" : ");
            System.out.print("Sales:"+hm.get(key).getSales()+" ");
            System.out.print("Cost:"+hm.get(key).getCost()+" ");
            System.out.println();
        }
    }
    private void updateProfitNodeByKey(String key, double cost, double sales){
        Profit nd = hm.getOrDefault(key, new Profit());
        nd.setCost(nd.getCost()+cost);
        nd.setSales(nd.getSales()+sales);
        hm.put(key, nd);
    }

}
