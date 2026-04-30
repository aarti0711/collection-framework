"# collection-framework" 
# Java Collections Framework — Programs
## About

This repository contains Java programs demonstrating every major interface and class in the **Java Collections Framework (JCF)**. Each file is self-contained and focuses on one collection type, with comments explaining the key methods and use cases.

Ideal for:
- Students learning Java data structures
- Interview preparation
- Quick reference while working on Java projects

---

## Topics covered

| # | File | Collection | Interface |
|---|------|-----------|-----------|
| 1 | `ArrayListDemo.java` | `ArrayList` | `List` |
| 2 | `LinkedListDemo.java` | `LinkedList` | `List`, `Deque` |
| 3 | `SetDemo.java` | `HashSet`, `LinkedHashSet`, `TreeSet` | `Set` |
| 4 | `MapDemo.java` | `HashMap`, `LinkedHashMap`, `TreeMap` | `Map` |
| 5 | `PriorityQueueDemo.java` | `PriorityQueue` | `Queue` |
| 6 | `ArrayDequeDemo.java` | `ArrayDeque` | `Deque` |
| 7 | `CollectionsUtilDemo.java` | `Collections` utility class | — |

---

## Project structure

```
java-collections/
├── src/
│   ├── ArrayListDemo.java
│   ├── LinkedListDemo.java
│   ├── SetDemo.java
│   ├── MapDemo.java
│   ├── PriorityQueueDemo.java
│   ├── ArrayDequeDemo.java
│   └── CollectionsUtilDemo.java
├── README.md
└── LICENSE
```

---

## Requirements

- **Java 8** or higher (Java 17+ recommended)
- No external libraries or build tools needed — pure Java

Check your version:
```bash
java -version
```

---

## How to run

### Clone the repository

```bash
git clone https://github.com/your-username/java-collections.git
cd java-collections/src
```

### Compile and run any file

```bash
# Example: ArrayList
javac ArrayListDemo.java
java ArrayListDemo

# Example: HashMap
javac MapDemo.java
java MapDemo

# Example: PriorityQueue
javac PriorityQueueDemo.java
java PriorityQueueDemo
```

### Run all files at once

```bash
javac *.java
for f in *Demo; do echo "--- $f ---"; java $f; done
```

---

## Quick comparison

| Collection | Ordering | Duplicates | Null allowed | Thread-safe | Best use case |
|---|---|---|---|---|---|
| `ArrayList` | Insertion order | ✅ Yes | ✅ Yes | ❌ No | Fast random access by index |
| `LinkedList` | Insertion order | ✅ Yes | ✅ Yes | ❌ No | Frequent insertions/deletions |
| `HashSet` | No order | ❌ No | 1 null | ❌ No | Fast lookup, unique elements |
| `LinkedHashSet` | Insertion order | ❌ No | 1 null | ❌ No | Unique + preserve insert order |
| `TreeSet` | Sorted (natural) | ❌ No | ❌ No | ❌ No | Sorted unique elements |
| `HashMap` | No order | Keys: ❌ No | 1 null key | ❌ No | General-purpose key-value store |
| `LinkedHashMap` | Insertion order | Keys: ❌ No | 1 null key | ❌ No | Key-value + insertion order |
| `TreeMap` | Key sorted | Keys: ❌ No | ❌ No | ❌ No | Sorted map by key |
| `PriorityQueue` | Priority (heap) | ✅ Yes | ❌ No | ❌ No | Always retrieve min/max element |
| `ArrayDeque` | Insertion order | ✅ Yes | ❌ No | ❌ No | Stack or Queue (prefer over `Stack`) |

> **Thread-safe alternatives:** `ConcurrentHashMap`, `CopyOnWriteArrayList`, or wrap with `Collections.synchronizedList()`.

---

## Key concepts cheat sheet

### When to use which List?
- Use **`ArrayList`** when you need fast `get(index)` and mostly add to the end
- Use **`LinkedList`** when you frequently add/remove from the middle or use it as a queue/stack

### When to use which Set?
- Use **`HashSet`** when order doesn't matter and you just need uniqueness
- Use **`LinkedHashSet`** when you need insertion order preserved
- Use **`TreeSet`** when you need elements sorted automatically

### When to use which Map?
- Use **`HashMap`** for general-purpose key-value storage (fastest)
- Use **`LinkedHashMap`** when you need to iterate in insertion order
- Use **`TreeMap`** when you need keys in sorted order

### Stack and Queue?
- Use **`ArrayDeque`** for both Stack and Queue — it's faster than `Stack` class and more memory-efficient than `LinkedList`
- Use **`PriorityQueue`** when you need the smallest (or largest) element first

---

## Sample output

### ArrayListDemo
```
List: [Apple, Blueberry, Banana, Cherry]
Size: 4
Get index 2: Banana
Sorted: [Blueberry, Cherry]
Contains Cherry: true
```

### MapDemo
```
Map: {Alice=95, Bob=85, Charlie=92}
Get Bob: 85
TreeMap (sorted): {Alice=95, Bob=85, Charlie=92, Dave=88}
Frequency: {java=3, python=2, c++=1}
```

### PriorityQueueDemo
```
Min-heap order: 10 20 30
Max-heap order: 30 20 10
Tasks by priority:
  Task 2 (priority 1)
  Task 3 (priority 3)
  Task 1 (priority 5)
```


---

> Made with Java — feel free to fork, star, and contribute!
