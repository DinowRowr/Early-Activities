numList = []
num1 = int(input("Input number: "))
num2 = int(input("Input second number: "))

if num1 < num2:
    for number in range(num1, num2):
        numList.append(number)
    print("Original Number List: ", numList)
    evenList = []
    oddList = []
    for number in range(len(numList)):
        if(numList[number] % 2 == 0):
            evenList.append(numList[number])
        else:
            oddList.append(numList[number])  

    print("Even Numbers List: ", evenList)
    print("Odd Numbers List: ", oddList)  

if num1 > num2:
    for i in range(num2, num1):
        numList.append(i)
    print("Original Number List: ", list(reversed(numList)))
    even = []
    odd = []
    for i in range(len(numList)):
        if(numList[i] % 2 == 0):
            even.append(numList[i])
        else:
            odd.append(numList[i])
    print("Even Numbers List: ", list(reversed(even)))
    print("Odd Numbers List: ", list(reversed(odd)))