Experimenting with concurrency in Java:
Will try to use 3 approaches
1. Multiprocessing: multiple `CPUs` executing concurrently
2. Multitasking: Multiple `Processes` running on one CPU, OS switching between them for them all to run
3. Multithreading: Multiple `Threads` running concurrently for one program, OS switches between them optimally

Multiple `Processes` per `OS`, multiple `Threads` per `Process`

Processes usually don't share memory
Threads can share memory, which can create thread interference and race conditions

My machine has 16GB memory, so can handle 16000 threads