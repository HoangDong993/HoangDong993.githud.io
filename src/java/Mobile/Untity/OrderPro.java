package Mobile.Untity;
// Generated Sep 10, 2020 6:49:23 AM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 * OrderPro generated by hbm2java
 */
public class OrderPro  implements java.io.Serializable {


     private int orderId;
     private ShipType shipType;
     private Users users;
     private Calendar created;
     private Integer totalAmount;
     private String orderDetail;
     private Boolean orderStatus;
     private Set orderDetails = new HashSet(0);

    public OrderPro() {
    }

	
    public OrderPro(int orderId, Calendar created) {
        this.orderId = orderId;
        this.created = created;
    }
    public OrderPro(int orderId, ShipType shipType, Users users, Calendar created, Integer totalAmount, String orderDetail, Boolean orderStatus, Set orderDetails) {
       this.orderId = orderId;
       this.shipType = shipType;
       this.users = users;
       this.created = created;
       this.totalAmount = totalAmount;
       this.orderDetail = orderDetail;
       this.orderStatus = orderStatus;
       this.orderDetails = orderDetails;
    }
   
    public int getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public ShipType getShipType() {
        return this.shipType;
    }
    
    public void setShipType(ShipType shipType) {
        this.shipType = shipType;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public Calendar getCreated() {
        return this.created;
    }
    
    public void setCreated(Calendar created) {
        this.created = created;
    }
    public Integer getTotalAmount() {
        return this.totalAmount;
    }
    
    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }
    public String getOrderDetail() {
        return this.orderDetail;
    }
    
    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }
    public Boolean getOrderStatus() {
        return this.orderStatus;
    }
    
    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }
    public Set getOrderDetails() {
        return this.orderDetails;
    }
    
    public void setOrderDetails(Set orderDetails) {
        this.orderDetails = orderDetails;
    }




}


