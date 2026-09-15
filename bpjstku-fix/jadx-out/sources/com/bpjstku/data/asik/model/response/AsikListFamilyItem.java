package com.bpjstku.data.asik.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ|\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\"\u0010\u000fJ\u001d\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u001a¢\u0006\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010+R$\u0010,\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u000f\"\u0004\b.\u0010+R$\u0010/\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010(\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010+R$\u00102\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u000f\"\u0004\b4\u0010+R$\u00105\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010(\u001a\u0004\b6\u0010\u000f\"\u0004\b7\u0010+R$\u00108\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\u000f\"\u0004\b:\u0010+R$\u0010;\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010(\u001a\u0004\b<\u0010\u000f\"\u0004\b=\u0010+R$\u0010>\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010(\u001a\u0004\b?\u0010\u000f\"\u0004\b@\u0010+R$\u0010A\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010(\u001a\u0004\bB\u0010\u000f\"\u0004\bC\u0010+"}, d2 = {"Lcom/bpjstku/data/asik/model/response/AsikListFamilyItem;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/asik/model/response/AsikListFamilyItem;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "identityNumber", "Ljava/lang/String;", "getIdentityNumber", "setIdentityNumber", "(Ljava/lang/String;)V", "familyCardNumber", "getFamilyCardNumber", "setFamilyCardNumber", "fullName", "getFullName", "setFullName", HintConstants.AUTOFILL_HINT_GENDER, "getGender", "setGender", "birthPlace", "getBirthPlace", "setBirthPlace", "birthDate", "getBirthDate", "setBirthDate", "maritalStatus", "getMaritalStatus", "setMaritalStatus", "familyStatus", "getFamilyStatus", "setFamilyStatus", PlaceTypes.ADDRESS, "getAddress", "setAddress"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AsikListFamilyItem implements Parcelable {
    public static final int $stable;
    public static final Parcelable.Creator<AsikListFamilyItem> CREATOR;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private static int g;

    @SerializedName(PlaceTypes.ADDRESS)
    private String address;

    @SerializedName("birthDate")
    private String birthDate;

    @SerializedName("birthPlace")
    private String birthPlace;

    @SerializedName("familyCardNumber")
    private String familyCardNumber;

    @SerializedName("familyStatus")
    private String familyStatus;

    @SerializedName("fullName")
    private String fullName;

    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    private String gender;

    @SerializedName("identityNumber")
    private String identityNumber;

    @SerializedName("maritalStatus")
    private String maritalStatus;
    private static final byte[] $$c = {2, -84, 82, -15};
    private static final int $$f = 126;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {123, -2, -101, -104, -13, -10, 25, -53, -10, 14, -23, -16, -22, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$e = 181;
    private static final byte[] $$a = {84, 10, 24, -102, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 207;
    private static int asBinder = 0;
    private static int asInterface = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f381a = 1;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AsikListFamilyItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AsikListFamilyItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AsikListFamilyItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AsikListFamilyItem[] newArray(int i) {
            return new AsikListFamilyItem[i];
        }
    }

    private static void d(int i, int i2, byte b2, Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = (i2 * 14) + 84;
        int i4 = 108 - (b2 * 52);
        byte[] bArr2 = new byte[53 - i];
        int i5 = 52 - i;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i5 + i4;
            i4++;
            i3 = i7 - 11;
            i6 = -1;
        }
        while (true) {
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4++;
            i3 = (i3 + bArr[i4]) - 11;
            i6 = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 28
            int r8 = 38 - r8
            int r9 = r9 * 9
            int r9 = 12 - r9
            int r7 = r7 * 13
            int r7 = 97 - r7
            byte[] r0 = com.bpjstku.data.asik.model.response.AsikListFamilyItem.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2f
        L17:
            r3 = r2
        L18:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2f:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-10)
            r9 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.response.AsikListFamilyItem.e(byte, short, byte, java.lang.Object[]):void");
    }

    public AsikListFamilyItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.identityNumber = str;
        this.familyCardNumber = str2;
        this.fullName = str3;
        this.gender = str4;
        this.birthPlace = str5;
        this.birthDate = str6;
        this.maritalStatus = str7;
        this.familyStatus = str8;
        this.address = str9;
    }

    public final String getIdentityNumber() {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.identityNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setIdentityNumber(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.identityNumber = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFamilyCardNumber() {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.familyCardNumber;
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return str;
    }

    public final void setFamilyCardNumber(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.familyCardNumber = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFullName() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 115;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.fullName;
        int i5 = i2 + 93;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setFullName(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.fullName = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getGender() {
        String str;
        int i = 2 % 2;
        int i2 = asInterface + 103;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            str = this.gender;
            int i4 = 28 / 0;
        } else {
            str = this.gender;
        }
        int i5 = i3 + 33;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setGender(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.gender = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 33;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String getBirthPlace() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.birthPlace;
        int i5 = i3 + 67;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setBirthPlace(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.birthPlace = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBirthDate() {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.birthDate;
        }
        throw null;
    }

    public final void setBirthDate(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.birthDate = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public final String getMaritalStatus() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 85;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.maritalStatus;
            int i4 = 73 / 0;
        } else {
            str = this.maritalStatus;
        }
        int i5 = i2 + 107;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
        return str;
    }

    public final void setMaritalStatus(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.maritalStatus = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFamilyStatus() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.familyStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setFamilyStatus(String str) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 69;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.familyStatus = str;
        int i5 = i2 + 65;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAddress() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 81;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.address;
        int i5 = i2 + 19;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01c3 A[PHI: r0
  0x01c3: PHI (r0v13 int) = (r0v12 int), (r0v39 int) binds: [B:38:0x01c1, B:35:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x01c5 A[PHI: r0
  0x01c5: PHI (r0v36 int) = (r0v12 int), (r0v39 int) binds: [B:38:0x01c1, B:35:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            long j = 0;
            int i8 = -1;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) (-1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2267 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0) + 34, 1387473586, false, $$g(b3, (byte) (b3 + 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i9 = $10 + 49;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = $11 + 117;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = 0;
                    while (i13 < length) {
                        int i14 = $10 + 59;
                        $11 = i14 % 128;
                        int i15 = i14 % i6;
                        Object[] objArr3 = {Integer.valueOf(bArr[i13])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int i16 = 3359 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int i17 = (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 18;
                            byte b4 = (byte) i8;
                            byte b5 = (byte) (b4 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, i16, i17, -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i13] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i13++;
                        i6 = 2;
                        j = 0;
                        i8 = -1;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - Process.getGidForName("")), 2267 - TextUtils.getTrimmedLength(""), TextUtils.getCapsMode("", 0, 0) + 33, 1387473586, false, $$g(b6, (byte) (b6 + 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i18 = $11 + 63;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    i4 = ((i3 + iIntValue) % 2) - ((int) (((long) TuitionPaymentFragmentbindingInflater1) + 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) (-1);
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 55905), 2855 - View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) "", '0') + 14, -1529949196, false, $$g(b7, b8, (byte) (b8 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr4 != null) {
                    int i19 = $10 + 67;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i21 = 0;
                    while (i21 < length2) {
                        int i22 = $10 + 75;
                        $11 = i22 % 128;
                        if (i22 % 2 == 0) {
                            bArr5[i21] = (byte) (((long) bArr4[i21]) ^ 3046761265686732006L);
                        } else {
                            bArr5[i21] = (byte) (((long) bArr4[i21]) ^ 3046761265686732006L);
                            i21++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i23]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i24]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
            int i25 = $10 + 15;
            $11 = i25 % 128;
            if (i25 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final void setAddress(String str) {
        int i;
        int length;
        Object[] objArr;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 31534);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 922;
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 28;
            byte b2 = $$a[132];
            Object[] objArr2 = new Object[1];
            d((byte) 52, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, iLastIndexOf, packedPositionGroup, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(319096689 - TextUtils.getCapsMode("", 0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 47, (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 52), (byte) ExpandableListView.getPackedPositionType(0L), (-262866992) - (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 319096693, (-47) - TextUtils.getOffsetAfter("", 0), (short) (46 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-262866970) - (KeyEvent.getMaxKeyCode() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
            int iLastIndexOf2 = 920 - TextUtils.lastIndexOf("", '0', 0);
            int i3 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27;
            byte[] bArr = $$a;
            byte b3 = bArr[7];
            Object[] objArr5 = new Object[1];
            d(b3, b3, bArr[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iLastIndexOf2, i3, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = asBinder + 61;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cCombineMeasuredStates = (char) (31533 - View.combineMeasuredStates(0, 0));
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 921;
                int iNormalizeMetaState = 28 - KeyEvent.normalizeMetaState(0);
                byte b4 = (byte) ($$b & 63);
                byte b5 = $$a[7];
                Object[] objArr6 = new Object[1];
                d(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, threadPriority, iNormalizeMetaState, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i6 = (((81443043 + (((~((-1657579274) | iFreeMemory)) | 46180096) * 336)) + (((~(iFreeMemory | 116500370)) | (-1727899548)) * (-168))) + (((~((~iFreeMemory) | 116500370)) | (-1657579274)) * 168)) - 1216447136;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(ImageFormat.getBitsPerPixel(0) + 319096690, (-48) - TextUtils.lastIndexOf("", '0', 0, 0), (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 94), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (-262866923) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(View.combineMeasuredStates(0, 0) + 319096691, Color.rgb(0, 0, 0) + 16777169, (short) (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) Color.alpha(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 262866897, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            if (str != null) {
                int i9 = asBinder + 27;
                asInterface = i9 % 128;
                i = 2;
                int i10 = i9 % 2;
                length = str.length();
            } else {
                i = 2;
                length = 0;
            }
            int i11 = asBinder + 91;
            asInterface = i11 % 128;
            int i12 = i11 % i;
            try {
                Object[] objArr10 = new Object[4];
                objArr10[3] = -1216447136;
                objArr10[i] = 0;
                objArr10[1] = Integer.valueOf(length);
                objArr10[0] = applicationContext;
                byte[] bArr2 = $$d;
                byte b6 = bArr2[37];
                byte b7 = bArr2[16];
                Object[] objArr11 = new Object[1];
                e(b6, b7, b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr2[16];
                byte b9 = bArr2[37];
                Object[] objArr12 = new Object[1];
                e(b8, b9, b9, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cNormalizeMetaState = (char) (31533 - KeyEvent.normalizeMetaState(0));
                    int i13 = 921 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i14 = 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte b10 = (byte) ($$b & 63);
                    byte b11 = $$a[7];
                    Object[] objArr13 = new Object[1];
                    d(b10, b11, b11, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, i13, i14, -1142834547, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(319096690 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-47) - (ViewConfiguration.getFadingEdgeLength() >> 16), (short) ((-52) - MotionEvent.axisFromString("")), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (-262866993) - Process.getGidForName(""), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(319096693 - ExpandableListView.getPackedPositionType(0L), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 47, (short) (View.combineMeasuredStates(0, 0) + 46), (byte) Color.red(0), (ViewConfiguration.getWindowTouchSlop() >> 8) - 262866970, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cCombineMeasuredStates2 = (char) (31533 - View.combineMeasuredStates(0, 0));
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 921;
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
                        byte[] bArr3 = $$a;
                        byte b12 = bArr3[7];
                        Object[] objArr16 = new Object[1];
                        d(b12, b12, bArr3[132], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates2, offsetBefore, maximumFlingVelocity, -778300370, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cAxisFromString = (char) (31532 - MotionEvent.axisFromString(""));
                        int defaultSize = 921 - View.getDefaultSize(0, 0);
                        int gidForName = Process.getGidForName("") + 29;
                        byte b13 = $$a[132];
                        Object[] objArr17 = new Object[1];
                        d((byte) 52, b13, b13, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, defaultSize, gidForName, -1048449946, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i15 = asInterface + 49;
                    asBinder = i15 % 128;
                    int i16 = i15 % 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[3])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[0])[0];
            Object[] objArr18 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i20 = ~iIdentityHashCode;
            int i21 = i19 + (-1992129140) + (((~((-935368115) | i20)) | (~((-838711530) | i20))) * (-867)) + (((~((-935368115) | iIdentityHashCode)) | 834703520 | (~((-838711530) | iIdentityHashCode))) * (-1734)) + (((~(iIdentityHashCode | (-4008010))) | (~(i20 | (-834703521))) | (~((-100664595) | iIdentityHashCode))) * 867);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr18[0])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str2 : strArr) {
                    arrayList.add(str2);
                }
            }
            Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
            int i24 = ((int[]) objArr[0])[0];
            Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iNextInt = new Random().nextInt();
            int i25 = ~iNextInt;
            int i26 = i24 + 134002307 + (((~((-726085011) | i25)) | 709304576 | (~((-1047994634) | i25))) * (-1136)) + (((~((-726085011) | iNextInt)) | (~((-1047994634) | iNextInt)) | (~(1064775067 | i25))) * (-568)) + (((~(iNextInt | (-709304577))) | (~(i25 | 1047994633)) | (~(726085010 | i25))) * 568);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr19[0])[0] = i28 ^ (i28 << 5);
        }
        this.address = str;
        int i29 = asBinder + 101;
        asInterface = i29 % 128;
        if (i29 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() throws Throwable {
        int iIntValue;
        int i = 2 % 2;
        String str = this.familyCardNumber;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        float f = 0.0f;
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - ExpandableListView.getPackedPositionType(0L)), 40 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 20, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        c(319096689 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-47) - (KeyEvent.getMaxKeyCode() >> 16), (short) (View.resolveSizeAndState(0, 0, 0) - 51), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-262866992) - (Process.myPid() >> 22), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c(MotionEvent.axisFromString("") + 319096694, View.combineMeasuredStates(0, 0) - 47, (short) (46 - (ViewConfiguration.getPressedStateDuration() >> 16)), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 262866970, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 471;
        long j2 = -470;
        long j3 = -1;
        long j4 = j3 ^ 1923617068132474858L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j5 = ((jIdentityHashCode ^ j3) | 1944129839455420395L) ^ j3;
        long j6 = (j * 173640106609484129L) + (j * 1923617068132474858L) + (j2 * 1944129839455420395L) + (j2 * ((((j3 ^ 173640106609484129L) | j4) ^ j3) | ((j4 | jIdentityHashCode) ^ j3) | j5)) + (((long) 470) * ((((j4 | 173640106609484129L) | jIdentityHashCode) ^ j3) | j5));
        int i4 = 0;
        long j7 = jLongValue;
        try {
            while (i4 != 10) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - TextUtils.indexOf("", "", i2)), 59 - (TypedValue.complexToFraction(i2, f, f) > f ? 1 : (TypedValue.complexToFraction(i2, f, f) == f ? 0 : -1)), 18 - (KeyEvent.getMaxKeyCode() >> 16), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                int i6 = i2;
                long j8 = j7;
                while (true) {
                    for (int i7 = i2; i7 != 8; i7++) {
                        int i8 = asInterface + 31;
                        asBinder = i8 % 128;
                        int i9 = i8 % 2;
                        i5 = (((((int) (j8 >> i7)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                    }
                    if (i6 != 0) {
                        break;
                    }
                    i6++;
                    j8 = j6;
                    i2 = 0;
                }
                if (i5 == i3) {
                    int i10 = asBinder + 77;
                    asInterface = i10 % 128;
                    int i11 = i10 % 2;
                    return str;
                }
                j7 -= 1024;
                i4++;
                f = 0.0f;
                i2 = 0;
            }
            Object[] objArr3 = {-175705064};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 46038), TextUtils.getOffsetAfter("", 0) + 1134, (Process.myPid() >> 22) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr4 = {Integer.valueOf(iIntValue), 0, 298460203, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cBlue = (char) Color.blue(0);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15;
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr5 = new Object[1];
                d(b2, b2, bArr[37], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, maxKeyCode, keyRepeatDelay, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1116 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 18), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
            int i12 = ((int[]) objArr6[1])[0];
            int i13 = ((int[]) objArr6[3])[0];
            if (i13 != i12) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    int i14 = 0;
                    while (i14 < strArr.length) {
                        int i15 = asInterface + 119;
                        asBinder = i15 % 128;
                        if (i15 % 2 != 0) {
                            arrayList.add(strArr[i14]);
                            i14 += 10;
                        } else {
                            arrayList.add(strArr[i14]);
                            i14++;
                        }
                    }
                }
                Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            }
            int i16 = asBinder + 77;
            asInterface = i16 % 128;
            int i17 = i16 % 2;
            return str;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        Object[] objArr7 = new Object[1];
        c(319096698 - Drawable.resolveOpacity(0, 0), (-46) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (short) (Color.green(0) + 36), (byte) ((Process.getThreadPriority(0) + 20) >> 6), View.resolveSize(0, 0) - 262866955, objArr7);
        Class<?> cls2 = Class.forName((String) objArr7[0]);
        Object[] objArr8 = new Object[1];
        c((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 319096697, View.MeasureSpec.getMode(0) - 47, (short) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 30), (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), (-262866940) - TextUtils.lastIndexOf("", '0', 0), objArr8);
        iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
    }

    static {
        g = 0;
        b();
        CREATOR = new Creator();
        $stable = 8;
        int i = f381a + 63;
        g = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ AsikListFamilyItem copy$default(AsikListFamilyItem asikListFamilyItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        String str10;
        String str11;
        String str12;
        String str13;
        int i2 = 2 % 2;
        String str14 = (i & 1) != 0 ? asikListFamilyItem.identityNumber : str;
        if ((i & 2) != 0) {
            int i3 = asBinder + 109;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                String str15 = asikListFamilyItem.familyCardNumber;
                throw null;
            }
            str10 = asikListFamilyItem.familyCardNumber;
        } else {
            str10 = str2;
        }
        String str16 = (i & 4) != 0 ? asikListFamilyItem.fullName : str3;
        String str17 = (i & 8) != 0 ? asikListFamilyItem.gender : str4;
        String str18 = (i & 16) != 0 ? asikListFamilyItem.birthPlace : str5;
        String str19 = (i & 32) != 0 ? asikListFamilyItem.birthDate : str6;
        if ((i & 64) != 0) {
            int i4 = asBinder + 51;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                str11 = asikListFamilyItem.maritalStatus;
                int i5 = 53 / 0;
            } else {
                str11 = asikListFamilyItem.maritalStatus;
            }
        } else {
            str11 = str7;
        }
        if ((i & 128) != 0) {
            int i6 = asInterface + 1;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            str12 = asikListFamilyItem.familyStatus;
        } else {
            str12 = str8;
        }
        if ((i & 256) != 0) {
            int i8 = asInterface;
            int i9 = i8 + 53;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            str13 = asikListFamilyItem.address;
            int i11 = i8 + 77;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
        } else {
            str13 = str9;
        }
        return asikListFamilyItem.copy(str14, str10, str16, str17, str18, str19, str11, str12, str13);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.identityNumber;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 59;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.fullName;
        int i5 = i2 + 39;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 15;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.gender;
        int i5 = i2 + 25;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.birthPlace;
        int i4 = i3 + 109;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 33;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.birthDate;
        int i4 = i2 + 9;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 125;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.maritalStatus;
        int i5 = i2 + 9;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.familyStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.address;
        }
        throw null;
    }

    public final AsikListFamilyItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8) {
        int i = 2 % 2;
        AsikListFamilyItem asikListFamilyItem = new AsikListFamilyItem(p0, p1, p2, p3, p4, p5, p6, p7, p8);
        int i2 = asBinder + 53;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
        return asikListFamilyItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 35;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.bpjstku.data.asik.model.response.AsikListFamilyItem) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.bpjstku.data.asik.model.response.AsikListFamilyItem) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.identityNumber, r6.identityNumber) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r6 = com.bpjstku.data.asik.model.response.AsikListFamilyItem.asInterface + 63;
        com.bpjstku.data.asik.model.response.AsikListFamilyItem.asBinder = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.familyCardNumber, r6.familyCardNumber) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.fullName, r6.fullName) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        r6 = com.bpjstku.data.asik.model.response.AsikListFamilyItem.asBinder;
        r1 = r6 + 105;
        com.bpjstku.data.asik.model.response.AsikListFamilyItem.asInterface = r1 % 128;
        r1 = r1 % 2;
        r6 = r6 + 105;
        com.bpjstku.data.asik.model.response.AsikListFamilyItem.asInterface = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.gender, r6.gender) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.birthPlace, r6.birthPlace) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.birthDate, r6.birthDate) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.maritalStatus, r6.maritalStatus) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.familyStatus, r6.familyStatus) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.address, r6.address) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.data.asik.model.response.AsikListFamilyItem.asBinder
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.bpjstku.data.asik.model.response.AsikListFamilyItem.asInterface = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 59
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.bpjstku.data.asik.model.response.AsikListFamilyItem
            if (r1 != 0) goto L1e
            return r3
        L1e:
            com.bpjstku.data.asik.model.response.AsikListFamilyItem r6 = (com.bpjstku.data.asik.model.response.AsikListFamilyItem) r6
            java.lang.String r1 = r5.identityNumber
            java.lang.String r4 = r6.identityNumber
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L34
            int r6 = com.bpjstku.data.asik.model.response.AsikListFamilyItem.asInterface
            int r6 = r6 + 63
            int r1 = r6 % 128
            com.bpjstku.data.asik.model.response.AsikListFamilyItem.asBinder = r1
            int r6 = r6 % r0
            return r3
        L34:
            java.lang.String r1 = r5.familyCardNumber
            java.lang.String r4 = r6.familyCardNumber
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L3f
            return r3
        L3f:
            java.lang.String r1 = r5.fullName
            java.lang.String r4 = r6.fullName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L5a
            int r6 = com.bpjstku.data.asik.model.response.AsikListFamilyItem.asBinder
            int r1 = r6 + 105
            int r2 = r1 % 128
            com.bpjstku.data.asik.model.response.AsikListFamilyItem.asInterface = r2
            int r1 = r1 % r0
            int r6 = r6 + 105
            int r1 = r6 % 128
            com.bpjstku.data.asik.model.response.AsikListFamilyItem.asInterface = r1
            int r6 = r6 % r0
            return r3
        L5a:
            java.lang.String r0 = r5.gender
            java.lang.String r1 = r6.gender
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L65
            return r3
        L65:
            java.lang.String r0 = r5.birthPlace
            java.lang.String r1 = r6.birthPlace
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L70
            return r3
        L70:
            java.lang.String r0 = r5.birthDate
            java.lang.String r1 = r6.birthDate
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L7b
            return r3
        L7b:
            java.lang.String r0 = r5.maritalStatus
            java.lang.String r1 = r6.maritalStatus
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L86
            return r3
        L86:
            java.lang.String r0 = r5.familyStatus
            java.lang.String r1 = r6.familyStatus
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L91
            return r3
        L91:
            java.lang.String r0 = r5.address
            java.lang.String r6 = r6.address
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L9c
            return r3
        L9c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.response.AsikListFamilyItem.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = asBinder + 33;
        asInterface = i2 % 128;
        int iHashCode4 = (i2 % 2 != 0 ? (str = this.identityNumber) != null : (str = this.identityNumber) != null) ? str.hashCode() : 0;
        String str2 = this.familyCardNumber;
        if (str2 == null) {
            int i3 = asInterface + 67;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.fullName;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.gender;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.birthPlace;
        if (str5 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str5.hashCode();
            int i5 = asInterface + 113;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
        String str6 = this.birthDate;
        if (str6 == null) {
            int i7 = asBinder + 87;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str6.hashCode();
            int i9 = asBinder + 93;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
        }
        String str7 = this.maritalStatus;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.familyStatus;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.address;
        return (((((((((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.identityNumber;
        String str2 = this.familyCardNumber;
        String str3 = this.fullName;
        String str4 = this.gender;
        String str5 = this.birthPlace;
        String str6 = this.birthDate;
        String str7 = this.maritalStatus;
        String str8 = this.familyStatus;
        String str9 = this.address;
        StringBuilder sb = new StringBuilder("AsikListFamilyItem(identityNumber=");
        sb.append(str);
        sb.append(", familyCardNumber=");
        sb.append(str2);
        sb.append(", fullName=");
        sb.append(str3);
        sb.append(", gender=");
        sb.append(str4);
        sb.append(", birthPlace=");
        sb.append(str5);
        sb.append(", birthDate=");
        sb.append(str6);
        sb.append(", maritalStatus=");
        sb.append(str7);
        sb.append(", familyStatus=");
        sb.append(str8);
        sb.append(", address=");
        sb.append(str9);
        sb.append(")");
        String string = sb.toString();
        int i2 = asInterface + 115;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.identityNumber);
        p0.writeString(this.familyCardNumber);
        p0.writeString(this.fullName);
        p0.writeString(this.gender);
        p0.writeString(this.birthPlace);
        p0.writeString(this.birthDate);
        p0.writeString(this.maritalStatus);
        p0.writeString(this.familyStatus);
        p0.writeString(this.address);
        int i4 = asInterface + 89;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        TuitionPaymentFragmentbindingInflater1 = -2096737066;
        b = -1934795576;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1616356374;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new byte[]{14, -35, -63, -48, -70, -17, -35, -62, -46, -53, -65, -66, 8, -47, -110, 27, -56, -53, -42, -89, -49, -90, 7, 44, 48, 33, 60, 59, 40, 3, 38, 55, 34, 51, 7, 33, 63, 4, 2, 43, 59, 48, -28, -25, 69, 51, 15, 55, -4, 79, 33, 23, 53, 4, -7, -11, -84, 31, -11, -42, -47, 11, -59, -49, -11, -62, -63, -7, -1, 10, -124, -67, -76, -113, -107, -36, -126, -116, -76, -118, -78, -106, 103, -108, -5, -71, -120, 116, -49, -68, -65, -70, -117, -77, -118, 2, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            int r8 = 121 - r8
            int r6 = r6 + 4
            byte[] r0 = com.bpjstku.data.asik.model.response.AsikListFamilyItem.$$c
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.response.AsikListFamilyItem.$$g(byte, byte, short):java.lang.String");
    }
}
