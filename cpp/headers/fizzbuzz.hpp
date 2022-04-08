#pragma once

#include <string>

using std::string;
using std::to_string;

class FizzBuzz {
  public:
    virtual ~FizzBuzz();
    string get(int number);

  protected:
    virtual bool isFizz(int number);
    virtual bool isBuzz(int number);
    void addFizz(int number, string& result);
    void addBuzz(int number, string& result);
};