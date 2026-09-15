package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010\u0019\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0014\u0010%\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010(\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010*\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010+R\u0016\u0010,\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010+R\u0016\u0010-\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010.R\u0016\u00102\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00100\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00103\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u00101R\u0014\u0010&\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\"R\u0014\u00104\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010\""}, d2 = {"Lr8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw;", "", "LSurfaceViewImplementationExternalSyntheticLambda1;", "p0", "", "p1", "", "p2", "", "p3", "p4", "p5", "", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "<init>", "(LSurfaceViewImplementationExternalSyntheticLambda1;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lr8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw;", "b", "LSurfaceViewImplementationExternalSyntheticLambda1;", "", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "INotificationSideChannelStubProxy", "Ljava/lang/String;", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "TuitionPaymentFragmentbindingInflater1", "INotificationSideChannelStub", "g", "d", "a", "asInterface", "Ljava/lang/Integer;", "asBinder", "cancelAll", "Z", "onTransact", "INotificationSideChannel", "Ljava/lang/Long;", "notify", "cancel", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw {

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final Long notify;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final long g;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final int d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final List<SurfaceViewImplementationExternalSyntheticLambda1> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final boolean onTransact;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final Integer cancelAll;
    public final SurfaceViewImplementationExternalSyntheticLambda1 b;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final Long cancel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Integer asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final Integer a;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final Long INotificationSideChannel;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final long INotificationSideChannelStub;

    private r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.b = surfaceViewImplementationExternalSyntheticLambda1;
        this.onTransact = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.g = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j2;
        this.RemoteActionCompatParcelizer = j3;
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.INotificationSideChannelStub = j4;
        this.d = i2;
        this.asInterface = i3;
        this.cancel = l;
        this.INotificationSideChannel = l2;
        this.notify = l3;
        this.cancelAll = num;
        this.asBinder = num2;
        this.a = num3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList();
    }

    public /* synthetic */ r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(surfaceViewImplementationExternalSyntheticLambda1, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? -1L : j, (i4 & 16) != 0 ? -1L : j2, (i4 & 32) != 0 ? -1L : j3, (i4 & 64) != 0 ? -1 : i, (i4 & 128) == 0 ? j4 : -1L, (i4 & 256) != 0 ? -1 : i2, (i4 & 512) == 0 ? i3 : -1, (i4 & 1024) != 0 ? null : l, (i4 & 2048) != 0 ? null : l2, (i4 & 4096) != 0 ? null : l3, (i4 & 8192) != 0 ? null : num, (i4 & 16384) != 0 ? null : num2, (i4 & 32768) != 0 ? null : num3);
    }

    public final r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw TuitionPaymentFragmentspecialinlinedviewModeldefault1(Integer p0, Integer p1, Integer p2) {
        return new r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw(this.b, this.onTransact, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.g, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.RemoteActionCompatParcelizer, this.TuitionPaymentFragmentbindingInflater1, this.INotificationSideChannelStub, this.d, this.asInterface, this.cancel, this.INotificationSideChannel, this.notify, p0, p1, p2);
    }
}
