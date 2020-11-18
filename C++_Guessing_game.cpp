#include <iostream>
#include <ctime> // Added to get "time" workling in "srand((unsigned int)time(NULL));"
#include <sstream>
#include <string>
#include <cctype>
#include <algorithm>
using namespace std;

int main(){
    // Added to Stop the same number all the time. 
    srand((unsigned int)time(NULL)); 
    std::string UserInput = "";
    int MagicNumber, Guess; 
    MagicNumber = (rand() % 9) + 1;
    cout << "A random number from 1 to 10 has been generated. \nGuess it!! \n";

    do{
        cout << "Type in a guess: ";
        std::getline(std::cin, UserInput);
        UserInput.erase(std::remove_if(UserInput.begin(), 
                                        UserInput.end(), 
                                        [](unsigned char x){return std::isspace(x);}), 
                     UserInput.end());
        std::istringstream(UserInput) >> Guess;
        if (Guess != 0){
            if (Guess > MagicNumber){
                cout << "Lower \n";
            }
            if (Guess < MagicNumber){
                cout << "Higher \n";
            }
        }
        else
        {
            cout << "Invalid Input!! \n";
        }

    } while (MagicNumber != Guess);

    cout << "You got it! \n";
    return 0;    
}