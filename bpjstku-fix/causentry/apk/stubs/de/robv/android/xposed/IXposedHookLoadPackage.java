package de.robv.android.xposed;

import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Causentry compile-time stub for the legacy Xposed API (api-82 surface).
 * The real implementation is provided at runtime by the framework (Vector / LSPosed).
 * These stubs are NOT packaged into the module APK.
 */
public interface IXposedHookLoadPackage {
    void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable;
}
