arr = [1, 2, 3, 2, 4, 1, 5]
unique = []

for num in arr:
    if num not in unique:
        unique.append(num)

print("After removing duplicates:", unique)
