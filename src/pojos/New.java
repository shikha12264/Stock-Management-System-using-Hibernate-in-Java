package pojos;
// Generated Mar 15, 2021 11:53:28 AM by Hibernate Tools 3.6.0



/**
 * New generated by hbm2java
 */
public class New  implements java.io.Serializable {


     private String itemCode;
     private String itemName;
     private String quantity;

    public New() {
    }

    public New(String itemCode, String itemName, String quantity) {
       this.itemCode = itemCode;
       this.itemName = itemName;
       this.quantity = quantity;
    }
   
    public String getItemCode() {
        return this.itemCode;
    }
    
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public String getItemName() {
        return this.itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
      


}


