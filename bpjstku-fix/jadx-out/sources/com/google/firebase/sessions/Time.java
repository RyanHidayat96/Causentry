package com.google.firebase.sessions;

import defpackage.CameraController1;
import defpackage.CorrectNegativeLatLongForMediaMuxer;
import defpackage.createImageAnalysis;
import defpackage.isUseCaseEnabled;
import defpackage.startCamera;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes5.dex */
@CorrectNegativeLatLongForMediaMuxer
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B3\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001eH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\"\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0012R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u0012"}, d2 = {"Lcom/google/firebase/sessions/Time;", "", "", "p0", "<init>", "(J)V", "", "p1", "p2", "p3", "LCameraController1;", "p4", "(IJJJLCameraController1;)V", "Lkotlin/time/Duration;", "minus-5sfh64U", "(Lcom/google/firebase/sessions/Time;)J", "minus", "component1", "()J", "copy", "(J)Lcom/google/firebase/sessions/Time;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "LisUseCaseEnabled;", "LcreateImageAnalysis;", "", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/Time;LisUseCaseEnabled;LcreateImageAnalysis;)V", "ms", "J", "getMs", "us", "getUs", "seconds", "getSeconds", "Companion", "$serializer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Time {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long ms;
    private final long seconds;
    private final long us;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/firebase/sessions/Time$Companion;", "", "<init>", "()V", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Lcom/google/firebase/sessions/Time;", "serializer", "()LvideoProfileHdrFormatsToDynamicRangeEncoding;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final videoProfileHdrFormatsToDynamicRangeEncoding<Time> serializer() {
            return Time$$serializer.INSTANCE;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Time(int i, long j, long j2, long j3, CameraController1 cameraController1) {
        if (1 != (i & 1)) {
            startCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, 1, Time$$serializer.INSTANCE.getDescriptor());
        }
        this.ms = j;
        this.us = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.seconds = j / 1000;
        } else {
            this.seconds = j3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(Time p0, isUseCaseEnabled p1, createImageAnalysis p2) {
        p1.encodeLongElement(p2, 0, p0.ms);
        if (p1.shouldEncodeElementDefault(p2, 1) || p0.us != p0.ms * 1000) {
            p1.encodeLongElement(p2, 1, p0.us);
        }
        if (p1.shouldEncodeElementDefault(p2, 2) || p0.seconds != p0.ms / 1000) {
            p1.encodeLongElement(p2, 2, p0.seconds);
        }
    }

    public Time(long j) {
        this.ms = j;
        this.us = j * 1000;
        this.seconds = j / 1000;
    }

    public final long getMs() {
        return this.ms;
    }

    public final long getUs() {
        return this.us;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    /* JADX INFO: renamed from: minus-5sfh64U, reason: not valid java name */
    public final long m8004minus5sfh64U(Time p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Duration.Companion companion = Duration.INSTANCE;
        return DurationKt.toDuration(this.ms - p0.ms, DurationUnit.MILLISECONDS);
    }

    public static /* synthetic */ Time copy$default(Time time, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = time.ms;
        }
        return time.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMs() {
        return this.ms;
    }

    public final Time copy(long p0) {
        return new Time(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof Time) && this.ms == ((Time) p0).ms;
    }

    public final int hashCode() {
        return Long.hashCode(this.ms);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Time(ms=");
        sb.append(this.ms);
        sb.append(')');
        return sb.toString();
    }
}
