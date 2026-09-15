package de.robv.android.xposed;

/** Causentry compile-time stub (legacy Xposed API). Not packaged. */
public abstract class XC_MethodReplacement extends XC_MethodHook {

    public static final XC_MethodReplacement DO_NOTHING = new XC_MethodReplacement() {
        @Override
        protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
            return null;
        }
    };

    public XC_MethodReplacement() {
    }

    protected abstract Object replaceHookedMethod(MethodHookParam param) throws Throwable;

    @Override
    protected final void beforeHookedMethod(MethodHookParam param) throws Throwable {
        param.setResult(replaceHookedMethod(param));
    }

    public static XC_MethodReplacement returnConstant(final Object result) {
        return new XC_MethodReplacement() {
            @Override
            protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                return result;
            }
        };
    }

    public static XC_MethodReplacement returnNull() {
        return returnConstant(null);
    }

    public static XC_MethodReplacement doNothing() {
        return DO_NOTHING;
    }
}
