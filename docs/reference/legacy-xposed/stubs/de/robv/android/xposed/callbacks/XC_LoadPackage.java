package de.robv.android.xposed.callbacks;

import android.content.pm.ApplicationInfo;

/** Causentry compile-time stub (legacy Xposed API). Not packaged. */
public class XC_LoadPackage {

    public static class LoadPackageParam {
        public String packageName;
        public String processName;
        public ClassLoader classLoader;
        public ApplicationInfo appInfo;
        public boolean isFirstApplication;
        public Object unused; // reserved by framework
    }
}
