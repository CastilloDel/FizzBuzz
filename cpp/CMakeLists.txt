cmake_minimum_required(VERSION 3.14)
project(fizzbuzz)

set(CMAKE_CXX_STANDARD 17)

include(FetchContent)
FetchContent_Declare(
  googletest
  URL https://github.com/google/googletest/archive/609281088cfefc76f9d0ce82e1ff6c30cc3591e5.zip
)
# For Windows: Prevent overriding the parent project's compiler/linker settings
set(gtest_force_shared_crt ON CACHE BOOL "" FORCE)
FetchContent_MakeAvailable(googletest)

enable_testing()

add_library(
  fizzbuzz
  src/fizzbuzz.cpp
  src/fizzbuzz.hpp
)

add_executable(
  fizzbuzz_test
  test/fizzbuzz_test.cpp
  src/fizzbuzz.hpp
)

target_link_libraries(
  fizzbuzz_test
  fizzbuzz
  gtest_main
)

include(GoogleTest)
gtest_discover_tests(fizzbuzz_test)
