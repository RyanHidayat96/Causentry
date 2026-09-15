package com.google.android.gms.auth;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class UserRecoverableNotifiedException extends GoogleAuthException {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public UserRecoverableNotifiedException(String str) {
        super(str);
    }

    public UserRecoverableNotifiedException(String str, Throwable th) {
        super(str, th);
    }

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 8548951;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        return i3;
    }
}
