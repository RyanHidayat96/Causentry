package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import defpackage.MediaControllerCompatApi21;
import defpackage.fromMediaSession;
import defpackage.getVolumeControl;
import defpackage.prepare;
import defpackage.setRepeatMode;
import defpackage.toLegacyStreamType;
import defpackage.validateCustomAction;

/* JADX INFO: loaded from: classes5.dex */
public final class PolystarShape implements toLegacyStreamType {
    public final getVolumeControl TuitionPaymentFragmentbindingInflater1;
    public final getVolumeControl TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaControllerCompatApi21<PointF, PointF> f363a;
    public final getVolumeControl asBinder;
    public final Type asInterface;
    public final getVolumeControl b;
    public final getVolumeControl d;
    public final getVolumeControl g;

    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type b(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, getVolumeControl getvolumecontrol, MediaControllerCompatApi21<PointF, PointF> mediaControllerCompatApi21, getVolumeControl getvolumecontrol2, getVolumeControl getvolumecontrol3, getVolumeControl getvolumecontrol4, getVolumeControl getvolumecontrol5, getVolumeControl getvolumecontrol6, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.asInterface = type;
        this.g = getvolumecontrol;
        this.f363a = mediaControllerCompatApi21;
        this.d = getvolumecontrol2;
        this.b = getvolumecontrol3;
        this.TuitionPaymentFragmentbindingInflater1 = getvolumecontrol4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getvolumecontrol5;
        this.asBinder = getvolumecontrol6;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
    }

    @Override // defpackage.toLegacyStreamType
    public final setRepeatMode TuitionPaymentFragmentspecialinlinedviewModeldefault2(prepare prepareVar, fromMediaSession frommediasession) {
        return new validateCustomAction(prepareVar, frommediasession, this);
    }
}
