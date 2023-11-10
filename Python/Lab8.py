#list
players = ["Dino", "Mark", "Emman"]

#append
players.append ("Chaz")
print(players)
print()

#extend
players.extend(["Ellen"])
print(players)
print()

#len()
print("There are " + str(len(players)) + " players")
print()

#Accessing items in the lists
print("The MVP of the game: " + players[1])
print()
print("Most kills: " + players[-2])
print()

#range
print("The players: " + str(players[0:5]))
print()

#Updating list
players[4] = "Francine"
print("Updated players: " + str(players))
print()

#Deleting a list
print(str(players[0] + " has been disqualified!\n"))
del players[0]
print("Players left: " + str(players))
print()

#"+" Operator
newPlayers = ["Renz", "Charlon"]
print("Updated players: " + str(players + newPlayers))