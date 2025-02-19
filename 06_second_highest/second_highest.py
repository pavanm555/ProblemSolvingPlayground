
arr = [8,5,2,6,7,14,9,12]

highest = arr[0]
second_highest = arr[0]

for i in arr:
    if i > highest:
        second_highest = highest
        highest = i
    elif i > second_highest:
        second_highest = i

print(f"Highest: {highest}")
print(f"Second Highest: {second_highest}")