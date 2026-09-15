package com.bpjstku.data.config.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.app.NotificationCompat;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0019\u0010\u000eR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010 \u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u000eR\u001a\u0010\"\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\f"}, d2 = {"Lcom/bpjstku/data/config/model/AntreanMenuConfig;", "", "", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/bpjstku/data/config/model/AntreanMenuConfig;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "hideMenu", "Z", "getHideMenu", "linkAntreanKlaim", "Ljava/lang/String;", "getLinkAntreanKlaim", "linkAntreanInformasi", "getLinkAntreanInformasi", DynamicLink.Builder.KEY_LINK, "getLink", NotificationCompat.CATEGORY_STATUS, "getStatus"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AntreanMenuConfig {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static long b;

    @SerializedName("hide_menu")
    public boolean hideMenu;

    @SerializedName(DynamicLink.Builder.KEY_LINK)
    public String link;

    @SerializedName("link_pengaduan")
    public String linkAntreanInformasi;

    @SerializedName("link_antrean")
    public String linkAntreanKlaim;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    public boolean status;
    private static final byte[] $$c = {111, 40, 23, -13};
    private static final int $$d = 170;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {97, 58, 103, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 159;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 53 - r7
            int r8 = r8 * 52
            int r8 = 56 - r8
            byte[] r0 = com.bpjstku.data.config.model.AntreanMenuConfig.$$a
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r8]
        L26:
            int r6 = r6 + r3
            int r8 = r8 + 1
            int r6 = r6 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.config.model.AntreanMenuConfig.a(short, byte, short, java.lang.Object[]):void");
    }

    public AntreanMenuConfig(boolean z, String str, String str2, String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.hideMenu = z;
        this.linkAntreanKlaim = str;
        this.linkAntreanInformasi = str2;
        this.link = str3;
        this.status = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AntreanMenuConfig(boolean z, String str, String str2, String str3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        if ((i & 1) != 0) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        String str5 = (i & 2) != 0 ? "" : str;
        if ((i & 4) != 0) {
            int i4 = asInterface + 11;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
            str4 = "";
        } else {
            str4 = str2;
        }
        this(z, str5, str4, (i & 8) == 0 ? str3 : "", (i & 16) == 0 ? z2 : false);
    }

    public final boolean getHideMenu() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 79;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.hideMenu;
        int i5 = i2 + 31;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return z;
    }

    public final String getLinkAntreanKlaim() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.linkAntreanKlaim;
        int i5 = i3 + 5;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return str;
    }

    public final String getLinkAntreanInformasi() {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.linkAntreanInformasi;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return str;
    }

    public final String getLink() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 67;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.link;
        int i5 = i2 + 89;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getStatus() {
        boolean z;
        int i = 2 % 2;
        int i2 = asInterface + 57;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            z = this.status;
            int i4 = 71 / 0;
        } else {
            z = this.status;
        }
        int i5 = i3 + 37;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.alpha(0), 2188 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 39 - ImageFormat.getBitsPerPixel(0), 841711447, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 33017);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3011;
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 27;
                    byte b4 = (byte) ($$d & 7);
                    byte b5 = (byte) (b4 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, maximumFlingVelocity, modifierMetaStateMask, 321985076, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (-b6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 36504), TextUtils.lastIndexOf("", '0', 0) + 3377, View.MeasureSpec.getMode(0) + 17, -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i5 = $11 + 3;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 1;
                byte b9 = (byte) (-b8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 3377 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 17, -968507904, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
        int i7 = $11 + 31;
        $10 = i7 % 128;
        int i8 = i7 % 2;
    }

    public final boolean component5() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iLastIndexOf = 650 - TextUtils.lastIndexOf("", '0');
            int iResolveSize = 44 - View.resolveSize(0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[7], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iLastIndexOf, iResolveSize, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getLongPressTimeout() >> 16) + 22, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 62118), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf("", "", 0) + 15, (char) (Color.alpha(0) + 46411), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 651;
            int scrollDefaultDelay = 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte b3 = $$a[7];
            byte b4 = b3;
            byte b5 = b3;
            Object[] objArr5 = new Object[1];
            a(b4, (byte) (b4 | 52), b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, maximumFlingVelocity, scrollDefaultDelay, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int maximumFlingVelocity2 = 651 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int pressedStateDuration = 44 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte[] bArr2 = $$a;
                byte b6 = bArr2[80];
                Object[] objArr6 = new Object[1];
                a(b6, (byte) (b6 | 14), bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, maximumFlingVelocity2, pressedStateDuration, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i2 = ((int[]) objArr7[2])[0];
            int i3 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = 1718429737 + (((~((-655386268) | iIdentityHashCode)) | 16802458) * 1504) + ((~(iIdentityHashCode | (-638583810))) * (-1504)) + 1632898351;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[3])[0] = i6 ^ (i6 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), ExpandableListView.getPackedPositionGroup(0L) + 1610, TextUtils.lastIndexOf("", '0', 0, 0) + 27, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1445976961, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int iResolveOpacity = 651 - Drawable.resolveOpacity(0, 0);
                    int iLastIndexOf2 = 43 - TextUtils.lastIndexOf("", '0');
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr9 = new Object[1];
                    a(b8, (byte) (b8 | 52), b7, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, iResolveOpacity, iLastIndexOf2, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", "", 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 695, 98 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - View.MeasureSpec.makeMeasureSpec(0, 0)), 793 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 83), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i7 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 650;
                    int i8 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43;
                    byte[] bArr3 = $$a;
                    byte b9 = bArr3[80];
                    Object[] objArr11 = new Object[1];
                    a(b9, (byte) (b9 | 14), bArr3[7], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, i7, i8, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    c(ViewConfiguration.getKeyRepeatDelay() >> 16, 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (62118 - Drawable.resolveOpacity(0, 0)), objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(ImageFormat.getBitsPerPixel(0) + 23, 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((Process.myPid() >> 22) + 46411), objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int defaultSize = View.getDefaultSize(0, 0) + 651;
                        int iBlue = 44 - Color.blue(0);
                        byte b10 = $$a[7];
                        byte b11 = b10;
                        Object[] objArr14 = new Object[1];
                        a(b11, (byte) (b11 | 52), b10, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(longPressTimeout, defaultSize, iBlue, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int iMyPid = (Process.myPid() >> 22) + 651;
                        int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 44;
                        byte[] bArr4 = $$a;
                        byte b12 = bArr4[80];
                        Object[] objArr15 = new Object[1];
                        a(b12, bArr4[7], b12, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(absoluteGravity, iMyPid, iIndexOf, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
                throw null;
            }
            throw null;
        }
        int i9 = asInterface + 113;
        TuitionPaymentFragmentbindingInflater1 = i9 % 128;
        int i10 = i9 % 2;
        Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i11 = ((int[]) objArr[3])[0];
        int i12 = ((int[]) objArr[2])[0];
        int i13 = ((int[]) objArr[0])[0];
        int iMyUid = Process.myUid();
        int i14 = i11 + 1049828164 + (((~(iMyUid | 405607479)) | 131115656) * 305) + (((~((~iMyUid) | 405607479)) | 402176669) * 305);
        int i15 = (i14 << 13) ^ i14;
        int i16 = i15 ^ (i15 >>> 17);
        ((int[]) objArr16[3])[0] = i16 ^ (i16 << 5);
        int i17 = TuitionPaymentFragmentbindingInflater1 + 55;
        int i18 = i17 % 128;
        asInterface = i18;
        if (i17 % 2 == 0) {
            throw null;
        }
        boolean z = this.status;
        int i19 = i18 + 9;
        TuitionPaymentFragmentbindingInflater1 = i19 % 128;
        if (i19 % 2 == 0) {
            return z;
        }
        throw null;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentbindingInflater1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public AntreanMenuConfig() {
        this(false, null, null, null, false, 31, null);
    }

    public static /* synthetic */ AntreanMenuConfig copy$default(AntreanMenuConfig antreanMenuConfig, boolean z, String str, String str2, String str3, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 91;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            z = antreanMenuConfig.hideMenu;
            int i6 = i3 + 95;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            str = antreanMenuConfig.linkAntreanKlaim;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = antreanMenuConfig.linkAntreanInformasi;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            int i8 = TuitionPaymentFragmentbindingInflater1 + 91;
            asInterface = i8 % 128;
            if (i8 % 2 == 0) {
                String str6 = antreanMenuConfig.link;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str3 = antreanMenuConfig.link;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            z2 = antreanMenuConfig.status;
            int i9 = TuitionPaymentFragmentbindingInflater1 + 79;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
        }
        return antreanMenuConfig.copy(z3, str4, str5, str7, z2);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 15;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.hideMenu;
        int i5 = i2 + 61;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.linkAntreanKlaim;
        int i5 = i3 + 43;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.linkAntreanInformasi;
        int i5 = i3 + 59;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String str = this.link;
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return str;
    }

    public final AntreanMenuConfig copy(boolean p0, String p1, String p2, String p3, boolean p4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        AntreanMenuConfig antreanMenuConfig = new AntreanMenuConfig(p0, p1, p2, p3, p4);
        int i2 = asInterface + 39;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return antreanMenuConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 77;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == p0) {
            int i4 = i2 + 3;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(p0 instanceof AntreanMenuConfig)) {
            return false;
        }
        AntreanMenuConfig antreanMenuConfig = (AntreanMenuConfig) p0;
        if (this.hideMenu != antreanMenuConfig.hideMenu || !Intrinsics.areEqual(this.linkAntreanKlaim, antreanMenuConfig.linkAntreanKlaim)) {
            return false;
        }
        if (Intrinsics.areEqual(this.linkAntreanInformasi, antreanMenuConfig.linkAntreanInformasi)) {
            return Intrinsics.areEqual(this.link, antreanMenuConfig.link) && this.status == antreanMenuConfig.status;
        }
        int i6 = TuitionPaymentFragmentbindingInflater1 + 17;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Boolean.hashCode(this.hideMenu) * 31) + this.linkAntreanKlaim.hashCode()) * 31) + this.linkAntreanInformasi.hashCode()) * 31) + this.link.hashCode()) * 31) + Boolean.hashCode(this.status);
        int i4 = asInterface + 61;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        boolean z = this.hideMenu;
        String str = this.linkAntreanKlaim;
        String str2 = this.linkAntreanInformasi;
        String str3 = this.link;
        boolean z2 = this.status;
        StringBuilder sb = new StringBuilder("AntreanMenuConfig(hideMenu=");
        sb.append(z);
        sb.append(", linkAntreanKlaim=");
        sb.append(str);
        sb.append(", linkAntreanInformasi=");
        sb.append(str2);
        sb.append(", link=");
        sb.append(str3);
        sb.append(", status=");
        sb.append(z2);
        sb.append(")");
        String string = sb.toString();
        int i2 = asInterface + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
        }
        return string;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{17243, 49316, 17598, 51352, 19605, 53475, 21758, 55428, 23765, 57401, 25716, 59449, 27651, 61561, 29806, 63567, 31831, 33161, 1462, 35205, 3481, 37345, 1202, 34635, 854, 36727, 2916, 38658, 4883, 40725, 6962, 42950, 9179, 45043, 11262, 46986, 13202};
        b = -6628215648226168212L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, int r7, short r8) {
        /*
            byte[] r0 = com.bpjstku.data.config.model.AntreanMenuConfig.$$c
            int r8 = r8 * 3
            int r1 = 1 - r8
            int r6 = r6 * 3
            int r6 = r6 + 109
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.config.model.AntreanMenuConfig.$$e(byte, int, short):java.lang.String");
    }
}
