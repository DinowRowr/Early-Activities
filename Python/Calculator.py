num1 = float(input("Insert number: "))

symbol = input("\nInput a symbol (+,-,*,/): ")

num2 = float(input("\nInsert second number: "))

add = num1 + num2
subtract = num1 - num2
multiply = num1 * num2
divide = num1 / num2

if symbol == "+":
    print("\nThe answer is: \n" + str(add))

elif symbol == "-":
    print("\nThe answer is: \n" + str(subtract))

elif symbol == "*":
    print("\nThe answer is: \n" + str(multiply))

elif symbol == "/":
    print("\nThe answer is: \n" + str(divide))
