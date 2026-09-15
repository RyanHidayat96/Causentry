package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.ClassDiscriminatorMode;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001Bµ\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0011\u0010!\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0011\u0010\"\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0011\u0010$\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0011\u0010&\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0014\u0010)\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u0014\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0014\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0014\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0014\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0014\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010+\u001a\u00020\u00158\u0007@GX\u0087\f¢\u0006\u0006\n\u0004\b*\u00100"}, d2 = {"LgetRemainingRotationDegrees;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "", "p6", "p7", "p8", "p9", "p10", "p11", "LattachToControllerIfReady;", "p12", "p13", "p14", "p15", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "p16", "<init>", "(ZZZZZZLjava/lang/String;ZZLjava/lang/String;ZZLattachToControllerIfReady;ZZZLkotlinx/serialization/json/ClassDiscriminatorMode;)V", "toString", "()Ljava/lang/String;", "asBinder", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "INotificationSideChannel", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "cancel", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "notify", "b", "asInterface", "a", "cancelAll", "Ljava/lang/String;", "g", "d", "INotificationSideChannelDefault", "getInterfaceDescriptor", "onTransact", "LattachToControllerIfReady;", "INotificationSideChannelStub", "Lkotlinx/serialization/json/ClassDiscriminatorMode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getRemainingRotationDegrees {

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public final boolean asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final boolean notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final boolean INotificationSideChannelStub;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean d;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean INotificationSideChannel;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final boolean TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final String g;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ClassDiscriminatorMode INotificationSideChannelDefault;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean onTransact;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public final boolean cancelAll;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final boolean b;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final attachToControllerIfReady cancel;

    private getRemainingRotationDegrees(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, attachToControllerIfReady attachtocontrollerifready, boolean z11, boolean z12, boolean z13, ClassDiscriminatorMode classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z2;
        this.TuitionPaymentFragmentbindingInflater1 = z3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z4;
        this.b = z5;
        this.a = z6;
        this.g = str;
        this.d = z7;
        this.asInterface = z8;
        this.asBinder = str2;
        this.INotificationSideChannel = z9;
        this.cancelAll = z10;
        this.cancel = attachtocontrollerifready;
        this.onTransact = z11;
        this.notify = z12;
        this.INotificationSideChannelStub = z13;
        this.INotificationSideChannelDefault = classDiscriminatorMode;
    }

    public /* synthetic */ getRemainingRotationDegrees(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, attachToControllerIfReady attachtocontrollerifready, boolean z11, boolean z12, boolean z13, ClassDiscriminatorMode classDiscriminatorMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? "    " : str, (i & 128) != 0 ? false : z7, (i & 256) != 0 ? false : z8, (i & 512) != 0 ? "type" : str2, (i & 1024) != 0 ? false : z9, (i & 2048) == 0 ? z10 : true, (i & 4096) != 0 ? null : attachtocontrollerifready, (i & 8192) != 0 ? false : z11, (i & 16384) != 0 ? false : z12, (i & 32768) != 0 ? false : z13, (i & 65536) != 0 ? ClassDiscriminatorMode.POLYMORPHIC : classDiscriminatorMode);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", isLenient=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", allowStructuredMapKeys=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", prettyPrint=");
        sb.append(this.b);
        sb.append(", explicitNulls=");
        sb.append(this.a);
        sb.append(", prettyPrintIndent='");
        sb.append(this.g);
        sb.append("', coerceInputValues=");
        sb.append(this.d);
        sb.append(", useArrayPolymorphism=");
        sb.append(this.asInterface);
        sb.append(", classDiscriminator='");
        sb.append(this.asBinder);
        sb.append("', allowSpecialFloatingPointValues=");
        sb.append(this.INotificationSideChannel);
        sb.append(", useAlternativeNames=");
        sb.append(this.cancelAll);
        sb.append(", namingStrategy=");
        sb.append(this.cancel);
        sb.append(", decodeEnumsCaseInsensitive=");
        sb.append(this.onTransact);
        sb.append(", allowTrailingComma=");
        sb.append(this.notify);
        sb.append(", allowComments=");
        sb.append(this.INotificationSideChannelStub);
        sb.append(", classDiscriminatorMode=");
        sb.append(this.INotificationSideChannelDefault);
        sb.append(')');
        return sb.toString();
    }

    public getRemainingRotationDegrees() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null);
    }
}
