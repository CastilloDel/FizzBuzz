# frozen_string_literal: true


RSpec.describe Fizzbuzz do
  it "doesn't change normal numbers" do
    expect(Fizzbuzz.get(1)).to eq("1")
  end
end
