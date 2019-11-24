def reverse_number(number):
    final_int = 0
    while(number > 0.5):
        final_int = (10 * final_int) + (number % 10)
        number = number // 10
    return final_int


def reverse_number_recursive(number):
    return reverse_number_recur(number, 0)

def reverse_number_recur(number, n):
    if (number < 10):
        return number + 10 * n
        
    else:
        return reverse_number_recur(number // 10, (10 * n) + (number % 10))

def arthmtk_rev(number):
    count = 0
    while(number != 0):
        rem = number %10
        number = number // 10
        print(rem)
    

if __name__ == "__main__":
    print(reverse_number(2468))
    print(reverse_number_recursive(13579))
    print(arthmtk_rev(823456789))
