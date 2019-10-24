import math
import os
import random
import re
import sys


def climbingLeaderboard(scores, alice):
    alice_ranks = []
    for alice_score in alice:
        rank = 0
        for i, player_score in enumerate(scores):
            if (player_score > alice_score and i == 0):
                rank += 1
            elif (player_score > alice_score and player_score == scores[i-1]):
                continue
            elif (player_score > alice_score and i != len(scores) -1):
                rank +=1
            elif (i == len(scores) -1 and player_score > alice_score):
                rank +=2
            elif (i == 0 and alice_score > player_score):
                rank = 1
                break
            elif (alice_score > player_score and i != 0):
                rank += 1
                break

        alice_ranks.append(rank)
    return alice_ranks

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
    dashakh = "997 981 957 933 930 927 926 920 916 896 887 874 863 863 858 847 815 809 803 794 789 785 783 778 764 755 751 740 737 730 691 677 652 650 587 585 583 568 546 541 540 538 531 527 506 493 457 435 430 427 422 422 414 404 400 394 387 384 374 371 369 369 368 365 363 337 336 328 325 316 314 306 282 277 230 227 212 199 179 173 171 168 136 125 124 95 92 88 85 70 68 61 60 59 44 43 28 23 13 12 200"
    mozmoz = "12 20 30 32 35 37 63 72 83 85 96 98 98 118 122 125 129 132 140 144 150 164 184 191 194 198 200 220 228 229 229 236 238 246 259 271 276 281 283 287 300 302 306 307 312 318 321 325 341 341 341 344 349 351 354 356 366 369 370 379 380 380 396 405 408 417 423 429 433 435 438 441 442 444 445 445 452 453 465 466 467 468 469 471 475 482 489 491 492 493 498 500 501 504 506 508 523 529 530 539 543 551 552 556 568 569 571 587 591 601 602 606 607 612 614 619 620 623 625 625 627 638 645 653 661 662 669 670 676 684 689 690 709 709 710 716 724 726 730 731 733 737 744 744 747 757 764 765 765 772 773 774 777 787 794 796 797 802 805 811 814 819 819 829 830 841 842 847 857 857 859 860 866 872 879 882 895 900 900 903 905 915 918 918 922 925 927 928 929 931 934 937 955 960 966 974 982 988 996 996"
    scores = dashakh.split(" ")
    scores = [int(i) for i in scores]
    alice = mozmoz.split(" ")
    alice = [int(i) for i in  alice]
    print(alice)
    print(climbingLeaderboard(scores, alice))


#========================================================================
#------------The Cemetery of solutions----------------------------------=
#========================================================================
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



    # # list of dictionaries approach:
    # rank = 1
    # list_of_score_ranks=[]
    # alice_rankz=[]

    # # cursor = 0
    # # while cursor < len(scores):
    # #     list_of_score_ranks.append({scores[cursor]: rank})
    # #     while(cursor < (len(scores)-2) and scores[cursor] == scores[cursor+1]):
    # #         cursor +=1
    # #     rank +=1
    # #     cursor += 1
    # # print(list_of_score_ranks)
    # for alice_score in alice:
    #     cursor = 0
    #     while cursor < len(scores):
    #         list_of_score_ranks.append({scores[cursor]: rank})
    #         while(cursor < (len(scores)-2) and scores[cursor] == scores[cursor+1]):
    #             cursor +=1
    #         rank +=1
    #         cursor += 1



    
    # # iterator
    # score_cursor = iter(scores)
    # alice_cursor = iter(alice)
    # alice_rank = []
    # i = j = 0
    # while i < len(scores):
    #     score_cursor = next(score_cursor)
    #     while j < len(alice):
    #         alice_cursor = alice_cursor
    #     if alice_cursor > score_cursor:
    #         alice_rank.append(1)
    #     elif score_cursor == next(score_cursor):
    #         i +=1
    #     elif ( score_cursor<alice_cursor< next(score_cursor)):
    #         alice_rank.append()


# for index, score in enumerate(scores):
        #     if ((score > alice_score and index > -1 and scores[index-1] == score) or
        #         score == alice_score and score == scores[index-1]):
        #         continue
        #     elif ((score > alice_score and index > -1 and score == scores[index-1]) or 
        #         (score == alice_score and score != scores[index-1]) or
        #             (score > alice_score and index == 0)):
        #             rank += 1
        #     else:
        #         print(len(scores)-1)
        # print(rank)



        # 
    # # iterator
    # score_cursor = iter(scores)
    # alice_cursor = iter(alice)
    # alice_rank = []
    # i = j = 0
    # while i < len(scores):
    #     score_cursor = next(score_cursor)
    #     while j < len(alice):
    #         alice_cursor = alice_cursor
    #     if alice_cursor > score_cursor:
    #         alice_rank.append(1)
    #     elif score_cursor == next(score_cursor):
    #         i +=1
    #     elif ( score_cursor<alice_cursor< next(score_cursor)):
    #         alice_rank.append()