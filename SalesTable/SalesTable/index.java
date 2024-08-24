package SalesTable;

import SalesTable.data.StatsType;

public class index {
    public static void main(String[] args){
        /*
         * Sales table has 4 cols prodId, sales, cost, state
            1. total sales of each prod
            2. total sales of each state
            3. total revenue of each prod and state sales-cost
         * 
         */
        String[][] table = {
			{"1", "100.0", "50.0", "CA"},
			{"1", "200.0", "100.0", "NY"},
			{"1", "300.5", "150.0", "NY"},
			{"2", "200.0", "100.0", "FL"},
			{"3", "300.0", "100.0", "MA"},
			{"3", "300.5", "100.0", "MA"},
		};
        TableProcessor tp = new TableProcessor();
        tp.createTable(table);
        tp.pringTable();

        System.out.println(tp.getTotalSales("1", StatsType.PROFIT));
        System.out.println(tp.getTotalSales("MA", StatsType.PROFIT));
    }
}
