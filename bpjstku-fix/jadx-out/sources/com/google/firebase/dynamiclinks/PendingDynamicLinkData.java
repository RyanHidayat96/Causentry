package com.google.firebase.dynamiclinks;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.DynamicLinkUTMParams;
import defpackage.setSensorToBufferTransformMatrix;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class PendingDynamicLinkData {
    private final DynamicLinkData dynamicLinkData;
    private final DynamicLinkUTMParams dynamicLinkUTMParams;

    public PendingDynamicLinkData(DynamicLinkData dynamicLinkData) {
        if (dynamicLinkData == null) {
            this.dynamicLinkData = null;
            this.dynamicLinkUTMParams = null;
        } else {
            if (dynamicLinkData.getClickTimestamp() == 0) {
                dynamicLinkData.setClickTimestamp(DefaultClock.getInstance().currentTimeMillis());
            }
            this.dynamicLinkData = dynamicLinkData;
            this.dynamicLinkUTMParams = new DynamicLinkUTMParams(dynamicLinkData);
        }
    }

    protected PendingDynamicLinkData(String str, int i, long j, Uri uri) {
        DynamicLinkData dynamicLinkData = new DynamicLinkData(null, str, i, j, null, uri);
        this.dynamicLinkData = dynamicLinkData;
        this.dynamicLinkUTMParams = new DynamicLinkUTMParams(dynamicLinkData);
    }

    public Bundle getExtensions() {
        DynamicLinkData dynamicLinkData = this.dynamicLinkData;
        if (dynamicLinkData == null) {
            return new Bundle();
        }
        return dynamicLinkData.getExtensionBundle();
    }

    @Deprecated
    public Uri getLink() {
        String deepLink;
        DynamicLinkData dynamicLinkData = this.dynamicLinkData;
        if (dynamicLinkData == null || (deepLink = dynamicLinkData.getDeepLink()) == null) {
            return null;
        }
        return Uri.parse(deepLink);
    }

    @Deprecated
    public Bundle getUtmParameters() {
        DynamicLinkUTMParams dynamicLinkUTMParams = this.dynamicLinkUTMParams;
        if (dynamicLinkUTMParams == null) {
            return new Bundle();
        }
        return dynamicLinkUTMParams.asBundle();
    }

    @Deprecated
    public int getMinimumAppVersion() {
        DynamicLinkData dynamicLinkData = this.dynamicLinkData;
        if (dynamicLinkData == null) {
            return 0;
        }
        return dynamicLinkData.getMinVersion();
    }

    @Deprecated
    public long getClickTimestamp() {
        DynamicLinkData dynamicLinkData = this.dynamicLinkData;
        if (dynamicLinkData == null) {
            return 0L;
        }
        return dynamicLinkData.getClickTimestamp();
    }

    public Uri getRedirectUrl() {
        DynamicLinkData dynamicLinkData = this.dynamicLinkData;
        if (dynamicLinkData == null) {
            return null;
        }
        return dynamicLinkData.getRedirectUrl();
    }

    @Deprecated
    public Intent getUpdateAppIntent(Context context) {
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        if (setSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList()) != 0) {
            int[] iArr = new int[iIntValue];
            int i = iIntValue - 1;
            iArr[i] = 1;
            Toast.makeText((Context) null, iArr[((iIntValue * i) % 2) - 1], 1).show();
        }
        if (getMinimumAppVersion() == 0) {
            return null;
        }
        try {
            if (context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0).versionCode < getMinimumAppVersion() && getRedirectUrl() != null) {
                return new Intent("android.intent.action.VIEW").setData(getRedirectUrl()).setPackage("com.android.vending");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
