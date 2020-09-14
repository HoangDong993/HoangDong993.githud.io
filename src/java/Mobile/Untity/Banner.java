package Mobile.Untity;
// Generated Sep 10, 2020 6:49:23 AM by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * Banner generated by hbm2java
 */
public class Banner  implements java.io.Serializable {


     private int bannerId;
     private Images images;
     private String bannerName;
     private String bannerLink;
     private Boolean bannerStatus;

    public Banner() {
    }

	
    public Banner(int bannerId) {
        this.bannerId = bannerId;
    }
    public Banner(int bannerId, Images images, String bannerName, String bannerLink, Boolean bannerStatus) {
       this.bannerId = bannerId;
       this.images = images;
       this.bannerName = bannerName;
       this.bannerLink = bannerLink;
       this.bannerStatus = bannerStatus;
    }
   
    public int getBannerId() {
        return this.bannerId;
    }
    
    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }
    public Images getImages() {
        return this.images;
    }
    
    public void setImages(Images images) {
        this.images = images;
    }
    public String getBannerName() {
        return this.bannerName;
    }
    
    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }
    public String getBannerLink() {
        return this.bannerLink;
    }
    
    public void setBannerLink(String bannerLink) {
        this.bannerLink = bannerLink;
    }
    public Boolean getBannerStatus() {
        return this.bannerStatus;
    }
    
    public void setBannerStatus(Boolean bannerStatus) {
        this.bannerStatus = bannerStatus;
    }




}

