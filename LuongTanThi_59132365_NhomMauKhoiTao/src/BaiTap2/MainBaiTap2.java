/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Admin
 */
public class MainBaiTap2 {    
    public static void main(String[] args) {
        //Xây dựng 1 chuỗi
        MyStringBuilder mystring = new MyStringBuilder.Builder()
            .addString("Đây là bài tập 2 ")
            .addFloat(10.5f)
            .addBool(true)
            .build();
        
        //In chuỗi đó ra màn hình bằng phương thức toString()
        System.out.println(mystring.toString());
        
        ShapeFactory sf = ShapeFactory.createInstance();
        
        //Vẽ hình tròn
        Shape sp1 = sf.createShape(ShapeType.circle);
        System.out.println(sp1.draw());
        
        //Vẽ hình chữ nhật
        Shape sp2 = sf.createShape(ShapeType.rectangle);
        System.out.println(sp2.draw());
        
        //Vẽ hình tam giác
        Shape sp3 = sf.createShape(ShapeType.triangle);
        System.out.println(sp3.draw()); 
    }             
}