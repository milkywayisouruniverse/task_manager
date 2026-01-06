from collections import deque

task_stack = []          # Stack for undo
task_queue = deque()    # Queue for execution

def add_task(task):
    task_stack.append(task)
    task_queue.append(task)
    print(f"Added task: {task}")

def undo_task():
    if task_stack:
        removed = task_stack.pop()
        print(f"Undo task: {removed}")
    else:
        print("No task to undo")

def process_task():
    if task_queue:
        task = task_queue.popleft()
        print(f"Processed task: {task}")
    else:
        print("No task to process")

while True:
    print("\n1. Add Task\n2. Undo Task\n3. Process Task\n4. Exit")
    choice = input("Choose: ")

    if choice == "1":
        add_task(input("Enter task: "))
    elif choice == "2":
        undo_task()
    elif choice == "3":
        process_task()
    elif choice == "4":
        break
    else:
        print("Invalid choice")
