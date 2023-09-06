#include <bits/stdc++.h>
using namespace std;

pair<long long, long long> getMinMax(long long a[], int n)
{
    sort(a, a + n);
    return {a[0], a[n - 1]};
}

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        long long a[n];
        for (int i = 0; i < n; i++)
            cin >> a[i];
        pair<long long, long long> pp = getMinMax(a, n);
        cout << pp.first << " " << pp.second << endl;
    }
    return 0;
}