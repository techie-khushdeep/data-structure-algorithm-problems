**For the following data sets, which sorting algorithms would work well, and which would not?**

**10 floating-point values**: Any of the algorithms except countingsort would work. Insertionsort, selectionsort, and 
bubblesort would be simplest and would probably provide the best performance

**1,000 integers**: Heapsort, quicksort, and mergesort would work well. 
Quicksort would be fastest if the values don't contain too many duplicates and 
are not initially sorted or you use a randomized method for selecting dividing items. 
Countingsort would work if the range of values is limited.

**1,000 names**: Heapsort, quicksort, and mergesort would work well. 
Quicksort would be fastest if the values don't contain too many duplicates and 
are not initially sorted or you use a randomized method for selecting dividing items. 
Countingsort won't work. Making bucketsort work might be difficult. 
Pigeonhole sort might work. For example, you could use 26 buckets to hold names 
beginning with each of the 26 letters in the alphabet. 
Of course, the first letters of names are not evenly distributed, 
so performance might be somewhat limited.

**100,000 integers with values between 0 and 1,000**: Countingsort would work very well. 
Pigeonhole sort and bucketsort would also work well, 
but not as well as countingsort. 
Heapsort, quicksort, and mergesort would work but would be slower

**100,000 integers with values between 0 and 1 billion**: Countingsort would not work very well, 
because it would need to allocate an array with 1 billion entries to hold value counts. 
Pigeonhole sort and bucketsort would work well. 
Heapsort, quicksort, and mergesort would work but would be slower.

**100,000 names**: Countingsort doesn't work with strings. 
Making bucketsort work might be difficult. 
Pigeonhole sort would work if you can find a good way to map names into buckets. 
Heapsort, quicksort, and mergesort would work well, 
with quicksort being the fastest in the expected case.

**1 million floating-point values**: Countingsort doesn't work with floating-point values. 
Pigeonhole sort and bucketsort would work well. 
Heapsort, quicksort, and mergesort would work but would be much slower.

**1 million names**: This is a hard one for the algorithms . Countingsort doesn't work with strings. 
Making pigeonhole sort or bucketsort work with strings could be hard, but would work. 
Heapsort, quicksort, and mergesort would work but would be slow. 
The trees  can also handle this case.

**1 million integers with uniform distribution**: Countingsort might work if the range of values is limited. 
Otherwise, pigeonhole sort or bucketsort would probably be the best choice. 
Heapsort, quicksort, and mergesort would work but would be slow.

**1 million integers with nonuniform distribution**: Countingsort might work if the range of values is limited. 
Pigeonhole sort and bucketsort might have trouble because the distribution is nonuniform. 
Heapsort, quicksort, and mergesort would work but would be slow.