package com.example.demo.Model;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GiftModel {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int GiftId;
    private String GiftName;
    private int GiftPrice;
    private String GiftDetails;
    public GiftModel() {
    }
    public GiftModel(int giftId, String giftName, int giftPrice, String giftDetails) {
        GiftId = giftId;
        GiftName = giftName;
        GiftPrice = giftPrice;
        GiftDetails = giftDetails;
    }
    public int getGiftId() {
        return GiftId;
    }
    public void setGiftId(int giftId) {
        GiftId = giftId;
    }
    public String getGiftName() {
        return GiftName;
    }
    public void setGiftName(String giftName) {
        GiftName = giftName;
    }
    public int getGiftPrice() {
        return GiftPrice;
    }
    public void setGiftPrice(int giftPrice) {
        GiftPrice = giftPrice;
    }
    public String getGiftDetails() {
        return GiftDetails;
    }
    public void setGiftDetails(String giftDetails) {
        GiftDetails = giftDetails;
    }
    
}
