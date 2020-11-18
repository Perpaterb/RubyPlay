import random
print('A random number from 1 to 10 has been generated')
number = random.randint(1, 10)
while 1:
    try:
        guess = int(input('Type in a guess: '))
    except ValueError:
        print('Invalid')
        continue
    if guess < number:
        print('Higher')
    if guess > number:
        print('lower')
    if guess == number:
        break
print ('You got it!')