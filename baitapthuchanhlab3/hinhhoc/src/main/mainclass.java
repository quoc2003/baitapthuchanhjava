package baitapthuchanhlab3.hinhhoc.src.main;

import baitapthuchanhlab3.hinhhoc.src.shapes.hinhchunhat;
import baitapthuchanhlab3.hinhhoc.src.shapes.hinhtron;
import baitapthuchanhlab3.hinhhoc.src.shapes.hinhtru;
import baitapthuchanhlab3.hinhhoc.src.shapes.hinhvuong;

public class mainclass {
    public static void main(String[] args) {
        hinhtron hinhtron = new hinhtron();
        hinhtron.xuatten();
        hinhtron.nhapbankinh();
        hinhtron.tinhchuvi();
        hinhtron.tinhdientich();
        hinhtron.inchuvi();
        hinhtron.indientich();

        hinhtru hinhtru = new hinhtru();
        hinhtru.xuatten();
        hinhtru.nhapchieucao();
        hinhtru.tinhthetich();
        hinhtru.inthetich();

        hinhchunhat hinhchunhat = new hinhchunhat();
        hinhchunhat.xuatten();
        hinhchunhat.nhapchieudai();
        hinhchunhat.nhapchieurong();
        hinhchunhat.tinhchuvi();
        hinhchunhat.tinhdientich();
        hinhchunhat.inchuvi();
        hinhchunhat.indientich();

        hinhvuong hinhvuong = new hinhvuong();
        hinhvuong.xuatten();
        hinhvuong.nhapcanh();
        hinhvuong.tinhchuvi();
        hinhvuong.tinhdientich();
        hinhvuong.inchuvi();
        hinhvuong.indientich();

    }
}
    
