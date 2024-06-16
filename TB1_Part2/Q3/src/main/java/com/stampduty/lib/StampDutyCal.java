package com.stampduty.lib;

public class StampDutyCal
{
    private double StampCalcFirstTime(double housePrice)
    {
        double totalTax = 0;
        // price is over £625,000, you cannot claim the FirstTime relief.
        if (housePrice > 625000)
        {
            totalTax = StampCalcSingle(housePrice);
        }
        else
        {
            // no tax up to £425,000
            if (housePrice <= 425000)
            {
                totalTax = 0;
            }
            // 5% tax on the portion from £425,001 to £625,000
            else if (housePrice > 425000 && housePrice <= 625000 )
            {
                totalTax = (housePrice - 425000) * 0.05;
            }
        }
        return totalTax;
    }

    private double StampCalcSingle(double housePrice)
    {
        double totalTax = 0;
        // no tax up to £250,000
        if (housePrice <= 250000)
        {
            totalTax = 0;
        }
        // 5% tax on the portion from £250,001 to £925,000 
        else if (housePrice > 250000 && housePrice <= 925000)
        {
            totalTax = (housePrice - 250000) * 0.05;
        }
        // 10% tax on the portion from £925,000 to £1.5 million 
        else if (housePrice > 925000 && housePrice <= 1500000)
        {
            // 10 % portion
            totalTax = (housePrice - 925000) * 0.1;
            // 5 % portion
            totalTax += (925000 - 250000) * 0.05;
        }
        // 12% tax on the portion above £1.5 million
        else
        {
            // 12 % portion
            totalTax = (housePrice - 1500000) * 0.12;
            // 10 % portion
            totalTax += (1500000 - 925000) * 0.1;
            // 5 % portion
            totalTax += (925000 - 250000) * 0.05;
        }
        return totalTax;
    }

     public double StampCalc(BuyerTypeEnum buyerType, Double housePrice) 
    {
        switch(buyerType)
        {
            case FirstTime:
                return StampCalcFirstTime(housePrice);
            case Single:
                return StampCalcSingle(housePrice);
            case Additional:
                return StampCalcAdditional(housePrice);
            default:
                throw new UnsupportedOperationException();
        }
    }
     
     private double StampCalcAdditional(double housePrice)
    {
        double totalTax = 0;
        // 3% tax
        if (housePrice <= 250000)
        {
            totalTax = housePrice*0.03;
        }
        // 8% tax on the portion from £250,001 to £925,000 
        else if (housePrice > 250000 && housePrice <= 925000)
        {
            //8 % portion
            totalTax = (housePrice - 250000) * 0.08;
            //3 % portion
            totalTax += 250000* 0.03;
        }
        // 13% tax on the portion from £925,000 to £1.5 million 
        else if (housePrice > 925000 && housePrice <= 1500000)
        {
            // 13 % portion
            totalTax = (housePrice - 925000) * 0.13;
            // 8 % portion
            totalTax += (925000 - 250000) * 0.08;
            //3 % portion
            totalTax += 250000* 0.03;
        }
        // 15% tax on the portion above £1.5 million
        else
        {
            // 15 % portion
            totalTax = (housePrice - 1500000) * 0.15;
            // 13 % portion
            totalTax += (1500000 - 925000) * 0.13;
            // 8 % portion
            totalTax += (925000 - 250000) * 0.08;
            //3 % portion
            totalTax += 250000* 0.03;
        }
        return totalTax;
    }
}