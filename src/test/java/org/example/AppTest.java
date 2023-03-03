package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 Bài tập:
 LINK: https://drive.google.com/drive/folders/1zydCoz7xAo6lL7J2ogBUYN-DSpaxs4RK?usp=sharing
 1. Hãy viết method nhận vào 2 số nguyên, hãy kiểm tra xem hai số này có ước chung hay không? Viết test method.
 2. Hãy viết một method nhận vào một số nguyên, sau đó kiểm tra số này có phải là số nguyên tố không? Viet Test method
 3. Hãy viết một method nhận vào một số nguyên, sau đó liệt kê ra màn hình các cặp số mà có tổng bằng số này.
 Gợi ý: dùng 2 vòng lặp lồng nhau để lần lượt xác định 2 số.
 4. Hãy viết một method nhận vào một số nguyên, hãy tính tổng các số nguyên to nhỏ hơn số này. Viết Test method
 */
public class AppTest 
{

    /**
     * 1. Hãy viết method nhận vào 2 số nguyên, hãy kiểm tra xem hai số này có ước chung hay không? Viết test method.
     */
    public boolean TimUocChung(int a, int b)
    {
        String kq= "";
        for(int i=2; i<=a && i<=b; i++)
        {
            if ( a%i==0 && b%i==0) {
                return true;
            }
        }
        return false;
    }
    @Test
    public void Check_UocChung()
    {
        int a=5;
        int b=6;
        boolean expected=true;
        boolean actual=TimUocChung(a,b);
        assertEquals(expected,actual);
    }
    /**
     *  2. Hãy viết một method nhận vào một số nguyên, sau đó kiểm tra số này có phải là số nguyên tố không? Viet Test method
     */
    public boolean KT_SoNguyenTo(int a)
    {
        for (int i=2;i<=a -1;i++)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;
    }
    @Test
    public void Check_SoNT()
    {
        int a=7;
        boolean expected=true;
        boolean actual = KT_SoNguyenTo(a);
        assertEquals(expected,actual);
    }
    /**
     *  3.Hãy viết một method nhận vào một số nguyên, sau đó liệt kê ra màn hình các cặp số mà có tổng bằng số này.
     */
    public void LietKeTongCacSoBangN(int n)
    {
        for(int i=1;i<n;i++)
        {
            for (int j=1;j<n;j++)
            {
                if(i+j==n)
                {
                    System.out.printf("Các cặp số có tổng bằng N là:",i,j);
                }
                else
                {
                    System.out.printf("Không có cặp số công lại bằng N");
                }
            }
        }
    }
    public int TinhTongNhoHonN(int n)
    {
        int kq;
        for ( int i=0;i<n;i++)
        {
            kq=i++;
        }
        return kq=0;
    }
}
