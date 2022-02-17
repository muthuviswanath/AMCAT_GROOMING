def is_prime(number):
    factors = 0
    for i in range(1,number+1):
        if number % i == 0:
            factors += 1
    if factors == 2:
        return True
    else:
        return False

number = int(input("Enter a number: "))
result = is_prime(number)
if result == True:
    print(f"Given number {number} is a prime number")
else:
    print(f"Given number {number} is not a prime number")
    
