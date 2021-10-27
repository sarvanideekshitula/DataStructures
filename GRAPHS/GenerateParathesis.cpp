class Solution {
public:
   
    vector<string> generateParenthesis(int n) {
        vector<string> ans;
        queue<string> q;
        queue<pair<int, int>> q1;
        q.push("(");
        int open = 1;
        int close = 0;
        q1.push(make_pair(open, close));
        while(!q.empty()){
            string str = q.front();
            pair<int, int> p = q1.front();
            q.pop();
            q1.pop();
            if(p.first == n && p.second == n){
                ans.push_back(str);
            }
            else if(p.first == n and p.second < n){
                q.push(str+')');
                q1.push(make_pair(p.first, p.second+1));
            } 
            else if(p.first < n && p.second < n){
                if(p.first+1 <= n){
                    q.push(str+'(');
                    q1.push(make_pair(p.first+1, p.second));
                }
                if(p.second+1 <= n && p.second+1 <= p.first){
                    q.push(str+')');
                    q1.push(make_pair(p.first, p.second+1));
                }
            }
        }
        return ans;
    }
};
