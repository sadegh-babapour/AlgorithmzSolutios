def isValid(s):
    if len(s) < 2:
        return "YES"
    character_to_count =dict()
    for character in s:
        if character in character_to_count:
            character_to_count[character] += 1
        else:
            character_to_count[character] = 1
    count_set = set(character_to_count.values())
    if len(count_set) > 2:
        return "NO"
    elif len(count_set) == 1:
        return "YES"
    else:
        counts_to_chars =dict()
        for k, v in character_to_count.items():
            if (v in counts_to_chars):
                counts_to_chars[v] +=1
            else:
                counts_to_chars[v] = 1
        v_list = list(counts_to_chars.keys())
        if abs(v_list[0] - v_list[1]) > 1 and min(v_list) != 1:
            return "NO"
        else:
            if (min(v_list)  == 1 and counts_to_chars[min(v_list)] == 1):
                return "YES" 
            elif (min(v_list)  != 1 and counts_to_chars[max(v_list)] == 1):
                return "YES"
            else:
                return "NO"

if __name__ == "__main__":
    print(isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"))