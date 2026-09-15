package com.journeyapps.barcodescanner.camera;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class CameraSettings {
    public static int asInterface;
    public static int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f837a = -1;
    public boolean d = false;
    public boolean TuitionPaymentFragmentbindingInflater1 = false;
    public boolean asBinder = false;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    private boolean notify = false;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
    public boolean b = false;
    public FocusMode TuitionPaymentFragmentspecialinlinedviewModeldefault2 = FocusMode.AUTO;

    /* JADX INFO: loaded from: classes5.dex */
    public enum FocusMode {
        AUTO,
        CONTINUOUS,
        INFINITY,
        MACRO
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = g;
        int i2 = i % 5730325;
        g = i + 1;
        if (i2 != 0) {
            return asInterface;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        asInterface = i3;
        return i3;
    }
}
