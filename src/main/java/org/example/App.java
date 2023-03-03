package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args, int n)
    {
        System.out.print("Nhập số nguyên n=:");
        for (int i = 1;i<n; i++) {
            for (int j = 1; j < n; j++) {
                if (i + j == n) {
                    System.out.printf("Các cặp số có tổng bằng N là:", i, j);
                } else {
                    System.out.printf("Không có cặp số công lại bằng N");
                }
            }
        }
    }
}
