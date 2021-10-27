class Solution {
public:
    int minimumTotal(vector<vector<int>>& triangle) {
        for(int i=1;i<triangle.size();i++){
            for(int j=0;j<triangle[i].size();j++){
                if(j == 0){
                    triangle[i][j] = triangle[i-1][j] + triangle[i][j];
                }
                else if(j == triangle[i].size()-1){
                    triangle[i][j] = triangle[i-1][triangle[i-1].size()-1] + triangle[i][j];
                }
                else{
                    triangle[i][j]=triangle[i][j]+min(triangle[i-1][j],triangle[i-1][j-1]);
                }
            }
        }
        int min = triangle[triangle.size()-1][0];
        for(int i=0;i<triangle[triangle.size()-1].size();i++){
            if(min > triangle[triangle.size()-1][i]){
                min = triangle[triangle.size()-1][i];
            }
        }
        
        return min;
    }
};
