package de.robv.android.xposed;

import java.lang.reflect.Member;

/** Causentry compile-time stub (legacy Xposed API). Not packaged. */
public class XC_MethodHook {

    public static class Unhook {
        public Unhook() {
        }

        public XC_MethodHook getCallback() {
            return null;
        }

        public void unhook() {
        }

        public Member getHookedMethod() {
            return null;
        }
    }

    public static abstract class MethodHookParam {
        public Member method;
        public Object thisObject;
        public Object[] args;
        public MethodHookParam() {
        }

        public Object getResult() {
            return null;
        }

        public void setResult(Object result) {
        }

        public Throwable getThrowable() {
            return null;
        }

        public boolean hasThrowable() {
            return false;
        }

        public void setThrowable(Throwable throwable) {
        }

        public Object getResultOrThrowable() throws Throwable {
            return null;
        }
    }

    public MethodHook() {
    }

    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
    }

    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
    }
}
