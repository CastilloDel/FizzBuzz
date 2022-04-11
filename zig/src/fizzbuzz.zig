const std = @import("std");
var gpa = std.heap.GeneralPurposeAllocator(.{}){};
const allocator = gpa.allocator();

pub fn get_fizzbuzz(comptime n: usize) []const u8 {
    if (n % 3 == 0) {
        return "Fizz";
    }
    if (n % 5 == 0) {
        return "Buzz";
    }
    return std.fmt.comptimePrint("{}", .{n});
}

const testing = std.testing;

test "Should return the passed number in a string" {
    try testing.expectEqualSlices(u8, get_fizzbuzz(1), "1");
    try testing.expectEqualSlices(u8, get_fizzbuzz(17), "17");
}

test "Should return Fizz is the number is multiple of 3" {
    try testing.expectEqualSlices(u8, get_fizzbuzz(3), "Fizz");
    try testing.expectEqualSlices(u8, get_fizzbuzz(3 * 34), "Fizz");
}

test "Should return Buzz is the number is multiple of 5" {
    try testing.expectEqualSlices(u8, get_fizzbuzz(5), "Buzz");
    try testing.expectEqualSlices(u8, get_fizzbuzz(5 * 34), "Buzz");
}