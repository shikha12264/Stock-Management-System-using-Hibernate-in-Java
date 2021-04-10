/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class User {
    private int Recieve_No,quantity;
    private String Item_Code , Item_Name, Supplier,Date;
    
    public User(int Recieve_No,String Item_Code,String Item_Name,String Supplier,int quantity,String Date)
    {
        this.Recieve_No = Recieve_No;
        this.Item_Code = Item_Code;
        this.Item_Name = Item_Name;
        this.Supplier = Supplier;
        this.quantity = quantity;     
        this.Date = Date;
    }

    /*User(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }*/
    
    public int getrec() {
        return Recieve_No;
    }
    public String getitc() {
        return Item_Code;
    }
     public String getitn() {
        return Item_Name;
    }
      public String getsup() {
        return Supplier;
    }
       public int getqty() {
        return quantity;
    }
       public String getdate() {
        return Date;
    }
      
}
