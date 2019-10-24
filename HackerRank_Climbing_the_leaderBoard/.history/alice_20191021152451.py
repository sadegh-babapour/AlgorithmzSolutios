import math
import os
import random
import re
import sys


def climbingLeaderboard(scores, alice):
    # list of dictionaries approach:
    rank = 1
    list_of_score_ranks=[]
    for index, player in enumerate(scores):
        list_of_score_ranks.append({player: rank})
        while(scores[index] == scores[index+1]):
            continue
        rank +=1
    print(list_of_score_ranks)




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
