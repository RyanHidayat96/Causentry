package com.bpjstku.domain.scholarship.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bpjstku.data.scholarship.model.request.ScholarshipDataDocumentForInsert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002H×\u0001¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u0013¢\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\u0014\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010'R\u0014\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010'R\u0014\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010'R\u0014\u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010'R\u0014\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010'R\u0014\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010'R\u0014\u00105\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010'R\u0014\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010'R\u0014\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010'R\u0014\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010'R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b(\u00108R\u0014\u0010+\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00109R\u0016\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b3\u0010'R\u0016\u0010)\u001a\u00020\u00168\u0006@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b*\u0010;"}, d2 = {"Lcom/bpjstku/domain/scholarship/model/ScholarInsertResult;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipDataDocumentForInsert;", "p13", "", "p14", "p15", "", "p16", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Z)V", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "INotificationSideChannelStub", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "INotificationSideChannelStubProxy", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "cancelAll", "TuitionPaymentFragmentbindingInflater1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "b", "asBinder", "onTransact", "d", "notify", "a", "cancel", "INotificationSideChannel", "Ljava/util/List;", "I", "INotificationSideChannelDefault", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarInsertResult implements Parcelable {
    public static final Parcelable.Creator<ScholarInsertResult> CREATOR = new TuitionPaymentFragmentbindingInflater1();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final int cancelAll;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public boolean INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public List<ScholarshipDataDocumentForInsert> onTransact;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String INotificationSideChannel;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final String cancel;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final String notify;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final String a;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final String d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ScholarInsertResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<ScholarshipDataDocumentForInsert> list, int i, String str14, boolean z) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
        this.b = str5;
        this.g = str6;
        this.asBinder = str7;
        this.asInterface = str8;
        this.d = str9;
        this.a = str10;
        this.cancel = str11;
        this.INotificationSideChannel = str12;
        this.notify = str13;
        this.onTransact = list;
        this.cancelAll = i;
        this.INotificationSideChannelDefault = str14;
        this.INotificationSideChannelStubProxy = z;
    }

    public /* synthetic */ ScholarInsertResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, int i, String str14, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, list, i, (i2 & 32768) != 0 ? "" : str14, (i2 & 65536) != 0 ? false : z);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<ScholarInsertResult> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ScholarInsertResult createFromParcel(Parcel parcel) {
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
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(ScholarshipDataDocumentForInsert.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            return new ScholarInsertResult(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, arrayList, parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ScholarInsertResult[] newArray(int i) {
            return new ScholarInsertResult[i];
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarInsertResult)) {
            return false;
        }
        ScholarInsertResult scholarInsertResult = (ScholarInsertResult) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, scholarInsertResult.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, scholarInsertResult.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, scholarInsertResult.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, scholarInsertResult.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, scholarInsertResult.b) && Intrinsics.areEqual(this.g, scholarInsertResult.g) && Intrinsics.areEqual(this.asBinder, scholarInsertResult.asBinder) && Intrinsics.areEqual(this.asInterface, scholarInsertResult.asInterface) && Intrinsics.areEqual(this.d, scholarInsertResult.d) && Intrinsics.areEqual(this.a, scholarInsertResult.a) && Intrinsics.areEqual(this.cancel, scholarInsertResult.cancel) && Intrinsics.areEqual(this.INotificationSideChannel, scholarInsertResult.INotificationSideChannel) && Intrinsics.areEqual(this.notify, scholarInsertResult.notify) && Intrinsics.areEqual(this.onTransact, scholarInsertResult.onTransact) && this.cancelAll == scholarInsertResult.cancelAll && Intrinsics.areEqual(this.INotificationSideChannelDefault, scholarInsertResult.INotificationSideChannelDefault) && this.INotificationSideChannelStubProxy == scholarInsertResult.INotificationSideChannelStubProxy;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.b.hashCode()) * 31) + this.g.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.cancel.hashCode()) * 31) + this.INotificationSideChannel.hashCode()) * 31) + this.notify.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + Integer.hashCode(this.cancelAll)) * 31) + this.INotificationSideChannelDefault.hashCode()) * 31) + Boolean.hashCode(this.INotificationSideChannelStubProxy);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str5 = this.b;
        String str6 = this.g;
        String str7 = this.asBinder;
        String str8 = this.asInterface;
        String str9 = this.d;
        String str10 = this.a;
        String str11 = this.cancel;
        String str12 = this.INotificationSideChannel;
        String str13 = this.notify;
        List<ScholarshipDataDocumentForInsert> list = this.onTransact;
        int i = this.cancelAll;
        String str14 = this.INotificationSideChannelDefault;
        boolean z = this.INotificationSideChannelStubProxy;
        StringBuilder sb = new StringBuilder("ScholarInsertResult(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str4);
        sb.append(", b=");
        sb.append(str5);
        sb.append(", g=");
        sb.append(str6);
        sb.append(", asBinder=");
        sb.append(str7);
        sb.append(", asInterface=");
        sb.append(str8);
        sb.append(", d=");
        sb.append(str9);
        sb.append(", a=");
        sb.append(str10);
        sb.append(", cancel=");
        sb.append(str11);
        sb.append(", INotificationSideChannel=");
        sb.append(str12);
        sb.append(", notify=");
        sb.append(str13);
        sb.append(", onTransact=");
        sb.append(list);
        sb.append(", cancelAll=");
        sb.append(i);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(str14);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.b);
        p0.writeString(this.g);
        p0.writeString(this.asBinder);
        p0.writeString(this.asInterface);
        p0.writeString(this.d);
        p0.writeString(this.a);
        p0.writeString(this.cancel);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.notify);
        List<ScholarshipDataDocumentForInsert> list = this.onTransact;
        p0.writeInt(list.size());
        Iterator<ScholarshipDataDocumentForInsert> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(p0, p1);
        }
        p0.writeInt(this.cancelAll);
        p0.writeString(this.INotificationSideChannelDefault);
        p0.writeInt(this.INotificationSideChannelStubProxy ? 1 : 0);
    }
}
