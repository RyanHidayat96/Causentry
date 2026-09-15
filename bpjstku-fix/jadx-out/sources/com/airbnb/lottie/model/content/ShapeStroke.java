package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import defpackage.fromMediaSession;
import defpackage.getPlaybackType;
import defpackage.getSessionToken2Bundle;
import defpackage.getVolumeControl;
import defpackage.prepare;
import defpackage.setRating;
import defpackage.setRepeatMode;
import defpackage.toLegacyStreamType;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ShapeStroke implements toLegacyStreamType {
    public final getPlaybackType TuitionPaymentFragmentbindingInflater1;
    public final List<getVolumeControl> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final LineJoinType TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final getVolumeControl f364a;
    public final float asBinder;
    public final setRating asInterface;
    public final LineCapType b;
    public final getVolumeControl d;
    public final String g;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.model.content.ShapeStroke$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            b = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public final Paint.Join TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            int i = AnonymousClass4.b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public ShapeStroke(String str, getVolumeControl getvolumecontrol, List<getVolumeControl> list, getPlaybackType getplaybacktype, setRating setrating, getVolumeControl getvolumecontrol2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.g = str;
        this.f364a = getvolumecontrol;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list;
        this.TuitionPaymentFragmentbindingInflater1 = getplaybacktype;
        this.asInterface = setrating;
        this.d = getvolumecontrol2;
        this.b = lineCapType;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lineJoinType;
        this.asBinder = f;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
    }

    @Override // defpackage.toLegacyStreamType
    public final setRepeatMode TuitionPaymentFragmentspecialinlinedviewModeldefault2(prepare prepareVar, fromMediaSession frommediasession) {
        return new getSessionToken2Bundle(prepareVar, frommediasession, this);
    }
}
