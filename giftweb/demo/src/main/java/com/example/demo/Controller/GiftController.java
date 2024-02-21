package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.GiftModel;
import com.example.demo.Service.GiftService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class GiftController {
    private GiftService giftService;
    
    
    public GiftController(GiftService giftService) {
        this.giftService = giftService;
    }
    @PostMapping("/gift")
    public ResponseEntity<GiftModel> postMethod(@RequestBody GiftModel giftModel) {
        GiftModel g=giftService.saveGift(giftModel);
        if(g!=null){
            return new ResponseEntity<>(g,HttpStatus.ACCEPTED);
        }
        
        return new ResponseEntity<>(g,HttpStatus.NOT_FOUND);
    }
    @GetMapping("/gifts/{id}")
    public ResponseEntity<GiftModel> getById(@PathVariable("id") int id) {
        // giftService.getGiftById(id);
        GiftModel g=giftService.getGiftById(id);
        if(g==null){
            return new ResponseEntity<>(g,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(g,HttpStatus.OK);
    }
    @PutMapping("/gift/{id}")
    public ResponseEntity<GiftModel> updateGift(@PathVariable int id, @RequestBody GiftModel updatedGift) {
        GiftModel existingGift = giftService.getGiftById(id);
        
        if (existingGift == null) {
            return new ResponseEntity<>(existingGift,HttpStatus.NOT_FOUND);
        }
        
        
         else {
            return new ResponseEntity<>(existingGift,HttpStatus.OK);
        }
    }

    @DeleteMapping("/gifts/{id}")
    public ResponseEntity<GiftModel>deleteGift (@PathVariable int id ) {
        if(giftService.deleteGift(id)==true){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        
    }
    
}
