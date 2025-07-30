#Binary Integer Converter
bin = int(input("Please enter a binary number: "))
dec = 0
power = 0
while (bin >= 1):
    digit = int(bin % 10)
    dec += int(digit*(2**power))
    power += 1
    bin /= 10
print("In decimal: " + str(dec))
