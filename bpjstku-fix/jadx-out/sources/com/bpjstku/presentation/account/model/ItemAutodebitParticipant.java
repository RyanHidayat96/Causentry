package com.bpjstku.presentation.account.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.volley.ExecutorDelivery;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0014\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u0014\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001fR\u0014\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001fR\u0014\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u0016\u0010%\u001a\u00020\f8\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b \u0010*R\u0016\u0010+\u001a\u00020\f8\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\"\u0010*"}, d2 = {"Lcom/bpjstku/presentation/account/model/ItemAutodebitParticipant;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "", "p9", "p10", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "d", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "asInterface", "cancel", "Z", "onTransact"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ItemAutodebitParticipant implements Parcelable {
    public static final Parcelable.Creator<ItemAutodebitParticipant> CREATOR = new TuitionPaymentFragmentbindingInflater1();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public boolean a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean onTransact;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final String d;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String asBinder;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ItemAutodebitParticipant(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.b = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str5;
        this.asBinder = str6;
        this.asInterface = str7;
        this.d = str8;
        this.g = str9;
        this.a = z;
        this.onTransact = z2;
    }

    public /* synthetic */ ItemAutodebitParticipant(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? false : z2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ItemAutodebitParticipant)) {
            return false;
        }
        ItemAutodebitParticipant itemAutodebitParticipant = (ItemAutodebitParticipant) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, itemAutodebitParticipant.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, itemAutodebitParticipant.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, itemAutodebitParticipant.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, itemAutodebitParticipant.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, itemAutodebitParticipant.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.asBinder, itemAutodebitParticipant.asBinder) && Intrinsics.areEqual(this.asInterface, itemAutodebitParticipant.asInterface) && Intrinsics.areEqual(this.d, itemAutodebitParticipant.d) && Intrinsics.areEqual(this.g, itemAutodebitParticipant.g) && this.a == itemAutodebitParticipant.a && this.onTransact == itemAutodebitParticipant.onTransact;
    }

    public final int hashCode() {
        return (((((((((((((((((((this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.d.hashCode()) * 31) + this.g.hashCode()) * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.onTransact);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentbindingInflater1;
        String str2 = this.b;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str6 = this.asBinder;
        String str7 = this.asInterface;
        String str8 = this.d;
        String str9 = this.g;
        boolean z = this.a;
        boolean z2 = this.onTransact;
        StringBuilder sb = new StringBuilder("ItemAutodebitParticipant(TuitionPaymentFragmentbindingInflater1=");
        sb.append(str);
        sb.append(", b=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str5);
        sb.append(", asBinder=");
        sb.append(str6);
        sb.append(", asInterface=");
        sb.append(str7);
        sb.append(", d=");
        sb.append(str8);
        sb.append(", g=");
        sb.append(str9);
        sb.append(", a=");
        sb.append(z);
        sb.append(", onTransact=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.asBinder);
        p0.writeString(this.asInterface);
        p0.writeString(this.d);
        p0.writeString(this.g);
        p0.writeInt(this.a ? 1 : 0);
        p0.writeInt(this.onTransact ? 1 : 0);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<ItemAutodebitParticipant> {
        private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static final byte[] $$c = {57, -56, 23, -36};
        private static final int $$d = 59;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {117, -15, -81, 1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 126;
        private static int asInterface = 0;
        private static int g = 1;
        private static int b = 1993340933;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795640;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1486344064;
        private static byte[] TuitionPaymentFragmentbindingInflater1 = {79, 97, 120, -102, 119, 108, 81, 70, -93, 119, 114, -102, 119, 108, 113, 38, -77, 96, 99, 110, ByteCompanionObject.MAX_VALUE, 103, 126, 66, 123, 106, 95, -119, 117, 124, 111, 65, 116, 104, 119, 118, 114, 37, -121, 69, 116, 82, -60, -9, -40, 18, -2, -7, -24, -54, -15, -11, -16, -13, -1, -82, -54, 60, -16, -67, 53, -7, -60, -20, -7, -2, -61, -88, 5, -14, -11, -16, -63, -23, -64, 113, -26, 28, 15, 28, 72, -19, -72, 5, -11, -62, -3, -14, -4, -22, -53, -15, -3, -73, 5, -11, -1, -4, -79, 51, -61, -13, -7, -78, 0, -17, -49, -74, 117, 121, -100, 109, 100, -99, 103, -107, 114, -104, 100, 81, -90, -104};

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r0 = r7 + 1
                int r6 = r6 * 14
                int r6 = 98 - r6
                byte[] r1 = com.bpjstku.presentation.account.model.ItemAutodebitParticipant.TuitionPaymentFragmentbindingInflater1.$$a
                int r8 = r8 + 4
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L12
                r3 = r8
                r4 = r2
                goto L2a
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r6
                int r8 = r8 + 1
                r0[r3] = r4
                if (r3 != r7) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L22:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2a:
                int r6 = r6 + r8
                int r6 = r6 + (-11)
                r8 = r3
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.model.ItemAutodebitParticipant.TuitionPaymentFragmentbindingInflater1.c(short, byte, short, java.lang.Object[]):void");
        }

        private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 2267 - View.getDefaultSize(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 33, 1387473586, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                int i6 = iIntValue == -1 ? 1 : 0;
                if (i6 != 0) {
                    int i7 = $10;
                    int i8 = i7 + 81;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    byte[] bArr = TuitionPaymentFragmentbindingInflater1;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i9 = i7 + 83;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        for (int i11 = 0; i11 < length; i11++) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b5 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 3358 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, -1054011043, false, $$e(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i12 = $10 + 111;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            byte[] bArr3 = TuitionPaymentFragmentbindingInflater1;
                            try {
                                Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = b6;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", ""), (ViewConfiguration.getLongPressTimeout() >> 16) + 2267, 33 - TextUtils.indexOf("", "", 0), 1387473586, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                i4 = ((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) - 3046761265686732006L)) - ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) + 3046761265686732006L));
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                            Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(b)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2266, 33 - TextUtils.indexOf("", "", 0, 0), 1387473586, false, $$e(b8, b9, b9), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i4 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                        }
                        iIntValue = (byte) i4;
                    } else {
                        iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    int i13 = $11 + 103;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L)) + i6;
                    Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Process.getGidForName("") + 55905), TextUtils.getOffsetAfter("", 0) + 2855, 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1529949196, false, $$e(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr5 = TuitionPaymentFragmentbindingInflater1;
                    if (bArr5 != null) {
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i15 = 0; i15 < length2; i15++) {
                            bArr6[i15] = (byte) (((long) bArr5[i15]) ^ 3046761265686732006L);
                        }
                        bArr5 = bArr6;
                    }
                    boolean z = bArr5 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (z) {
                            byte[] bArr7 = TuitionPaymentFragmentbindingInflater1;
                            int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0042  */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ItemAutodebitParticipant createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            int i = 2 % 2;
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
            if (parcel.readInt() == 0) {
                int i2 = g + 13;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (parcel.readInt() != 0) {
                int i3 = asInterface + 87;
                g = i3 % 128;
                int i4 = i3 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            return new ItemAutodebitParticipant(string, string2, string3, string4, string5, string6, string7, string8, string9, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ItemAutodebitParticipant[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = asInterface + 123;
            int i4 = i3 % 128;
            g = i4;
            int i5 = i3 % 2;
            ItemAutodebitParticipant[] itemAutodebitParticipantArr = new ItemAutodebitParticipant[i];
            int i6 = i4 + 15;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 56 / 0;
            }
            return itemAutodebitParticipantArr;
        }

        /* JADX WARN: Code duplicated, block: B:105:0x05b1 A[EXC_TOP_SPLITTER, PHI: r15
  0x05b1: PHI (r15v4 ??) = (r15v40 ??), (r15v41 ??) binds: [B:36:0x05a2, B:33:0x059b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x059e A[PHI: r15
  0x059e: PHI (r15v3 ??) = (r15v44 ??), (r15v45 ??) binds: [B:28:0x0547, B:33:0x059b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:37:0x05a4  */
        /* JADX WARN: Code duplicated, block: B:41:0x05b7  */
        /* JADX WARN: Code duplicated, block: B:45:0x0638  */
        /* JADX WARN: Code duplicated, block: B:47:0x064e A[Catch: Exception -> 0x0a0a, TRY_LEAVE, TryCatch #2 {Exception -> 0x0a0a, blocks: (B:38:0x05b1, B:42:0x05c2, B:46:0x0641, B:49:0x06d2, B:47:0x064e), top: B:105:0x05b1 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x06eb A[Catch: all -> 0x07bb, TryCatch #3 {all -> 0x07bb, blocks: (B:50:0x06de, B:52:0x06eb, B:53:0x0729), top: B:107:0x06de, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x07c5 A[Catch: Exception -> 0x0a0b, TRY_LEAVE, TryCatch #1 {Exception -> 0x0a0b, blocks: (B:55:0x0793, B:57:0x07bc, B:59:0x07c3, B:60:0x07c4, B:61:0x07c5, B:65:0x080c, B:67:0x0850, B:73:0x0971, B:78:0x09d2, B:83:0x0a02, B:85:0x0a08, B:86:0x0a09, B:66:0x0824, B:74:0x097c, B:76:0x0989, B:77:0x09cb, B:50:0x06de, B:52:0x06eb, B:53:0x0729), top: B:104:0x05b5, inners: #0, #3 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x07fb  */
        /* JADX WARN: Code duplicated, block: B:66:0x0824 A[Catch: Exception -> 0x0a0b, TryCatch #1 {Exception -> 0x0a0b, blocks: (B:55:0x0793, B:57:0x07bc, B:59:0x07c3, B:60:0x07c4, B:61:0x07c5, B:65:0x080c, B:67:0x0850, B:73:0x0971, B:78:0x09d2, B:83:0x0a02, B:85:0x0a08, B:86:0x0a09, B:66:0x0824, B:74:0x097c, B:76:0x0989, B:77:0x09cb, B:50:0x06de, B:52:0x06eb, B:53:0x0729), top: B:104:0x05b5, inners: #0, #3 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x0919  */
        /* JADX WARN: Code duplicated, block: B:71:0x0931  */
        /* JADX WARN: Code duplicated, block: B:76:0x0989 A[Catch: all -> 0x0a01, TryCatch #0 {all -> 0x0a01, blocks: (B:74:0x097c, B:76:0x0989, B:77:0x09cb), top: B:102:0x097c, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:80:0x09d8  */
        /* JADX WARN: Code duplicated, block: B:81:0x09f3  */
        /* JADX WARN: Code duplicated, block: B:91:0x0a29  */
        /* JADX WARN: Code duplicated, block: B:92:0x0a2c  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v1 */
        /* JADX WARN: Type inference failed for: r15v14 */
        /* JADX WARN: Type inference failed for: r15v16 */
        /* JADX WARN: Type inference failed for: r15v17 */
        /* JADX WARN: Type inference failed for: r15v18 */
        /* JADX WARN: Type inference failed for: r15v19 */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v36 */
        /* JADX WARN: Type inference failed for: r15v37 */
        /* JADX WARN: Type inference failed for: r15v38 */
        /* JADX WARN: Type inference failed for: r15v39 */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX WARN: Type inference failed for: r15v40 */
        /* JADX WARN: Type inference failed for: r15v41 */
        /* JADX WARN: Type inference failed for: r15v42 */
        /* JADX WARN: Type inference failed for: r15v43 */
        /* JADX WARN: Type inference failed for: r15v44 */
        /* JADX WARN: Type inference failed for: r15v45 */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r15v6 */
        /* JADX WARN: Type inference failed for: r15v7 */
        /* JADX WARN: Type inference failed for: r15v8 */
        /* JADX WARN: Type inference failed for: r15v9 */
        /* JADX WARN: Type inference failed for: r2v171 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            ?? r2;
            ?? r15;
            int i6;
            ?? r16;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            String str;
            int minimumFlingVelocity;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i13;
            int i14;
            Object[] objArr;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i15;
            int i16;
            int i17;
            int i18;
            short s;
            byte windowTouchSlop;
            int iBlue;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            ?? r17;
            int i19;
            int i20 = 2 % 2;
            int i21 = g;
            int i22 = (i21 & 9) + (i21 | 9);
            int i23 = i22 % 128;
            asInterface = i23;
            int i24 = i22 % 2;
            if (context != null) {
                int i25 = ((i23 | 45) << 1) - (i23 ^ 45);
                g = i25 % 128;
                int i26 = i25 % 2;
                try {
                    int i27 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 734358534;
                    int i28 = -(-TextUtils.lastIndexOf("", '0', 0, 0));
                    int i29 = ((i28 | (-110)) << 1) - (i28 ^ (-110));
                    short sIndexOf = (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 118);
                    byte b2 = (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                    int i30 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i31 = iTuitionPaymentFragmentspecialinlinedviewModeldefault2 | 94198557;
                    int i32 = ~i30;
                    int i33 = ((i30 * 628) - 972848348) + (((i31 ^ i32) | (i31 & i32)) * (-627));
                    int i34 = ~(((-94198558) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-94198558) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    int i35 = -(-(((i30 ^ i34) | (i34 & i30)) * (-627)));
                    int i36 = ((i33 | i35) << 1) - (i35 ^ i33);
                    int i37 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i38 = ~((i37 & 94198557) | (i37 ^ 94198557));
                    int i39 = ~((i30 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i30 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    int i40 = i36 + (((i39 & i38) | (i38 ^ i39)) * 627);
                    Object[] objArr2 = new Object[1];
                    a(i27, i29, sIndexOf, b2, i40, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    int i41 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int i42 = g;
                    int i43 = (i42 & 113) + (i42 | 113);
                    asInterface = i43 % 128;
                    int i44 = i43 % 2;
                    int i45 = ((-115) * i41) - 1448115200;
                    int i46 = ~i;
                    int i47 = (i46 ^ i41) | (i46 & i41);
                    int i48 = -(-((~((i47 & (-734358528)) | (i47 ^ (-734358528)))) * (-116)));
                    int i49 = ((((i45 | i48) << 1) - (i45 ^ i48)) - (~(-(-(((i41 ^ i) | (i41 & i)) * 116))))) - 1;
                    int i50 = ~i41;
                    int i51 = ~((i50 & 734358527) | (i50 ^ 734358527));
                    int i52 = ~((734358527 ^ i) | (734358527 & i));
                    int i53 = (i49 - (~(((i51 & i52) | (i51 ^ i52)) * 116))) - 1;
                    int i54 = -MotionEvent.axisFromString("");
                    int i55 = i54 * TypedValues.Custom.TYPE_DIMENSION;
                    int i56 = ((i55 | 101136) << 1) - (i55 ^ 101136);
                    int i57 = ~i54;
                    int i58 = ~(i57 | i);
                    int i59 = ~i;
                    int i60 = ~((i59 ^ (-112)) | (i59 & (-112)));
                    int i61 = ((i58 ^ i60) | (i60 & i58)) * (-1808);
                    int i62 = (i56 ^ i61) + ((i56 & i61) << 1);
                    int i63 = ~i54;
                    int i64 = (i63 ^ 111) | (i63 & 111);
                    int i65 = (i59 ^ i54) | (i59 & i54);
                    int i66 = ((~((i64 ^ i) | (i64 & i))) | (~((i65 ^ (-112)) | (i65 & (-112))))) * TypedValues.Custom.TYPE_BOOLEAN;
                    int i67 = ((i62 | i66) << 1) - (i66 ^ i62);
                    int i68 = asInterface + 7;
                    g = i68 % 128;
                    int i69 = i68 % 2;
                    int i70 = ~((i57 ^ (-112)) | (i57 & (-112)));
                    int i71 = ~((111 & i) | (111 ^ i));
                    int i72 = (i70 & i71) | (i70 ^ i71);
                    int i73 = ~(i54 | i59);
                    int i74 = -(-(((i73 & i72) | (i72 ^ i73)) * TypedValues.Custom.TYPE_BOOLEAN));
                    int i75 = ((i67 | i74) << 1) - (i74 ^ i67);
                    short s2 = (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 107);
                    int i76 = -Process.getGidForName("");
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i77 = i76 * (-743);
                    int i78 = ((i77 | 743) << 1) - (i77 ^ 743);
                    int i79 = (~i76) | i76;
                    int i80 = ~i79;
                    int i81 = ~((i76 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i76 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i82 = (i78 - (~((((i80 ^ i81) | (i81 & i80)) | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-1)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) * (-744)))) - 1;
                    int i83 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i84 = ~(~i76);
                    int i85 = ((i83 & i84) | (i83 ^ i84)) * 744;
                    int i86 = (i82 ^ i85) + ((i85 & i82) << 1);
                    int i87 = -(-(((i79 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i79 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 744));
                    byte b3 = (byte) ((i86 ^ i87) + ((i87 & i86) << 1));
                    int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i88 = g;
                    int i89 = ((i88 | 35) << 1) - (i88 ^ 35);
                    asInterface = i89 % 128;
                    int i90 = i89 % 2;
                    int i91 = (touchSlop * (-495)) - (-616343156);
                    int i92 = ~touchSlop;
                    int i93 = ~((i92 ^ (-94198581)) | (i92 & (-94198581)));
                    int i94 = ~touchSlop;
                    int i95 = ~(i94 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                    int i96 = -(-(((i93 ^ i95) | (i93 & i95)) * 992));
                    int i97 = (i91 ^ i96) + ((i91 & i96) << 1);
                    int i98 = ~(((-94198581) & i94) | (i94 ^ (-94198581)));
                    int i99 = ~(i94 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                    int i100 = (i98 & i99) | (i98 ^ i99);
                    int i101 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i102 = (touchSlop & i101) | (i101 ^ touchSlop);
                    int i103 = ~((i102 & 94198580) | (i102 ^ 94198580));
                    int i104 = i97 + (((i103 & i100) | (i100 ^ i103)) * (-496));
                    int i105 = -(-(((94198580 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & 94198580)) * 496));
                    Object[] objArr3 = new Object[1];
                    a(i53, i75, s2, b3, (i104 & i105) + (i105 | i104), objArr3);
                    Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                    int i106 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i107 = (i106 ^ (-734358534)) + ((i106 & (-734358534)) << 1);
                    int i108 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i109 = i108 * (-830);
                    int i110 = ((i109 | (-91520)) << 1) - (i109 ^ (-91520));
                    int i111 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                    int i112 = ~((i111 & 109) | (109 ^ i111));
                    int i113 = asInterface;
                    int i114 = (i113 & 7) + (i113 | 7);
                    g = i114 % 128;
                    int i115 = i114 % 2;
                    int i116 = (i108 ^ (-110)) | (i108 & (-110));
                    int i117 = -(-((-831) * (i112 | (~((i116 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i116 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))))));
                    int i118 = (i110 & i117) + (i117 | i110);
                    int i119 = (~((109 ^ i108) | (109 & i108) | iTuitionPaymentFragmentspecialinlinedviewModeldefault5)) * (-1662);
                    int i120 = (i118 ^ i119) + ((i119 & i118) << 1);
                    int i121 = ~i108;
                    int i122 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                    int i123 = ~((i121 & i122) | (i121 ^ i122));
                    int i124 = ~((i108 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i108 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                    int i125 = (i124 & i123) | (i123 ^ i124);
                    int i126 = ~(((-110) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-110) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                    int i127 = i120 + (((i125 & i126) | (i125 ^ i126)) * 831);
                    int i128 = -View.resolveSizeAndState(0, 0, 0);
                    int i129 = i128 * 236;
                    int i130 = (i129 ^ (-11775)) + ((i129 & (-11775)) << 1);
                    int i131 = ~i128;
                    int i132 = ~((i131 ^ i59) | (i131 & i59));
                    int i133 = -(-(((i132 & (-25)) | (i132 ^ (-25))) * (-235)));
                    int i134 = ((i130 | i133) << 1) - (i130 ^ i133);
                    int i135 = ~((i131 & i) | (i131 ^ i));
                    int i136 = ((i135 & (-25)) | (i135 ^ (-25))) * (-470);
                    int i137 = (i134 & i136) + (i136 | i134);
                    int i138 = ~(24 | i128);
                    int i139 = ~i128;
                    int i140 = (i139 & (-25)) | (i139 ^ (-25));
                    int i141 = ~((i140 & i) | (i140 ^ i));
                    short s3 = (short) (i137 + (((i141 & i138) | (i138 ^ i141)) * 235));
                    byte packedPositionType = (byte) ExpandableListView.getPackedPositionType(0L);
                    i19 = 94198597 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                    Object[] objArr4 = new Object[1];
                    a(i107, i127, s3, packedPositionType, i19, objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i142 = ~scrollDefaultDelay;
                    int i143 = ~((i142 ^ 734358527) | (i142 & 734358527));
                    int i144 = ~scrollDefaultDelay;
                    int i145 = (((scrollDefaultDelay * (-344)) - 783736832) - (~(-(-((i143 | (~((i144 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i144 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6)))) * 345))))) - 1;
                    int i146 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    int i147 = ~((i142 & i146) | (i142 ^ i146));
                    int i148 = ~(scrollDefaultDelay | 734358527);
                    int i149 = -(-(((i148 & i147) | (i147 ^ i148)) * 345));
                    int i150 = (i145 ^ i149) + ((i149 & i145) << 1);
                    int i151 = (734358527 & i144) | (i144 ^ 734358527);
                    int i152 = (~((i151 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i151 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) * 345;
                    int i153 = (i150 ^ i152) + ((i152 & i150) << 1);
                    int i154 = -KeyEvent.keyCodeFromString("");
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i155 = i154 * 615;
                    int i156 = ((i155 | 68043) << 1) - (i155 ^ 68043);
                    int i157 = ~i154;
                    int i158 = (i157 ^ (-111)) | (i157 & (-111));
                    int i159 = ~i158;
                    int i160 = (i159 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault7 ^ i159);
                    int i161 = ~(110 | i154);
                    int i162 = ((i160 & i161) | (i160 ^ i161)) * 614;
                    int i163 = ((i156 | i162) << 1) - (i162 ^ i156);
                    int i164 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                    int i165 = ~((i157 ^ i164) | (i157 & i164));
                    int i166 = ~i158;
                    int i167 = (i166 & i165) | (i165 ^ i166);
                    int i168 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                    int i169 = ~(i168 | (-111));
                    int i170 = -(-(((i167 & i169) | (i167 ^ i169)) * (-1228)));
                    int i171 = (i163 ^ i170) + ((i170 & i163) << 1);
                    int i172 = i157 | 110;
                    int i173 = ~((i168 & i172) | (i172 ^ i168));
                    int i174 = (i154 & i164) | (i164 ^ i154);
                    int i175 = ~((i174 & (-111)) | (i174 ^ (-111)));
                    int i176 = ((i175 & i173) | (i173 ^ i175)) * 614;
                    int i177 = ((i171 | i176) << 1) - (i176 ^ i171);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                    int i178 = ~absoluteGravity;
                    int i179 = ~((i178 ^ i46) | (i178 & i46));
                    int i180 = asInterface;
                    int i181 = ((i180 | 55) << 1) - (i180 ^ 55);
                    g = i181 % 128;
                    int i182 = i181 % 2;
                    int i183 = ~(((-13) & i) | ((-13) ^ i));
                    int i184 = ((absoluteGravity * (-574)) - 6888) + (1150 * ((i179 & i183) | (i179 ^ i183)));
                    int i185 = ~((-13) | i);
                    int i186 = ~(i59 | 12);
                    int i187 = (i184 - (~(((i185 & i186) | (i185 ^ i186)) * (-575)))) - 1;
                    int i188 = ~((i178 & i) | (i178 ^ i));
                    int i189 = ~((absoluteGravity & i46) | (i46 ^ absoluteGravity));
                    int i190 = -(-(((i189 & i188) | (i188 ^ i189)) * 575));
                    short s4 = (short) ((i187 ^ i190) + ((i187 & i190) << 1));
                    byte maxKeyCode = (byte) (KeyEvent.getMaxKeyCode() >> 16);
                    int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                    int i191 = (edgeSlop ^ 94198632) + ((edgeSlop & 94198632) << 1);
                    Object[] objArr5 = new Object[1];
                    a(i153, i177, s4, maxKeyCode, i191, objArr5);
                    int i192 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                    int i193 = -i192;
                    int i194 = ((i192 & i193) | (i192 ^ i193)) >> 31;
                    i4 = (i194 & ((i & (-2)) | (i59 & 1))) | ((~i194) & i);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                i4 = i;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                ?? r18 = i19;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char jumpTapTimeout = (char) (16949 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 2739;
                    int i195 = 14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte[] bArr = $$a;
                    Object[] objArr6 = new Object[1];
                    c(bArr[3], (byte) ($$b & 181), bArr[5], objArr6);
                    Class[] clsArr = new Class[0];
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(jumpTapTimeout, packedPositionType2, i195, 1501733736, false, (String) objArr6[0], clsArr);
                    r18 = clsArr;
                }
                Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                ?? r19 = r18;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char windowTouchSlop2 = (char) (16949 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int i196 = 2739 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 13;
                    byte b4 = $$a[3];
                    byte b5 = (byte) ($$b & 181);
                    Object[] objArr7 = new Object[1];
                    c(b4, b5, (short) (b5 - 1), objArr7);
                    r19 = 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop2, i196, iKeyCodeFromString, 47863026, false, (String) objArr7[0], null);
                }
                ?? r110 = r19;
                if (set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                    r15 = r110;
                    if (Build.VERSION.SDK_INT == 30) {
                        int i197 = g + 73;
                        asInterface = i197 % 128;
                        int i198 = i197 % 2;
                        i5 = i;
                        r2 = i4;
                    } else {
                        try {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i199 = g + 85;
                                    asInterface = i199 % 128;
                                    int i200 = i199 % 2;
                                    int i201 = (-734358584) - (~(-View.MeasureSpec.getSize(0)));
                                    int i202 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    int i203 = (i202 & (-111)) + (i202 | (-111));
                                    int i204 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i205 = asInterface;
                                    int i206 = ((i205 | 115) << 1) - (i205 ^ 115);
                                    g = i206 % 128;
                                    int i207 = i206 % 2;
                                    int i208 = i204 * (-115);
                                    int i209 = (i208 ^ 2990) + ((i208 & 2990) << 1);
                                    int i210 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                    int i211 = (i209 - (~(-(-((~(((i210 & i204) | (i210 ^ i204)) | (-26))) * (-116)))))) - 1;
                                    int i212 = i205 + 103;
                                    g = i212 % 128;
                                    int i213 = i212 % 2;
                                    int i214 = (i204 | iTuitionPaymentFragmentspecialinlinedviewModeldefault8) * 116;
                                    i15 = ((i211 | i214) << 1) - (i214 ^ i211);
                                    int i215 = ~i204;
                                    i16 = ~((i215 & 25) | (i215 ^ 25));
                                    int i216 = (i205 & 3) + (i205 | 3);
                                    g = i216 % 128;
                                    i17 = i216 % 2;
                                    i18 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & 25) | (25 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                    if (i17 == 0) {
                                        s = (short) (i15 >> (((i16 & i18) | (i16 ^ i18)) * 116));
                                        windowTouchSlop = (byte) (ViewConfiguration.getWindowTouchSlop() % 97);
                                        iBlue = Color.blue(0);
                                    } else {
                                        int i217 = (i16 | i18) * 116;
                                        s = (short) ((i15 ^ i217) + ((i217 & i15) << 1));
                                        windowTouchSlop = (byte) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                        iBlue = Color.blue(0);
                                    }
                                    int i218 = -iBlue;
                                    byte b6 = windowTouchSlop;
                                    int i219 = ~i218;
                                    int i220 = ((i218 * (-716)) - (-2031057919)) + (((94198637 ^ i219) | (94198637 & i219)) * (-1434));
                                    int i221 = ~i;
                                    int i222 = g;
                                    int i223 = (i222 ^ 25) + ((25 & i222) << 1);
                                    int i224 = i223 % 128;
                                    asInterface = i224;
                                    int i225 = i223 % 2;
                                    int i226 = (i218 ^ 94198637) | (i218 & 94198637);
                                    int i227 = (~((i221 ^ 94198637) | (i221 & 94198637))) | (~i226);
                                    int i228 = (i219 ^ (-94198638)) | (i219 & (-94198638));
                                    int i229 = ~((i228 & i) | (i228 ^ i));
                                    r15 = i227 ^ i229;
                                    int i230 = i220 + (717 * ((i229 & i227) | (r15 == true ? 1 : 0)));
                                    int i231 = ~i218;
                                    int i232 = (i231 & (-94198638)) | (i231 ^ (-94198638));
                                    int i233 = ~i;
                                    int i234 = ~((i232 & i233) | (i232 ^ i233));
                                    int i235 = ~i226;
                                    int i236 = (i234 & i235) | (i234 ^ i235);
                                    int i237 = ~((94198637 ^ i) | (94198637 & i));
                                    int i238 = i224 + 45;
                                    g = i238 % 128;
                                    int i239 = i238 % 2;
                                    Object[] objArr8 = new Object[1];
                                    a(i201, i203, s, b6, (717 * ((i236 & i237) | (i236 ^ i237))) + i230, objArr8);
                                    try {
                                        Object[] objArr9 = {(String) objArr8[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int i240 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 992;
                                            int i241 = 7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                            byte b7 = $$a[7];
                                            byte b8 = b7;
                                            Object[] objArr10 = new Object[1];
                                            c(b7, b8, (short) (b8 | 140), objArr10);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay2, i240, i241, 410748506, false, (String) objArr10[0], new Class[]{String.class});
                                        }
                                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr9)).longValue();
                                        long j = 1242442500;
                                        long j2 = i;
                                        r16 = i4 == true ? 1 : 0;
                                        long j3 = -1;
                                        long j4 = j2 ^ j3;
                                        long j5 = 521;
                                        long j6 = j ^ j3;
                                        long j7 = (((long) 522) * j) + (((long) (-520)) * jLongValue) + (((long) (-1042)) * (j | ((j4 | jLongValue) ^ j3))) + ((jLongValue | j2) * j5) + (j5 * ((j3 ^ (jLongValue | (j4 | j))) | ((j6 | (jLongValue ^ j3)) ^ j3) | ((j6 | j2) ^ j3))) + ((long) (-1443360737));
                                        int i242 = ((int) (j7 >> 32)) & ((((~((-2071593367) | i)) * TypedValues.CycleType.TYPE_EASING) - 1167968018) + (((~((-2071593367) | i221)) | (-2147199423)) * TypedValues.CycleType.TYPE_EASING));
                                        int i243 = (int) j7;
                                        int iNextInt = new Random().nextInt(840744152);
                                        int i244 = i243 & ((-2058977519) + (((~((-1488001027) | iNextInt)) | 50774616) * (-756)) + (((~iNextInt) | (-1488001027)) * 756));
                                        i6 = (i242 & i244) | (i242 ^ i244);
                                    } catch (Throwable th2) {
                                        boolean z = i4 == true ? 1 : 0;
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    r15 = i4 == true ? 1 : 0;
                                    int i245 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    int i246 = ((i245 | (-734358580)) << 1) - (i245 ^ (-734358580));
                                    int i247 = -(-View.getDefaultSize(0, 0));
                                    int i248 = (i247 & (-111)) + (i247 | (-111));
                                    i9 = -Drawable.resolveOpacity(0, 0);
                                    i10 = i9 * 765;
                                    i11 = asInterface + 19;
                                    g = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        int i249 = i10 >> (-1498);
                                        int i250 = ~i;
                                        int i251 = ~((i250 ^ i9) | (i250 & i9));
                                        int i252 = i249 / (764 >>> ((i251 & (-29)) | (i251 ^ (-29))));
                                        int i253 = ~i9;
                                        int i254 = ~((i253 & (-29)) | (i253 ^ (-29)));
                                        int i255 = ~((i250 & (-29)) | (i250 ^ (-29)));
                                        i12 = i252 % ((-1528) >>> ((i255 & i254) | (i254 ^ i255)));
                                    } else {
                                        int i256 = ((i10 | 44283) << 1) - (i10 ^ 44283);
                                        int i257 = ~i;
                                        int i258 = (i256 - (~(-(-(((~((i257 & i9) | (i257 ^ i9))) | (-29)) * 764))))) - 1;
                                        int i259 = ~((~i9) | (-29));
                                        int i260 = ~i;
                                        int i261 = (i259 | (~((i260 & (-29)) | (i260 ^ (-29))))) * (-1528);
                                        i12 = ((i261 & i258) << 1) + (i258 ^ i261);
                                    }
                                    int i262 = ~i9;
                                    int i263 = ~((i262 & (-29)) | (i262 ^ (-29)));
                                    int i264 = ~((28 & i9) | (28 ^ i9));
                                    int i265 = (i263 & i264) | (i263 ^ i264);
                                    int i266 = ~i;
                                    int i267 = ~((i9 & i266) | (i266 ^ i9));
                                    short s5 = (short) ((i12 - (~(764 * ((i267 & i265) | (i265 ^ i267))))) - 1);
                                    byte b9 = (byte) (0 - (~(-(-TextUtils.lastIndexOf("", '0')))));
                                    int i268 = -(-KeyEvent.getDeadChar(0, 0));
                                    int i269 = ((i268 | 94198665) << 1) - (i268 ^ 94198665);
                                    Object[] objArr11 = new Object[1];
                                    a(i246, i248, s5, b9, i269, objArr11);
                                    str = (String) objArr11[0];
                                    int i270 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                    int i271 = ~i270;
                                    int i272 = (((i270 * (-159)) + 798887052) - (~(((i271 & (-734358516)) | (i271 ^ (-734358516))) * 160))) - 1;
                                    int i273 = ~((i266 ^ i270) | (i266 & i270));
                                    int i274 = ~(((-734358516) & i270) | (i270 ^ (-734358516)));
                                    int i275 = ((i273 & i274) | (i273 ^ i274)) * (-160);
                                    int i276 = (i272 ^ i275) + ((i272 & i275) << 1);
                                    int i277 = ~((734358515 & i266) | (734358515 ^ i266));
                                    int i278 = -(-(((i270 & i277) | (i270 ^ i277)) * 160));
                                    int i279 = (i276 ^ i278) + ((i278 & i276) << 1);
                                    int i280 = (-111) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int i281 = -(-TextUtils.indexOf("", ""));
                                    short s6 = (short) (((i281 | 127) << 1) - (i281 ^ 127));
                                    byte bGreen = (byte) Color.green(0);
                                    minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    i13 = g + 47;
                                    asInterface = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        int i282 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i283 = ~((~minimumFlingVelocity) | (-94198667));
                                        i14 = (((-661) >> minimumFlingVelocity) - 94198005) << (1324 >> ((i282 & i283) | (i282 ^ i283)));
                                    } else {
                                        int i284 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i285 = ~minimumFlingVelocity;
                                        int i286 = ~((i285 & (-94198667)) | (i285 ^ (-94198667)));
                                        i14 = ((minimumFlingVelocity * (-661)) - 2135776082) + (((i284 & i286) | (i284 ^ i286)) * 1324);
                                    }
                                    int i287 = ~((minimumFlingVelocity ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (minimumFlingVelocity & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                    int i288 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 | 94198666) ^ (-1);
                                    int i289 = (-1324) * ((i288 & i287) | (i287 ^ i288));
                                    int i290 = (i14 ^ i289) + ((i14 & i289) << 1);
                                    int i291 = ~minimumFlingVelocity;
                                    int i292 = (i290 - (~(((~(minimumFlingVelocity | (-94198667))) | (~((i291 & 94198666) | (i291 ^ 94198666)))) * 662))) - 1;
                                    Object[] objArr12 = new Object[1];
                                    a(i279, i280, s6, bGreen, i292, objArr12);
                                    try {
                                        objArr = new Object[]{(String) objArr12[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char c = (char) (33603 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                            int mirror = AndroidCharacter.getMirror('0') + 3037;
                                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 26;
                                            byte b10 = $$a[7];
                                            byte b11 = b10;
                                            Object[] objArr13 = new Object[1];
                                            c(b10, b11, (short) (b11 | 140), objArr13);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, mirror, fadingEdgeLength, 1411172903, false, (String) objArr13[0], new Class[]{String.class});
                                        }
                                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                            int i293 = g;
                                            int i294 = (i293 & 35) + (i293 | 35);
                                            asInterface = i294 % 128;
                                            int i295 = i294 % 2;
                                            int i296 = ((i293 | 29) << 1) - (i293 ^ 29);
                                            asInterface = i296 % 128;
                                            int i297 = i296 % 2;
                                            i6 = 1;
                                            r16 = r15;
                                        } else {
                                            int i298 = asInterface;
                                            int i299 = (i298 & 105) + (i298 | 105);
                                            g = i299 % 128;
                                            int i300 = i299 % 2;
                                            i6 = 0;
                                            r16 = r15;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            r15 = i4 == true ? 1 : 0;
                        }
                        int i301 = -i6;
                        int i302 = ((i6 & i301) | (i6 ^ i301)) >> 31;
                        int i303 = (i302 & (~(i & 10)) & (i | 10)) | ((~i302) & i);
                        i7 = asInterface + 43;
                        int i304 = i7 % 128;
                        g = i304;
                        if (i7 % 2 == 0) {
                            i8 = i2 & 74;
                        } else {
                            i8 = i2 & 32;
                        }
                        int i305 = -i8;
                        int i306 = ((i8 & i305) | (i8 ^ i305)) >> 31;
                        int i307 = i303 & (~i306);
                        int i308 = i304 + 99;
                        asInterface = i308 % 128;
                        int i309 = i308 % 2;
                        int i310 = i306 & i;
                        i5 = (i307 & i310) | (i307 ^ i310);
                        r2 = r16;
                    }
                } else {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        r17 = r19;
                        char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16948);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2740;
                        int scrollBarSize = 13 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte b12 = $$a[3];
                        byte b13 = (byte) (b12 | 36);
                        Object[] objArr14 = new Object[1];
                        c(b12, b13, (short) (b13 | 66), objArr14);
                        r17 = 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iIndexOf, scrollBarSize, 631063962, false, (String) objArr14[0], null);
                    }
                    r17 = r19;
                    r15 = r17;
                    r110 = r17;
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i1910 = g + 85;
                            asInterface = i1910 % 128;
                            int i2010 = i1910 % 2;
                            int i2011 = (-734358584) - (~(-View.MeasureSpec.getSize(0)));
                            int i2012 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int i2013 = (i2012 & (-111)) + (i2012 | (-111));
                            int i2014 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i2015 = asInterface;
                            int i2016 = ((i2015 | 115) << 1) - (i2015 ^ 115);
                            g = i2016 % 128;
                            int i2017 = i2016 % 2;
                            int i2018 = i2014 * (-115);
                            int i2019 = (i2018 ^ 2990) + ((i2018 & 2990) << 1);
                            int i2110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                            int i2111 = (i2019 - (~(-(-((~(((i2110 & i2014) | (i2110 ^ i2014)) | (-26))) * (-116)))))) - 1;
                            int i2112 = i2015 + 103;
                            g = i2112 % 128;
                            int i2113 = i2112 % 2;
                            int i2114 = (i2014 | iTuitionPaymentFragmentspecialinlinedviewModeldefault9) * 116;
                            i15 = ((i2111 | i2114) << 1) - (i2114 ^ i2111);
                            int i2115 = ~i2014;
                            i16 = ~((i2115 & 25) | (i2115 ^ 25));
                            int i2116 = (i2015 & 3) + (i2015 | 3);
                            g = i2116 % 128;
                            i17 = i2116 % 2;
                            i18 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & 25) | (25 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                            if (i17 == 0) {
                                s = (short) (i15 >> (((i16 & i18) | (i16 ^ i18)) * 116));
                                windowTouchSlop = (byte) (ViewConfiguration.getWindowTouchSlop() % 97);
                                iBlue = Color.blue(0);
                            } else {
                                int i2117 = (i16 | i18) * 116;
                                s = (short) ((i15 ^ i2117) + ((i2117 & i15) << 1));
                                windowTouchSlop = (byte) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                iBlue = Color.blue(0);
                            }
                            int i2118 = -iBlue;
                            byte b14 = windowTouchSlop;
                            int i2119 = ~i2118;
                            int i2210 = ((i2118 * (-716)) - (-2031057919)) + (((94198637 ^ i2119) | (94198637 & i2119)) * (-1434));
                            int i2211 = ~i;
                            int i2212 = g;
                            int i2213 = (i2212 ^ 25) + ((25 & i2212) << 1);
                            int i2214 = i2213 % 128;
                            asInterface = i2214;
                            int i2215 = i2213 % 2;
                            int i2216 = (i2118 ^ 94198637) | (i2118 & 94198637);
                            int i2217 = (~((i2211 ^ 94198637) | (i2211 & 94198637))) | (~i2216);
                            int i2218 = (i2119 ^ (-94198638)) | (i2119 & (-94198638));
                            int i2219 = ~((i2218 & i) | (i2218 ^ i));
                            r15 = i2217 ^ i2219;
                            int i2310 = i2210 + (717 * ((i2219 & i2217) | (r15 == true ? 1 : 0)));
                            int i2311 = ~i2118;
                            int i2312 = (i2311 & (-94198638)) | (i2311 ^ (-94198638));
                            int i2313 = ~i;
                            int i2314 = ~((i2312 & i2313) | (i2312 ^ i2313));
                            int i2315 = ~i2216;
                            int i2316 = (i2314 & i2315) | (i2314 ^ i2315);
                            int i2317 = ~((94198637 ^ i) | (94198637 & i));
                            int i2318 = i2214 + 45;
                            g = i2318 % 128;
                            int i2319 = i2318 % 2;
                            Object[] objArr15 = new Object[1];
                            a(i2011, i2013, s, b14, (717 * ((i2316 & i2317) | (i2316 ^ i2317))) + i2310, objArr15);
                            Object[] objArr16 = {(String) objArr15[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char scrollDefaultDelay3 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int i2410 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 992;
                                int i2411 = 7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                byte b15 = $$a[7];
                                byte b16 = b15;
                                Object[] objArr17 = new Object[1];
                                c(b15, b16, (short) (b16 | 140), objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay3, i2410, i2411, 410748506, false, (String) objArr17[0], new Class[]{String.class});
                            }
                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr16)).longValue();
                            long j8 = 1242442500;
                            long j9 = i;
                            r16 = i4 == true ? 1 : 0;
                            long j10 = -1;
                            long j11 = j9 ^ j10;
                            long j12 = 521;
                            long j13 = j8 ^ j10;
                            long j14 = (((long) 522) * j8) + (((long) (-520)) * jLongValue2) + (((long) (-1042)) * (j8 | ((j11 | jLongValue2) ^ j10))) + ((jLongValue2 | j9) * j12) + (j12 * ((j10 ^ (jLongValue2 | (j11 | j8))) | ((j13 | (jLongValue2 ^ j10)) ^ j10) | ((j13 | j9) ^ j10))) + ((long) (-1443360737));
                            int i2412 = ((int) (j14 >> 32)) & ((((~((-2071593367) | i)) * TypedValues.CycleType.TYPE_EASING) - 1167968018) + (((~((-2071593367) | i2211)) | (-2147199423)) * TypedValues.CycleType.TYPE_EASING));
                            int i2413 = (int) j14;
                            int iNextInt2 = new Random().nextInt(840744152);
                            int i2414 = i2413 & ((-2058977519) + (((~((-1488001027) | iNextInt2)) | 50774616) * (-756)) + (((~iNextInt2) | (-1488001027)) * 756));
                            i6 = (i2412 & i2414) | (i2412 ^ i2414);
                        } else {
                            r15 = i4 == true ? 1 : 0;
                            int i2415 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int i2416 = ((i2415 | (-734358580)) << 1) - (i2415 ^ (-734358580));
                            int i2417 = -(-View.getDefaultSize(0, 0));
                            int i2418 = (i2417 & (-111)) + (i2417 | (-111));
                            i9 = -Drawable.resolveOpacity(0, 0);
                            i10 = i9 * 765;
                            i11 = asInterface + 19;
                            g = i11 % 128;
                            if (i11 % 2 == 0) {
                                int i2419 = i10 >> (-1498);
                                int i2510 = ~i;
                                int i2511 = ~((i2510 ^ i9) | (i2510 & i9));
                                int i2512 = i2419 / (764 >>> ((i2511 & (-29)) | (i2511 ^ (-29))));
                                int i2513 = ~i9;
                                int i2514 = ~((i2513 & (-29)) | (i2513 ^ (-29)));
                                int i2515 = ~((i2510 & (-29)) | (i2510 ^ (-29)));
                                i12 = i2512 % ((-1528) >>> ((i2515 & i2514) | (i2514 ^ i2515)));
                            } else {
                                int i2516 = ((i10 | 44283) << 1) - (i10 ^ 44283);
                                int i2517 = ~i;
                                int i2518 = (i2516 - (~(-(-(((~((i2517 & i9) | (i2517 ^ i9))) | (-29)) * 764))))) - 1;
                                int i2519 = ~((~i9) | (-29));
                                int i2610 = ~i;
                                int i2611 = (i2519 | (~((i2610 & (-29)) | (i2610 ^ (-29))))) * (-1528);
                                i12 = ((i2611 & i2518) << 1) + (i2518 ^ i2611);
                            }
                            int i2612 = ~i9;
                            int i2613 = ~((i2612 & (-29)) | (i2612 ^ (-29)));
                            int i2614 = ~((28 & i9) | (28 ^ i9));
                            int i2615 = (i2613 & i2614) | (i2613 ^ i2614);
                            int i2616 = ~i;
                            int i2617 = ~((i9 & i2616) | (i2616 ^ i9));
                            short s7 = (short) ((i12 - (~(764 * ((i2617 & i2615) | (i2615 ^ i2617))))) - 1);
                            byte b17 = (byte) (0 - (~(-(-TextUtils.lastIndexOf("", '0')))));
                            int i2618 = -(-KeyEvent.getDeadChar(0, 0));
                            int i2619 = ((i2618 | 94198665) << 1) - (i2618 ^ 94198665);
                            Object[] objArr18 = new Object[1];
                            a(i2416, i2418, s7, b17, i2619, objArr18);
                            str = (String) objArr18[0];
                            int i2710 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                            int i2711 = ~i2710;
                            int i2712 = (((i2710 * (-159)) + 798887052) - (~(((i2711 & (-734358516)) | (i2711 ^ (-734358516))) * 160))) - 1;
                            int i2713 = ~((i2616 ^ i2710) | (i2616 & i2710));
                            int i2714 = ~(((-734358516) & i2710) | (i2710 ^ (-734358516)));
                            int i2715 = ((i2713 & i2714) | (i2713 ^ i2714)) * (-160);
                            int i2716 = (i2712 ^ i2715) + ((i2712 & i2715) << 1);
                            int i2717 = ~((734358515 & i2616) | (734358515 ^ i2616));
                            int i2718 = -(-(((i2710 & i2717) | (i2710 ^ i2717)) * 160));
                            int i2719 = (i2716 ^ i2718) + ((i2718 & i2716) << 1);
                            int i2810 = (-111) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i2811 = -(-TextUtils.indexOf("", ""));
                            short s8 = (short) (((i2811 | 127) << 1) - (i2811 ^ 127));
                            byte bGreen2 = (byte) Color.green(0);
                            minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            i13 = g + 47;
                            asInterface = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i2812 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i2813 = ~((~minimumFlingVelocity) | (-94198667));
                                i14 = (((-661) >> minimumFlingVelocity) - 94198005) << (1324 >> ((i2812 & i2813) | (i2812 ^ i2813)));
                            } else {
                                int i2814 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i2815 = ~minimumFlingVelocity;
                                int i2816 = ~((i2815 & (-94198667)) | (i2815 ^ (-94198667)));
                                i14 = ((minimumFlingVelocity * (-661)) - 2135776082) + (((i2814 & i2816) | (i2814 ^ i2816)) * 1324);
                            }
                            int i2817 = ~((minimumFlingVelocity ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (minimumFlingVelocity & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            int i2818 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 | 94198666) ^ (-1);
                            int i2819 = (-1324) * ((i2818 & i2817) | (i2817 ^ i2818));
                            int i2910 = (i14 ^ i2819) + ((i14 & i2819) << 1);
                            int i2911 = ~minimumFlingVelocity;
                            int i2912 = (i2910 - (~(((~(minimumFlingVelocity | (-94198667))) | (~((i2911 & 94198666) | (i2911 ^ 94198666)))) * 662))) - 1;
                            Object[] objArr19 = new Object[1];
                            a(i2719, i2810, s8, bGreen2, i2912, objArr19);
                            objArr = new Object[]{(String) objArr19[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c3 = (char) (33603 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                int mirror2 = AndroidCharacter.getMirror('0') + 3037;
                                int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 26;
                                byte b18 = $$a[7];
                                byte b19 = b18;
                                Object[] objArr110 = new Object[1];
                                c(b18, b19, (short) (b19 | 140), objArr110);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, mirror2, fadingEdgeLength2, 1411172903, false, (String) objArr110[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                int i2913 = g;
                                int i2914 = (i2913 & 35) + (i2913 | 35);
                                asInterface = i2914 % 128;
                                int i2915 = i2914 % 2;
                                int i2916 = ((i2913 | 29) << 1) - (i2913 ^ 29);
                                asInterface = i2916 % 128;
                                int i2917 = i2916 % 2;
                                i6 = 1;
                                r16 = r15;
                            } else {
                                int i2918 = asInterface;
                                int i2919 = (i2918 & 105) + (i2918 | 105);
                                g = i2919 % 128;
                                int i3010 = i2919 % 2;
                                i6 = 0;
                                r16 = r15;
                            }
                        }
                        int i3011 = -i6;
                        int i3012 = ((i6 & i3011) | (i6 ^ i3011)) >> 31;
                        int i3013 = (i3012 & (~(i & 10)) & (i | 10)) | ((~i3012) & i);
                        i7 = asInterface + 43;
                        int i3014 = i7 % 128;
                        g = i3014;
                        if (i7 % 2 == 0) {
                            i8 = i2 & 74;
                        } else {
                            i8 = i2 & 32;
                        }
                        int i3015 = -i8;
                        int i3016 = ((i8 & i3015) | (i8 ^ i3015)) >> 31;
                        int i3017 = i3013 & (~i3016);
                        int i3018 = i3014 + 99;
                        asInterface = i3018 % 128;
                        int i3019 = i3018 % 2;
                        int i311 = i3016 & i;
                        i5 = (i3017 & i311) | (i3017 ^ i311);
                        r2 = r16;
                    } else {
                        r15 = r110;
                        if (Build.VERSION.SDK_INT == 30) {
                            int i1911 = g + 73;
                            asInterface = i1911 % 128;
                            int i1912 = i1911 % 2;
                            i5 = i;
                            r2 = i4;
                        } else {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i1913 = g + 85;
                                asInterface = i1913 % 128;
                                int i20110 = i1913 % 2;
                                int i20111 = (-734358584) - (~(-View.MeasureSpec.getSize(0)));
                                int i20112 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int i20113 = (i20112 & (-111)) + (i20112 | (-111));
                                int i20114 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i20115 = asInterface;
                                int i20116 = ((i20115 | 115) << 1) - (i20115 ^ 115);
                                g = i20116 % 128;
                                int i20117 = i20116 % 2;
                                int i20118 = i20114 * (-115);
                                int i20119 = (i20118 ^ 2990) + ((i20118 & 2990) << 1);
                                int i21110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                int i21111 = (i20119 - (~(-(-((~(((i21110 & i20114) | (i21110 ^ i20114)) | (-26))) * (-116)))))) - 1;
                                int i21112 = i20115 + 103;
                                g = i21112 % 128;
                                int i21113 = i21112 % 2;
                                int i21114 = (i20114 | iTuitionPaymentFragmentspecialinlinedviewModeldefault10) * 116;
                                i15 = ((i21111 | i21114) << 1) - (i21114 ^ i21111);
                                int i21115 = ~i20114;
                                i16 = ~((i21115 & 25) | (i21115 ^ 25));
                                int i21116 = (i20115 & 3) + (i20115 | 3);
                                g = i21116 % 128;
                                i17 = i21116 % 2;
                                i18 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & 25) | (25 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                if (i17 == 0) {
                                    s = (short) (i15 >> (((i16 & i18) | (i16 ^ i18)) * 116));
                                    windowTouchSlop = (byte) (ViewConfiguration.getWindowTouchSlop() % 97);
                                    iBlue = Color.blue(0);
                                } else {
                                    int i21117 = (i16 | i18) * 116;
                                    s = (short) ((i15 ^ i21117) + ((i21117 & i15) << 1));
                                    windowTouchSlop = (byte) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                    iBlue = Color.blue(0);
                                }
                                int i21118 = -iBlue;
                                byte b110 = windowTouchSlop;
                                int i21119 = ~i21118;
                                int i22110 = ((i21118 * (-716)) - (-2031057919)) + (((94198637 ^ i21119) | (94198637 & i21119)) * (-1434));
                                int i22111 = ~i;
                                int i22112 = g;
                                int i22113 = (i22112 ^ 25) + ((25 & i22112) << 1);
                                int i22114 = i22113 % 128;
                                asInterface = i22114;
                                int i22115 = i22113 % 2;
                                int i22116 = (i21118 ^ 94198637) | (i21118 & 94198637);
                                int i22117 = (~((i22111 ^ 94198637) | (i22111 & 94198637))) | (~i22116);
                                int i22118 = (i21119 ^ (-94198638)) | (i21119 & (-94198638));
                                int i22119 = ~((i22118 & i) | (i22118 ^ i));
                                r15 = i22117 ^ i22119;
                                int i23110 = i22110 + (717 * ((i22119 & i22117) | (r15 == true ? 1 : 0)));
                                int i23111 = ~i21118;
                                int i23112 = (i23111 & (-94198638)) | (i23111 ^ (-94198638));
                                int i23113 = ~i;
                                int i23114 = ~((i23112 & i23113) | (i23112 ^ i23113));
                                int i23115 = ~i22116;
                                int i23116 = (i23114 & i23115) | (i23114 ^ i23115);
                                int i23117 = ~((94198637 ^ i) | (94198637 & i));
                                int i23118 = i22114 + 45;
                                g = i23118 % 128;
                                int i23119 = i23118 % 2;
                                Object[] objArr111 = new Object[1];
                                a(i20111, i20113, s, b110, (717 * ((i23116 & i23117) | (i23116 ^ i23117))) + i23110, objArr111);
                                Object[] objArr112 = {(String) objArr111[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char scrollDefaultDelay4 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    int i24110 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 992;
                                    int i24111 = 7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    byte b111 = $$a[7];
                                    byte b112 = b111;
                                    Object[] objArr113 = new Object[1];
                                    c(b111, b112, (short) (b112 | 140), objArr113);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay4, i24110, i24111, 410748506, false, (String) objArr113[0], new Class[]{String.class});
                                }
                                long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr112)).longValue();
                                long j15 = 1242442500;
                                long j16 = i;
                                r16 = i4 == true ? 1 : 0;
                                long j17 = -1;
                                long j18 = j16 ^ j17;
                                long j19 = 521;
                                long j110 = j15 ^ j17;
                                long j111 = (((long) 522) * j15) + (((long) (-520)) * jLongValue3) + (((long) (-1042)) * (j15 | ((j18 | jLongValue3) ^ j17))) + ((jLongValue3 | j16) * j19) + (j19 * ((j17 ^ (jLongValue3 | (j18 | j15))) | ((j110 | (jLongValue3 ^ j17)) ^ j17) | ((j110 | j16) ^ j17))) + ((long) (-1443360737));
                                int i24112 = ((int) (j111 >> 32)) & ((((~((-2071593367) | i)) * TypedValues.CycleType.TYPE_EASING) - 1167968018) + (((~((-2071593367) | i22111)) | (-2147199423)) * TypedValues.CycleType.TYPE_EASING));
                                int i24113 = (int) j111;
                                int iNextInt3 = new Random().nextInt(840744152);
                                int i24114 = i24113 & ((-2058977519) + (((~((-1488001027) | iNextInt3)) | 50774616) * (-756)) + (((~iNextInt3) | (-1488001027)) * 756));
                                i6 = (i24112 & i24114) | (i24112 ^ i24114);
                            } else {
                                r15 = i4 == true ? 1 : 0;
                                int i24115 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int i24116 = ((i24115 | (-734358580)) << 1) - (i24115 ^ (-734358580));
                                int i24117 = -(-View.getDefaultSize(0, 0));
                                int i24118 = (i24117 & (-111)) + (i24117 | (-111));
                                i9 = -Drawable.resolveOpacity(0, 0);
                                i10 = i9 * 765;
                                i11 = asInterface + 19;
                                g = i11 % 128;
                                if (i11 % 2 == 0) {
                                    int i24119 = i10 >> (-1498);
                                    int i25110 = ~i;
                                    int i25111 = ~((i25110 ^ i9) | (i25110 & i9));
                                    int i25112 = i24119 / (764 >>> ((i25111 & (-29)) | (i25111 ^ (-29))));
                                    int i25113 = ~i9;
                                    int i25114 = ~((i25113 & (-29)) | (i25113 ^ (-29)));
                                    int i25115 = ~((i25110 & (-29)) | (i25110 ^ (-29)));
                                    i12 = i25112 % ((-1528) >>> ((i25115 & i25114) | (i25114 ^ i25115)));
                                } else {
                                    int i25116 = ((i10 | 44283) << 1) - (i10 ^ 44283);
                                    int i25117 = ~i;
                                    int i25118 = (i25116 - (~(-(-(((~((i25117 & i9) | (i25117 ^ i9))) | (-29)) * 764))))) - 1;
                                    int i25119 = ~((~i9) | (-29));
                                    int i26110 = ~i;
                                    int i26111 = (i25119 | (~((i26110 & (-29)) | (i26110 ^ (-29))))) * (-1528);
                                    i12 = ((i26111 & i25118) << 1) + (i25118 ^ i26111);
                                }
                                int i26112 = ~i9;
                                int i26113 = ~((i26112 & (-29)) | (i26112 ^ (-29)));
                                int i26114 = ~((28 & i9) | (28 ^ i9));
                                int i26115 = (i26113 & i26114) | (i26113 ^ i26114);
                                int i26116 = ~i;
                                int i26117 = ~((i9 & i26116) | (i26116 ^ i9));
                                short s9 = (short) ((i12 - (~(764 * ((i26117 & i26115) | (i26115 ^ i26117))))) - 1);
                                byte b113 = (byte) (0 - (~(-(-TextUtils.lastIndexOf("", '0')))));
                                int i26118 = -(-KeyEvent.getDeadChar(0, 0));
                                int i26119 = ((i26118 | 94198665) << 1) - (i26118 ^ 94198665);
                                Object[] objArr114 = new Object[1];
                                a(i24116, i24118, s9, b113, i26119, objArr114);
                                str = (String) objArr114[0];
                                int i27110 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                int i27111 = ~i27110;
                                int i27112 = (((i27110 * (-159)) + 798887052) - (~(((i27111 & (-734358516)) | (i27111 ^ (-734358516))) * 160))) - 1;
                                int i27113 = ~((i26116 ^ i27110) | (i26116 & i27110));
                                int i27114 = ~(((-734358516) & i27110) | (i27110 ^ (-734358516)));
                                int i27115 = ((i27113 & i27114) | (i27113 ^ i27114)) * (-160);
                                int i27116 = (i27112 ^ i27115) + ((i27112 & i27115) << 1);
                                int i27117 = ~((734358515 & i26116) | (734358515 ^ i26116));
                                int i27118 = -(-(((i27110 & i27117) | (i27110 ^ i27117)) * 160));
                                int i27119 = (i27116 ^ i27118) + ((i27118 & i27116) << 1);
                                int i28110 = (-111) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i28111 = -(-TextUtils.indexOf("", ""));
                                short s10 = (short) (((i28111 | 127) << 1) - (i28111 ^ 127));
                                byte bGreen3 = (byte) Color.green(0);
                                minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                i13 = g + 47;
                                asInterface = i13 % 128;
                                if (i13 % 2 != 0) {
                                    int i28112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i28113 = ~((~minimumFlingVelocity) | (-94198667));
                                    i14 = (((-661) >> minimumFlingVelocity) - 94198005) << (1324 >> ((i28112 & i28113) | (i28112 ^ i28113)));
                                } else {
                                    int i28114 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i28115 = ~minimumFlingVelocity;
                                    int i28116 = ~((i28115 & (-94198667)) | (i28115 ^ (-94198667)));
                                    i14 = ((minimumFlingVelocity * (-661)) - 2135776082) + (((i28114 & i28116) | (i28114 ^ i28116)) * 1324);
                                }
                                int i28117 = ~((minimumFlingVelocity ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (minimumFlingVelocity & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                int i28118 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 | 94198666) ^ (-1);
                                int i28119 = (-1324) * ((i28118 & i28117) | (i28117 ^ i28118));
                                int i29110 = (i14 ^ i28119) + ((i14 & i28119) << 1);
                                int i29111 = ~minimumFlingVelocity;
                                int i29112 = (i29110 - (~(((~(minimumFlingVelocity | (-94198667))) | (~((i29111 & 94198666) | (i29111 ^ 94198666)))) * 662))) - 1;
                                Object[] objArr115 = new Object[1];
                                a(i27119, i28110, s10, bGreen3, i29112, objArr115);
                                objArr = new Object[]{(String) objArr115[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char c4 = (char) (33603 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                    int mirror3 = AndroidCharacter.getMirror('0') + 3037;
                                    int fadingEdgeLength3 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 26;
                                    byte b114 = $$a[7];
                                    byte b115 = b114;
                                    Object[] objArr116 = new Object[1];
                                    c(b114, b115, (short) (b115 | 140), objArr116);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, mirror3, fadingEdgeLength3, 1411172903, false, (String) objArr116[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i29113 = g;
                                    int i29114 = (i29113 & 35) + (i29113 | 35);
                                    asInterface = i29114 % 128;
                                    int i29115 = i29114 % 2;
                                    int i29116 = ((i29113 | 29) << 1) - (i29113 ^ 29);
                                    asInterface = i29116 % 128;
                                    int i29117 = i29116 % 2;
                                    i6 = 1;
                                    r16 = r15;
                                } else {
                                    int i29118 = asInterface;
                                    int i29119 = (i29118 & 105) + (i29118 | 105);
                                    g = i29119 % 128;
                                    int i30110 = i29119 % 2;
                                    i6 = 0;
                                    r16 = r15;
                                }
                            }
                            int i30111 = -i6;
                            int i30112 = ((i6 & i30111) | (i6 ^ i30111)) >> 31;
                            int i30113 = (i30112 & (~(i & 10)) & (i | 10)) | ((~i30112) & i);
                            i7 = asInterface + 43;
                            int i30114 = i7 % 128;
                            g = i30114;
                            if (i7 % 2 == 0) {
                                i8 = i2 & 74;
                            } else {
                                i8 = i2 & 32;
                            }
                            int i30115 = -i8;
                            int i30116 = ((i8 & i30115) | (i8 ^ i30115)) >> 31;
                            int i30117 = i30113 & (~i30116);
                            int i30118 = i30114 + 99;
                            asInterface = i30118 % 128;
                            int i30119 = i30118 % 2;
                            int i312 = i30116 & i;
                            i5 = (i30117 & i312) | (i30117 ^ i312);
                            r2 = r16;
                        }
                    }
                }
                int i313 = (~r2) & i;
                int i314 = ~i;
                int i315 = i313 | (r2 & i314);
                int i316 = -i315;
                int i317 = ((i315 & i316) | (i315 ^ i316)) >> 31;
                int i318 = i5 & (~i317);
                int i319 = r2 & i317;
                int i320 = (i318 & i319) | (i318 ^ i319);
                int i321 = i ^ i320;
                int i322 = ((i321 | (-i321)) >> 31) & 16;
                Object[] objArr20 = {new int[]{i}, new int[1], new int[]{i320}, null};
                int i323 = (~((-564060256) | i)) | 545792085;
                int i324 = 1521273620 + (i323 * 992) + ((i323 | (~(i314 | (-505481857)))) * (-496)) + (((-523750027) | i) * 496);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i325 = -(-(i322 * (-963)));
                int i326 = ((i325 | (-964)) << 1) - (i325 ^ (-964));
                int i327 = -(-(i324 * 965));
                int i328 = ((i326 | i327) << 1) - (i327 ^ i326);
                int i329 = ~i322;
                int i330 = ~i324;
                int i331 = ~((i330 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i330 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                int i332 = i328 + (((i329 & i331) | (i329 ^ i331)) * (-964));
                int i333 = ~i324;
                int i334 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                int i335 = ((~((i334 & i333) | (i333 ^ i334))) | (~(i330 | i322))) * (-964);
                int i336 = -(-(((i332 | i335) << 1) - (i335 ^ i332)));
                int i337 = (i3 & i336) + (i3 | i336);
                int i338 = i337 << 13;
                int i339 = (i338 | i337) & (~(i337 & i338));
                int i340 = i339 >>> 17;
                int i341 = ((~i339) & i340) | ((~i340) & i339);
                int i342 = i341 << 5;
                ((int[]) objArr20[1])[0] = ((~i341) & i342) | ((~i342) & i341);
                return objArr20;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r6, byte r7, short r8) {
            /*
                int r8 = r8 + 117
                byte[] r0 = com.bpjstku.presentation.account.model.ItemAutodebitParticipant.TuitionPaymentFragmentbindingInflater1.$$c
                int r7 = r7 * 4
                int r7 = 4 - r7
                int r6 = r6 * 3
                int r6 = r6 + 1
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r6
                r8 = r7
                r4 = r2
                goto L25
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r6) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                r3 = r0[r7]
            L25:
                int r7 = r7 + 1
                int r3 = -r3
                int r8 = r8 + r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.model.ItemAutodebitParticipant.TuitionPaymentFragmentbindingInflater1.$$e(short, byte, short):java.lang.String");
        }
    }
}
