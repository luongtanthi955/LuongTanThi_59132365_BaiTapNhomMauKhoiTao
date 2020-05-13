/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Admin
 */
public class Triangle extends Shape{
    public Triangle() {
    }

    public Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    
    @Override
    public String draw() {
        brush = brush + "Cọ vẽ";
        paper = paper + "Giấy vẽ";
        frame = frame + "Khuông hình tam giác";
        return "Chuẩn bị: " +brush + ", " + paper + ", " + frame + "\nBắt đầu vẽ hình tam giác\n";
    }
}
