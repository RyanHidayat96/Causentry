package com.bpjstku.util.constant;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v30 com.bpjstku.util.constant.FamilyStatus[], still in use, count: 1, list:
  (r0v30 com.bpjstku.util.constant.FamilyStatus[]) from 0x0196: INVOKE (r0v30 com.bpjstku.util.constant.FamilyStatus[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)]
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0"}, d2 = {"Lcom/bpjstku/util/constant/FamilyStatus;", "Landroid/os/Parcelable;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "connect", "getInterfaceDescriptor", "RemoteActionCompatParcelizer", "INotificationSideChannelStubProxy", "notify", "d", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "getItem", "cancel", "INotificationSideChannel", "disconnect", "MediaBrowserCompat", "g", "INotificationSideChannelStub", "getRoot", "a", "getExtras", "getNotifyChildrenChangedOptions", "cancelAll", "onTransact", "IconCompatParcelizer", "read", "asInterface", "INotificationSideChannelDefault", "isConnected", "TuitionPaymentFragmentbindingInflater1", "write", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FamilyStatus implements Parcelable {
    SIBLINGS("B"),
    INLAWS("M"),
    GRANDCHILDS("C"),
    GRANDPARENTS("K"),
    EMPLOYEES(ExifInterface.GPS_DIRECTION_TRUE),
    WIFE("I"),
    HUSBAND(ExifInterface.LATITUDE_SOUTH),
    FIRSTCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    SECONDCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    THIRDCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    FOURTHCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    FIFTHCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    SIXTHCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    SEVENTHCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    EIGHTTHCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    NINETHCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    TENTHCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    ELEVENCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    TWELVECHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    THIRTEENCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    FOURTEENCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    FIFTEENCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    SIXTEENCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    SEVENTEENCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    EIGHTEENCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    NINETEENCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    TWENTYCHILD(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    CHILDS(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
    OTHERS("L"),
    PARENTS("O");

    public static final Parcelable.Creator<FamilyStatus> CREATOR;
    private final String type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private FamilyStatus(String str) {
        super(str, i);
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }

    static {
        EnumEntriesKt.enumEntries(new FamilyStatus[]{SIBLINGS, INLAWS, GRANDCHILDS, GRANDPARENTS, EMPLOYEES, r0, r0, r0, r0, THIRDCHILD, FOURTHCHILD, FIFTHCHILD, SIXTHCHILD, SEVENTHCHILD, EIGHTTHCHILD, NINETHCHILD, TENTHCHILD, ELEVENCHILD, TWELVECHILD, THIRTEENCHILD, FOURTEENCHILD, FIFTEENCHILD, SIXTEENCHILD, SEVENTEENCHILD, EIGHTEENCHILD, NINETEENCHILD, TWENTYCHILD, r0, OTHERS, r0});
        CREATOR = new Parcelable.Creator<FamilyStatus>() { // from class: com.bpjstku.util.constant.FamilyStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ FamilyStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return FamilyStatus.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ FamilyStatus[] newArray(int i) {
                return new FamilyStatus[i];
            }
        };
    }

    public static FamilyStatus valueOf(String str) {
        return (FamilyStatus) Enum.valueOf(FamilyStatus.class, str);
    }

    public static FamilyStatus[] values() {
        return (FamilyStatus[]) asBinder.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(name());
    }
}
