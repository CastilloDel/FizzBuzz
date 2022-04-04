# frozen_string_literal: true


RSpec.describe Fizzbuzz do
  it "doesn't change normal numbers" do
    expect(Fizzbuzz.get(1)).to eq("1")
    expect(Fizzbuzz.get(13)).to eq("13")
  end

  it "returns Fizz if number is multiple of 3" do
    expect(Fizzbuzz.get(3)).to eq("Fizz")
    expect(Fizzbuzz.get(66)).to eq("Fizz")
  end

  it "returns Buzz if number is multiple of 5" do
    expect(Fizzbuzz.get(5)).to eq("Buzz")
    expect(Fizzbuzz.get(50)).to eq("Buzz")
  end
end
