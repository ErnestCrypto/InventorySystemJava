
package inventorysystemjava;


public  class ItemRecord {
    private String itemName;
    private String itemCategory;
    
    public ItemRecord(String itemName,String itemCategory){
        this.itemName = itemName;
        
        this.itemCategory = itemCategory;
        
       
        
    }
    public String getItemName(){
        return itemName;
       
    }
    public void setItemName(String itemName){
        this.itemName = itemName;    
    }
    
    
    
     public String getItemCategory(){
        return itemCategory;
       
    }
    public void setItemCategory(String itemCategory){
        this.itemCategory =itemCategory; 
    }
    
    
    
}
