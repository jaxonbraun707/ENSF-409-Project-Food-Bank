package edu.ucalgary.ensf409;
import java.util.*;

public class Order{
    private ArrayList<Hamper> hampers;
    private static boolean orderFormCreated;
    public Order(){
        this.hampers=new ArrayList<Hamper>();
        this.sorderFormCreated=false;


    }
    public void addNewHamper(){
        hampers.add(new Hamper());

    }
    public ArrayList<Hamper> getHampers(){
        return this.hampers;
    }
    public void setOrderFormStatus(boolean status){
        this.orderFormCreated=status;
    }
    public void calculateFoodDistribution(AvailableFood availableFood){

    }
    public void createOrderForm(){
        OrderForm a=new OrderForm(this.hampers);
        this.orderFormCreated=true;
    }




}