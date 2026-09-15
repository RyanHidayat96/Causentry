package com.bpjstku.util.constant;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 com.bpjstku.util.constant.MenuIct[], still in use, count: 1, list:
  (r0v3 com.bpjstku.util.constant.MenuIct[]) from 0x002a: INVOKE (r0v3 com.bpjstku.util.constant.MenuIct[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)]
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/bpjstku/util/constant/MenuIct;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "p0", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MenuIct implements Parcelable {
    TANAM_DUIT,
    PROMO,
    DANASIAGA;

    public static final Parcelable.Creator<MenuIct> CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private MenuIct() {
        super(str, i);
    }

    static {
        EnumEntriesKt.enumEntries(new MenuIct[]{TANAM_DUIT, PROMO, r0});
        CREATOR = new Parcelable.Creator<MenuIct>() { // from class: com.bpjstku.util.constant.MenuIct.TuitionPaymentFragmentbindingInflater1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MenuIct createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return MenuIct.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MenuIct[] newArray(int i) {
                return new MenuIct[i];
            }
        };
    }

    public static MenuIct valueOf(String str) {
        return (MenuIct) Enum.valueOf(MenuIct.class, str);
    }

    public static MenuIct[] values() {
        return (MenuIct[]) TuitionPaymentFragmentspecialinlinedviewModeldefault2.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(name());
    }
}
