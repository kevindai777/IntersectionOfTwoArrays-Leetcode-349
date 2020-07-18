//Objective is to find the intersection of two arrays

let nums1 = [1,2,2,1], nums2 = [2,2]


//O(n) solution using a hashset to store the numbers to be found
//in the other array

let set = new Set(nums1)
    
return [...new Set(nums2.filter(number => set.has(number)))]