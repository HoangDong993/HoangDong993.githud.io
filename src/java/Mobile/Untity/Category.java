package Mobile.Untity;
// Generated Sep 10, 2020 6:49:23 AM by Hibernate Tools 4.3.1



import java.util.HashSet;
import java.util.Set;


public class Category   {


     private int categoryId;
     private String categoryName;
     private Integer priotityCategory;
     private String descriptions;
     private String parentId;
     private Boolean catStatus;
     private Set products = new HashSet(0);

    public Category() {
    }

	
    public Category(int categoryId) {
        this.categoryId = categoryId;
    }
    public Category(int categoryId, String categoryName, Integer priotityCategory, String descriptions, String parentId, Boolean catStatus, Set products) {
       this.categoryId = categoryId;
       this.categoryName = categoryName;
       this.priotityCategory = priotityCategory;
       this.descriptions = descriptions;
       this.parentId = parentId;
       this.catStatus = catStatus;
       this.products = products;
    }
   
    public int getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Integer getPriotityCategory() {
        return this.priotityCategory;
    }
    
    public void setPriotityCategory(Integer priotityCategory) {
        this.priotityCategory = priotityCategory;
    }
    public String getDescriptions() {
        return this.descriptions;
    }
    
    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    public Boolean getCatStatus() {
        return this.catStatus;
    }
    
    public void setCatStatus(Boolean catStatus) {
        this.catStatus = catStatus;
    }
    public Set getProducts() {
        return this.products;
    }
    
    public void setProducts(Set products) {
        this.products = products;
    }




}


