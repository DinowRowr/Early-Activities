x = float(input("Enter X: "))
y = float(input("Enter Y: "))

if x > 0 and y > 0:
    print("Your X and Y are in quadrant 1!")

elif x < 0 and y > 0:
    print("Your X and Y are in quadrant 2!")

elif x < 0 and y < 0:
    print("Your X and Y are in quadrant 3!")

elif x > 0 and y < 0:
    print("Your X and Y are in quadrant 4!")

elif x == 0 and y == 0:
    print("Your X and Y are in Origin!")
