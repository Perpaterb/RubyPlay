number = rand(1..10)
guess = 0
puts "A random number from 1 to 10 has been generated"
while true
    puts "Type in a guess: "
    guess = gets.chomp.to_i
    if guess == 0
        puts "Invalid"
    end
    if guess < number
        puts "Higher"
    end
    if guess > number
        puts "Lower"
    end
    if guess == number
        puts "You got it!"
        break
    end
end
