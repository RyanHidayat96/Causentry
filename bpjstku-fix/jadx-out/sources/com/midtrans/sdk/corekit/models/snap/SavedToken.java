package com.midtrans.sdk.corekit.models.snap;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class SavedToken {
    public static final String ONE_CLICK = "one_click";
    public static final String TWO_CLICKS = "two_clicks";

    @SerializedName("expires_at")
    public String expiresAt;
    public boolean fromHostApp;

    @SerializedName("masked_card")
    public String maskedCard;
    public String token;

    @SerializedName("token_type")
    public String tokenType;
    private static final byte[] $$c = {97, 58, 103, -72};
    private static final int $$d = 106;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {112, 19, -59, 97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 214;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6377398940819159759L;
    private static int b = -981105359;
    private static char TuitionPaymentFragmentbindingInflater1 = 12163;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r7 = 53 - r7
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r0 = com.midtrans.sdk.corekit.models.snap.SavedToken.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
        L27:
            int r3 = -r3
            int r6 = r6 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.snap.SavedToken.a(byte, short, byte, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i4 = $11 + 15;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 3;
        }
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i6 = $10 + 25;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cArgb = (char) (8328 - Color.argb(i3, i3, i3, i3));
                    int keyRepeatTimeout = 1235 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int threadPriority = 35 - ((Process.getThreadPriority(i3) + 20) >> 6);
                    byte b2 = (byte) i3;
                    byte b3 = b2;
                    String str$$e = $$e(b2, b3, (byte) (b3 + 2));
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, keyRepeatTimeout, threadPriority, -653973969, false, str$$e, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(i3);
                    int i8 = (ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1)) + 2765;
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 14;
                    byte b4 = (byte) i3;
                    byte b5 = b4;
                    String str$$e2 = $$e(b4, b5, b5);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i3] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, i8, edgeSlop, 1504416861, false, str$$e2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                int i9 = cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i9);
                objArr4[i3] = sessionProcessor;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cNormalizeMetaState2 = (char) (43325 - KeyEvent.normalizeMetaState(i3));
                    int capsMode = 253 - TextUtils.getCapsMode("", i3, i3);
                    int packedPositionChild = 21 - ExpandableListView.getPackedPositionChild(0L);
                    c2 = 3;
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i3] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState2, capsMode, packedPositionChild, -721491957, false, "j", clsArr3);
                } else {
                    c2 = 3;
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i10 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i3] = Integer.valueOf(i10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRgb = (char) (Color.rgb(i3, i3, i3) + 16842416);
                    int iResolveSize = View.resolveSize(i3, i3) + 2891;
                    int iKeyCodeFromString = 17 - KeyEvent.keyCodeFromString("");
                    byte b6 = (byte) i3;
                    byte b7 = b6;
                    String str$$e3 = $$e(b6, b7, (byte) (b7 + 1));
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i3] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, iResolveSize, iKeyCodeFromString, 2012627446, false, str$$e3, clsArr4);
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) b) ^ (-6377398940819159759L)))) ^ (((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public void setExpiresAt(String str) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 651;
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b2, bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, keyRepeatTimeout2, doubleTapTimeout, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{20746, 6408, 47830, 20109}, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.red(0), new char[]{65106, 64250, 44326, 40893, 30464, 2973, 64155, 14099, 16726, 52497, 62371, 46696, 37142, 6425, 34199, 45968, 60679, 56670, 23639, 39312, 49889, 21225}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{7322, 3711, 21427, 28061}, (char) (40275 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getEdgeSlop() >> 16) - 1290895588, new char[]{19570, 17401, 15181, 17637, 15952, 57386, 19835, 42093, 56380, 21720, 32759, 24551, 52521, 10520, 12820}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int iRed = Color.red(0) + 651;
            int iMyTid = 44 - (Process.myTid() >> 22);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr2[5], (byte) 52, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iRed, iMyTid, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 651;
                int packedPositionGroup = 44 - ExpandableListView.getPackedPositionGroup(0L);
                byte b3 = $$a[5];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (b4 | 14), b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, iCombineMeasuredStates, packedPositionGroup, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[0])[0];
            int iNextInt = new Random().nextInt();
            int i6 = (((((~(343137469 | iNextInt)) | (-14412523)) * 262) + 923149073) + (((~((~iNextInt) | 343137469)) | (-14412523)) * 262)) - 1427386300;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[3])[0] = i8 ^ (i8 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), Process.getGidForName("") + 1611, Color.argb(0, 0, 0, 0) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1427386300, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int packedPositionGroup2 = 651 - ExpandableListView.getPackedPositionGroup(0L);
                    int iResolveOpacity = 44 - Drawable.resolveOpacity(0, 0);
                    byte[] bArr3 = $$a;
                    Object[] objArr9 = new Object[1];
                    a(bArr3[5], (byte) 52, bArr3[7], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, packedPositionGroup2, iResolveOpacity, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - Process.getGidForName("")), TextUtils.lastIndexOf("", '0', 0, 0) + 696, 98 - (ViewConfiguration.getScrollBarSize() >> 8)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getTapTimeout() >> 16)), ExpandableListView.getPackedPositionType(0L) + 793, TextUtils.indexOf((CharSequence) "", '0') + 84), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int i9 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 650;
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 44;
                    byte b5 = $$a[5];
                    byte b6 = b5;
                    Object[] objArr11 = new Object[1];
                    a(b6, (byte) (b6 | 14), b5, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(doubleTapTimeout2, i9, iResolveSizeAndState, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{20746, 6408, 47830, 20109}, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), ExpandableListView.getPackedPositionChild(0L) + 1, new char[]{65106, 64250, 44326, 40893, 30464, 2973, 64155, 14099, 16726, 52497, 62371, 46696, 37142, 6425, 34199, 45968, 60679, 56670, 23639, 39312, 49889, 21225}, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{7322, 3711, 21427, 28061}, (char) (View.combineMeasuredStates(0, 0) + 40275), (-1290895588) - TextUtils.indexOf("", "", 0, 0), new char[]{19570, 17401, 15181, 17637, 15952, 57386, 19835, 42093, 56380, 21720, 32759, 24551, 52521, 10520, 12820}, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int i10 = 652 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int iCombineMeasuredStates2 = 44 - View.combineMeasuredStates(0, 0);
                        byte[] bArr4 = $$a;
                        Object[] objArr14 = new Object[1];
                        a(bArr4[5], (byte) 52, bArr4[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cCombineMeasuredStates, i10, iCombineMeasuredStates2, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 651;
                        int iMakeMeasureSpec = 44 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[7];
                        Object[] objArr15 = new Object[1];
                        a(b7, b7, bArr5[5], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionChild, keyRepeatTimeout3, iMakeMeasureSpec, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr == null) {
                throw null;
            }
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            int i12 = i11 % 2;
            for (String str2 : strArr) {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                int i14 = i13 % 2;
                arrayList.add(str2);
            }
            throw null;
        }
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
        int i16 = i15 % 2;
        Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i17 = ((int[]) objArr[3])[0];
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[0])[0];
        int iNextInt2 = new Random().nextInt(1024315875);
        int i20 = ~iNextInt2;
        int i21 = i17 + 841426868 + (((~(886750752 | i20)) | (~((-13674497) | iNextInt2))) * (-831)) + ((~(903856058 | iNextInt2)) * (-1662)) + (((~(iNextInt2 | (-886750753))) | (~(i20 | (-890181563))) | (~(890181562 | iNextInt2))) * 831);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr16[3])[0] = i23 ^ (i23 << 5);
        int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24 % 128;
        int i25 = i24 % 2;
        this.expiresAt = str;
    }

    public String getExpiresAt() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.expiresAt;
        int i5 = i2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return str;
    }

    public String getMaskedCard() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.maskedCard;
        int i5 = i3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getToken() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.token;
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return str;
    }

    public String getTokenType() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tokenType;
        int i5 = i2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setMaskedCard(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.maskedCard = str;
        int i5 = i3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
    }

    public void setToken(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.token = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setTokenType(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        this.tokenType = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, short r7, byte r8) {
        /*
            int r8 = 104 - r8
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r1 = com.midtrans.sdk.corekit.models.snap.SavedToken.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r8 = -r8
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.snap.SavedToken.$$e(short, short, byte):java.lang.String");
    }
}
