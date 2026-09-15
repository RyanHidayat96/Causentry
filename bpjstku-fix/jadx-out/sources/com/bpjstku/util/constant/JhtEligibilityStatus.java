package com.bpjstku.util.constant;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v21 com.bpjstku.util.constant.JhtEligibilityStatus[], still in use, count: 1, list:
  (r0v21 com.bpjstku.util.constant.JhtEligibilityStatus[]) from 0x01d1: INVOKE (r0v21 com.bpjstku.util.constant.JhtEligibilityStatus[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1"}, d2 = {"Lcom/bpjstku/util/constant/JhtEligibilityStatus;", "Landroid/os/Parcelable;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "g", "cancelAll", "onTransact", "cancel", "INotificationSideChannel", "INotificationSideChannelStubProxy", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "d", "a", "asInterface", "asBinder", "notify", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "INotificationSideChannelDefault", "INotificationSideChannelStub", "RemoteActionCompatParcelizer", "getInterfaceDescriptor", "write", "read", "connect", "getExtras", "disconnect", "MediaBrowserCompat", "IconCompatParcelizer", "getNotifyChildrenChangedOptions", "getItem", "getSessionToken", "getRoot"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JhtEligibilityStatus implements Parcelable {
    STATUS_CODE_100("100"),
    STATUS_CODE_109("109"),
    STATUS_CODE_110("110"),
    STATUS_CODE_111("111"),
    STATUS_CODE_112("112"),
    STATUS_CODE_114("114"),
    STATUS_CODE_115("115"),
    STATUS_CODE_104("104"),
    STATUS_CODE_105("105"),
    STATUS_CODE_106("106"),
    STATUS_CODE_107("107"),
    STATUS_CODE_108("108"),
    STATUS_CODE_113("113"),
    STATUS_CODE_103("103"),
    STATUS_CODE_101("101"),
    STATUS_CODE_102("102"),
    STATUS_CODE_117("117"),
    STATUS_CODE_118("118"),
    STATUS_CODE_119("119"),
    STATUS_CODE_121("121"),
    STATUS_CODE_126("126"),
    STATUS_CODE_130("130"),
    STATUS_CODE_133("133"),
    STATUS_CODE_135("135"),
    STATUS_CODE_136("136"),
    STATUS_CODE_125("125"),
    STATUS_CODE_132("132"),
    STATUS_CODE_137("137"),
    STATUS_CODE_138("138"),
    STATUS_CODE_139("139"),
    STATUS_CODE_140("140");

    public static final Parcelable.Creator<JhtEligibilityStatus> CREATOR;
    private final String value;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private JhtEligibilityStatus(String str) {
        super(str, i);
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        EnumEntriesKt.enumEntries(new JhtEligibilityStatus[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r0, r0, r0, r0, r0, r0, r0, r0, r0, r0, r0, r0, r0, r0, r0, r0, STATUS_CODE_139, r0});
        CREATOR = new Parcelable.Creator<JhtEligibilityStatus>() { // from class: com.bpjstku.util.constant.JhtEligibilityStatus.b
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ JhtEligibilityStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return JhtEligibilityStatus.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ JhtEligibilityStatus[] newArray(int i) {
                return new JhtEligibilityStatus[i];
            }
        };
    }

    public static JhtEligibilityStatus valueOf(String str) {
        return (JhtEligibilityStatus) Enum.valueOf(JhtEligibilityStatus.class, str);
    }

    public static JhtEligibilityStatus[] values() {
        return (JhtEligibilityStatus[]) getServiceComponent.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(name());
    }
}
