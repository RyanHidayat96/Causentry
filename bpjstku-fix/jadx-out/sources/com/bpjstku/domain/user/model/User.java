package com.bpjstku.domain.user.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bpjstku.presentation.program.model.ProgramInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020\u001d¢\u0006\u0004\b)\u0010*R\u0016\u0010-\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010,R\u0016\u00103\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010,R\u0016\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010,R\u0016\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010,R\u0016\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010,R\u0016\u00107\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010,R\u0016\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010,R\u0016\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010,R\u0016\u0010<\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010,R\u0016\u0010=\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u0016\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00140\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010?R\u0018\u00108\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b<\u0010,R\u0016\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010,R\u0016\u0010;\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010,R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00190\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010?"}, d2 = {"Lcom/bpjstku/domain/user/model/User;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "", "Lcom/bpjstku/domain/user/model/SubscribedProgram;", "p14", "Lcom/bpjstku/presentation/program/model/ProgramInfo;", "p15", "p16", "p17", "p18", "Lcom/bpjstku/data/user/model/response/FiturList;", "p19", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "g", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "INotificationSideChannel", "TuitionPaymentFragmentbindingInflater1", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asInterface", "cancel", "cancelAll", "asBinder", "INotificationSideChannelDefault", "a", "RemoteActionCompatParcelizer", "INotificationSideChannelStubProxy", "onTransact", "notify", "INotificationSideChannelStub", "Ljava/util/List;", "getInterfaceDescriptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class User implements Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final String a;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final List<SubscribedProgram> INotificationSideChannel;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final String onTransact;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String cancelAll;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final List<ProgramInfo> INotificationSideChannelStub;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final List<com.bpjstku.data.user.model.response.FiturList> getInterfaceDescriptor;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final String g;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public final String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public String INotificationSideChannelDefault;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public User(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List<SubscribedProgram> list, List<ProgramInfo> list2, String str15, String str16, String str17, List<com.bpjstku.data.user.model.response.FiturList> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str4;
        this.b = str5;
        this.d = str6;
        this.g = str7;
        this.asBinder = str8;
        this.a = str9;
        this.asInterface = str10;
        this.cancel = str11;
        this.onTransact = str12;
        this.notify = str13;
        this.cancelAll = str14;
        this.INotificationSideChannel = list;
        this.INotificationSideChannelStub = list2;
        this.INotificationSideChannelDefault = str15;
        this.RemoteActionCompatParcelizer = str16;
        this.INotificationSideChannelStubProxy = str17;
        this.getInterfaceDescriptor = list3;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Parcelable.Creator<User> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ User createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(SubscribedProgram.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            ArrayList arrayList2 = arrayList;
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                arrayList3.add(ProgramInfo.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            ArrayList arrayList4 = arrayList3;
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i5);
            int i6 = 0;
            while (i6 != i5) {
                arrayList5.add(com.bpjstku.data.user.model.response.FiturList.CREATOR.createFromParcel(parcel));
                i6++;
                i5 = i5;
            }
            return new User(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, arrayList2, arrayList4, string15, string16, string17, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ User[] newArray(int i) {
            return new User[i];
        }
    }

    public static /* synthetic */ User b(User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list, List list2, String str15, String str16, String str17, List list3, int i) {
        String str18 = (i & 1) != 0 ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : str;
        String str19 = (i & 2) != 0 ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : str2;
        String str20 = (i & 4) != 0 ? user.TuitionPaymentFragmentbindingInflater1 : str3;
        String str21 = (i & 8) != 0 ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : str4;
        String str22 = (i & 16) != 0 ? user.b : str5;
        String str23 = (i & 32) != 0 ? user.d : str6;
        String str24 = (i & 64) != 0 ? user.g : str7;
        String str25 = (i & 128) != 0 ? user.asBinder : str8;
        String str26 = (i & 256) != 0 ? user.a : str9;
        String str27 = (i & 512) != 0 ? user.asInterface : str10;
        String str28 = (i & 1024) != 0 ? user.cancel : str11;
        String str29 = (i & 2048) != 0 ? user.onTransact : str12;
        String str30 = (i & 4096) != 0 ? user.notify : str13;
        String str31 = (i & 8192) != 0 ? user.cancelAll : str14;
        List list4 = (i & 16384) != 0 ? user.INotificationSideChannel : list;
        String str32 = str30;
        List list5 = (i & 32768) != 0 ? user.INotificationSideChannelStub : list2;
        String str33 = str29;
        String str34 = (i & 65536) != 0 ? user.INotificationSideChannelDefault : str15;
        String str35 = (i & 131072) != 0 ? user.RemoteActionCompatParcelizer : str16;
        String str36 = (i & 262144) != 0 ? user.INotificationSideChannelStubProxy : str17;
        List list6 = (i & 524288) != 0 ? user.getInterfaceDescriptor : list3;
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        return new User(str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str33, str32, str31, list4, list5, str34, str35, str36, list6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof User)) {
            return false;
        }
        User user = (User) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, user.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, user.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, user.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, user.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.b, user.b) && Intrinsics.areEqual(this.d, user.d) && Intrinsics.areEqual(this.g, user.g) && Intrinsics.areEqual(this.asBinder, user.asBinder) && Intrinsics.areEqual(this.a, user.a) && Intrinsics.areEqual(this.asInterface, user.asInterface) && Intrinsics.areEqual(this.cancel, user.cancel) && Intrinsics.areEqual(this.onTransact, user.onTransact) && Intrinsics.areEqual(this.notify, user.notify) && Intrinsics.areEqual(this.cancelAll, user.cancelAll) && Intrinsics.areEqual(this.INotificationSideChannel, user.INotificationSideChannel) && Intrinsics.areEqual(this.INotificationSideChannelStub, user.INotificationSideChannelStub) && Intrinsics.areEqual(this.INotificationSideChannelDefault, user.INotificationSideChannelDefault) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, user.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.INotificationSideChannelStubProxy, user.INotificationSideChannelStubProxy) && Intrinsics.areEqual(this.getInterfaceDescriptor, user.getInterfaceDescriptor);
    }

    public final int hashCode() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.b;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.d;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.g;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.asBinder;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.a;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.asInterface;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.cancel;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.onTransact;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.notify;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.cancelAll;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        int iHashCode15 = this.INotificationSideChannel.hashCode();
        int iHashCode16 = this.INotificationSideChannelStub.hashCode();
        String str15 = this.INotificationSideChannelDefault;
        int iHashCode17 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.RemoteActionCompatParcelizer;
        int iHashCode18 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.INotificationSideChannelStubProxy;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (str17 != null ? str17.hashCode() : 0)) * 31) + this.getInterfaceDescriptor.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str5 = this.b;
        String str6 = this.d;
        String str7 = this.g;
        String str8 = this.asBinder;
        String str9 = this.a;
        String str10 = this.asInterface;
        String str11 = this.cancel;
        String str12 = this.onTransact;
        String str13 = this.notify;
        String str14 = this.cancelAll;
        List<SubscribedProgram> list = this.INotificationSideChannel;
        List<ProgramInfo> list2 = this.INotificationSideChannelStub;
        String str15 = this.INotificationSideChannelDefault;
        String str16 = this.RemoteActionCompatParcelizer;
        String str17 = this.INotificationSideChannelStubProxy;
        List<com.bpjstku.data.user.model.response.FiturList> list3 = this.getInterfaceDescriptor;
        StringBuilder sb = new StringBuilder("User(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str4);
        sb.append(", b=");
        sb.append(str5);
        sb.append(", d=");
        sb.append(str6);
        sb.append(", g=");
        sb.append(str7);
        sb.append(", asBinder=");
        sb.append(str8);
        sb.append(", a=");
        sb.append(str9);
        sb.append(", asInterface=");
        sb.append(str10);
        sb.append(", cancel=");
        sb.append(str11);
        sb.append(", onTransact=");
        sb.append(str12);
        sb.append(", notify=");
        sb.append(str13);
        sb.append(", cancelAll=");
        sb.append(str14);
        sb.append(", INotificationSideChannel=");
        sb.append(list);
        sb.append(", INotificationSideChannelStub=");
        sb.append(list2);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(str15);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str16);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(str17);
        sb.append(", getInterfaceDescriptor=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.b);
        p0.writeString(this.d);
        p0.writeString(this.g);
        p0.writeString(this.asBinder);
        p0.writeString(this.a);
        p0.writeString(this.asInterface);
        p0.writeString(this.cancel);
        p0.writeString(this.onTransact);
        p0.writeString(this.notify);
        p0.writeString(this.cancelAll);
        List<SubscribedProgram> list = this.INotificationSideChannel;
        p0.writeInt(list.size());
        Iterator<SubscribedProgram> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(p0, p1);
        }
        List<ProgramInfo> list2 = this.INotificationSideChannelStub;
        p0.writeInt(list2.size());
        Iterator<ProgramInfo> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(p0, p1);
        }
        p0.writeString(this.INotificationSideChannelDefault);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.INotificationSideChannelStubProxy);
        List<com.bpjstku.data.user.model.response.FiturList> list3 = this.getInterfaceDescriptor;
        p0.writeInt(list3.size());
        Iterator<com.bpjstku.data.user.model.response.FiturList> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(p0, p1);
        }
    }
}
