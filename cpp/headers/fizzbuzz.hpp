#pragma once

#include <string>

using std::string;
using std::to_string;

class FizzBuzz {
  public:
    FizzBuzz(); 
    string get(int number);

  protected:
    virtual bool isFizz(int number);
    virtual bool isBuzz(int number);
};