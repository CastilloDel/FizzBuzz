const std = @import("std");
const fizzbuzz = @import("fizzbuzz.zig");

pub fn main() anyerror!void {
    std.debug.print("{s}", .{fizzbuzz.get_fizzbuzz(1)});
}

test "basic test" {
    try std.testing.expectEqual(10, 3 + 7);
}
