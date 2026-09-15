package com.bpjstku.util.constant;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.bpjstku.util.constant.FamilyStatusCode[], still in use, count: 1, list:
  (r0v1 com.bpjstku.util.constant.FamilyStatusCode[]) from 0x0075: INVOKE (r0v1 com.bpjstku.util.constant.FamilyStatusCode[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)]
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b"}, d2 = {"Lcom/bpjstku/util/constant/FamilyStatusCode;", "Landroid/os/Parcelable;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "g", "b", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "d"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FamilyStatusCode implements Parcelable {
    I("ISTRI"),
    S("SUAMI"),
    A("ANAK"),
    O("ORANG TUA"),
    K("KAKEK / NENEK"),
    C("CUCU"),
    M("MERTUA"),
    B("SAUDARA KANDUNG"),
    L("LAIN-LAIN");

    public static final Parcelable.Creator<FamilyStatusCode> CREATOR;
    private final String type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private FamilyStatusCode(String str) {
        super(str, i);
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }

    static {
        EnumEntriesKt.enumEntries(familyStatusCodeArr);
        CREATOR = new Parcelable.Creator<FamilyStatusCode>() { // from class: com.bpjstku.util.constant.FamilyStatusCode.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ FamilyStatusCode createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return FamilyStatusCode.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ FamilyStatusCode[] newArray(int i) {
                return new FamilyStatusCode[i];
            }
        };
    }

    public static FamilyStatusCode valueOf(String str) {
        return (FamilyStatusCode) Enum.valueOf(FamilyStatusCode.class, str);
    }

    public static FamilyStatusCode[] values() {
        return (FamilyStatusCode[]) asBinder.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(name());
    }
}
