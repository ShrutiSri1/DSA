class Solution {
    public void setZeroes(int[][] matrix) {
        boolean rflag=false,cflag=false;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==0&&matrix[i][j]==0)
                    rflag=true;
                 if(j==0&&matrix[i][j]==0)
                    cflag=true;
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[0][j]==0||matrix[i][0]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
        if(rflag==true)
        {
            for(int i=0;i<matrix[0].length;i++)
            {
                matrix[0][i]=0;
            }
        }
        if(cflag==true)
        {
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][0]=0;
            }
        }
        
    }
}
