const std = @import("std");
const fizzbuzz = @import("fizzbuzz.zig");

pub fn main() anyerror!void {
    const fizzbuzz_numbers = comptime init: {
        var numbers: [100][]const u8 = undefined;
        for (numbers) |*val, i| {
            val.* = fizzbuzz.get_fizzbuzz(i + 1);
        } 
        break :init numbers;
    };
    for (fizzbuzz_numbers) |n| {
        std.debug.print("{s}\n", .{n});
    }
}
