package com.bpjstku.presentation.membership.registration.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.ViewCompat;
import com.bpjstku.util.constant.MembershipType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020(2\u0006\u0010\u0004\u001a\u00020\u001f¢\u0006\u0004\b*\u0010+R\u0016\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\u0016\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010-R\u0016\u00105\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010-R\u0016\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010-R\u0016\u00101\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010-R\u0016\u00103\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010-R\u0016\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010-R\u0016\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010-R\u0016\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010-R\u0016\u0010=\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010-R\u0016\u0010?\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010-R\u0016\u0010/\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010-R\u0016\u00109\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010-R\u0016\u0010A\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010-R\u0014\u0010C\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010-R\u0016\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010-R\u0016\u0010B\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010-R\u0016\u0010@\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010D\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u0010F\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010-R\u0016\u0010;\u001a\u00020\u001a8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b=\u0010GR\u0016\u0010<\u001a\u00020\u001a8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b?\u0010G"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "Lcom/bpjstku/util/constant/MembershipType;", "p19", "p20", "p21", "", "p22", "p23", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/util/constant/MembershipType;Ljava/lang/String;Ljava/lang/String;ZZ)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "onTransact", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "INotificationSideChannel", "TuitionPaymentFragmentbindingInflater1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asBinder", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "read", "asInterface", "notify", "a", "write", "MediaBrowserCompat", "cancelAll", "INotificationSideChannelDefault", "cancel", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "INotificationSideChannelStub", "RemoteActionCompatParcelizer", "connect", "Lcom/bpjstku/util/constant/MembershipType;", "IconCompatParcelizer", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RegistrationForUnregistered implements Parcelable {
    public static final Parcelable.Creator<RegistrationForUnregistered> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public final String cancel;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final String notify;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    public final String cancelAll;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final String INotificationSideChannelStub;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String connect;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String INotificationSideChannel;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final String b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String IconCompatParcelizer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public boolean MediaBrowserCompat;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public boolean write;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private final MembershipType INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final String getInterfaceDescriptor;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final String a;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public final String asInterface;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public final String onTransact;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RegistrationForUnregistered(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, MembershipType membershipType, String str20, String str21, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str17, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.TuitionPaymentFragmentbindingInflater1 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
        this.b = str4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str5;
        this.d = str6;
        this.g = str7;
        this.asBinder = str8;
        this.asInterface = str9;
        this.a = str10;
        this.onTransact = str11;
        this.cancelAll = str12;
        this.cancel = str13;
        this.INotificationSideChannel = str14;
        this.notify = str15;
        this.getInterfaceDescriptor = str16;
        this.RemoteActionCompatParcelizer = str17;
        this.INotificationSideChannelDefault = str18;
        this.INotificationSideChannelStub = str19;
        this.INotificationSideChannelStubProxy = membershipType;
        this.connect = str20;
        this.IconCompatParcelizer = str21;
        this.write = z;
        this.MediaBrowserCompat = z2;
    }

    public /* synthetic */ RegistrationForUnregistered(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, MembershipType membershipType, String str20, String str21, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? null : membershipType, (i & 1048576) != 0 ? "" : str20, (i & 2097152) == 0 ? str21 : null, (i & 4194304) != 0 ? false : z, (i & 8388608) == 0 ? z2 : false);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Parcelable.Creator<RegistrationForUnregistered> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RegistrationForUnregistered createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RegistrationForUnregistered(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MembershipType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RegistrationForUnregistered[] newArray(int i) {
            return new RegistrationForUnregistered[i];
        }
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationForUnregistered registrationForUnregistered, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, MembershipType membershipType, String str20, String str21, boolean z, boolean z2, int i) {
        String str22 = (i & 1) != 0 ? registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : str;
        String str23 = (i & 2) != 0 ? registrationForUnregistered.TuitionPaymentFragmentbindingInflater1 : str2;
        String str24 = (i & 4) != 0 ? registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : str3;
        String str25 = (i & 8) != 0 ? registrationForUnregistered.b : str4;
        String str26 = (i & 16) != 0 ? registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : str5;
        String str27 = (i & 32) != 0 ? registrationForUnregistered.d : str6;
        String str28 = (i & 64) != 0 ? registrationForUnregistered.g : str7;
        String str29 = (i & 128) != 0 ? registrationForUnregistered.asBinder : str8;
        String str30 = (i & 256) != 0 ? registrationForUnregistered.asInterface : str9;
        String str31 = (i & 512) != 0 ? registrationForUnregistered.a : str10;
        String str32 = (i & 1024) != 0 ? registrationForUnregistered.onTransact : str11;
        String str33 = (i & 2048) != 0 ? registrationForUnregistered.cancelAll : str12;
        String str34 = (i & 4096) != 0 ? registrationForUnregistered.cancel : str13;
        String str35 = (i & 8192) != 0 ? registrationForUnregistered.INotificationSideChannel : str14;
        String str36 = (i & 16384) != 0 ? registrationForUnregistered.notify : str15;
        String str37 = (i & 32768) != 0 ? registrationForUnregistered.getInterfaceDescriptor : str16;
        String str38 = (i & 65536) != 0 ? registrationForUnregistered.RemoteActionCompatParcelizer : str17;
        String str39 = str34;
        String str40 = (i & 131072) != 0 ? registrationForUnregistered.INotificationSideChannelDefault : str18;
        String str41 = (i & 262144) != 0 ? registrationForUnregistered.INotificationSideChannelStub : str19;
        MembershipType membershipType2 = (i & 524288) != 0 ? registrationForUnregistered.INotificationSideChannelStubProxy : membershipType;
        String str42 = (i & 1048576) != 0 ? registrationForUnregistered.connect : str20;
        String str43 = (i & 2097152) != 0 ? registrationForUnregistered.IconCompatParcelizer : str21;
        boolean z3 = (i & 4194304) != 0 ? registrationForUnregistered.write : z;
        boolean z4 = (i & 8388608) != 0 ? registrationForUnregistered.MediaBrowserCompat : z2;
        Intrinsics.checkNotNullParameter(str38, "");
        return new RegistrationForUnregistered(str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str39, str35, str36, str37, str38, str40, str41, membershipType2, str42, str43, z3, z4);
    }

    public RegistrationForUnregistered() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, ViewCompat.MEASURED_SIZE_MASK, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RegistrationForUnregistered)) {
            return false;
        }
        RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, registrationForUnregistered.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.b, registrationForUnregistered.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.d, registrationForUnregistered.d) && Intrinsics.areEqual(this.g, registrationForUnregistered.g) && Intrinsics.areEqual(this.asBinder, registrationForUnregistered.asBinder) && Intrinsics.areEqual(this.asInterface, registrationForUnregistered.asInterface) && Intrinsics.areEqual(this.a, registrationForUnregistered.a) && Intrinsics.areEqual(this.onTransact, registrationForUnregistered.onTransact) && Intrinsics.areEqual(this.cancelAll, registrationForUnregistered.cancelAll) && Intrinsics.areEqual(this.cancel, registrationForUnregistered.cancel) && Intrinsics.areEqual(this.INotificationSideChannel, registrationForUnregistered.INotificationSideChannel) && Intrinsics.areEqual(this.notify, registrationForUnregistered.notify) && Intrinsics.areEqual(this.getInterfaceDescriptor, registrationForUnregistered.getInterfaceDescriptor) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, registrationForUnregistered.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.INotificationSideChannelDefault, registrationForUnregistered.INotificationSideChannelDefault) && Intrinsics.areEqual(this.INotificationSideChannelStub, registrationForUnregistered.INotificationSideChannelStub) && this.INotificationSideChannelStubProxy == registrationForUnregistered.INotificationSideChannelStubProxy && Intrinsics.areEqual(this.connect, registrationForUnregistered.connect) && Intrinsics.areEqual(this.IconCompatParcelizer, registrationForUnregistered.IconCompatParcelizer) && this.write == registrationForUnregistered.write && this.MediaBrowserCompat == registrationForUnregistered.MediaBrowserCompat;
    }

    public final int hashCode() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.b;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.d;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.g;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.asBinder;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.asInterface;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.a;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.onTransact;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.cancelAll;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.cancel;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.INotificationSideChannel;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.notify;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.getInterfaceDescriptor;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        int iHashCode17 = this.RemoteActionCompatParcelizer.hashCode();
        String str17 = this.INotificationSideChannelDefault;
        int iHashCode18 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.INotificationSideChannelStub;
        int iHashCode19 = str18 == null ? 0 : str18.hashCode();
        MembershipType membershipType = this.INotificationSideChannelStubProxy;
        int iHashCode20 = membershipType == null ? 0 : membershipType.hashCode();
        String str19 = this.connect;
        int iHashCode21 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.IconCompatParcelizer;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (str20 != null ? str20.hashCode() : 0)) * 31) + Boolean.hashCode(this.write)) * 31) + Boolean.hashCode(this.MediaBrowserCompat);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str4 = this.b;
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str6 = this.d;
        String str7 = this.g;
        String str8 = this.asBinder;
        String str9 = this.asInterface;
        String str10 = this.a;
        String str11 = this.onTransact;
        String str12 = this.cancelAll;
        String str13 = this.cancel;
        String str14 = this.INotificationSideChannel;
        String str15 = this.notify;
        String str16 = this.getInterfaceDescriptor;
        String str17 = this.RemoteActionCompatParcelizer;
        String str18 = this.INotificationSideChannelDefault;
        String str19 = this.INotificationSideChannelStub;
        MembershipType membershipType = this.INotificationSideChannelStubProxy;
        String str20 = this.connect;
        String str21 = this.IconCompatParcelizer;
        boolean z = this.write;
        boolean z2 = this.MediaBrowserCompat;
        StringBuilder sb = new StringBuilder("RegistrationForUnregistered(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str3);
        sb.append(", b=");
        sb.append(str4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str5);
        sb.append(", d=");
        sb.append(str6);
        sb.append(", g=");
        sb.append(str7);
        sb.append(", asBinder=");
        sb.append(str8);
        sb.append(", asInterface=");
        sb.append(str9);
        sb.append(", a=");
        sb.append(str10);
        sb.append(", onTransact=");
        sb.append(str11);
        sb.append(", cancelAll=");
        sb.append(str12);
        sb.append(", cancel=");
        sb.append(str13);
        sb.append(", INotificationSideChannel=");
        sb.append(str14);
        sb.append(", notify=");
        sb.append(str15);
        sb.append(", getInterfaceDescriptor=");
        sb.append(str16);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str17);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(str18);
        sb.append(", INotificationSideChannelStub=");
        sb.append(str19);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(membershipType);
        sb.append(", connect=");
        sb.append(str20);
        sb.append(", IconCompatParcelizer=");
        sb.append(str21);
        sb.append(", write=");
        sb.append(z);
        sb.append(", MediaBrowserCompat=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.d);
        p0.writeString(this.g);
        p0.writeString(this.asBinder);
        p0.writeString(this.asInterface);
        p0.writeString(this.a);
        p0.writeString(this.onTransact);
        p0.writeString(this.cancelAll);
        p0.writeString(this.cancel);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.notify);
        p0.writeString(this.getInterfaceDescriptor);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.INotificationSideChannelDefault);
        p0.writeString(this.INotificationSideChannelStub);
        MembershipType membershipType = this.INotificationSideChannelStubProxy;
        if (membershipType == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            membershipType.writeToParcel(p0, p1);
        }
        p0.writeString(this.connect);
        p0.writeString(this.IconCompatParcelizer);
        p0.writeInt(this.write ? 1 : 0);
        p0.writeInt(this.MediaBrowserCompat ? 1 : 0);
    }
}
