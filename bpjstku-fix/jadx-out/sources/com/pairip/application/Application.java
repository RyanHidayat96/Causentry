package com.pairip.application;

import android.content.Context;
import com.bpjstku.base.BpjstkuApplication;
import com.pairip.licensecheck.LicenseClient;

/* JADX INFO: loaded from: classes2.dex */
public class Application extends BpjstkuApplication {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bpjstku.base.BpjstkuApplication, com.nbs.nucleo.presentation.BaseApplication, androidx.multidex.MultiDexApplication, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
