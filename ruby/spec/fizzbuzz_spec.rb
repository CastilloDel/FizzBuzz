# frozen_string_literal: true


RSpec.describe Fizzbuzz do
  it "doesn't change normal numbers" do
    expect(Fizzbuzz.get(1)).to eq("1")
    expect(Fizzbuzz.get(13)).to eq("13")
  end
end
