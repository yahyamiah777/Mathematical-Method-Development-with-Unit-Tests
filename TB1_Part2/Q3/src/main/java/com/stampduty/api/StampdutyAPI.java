package com.stampduty.api;

import static spark.Spark.*;
import com.stampduty.lib.BuyerTypeEnum;
import com.stampduty.lib.StampDutyCal;
public class StampdutyAPI 
{
    public void Start()
    {
        exception(Exception.class, (e, req, res) -> res.status(500));
        exception(UnsupportedOperationException.class, (e, req, res) -> {
            res.status(501);
        });

        get("/ping/:name", "application/json", (req, res) -> {
            return "Hello " + req.params(":name");
        });

        get("/stampduty/:buyerType/:housePrice", "application/json", (req, res) -> {

            BuyerTypeEnum buyerTypeEnum = BuyerTypeEnum.valueOf(req.params(":buyerType"));
            double housePrice = Double.parseDouble(req.params(":housePrice"));
            
            var stampDutyCal = new StampDutyCal();
            return stampDutyCal.StampCalc(buyerTypeEnum, housePrice);
        });
    }
}