package src.generalCoding;/*
ROI
Problem Description
You must be aware of the concept of the stock portfolio. A stock portfolio is a collection of stock(s) that you invest in to make a profit.

Stocks are bought and sold. The selling price minus the buying price is realized profit or loss. In case a stock is not sold yet, if the buying price is more than or less than the current stock market price, then it is termed as unrealized profit or loss, respectively.

Given information in the form of <Quantity of Stock bought, time of purchase, time of sell, array of prices>, calculate the realized P/L 

Constraints
1<= No. Of Stocks (N) <=10^2
and unrealized P/L at the given time.
1<= Price of Stock <= 2*10^4

1<= M <= 365

1 <= Time of Purchase <= Time of Sell <= Length of list

Input
The first line contains an integer N which denotes the number of stocks in the portfolio.

Next N lines contain a space separate tuple of 3 integers which denote < Quantity Bought, Time of Purchase, Time of Sell > for each stock. If the stock has not been sold, the Time of sale will be 0.

The N+1 line contains an integer M which denotes the number of days for which the price of stock is provided

Then the next N lines contain M integers which denote the stock price from time T1 to TM.

The last line will be the time instance at which the P/L needs to be computed.

Output
Print realised P/L on the first line

Print unrealised P/L on the second line

Time Limit (secs)
1

Examples
Example 1

Input

3

10 4 20

10 1 11

100 6 0

22

113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 117

52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73

101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122

5

Output

0

60

Explanation

From input, we know the following

The portfolio contains 3 stocks. Quantity, time of purchase and time of selling is known for each stock
Stock prices of all 3 stocks in the portfolio are given for 22 days
We also know that the first line of the stock prices belongs to the first stock, the second line to the second stock, and so on
We are interested in the P/L position at the end of 5th day
After computation, we know that Stock 3 need not be considered since it was bought on Day 6 and we are computing P/L at the end of Day 5. Stock 1 and Stock 2 have no Sell transaction on or before Day 5. Hence realized profit is zero. Substituting prices i.e. buy price and the current market price at the end of Day 5, we understand that unrealized profit is [ (115 - 113) * 10 + (56 - 52) * 10] = 60. Hence unrealized P/L is 60.

Example 2

Input

3

10 4 20

10 1 11

100 6 0

22

113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 117

52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73

101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122

20

Output

120

1400

Explaination

Till day 20 we have brought all the above listed stocks and only two have been matured that is stock number 1 and 2 therefore the total realized profit is 20 + 100 = 120 and stock number 3 has not been sold therefore the total unrealized profit is 1400.

From input we know the following

Portfolio contains of 3 stocks. Quantity, time of purchase and time of selling is known for each stock
Stock prices of all 3 stocks in portfolio is given for 22 days
We also know that first line of the stock prices belong to first stock, second line to second stock, so on and so forth
We are interested in P/L position at the end of 20th day
After computation, we know that Stock 1, Stock 2 and Stock3 have been bought. Stock 1 and Stock 2 have Sell transaction at day 20 and 11 respectively. Substituting prices i.e. buy price and the market price at their respective sell date we understand he profit is [(115 - 113) * 10 + (62 - 52) * 10] = 120. Hence realized P/L is 120. Stock 3 have no sell transaction on or before Day 20 therefore we realize that the unrealized profit is [ (120 - 106) * 100] = 1400.

Example 3

Input

3

10 4 6

10 1 11

100 6 0

22

113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 117

52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73

101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122

10

Output

-10

490

Explaination

From input we know the following

Portfolio contains of 3 stocks. Quantity, time of purchase and time of selling is known for each stock
Stock prices of all 3 stocks in portfolio is given for 22 days
We also know that first line of the stock prices belong to first stock, second line to second stock, so on and so forth
We are interested in P/L position at the end of 10th day
After computation, we know that Stock 1, Stock 2 and Stock3 have been bought. Stock 1 have Sell transaction at day 6. Substituting prices i.e. buy price and the market price at their respective sell date we understand he profit is [(112 - 113) * 10] = -10. Hence realized P/L is -10. Stock 3 and Stock 2 have no sell transaction on or before Day 10 therefore we realize that the unrealized profit is [ (61 - 52) * 10 + (110 - 106) *100 ] = 490.

  */

import java.util.Scanner;

public class ROICodeVita {

public static int [] CalculatePL(int n,int stock[][],int m,int price[][],int timeInstance)
{
    int rez=0;
    int unrez=0;
    for(int i=0;i<n;i++)
    {
        if(stock[i][2]<=timeInstance && stock[i][2]!=0)
        {
            rez+=(price[i][stock[i][2]-1]-price[i][stock[i][1]-1])*stock[i][0];
        }
        else
        if(stock[i][1]<=timeInstance)
        {
            unrez+=(price[i][timeInstance-1]-price[i][stock[i][1]-1])*stock[i][0];
        }
    }

    return new int[]{rez,unrez};
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//number of stock
        int stocks[][]=new int[n][3];
        for(int i=0;i<n;i++)
        {
            stocks[i][0]=sc.nextInt();//share count bought;
            stocks[i][1]=sc.nextInt();//day of bought;
            stocks[i][2]=sc.nextInt();//day sale;

        }
        int m=sc.nextInt();//number of day of stock price given;
        int prices[][]=new int [n][m];
        for(int i=0;i<n;i++)
        {
            //ith stock price details of m-days
            for(int j=0;j<m;j++)
            {
                prices[i][j]=sc.nextInt();
            }
        }
        int timeInstance=sc.nextInt();
        int ans[]=CalculatePL(n,stocks,m,prices,timeInstance);
        System.out.println(ans[0]+" "+ ans[1]);
    }
}

/*

testcase1:
3
10 4 6
10 1 11
100 6 0
22
113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 117
52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73
101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122
10

o/p: -10 490


testcase2
3
10 4 20
10 1 11
100 6 0
22
113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 117
52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73
101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122
20
o/p:120 1400

testcase3:
3
10 4 20
10 1 11
100 6 0
22
113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 113 115 112 117
52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73
101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122
5
output:0 60
 */



