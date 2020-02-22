package learn.hanjc.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class MutableInterceptor extends DelegatingIntroductionInterceptor implements Mutable {
    private boolean readonly = false;

    @Override
    public boolean getReadonly() {
        return readonly;
    }

    @Override
    public void setReadonly(boolean readonly) {
        this.readonly = readonly;
    }

//    @Override
//    public Object invoke(MethodInvocation invocation) throws Throwable {
//        if(readonly && invocation.getMethod().getName().startsWith("set")) {
//            throw new UnsupportedOperationException("Object is locked!");
//        }
//        return super.invoke(invocation);
//    }

    @Override
    protected Object doProceed(MethodInvocation mi) throws Throwable {
        if(readonly && mi.getMethod().getName().startsWith("set")) {
            throw new UnsupportedOperationException("Object is locked!");
        }
        return super.doProceed(mi);
    }
}
