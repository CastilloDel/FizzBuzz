const std = @import("std");
var gpa = std.heap.GeneralPurposeAllocator(.{}){};
const allocator = gpa.allocator();

pub fn get_fizzbuzz(n: usize) ![]u8 {
    return std.fmt.allocPrint(allocator, "{d}", .{n});
}

const testing = std.testing;

test "Should return the passed number in a string" {
    const actual: []const u8 = try get_fizzbuzz(1);
    try testing.expectEqual(actual[0], "1"[0]);
}