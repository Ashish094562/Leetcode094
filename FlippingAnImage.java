package com.ashish;

import java.util.Arrays;

class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] ans = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0;j<(image[i].length+1)/2;  j++) {
                int temp = image[i][j]^1;
                image[i][j] = image[i][image[i].length-1-j]^1;
                image[i][image[i].length-1-j] = temp;
            }
        }
        return image;
    }

}
