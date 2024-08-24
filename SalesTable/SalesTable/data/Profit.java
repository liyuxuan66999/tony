package SalesTable.data;

public class Profit {
    private double sales;
    private double cost;

    public Profit(){
        this.sales = 0;
        this.cost = 0;
    }
    public Profit(double sales, double cost){
        this.cost = cost;
        this.sales = sales;
    }
    public double getSales(){
        return this.sales;
    } 
    public double getCost(){
        return this.cost;
    }
    public void setSales(double sales){
        this.sales = sales;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
}
