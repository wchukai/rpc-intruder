package com.wchukai.rpcintruder.service.context;

/**
 * @author chukai
 */
public abstract class InvokeFilter {
    /**
     * @param invokerBody the invokeBody
     * @return result
     */
    public Object invoke(InvokerBody invokerBody) throws Exception {
        return invokerBody.invoke();
    }
}
