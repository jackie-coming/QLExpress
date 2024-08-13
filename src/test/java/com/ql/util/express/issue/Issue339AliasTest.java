package com.ql.util.express.issue;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import com.ql.util.express.Operator;
import com.ql.util.express.test.DemoShowTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gjx
 */
public class Issue339AliasTest {
    @Test
    public void testInner() throws Exception {
        ExpressRunner runner = new ExpressRunner(false, true);
        DefaultContext<String, Object> context = new DefaultContext<>();
        String express="6/2*2";
        Object result = runner.execute(express, context, null, true, true);
        System.out.println(result);
    }
    @Test
    public void testAlias() throws Exception {
        ExpressRunner runner = new ExpressRunner(false, true);
        DefaultContext<String, Object> context = new DefaultContext<>();
        runner.addOperator("join", new JoinOperator());
        Object r = runner.execute("1join2 join 3", context, null, false, false);
        System.out.println(r);
    }
    @SuppressWarnings({"unchecked", "rawtypes", "serial"})
    public class JoinOperator extends Operator {
        @Override
        public Object executeInner(Object[] list) {
            Object opdata1 = list[0];
            Object opdata2 = list[1];
            if (opdata1 instanceof List) {
                ((List)opdata1).add(opdata2);
                return opdata1;
            } else {
                List result = new ArrayList();
                result.add(opdata1);
                result.add(opdata2);
                return result;
            }
        }
    }
}