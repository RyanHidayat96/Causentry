package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u001aJ\u0017\u0010\u0013\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u001cJ'\u0010\u0013\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0013\u0010\u001dJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u001fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0017\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"LlambdatryToComplete0;", "LanimateToFullOpacity;", "LSurfaceViewImplementationExternalSyntheticLambda1;", "p0", "p1", "", "Lr8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw;", "p2", "", "p3", "<init>", "(LSurfaceViewImplementationExternalSyntheticLambda1;LanimateToFullOpacity;Ljava/util/Map;Ljava/lang/String;)V", "", "LSurfaceViewImplementationApi24Impl;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LSurfaceViewImplementationExternalSyntheticLambda1;Z)LSurfaceViewImplementationApi24Impl;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LSurfaceViewImplementationExternalSyntheticLambda1;LSurfaceViewImplementationExternalSyntheticLambda1;)V", "TuitionPaymentFragmentbindingInflater1", "(LSurfaceViewImplementationExternalSyntheticLambda1;Z)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "b", "(LSurfaceViewImplementationExternalSyntheticLambda1;)Ljava/util/List;", "LlambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper;", "(LSurfaceViewImplementationExternalSyntheticLambda1;)LlambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper;", "LorientationToSurfaceRotation;", "(LSurfaceViewImplementationExternalSyntheticLambda1;)LorientationToSurfaceRotation;", "(LSurfaceViewImplementationExternalSyntheticLambda1;ZZ)LorientationToSurfaceRotation;", "LtryToComplete;", "(LSurfaceViewImplementationExternalSyntheticLambda1;)LtryToComplete;", "Ljava/lang/String;", "a", "Ljava/util/Map;", "asBinder", "LanimateToFullOpacity;", "asInterface", "LSurfaceViewImplementationExternalSyntheticLambda1;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class lambdatryToComplete0 extends animateToFullOpacity {
    private static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
    private static final SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<SurfaceViewImplementationExternalSyntheticLambda1, r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final animateToFullOpacity b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentbindingInflater1;

    public lambdatryToComplete0(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, animateToFullOpacity animatetofullopacity, Map<SurfaceViewImplementationExternalSyntheticLambda1, r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw> map, String str) {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(animatetofullopacity, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceViewImplementationExternalSyntheticLambda1;
        this.b = animatetofullopacity;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = map;
        this.TuitionPaymentFragmentbindingInflater1 = str;
    }

    @Override // defpackage.animateToFullOpacity
    public final orientationToSurfaceRotation TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1 p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.animateToFullOpacity
    public final orientationToSurfaceRotation TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1 p0, boolean p1, boolean p2) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        throw new IOException("zip entries are not writable");
    }

    @Override // defpackage.animateToFullOpacity
    public final SurfaceViewImplementationApi24Impl TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 p0, boolean p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.animateToFullOpacity
    public final SurfaceViewImplementationApi24Impl TuitionPaymentFragmentspecialinlinedviewModeldefault1(SurfaceViewImplementationExternalSyntheticLambda1 p0, boolean p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.animateToFullOpacity
    public final void TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1 p0, boolean p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.animateToFullOpacity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 p0, SurfaceViewImplementationExternalSyntheticLambda1 p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.animateToFullOpacity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementationExternalSyntheticLambda1 p0, boolean p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        throw new IOException("zip file systems are read-only");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"LlambdatryToComplete0$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "LSurfaceViewImplementationExternalSyntheticLambda1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LSurfaceViewImplementationExternalSyntheticLambda1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        SurfaceViewImplementationExternalSyntheticLambda1.Companion companion = SurfaceViewImplementationExternalSyntheticLambda1.INSTANCE;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = SurfaceViewImplementationExternalSyntheticLambda1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("/");
    }

    @Override // defpackage.animateToFullOpacity
    public final List<SurfaceViewImplementationExternalSyntheticLambda1> b(SurfaceViewImplementationExternalSyntheticLambda1 p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNullParameter(p0, "");
        r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw r8lambdahcn9bxmal9aalzj1mxukgx6yonw = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, p0, true));
        if (r8lambdahcn9bxmal9aalzj1mxukgx6yonw == null) {
            throw new IOException("not a directory: ".concat(String.valueOf(p0)));
        }
        List<SurfaceViewImplementationExternalSyntheticLambda1> list = CollectionsKt.toList(r8lambdahcn9bxmal9aalzj1mxukgx6yonw.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        Intrinsics.checkNotNull(list);
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    /* JADX WARN: Code duplicated, block: B:69:0x0139  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX WARN: Code duplicated, block: B:73:0x0149  */
    /* JADX WARN: Code duplicated, block: B:74:0x0154  */
    @Override // defpackage.animateToFullOpacity
    public final lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 p0) throws Throwable {
        Long l;
        Long lValueOf;
        Long l2;
        Integer num;
        int i;
        Long lValueOf2;
        int i2;
        Long lValueOf3;
        Long l3;
        Integer num2;
        Long l4;
        Long lValueOf4;
        Throwable th;
        r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw r8lambdahcn9bxmal9aalzj1mxukgx6yonw;
        Throwable th2;
        r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw r8lambdahcn9bxmal9aalzj1mxukgx6yonw2;
        Intrinsics.checkNotNullParameter(p0, "");
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNullParameter(p0, "");
        r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw r8lambdahcn9bxmal9aalzj1mxukgx6yonw3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, p0, true));
        if (r8lambdahcn9bxmal9aalzj1mxukgx6yonw3 == null) {
            return null;
        }
        if (r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.INotificationSideChannelStub != -1) {
            orientationToSurfaceRotation orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1 = this.b.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            try {
                RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.INotificationSideChannelStub));
                try {
                    RotationProvider1 rotationProvider1 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Intrinsics.checkNotNullParameter(rotationProvider1, "");
                    Intrinsics.checkNotNullParameter(r8lambdahcn9bxmal9aalzj1mxukgx6yonw3, "");
                    r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw r8lambdahcn9bxmal9aalzj1mxukgx6yonwTuitionPaymentFragmentspecialinlinedviewModeldefault3 = reattachSurfaceTexture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(rotationProvider1, r8lambdahcn9bxmal9aalzj1mxukgx6yonw3);
                    Intrinsics.checkNotNull(r8lambdahcn9bxmal9aalzj1mxukgx6yonwTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    try {
                        rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                        r8lambdahcn9bxmal9aalzj1mxukgx6yonw2 = r8lambdahcn9bxmal9aalzj1mxukgx6yonwTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        r8lambdahcn9bxmal9aalzj1mxukgx6yonw2 = r8lambdahcn9bxmal9aalzj1mxukgx6yonwTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                    } catch (Throwable th5) {
                        ExceptionsKt.addSuppressed(th2, th5);
                    }
                    r8lambdahcn9bxmal9aalzj1mxukgx6yonw2 = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw r8lambdahcn9bxmal9aalzj1mxukgx6yonw4 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw2;
                if (orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1 != null) {
                    try {
                        orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1.close();
                    } catch (Throwable th6) {
                        th = th6;
                        r8lambdahcn9bxmal9aalzj1mxukgx6yonw = r8lambdahcn9bxmal9aalzj1mxukgx6yonw4;
                    }
                }
                r8lambdahcn9bxmal9aalzj1mxukgx6yonw = r8lambdahcn9bxmal9aalzj1mxukgx6yonw4;
                th = null;
                if (th != null) {
                    throw th;
                }
                r8lambdahcn9bxmal9aalzj1mxukgx6yonw3 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw;
            } catch (Throwable th7) {
                th = th7;
                if (orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1 != null) {
                    try {
                        orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1.close();
                    } catch (Throwable th8) {
                        ExceptionsKt.addSuppressed(th, th8);
                    }
                }
                r8lambdahcn9bxmal9aalzj1mxukgx6yonw = null;
            }
        }
        boolean z = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.onTransact;
        boolean z2 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.onTransact;
        Long lValueOf5 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.onTransact ? null : Long.valueOf(r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.RemoteActionCompatParcelizer);
        Long l5 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.notify;
        if (l5 != null) {
            lValueOf = Long.valueOf((l5.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num3 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.a;
            if (num3 != null) {
                lValueOf = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l = null;
            }
            l2 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.cancel;
            if (l2 != null) {
                lValueOf3 = Long.valueOf((l2.longValue() / 10000) - 11644473600000L);
            } else {
                num = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.cancelAll;
                if (num != null) {
                    lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
                } else {
                    i = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.asInterface;
                    if (i != -1) {
                        i2 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.d;
                        if (i != -1) {
                            int i3 = (i >> 11) & 31;
                            int i4 = (i >> 5) & 63;
                            int i5 = (i & 31) << 1;
                            GregorianCalendar gregorianCalendar = new GregorianCalendar();
                            gregorianCalendar.set(14, 0);
                            gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                            lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                        } else {
                            lValueOf2 = null;
                        }
                    } else {
                        lValueOf2 = null;
                    }
                }
                l3 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.INotificationSideChannel;
                if (l3 != null) {
                    lValueOf4 = Long.valueOf((l3.longValue() / 10000) - 11644473600000L);
                } else {
                    num2 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.asBinder;
                    if (num2 != null) {
                        lValueOf4 = Long.valueOf(((long) num2.intValue()) * 1000);
                    } else {
                        l4 = null;
                    }
                    return new lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper(!z, z2, null, lValueOf5, l, lValueOf2, l4, null, 128, null);
                }
                l4 = lValueOf4;
                return new lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper(!z, z2, null, lValueOf5, l, lValueOf2, l4, null, 128, null);
            }
            lValueOf2 = lValueOf3;
            l3 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.INotificationSideChannel;
            if (l3 != null) {
                lValueOf4 = Long.valueOf((l3.longValue() / 10000) - 11644473600000L);
            } else {
                num2 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.asBinder;
                if (num2 != null) {
                    lValueOf4 = Long.valueOf(((long) num2.intValue()) * 1000);
                } else {
                    l4 = null;
                }
                return new lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper(!z, z2, null, lValueOf5, l, lValueOf2, l4, null, 128, null);
            }
            l4 = lValueOf4;
            return new lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper(!z, z2, null, lValueOf5, l, lValueOf2, l4, null, 128, null);
        }
        l = lValueOf;
        l2 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.cancel;
        if (l2 != null) {
            lValueOf3 = Long.valueOf((l2.longValue() / 10000) - 11644473600000L);
        } else {
            num = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.cancelAll;
            if (num != null) {
                lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
            } else {
                i = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.asInterface;
                if (i != -1) {
                    i2 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.d;
                    if (i != -1) {
                        int i6 = (i >> 11) & 31;
                        int i7 = (i >> 5) & 63;
                        int i8 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                        gregorianCalendar2.set(14, 0);
                        gregorianCalendar2.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i6, i7, i8);
                        lValueOf2 = Long.valueOf(gregorianCalendar2.getTime().getTime());
                    } else {
                        lValueOf2 = null;
                    }
                } else {
                    lValueOf2 = null;
                }
            }
            l3 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.INotificationSideChannel;
            if (l3 != null) {
                lValueOf4 = Long.valueOf((l3.longValue() / 10000) - 11644473600000L);
            } else {
                num2 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.asBinder;
                if (num2 != null) {
                    lValueOf4 = Long.valueOf(((long) num2.intValue()) * 1000);
                } else {
                    l4 = null;
                }
                return new lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper(!z, z2, null, lValueOf5, l, lValueOf2, l4, null, 128, null);
            }
            l4 = lValueOf4;
            return new lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper(!z, z2, null, lValueOf5, l, lValueOf2, l4, null, 128, null);
        }
        lValueOf2 = lValueOf3;
        l3 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.INotificationSideChannel;
        if (l3 != null) {
            lValueOf4 = Long.valueOf((l3.longValue() / 10000) - 11644473600000L);
        } else {
            num2 = r8lambdahcn9bxmal9aalzj1mxukgx6yonw3.asBinder;
            if (num2 != null) {
                lValueOf4 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                l4 = null;
            }
            return new lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper(!z, z2, null, lValueOf5, l, lValueOf2, l4, null, 128, null);
        }
        l4 = lValueOf4;
        return new lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper(!z, z2, null, lValueOf5, l, lValueOf2, l4, null, 128, null);
    }

    @Override // defpackage.animateToFullOpacity
    public final tryToComplete TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementationExternalSyntheticLambda1 p0) throws Throwable {
        Throwable th;
        RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNullParameter(p0, "");
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNullParameter(p0, "");
        r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw r8lambdahcn9bxmal9aalzj1mxukgx6yonw = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, p0, true));
        if (r8lambdahcn9bxmal9aalzj1mxukgx6yonw == null) {
            throw new FileNotFoundException("no such file: ".concat(String.valueOf(p0)));
        }
        orientationToSurfaceRotation orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1 = this.b.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        try {
            rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r8lambdahcn9bxmal9aalzj1mxukgx6yonw.INotificationSideChannelStub));
            if (orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1 != null) {
                try {
                    orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = null;
        } catch (Throwable th3) {
            if (orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1 != null) {
                try {
                    orientationtosurfacerotationTuitionPaymentFragmentbindingInflater1.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            th = th3;
            rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        }
        if (th == null) {
            RotationProvider1 rotationProvider1 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNullParameter(rotationProvider1, "");
            reattachSurfaceTexture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(rotationProvider1, null);
            if (r8lambdahcn9bxmal9aalzj1mxukgx6yonw.TuitionPaymentFragmentbindingInflater1 == 0) {
                return new surfaceCreated(rotationProvider1, r8lambdahcn9bxmal9aalzj1mxukgx6yonw.RemoteActionCompatParcelizer, true);
            }
            return new surfaceCreated(new setBrightness(new surfaceCreated(rotationProvider1, r8lambdahcn9bxmal9aalzj1mxukgx6yonw.TuitionPaymentFragmentspecialinlinedviewModeldefault3, true), new Inflater(true)), r8lambdahcn9bxmal9aalzj1mxukgx6yonw.RemoteActionCompatParcelizer, false);
        }
        throw th;
    }
}
