import time
import sys
value = 1000
sys.setrecursionlimit(value+10)
start_time = time.time()
def nested_loops_count(n):
    if n>=1:
        n -= 1
        nested_loops_count(n)
    else:
        global difference
        end_time =  time.time()
        difference = end_time - start_time
    return difference

def calculate_avg_difference(n):
    total_time = 0
    for i in range(n):
        diff = nested_loops_count(value)
        total_time += diff
    return (total_time/n)

print(calculate_avg_difference(1000))


