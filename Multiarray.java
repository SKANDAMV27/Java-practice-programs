
class Multiarray {
    public static void main(String a[]) {
        int num[][] = new int[4][4]; // Changed array size to match expected output
        int i, j;
        int random =0;
        
        for (i = 0; i < 4; i++) { // Loop through rows
            for (j = 0; j < 4; j++) { // Loop through columns
                num[i][j] =(int)(Math.random()*100); 
                System.out.print(num[i][j] + " "); // Print values in the same row
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}