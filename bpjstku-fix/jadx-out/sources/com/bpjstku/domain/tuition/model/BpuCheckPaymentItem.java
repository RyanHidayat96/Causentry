package com.bpjstku.domain.tuition.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\n¢\u0006\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010+R\u0014\u00103\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010+R\u0014\u00107\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u00102R\u0014\u0010:\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010+R\u0014\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010;R\u0014\u0010<\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00102R\u0014\u00106\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00102R\u0016\u0010>\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u00102R\u0014\u0010?\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00101\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00102R\u0014\u0010@\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u00102R\u0014\u0010B\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u00102R\u0016\u00108\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u00102R\u0014\u0010A\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u00102R\u0016\u0010=\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u00102R\u0016\u0010D\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u00102R\u0016\u0010E\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u00102"}, d2 = {"Lcom/bpjstku/domain/tuition/model/BpuCheckPaymentItem;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "", "p3", "p4", "p5", "", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "<init>", "(DDDLjava/lang/String;DLjava/lang/String;IDDLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "asBinder", "D", "TuitionPaymentFragmentbindingInflater1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "cancel", "Ljava/lang/String;", "b", "MediaBrowserCompat", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "notify", "asInterface", "RemoteActionCompatParcelizer", "I", "d", "Ljava/lang/Double;", "INotificationSideChannel", "getInterfaceDescriptor", "cancelAll", "onTransact", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "INotificationSideChannelStub", "connect", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BpuCheckPaymentItem implements Parcelable {
    public static final Parcelable.Creator<BpuCheckPaymentItem> CREATOR = new b();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final String RemoteActionCompatParcelizer;
    public final String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final String write;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final String INotificationSideChannelStub;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    public final double TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final int d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final Double a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final double g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final double TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String INotificationSideChannel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String onTransact;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final String b;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final String IconCompatParcelizer;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    public final String getInterfaceDescriptor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final double asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final double TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public final String cancelAll;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final String asInterface;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final String INotificationSideChannelStubProxy;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BpuCheckPaymentItem(double d, double d2, double d3, String str, double d4, String str2, int i, double d5, double d6, Double d7, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.TuitionPaymentFragmentbindingInflater1 = d;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = d2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = d3;
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = d4;
        this.asInterface = str2;
        this.d = i;
        this.g = d5;
        this.asBinder = d6;
        this.a = d7;
        this.INotificationSideChannel = str3;
        this.notify = str4;
        this.cancelAll = str5;
        this.onTransact = str6;
        this.cancel = str7;
        this.INotificationSideChannelDefault = str8;
        this.INotificationSideChannelStub = str9;
        this.RemoteActionCompatParcelizer = str10;
        this.INotificationSideChannelStubProxy = str11;
        this.getInterfaceDescriptor = str12;
        this.IconCompatParcelizer = str13;
        this.write = str14;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BpuCheckPaymentItem)) {
            return false;
        }
        BpuCheckPaymentItem bpuCheckPaymentItem = (BpuCheckPaymentItem) p0;
        return Double.compare(this.TuitionPaymentFragmentbindingInflater1, bpuCheckPaymentItem.TuitionPaymentFragmentbindingInflater1) == 0 && Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == 0 && Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == 0 && Intrinsics.areEqual(this.b, bpuCheckPaymentItem.b) && Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == 0 && Intrinsics.areEqual(this.asInterface, bpuCheckPaymentItem.asInterface) && this.d == bpuCheckPaymentItem.d && Double.compare(this.g, bpuCheckPaymentItem.g) == 0 && Double.compare(this.asBinder, bpuCheckPaymentItem.asBinder) == 0 && Intrinsics.areEqual((Object) this.a, (Object) bpuCheckPaymentItem.a) && Intrinsics.areEqual(this.INotificationSideChannel, bpuCheckPaymentItem.INotificationSideChannel) && Intrinsics.areEqual(this.notify, bpuCheckPaymentItem.notify) && Intrinsics.areEqual(this.cancelAll, bpuCheckPaymentItem.cancelAll) && Intrinsics.areEqual(this.onTransact, bpuCheckPaymentItem.onTransact) && Intrinsics.areEqual(this.cancel, bpuCheckPaymentItem.cancel) && Intrinsics.areEqual(this.INotificationSideChannelDefault, bpuCheckPaymentItem.INotificationSideChannelDefault) && Intrinsics.areEqual(this.INotificationSideChannelStub, bpuCheckPaymentItem.INotificationSideChannelStub) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, bpuCheckPaymentItem.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.INotificationSideChannelStubProxy, bpuCheckPaymentItem.INotificationSideChannelStubProxy) && Intrinsics.areEqual(this.getInterfaceDescriptor, bpuCheckPaymentItem.getInterfaceDescriptor) && Intrinsics.areEqual(this.IconCompatParcelizer, bpuCheckPaymentItem.IconCompatParcelizer) && Intrinsics.areEqual(this.write, bpuCheckPaymentItem.write);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.TuitionPaymentFragmentbindingInflater1);
        int iHashCode2 = Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int iHashCode3 = Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int iHashCode4 = this.b.hashCode();
        int iHashCode5 = Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int iHashCode6 = this.asInterface.hashCode();
        int iHashCode7 = Integer.hashCode(this.d);
        int iHashCode8 = Double.hashCode(this.g);
        int iHashCode9 = Double.hashCode(this.asBinder);
        Double d = this.a;
        int iHashCode10 = d == null ? 0 : d.hashCode();
        int iHashCode11 = this.INotificationSideChannel.hashCode();
        int iHashCode12 = this.notify.hashCode();
        String str = this.cancelAll;
        int iHashCode13 = str == null ? 0 : str.hashCode();
        int iHashCode14 = this.onTransact.hashCode();
        int iHashCode15 = this.cancel.hashCode();
        int iHashCode16 = this.INotificationSideChannelDefault.hashCode();
        int iHashCode17 = this.INotificationSideChannelStub.hashCode();
        String str2 = this.RemoteActionCompatParcelizer;
        int iHashCode18 = str2 == null ? 0 : str2.hashCode();
        int iHashCode19 = this.INotificationSideChannelStubProxy.hashCode();
        String str3 = this.getInterfaceDescriptor;
        int iHashCode20 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.IconCompatParcelizer;
        int iHashCode21 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.write;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        double d = this.TuitionPaymentFragmentbindingInflater1;
        double d2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        double d3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str = this.b;
        double d4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2 = this.asInterface;
        int i = this.d;
        double d5 = this.g;
        double d6 = this.asBinder;
        Double d7 = this.a;
        String str3 = this.INotificationSideChannel;
        String str4 = this.notify;
        String str5 = this.cancelAll;
        String str6 = this.onTransact;
        String str7 = this.cancel;
        String str8 = this.INotificationSideChannelDefault;
        String str9 = this.INotificationSideChannelStub;
        String str10 = this.RemoteActionCompatParcelizer;
        String str11 = this.INotificationSideChannelStubProxy;
        String str12 = this.getInterfaceDescriptor;
        String str13 = this.IconCompatParcelizer;
        String str14 = this.write;
        StringBuilder sb = new StringBuilder("BpuCheckPaymentItem(TuitionPaymentFragmentbindingInflater1=");
        sb.append(d);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(d2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(d3);
        sb.append(", b=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(d4);
        sb.append(", asInterface=");
        sb.append(str2);
        sb.append(", d=");
        sb.append(i);
        sb.append(", g=");
        sb.append(d5);
        sb.append(", asBinder=");
        sb.append(d6);
        sb.append(", a=");
        sb.append(d7);
        sb.append(", INotificationSideChannel=");
        sb.append(str3);
        sb.append(", notify=");
        sb.append(str4);
        sb.append(", cancelAll=");
        sb.append(str5);
        sb.append(", onTransact=");
        sb.append(str6);
        sb.append(", cancel=");
        sb.append(str7);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(str8);
        sb.append(", INotificationSideChannelStub=");
        sb.append(str9);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str10);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(str11);
        sb.append(", getInterfaceDescriptor=");
        sb.append(str12);
        sb.append(", IconCompatParcelizer=");
        sb.append(str13);
        sb.append(", write=");
        sb.append(str14);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeDouble(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.b);
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.asInterface);
        p0.writeInt(this.d);
        p0.writeDouble(this.g);
        p0.writeDouble(this.asBinder);
        Double d = this.a;
        if (d == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeDouble(d.doubleValue());
        }
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.notify);
        p0.writeString(this.cancelAll);
        p0.writeString(this.onTransact);
        p0.writeString(this.cancel);
        p0.writeString(this.INotificationSideChannelDefault);
        p0.writeString(this.INotificationSideChannelStub);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.INotificationSideChannelStubProxy);
        p0.writeString(this.getInterfaceDescriptor);
        p0.writeString(this.IconCompatParcelizer);
        p0.writeString(this.write);
    }

    public static final class b implements Parcelable.Creator<BpuCheckPaymentItem> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BpuCheckPaymentItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BpuCheckPaymentItem(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BpuCheckPaymentItem[] newArray(int i) {
            return new BpuCheckPaymentItem[i];
        }
    }
}
