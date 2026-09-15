package com.bpjstku.domain.promo.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u0019¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\u0014\u0010,\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010(R\u0014\u00100\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010(R\u0014\u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010(R\u0014\u00101\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010(R\u0014\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u0010'\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010(R\u0014\u00106\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010(R\u0014\u00102\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010(R\u0014\u00107\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010(R\u0014\u00104\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010(R\u0014\u00109\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010(R\u0014\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010:\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010(R\u0014\u0010;\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010(R\u0014\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010(R\u0014\u00105\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010(R\u0014\u0010.\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010("}, d2 = {"Lcom/bpjstku/domain/promo/model/ListMerchant;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "asInterface", "Ljava/lang/String;", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "getInterfaceDescriptor", "onTransact", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "cancel", "g", "notify", "INotificationSideChannelDefault", "a", "INotificationSideChannel", "RemoteActionCompatParcelizer", "cancelAll", "INotificationSideChannelStub", "INotificationSideChannelStubProxy"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ListMerchant implements Parcelable {
    public static final Parcelable.Creator<ListMerchant> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    private final String INotificationSideChannel;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final String a;
    private final String INotificationSideChannelStub;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final String getInterfaceDescriptor;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final String b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String onTransact;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final String d;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String cancel;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final String asInterface;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ListMerchant(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
        this.TuitionPaymentFragmentbindingInflater1 = str4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str5;
        this.asBinder = str6;
        this.d = str7;
        this.g = str8;
        this.asInterface = str9;
        this.a = str10;
        this.cancel = str11;
        this.INotificationSideChannel = str12;
        this.notify = str13;
        this.cancelAll = str14;
        this.onTransact = str15;
        this.INotificationSideChannelStub = str16;
        this.INotificationSideChannelStubProxy = str17;
        this.RemoteActionCompatParcelizer = str18;
        this.INotificationSideChannelDefault = str19;
        this.getInterfaceDescriptor = str20;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ListMerchant)) {
            return false;
        }
        ListMerchant listMerchant = (ListMerchant) p0;
        return Intrinsics.areEqual(this.b, listMerchant.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, listMerchant.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, listMerchant.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, listMerchant.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, listMerchant.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.asBinder, listMerchant.asBinder) && Intrinsics.areEqual(this.d, listMerchant.d) && Intrinsics.areEqual(this.g, listMerchant.g) && Intrinsics.areEqual(this.asInterface, listMerchant.asInterface) && Intrinsics.areEqual(this.a, listMerchant.a) && Intrinsics.areEqual(this.cancel, listMerchant.cancel) && Intrinsics.areEqual(this.INotificationSideChannel, listMerchant.INotificationSideChannel) && Intrinsics.areEqual(this.notify, listMerchant.notify) && Intrinsics.areEqual(this.cancelAll, listMerchant.cancelAll) && Intrinsics.areEqual(this.onTransact, listMerchant.onTransact) && Intrinsics.areEqual(this.INotificationSideChannelStub, listMerchant.INotificationSideChannelStub) && Intrinsics.areEqual(this.INotificationSideChannelStubProxy, listMerchant.INotificationSideChannelStubProxy) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, listMerchant.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.INotificationSideChannelDefault, listMerchant.INotificationSideChannelDefault) && Intrinsics.areEqual(this.getInterfaceDescriptor, listMerchant.getInterfaceDescriptor);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.b.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.d.hashCode()) * 31) + this.g.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.a.hashCode()) * 31) + this.cancel.hashCode()) * 31) + this.INotificationSideChannel.hashCode()) * 31) + this.notify.hashCode()) * 31) + this.cancelAll.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.INotificationSideChannelStub.hashCode()) * 31) + this.INotificationSideChannelStubProxy.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.INotificationSideChannelDefault.hashCode()) * 31) + this.getInterfaceDescriptor.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str4 = this.TuitionPaymentFragmentbindingInflater1;
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str6 = this.asBinder;
        String str7 = this.d;
        String str8 = this.g;
        String str9 = this.asInterface;
        String str10 = this.a;
        String str11 = this.cancel;
        String str12 = this.INotificationSideChannel;
        String str13 = this.notify;
        String str14 = this.cancelAll;
        String str15 = this.onTransact;
        String str16 = this.INotificationSideChannelStub;
        String str17 = this.INotificationSideChannelStubProxy;
        String str18 = this.RemoteActionCompatParcelizer;
        String str19 = this.INotificationSideChannelDefault;
        String str20 = this.getInterfaceDescriptor;
        StringBuilder sb = new StringBuilder("ListMerchant(b=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str5);
        sb.append(", asBinder=");
        sb.append(str6);
        sb.append(", d=");
        sb.append(str7);
        sb.append(", g=");
        sb.append(str8);
        sb.append(", asInterface=");
        sb.append(str9);
        sb.append(", a=");
        sb.append(str10);
        sb.append(", cancel=");
        sb.append(str11);
        sb.append(", INotificationSideChannel=");
        sb.append(str12);
        sb.append(", notify=");
        sb.append(str13);
        sb.append(", cancelAll=");
        sb.append(str14);
        sb.append(", onTransact=");
        sb.append(str15);
        sb.append(", INotificationSideChannelStub=");
        sb.append(str16);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(str17);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str18);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(str19);
        sb.append(", getInterfaceDescriptor=");
        sb.append(str20);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.asBinder);
        p0.writeString(this.d);
        p0.writeString(this.g);
        p0.writeString(this.asInterface);
        p0.writeString(this.a);
        p0.writeString(this.cancel);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.notify);
        p0.writeString(this.cancelAll);
        p0.writeString(this.onTransact);
        p0.writeString(this.INotificationSideChannelStub);
        p0.writeString(this.INotificationSideChannelStubProxy);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.INotificationSideChannelDefault);
        p0.writeString(this.getInterfaceDescriptor);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Parcelable.Creator<ListMerchant> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ListMerchant createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ListMerchant(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ListMerchant[] newArray(int i) {
            return new ListMerchant[i];
        }
    }
}
