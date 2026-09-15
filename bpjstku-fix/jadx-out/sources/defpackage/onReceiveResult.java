package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import at.favre.lib.bytes.Bytes;
import com.google.android.libraries.places.internal.zzpu;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class onReceiveResult {

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        public SecureRandom INotificationSideChannel;
        public final Context TuitionPaymentFragmentbindingInflater1;
        public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public List<MediaBrowserCompatMediaBrowserImplApi23> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public char[] f1303a;
        public getStateLabel asBinder;
        public MediaBrowserCompatMediaBrowserImplApi213 asInterface;
        public MediaBrowserCompatMediaBrowserImplApi23.TuitionPaymentFragmentbindingInflater1 b;
        public boolean cancel;
        public final SharedPreferences cancelAll;
        public Provider d;
        public final String g;
        public MediaBrowserCompatMediaBrowserImplBase3 onTransact;
        private static final byte[] $$c = {6, -86, -9, -124};
        private static final int $$d = 30;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {110, -73, -111, 99, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
        private static final int $$b = 180;
        private static int INotificationSideChannelStubProxy = 0;
        private static int INotificationSideChannelDefault = 1;
        private static long notify = -4785031129217718698L;

        private static void c(short s, int i, byte b, Object[] objArr) {
            int i2 = s * 15;
            byte[] bArr = $$a;
            int i3 = (i * 3) + 84;
            int i4 = b + 4;
            byte[] bArr2 = new byte[i2 + 38];
            int i5 = i2 + 37;
            int i6 = -1;
            if (bArr == null) {
                i3 = (i3 + i5) - 11;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i3;
                i4++;
                if (i6 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i3 = (i3 + bArr[i4]) - 11;
            }
        }

        private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(notify ^ (-2687588926731523482L), cArr, i);
            abortcapture.b = 4;
            while (abortcapture.b < cArrB.length) {
                int i3 = $10 + 33;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                int i5 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(notify)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 64838), ((byte) KeyEvent.getModifierMetaStateMask()) + 1357, Drawable.resolveOpacity(0, 0) + 38, 894276454, false, $$e(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - ((Process.getThreadPriority(0) + 20) >> 6)), 468 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i6 = $11 + 5;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, String str, byte b) {
            this(context, str);
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, String str) {
            this(context, str, (char) 0);
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, String str, char c) {
            this.onTransact = new MediaBrowserCompatMediaBrowserImplApi217(MediaBrowserCompatMediaBrowserImpl.b);
            MediaBrowserCompatMediaBrowserImplApi23.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new MediaBrowserCompatMediaBrowserImplApi23.TuitionPaymentFragmentbindingInflater1((byte) 0);
            tuitionPaymentFragmentbindingInflater1.asBinder = 0;
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new MediaBrowserCompatCustomActionResultReceiver();
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 = new onServiceConnected();
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new MediaBrowserCompatMediaBrowserImplApi216.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            this.b = tuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList(2);
            this.INotificationSideChannel = new SecureRandom();
            this.asBinder = new dump.TuitionPaymentFragmentbindingInflater1();
            this.cancel = false;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
            this.cancelAll = null;
            this.TuitionPaymentFragmentbindingInflater1 = context;
            this.g = str;
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1(Context context, String... strArr) throws Throwable {
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
            int i;
            Bytes bytesTuitionPaymentFragmentbindingInflater1;
            int i2 = 2 % 2;
            Objects.requireNonNull(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char absoluteGravity = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
                int offsetAfter = 1755 - TextUtils.getOffsetAfter("", 0);
                int packedPositionType = 23 - ExpandableListView.getPackedPositionType(0L);
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr = new Object[1];
                c(b, b, bArr[5], objArr);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, offsetAfter, packedPositionType, 986134021, false, (String) objArr[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr2 = new Object[1];
            e(new char[]{47983, 34233, 25820, 25268, 47886, 51687, 64728, 34390, 35776, 63776, 44440, 30666, 55936, 10362, 40210, 9463, 10582, 23482, 19976, 5121, 30722, 35530, 16336, 50507, 18636, 47650}, TextUtils.getTrimmedLength(""), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            e(new char[]{14328, 3975, 53282, 64777, 14237, 17371, 18467, 6633, 1867, 29458, 6502, 59403, 22045, 41558, 10670, 47981, 42449, 53658, 64231}, Color.blue(0), objArr3);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                int i3 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int gidForName = 22 - Process.getGidForName("");
                byte[] bArr2 = $$a;
                byte b2 = bArr2[28];
                byte b3 = bArr2[7];
                Object[] objArr4 = new Object[1];
                c(b2, b3, (byte) (b3 | 36), objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i3, gidForName, 1596667560, false, (String) objArr4[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                    int touchSlop = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
                    int capsMode = 23 - TextUtils.getCapsMode("", 0, 0);
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[28];
                    byte b5 = bArr3[7];
                    Object[] objArr5 = new Object[1];
                    c(b4, b5, (byte) (b5 | 88), objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, touchSlop, capsMode, 1599039318, false, (String) objArr5[0], null);
                }
                Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
                int iMyUid = Process.myUid();
                int i4 = ((((~((~iMyUid) | 1039561279)) * 130) + 560828983) + (((~(iMyUid | 1039561279)) | 144850945) * 130)) - 2097877000;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i6 ^ (i6 << 5);
                i = INotificationSideChannelDefault + 25;
            } else {
                Object[] objArr7 = new Object[1];
                e(new char[]{61349, 701, 60468, 38628, 61391, 20204, 29730, 29205, 57163, 32289, 9589, 33754, 36418, 44835, 5511, 53389, 32150, 56505, 50929, 57433}, ViewConfiguration.getLongPressTimeout() >> 16, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                e(new char[]{12111, 22992, 25203, 28997, 12070, 5508, 64118, 38331, 8187, 9545, 43815, 25708, 20103, 62465, 39904, 14141, 48460, 34767, 18615, 2032}, ViewConfiguration.getKeyRepeatDelay() >> 16, objArr8);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr9 = {-1911540850};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 42049), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1727, 29 - ExpandableListView.getPackedPositionGroup(0L), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), -2097877000, false, true);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 1755;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                        byte[] bArr4 = $$a;
                        byte b6 = bArr4[28];
                        byte b7 = bArr4[7];
                        Object[] objArr10 = new Object[1];
                        c(b6, b7, (byte) (b7 | 88), objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, absoluteGravity2, iIndexOf, 1599039318, false, (String) objArr10[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                    try {
                        Object[] objArr11 = new Object[1];
                        e(new char[]{47983, 34233, 25820, 25268, 47886, 51687, 64728, 34390, 35776, 63776, 44440, 30666, 55936, 10362, 40210, 9463, 10582, 23482, 19976, 5121, 30722, 35530, 16336, 50507, 18636, 47650}, TextUtils.indexOf("", "", 0), objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        e(new char[]{14328, 3975, 53282, 64777, 14237, 17371, 18467, 6633, 1867, 29458, 6502, 59403, 22045, 41558, 10670, 47981, 42449, 53658, 64231}, KeyEvent.keyCodeFromString(""), objArr12);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char offsetBefore = (char) (29944 - TextUtils.getOffsetBefore("", 0));
                            int iIndexOf2 = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            int iMyPid = (Process.myPid() >> 22) + 23;
                            byte[] bArr5 = $$a;
                            byte b8 = bArr5[28];
                            byte b9 = bArr5[7];
                            Object[] objArr13 = new Object[1];
                            c(b8, b9, (byte) (b9 | 36), objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore, iIndexOf2, iMyPid, 1596667560, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                            int i7 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                            int touchSlop2 = 23 - (ViewConfiguration.getTouchSlop() >> 8);
                            byte[] bArr6 = $$a;
                            byte b10 = bArr6[7];
                            Object[] objArr14 = new Object[1];
                            c(b10, b10, bArr6[5], objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveOpacity, i7, touchSlop2, 986134021, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                        i = INotificationSideChannelDefault + 101;
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
            INotificationSideChannelStubProxy = i % 128;
            int i8 = i % 2;
            int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
            int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
            if (i10 != i9) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i10));
            }
            int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i12 = ~((-4346315) | iMaxMemory);
            int i13 = ~iMaxMemory;
            int i14 = i11 + (-970396533) + ((i12 | (~(208403951 | i13))) * (-406)) + ((~((-147841) | i13)) * (-406)) + (((~(iMaxMemory | (-208256112))) | (~(4346314 | i13))) * 406);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr15[3])[0] = i16 ^ (i16 << 5);
            StringBuilder sb = new StringBuilder();
            int length = strArr.length;
            int i17 = ((int[]) objArr15[3])[0];
            int i18 = ((i17 * i17) - (~(-(1320047267 * i17)))) - 1;
            int i19 = -(i17 * (-514016395));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            int i21 = ((i20 | (-843732848)) << 1) - ((-843732848) ^ i20);
            int i22 = i21 >> 26;
            int i23 = ((i22 & ComposerKt.defaultsKey) + (i22 | ComposerKt.defaultsKey)) / 64;
            int i24 = ((i23 | 1) << 1) - (i23 ^ 1);
            int i25 = ((i21 | i24) << 1) - (i24 ^ i21);
            int i26 = i21 >> 23;
            int i27 = ((i26 & (-1023)) + (i26 | (-1023))) / 512;
            int i28 = (-((((i27 | 1) << 1) - (i27 ^ 1)) ^ i25)) + 9;
            int i29 = (((i28 >> 19) - 16383) / 8192) + 1;
            for (int i30 = 0 / ((i28 & (-((i29 ^ 1) + ((i29 & 1) << 1)))) * 162); i30 <= 0; i30++) {
                sb.append(strArr[i30]);
            }
            String string = sb.toString();
            byte[] bArrTuitionPaymentFragmentbindingInflater1 = MediaBrowserCompatMediaBrowserImplApi214.TuitionPaymentFragmentbindingInflater1(context);
            String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string2 == null) {
                int i31 = INotificationSideChannelDefault + 99;
                INotificationSideChannelStubProxy = i31 % 128;
                int i32 = i31 % 2;
                getContentPaddingRight.asBinder("This devices returned null as ANDROID_ID, using fallback. This is not expected and may be a device bug. If this behaviour is non-deterministic, it may disrupt the possibility of decrypting the content.", new Object[0]);
                string2 = "0000000000000000";
            }
            byte[] bArr7 = Bytes.TuitionPaymentFragmentbindingInflater1(string2).byteArray;
            byte[] bArr8 = Bytes.TuitionPaymentFragmentbindingInflater1(String.valueOf(context.getApplicationContext().getPackageName())).byteArray;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Build.DEVICE);
            sb2.append(Build.MODEL);
            sb2.append(Build.MANUFACTURER);
            byte[] bArr9 = Bytes.TuitionPaymentFragmentbindingInflater1(sb2.toString()).byteArray;
            byte[] bArr10 = MediaBrowserCompatMediaBrowserImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (string != null) {
                int i33 = INotificationSideChannelStubProxy + 93;
                INotificationSideChannelDefault = i33 % 128;
                int i34 = i33 % 2;
                bytesTuitionPaymentFragmentbindingInflater1 = Bytes.TuitionPaymentFragmentbindingInflater1(string);
            } else {
                bytesTuitionPaymentFragmentbindingInflater1 = Bytes.TuitionPaymentFragmentbindingInflater1();
            }
            this.asInterface = new MediaBrowserCompatMediaBrowserImplApi213.b(Bytes.b(bArrTuitionPaymentFragmentbindingInflater1, bArr7, bArr8, bArr9, bArr10, bytesTuitionPaymentFragmentbindingInflater1.byteArray).byteArray);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r5, byte r6, short r7) {
            /*
                byte[] r0 = onReceiveResult.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$c
                int r6 = r6 * 3
                int r6 = r6 + 4
                int r7 = r7 * 2
                int r7 = 107 - r7
                int r5 = r5 * 2
                int r1 = 1 - r5
                byte[] r1 = new byte[r1]
                r2 = 0
                int r5 = 0 - r5
                if (r0 != 0) goto L18
                r4 = r6
                r3 = r2
                goto L28
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r5) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L24:
                int r3 = r3 + 1
                r4 = r0[r6]
            L28:
                int r6 = r6 + 1
                int r4 = -r4
                int r7 = r7 + r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: onReceiveResult.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$e(short, byte, short):java.lang.String");
        }
    }
}
