# SimpleKotlin_Projects
Short Kotlin Projects with Sololearn

-------------------------------------------------------------------------------------------------------------------------------------------------
#1 
Water Consumption

Each day a family consumes 15 liters of water.
Given the number of years as input, you need to calculate and output the amount of water consumed in that period.

Sample Input
5

Sample Output
27375

The water consumption in 5 years would be: 5*365*15 = 27375
Use 365 as the number of days in a year.


------------------------------------------------------------------------------------------------------------------------------------------------------  
  #2
  Parking Fee

You are making a car parking software that needs to calculate and output the amount due based on the number of hours the car was parked.
The fee is calculated based on the following price structure:
- the first 5 hours are billed at $1 per hour.
- after that, each hour is billed at $0.5 per hour.
- for each 24 hours, there is a flat fee of $15.

This means, that, for example, if a car parked for 26 hours, the bill should be 15+(2*0.5) = 16.0, because it was parked for 24 hours plus 2 additional hours.

Sample Input:
8

Sample Output:
6.5

Explanation: The first 5 hours are billed at $1/hour, which results in $5. After that, the next 3 hours are billed at $0.5/hour = $1.5.
So, the total would be $5+$1.5 = $6.5
The output should be a Double, even if the amount is a round number.
  
  
 ---------------------------------------------------------------------------------------------------------------------------------------------------------------
  #3
Shipping calcuator
  -------------------

You are working on a eCommerce website and need to make a shipping cost calculator based on the order amount.
The store uses the following cost structure:
For orders in the US:
- $75+ orders have free shipping
- orders less than $75 have a shipping fee of 10% of the total order amount.

For international orders, there is a 15% shipping fee, with a maximum of $50. This means that the maximum shipping fee for an international order is $50.

You need to complete the given shippingCost() function, which takes the order amount and a Boolean indicating whether the order is international or not, and returns the shipping cost for that order.
The return amount should be a Double.

Sample Input:
140.0
true

Sample Output:
21.0
The order is for $140 and is international. So, the shipping cost would be 15%, which is $21.
  
  ------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #4
 Music Player

You are building a Music Player app.
You need to implement the MusicPlayer class, which should hold the track names as Strings in an array. The array is already defined in the given code.
The player should support the following functions:
add: add the given argument track to the tracks array.
show: output all track names in the player on separate lines.
play: start playing the first track by outputting "Playing name" where name is the first track name.

You can add a new item to an array using +=, for example: tracks += track
The code in main takes track names from user input and calls the player functions. Do not modify the code in main.
