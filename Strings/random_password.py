import random

upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
lower="abcdefghijklmnopqrstuvwxyz"
num="1234567890"
sp=";:,<.>/?'}]{[-_=+)(*&^%$#@!`~"

all=upper+lower+num+sp

print("".join(random.sample(all,8)),end="   ")
tu="".join(random.sample(upper,1))
tu=tu.join(random.sample(lower,3))
yu="".join(random.sample(num,1))
yu=yu.join(random.sample(sp,2))
print(tu+yu)