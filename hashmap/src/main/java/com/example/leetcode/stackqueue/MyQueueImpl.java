package com.example.leetcode.stackqueue;

import java.util.Stack;

/**
 * @author wangpeil
 * 用栈实现队列
 */
public class MyQueueImpl {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        System.out.println(queue.isEmpty());
    }

    static class MyQueue {
        private Stack<Integer> popStack;
        private Stack<Integer> pushStack;

        public MyQueue() {
            popStack = new Stack<>();
            pushStack = new Stack<>();
        }

        public void push(int x) {
            pushStack.push(x);
        }

        public int pop() {
            if (popStack.isEmpty()) {
                if (pushStack.isEmpty()) {
                    throw new IllegalStateException("队列中元素为空");
                } else {
                    while (!pushStack.isEmpty()) {
                        popStack.push(pushStack.pop());
                    }
                }
            }
            return popStack.pop();
        }

        public int peek() {
            if (popStack.isEmpty()) {
                if (pushStack.isEmpty()) {
                    throw new IllegalStateException("队列中元素为空");
                } else {
                    while (!pushStack.isEmpty()) {
                        popStack.push(pushStack.pop());
                    }
                }
            }
            return popStack.peek();
        }

        public boolean isEmpty() {
            return popStack.empty() && pushStack.empty();
        }
    }
}
