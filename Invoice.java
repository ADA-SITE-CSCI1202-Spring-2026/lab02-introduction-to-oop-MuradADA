public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

     public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }

        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public String getpartNumber(){
        return this.partNumber;
    }

    public String getpartDescription(){
        return this.partDescription;
    }

    public int getquantity(){
        return this.quantity;
    }

    public double getpricePerItem(){
        return this.pricePerItem;
    }

    public void setpartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public void setpartDescription(String partDescription){
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }
}
