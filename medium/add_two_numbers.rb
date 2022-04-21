# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val = 0, _next = nil)
#         @val = val
#         @next = _next
#     end
# end
# @param {ListNode} l1
# @param {ListNode} l2
# @return {ListNode}

def digits(l)
  l_nums = []
  if l.next.nil? # node1つの時
      l.val.to_i
  else
      current_node = l
      until current_node.next.nil?
          l_nums.unshift(current_node.val)
          current_node = current_node.next
      end
      l_nums.unshift(current_node.val)
      l_nums.join.to_i
  end
end

def add_two_numbers(l1, l2)
  ans = digits(l1) + digits(l2)
  p ans.to_s.chars.reverse.map(&:to_i)
end