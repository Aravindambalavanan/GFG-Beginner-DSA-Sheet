#include <bits/stdc++.h>
using namespace std;
class Solution
{
  public:
    vector<long long> printFibb(int n)
    {
        vector<long long> ans;
        ans.push_back(1);
        if (n == 1)
            return ans;
        ans.push_back(1);
        if (n == 2)
            return ans;
        for (int i = 2; i < n; i++)
            ans.push_back(ans[i - 1] + ans[i - 2]);
        return ans;
    }
};

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        Solution obj;
        vector<long long> ans = obj.printFibb(n);
        for (long long i : ans)
            cout << i << ' ';
        cout << endl;
    }
    return 0;
}