package main;

import shapes.hinhchunhat;
import shapes.hinhtron;
import shapes.hinhtru;
import shapes.hinhvuong;

public class mainclass {
    public float chuvi;
    public float dientich;
    public float thetich;
    public static void main(String[] args) {
        hinhtron hinhtron = new hinhtron();
        
        hinhtron.xuatten();
        hinhtron.setbankinh(4);
        hinhtron.tinhchuvi();
        hinhtron.tinhdientich();
        
        hinhtron.inchuvi();
        hinhtron.indientich();
     
        hinhtru hinhtru = new hinhtru(); 
        hinhtru.xuatten();
        hinhtru.setchieucao(6);
        hinhtru.tinhthetich(); 
        hinhtru.inthetich(); 
       
        hinhchunhat hinhchunhat = new hinhchunhat();    
        hinhchunhat.xuatten();
        hinhchunhat.setchieudai(5);
        hinhchunhat.setchieurong(3);
        hinhchunhat.tinhchuvi();
        hinhchunhat.tinhdientich();
        hinhchunhat.inchuvi();
        hinhchunhat.indientich();

        hinhvuong hinhvuong = new hinhvuong();
         
        hinhvuong.xuatten();
        hinhvuong.setcanh(6);
        hinhvuong.tinhchuvi();
        hinhvuong.tinhdientich();
        hinhvuong.inchuvi();
        hinhvuong.indientich();

    }
}