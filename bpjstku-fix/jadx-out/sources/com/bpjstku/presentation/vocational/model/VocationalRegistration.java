package com.bpjstku.presentation.vocational.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.ViewCompat;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.user.model.SubscribedProgram;
import com.bpjstku.domain.vocation.model.Bank;
import com.bpjstku.domain.vocation.model.TrainingField;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010\u0003\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020!HÖ\u0001¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020+2\u0006\u0010\u0004\u001a\u00020!¢\u0006\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b2\u00100R\u0018\u00106\u001a\u0004\u0018\u00010\u00058\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b7\u00100R\u0016\u00109\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u0010:\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b9\u00100R\u0016\u0010<\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b;\u00100R\u0016\u0010>\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b=\u00100R\u0016\u0010@\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b?\u00100R\u0016\u0010A\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b>\u00100R\u0018\u00102\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b8\u0010BR\u0016\u00107\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b:\u00100R\u0016\u0010C\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b3\u00100R\u0016\u0010=\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b6\u00100R\u0016\u0010D\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\bA\u00100R\u0016\u0010F\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\bE\u00100R\u0016\u0010E\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b@\u00100R\u0016\u0010/\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\bC\u00100R\u0018\u0010?\u001a\u0004\u0018\u00010\u00178\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b<\u0010GR\u0018\u00104\u001a\u0004\u0018\u00010\u00178\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010\u001a8\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\bD\u00100R\u0016\u0010;\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\bL\u00100R\u0016\u0010H\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\bJ\u00100"}, d2 = {"Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "Landroid/os/Parcelable;", "", "p0", "p1", "Lcom/bpjstku/domain/user/model/SubscribedProgram;", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "Lcom/bpjstku/domain/vocation/model/Bank;", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "p18", "p19", "Lcom/bpjstku/domain/vocation/model/TrainingField;", "p20", "p21", "p22", "p23", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/domain/user/model/SubscribedProgram;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/domain/vocation/model/Bank;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/domain/general/model/CodeNamePair;Lcom/bpjstku/domain/general/model/CodeNamePair;Lcom/bpjstku/domain/vocation/model/TrainingField;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "INotificationSideChannelDefault", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "notify", "b", "getInterfaceDescriptor", "Lcom/bpjstku/domain/user/model/SubscribedProgram;", "TuitionPaymentFragmentbindingInflater1", "cancelAll", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "d", "write", "asInterface", "onTransact", "a", "INotificationSideChannelStub", "g", "asBinder", "Lcom/bpjstku/domain/vocation/model/Bank;", "INotificationSideChannel", "cancel", "RemoteActionCompatParcelizer", "INotificationSideChannelStubProxy", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "IconCompatParcelizer", "Lcom/bpjstku/domain/vocation/model/TrainingField;", "connect", "read", "MediaBrowserCompat"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VocationalRegistration implements Parcelable {
    public static final Parcelable.Creator<VocationalRegistration> CREATOR = new TuitionPaymentFragmentbindingInflater1();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public String g;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public CodeNamePair getInterfaceDescriptor;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public TrainingField connect;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    public String write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public String onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public String d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public Bank notify;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String asBinder;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public String cancel;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public CodeNamePair INotificationSideChannelStub;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String INotificationSideChannel;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public String read;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    public String IconCompatParcelizer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public String cancelAll;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public SubscribedProgram TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public String b;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public String a;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public String asInterface;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VocationalRegistration(String str, String str2, SubscribedProgram subscribedProgram, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Bank bank, String str10, String str11, String str12, String str13, String str14, String str15, String str16, CodeNamePair codeNamePair, CodeNamePair codeNamePair2, TrainingField trainingField, String str17, String str18, String str19) {
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.b = str2;
        this.TuitionPaymentFragmentbindingInflater1 = subscribedProgram;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
        this.d = str5;
        this.asInterface = str6;
        this.a = str7;
        this.g = str8;
        this.asBinder = str9;
        this.notify = bank;
        this.cancelAll = str10;
        this.INotificationSideChannel = str11;
        this.onTransact = str12;
        this.cancel = str13;
        this.INotificationSideChannelStubProxy = str14;
        this.RemoteActionCompatParcelizer = str15;
        this.INotificationSideChannelDefault = str16;
        this.INotificationSideChannelStub = codeNamePair;
        this.getInterfaceDescriptor = codeNamePair2;
        this.connect = trainingField;
        this.read = str17;
        this.write = str18;
        this.IconCompatParcelizer = str19;
    }

    public /* synthetic */ VocationalRegistration(String str, String str2, SubscribedProgram subscribedProgram, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Bank bank, String str10, String str11, String str12, String str13, String str14, String str15, String str16, CodeNamePair codeNamePair, CodeNamePair codeNamePair2, TrainingField trainingField, String str17, String str18, String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : subscribedProgram, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? null : bank, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11, (i & 8192) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? "" : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? "" : str16, (i & 262144) != 0 ? null : codeNamePair, (i & 524288) != 0 ? null : codeNamePair2, (i & 1048576) != 0 ? null : trainingField, (i & 2097152) != 0 ? "" : str17, (i & 4194304) != 0 ? "" : str18, (i & 8388608) != 0 ? "" : str19);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<VocationalRegistration> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VocationalRegistration createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VocationalRegistration(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SubscribedProgram.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Bank.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CodeNamePair.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CodeNamePair.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TrainingField.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VocationalRegistration[] newArray(int i) {
            return new VocationalRegistration[i];
        }
    }

    public VocationalRegistration() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VocationalRegistration)) {
            return false;
        }
        VocationalRegistration vocationalRegistration = (VocationalRegistration) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, vocationalRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.b, vocationalRegistration.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, vocationalRegistration.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, vocationalRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, vocationalRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.d, vocationalRegistration.d) && Intrinsics.areEqual(this.asInterface, vocationalRegistration.asInterface) && Intrinsics.areEqual(this.a, vocationalRegistration.a) && Intrinsics.areEqual(this.g, vocationalRegistration.g) && Intrinsics.areEqual(this.asBinder, vocationalRegistration.asBinder) && Intrinsics.areEqual(this.notify, vocationalRegistration.notify) && Intrinsics.areEqual(this.cancelAll, vocationalRegistration.cancelAll) && Intrinsics.areEqual(this.INotificationSideChannel, vocationalRegistration.INotificationSideChannel) && Intrinsics.areEqual(this.onTransact, vocationalRegistration.onTransact) && Intrinsics.areEqual(this.cancel, vocationalRegistration.cancel) && Intrinsics.areEqual(this.INotificationSideChannelStubProxy, vocationalRegistration.INotificationSideChannelStubProxy) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, vocationalRegistration.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.INotificationSideChannelDefault, vocationalRegistration.INotificationSideChannelDefault) && Intrinsics.areEqual(this.INotificationSideChannelStub, vocationalRegistration.INotificationSideChannelStub) && Intrinsics.areEqual(this.getInterfaceDescriptor, vocationalRegistration.getInterfaceDescriptor) && Intrinsics.areEqual(this.connect, vocationalRegistration.connect) && Intrinsics.areEqual(this.read, vocationalRegistration.read) && Intrinsics.areEqual(this.write, vocationalRegistration.write) && Intrinsics.areEqual(this.IconCompatParcelizer, vocationalRegistration.IconCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        int iHashCode2 = this.b.hashCode();
        SubscribedProgram subscribedProgram = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode3 = subscribedProgram == null ? 0 : subscribedProgram.hashCode();
        int iHashCode4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        int iHashCode5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        int iHashCode6 = this.d.hashCode();
        int iHashCode7 = this.asInterface.hashCode();
        int iHashCode8 = this.a.hashCode();
        int iHashCode9 = this.g.hashCode();
        int iHashCode10 = this.asBinder.hashCode();
        Bank bank = this.notify;
        int iHashCode11 = bank == null ? 0 : bank.hashCode();
        int iHashCode12 = this.cancelAll.hashCode();
        int iHashCode13 = this.INotificationSideChannel.hashCode();
        int iHashCode14 = this.onTransact.hashCode();
        int iHashCode15 = this.cancel.hashCode();
        int iHashCode16 = this.INotificationSideChannelStubProxy.hashCode();
        int iHashCode17 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode18 = this.INotificationSideChannelDefault.hashCode();
        CodeNamePair codeNamePair = this.INotificationSideChannelStub;
        int iHashCode19 = codeNamePair == null ? 0 : codeNamePair.hashCode();
        CodeNamePair codeNamePair2 = this.getInterfaceDescriptor;
        int iHashCode20 = codeNamePair2 == null ? 0 : codeNamePair2.hashCode();
        TrainingField trainingField = this.connect;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (trainingField != null ? trainingField.hashCode() : 0)) * 31) + this.read.hashCode()) * 31) + this.write.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str2 = this.b;
        SubscribedProgram subscribedProgram = this.TuitionPaymentFragmentbindingInflater1;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str5 = this.d;
        String str6 = this.asInterface;
        String str7 = this.a;
        String str8 = this.g;
        String str9 = this.asBinder;
        Bank bank = this.notify;
        String str10 = this.cancelAll;
        String str11 = this.INotificationSideChannel;
        String str12 = this.onTransact;
        String str13 = this.cancel;
        String str14 = this.INotificationSideChannelStubProxy;
        String str15 = this.RemoteActionCompatParcelizer;
        String str16 = this.INotificationSideChannelDefault;
        CodeNamePair codeNamePair = this.INotificationSideChannelStub;
        CodeNamePair codeNamePair2 = this.getInterfaceDescriptor;
        TrainingField trainingField = this.connect;
        String str17 = this.read;
        String str18 = this.write;
        String str19 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("VocationalRegistration(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str);
        sb.append(", b=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(subscribedProgram);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str4);
        sb.append(", d=");
        sb.append(str5);
        sb.append(", asInterface=");
        sb.append(str6);
        sb.append(", a=");
        sb.append(str7);
        sb.append(", g=");
        sb.append(str8);
        sb.append(", asBinder=");
        sb.append(str9);
        sb.append(", notify=");
        sb.append(bank);
        sb.append(", cancelAll=");
        sb.append(str10);
        sb.append(", INotificationSideChannel=");
        sb.append(str11);
        sb.append(", onTransact=");
        sb.append(str12);
        sb.append(", cancel=");
        sb.append(str13);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(str14);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str15);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(str16);
        sb.append(", INotificationSideChannelStub=");
        sb.append(codeNamePair);
        sb.append(", getInterfaceDescriptor=");
        sb.append(codeNamePair2);
        sb.append(", connect=");
        sb.append(trainingField);
        sb.append(", read=");
        sb.append(str17);
        sb.append(", write=");
        sb.append(str18);
        sb.append(", IconCompatParcelizer=");
        sb.append(str19);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.b);
        SubscribedProgram subscribedProgram = this.TuitionPaymentFragmentbindingInflater1;
        if (subscribedProgram == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            subscribedProgram.writeToParcel(p0, p1);
        }
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.d);
        p0.writeString(this.asInterface);
        p0.writeString(this.a);
        p0.writeString(this.g);
        p0.writeString(this.asBinder);
        Bank bank = this.notify;
        if (bank == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            bank.writeToParcel(p0, p1);
        }
        p0.writeString(this.cancelAll);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.onTransact);
        p0.writeString(this.cancel);
        p0.writeString(this.INotificationSideChannelStubProxy);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.INotificationSideChannelDefault);
        CodeNamePair codeNamePair = this.INotificationSideChannelStub;
        if (codeNamePair == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            codeNamePair.writeToParcel(p0, p1);
        }
        CodeNamePair codeNamePair2 = this.getInterfaceDescriptor;
        if (codeNamePair2 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            codeNamePair2.writeToParcel(p0, p1);
        }
        TrainingField trainingField = this.connect;
        if (trainingField == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            trainingField.writeToParcel(p0, p1);
        }
        p0.writeString(this.read);
        p0.writeString(this.write);
        p0.writeString(this.IconCompatParcelizer);
    }
}
