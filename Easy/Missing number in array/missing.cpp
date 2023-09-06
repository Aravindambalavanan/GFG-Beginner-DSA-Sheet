#include <bits/stdc++.h>
using namespace std;
class Solution
{
  public:
    int missingNumber(vector<int> &array, int n)
    {
        return n * (n + 1) / 2 - accumulate(array.begin(), array.end(), 0);
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
        vector<int> array(n - 1);
        for (int i = 0; i < n - 1; ++i)
            cin >> array[i];
        Solution obj;
        cout << obj.missingNumber(array, n) << "\n";
    }
    return 0;
}