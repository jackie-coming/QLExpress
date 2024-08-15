package com.ql.util.express.issue;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author gjx
 */
public class Issue187InEqualitySignTest {
    @Test
    public void test() throws Exception {
        ExpressRunner runner = new ExpressRunner(false, true);
        DefaultContext<String, Object> context = new DefaultContext<>();

        String express = "1 <> 2";
        Object result = runner.execute(express, context, null, true, true);
        System.out.println(result);

    }
    @Test
    public void test1() throws Exception {
        ExpressRunner runner = new ExpressRunner(false, true);
        DefaultContext<String, Object> context = new DefaultContext<>();

        String express = "1+2*3";
        Object result = runner.execute(express, context, null, true, true);
        System.out.println(result);

    }
}