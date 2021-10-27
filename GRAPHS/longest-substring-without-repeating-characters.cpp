class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if(s.size()==0)
            return 0;
        int ptr1 = 0;
        int ptr2 = 1;
        int maxi = 1;
        map<char, int>m;
        m[s[ptr1]]++;
        while(ptr1<s.size() && ptr2 < s.size()){
            if(m[s[ptr2]] == 0){
                m[s[ptr2]]++;
                ptr2++;
            }
            else{
                maxi = max(maxi, ptr2-ptr1);
                while(s[ptr1]!=s[ptr2]){
                    m[s[ptr1]]--;
                    ptr1++;
                }
                ptr1++;
                ptr2++;
                // if(s[ptr1] == s[ptr2]){
                //     ptr1++;
                //     ptr2++;
                // }
                // else{
                //     m.clear();
                //     ptr1 = ptr2;
                //     m[s[ptr1]]++;
                //     ptr2++;
                // }
                
            }
        }
        maxi = max(maxi, ptr2-ptr1);
        return maxi;
    }
};
