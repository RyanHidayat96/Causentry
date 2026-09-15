package com.airbnb.lottie.model.content;

import android.content.Context;
import defpackage.fromMediaSession;
import defpackage.getVolumeControl;
import defpackage.isSessionReady;
import defpackage.prepare;
import defpackage.setRepeatMode;
import defpackage.toLegacyStreamType;

/* JADX INFO: loaded from: classes.dex */
public final class ShapeTrimPath implements toLegacyStreamType {
    public static int asBinder;
    public static int asInterface;
    public final boolean TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final getVolumeControl TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final getVolumeControl TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f365a;
    public final getVolumeControl b;

    /* JADX INFO: loaded from: classes4.dex */
    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type b(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i)));
        }
    }

    public ShapeTrimPath(String str, Type type, getVolumeControl getvolumecontrol, getVolumeControl getvolumecontrol2, getVolumeControl getvolumecontrol3, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.f365a = type;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getvolumecontrol;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getvolumecontrol2;
        this.b = getvolumecontrol3;
        this.TuitionPaymentFragmentbindingInflater1 = z;
    }

    @Override // defpackage.toLegacyStreamType
    public final setRepeatMode TuitionPaymentFragmentspecialinlinedviewModeldefault2(prepare prepareVar, fromMediaSession frommediasession) {
        return new isSessionReady(frommediasession, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Trim Path: {start: ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", end: ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", offset: ");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = asInterface;
        int i2 = i % 6997503;
        asInterface = i + 1;
        if (i2 != 0) {
            return asBinder;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
        asBinder = i3;
        return i3;
    }
}
