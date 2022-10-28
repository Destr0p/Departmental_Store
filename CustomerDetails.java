 public class CustomerDetails implements DoorDelivery,BonusPoints {
         private String customerName;
         private String phoneNumber;
         private String streetName;
         private double billAmount;
         private int distance;
     
     public CustomerDetails(String customerName,String phoneNumber,String streetName,double billAmount,int distance){
        this.customerName=customerName;
        this.phoneNumber=phoneNumber;
        this.streetName=streetName;
        this.billAmount=billAmount;
        this.distance=distance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getStreetName(){
        return this.streetName;
    }
    public void setStreetName(String streetName){
        this.streetName=streetName;
    }
    public double getBillAmount(){
        return this.billAmount;
    }
    public void setBillAmount(double billAmount){
        this.billAmount=billAmount;
    }
    public int getDistance(){
        return this.distance;
    }
    public void setDistance(int distance){
        this.distance=distance;
    }
    	public double calculateBonusPoints() {
    		double billAmount=getBillAmount();
    		if(billAmount>=250){
    		    return billAmount/10;
    		}
    		return 0;
    	}
    
    	public double deliveryCharge() {
    		int distance=getDistance();
   		double deilvery=0;
    		if(distance>=25){
    		    deilvery=8*distance;
    		}else if(distance>=15 && distance<25){
    		    deilvery=5*distance;
    		}else if(distance<15){
    		    deilvery=2*distance;
    		}
    		return deilvery;
    	}
    	
    }
