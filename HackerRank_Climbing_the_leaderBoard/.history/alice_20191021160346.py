import math
import os
import random
import re
import sys


def climbingLeaderboard(scores, alice):
    # list of dictionaries approach:
    rank = 1
    list_of_score_ranks=[]
    alice_rankz=[]
    cursor = 0

    while cursor < len(scores):
        list_of_score_ranks.append({scores[cursor]: rank})
        while(cursor < (len(scores)-2) and scores[cursor] == scores[cursor+1]):
            cursor +=1
        rank +=1
        cursor += 1
    # print(list_of_score_ranks)
    for alice_score in alice:
        j = 0
        while (j < len(list_of_score_ranks)-1):
            k = list(list_of_score_ranks[j].keys())[0]
            v = list(list_of_score_ranks[j].values())[0]
            k_plus = list(list_of_score_ranks[j+1].keys())[0]
            if(alice_score < k and alice_score< k_plus):
                j+=1
            elif (alice_score == k):
                alice_rankz.append(v)
                j +=1
            elif (alice_score < k and alice_score > k_plus):
                alice_rankz.append(v + 1)
                j+=1
            elif (alice_score < k and j==len(list_of_score_ranks)-1):
                alice_rankz.append(j+1)
                alice_rankz.append(v)
                break
        # alice_rankz.append(len(list_of_score_ranks)+1)
    return alice_rankz





if __name__ == '__main__':
    # fptr = open('input.txt', 'w')

    # scores_count = int(input())

    # scores = list(map(int, input().rstrip().split()))

    # alice_count = int(input())

    # alice = list(map(int, input().rstrip().split()))

    # result = climbingLeaderboard(scores, alice)

    # fptr.write('\n'.join(map(str, result)))
    # fptr.write('\n')

    # fptr.close()
    scores = [100,100,50,40,40,20,10]
    alice = [5,25,50,120]
    print(climbingLeaderboard(scores, alice))




# Complete the climbingLeaderboard function below.
# def climbingLeaderboard(scores, alice):
#     ranks_dict = {}
#     alice_rank=[]
#     # count = 1
#     # j = 0
#     for i in alice:
#         count = 1
#         j = 0
#         while (j < len(scores)):
#             if (scores[j] in ranks_dict and scores[j] > i):
#                 j +=1
#             elif (scores[j] in ranks_dict and scores[j] < i):
#                 j +=1
#             elif(scores[j] not in ranks_dict):
#                 ranks_dict[scores[j]] = count
#                 count +=1
#                 j +=1
#             elif (scores[j] in ranks_dict and scores[j+1]< i<scores[j]):
#                 new_rank = ranks_dict[scores[j]] + 1
#                 alice_rank.append(new_rank)
#                 j += 1
#             elif (scores[j] in ranks_dict and scores[j] == i):
#                 alice_rank.append(ranks_dict[scores[j]])
#                 j+=1
#         if (i not in ranks_dict and i < min(ranks_dict.keys())):
#             ranks_dict[i] = count
#             alice_rank.append(ranks_dict[i])
#         elif (i in ranks_dict):
#             alice_rank.append(ranks_dict[i])
#         elif (i not in ranks_dict):
#             for q in ranks_dict.keys():
#                 if i < q:
#                     break
#             alice_rank.append()
#             alice_rank.append(ranks_dict[i])
            
#         elif (i > max(ranks_dict.keys())):
#             ranks_dict[i] = 1
#             alice_rank.append(1)
#             break
