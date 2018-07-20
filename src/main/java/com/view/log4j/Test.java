package com.view.log4j;

import org.apache.log4j.Logger;

public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Test.class);
        
        logger.info(">>>>开始");
        
        String str = "asd";
        try{
            if(str.length() > 0){
                throw new Exception("这次V中");
            }
        }catch(Exception e){
            logger.error(">>>>错误", e);
        }
        
        logger.info(">>>>结束");
    }
}
