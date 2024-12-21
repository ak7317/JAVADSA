import java.util.*;
public class twoDarrry {
    
    public static void main(String args[]){
        int mat[][]={{4,7,8},{8,8,7}};
        for(int i=0;i<mat.length;i++){
            int cnt=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==7){
                    cnt++;
                }

            }
            System.out.print(cnt);
        }
    }
}
