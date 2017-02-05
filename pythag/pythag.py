import sys,math
goAgain = True

#fuction determines if triangle is a pythag triple or not
def pythag_check(side1, side2, hypot):
    if (side1 ** 2) + (side2 ** 2) == hypot ** 2:
        return True
    else:
        return False
def main(goAgain):
    while goAgain == True:
        #Taking in side lengths, converting them to useable floats
        side1 = raw_input("side1: ");side1 = float(side1)
        side2 = raw_input("side2: ");side2 = float(side2)
        side3 = raw_input("side3: ");side3 = float(side3)
        
        #compiling side lengths into list
        sides = [side1, side2, side3]
        #determining hypotenuse, then truncating it from the list
        c = max(sides);sides.remove(max(sides))
        #assigning the remaining side lengths to variables
        a = sides[0]
        b = sides[1]
        
        #your answer
        answer = pythag_check(a,b,c)
        print answer
        
        #go again?
        if raw_input('Another?\n') == 'y':
            goAgain = True
        else:
            goAgain = False
        
        
main(goAgain)