# Plural
We need a simple function that determines if a plural is needed or not. 
It should take a number, and return true if a plural should be used with that number or false if not. 
This would be useful when printing out a string such as 5 minutes, 14 apples, or 1 sun.

You only need to worry about english grammar rules for this kata, 
where anything that isn't singular (one of something), 
it is plural (not one of something).

All values will be positive integers or floats, or zero.

---

- when I say : zero apples -> is a plural -> return true
- when I say : one apple -> is not a plural -> return false
- when I say: two apples -> is a plural -> return true


- Example:
 ```
 Input --> type: integer --> 0
 Output --> type: boolean --> true
 
 Input --> type: integer --> 1
 Output --> type: boolean --> false
 
 Input --> type: integer --> 2
 Output --> type: boolean --> true
 ```