package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Model.GiftModel;
import com.example.demo.Repository.GiftRepo;

@Service
public class GiftService {
    private GiftRepo giftRepo;
    
    
    public GiftService(GiftRepo giftRepo) {
        this.giftRepo = giftRepo;
    }
    public GiftModel saveGift(GiftModel giftModel){
        return    giftRepo.save(giftModel);
        
    }
    public GiftModel getGiftById(int id){
       return giftRepo.findById(id).orElse(null);

    }
    public GiftModel updateGift(int id, GiftModel updatedGift) {
       
        return giftRepo.save(updatedGift);
    }

    public boolean deleteGift(int id){
        if(this.getGiftById(id)==null){
            return false;
        }
        giftRepo.deleteById(id);
        return true;
    }
}
