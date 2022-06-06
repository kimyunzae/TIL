# Data Structures
## What's a data structure
- a named location that can be used to store and organize data
> ex) family tree, a hierarchy of family relationships, arrays 

### Stack
- Stack = LIFO data structure (Last-In First-Out)
- Stores objects into a sort of "vertical tower"
- push() to add to the top
- pop() to remove from the top

```java
    import java.util.Stack;

    public class Main {
        public static void main(String[] args) {
            Stack<String> stack = new Stack<String>();

            stack.push("Minecraft");
            stack.push("Skyrim");
            stack.push("DOOM");
            stack.push("Borderlands");
            stack.push("FFVII");

            stack.pop();
            //stack.pop will always remove the mop most object from stack 
            System.out.println(stack.peek());
            System.out.println(stack.search("Borderlands"));

        }

    }
```

#### Uses of Stacks
- undo/redo features in text editors
- moving back/forward through browser history
- backtracking algorithms (maze, file directories)
- calling functions (call stack)


### Queue
-  Queue = FIFO data structure (First-In First-Out) ex) a line of people
- A collection designed for holding elements prior to processing 
- Linear data structure
- add = enqueue, offer()
- remove = dequeue, poll()

```java
    import java.util.Queue;
    import java.util.LinkedList;

    public class Main {

        public static void main(String[] args) {
            
            Queue<String> queue = new LinkedList<String>();
            
            System.out.println(queue.isEmpty()); 
            //returns boolean type
            
            queue.offer("Karen");
            queue.offer("Chad");
            queue.offer("Steve");
            queue.offer("Harold");
            
            // System.out.println(queue.peek());
            queue.poll();
            queue.poll();
            queue.poll();


            System.out.println(queue);
            System.out.println(queue.isEmpty());
        }

    }

```