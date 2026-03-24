#include<iostream>
#include<fstream>
using namespace std;
int main()
{
    ifstream my_file("sample.txt");
    if (!my_file.is_open())
    {
        cout<<"error"<<endl;
    }
    else{
        cout<<"file opened"<<endl;
    }
    string line;
    while(!my_file.of())
    {
        getline(my_file,line);
        cout<<line<<endl;
    }
    my_file.close();

}