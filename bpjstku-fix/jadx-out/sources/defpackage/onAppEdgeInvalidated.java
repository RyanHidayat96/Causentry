package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import androidx.p005navigation.ActivityNavigator;
import androidx.p005navigation.fragment.DialogFragmentNavigator;
import androidx.p005navigation.fragment.FragmentNavigator;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011"}, d2 = {"LonAppEdgeInvalidated;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class onAppEdgeInvalidated {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String b;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public onAppEdgeInvalidated(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.b = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
    }

    /* JADX INFO: renamed from: onAppEdgeInvalidated$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0001H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0001H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0001H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey$Companion;", "", "()V", "from", "Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "key", "name", "", "resolveComponent", "Landroid/content/ComponentName;", "resolveComponentUrl", "resolveId", "resolveName", "resolveUrl", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$c = {73, 55, 58, 33};
        private static final int $$d = 174;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {99, -43, -44, -62, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 219;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int asBinder = 1;
        private static char[] TuitionPaymentFragmentbindingInflater1 = {47281, 47268, 47278, 47264, 47267, 47273, 47204, 47327, 47295, 47321, 47326, 47277, 47269, 47247, 47270, 47279, 47271, 47266, 47232};
        private static int b = 2047719506;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                int r0 = r6 + 1
                int r5 = r5 * 52
                int r5 = r5 + 4
                int r7 = r7 * 14
                int r7 = r7 + 84
                byte[] r1 = defpackage.onAppEdgeInvalidated.Companion.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r3 = r5
                r4 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L24:
                r3 = r1[r5]
            L26:
                int r5 = r5 + 1
                int r7 = r7 + r3
                int r7 = r7 + (-11)
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.onAppEdgeInvalidated.Companion.a(int, int, int, java.lang.Object[]):void");
        }

        private Companion() {
        }

        public static /* synthetic */ onAppEdgeInvalidated b(Companion companion, Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            onAppEdgeInvalidated onappedgeinvalidatedTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj, null);
            int i4 = asBinder + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            return onappedgeinvalidatedTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
            char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
            int i3 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(cArr2[i4]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i3;
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', i3) + 31340), 2993 - Process.getGidForName(""), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, 1182129903, false, $$e(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i4++;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - (Process.myTid() >> 22)), 253 - View.MeasureSpec.getSize(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i5 = 33602;
            int i6 = 1687675375;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i7 = $11 + 81;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i9 = $10 + 33;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (i5 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 3085 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollBarSize() >> 8) + 26, -2146875848, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i5 = 33602;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            int i11 = 0;
            if (!(!TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 33602), 3085 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 26 - View.combineMeasuredStates(0, 0), -2146875848, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    i6 = 1687675375;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            while (true) {
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11;
                while (true) {
                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        objArr[0] = new String(cArr6);
                        return;
                    }
                    int i12 = $11 + 123;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) % getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] >>> iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    }
                }
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                i11 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            }
        }

        /* JADX WARN: Code duplicated, block: B:110:0x061c  */
        /* JADX WARN: Code duplicated, block: B:111:0x061f  */
        /* JADX WARN: Code duplicated, block: B:113:0x0623  */
        /* JADX WARN: Code duplicated, block: B:114:0x0628  */
        /* JADX WARN: Code duplicated, block: B:116:0x062c  */
        /* JADX WARN: Code duplicated, block: B:117:0x063b  */
        /* JADX WARN: Code duplicated, block: B:119:0x0640  */
        /* JADX WARN: Code duplicated, block: B:120:0x064a  */
        /* JADX WARN: Code duplicated, block: B:122:0x064e  */
        /* JADX WARN: Code duplicated, block: B:123:0x0660  */
        /* JADX WARN: Code duplicated, block: B:62:0x04f1  */
        /* JADX WARN: Code duplicated, block: B:63:0x04f6  */
        /* JADX WARN: Code duplicated, block: B:65:0x04fa  */
        /* JADX WARN: Code duplicated, block: B:67:0x04fe  */
        /* JADX WARN: Code duplicated, block: B:68:0x0522  */
        /* JADX WARN: Code duplicated, block: B:70:0x0526  */
        /* JADX WARN: Code duplicated, block: B:71:0x0546  */
        /* JADX WARN: Code duplicated, block: B:73:0x054a  */
        /* JADX WARN: Code duplicated, block: B:74:0x056a  */
        public static onAppEdgeInvalidated TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, String str) throws Throwable {
            Object[] objArr;
            Object[] objArr2;
            ComponentName component;
            String className;
            String className2;
            String string;
            String simpleName;
            String name;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(obj, "");
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cBlue = (char) Color.blue(0);
                int i2 = 652 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i3 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr3 = new Object[1];
                a(b3, (byte) (b3 | 52), b2, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, i2, i3, -459846511, false, (String) objArr3[0], null);
            }
            Object obj2 = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr4 = new Object[1];
            c(null, null, 127 - (KeyEvent.getMaxKeyCode() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            c(null, null, ImageFormat.getBitsPerPixel(0) + 128, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 651;
                int iIndexOf = TextUtils.indexOf("", "") + 44;
                byte[] bArr = $$a;
                byte b4 = bArr[80];
                Object[] objArr6 = new Object[1];
                a(b4, bArr[7], b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, deadChar, iIndexOf, -873460649, false, (String) objArr6[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int i4 = 651 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 45;
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[80];
                    Object[] objArr7 = new Object[1];
                    a(b5, (byte) (b5 | 36), bArr2[7], objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, i4, packedPositionChild, -1595579076, false, (String) objArr7[0], null);
                }
                Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i5 = ((int[]) objArr8[2])[0];
                int i6 = ((int[]) objArr8[0])[0];
                int iMyUid = Process.myUid();
                int i7 = (-898292442) + (((-975175937) | iMyUid) * (-381)) + (((~((~iMyUid) | (-980208523))) | 13495982) * 381) + 413796611;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
            } else {
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 1610 - (ViewConfiguration.getEdgeSlop() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25, 2145681644, false, null, new Class[0]);
                    }
                    Object[] objArr9 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1761047549, 0};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                        int i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 650;
                        int iArgb = Color.argb(0, 0, 0, 0) + 44;
                        byte[] bArr3 = $$a;
                        byte b6 = bArr3[80];
                        Object[] objArr10 = new Object[1];
                        a(b6, bArr3[7], b6, objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror, i10, iArgb, 2075921419, false, (String) objArr10[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getLongPressTimeout() >> 16), View.MeasureSpec.getSize(0) + 695, 97 - Process.getGidForName("")), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63405 - Process.getGidForName("")), 793 - Color.green(0), 84 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Integer.TYPE, Integer.TYPE});
                    }
                    objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mirror2 = (char) ('0' - AndroidCharacter.getMirror('0'));
                        int i11 = 652 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 44;
                        byte[] bArr4 = $$a;
                        byte b7 = bArr4[80];
                        Object[] objArr11 = new Object[1];
                        a(b7, (byte) (b7 | 36), bArr4[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror2, i11, iMakeMeasureSpec, -1595579076, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                    try {
                        Object[] objArr12 = new Object[1];
                        c(null, null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr12);
                        Class<?> cls2 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        c(null, null, TextUtils.lastIndexOf("", '0') + 128, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr13);
                        long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 651;
                            int i12 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45;
                            byte[] bArr5 = $$a;
                            byte b8 = bArr5[80];
                            Object[] objArr14 = new Object[1];
                            a(b8, bArr5[7], b8, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(jumpTapTimeout, scrollBarSize, i12, -873460649, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 651;
                            int i13 = 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            byte b9 = $$a[7];
                            byte b10 = b9;
                            Object[] objArr15 = new Object[1];
                            a(b10, (byte) (b10 | 52), b9, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(pressedStateDuration, keyRepeatDelay, i13, -459846511, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
            int i14 = ((int[]) objArr[0])[0];
            int i15 = ((int[]) objArr[2])[0];
            if (i15 == i14) {
                int i16 = asBinder + 7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
                int i17 = i16 % 2;
                objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i18 = ((int[]) objArr[3])[0];
                int i19 = ((int[]) objArr[2])[0];
                int i20 = ((int[]) objArr[0])[0];
                int iMyTid = Process.myTid();
                int i21 = i18 + (-1312457374) + (((~((-4235777) | (~iMyTid))) | 804966) * (-591)) + ((iMyTid | (-4235777)) * 591);
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr2[3])[0] = i23 ^ (i23 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[1];
                if (strArr != null) {
                    int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                    asBinder = i24 % 128;
                    int i25 = i24 % 2;
                    for (String str2 : strArr) {
                        arrayList.add(str2);
                    }
                }
                int[] iArr = new int[i15];
                int i26 = i15 - 1;
                iArr[i26] = 1;
                Toast.makeText((Context) null, iArr[((i15 * i26) % 2) - 1], 1).show();
                objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i27 = ((int[]) objArr[3])[0];
                int i28 = ((int[]) objArr[2])[0];
                int i29 = ((int[]) objArr[0])[0];
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i30 = (-1905669072) + (((~((~iMaxMemory) | 563156037)) | (-567639520)) * (-245));
                int i31 = ~(iMaxMemory | 563156037);
                int i32 = i27 + i30 + (i31 * (-245)) + ((i31 | 566586847) * 245);
                int i33 = (i32 << 13) ^ i32;
                int i34 = i33 ^ (i33 >>> 17);
                ((int[]) objArr2[3])[0] = i34 ^ (i34 << 5);
            }
            if (obj instanceof Activity) {
                component = ((Activity) obj).getComponentName();
            } else if (obj instanceof ActivityNavigator.Destination) {
                component = ((ActivityNavigator.Destination) obj).getComponent();
            } else {
                int i35 = asBinder + 39;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i35 % 128;
                if (i35 % 2 != 0) {
                    int i36 = 5 % 4;
                }
                component = null;
            }
            if (component != null) {
                String className3 = component.getClassName();
                int iIdentityHashCode = System.identityHashCode(obj);
                StringBuilder sb = new StringBuilder();
                sb.append(className3);
                sb.append("@");
                sb.append(iIdentityHashCode);
                String string2 = sb.toString();
                String packageName = component.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                if (packageName.length() == 0) {
                    className = component.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "");
                } else {
                    String className4 = component.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className4, "");
                    String packageName2 = component.getPackageName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(packageName2);
                    sb2.append(".");
                    if (StringsKt.startsWith$default(className4, sb2.toString(), false, 2, (Object) null)) {
                        className = component.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className, "");
                    } else {
                        String className5 = component.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className5, "");
                        if (!StringsKt.contains$default((CharSequence) className5, '.', false, 2, (Object) null)) {
                            String packageName3 = component.getPackageName();
                            String className6 = component.getClassName();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(packageName3);
                            sb3.append(".");
                            sb3.append(className6);
                            className = sb3.toString();
                        } else {
                            int i37 = asBinder + 35;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i37 % 128;
                            if (i37 % 2 != 0) {
                                Intrinsics.checkNotNullExpressionValue(component.getClassName(), "");
                                obj2.hashCode();
                                throw null;
                            }
                            className = component.getClassName();
                            Intrinsics.checkNotNullExpressionValue(className, "");
                        }
                    }
                }
                if (str == null) {
                    className2 = component.getClassName();
                    int i38 = ((int[]) objArr2[3])[0];
                    int i39 = ((i38 * i38) - (~(-(2085560326 * i38)))) - 1;
                    int i40 = -(i38 * 185360158);
                    int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                    int i42 = (i41 & (-424726716)) + ((-424726716) | i41);
                    int i43 = ((i42 >> 15) - 262143) / 131072;
                    int i44 = (i43 ^ 1) + ((i43 & 1) << 1);
                    int i45 = (i42 ^ i44) + ((i44 & i42) << 1);
                    int i46 = i42 >> 19;
                    int i47 = ((i46 & (-16383)) + (i46 | (-16383))) / 8192;
                    int i48 = -(i45 ^ ((i47 ^ 1) + ((i47 & 1) << 1)));
                    int i49 = ((i48 | 8) << 1) - (i48 ^ 8);
                    int i50 = i49 >> 20;
                    int i51 = (((i50 ^ (-8191)) + ((i50 & (-8191)) << 1)) / 4096) + 1;
                    Intrinsics.checkNotNullExpressionValue(className2, "28;13;23;17;0;componentName.className".substring(7392 / (((-((i51 ^ 1) + ((i51 & 1) << 1))) & i49) * 66)));
                } else {
                    className2 = str;
                }
                return new onAppEdgeInvalidated(string2, className, className2);
            }
            int i52 = asBinder + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i52 % 128;
            if (i52 % 2 != 0) {
                int i53 = 1 / 0;
                if (obj instanceof String) {
                    string = (String) obj;
                } else if (obj instanceof Number) {
                    string = obj.toString();
                } else if (obj instanceof Enum) {
                    String name2 = obj.getClass().getName();
                    String strName = ((Enum) obj).name();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(name2);
                    sb4.append("@");
                    sb4.append(strName);
                    string = sb4.toString();
                } else if (obj instanceof DialogFragmentNavigator.Destination) {
                    DialogFragmentNavigator.Destination destination = (DialogFragmentNavigator.Destination) obj;
                    String className7 = destination.getClassName();
                    int id2 = destination.getId();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(className7);
                    sb5.append("#");
                    sb5.append(id2);
                    string = sb5.toString();
                } else if (obj instanceof FragmentNavigator.Destination) {
                    FragmentNavigator.Destination destination2 = (FragmentNavigator.Destination) obj;
                    String className8 = destination2.getClassName();
                    int id3 = destination2.getId();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(className8);
                    sb6.append("#");
                    sb6.append(id3);
                    string = sb6.toString();
                } else {
                    string = obj.toString();
                }
            } else if (obj instanceof String) {
                string = (String) obj;
            } else if (obj instanceof Number) {
                string = obj.toString();
            } else if (obj instanceof Enum) {
                String name3 = obj.getClass().getName();
                String strName2 = ((Enum) obj).name();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(name3);
                sb7.append("@");
                sb7.append(strName2);
                string = sb7.toString();
            } else if (obj instanceof DialogFragmentNavigator.Destination) {
                DialogFragmentNavigator.Destination destination3 = (DialogFragmentNavigator.Destination) obj;
                String className9 = destination3.getClassName();
                int id4 = destination3.getId();
                StringBuilder sb8 = new StringBuilder();
                sb8.append(className9);
                sb8.append("#");
                sb8.append(id4);
                string = sb8.toString();
            } else if (obj instanceof FragmentNavigator.Destination) {
                FragmentNavigator.Destination destination4 = (FragmentNavigator.Destination) obj;
                String className10 = destination4.getClassName();
                int id5 = destination4.getId();
                StringBuilder sb9 = new StringBuilder();
                sb9.append(className10);
                sb9.append("#");
                sb9.append(id5);
                string = sb9.toString();
            } else {
                string = obj.toString();
            }
            boolean z = obj instanceof String;
            if (z) {
                simpleName = (String) obj;
            } else if (obj instanceof Number) {
                int i54 = asBinder + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i54 % 128;
                if (i54 % 2 != 0) {
                    obj.toString();
                    throw null;
                }
                simpleName = obj.toString();
            } else if (obj instanceof Enum) {
                String name4 = obj.getClass().getName();
                String strName3 = ((Enum) obj).name();
                StringBuilder sb10 = new StringBuilder();
                sb10.append(name4);
                sb10.append(".");
                sb10.append(strName3);
                simpleName = sb10.toString();
            } else if (obj instanceof DialogFragmentNavigator.Destination) {
                simpleName = ((DialogFragmentNavigator.Destination) obj).getClassName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
            } else if (obj instanceof FragmentNavigator.Destination) {
                simpleName = ((FragmentNavigator.Destination) obj).getClassName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
            } else {
                String canonicalName = obj.getClass().getCanonicalName();
                if (canonicalName == null) {
                    int i55 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                    asBinder = i55 % 128;
                    if (i55 % 2 == 0) {
                        obj.getClass().getSimpleName();
                        obj2.hashCode();
                        throw null;
                    }
                    simpleName = obj.getClass().getSimpleName();
                } else {
                    simpleName = canonicalName;
                }
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
            }
            if (str == null) {
                int i56 = asBinder;
                int i57 = i56 + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i57 % 128;
                if (i57 % 2 != 0) {
                    int i58 = 25 / 0;
                    if (!(!z)) {
                        name = (String) obj;
                    } else if (obj instanceof Number) {
                        name = obj.toString();
                    } else if (obj instanceof Enum) {
                        int i59 = i56 + 81;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i59 % 128;
                        int i60 = i59 % 2;
                        name = ((Enum) obj).name();
                    } else if (!(!(obj instanceof DialogFragmentNavigator.Destination))) {
                        name = ((DialogFragmentNavigator.Destination) obj).getClassName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                    } else if (obj instanceof FragmentNavigator.Destination) {
                        int i61 = i56 + 71;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i61 % 128;
                        int i62 = i61 % 2;
                        name = ((FragmentNavigator.Destination) obj).getClassName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                    } else {
                        name = obj.getClass().getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                    }
                } else if (z) {
                    name = (String) obj;
                } else if (obj instanceof Number) {
                    name = obj.toString();
                } else if (obj instanceof Enum) {
                    int i510 = i56 + 81;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i510 % 128;
                    int i63 = i510 % 2;
                    name = ((Enum) obj).name();
                } else if (!(!(obj instanceof DialogFragmentNavigator.Destination))) {
                    name = ((DialogFragmentNavigator.Destination) obj).getClassName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                } else if (obj instanceof FragmentNavigator.Destination) {
                    int i64 = i56 + 71;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i64 % 128;
                    int i65 = i64 % 2;
                    name = ((FragmentNavigator.Destination) obj).getClassName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                } else {
                    name = obj.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                }
            } else {
                name = str;
            }
            return new onAppEdgeInvalidated(string, simpleName, name);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static String $$e(byte b2, byte b3, short s) {
            byte[] bArr = $$c;
            int i = b3 + 4;
            int i2 = s + 67;
            int i3 = b2 * 2;
            byte[] bArr2 = new byte[1 - i3];
            int i4 = 0 - i3;
            int i5 = -1;
            if (bArr == null) {
                i2 += i4;
            }
            while (true) {
                i5++;
                i++;
                bArr2[i5] = (byte) i2;
                if (i5 == i4) {
                    return new String(bArr2, 0);
                }
                i2 += bArr[i];
            }
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof onAppEdgeInvalidated)) {
            return false;
        }
        onAppEdgeInvalidated onappedgeinvalidated = (onAppEdgeInvalidated) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, onappedgeinvalidated.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, onappedgeinvalidated.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, onappedgeinvalidated.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final int hashCode() {
        return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2 = this.b;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("onAppEdgeInvalidated(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str);
        sb.append(", b=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
