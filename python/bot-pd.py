code = 0
factor = 124675

while 1 == 1:

    print()

    text = input("Please enter for new code > ")

    if text == 'e' :
        break
    if text == 'r' :
        factor = 1
        code = 0

    code += factor * 2

    factor += factor 

    print()

    print("The new code is ", code)

