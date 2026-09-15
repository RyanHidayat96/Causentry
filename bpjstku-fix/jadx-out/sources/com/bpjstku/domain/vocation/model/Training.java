package com.bpjstku.domain.vocation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0017¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010+\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010&R\u0014\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010&R\u0014\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u00101\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010&R\u0014\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010&R\u0014\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010&R\u0014\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u00105\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010&R\u0014\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010&R\u0014\u00106\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010&R\u0014\u00104\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010&R\u0014\u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010&R\u0014\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010&R\u0014\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010&"}, d2 = {"Lcom/bpjstku/domain/vocation/model/Training;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "RemoteActionCompatParcelizer", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "INotificationSideChannelStub", "asBinder", "g", "a", "cancel", "asInterface", "d", "INotificationSideChannel", "notify", "cancelAll", "onTransact", "INotificationSideChannelStubProxy"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Training implements Parcelable {
    public static final Parcelable.Creator<Training> CREATOR = new TuitionPaymentFragmentbindingInflater1();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final String onTransact;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final String b;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final String notify;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String INotificationSideChannel;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String INotificationSideChannelStub;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final String asInterface;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;
    public final String d;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final String cancelAll;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final String cancel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Training(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
        this.b = str4;
        this.TuitionPaymentFragmentbindingInflater1 = str5;
        this.g = str6;
        this.a = str7;
        this.asInterface = str8;
        this.d = str9;
        this.asBinder = str10;
        this.INotificationSideChannel = str11;
        this.cancelAll = str12;
        this.cancel = str13;
        this.onTransact = str14;
        this.notify = str15;
        this.RemoteActionCompatParcelizer = str16;
        this.INotificationSideChannelStub = str17;
        this.INotificationSideChannelStubProxy = str18;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Training)) {
            return false;
        }
        Training training = (Training) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, training.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, training.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, training.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.b, training.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, training.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.g, training.g) && Intrinsics.areEqual(this.a, training.a) && Intrinsics.areEqual(this.asInterface, training.asInterface) && Intrinsics.areEqual(this.d, training.d) && Intrinsics.areEqual(this.asBinder, training.asBinder) && Intrinsics.areEqual(this.INotificationSideChannel, training.INotificationSideChannel) && Intrinsics.areEqual(this.cancelAll, training.cancelAll) && Intrinsics.areEqual(this.cancel, training.cancel) && Intrinsics.areEqual(this.onTransact, training.onTransact) && Intrinsics.areEqual(this.notify, training.notify) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, training.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.INotificationSideChannelStub, training.INotificationSideChannelStub) && Intrinsics.areEqual(this.INotificationSideChannelStubProxy, training.INotificationSideChannelStubProxy);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.g.hashCode()) * 31) + this.a.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.d.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.INotificationSideChannel.hashCode()) * 31) + this.cancelAll.hashCode()) * 31) + this.cancel.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.notify.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.INotificationSideChannelStub.hashCode()) * 31) + this.INotificationSideChannelStubProxy.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str4 = this.b;
        String str5 = this.TuitionPaymentFragmentbindingInflater1;
        String str6 = this.g;
        String str7 = this.a;
        String str8 = this.asInterface;
        String str9 = this.d;
        String str10 = this.asBinder;
        String str11 = this.INotificationSideChannel;
        String str12 = this.cancelAll;
        String str13 = this.cancel;
        String str14 = this.onTransact;
        String str15 = this.notify;
        String str16 = this.RemoteActionCompatParcelizer;
        String str17 = this.INotificationSideChannelStub;
        String str18 = this.INotificationSideChannelStubProxy;
        StringBuilder sb = new StringBuilder("Training(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str3);
        sb.append(", b=");
        sb.append(str4);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str5);
        sb.append(", g=");
        sb.append(str6);
        sb.append(", a=");
        sb.append(str7);
        sb.append(", asInterface=");
        sb.append(str8);
        sb.append(", d=");
        sb.append(str9);
        sb.append(", asBinder=");
        sb.append(str10);
        sb.append(", INotificationSideChannel=");
        sb.append(str11);
        sb.append(", cancelAll=");
        sb.append(str12);
        sb.append(", cancel=");
        sb.append(str13);
        sb.append(", onTransact=");
        sb.append(str14);
        sb.append(", unRemoteActionCompatParcelizer=");
        sb.append(str15);
        sb.append(", scheduledRegistration=");
        sb.append(str16);
        sb.append(", INotificationSideChannelStub=");
        sb.append(str17);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(str18);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.g);
        p0.writeString(this.a);
        p0.writeString(this.asInterface);
        p0.writeString(this.d);
        p0.writeString(this.asBinder);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.cancelAll);
        p0.writeString(this.cancel);
        p0.writeString(this.onTransact);
        p0.writeString(this.notify);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.INotificationSideChannelStub);
        p0.writeString(this.INotificationSideChannelStubProxy);
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<Training> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Training createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Training(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Training[] newArray(int i) {
            return new Training[i];
        }
    }
}
