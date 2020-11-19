number = rand(1..10)
guess = nil
puts "A random number from 1 to 10 has been generated"
loop do
    puts "Type in a guess: "
    guess = read_line.chomp.to_i {0}
    if guess == 0
        puts "Invalid"
    else
        if guess < number
            puts "Higher"
        elsif guess > number
                puts "Lower"
            else
                puts "You got it!"
                break
        end
    end
end