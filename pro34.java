assume the two sets are set1 and set2.

Assume sum of set1 = Sum_of_Set1, with size = size_of_set1. 
Assume sum of set2 = Sum_of_Set2, with size = size_of_set2

SUM_of_Set1 / size_of_set1 = SUM_of_Set2 / size_of_set2
SUM_of_Set1 = SUM_of_Set2 * (size_of_set1 / size_of_set2)
 
total_sum = Sum_of_Set1 + Sum_of_Set2
AND size_of_set2 = total_size - size_of_set1
 
Sum_of_Set1 = (total_sum - Sum_of_Set1) * (size_of_set1 / (total_size - size_of_set1))
OR on simplifying,

total_sum / Sum_of_Set1 - 1 = (total_size - size_of_set1) / size_of_set1
total_sum / Sum_of_Set1 = total_size / size_of_set1
Sum_of_Set1 / size_of_set1 = total_sum / total_size
 

Note that you need the solution with minimum size_of_set1 if multiple solutions exist. 
So, just iterate on size_of_set1. 
Based on size_of_set1, you can determine the value of Sum_of_Set1. 

Then after you can memoise this relation -

isPossible(ind, current_sum, current_size) = 

isPossible(ind + 1, current_sum, current_size)  [ Do not include current element ] 
OR                                                  
isPossible(ind + 1, current_sum - value_at(ind), current_size - 1)

-
?
vector<vector<vector<bool> > > dp;
vector<int> res;
vector<int> real;
int total;
 
bool isPossible(int idx, int sum, int len)
{
    if (len == 0) return (sum == 0);
    if (idx >= total) return false;
 
    if (dp[idx][sum][len] == false) return false;
 
    if (sum >= real[idx])
    {
        res.push_back(real[idx]);
        if (isPossible(idx + 1, sum - real[idx], len - 1)) return true;
        res.pop_back();
    }
     
    if (isPossible(idx + 1, sum, len)) return true;
 
    return dp[idx][sum][len] = false;
}
 
vector<vector<int> > avgset(vector<int> arr) 
{
    sort(arr.begin(), arr.end());
    real.clear();
    real = arr;
    dp.clear();
    res.clear();
 
    int total_sum = 0;
    total = arr.size();
 
    for(int i = 0; i < total; ++i)
        total_sum += arr[i];
     
    dp.resize(real.size(), vector<vector<bool> > (total_sum + 1, vector<bool> (total, true)));
 
    // We need to minimize size_of_set1. So, lets search for the first size_of_set1 which is isPossible. 
    for (int i = 1; i < total; i++)
    {
        // Sum_of_Set1 has to be an integer
        if ((total_sum * i) % total != 0) continue;
        int Sum_of_Set1 = (total_sum * i) / total;
        if (isPossible(0, Sum_of_Set1, i))
        {
            // Ok. Lets find out the elements in arr, not in res, and return the result.
            int ptr1 = 0, ptr2 = 0;
            vector<int> res1 = res;
            vector<int> res2;
            while (ptr1 < arr.size() || ptr2 < res.size())
            {
                if (ptr2 < res.size() && res[ptr2] == arr[ptr1])
                {
                    ptr1++;
                    ptr2++;
                    continue;
                }
                res2.push_back(arr[ptr1]);
                ptr1++;
            }
 
            vector<vector<int> > ans;
            ans.push_back(res1);
            ans.push_back(res2);
            return ans;
        }
    }
 
    vector<vector<int> > ans;
    return ans;
}