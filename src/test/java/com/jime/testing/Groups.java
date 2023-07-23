package com.jime.testing;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Groups {

    @BeforeGroups
    void beforeGroups(){
        System.out.println("Running before group");
    }

    @Test(groups = "defects")
    void testDefectA(){
        System.out.println("Testing item A in the backlog");
    }

    @Test(groups = "backlog")
    void testBacklogA(){
        System.out.println("Testing item A in the backlog");
    }
}
