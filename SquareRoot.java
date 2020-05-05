#include<iostream>
using namespace std;

int main() {
	int n;
    cin>>n;
      int i=1,r=1;
    
    if((n>=0) && (n<=100000000))
        
    {
      if((n==0) || (n==1))
      {
          cout<<n;
      }
        
          
            while(n>=r)
            {
                i++;
                r=i*i;
            }
        cout<<i-1;
           
        
                
            
    }
	
}
