// 1) Given a string str with repeated characters, the task is to rearrange the characters in a string
// Such a that no two adjacent characters are same. If it is possible than print YES else print NO.
// Input: str=”GGGG”
// Output: NO
// Input : str=”BBBAA”
// Output: YES

#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    char str='GGGG';
    int len=sizeof(str)/sizeof(char);
    // cout<<sizeof(str);

//   cout<<len;
    
    for(int i=0;i<len;i++)
    {
        
        if(str[i]==str[i+1])
        {
            cout<<"no"<<endl;
        }
        
  }
}