# Count Frequency of each element in an array

# Approach 1
![countfreq-twoLoops](https://user-images.githubusercontent.com/70484186/188320600-58fa9e97-9dde-414e-aed4-24d9a1c73ca6.jpg)


```
//using two for loop

void countfreq(int arr[],int n){
vector<bool> visited(n,false);
for(int i=0;i<n;i++){
    if(visited[i]==true)
        continue;
    
    int c=1;
    for(int j=i+1;j<n;j++){
        if(arr[i]==arr[j]){
            visited[j]=true;
            c++;
        }
    }
    cout<<arr[i]<<" "<<c;
}
}
```



# Approach 2

unordered_map<int,int> m;
int n;
cin>>n;
for(int i=0;i<n;i++){
int a;
cin>>a;
m[a]++;
}
for(auto it:m)
cout<<it.first<<" "<<it.second<<endl;
