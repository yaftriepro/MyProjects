pwd = input("Enter your password >>")
text = input("Enter the service you want to access >>")
if input('Do you want to access settings? (y/n):') == 'y':

    while 1==1:
        text = input('PCS > ')

        if text == 'help':

            print("""      
    - help 
    - exit
    - set
    - get
        """)

        if text == 'get':
            print('>> Your password has been sent to your email')

        if text == 'set':
            cpwd = input("Enter your current password >>")
            pwd = input('Set your password >>')

        if text == 'exit':
            break        

