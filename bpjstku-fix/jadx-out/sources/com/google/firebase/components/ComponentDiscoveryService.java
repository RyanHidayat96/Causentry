package com.google.firebase.components;

import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.google.mlkit.common.MlKitException;
import defpackage.cacheInteropConfig;
import defpackage.generateCameraId;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public class ComponentDiscoveryService extends Service {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static long b;
    private static final byte[] $$c = {21, ByteCompanionObject.MAX_VALUE, 49, -115};
    private static final int $$f = 52;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.google.firebase.components.ComponentDiscoveryService.$$a
            int r1 = r6 + 1
            int r8 = r8 + 84
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r6
            r8 = r7
            r3 = r2
            goto L28
        L11:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
        L28:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.ComponentDiscoveryService.a(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 114 - r7
            int r6 = 483 - r6
            int r0 = r8 + 1
            byte[] r1 = com.google.firebase.components.ComponentDiscoveryService.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L11:
            r3 = r2
        L12:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + r6
            int r6 = r3 + (-4)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.ComponentDiscoveryService.d(int, byte, short, java.lang.Object[]):void");
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $11 + 51;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 2;
        }
        while (true) {
            j = 0;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i6 = $11 + 121;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i8])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 2;
                    byte b3 = (byte) (b2 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2186, TextUtils.getCapsMode("", 0, 0) + 40, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (ViewConfiguration.getWindowTouchSlop() >> 8)), Color.blue(0) + 3011, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25, 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 3376 - Drawable.resolveOpacity(0, 0), 18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -968507904, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
            try {
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 1;
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - ExpandableListView.getPackedPositionType(j)), 3376 - View.getDefaultSize(0, 0), 16 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -968507904, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                j = 0;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
        int i9 = $10 + 77;
        $11 = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    protected void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                int i3 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a((byte) 37, bArr[5], bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, i3, offsetBefore, 986134021, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            throw null;
        }
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
            int scrollBarFadeDuration2 = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i4 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
            byte[] bArr2 = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) 37, bArr2[5], bArr2[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, scrollBarFadeDuration2, i4, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1756;
                int iArgb = Color.argb(0, 0, 0, 0) + 23;
                byte b2 = (byte) 52;
                Object[] objArr4 = new Object[1];
                a(b2, (short) (b2 & 239), $$a[7], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, iIndexOf, iArgb, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int i5 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 488018075);
            int i6 = ((1755680931 + (((-185741362) | i5) * 494)) + (((~(i5 | (-521285884))) | 883691470) * 494)) - 652949768;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            c(AndroidCharacter.getMirror('0') - '0', ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.contentFilteringHtmlDetailCellCategoryTitle).substring(0, 8).codePointAt(2) + 15458), objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            c(16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_camera_screen_instructions_text_face_not_straight).substring(0, 31).length() - 15, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 44298), objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr8 = {-306085745};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - TextUtils.indexOf("", "", 0, 0)), 1727 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 29 - (ViewConfiguration.getScrollBarSize() >> 8), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), -652949768);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                    int i9 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int i10 = 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte b3 = (byte) 52;
                    Object[] objArr9 = new Object[1];
                    a(b3, (short) (b3 & 239), $$a[7], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, i9, i10, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.instruction_alto6_bni).substring(8, 9).codePointAt(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_review_screen_backend_error_message_1051).substring(0, 32).length() - 10, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 57, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.payment_method_description_credit_card_2).substring(1, 3).length() + 13, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 29944);
                        int absoluteGravity = 1755 - Gravity.getAbsoluteGravity(0, 0);
                        int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 23;
                        byte[] bArr3 = $$a;
                        Object[] objArr12 = new Object[1];
                        a((byte) 52, bArr3[0], bArr3[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, absoluteGravity, iIndexOf2, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char offsetAfter = (char) (29944 - TextUtils.getOffsetAfter("", 0));
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 1755;
                        int mode = View.MeasureSpec.getMode(0) + 23;
                        byte[] bArr4 = $$a;
                        Object[] objArr13 = new Object[1];
                        a((byte) 37, bArr4[5], bArr4[7], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetAfter, absoluteGravity2, mode, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int i12 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i13 = ~i12;
        int i14 = i11 + (((~((-197789212) | i13)) | (~((-14813215) | i12)) | (~(i13 | 14813214))) * 959) + 904769682 + (((~(i12 | 14813214)) | (~(i13 | (-14813215))) | (~((-197789212) | i12))) * 959);
        int i15 = (i14 << 13) ^ i14;
        int i16 = i15 ^ (i15 >>> 17);
        ((int[]) objArr14[3])[0] = i16 ^ (i16 << 5);
        int i17 = TuitionPaymentFragmentbindingInflater1 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
        int i18 = i17 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int i19 = 1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iNormalizeMetaState = 15 - KeyEvent.normalizeMetaState(0);
            Object[] objArr15 = new Object[1];
            a((byte) 52, (short) ($$b & 958), $$a[7], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, i19, iNormalizeMetaState, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr16 = new Object[1];
        c(33 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 22 - View.MeasureSpec.getMode(0), (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 18, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, (char) (Process.myTid() >> 22), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
            int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
            byte b4 = (byte) 52;
            Object[] objArr18 = new Object[1];
            a(b4, (short) (b4 & 239), $$a[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(longPressTimeout, trimmedLength, iResolveOpacity, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            int i20 = TuitionPaymentFragmentbindingInflater1 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
            int i21 = i20 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                int defaultSize2 = View.getDefaultSize(0, 0) + 1031;
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 16;
                byte[] bArr5 = $$a;
                byte b5 = bArr5[7];
                Object[] objArr19 = new Object[1];
                a(b5, (short) (b5 | 192), (byte) (bArr5[205] + 1), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, defaultSize2, modifierMetaStateMask, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i22 = ((int[]) objArr20[3])[0];
            int i23 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i24 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i25 = (((-772886315) + (((~((-402695751) | i24)) | 646975920) * (-756))) + (((~i24) | (-402695751)) * 756)) - 61368565;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr[2])[0] = i27 ^ (i27 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bca_klik_instruction_step2).substring(32, 33).length() - 1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.tnc_bni_point_2).substring(10, 11).codePointAt(0) + 15439), objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bri_mobile_instruction_6).substring(0, 1).codePointAt(0) - 64, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bank_list_header_alto).substring(0, 4).length() + 12, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 44228), objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-306085745};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1134 - (ViewConfiguration.getWindowTouchSlop() >> 8), 17 - TextUtils.indexOf((CharSequence) "", '0', 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -61368565, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                int defaultSize3 = View.getDefaultSize(0, 0) + 1031;
                int iMyTid = (Process.myTid() >> 22) + 15;
                Object[] objArr25 = new Object[1];
                a((byte) 52, (short) ($$b & 958), $$a[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, defaultSize3, iMyTid, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 1117, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1031;
                int i28 = 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr6 = $$a;
                byte b6 = bArr6[7];
                Object[] objArr26 = new Object[1];
                a(b6, (short) (b6 | 192), (byte) (bArr6[205] + 1), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, iCombineMeasuredStates, i28, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 84, (Process.myTid() >> 22) + 22, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.hint_email_optional).substring(2, 3).codePointAt(0) - 97), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.text_format_valid_until).substring(3, 4).codePointAt(0) - 43, '?' - AndroidCharacter.getMirror('0'), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                    int i29 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte b7 = (byte) 52;
                    Object[] objArr29 = new Object[1];
                    a(b7, (short) (b7 & 239), $$a[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cCombineMeasuredStates, maximumFlingVelocity, i29, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                    int i30 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
                    int mode2 = View.MeasureSpec.getMode(0) + 15;
                    Object[] objArr30 = new Object[1];
                    a((byte) 52, (short) ($$b & 958), $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(bitsPerPixel, i30, mode2, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArr[1])[0];
        int i32 = ((int[]) objArr[3])[0];
        if (i32 == i31) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[3])[0];
            int i35 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iMyTid2 = Process.myTid();
            int i36 = ~iMyTid2;
            int i37 = i33 + 2094968341 + (((~((-8437921) | i36)) | 252718090) * 220) + (((~(i36 | (-545833698))) | 790113867) * (-440)) + ((iMyTid2 | (-8437921)) * 220);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr31[2])[0] = i39 ^ (i39 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i40 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
            TuitionPaymentFragmentbindingInflater1 = i40 % 128;
            int i41 = i40 % 2;
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        int[] iArr = new int[i32];
        int i42 = i32 - 1;
        iArr[i42] = 1;
        Toast.makeText((Context) null, iArr[((i32 * i42) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i43 = ((int[]) objArr[2])[0];
        int i44 = ((int[]) objArr[3])[0];
        int i45 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 17939191;
        int i46 = i43 + 1972551637 + ((~((~iCodePointAt) | 192896703)) * (-116)) + ((186539183 | iCodePointAt) * 116) + (((~(iCodePointAt | (-57740987))) | 51383466) * 116);
        int i47 = i46 ^ (i46 << 13);
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr32[2])[0] = i48 ^ (i48 << 5);
    }

    @Override // android.app.Service
    public void onCreate() throws Throwable {
        Object[] objArr;
        String str;
        String str2;
        Object[] objArr2;
        int i;
        Object[] objArr3;
        Object[] objArr4;
        String str3;
        String str4;
        Object[] objArr5;
        char c;
        Object[] objArr6;
        int i2;
        Object[] objArr7;
        int i3;
        Object[] objArr8;
        String str5;
        Object[] objArr9;
        Object[] objArr10;
        Object[] objArr11;
        int i4 = 2 % 2;
        String str6 = "";
        Object[] objArr12 = new Object[1];
        c(32 - TextUtils.indexOf("", "", 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), objArr12);
        String str7 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        c(54 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr13);
        String str8 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 15506), objArr14);
        String str9 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        c(View.combineMeasuredStates(0, 0) + 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (44335 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr15);
        String str10 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 33, 26 - Color.argb(0, 0, 0, 0), (char) KeyEvent.normalizeMetaState(0), objArr16);
        String str11 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 49, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.hint_expiry_date).substring(16, 17).length() + 17, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr17);
        String str12 = (String) objArr17[0];
        int i5 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i5 != (-1227617016) + ((252281152 | (~((-1082268696) | iIdentityHashCode))) * (-756)) + (((~iIdentityHashCode) | (-1082268696)) * 756)) {
            int[] iArr = new int[574634199];
            iArr[574634198] = 1;
            int i6 = 1910410170 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i7 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        if (i7 != (-1082856870) + (((-2146237660) | (~(iIdentityHashCode2 | 1070364867))) * 305) + (((~((~iIdentityHashCode2) | 1070364867)) | (-1508691098)) * 305)) {
            int i8 = (-592926228) % 2;
            throw new ArithmeticException();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int iAxisFromString = 875 - MotionEvent.axisFromString("");
            int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr18 = new Object[1];
            a(b2, (short) (b2 | 192), (byte) (bArr[205] + 1), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iAxisFromString, windowTouchSlop, 252381699, false, (String) objArr18[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        long jLongValue = ((Long) Class.forName(str7).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int i9 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
            byte[] bArr2 = $$a;
            Object[] objArr19 = new Object[1];
            a((byte) 52, bArr2[0], bArr2[7], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(trimmedLength, i9, edgeSlop, 2009631821, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
                int iIndexOf = 10 - TextUtils.indexOf("", "", 0, 0);
                byte[] bArr3 = $$a;
                byte b3 = bArr3[7];
                Object[] objArr20 = new Object[1];
                a(b3, (short) (b3 | 192), bArr3[91], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, iResolveOpacity, iIndexOf, 256017550, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[1], new int[]{((int[]) objArr21[2])[0]}, (String[]) objArr21[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i10 = ~iIdentityHashCode3;
            int i11 = 1858126516 + (((~(170144093 | i10)) | 76236322) * 168) + ((~((-76236323) | iIdentityHashCode3)) * 168) + (((~(iIdentityHashCode3 | 246380415)) | (~(i10 | (-210454323))) | 134218000) * 168) + 1719733325;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[1])[0] = i13 ^ (i13 << 5);
            str6 = "";
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i14 = TuitionPaymentFragmentbindingInflater1 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                int i15 = i14 % 2;
                baseContext = (Context) Class.forName(str11).getMethod(str12, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = (((baseContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext).getBaseContext() != null) ? baseContext.getApplicationContext() : null;
            }
            try {
                Object[] objArr22 = {baseContext, Integer.valueOf(((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue()), 1719733325};
                byte[] bArr4 = $$d;
                Object[] objArr23 = new Object[1];
                d((short) 480, bArr4[12], (byte) (-bArr4[397]), objArr23);
                Class<?> cls = Class.forName((String) objArr23[0]);
                Object[] objArr24 = new Object[1];
                d((short) 429, (byte) ($$e & 127), bArr4[13], objArr24);
                Object[] objArr25 = (Object[]) cls.getMethod((String) objArr24[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr22);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int iGreen = Color.green(0) + 876;
                        int longPressTimeout = 10 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr5 = $$a;
                        byte b4 = bArr5[7];
                        Object[] objArr26 = new Object[1];
                        a(b4, (short) (b4 | 192), bArr5[91], objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, iGreen, longPressTimeout, 256017550, false, (String) objArr26[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr25);
                    try {
                        long jLongValue2 = ((Long) Class.forName(str7).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                            int i16 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
                            int longPressTimeout2 = 10 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            byte[] bArr6 = $$a;
                            Object[] objArr27 = new Object[1];
                            a((byte) 52, bArr6[0], bArr6[7], objArr27);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, i16, longPressTimeout2, 2009631821, false, (String) objArr27[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                            int absoluteGravity = 876 - Gravity.getAbsoluteGravity(0, 0);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 10;
                            byte[] bArr7 = $$a;
                            byte b5 = bArr7[7];
                            Object[] objArr28 = new Object[1];
                            a(b5, (short) (b5 | 192), (byte) (bArr7[205] + 1), objArr28);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRgb, absoluteGravity, iNormalizeMetaState, 252381699, false, (String) objArr28[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    str6 = "";
                    objArr25 = objArr25;
                }
                objArr = objArr25;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 != i17) {
            throw new RuntimeException(String.valueOf(i18));
        }
        int i19 = ((int[]) objArr[1])[0];
        Object[] objArr29 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int i20 = ~((((Context) Class.forName(r4).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 826422116) | 583237020);
        int i21 = i19 + ((((-43981404) | i20) * (-658)) - 403963108) + ((i20 | (-585072608)) * 658);
        int i22 = i21 ^ (i21 << 13);
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr29[1])[0] = i23 ^ (i23 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cBlue = (char) (Color.blue(0) + 37567);
            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 625;
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 15;
            byte[] bArr8 = $$a;
            byte b6 = bArr8[7];
            Object[] objArr30 = new Object[1];
            a(b6, (short) (b6 | 192), (byte) (bArr8[205] + 1), objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cBlue, iNormalizeMetaState2, modifierMetaStateMask, -477065106, false, (String) objArr30[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        long jLongValue3 = ((Long) Class.forName(str7).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char maximumDrawingCacheSize = (char) (37567 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            int touchSlop = 625 - (ViewConfiguration.getTouchSlop() >> 8);
            int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 15;
            Object[] objArr31 = new Object[1];
            a((byte) 52, (short) ($$b & 958), $$a[7], objArr31);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumDrawingCacheSize, touchSlop, modifierMetaStateMask2, -976899241, false, (String) objArr31[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37567);
                int i24 = 624 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 14;
                byte b7 = (byte) 52;
                Object[] objArr32 = new Object[1];
                a(b7, (short) (b7 & 239), $$a[7], objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarFadeDuration, i24, windowTouchSlop2, -973632554, false, (String) objArr32[0], null);
            }
            Object[] objArr33 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            int i25 = ((int[]) objArr33[2])[0];
            int i26 = ((int[]) objArr33[0])[0];
            String[] strArr = (String[]) objArr33[3];
            int[] iArr2 = {i25};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i27 = ((((~((~iMaxMemory) | (-1090519141))) * 130) + 815367228) + (((~(iMaxMemory | (-1090519141))) | 172689538) * 130)) - 994091176;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr2[1])[0] = i29 ^ (i29 << 5);
            objArr2 = new Object[]{new int[]{i26}, new int[1], iArr2, strArr};
            i = 0;
            str12 = str12;
            str2 = str8;
            str = str6;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                baseContext2 = (Context) Class.forName(str11).getMethod(str12, new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            int iIntValue = ((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue();
            Object[] objArr34 = new Object[1];
            c(113 - Color.red(0), 64 - KeyEvent.getDeadChar(0, 0), (char) (14834 - ((byte) KeyEvent.getModifierMetaStateMask())), objArr34);
            String str13 = (String) objArr34[0];
            str = str6;
            Object[] objArr35 = new Object[1];
            c(((Context) Class.forName(r4).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 166, 64 - TextUtils.indexOf(str, str, 0), (char) (((Context) Class.forName(r4).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.gopay_status_title).substring(1, 3).length() + 38207), objArr35);
            Object[] objArr36 = {baseContext2, new String[]{str13, (String) objArr35[0]}, Integer.valueOf(iIntValue), 17, -994091176};
            byte[] bArr9 = $$d;
            Object[] objArr37 = new Object[1];
            d((short) 392, bArr9[37], bArr9[54], objArr37);
            Class<?> cls2 = Class.forName((String) objArr37[0]);
            Object[] objArr38 = new Object[1];
            d((short) 375, (byte) ($$e & 127), bArr9[335], objArr38);
            Object[] objArr39 = (Object[]) cls2.getMethod((String) objArr38[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr36);
            int i30 = ((int[]) objArr39[0])[0];
            int i31 = ((int[]) objArr39[2])[0];
            if (baseContext2 != null) {
                int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
                TuitionPaymentFragmentbindingInflater1 = i32 % 128;
                int i33 = i32 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 37568);
                    int defaultSize = View.getDefaultSize(0, 0) + 625;
                    int gidForName = Process.getGidForName(str) + 15;
                    byte b8 = (byte) 52;
                    Object[] objArr40 = new Object[1];
                    a(b8, (short) (b8 & 239), $$a[7], objArr40);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(packedPositionChild, defaultSize, gidForName, -973632554, false, (String) objArr40[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr39);
                try {
                    str2 = str8;
                    long jLongValue4 = ((Long) Class.forName(str7).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf(str, str, 0) + 37567);
                        int iRed = 625 - Color.red(0);
                        int iArgb = 14 - Color.argb(0, 0, 0, 0);
                        Object[] objArr41 = new Object[1];
                        a((byte) 52, (short) ($$b & 958), $$a[7], objArr41);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf2, iRed, iArgb, -976899241, false, (String) objArr41[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char threadPriority = (char) (37567 - ((Process.getThreadPriority(0) + 20) >> 6));
                        int iResolveOpacity2 = 625 - Drawable.resolveOpacity(0, 0);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 14;
                        byte[] bArr10 = $$a;
                        byte b9 = bArr10[7];
                        Object[] objArr42 = new Object[1];
                        a(b9, (short) (b9 | 192), (byte) (bArr10[205] + 1), objArr42);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(threadPriority, iResolveOpacity2, iMakeMeasureSpec, -477065106, false, (String) objArr42[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } else {
                objArr39 = objArr39;
                str12 = str12;
                str2 = str8;
            }
            objArr2 = objArr39;
            i = 0;
        }
        if (((int[]) objArr2[2])[i] != ((int[]) objArr2[i])[i]) {
            int i34 = i;
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr2[3];
            if (strArr2 != null) {
                int i35 = TuitionPaymentFragmentbindingInflater1 + 75;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i35 % 128;
                int i36 = i35 % 2;
                for (int i37 = i34; i37 < strArr2.length; i37++) {
                    arrayList.add(strArr2[i37]);
                }
            }
            throw null;
        }
        Object[] objArr43 = new Object[4];
        int[] iArr3 = new int[1];
        objArr43[i] = iArr3;
        objArr43[1] = new int[1];
        int[] iArr4 = new int[1];
        objArr43[2] = iArr4;
        int i38 = ((int[]) objArr2[1])[i];
        int i39 = ((int[]) objArr2[2])[i];
        int i40 = ((int[]) objArr2[i])[i];
        String[] strArr3 = (String[]) objArr2[3];
        iArr4[i] = i39;
        iArr3[i] = i40;
        int iCodePointAt = ((Context) Class.forName(r4).getMethod("currentApplication", new Class[i]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.message_payment_paid).substring(i, 6).codePointAt(5) - 201514799;
        int i41 = (-1697839908) + (((~((~iCodePointAt) | (-1018630279))) | 268632068) * (-245));
        int i42 = ~((-1018630279) | iCodePointAt);
        int i43 = i38 + i41 + (i42 * (-245)) + ((i42 | 805107842) * 245);
        int i44 = (i43 << 13) ^ i43;
        int i45 = i44 ^ (i44 >>> 17);
        ((int[]) objArr43[1])[0] = i45 ^ (i45 << 5);
        objArr43[3] = strArr3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char cNormalizeMetaState = (char) (43042 - KeyEvent.normalizeMetaState(0));
            int maxKeyCode = 3111 - (KeyEvent.getMaxKeyCode() >> 16);
            int iAlpha = Color.alpha(0) + 22;
            Object[] objArr44 = new Object[1];
            a((byte) 52, (short) ($$b & 958), $$a[7], objArr44);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cNormalizeMetaState, maxKeyCode, iAlpha, -1272852037, false, (String) objArr44[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char cMyTid = (char) ((Process.myTid() >> 22) + 43042);
                int i46 = 3112 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int scrollDefaultDelay = 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte[] bArr11 = $$a;
                Object[] objArr45 = new Object[1];
                a((byte) 37, bArr11[5], bArr11[7], objArr45);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMyTid, i46, scrollDefaultDelay, 154975793, false, (String) objArr45[0], null);
            }
            Object[] objArr46 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
            int i47 = ((int[]) objArr46[2])[0];
            int i48 = ((int[]) objArr46[1])[0];
            String[] strArr4 = (String[]) objArr46[3];
            int[] iArr5 = {i48};
            int i49 = ~System.identityHashCode(this);
            int i50 = ((208789354 + (((~((-651466214) | i49)) | (-1053565246)) * (-933))) + (((~(i49 | (-1053565246))) | 403185688) * 933)) - 33800083;
            int i51 = (i50 << 13) ^ i50;
            int i52 = i51 ^ (i51 >>> 17);
            ((int[]) objArr3[0])[0] = i52 ^ (i52 << 5);
            objArr3 = new Object[]{new int[1], iArr5, new int[]{i47}, strArr4};
        } else {
            Object[] objArr47 = {null, Integer.valueOf(((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue()), 0, 408913699};
            byte[] bArr12 = $$d;
            Object[] objArr48 = new Object[1];
            d((short) 323, bArr12[10], (byte) (bArr12[0] + 1), objArr48);
            Class<?> cls3 = Class.forName((String) objArr48[0]);
            Object[] objArr49 = new Object[1];
            d((short) 245, (byte) ($$e & 127), bArr12[335], objArr49);
            Object[] objArr50 = (Object[]) cls3.getMethod((String) objArr49[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr47);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char size = (char) (43042 - View.MeasureSpec.getSize(0));
                int i53 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3111;
                int iRed2 = 22 - Color.red(0);
                byte[] bArr13 = $$a;
                Object[] objArr51 = new Object[1];
                a((byte) 37, bArr13[5], bArr13[7], objArr51);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(size, i53, iRed2, 154975793, false, (String) objArr51[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr50);
            try {
                long jLongValue5 = ((Long) Class.forName(str7).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue5);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char cIndexOf3 = (char) (43041 - TextUtils.indexOf((CharSequence) str, '0', 0, 0));
                    int capsMode = TextUtils.getCapsMode(str, 0, 0) + 3111;
                    int mirror = 'F' - AndroidCharacter.getMirror('0');
                    byte b10 = (byte) 52;
                    Object[] objArr52 = new Object[1];
                    a(b10, (short) (b10 & 239), $$a[7], objArr52);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf3, capsMode, mirror, -1269618118, false, (String) objArr52[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue5 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                    char cIndexOf4 = (char) (43041 - TextUtils.indexOf((CharSequence) str, '0'));
                    int i54 = 3112 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i55 = 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    Object[] objArr53 = new Object[1];
                    a((byte) 52, (short) ($$b & 958), $$a[7], objArr53);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cIndexOf4, i54, i55, -1272852037, false, (String) objArr53[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf6);
                objArr3 = objArr50;
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr3[2])[0] != ((int[]) objArr3[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr3[3];
            if (strArr5 != null) {
                for (String str14 : strArr5) {
                    int i56 = TuitionPaymentFragmentbindingInflater1 + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i56 % 128;
                    int i57 = i56 % 2;
                    arrayList2.add(str14);
                }
            }
            throw null;
        }
        int i58 = ((int[]) objArr3[0])[0];
        int i59 = ((int[]) objArr3[2])[0];
        int i60 = ((int[]) objArr3[1])[0];
        String[] strArr6 = (String[]) objArr3[3];
        int[] iArr6 = {i60};
        int i61 = ((Context) Class.forName(r4).getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        int i62 = ~i61;
        int i63 = i58 + 757958386 + (((~(750647847 | i62)) | 954383611) * (-328)) + ((i61 | 954383611) * 164) + (((~(i61 | (-750647848))) | 681621539 | (~(i62 | 1023409919))) * 164);
        int i64 = (i63 << 13) ^ i63;
        int i65 = i64 ^ (i64 >>> 17);
        ((int[]) objArr[0])[0] = i65 ^ (i65 << 5);
        Object[] objArr54 = {new int[1], iArr6, new int[]{i59}, strArr6};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char scrollBarSize = (char) (29944 - (ViewConfiguration.getScrollBarSize() >> 8));
            int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 23;
            byte[] bArr14 = $$a;
            Object[] objArr55 = new Object[1];
            a((byte) 37, bArr14[5], bArr14[7], objArr55);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(scrollBarSize, doubleTapTimeout, maxKeyCode2, 986134021, false, (String) objArr55[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char packedPositionChild2 = (char) (29943 - ExpandableListView.getPackedPositionChild(0L));
                int iResolveSize = View.resolveSize(0, 0) + 1755;
                int jumpTapTimeout = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte b11 = (byte) 52;
                Object[] objArr56 = new Object[1];
                a(b11, (short) (b11 & 239), $$a[7], objArr56);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(packedPositionChild2, iResolveSize, jumpTapTimeout, 1599039318, false, (String) objArr56[0], null);
            }
            Object[] objArr57 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).get(null);
            objArr4 = new Object[]{new int[]{((int[]) objArr57[0])[0]}, new int[]{((int[]) objArr57[1])[0]}, (Object[]) objArr57[2], new int[1], (String[]) objArr57[4]};
            int i66 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1494652976;
            int i67 = (-1689221147) + (((~((-60035591) | i66)) | 272638016) * (-756)) + (((~i66) | (-60035591)) * 756) + 850012500;
            int i68 = (i67 << 13) ^ i67;
            int i69 = i68 ^ (i68 >>> 17);
            ((int[]) objArr4[3])[0] = i69 ^ (i69 << 5);
        } else {
            int iIntValue2 = ((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr58 = {-34462243};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b((char) (42048 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getTapTimeout() >> 16) + 1726, 29 - TextUtils.indexOf(str, str, 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).newInstance(objArr58), 850012500);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char scrollBarSize2 = (char) (29944 - (ViewConfiguration.getScrollBarSize() >> 8));
                    int iGreen2 = Color.green(0) + 1755;
                    int iRed3 = 23 - Color.red(0);
                    byte b12 = (byte) 52;
                    Object[] objArr59 = new Object[1];
                    a(b12, (short) (b12 & 239), $$a[7], objArr59);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(scrollBarSize2, iGreen2, iRed3, 1599039318, false, (String) objArr59[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    long jLongValue6 = ((Long) Class.forName(str7).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                        char longPressTimeout3 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                        int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
                        int i70 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
                        byte[] bArr15 = $$a;
                        Object[] objArr60 = new Object[1];
                        a((byte) 52, bArr15[0], bArr15[7], objArr60);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(longPressTimeout3, tapTimeout, i70, 1596667560, false, (String) objArr60[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                        char cGreen = (char) (Color.green(0) + 29944);
                        int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int windowTouchSlop3 = 23 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte[] bArr16 = $$a;
                        Object[] objArr61 = new Object[1];
                        a((byte) 37, bArr16[5], bArr16[7], objArr61);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cGreen, keyRepeatDelay, windowTouchSlop3, 986134021, false, (String) objArr61[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, lValueOf8);
                    objArr4 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (((int[]) objArr4[0])[0] != ((int[]) objArr4[1])[0]) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr7 = (String[]) objArr4[4];
            if (strArr7 != null) {
                for (String str15 : strArr7) {
                    arrayList3.add(str15);
                }
            }
            throw null;
        }
        int i71 = ((int[]) objArr4[3])[0];
        Object[] objArr62 = {new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
        int i72 = ((Context) Class.forName(r4).getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i73 = ~i72;
        int i74 = i71 + (-1526226039) + ((~(495167753 | i73)) * (-560)) + ((~(i72 | 500677583)) * (-560)) + (((~((-282565328) | i73)) | 277055497) * 560);
        int i75 = (i74 << 13) ^ i74;
        int i76 = i75 ^ (i75 >>> 17);
        ((int[]) objArr62[3])[0] = i76 ^ (i76 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
            char capsMode2 = (char) TextUtils.getCapsMode(str, 0, 0);
            int bitsPerPixel = 875 - ImageFormat.getBitsPerPixel(0);
            int i77 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
            byte[] bArr17 = $$a;
            Object[] objArr63 = new Object[1];
            a((byte) 37, bArr17[5], bArr17[7], objArr63);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(capsMode2, bitsPerPixel, i77, -1650998592, false, (String) objArr63[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str7).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
            char modifierMetaStateMask3 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int i78 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
            int iGreen3 = Color.green(0) + 10;
            byte b13 = (byte) 52;
            Object[] objArr64 = new Object[1];
            a(b13, (short) (b13 & 239), $$a[7], objArr64);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(modifierMetaStateMask3, i78, iGreen3, 2012020043, false, (String) objArr64[0], null);
        }
        if (j3 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char cRed = (char) Color.red(0);
                int touchSlop2 = 876 - (ViewConfiguration.getTouchSlop() >> 8);
                int keyRepeatDelay2 = 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                Object[] objArr65 = new Object[1];
                a((byte) 52, (short) ($$b & 958), $$a[7], objArr65);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cRed, touchSlop2, keyRepeatDelay2, 2012931276, false, (String) objArr65[0], null);
            }
            Object[] objArr66 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).get(null);
            objArr5 = new Object[]{new int[]{((int[]) objArr66[0])[0]}, new int[1], new int[]{((int[]) objArr66[2])[0]}, (String[]) objArr66[3]};
            int i79 = ~(((Context) Class.forName(r4).getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen | (-647544698));
            int i80 = (((((-788529024) | i79) * (-196)) - 1755679940) + ((i79 | 140984326) * 196)) - 1317358527;
            int i81 = (i80 << 13) ^ i80;
            int i82 = i81 ^ (i81 >>> 17);
            ((int[]) objArr5[1])[0] = i82 ^ (i82 << 5);
            str4 = str2;
            c = 2;
            str3 = str12;
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                int i83 = TuitionPaymentFragmentbindingInflater1 + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i83 % 128;
                int i84 = i83 % 2;
                str3 = str12;
                baseContext3 = (Context) Class.forName(str11).getMethod(str3, new Class[0]).invoke(null, null);
            } else {
                str3 = str12;
            }
            if (baseContext3 != null) {
                baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
            }
            Object[] objArr67 = {baseContext3, Integer.valueOf(((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue()), 0, -1317358527};
            byte[] bArr18 = $$d;
            Object[] objArr68 = new Object[1];
            d((short) 193, bArr18[225], (byte) 97, objArr68);
            Class<?> cls4 = Class.forName((String) objArr68[0]);
            Object[] objArr69 = new Object[1];
            d((short) 375, (byte) ($$e & 127), bArr18[335], objArr69);
            Object[] objArr70 = (Object[]) cls4.getMethod((String) objArr69[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr67);
            if (baseContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                    int iAlpha2 = Color.alpha(0) + 876;
                    int iLastIndexOf = TextUtils.lastIndexOf(str, '0', 0, 0) + 11;
                    Object[] objArr71 = new Object[1];
                    a((byte) 52, (short) ($$b & 958), $$a[7], objArr71);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c2, iAlpha2, iLastIndexOf, 2012931276, false, (String) objArr71[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, objArr70);
                try {
                    str4 = str2;
                    long jLongValue8 = ((Long) Class.forName(str7).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int deadChar2 = KeyEvent.getDeadChar(0, 0) + 876;
                        int bitsPerPixel2 = 9 - ImageFormat.getBitsPerPixel(0);
                        byte b14 = (byte) 52;
                        Object[] objArr72 = new Object[1];
                        a(b14, (short) (b14 & 239), $$a[7], objArr72);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(packedPositionGroup, deadChar2, bitsPerPixel2, 2012020043, false, (String) objArr72[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                        char maxKeyCode3 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int mode = 876 - View.MeasureSpec.getMode(0);
                        int i85 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr19 = $$a;
                        Object[] objArr73 = new Object[1];
                        a((byte) 37, bArr19[5], bArr19[7], objArr73);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(maxKeyCode3, mode, i85, -1650998592, false, (String) objArr73[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } else {
                objArr70 = objArr70;
                str4 = str2;
                str3 = str3;
            }
            objArr5 = objArr70;
            c = 2;
        }
        if (((int[]) objArr5[0])[0] != ((int[]) objArr5[c])[0]) {
            throw null;
        }
        int i86 = ((int[]) objArr5[1])[0];
        Object[] objArr74 = {new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
        int i87 = ((Context) Class.forName(r4).getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
        int i88 = ~i87;
        int i89 = i86 + 629539536 + (((~((-402659487) | i88)) | (~(362349257 | i88))) * (-867)) + (((~((-402659487) | i87)) | 134223894 | (~(362349257 | i87))) * (-1734)) + (((~(i87 | 496573151)) | (~(i88 | (-134223895))) | (~((-268435593) | i87))) * 867);
        int i90 = (i89 << 13) ^ i89;
        int i91 = i90 ^ (i90 >>> 17);
        ((int[]) objArr74[1])[0] = i91 ^ (i91 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
            char mode2 = (char) View.MeasureSpec.getMode(0);
            int i92 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 875;
            int iNormalizeMetaState3 = 10 - KeyEvent.normalizeMetaState(0);
            byte[] bArr20 = $$a;
            Object[] objArr75 = new Object[1];
            a(bArr20[9], (short) ($$b & PointerIconCompat.TYPE_TEXT), bArr20[205], objArr75);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(mode2, i92, iNormalizeMetaState3, -1199417970, false, (String) objArr75[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str7).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
            char cResolveSizeAndState2 = (char) View.resolveSizeAndState(0, 0, 0);
            int windowTouchSlop4 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
            int iMakeMeasureSpec2 = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr21 = $$a;
            byte b15 = bArr21[7];
            Object[] objArr76 = new Object[1];
            a(b15, (short) (b15 | 202), bArr21[27], objArr76);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cResolveSizeAndState2, windowTouchSlop4, iMakeMeasureSpec2, 254769921, false, (String) objArr76[0], null);
        }
        if (j4 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
                int iIndexOf2 = TextUtils.indexOf((CharSequence) str, '0', 0) + 11;
                byte[] bArr22 = $$a;
                Object[] objArr77 = new Object[1];
                a(bArr22[78], (short) ($$b - 3), bArr22[205], objArr77);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(c3, doubleTapTimeout2, iIndexOf2, 1324201839, false, (String) objArr77[0], null);
            }
            Object[] objArr78 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr78[0])[0]}, new int[1], new int[]{((int[]) objArr78[2])[0]}, (String[]) objArr78[3]};
            int i93 = ((Context) Class.forName(r4).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1389463568;
            int i94 = ~i93;
            int i95 = ((1511038177 + (((~((-359738507) | i94)) | (~(i93 | (-319428278)))) * 333)) + (((~(i93 | (-359738507))) | (~(i94 | (-319428278)))) * 333)) - 899823744;
            int i96 = (i95 << 13) ^ i95;
            int i97 = i96 ^ (i96 >>> 17);
            ((int[]) objArr6[1])[0] = i97 ^ (i97 << 5);
        } else {
            Object[] objArr79 = {Integer.valueOf(((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue()), -899823744};
            byte[] bArr23 = $$d;
            Object[] objArr80 = new Object[1];
            d((short) 96, bArr23[10], bArr23[225], objArr80);
            Class<?> cls5 = Class.forName((String) objArr80[0]);
            Object[] objArr81 = new Object[1];
            d((short) 429, (byte) ($$e & 127), bArr23[13], objArr81);
            objArr6 = (Object[]) cls5.getMethod((String) objArr81[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr79);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter(str, 0);
                int iKeyCodeFromString = 876 - KeyEvent.keyCodeFromString(str);
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 10;
                byte[] bArr24 = $$a;
                Object[] objArr82 = new Object[1];
                a(bArr24[78], (short) ($$b - 3), bArr24[205], objArr82);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(offsetAfter, iKeyCodeFromString, fadingEdgeLength, 1324201839, false, (String) objArr82[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, objArr6);
            try {
                long jLongValue10 = ((Long) Class.forName(str7).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf11 = Long.valueOf(jLongValue10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                    char touchSlop3 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int iNormalizeMetaState4 = KeyEvent.normalizeMetaState(0) + 876;
                    int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 10;
                    byte[] bArr25 = $$a;
                    byte b16 = bArr25[7];
                    Object[] objArr83 = new Object[1];
                    a(b16, (short) (b16 | 202), bArr25[27], objArr83);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(touchSlop3, iNormalizeMetaState4, threadPriority2, 254769921, false, (String) objArr83[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf11);
                Long lValueOf12 = Long.valueOf(jLongValue10 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char c4 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                    int iMyTid = (Process.myTid() >> 22) + 876;
                    int doubleTapTimeout3 = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte[] bArr26 = $$a;
                    Object[] objArr84 = new Object[1];
                    a(bArr26[9], (short) ($$b & PointerIconCompat.TYPE_TEXT), bArr26[205], objArr84);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(c4, iMyTid, doubleTapTimeout3, -1199417970, false, (String) objArr84[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf12);
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        }
        int i98 = ((int[]) objArr6[2])[0];
        int i99 = ((int[]) objArr6[0])[0];
        if (i99 == i98) {
            int i100 = ((int[]) objArr6[1])[0];
            Object[] objArr85 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i101 = ~iIdentityHashCode4;
            int i102 = i100 + 1534516876 + (((~((-29954613) | i101)) | 70264841) * 220) + (((~(i101 | (-197989175))) | 238299403) * (-440)) + ((iIdentityHashCode4 | (-29954613)) * 220);
            int i103 = (i102 << 13) ^ i102;
            int i104 = i103 ^ (i103 >>> 17);
            i2 = 0;
            ((int[]) objArr85[1])[0] = i104 ^ (i104 << 5);
        } else {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr8 = (String[]) objArr6[3];
            if (strArr8 != null) {
                int i105 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
                TuitionPaymentFragmentbindingInflater1 = i105 % 128;
                int i106 = i105 % 2;
                for (String str16 : strArr8) {
                    arrayList4.add(str16);
                }
            }
            int[] iArr7 = new int[i99];
            int i107 = i99 - 1;
            iArr7[i107] = 1;
            Toast.makeText((Context) null, iArr7[((i99 * i107) % 2) - 1], 1).show();
            int i108 = ((int[]) objArr6[1])[0];
            Object[] objArr86 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i109 = ~((-41951338) | startElapsedRealtime);
            int i110 = ~startElapsedRealtime;
            int i111 = i108 + 855941401 + ((i109 | (~(731492349 | i110))) * 497) + (((~(startElapsedRealtime | 731492349)) | (~((-729851242) | i110)) | 687899904) * 497);
            int i112 = (i111 << 13) ^ i111;
            int i113 = i112 ^ (i112 >>> 17);
            i2 = 0;
            ((int[]) objArr86[1])[0] = i113 ^ (i113 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
            char windowTouchSlop5 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int i114 = 651 - (ExpandableListView.getPackedPositionForGroup(i2) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i2) == 0L ? 0 : -1));
            int iRed4 = Color.red(i2) + 44;
            byte[] bArr27 = $$a;
            Object[] objArr87 = new Object[1];
            a((byte) 52, bArr27[i2], bArr27[7], objArr87);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(windowTouchSlop5, i114, iRed4, -459846511, false, (String) objArr87[i2], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str7).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
            char c5 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 651;
            int offsetBefore2 = 44 - TextUtils.getOffsetBefore(str, 0);
            byte[] bArr28 = $$a;
            byte b17 = bArr28[7];
            Object[] objArr88 = new Object[1];
            a(b17, (short) (b17 | 192), (byte) (bArr28[205] + 1), objArr88);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(c5, packedPositionGroup2, offsetBefore2, -873460649, false, (String) objArr88[0], null);
        }
        if (j5 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char offsetBefore3 = (char) TextUtils.getOffsetBefore(str, 0);
                int packedPositionChild3 = 650 - ExpandableListView.getPackedPositionChild(0L);
                int bitsPerPixel3 = 43 - ImageFormat.getBitsPerPixel(0);
                byte[] bArr29 = $$a;
                Object[] objArr89 = new Object[1];
                a((byte) 37, bArr29[5], bArr29[7], objArr89);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(offsetBefore3, packedPositionChild3, bitsPerPixel3, -1595579076, false, (String) objArr89[0], null);
            }
            Object[] objArr90 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).get(null);
            objArr7 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i115 = ((int[]) objArr90[2])[0];
            int i116 = ((int[]) objArr90[0])[0];
            int length = ((Context) Class.forName(r4).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1273685051;
            int i117 = ~length;
            int i118 = 662146137 + ((1019413521 | i117) * (-192)) + (((~(1019432057 | i117)) | 3449346) * (-384)) + (((~(length | (-18537))) | (~(i117 | 1022881403)) | (~((-3449347) | length))) * DerHeader.TAG_CLASS_PRIVATE) + 310397111;
            int i119 = (i118 << 13) ^ i118;
            int i120 = i119 ^ (i119 >>> 17);
            ((int[]) objArr7[3])[0] = i120 ^ (i120 << 5);
            i3 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1611 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 26 - KeyEvent.getDeadChar(0, 0), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr91 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).newInstance(null), 310397111, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int iLastIndexOf2 = TextUtils.lastIndexOf(str, '0') + 652;
                int iGreen4 = Color.green(0) + 44;
                byte[] bArr30 = $$a;
                byte b18 = bArr30[7];
                Object[] objArr92 = new Object[1];
                a(b18, (short) (b18 | 192), (byte) (bArr30[205] + 1), objArr92);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cResolveOpacity, iLastIndexOf2, iGreen4, 2075921419, false, (String) objArr92[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf((CharSequence) str, '0') + 696, 98 - Drawable.resolveOpacity(0, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getTrimmedLength(str) + 63406), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 793, TextUtils.lastIndexOf(str, '0', 0) + 84), Integer.TYPE, Integer.TYPE});
            }
            objArr7 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).invoke(null, objArr91);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString(str);
                int defaultSize2 = 651 - View.getDefaultSize(0, 0);
                int maxKeyCode4 = 44 - (KeyEvent.getMaxKeyCode() >> 16);
                byte[] bArr31 = $$a;
                Object[] objArr93 = new Object[1];
                a((byte) 37, bArr31[5], bArr31[7], objArr93);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cKeyCodeFromString, defaultSize2, maxKeyCode4, -1595579076, false, (String) objArr93[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, objArr7);
            try {
                long jLongValue12 = ((Long) Class.forName(str7).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                    int iNormalizeMetaState5 = KeyEvent.normalizeMetaState(0) + 651;
                    int iLastIndexOf3 = 43 - TextUtils.lastIndexOf(str, '0', 0);
                    byte[] bArr32 = $$a;
                    byte b19 = bArr32[7];
                    Object[] objArr94 = new Object[1];
                    a(b19, (short) (b19 | 192), (byte) (bArr32[205] + 1), objArr94);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(cResolveOpacity2, iNormalizeMetaState5, iLastIndexOf3, -873460649, false, (String) objArr94[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue12 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    char c6 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int iLastIndexOf4 = TextUtils.lastIndexOf(str, '0') + 652;
                    int i121 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44;
                    byte[] bArr33 = $$a;
                    Object[] objArr95 = new Object[1];
                    a((byte) 52, bArr33[0], bArr33[7], objArr95);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(c6, iLastIndexOf4, i121, -459846511, false, (String) objArr95[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf14);
                i3 = 0;
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr7[2])[i3] != ((int[]) objArr7[i3])[i3]) {
            int i122 = i3;
            ArrayList arrayList5 = new ArrayList();
            String[] strArr9 = (String[]) objArr7[1];
            if (strArr9 != null) {
                int i123 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
                TuitionPaymentFragmentbindingInflater1 = i123 % 128;
                for (int i124 = i123 % 2 != 0 ? i122 : 1; i124 < strArr9.length; i124++) {
                    arrayList5.add(strArr9[i124]);
                }
            }
            throw null;
        }
        int i125 = TuitionPaymentFragmentbindingInflater1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i125 % 128;
        int i126 = i125 % 2;
        Object[] objArr96 = new Object[4];
        int[] iArr8 = new int[1];
        objArr96[i3] = iArr8;
        int[] iArr9 = new int[1];
        objArr96[2] = iArr9;
        objArr96[3] = new int[1];
        int i127 = ((int[]) objArr7[3])[i3];
        int i128 = ((int[]) objArr7[2])[i3];
        int i129 = ((int[]) objArr7[i3])[i3];
        iArr9[i3] = i128;
        iArr8[i3] = i129;
        objArr96[1] = new String[i3];
        int i130 = ((Context) Class.forName(r4).getMethod("currentApplication", new Class[i3]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i131 = i127 + (-353373327) + (((~(638358073 | i130)) | 4221378) * 104) + ((~((~i130) | (-790569))) * (-104)) + ((i130 | 641788883) * 104);
        int i132 = (i131 << 13) ^ i131;
        int i133 = i132 ^ (i132 >>> 17);
        ((int[]) objArr96[3])[0] = i133 ^ (i133 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char c7 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int iArgb2 = 1031 - Color.argb(0, 0, 0, 0);
            int trimmedLength2 = 15 - TextUtils.getTrimmedLength(str);
            Object[] objArr97 = new Object[1];
            a((byte) 52, (short) ($$b & 958), $$a[7], objArr97);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(c7, iArgb2, trimmedLength2, 1357589585, false, (String) objArr97[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null);
        long jLongValue13 = ((Long) Class.forName(str7).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L) + 1032;
            int iIndexOf3 = 15 - TextUtils.indexOf(str, str);
            byte b20 = (byte) 52;
            Object[] objArr98 = new Object[1];
            a(b20, (short) (b20 & 239), $$a[7], objArr98);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cResolveSize, packedPositionChild4, iIndexOf3, 1344079056, false, (String) objArr98[0], null);
        }
        if (j6 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int iRgb = Color.rgb(0, 0, 0) + 16778247;
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 15;
                byte[] bArr34 = $$a;
                byte b21 = bArr34[7];
                Object[] objArr99 = new Object[1];
                a(b21, (short) (b21 | 192), (byte) (bArr34[205] + 1), objArr99);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(edgeSlop2, iRgb, pressedStateDuration, 632103528, false, (String) objArr99[0], null);
            }
            Object[] objArr100 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).get(null);
            objArr8 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i134 = ((int[]) objArr100[3])[0];
            int i135 = ((int[]) objArr100[1])[0];
            String[] strArr10 = (String[]) objArr100[0];
            int length2 = ((Context) Class.forName(r4).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1999278671;
            int i136 = (-1892003659) + (((~(178029941 | length2)) | 422310111) * (-366)) + (((~(length2 | 465565183)) | 134774869) * 366) + 871908692;
            int i137 = (i136 << 13) ^ i136;
            int i138 = i137 ^ (i137 >>> 17);
            ((int[]) objArr8[2])[0] = i138 ^ (i138 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue();
            Object[] objArr101 = {-34462243};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 46039), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1133, 18 - ExpandableListView.getPackedPositionGroup(0L), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr102 = {Integer.valueOf(iIntValue3), 0, 871908692, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).newInstance(objArr101), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                char c8 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1031;
                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 15;
                Object[] objArr103 = new Object[1];
                a((byte) 52, (short) ($$b & 958), $$a[7], objArr103);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(c8, packedPositionType, pressedStateDuration2, 1298546779, false, (String) objArr103[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45993), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1116, (Process.myPid() >> 22) + 17), Boolean.TYPE});
            }
            objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).invoke(null, objArr102);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 1031;
                int iIndexOf4 = 14 - TextUtils.indexOf((CharSequence) str, '0');
                byte[] bArr35 = $$a;
                byte b22 = bArr35[7];
                Object[] objArr104 = new Object[1];
                a(b22, (short) (b22 | 192), (byte) (bArr35[205] + 1), objArr104);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cCombineMeasuredStates, packedPositionType2, iIndexOf4, 632103528, false, (String) objArr104[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, objArr8);
            try {
                long jLongValue14 = ((Long) Class.forName(str7).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue14);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                    char cResolveOpacity3 = (char) Drawable.resolveOpacity(0, 0);
                    int i139 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i140 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
                    byte b23 = (byte) 52;
                    Object[] objArr105 = new Object[1];
                    a(b23, (short) (b23 & 239), $$a[7], objArr105);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(cResolveOpacity3, i139, i140, 1344079056, false, (String) objArr105[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue14 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                    char c9 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                    int i141 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int iRgb2 = Color.rgb(0, 0, 0) + 16777231;
                    Object[] objArr106 = new Object[1];
                    a((byte) 52, (short) ($$b & 958), $$a[7], objArr106);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(c9, i141, iRgb2, 1357589585, false, (String) objArr106[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf16);
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        int i142 = ((int[]) objArr8[1])[0];
        int i143 = ((int[]) objArr8[3])[0];
        if (i143 == i142) {
            Object[] objArr107 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i144 = ((int[]) objArr8[2])[0];
            int i145 = ((int[]) objArr8[3])[0];
            int i146 = ((int[]) objArr8[1])[0];
            String[] strArr11 = (String[]) objArr8[0];
            int iMyTid2 = Process.myTid();
            int i147 = ~iMyTid2;
            int i148 = i144 + (-1925332315) + (((~((-488447771) | i147)) | 151783936) * (-108)) + (((~(i147 | 732727940)) | (~((-732727941) | iMyTid2)) | (-1069391775)) * 54) + ((iMyTid2 | (-1069391775)) * 54);
            int i149 = (i148 << 13) ^ i148;
            int i150 = i149 ^ (i149 >>> 17);
            ((int[]) objArr107[2])[0] = i150 ^ (i150 << 5);
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr12 = (String[]) objArr8[0];
            if (strArr12 != null) {
                for (String str17 : strArr12) {
                    arrayList6.add(str17);
                }
            }
            int[] iArr10 = new int[i143];
            int i151 = i143 - 1;
            iArr10[i151] = 1;
            Toast.makeText((Context) null, iArr10[((i143 * i151) % 2) - 1], 1).show();
            Object[] objArr108 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i152 = ((int[]) objArr8[2])[0];
            int i153 = ((int[]) objArr8[3])[0];
            int i154 = ((int[]) objArr8[1])[0];
            String[] strArr13 = (String[]) objArr8[0];
            int i155 = ((Context) Class.forName(r4).getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i156 = ~i155;
            int i157 = i152 + (-456983441) + (((~((-654406033) | i156)) | (~((-524298) | i155)) | (~(1065056191 | i155))) * 765) + (((~((-654930330) | i156)) | 654406032) * 1530) + (((~(i155 | (-654930330))) | (~(i156 | 1065056191))) * 765);
            int i158 = (i157 << 13) ^ i157;
            int i159 = i158 ^ (i158 >>> 17);
            ((int[]) objArr108[2])[0] = i159 ^ (i159 << 5);
        }
        super.onCreate();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
            char c10 = (char) (53894 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int iResolveSize2 = View.resolveSize(0, 0) + 1320;
            int maximumDrawingCacheSize2 = 36 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr36 = $$a;
            byte b24 = bArr36[7];
            Object[] objArr109 = new Object[1];
            a(b24, (short) (b24 | 192), (byte) (bArr36[205] + 1), objArr109);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c10, iResolveSize2, maximumDrawingCacheSize2, -1433084963, false, (String) objArr109[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char cRgb2 = (char) (Color.rgb(0, 0, 0) + 16831109);
                int i160 = 1321 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int deadChar3 = 36 - KeyEvent.getDeadChar(0, 0);
                byte b25 = (byte) 52;
                Object[] objArr110 = new Object[1];
                a(b25, (short) (b25 & 239), $$a[7], objArr110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cRgb2, i160, deadChar3, -1920778747, false, (String) objArr110[0], null);
            }
            Object[] objArr111 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).get(null);
            objArr9 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i161 = ((int[]) objArr111[0])[0];
            int i162 = ((int[]) objArr111[3])[0];
            String[] strArr14 = (String[]) objArr111[2];
            int i163 = ((Context) Class.forName(r4).getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i164 = ~i163;
            int i165 = ((((((~((-759138844) | i164)) | (~((-611488982) | i163))) | (~(i164 | 611488981))) * 959) - 1199283456) + (((~(i163 | 611488981)) | ((~(i164 | (-611488982))) | (~((-759138844) | i163)))) * 959)) - 919278942;
            int i166 = (i165 << 13) ^ i165;
            int i167 = i166 ^ (i166 >>> 17);
            ((int[]) objArr9[1])[0] = i167 ^ (i167 << 5);
            str5 = str3;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                str5 = str3;
                baseContext4 = (Context) Class.forName(str11).getMethod(str5, new Class[0]).invoke(null, null);
            } else {
                str5 = str3;
            }
            if (baseContext4 != null) {
                baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
            }
            int iIntValue4 = ((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue();
            Object[] objArr112 = {-118350338};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b((char) (47976 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1299, (ViewConfiguration.getTouchSlop() >> 8) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr113 = {baseContext4, "com.bpjstku", -919278942, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).newInstance(objArr112), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                char cIndexOf5 = (char) (53892 - TextUtils.indexOf((CharSequence) str, '0'));
                int deadChar4 = 1320 - KeyEvent.getDeadChar(0, 0);
                int i168 = 37 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte b26 = (byte) 52;
                Object[] objArr114 = new Object[1];
                a(b26, (short) (b26 & 239), $$a[7], objArr114);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cIndexOf5, deadChar4, i168, 819724799, false, (String) objArr114[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - Color.green(0)), (ViewConfiguration.getTapTimeout() >> 16) + 1394, ExpandableListView.getPackedPositionChild(0L) + 76), Boolean.TYPE});
            }
            Object[] objArr115 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).invoke(null, objArr113);
            if (baseContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                    char cIndexOf6 = (char) (TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 53894);
                    int iResolveOpacity3 = 1320 - Drawable.resolveOpacity(0, 0);
                    int i169 = 36 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b27 = (byte) 52;
                    Object[] objArr116 = new Object[1];
                    a(b27, (short) (b27 & 239), $$a[7], objArr116);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cIndexOf6, iResolveOpacity3, i169, -1920778747, false, (String) objArr116[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, objArr115);
                try {
                    long jLongValue15 = ((Long) Class.forName(str7).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue15);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                        char c11 = (char) (53894 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int offsetBefore4 = 1320 - TextUtils.getOffsetBefore(str, 0);
                        int modifierMetaStateMask4 = 35 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte[] bArr37 = $$a;
                        Object[] objArr117 = new Object[1];
                        a((byte) 37, bArr37[5], bArr37[7], objArr117);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(c11, offsetBefore4, modifierMetaStateMask4, -1273706634, false, (String) objArr117[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                        char c12 = (char) (53894 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int capsMode3 = TextUtils.getCapsMode(str, 0, 0) + 1320;
                        int pressedStateDuration3 = 36 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte[] bArr38 = $$a;
                        byte b28 = bArr38[7];
                        Object[] objArr118 = new Object[1];
                        a(b28, (short) (b28 | 192), (byte) (bArr38[205] + 1), objArr118);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(c12, capsMode3, pressedStateDuration3, -1433084963, false, (String) objArr118[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                objArr115 = objArr115;
            }
            objArr9 = objArr115;
        }
        int i170 = ((int[]) objArr9[3])[0];
        int i171 = ((int[]) objArr9[0])[0];
        if (i171 == i170) {
            Object[] objArr119 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i172 = ((int[]) objArr9[1])[0];
            int i173 = ((int[]) objArr9[0])[0];
            int i174 = ((int[]) objArr9[3])[0];
            String[] strArr15 = (String[]) objArr9[2];
            int i175 = ((Context) Class.forName(r4).getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i176 = i172 + (-1261579920) + (((~((-400706213) | i175)) | 297943044) * 336) + (((~(i175 | 969921612)) | (-1072684781)) * (-168)) + (((~((~i175) | 969921612)) | (-400706213)) * 168);
            int i177 = (i176 << 13) ^ i176;
            int i178 = i177 ^ (i177 >>> 17);
            ((int[]) objArr119[1])[0] = i178 ^ (i178 << 5);
        } else {
            Toast.makeText((Context) null, i171 / (((i171 - 1) * i171) % 2), 0).show();
            Object[] objArr120 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i179 = ((int[]) objArr9[1])[0];
            int i180 = ((int[]) objArr9[0])[0];
            int i181 = ((int[]) objArr9[3])[0];
            String[] strArr16 = (String[]) objArr9[2];
            int i182 = ((Context) Class.forName(r4).getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i183 = ~i182;
            int i184 = i179 + (-1261579920) + (((~((-528798389) | i183)) | 302268468) * 168) + ((~((-302268469) | i182)) * 168) + (((~(i182 | (-226529921))) | (~(i183 | (-841829437))) | 539560968) * 168);
            int i185 = i184 ^ (i184 << 13);
            int i186 = i185 ^ (i185 >>> 17);
            ((int[]) objArr120[1])[0] = i186 ^ (i186 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
            char cMyPid = (char) (31533 - (Process.myPid() >> 22));
            int maximumDrawingCacheSize3 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 921;
            int iLastIndexOf5 = 27 - TextUtils.lastIndexOf(str, '0', 0, 0);
            byte[] bArr39 = $$a;
            byte b29 = bArr39[7];
            Object[] objArr121 = new Object[1];
            a(b29, (short) (b29 | 192), (byte) (bArr39[205] + 1), objArr121);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cMyPid, maximumDrawingCacheSize3, iLastIndexOf5, -1048449946, false, (String) objArr121[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char cIndexOf7 = (char) (31533 - TextUtils.indexOf(str, str, 0, 0));
                int size2 = 921 - View.MeasureSpec.getSize(0);
                int longPressTimeout4 = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                byte[] bArr40 = $$a;
                Object[] objArr122 = new Object[1];
                a((byte) 37, bArr40[5], bArr40[7], objArr122);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(cIndexOf7, size2, longPressTimeout4, -1142834547, false, (String) objArr122[0], null);
            }
            Object[] objArr123 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).get(null);
            objArr10 = new Object[]{new int[1], new int[]{((int[]) objArr123[1])[0]}, (Object[]) objArr123[2], new int[]{((int[]) objArr123[3])[0]}, (String[]) objArr123[4]};
            int length3 = ((Context) Class.forName(r4).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.permata_instruction_step7).substring(16, 17).length() - 1084690588;
            int i187 = ~length3;
            int i188 = ((((-754529990) + ((519418031 | i187) * (-757))) + ((~((-1074269505) | length3)) * 1514)) + (((~(length3 | 1593687535)) | ((~(i187 | (-1254661613))) | 180392108)) * 757)) - 263274227;
            int i189 = (i188 << 13) ^ i188;
            int i190 = i189 ^ (i189 >>> 17);
            ((int[]) objArr10[0])[0] = i190 ^ (i190 << 5);
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str11).getMethod(str5, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
            }
            Object[] objArr124 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue()), 0, -263274227};
            byte[] bArr41 = $$d;
            byte b30 = bArr41[50];
            Object[] objArr125 = new Object[1];
            d(b30, bArr41[10], b30, objArr125);
            Class<?> cls6 = Class.forName((String) objArr125[0]);
            byte b31 = bArr41[12];
            Object[] objArr126 = new Object[1];
            d(b31, bArr41[161], b31, objArr126);
            objArr10 = (Object[]) cls6.getMethod((String) objArr126[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr124);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char c13 = (char) (31534 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int packedPositionChild5 = ExpandableListView.getPackedPositionChild(0L) + 922;
                int minimumFlingVelocity = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte[] bArr42 = $$a;
                Object[] objArr127 = new Object[1];
                a((byte) 37, bArr42[5], bArr42[7], objArr127);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(c13, packedPositionChild5, minimumFlingVelocity, -1142834547, false, (String) objArr127[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, objArr10);
            try {
                long jLongValue16 = ((Long) Class.forName(str7).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue16);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char capsMode4 = (char) (TextUtils.getCapsMode(str, 0, 0) + 31533);
                    int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 921;
                    int i191 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27;
                    byte b32 = (byte) 52;
                    Object[] objArr128 = new Object[1];
                    a(b32, (short) (b32 & 239), $$a[7], objArr128);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(capsMode4, packedPositionGroup3, i191, -778300370, false, (String) objArr128[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char c14 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31533);
                    int touchSlop4 = (ViewConfiguration.getTouchSlop() >> 8) + 921;
                    int keyRepeatTimeout = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte[] bArr43 = $$a;
                    byte b33 = bArr43[7];
                    Object[] objArr129 = new Object[1];
                    a(b33, (short) (b33 | 192), (byte) (bArr43[205] + 1), objArr129);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(c14, touchSlop4, keyRepeatTimeout, -1048449946, false, (String) objArr129[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf20);
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr10[3])[0] != ((int[]) objArr10[1])[0]) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr17 = (String[]) objArr10[4];
            if (strArr17 != null) {
                for (String str18 : strArr17) {
                    int i192 = TuitionPaymentFragmentbindingInflater1 + 105;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i192 % 128;
                    int i193 = i192 % 2;
                    arrayList7.add(str18);
                }
            }
            throw null;
        }
        int i194 = ((int[]) objArr10[0])[0];
        Object[] objArr130 = {new int[1], new int[]{((int[]) objArr10[1])[0]}, (Object[]) objArr10[2], new int[]{((int[]) objArr10[3])[0]}, (String[]) objArr10[4]};
        int iIdentityHashCode5 = System.identityHashCode(this);
        int i195 = ~((-1101090451) | iIdentityHashCode5);
        int i196 = i194 + 98580735 + ((68943873 | i195) * (-476)) + (i195 * 952) + ((~((~iIdentityHashCode5) | (-1101090451))) * 476);
        int i197 = (i196 << 13) ^ i196;
        int i198 = i197 ^ (i197 >>> 17);
        ((int[]) objArr130[0])[0] = i198 ^ (i198 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf(str, '0', 0) + 1);
            int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267;
            int bitsPerPixel4 = 32 - ImageFormat.getBitsPerPixel(0);
            byte b34 = (byte) 52;
            Object[] objArr131 = new Object[1];
            a(b34, (short) (b34 & 239), $$a[7], objArr131);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cLastIndexOf, jumpTapTimeout2, bitsPerPixel4, -887667012, false, (String) objArr131[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char deadChar5 = (char) KeyEvent.getDeadChar(0, 0);
                int iCombineMeasuredStates = 2267 - View.combineMeasuredStates(0, 0);
                int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 33;
                byte[] bArr44 = $$a;
                Object[] objArr132 = new Object[1];
                a((byte) 37, bArr44[5], bArr44[7], objArr132);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(deadChar5, iCombineMeasuredStates, edgeSlop3, -654680577, false, (String) objArr132[0], null);
            }
            Object[] objArr133 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            objArr11 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i199 = ((int[]) objArr133[0])[0];
            int i200 = ((int[]) objArr133[3])[0];
            String[] strArr18 = (String[]) objArr133[1];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i201 = (((1115069262 + (((~((~iIdentityHashCode6) | (-647470790))) | 161242526) * (-235))) + (((~((-647470790) | iIdentityHashCode6)) | 161242526) * (-470))) + (((~(iIdentityHashCode6 | (-637764162))) | 151535898) * 235)) - 766114027;
            int i202 = (i201 << 13) ^ i201;
            int i203 = i202 ^ (i202 >>> 17);
            ((int[]) objArr11[2])[0] = i203 ^ (i203 << 5);
        } else {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                baseContext6 = (Context) Class.forName(str11).getMethod(str5, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
            }
            Object[] objArr134 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str9).getMethod(str10, Object.class).invoke(null, this)).intValue()), 0, -766114027};
            byte[] bArr45 = $$d;
            Object[] objArr135 = new Object[1];
            d(bArr45[12], bArr45[10], (byte) (bArr45[503] - 1), objArr135);
            Class<?> cls7 = Class.forName((String) objArr135[0]);
            byte b35 = bArr45[12];
            Object[] objArr136 = new Object[1];
            d(b35, bArr45[161], b35, objArr136);
            objArr11 = (Object[]) cls7.getMethod((String) objArr136[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr134);
            if (baseContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                    char cRed2 = (char) Color.red(0);
                    int i204 = 2267 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int defaultSize3 = 33 - View.getDefaultSize(0, 0);
                    byte[] bArr46 = $$a;
                    Object[] objArr137 = new Object[1];
                    a((byte) 37, bArr46[5], bArr46[7], objArr137);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(cRed2, i204, defaultSize3, -654680577, false, (String) objArr137[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr11);
                try {
                    long jLongValue17 = ((Long) Class.forName(str7).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char cRgb3 = (char) (Color.rgb(0, 0, 0) + 16777216);
                        int iIndexOf5 = 2266 - TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                        int i205 = 32 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        Object[] objArr138 = new Object[1];
                        a((byte) 52, (short) ($$b & 958), $$a[7], objArr138);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(cRgb3, iIndexOf5, i205, -874156483, false, (String) objArr138[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char mode3 = (char) View.MeasureSpec.getMode(0);
                        int touchSlop5 = (ViewConfiguration.getTouchSlop() >> 8) + 2267;
                        int iIndexOf6 = TextUtils.indexOf((CharSequence) str, '0', 0) + 34;
                        byte b36 = (byte) 52;
                        Object[] objArr139 = new Object[1];
                        a(b36, (short) (b36 & 239), $$a[7], objArr139);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(mode3, touchSlop5, iIndexOf6, -887667012, false, (String) objArr139[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
        }
        int i206 = ((int[]) objArr11[3])[0];
        int i207 = ((int[]) objArr11[0])[0];
        if (i207 != i206) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr19 = (String[]) objArr11[1];
            if (strArr19 != null) {
                int i208 = TuitionPaymentFragmentbindingInflater1 + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i208 % 128;
                int i209 = i208 % 2 != 0 ? 1 : 0;
                while (i209 < strArr19.length) {
                    arrayList8.add(strArr19[i209]);
                    i209++;
                }
            }
            throw new RuntimeException(String.valueOf(i207));
        }
        Object[] objArr140 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i210 = ((int[]) objArr11[2])[0];
        int i211 = ((int[]) objArr11[0])[0];
        int i212 = ((int[]) objArr11[3])[0];
        String[] strArr20 = (String[]) objArr11[1];
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i213 = 527885901 + (((~((-785818721) | startUptimeMillis)) | 780313696 | (~(22894595 | startUptimeMillis))) * (-754));
        int i214 = ~((-780313697) | startUptimeMillis);
        int i215 = ~startUptimeMillis;
        int i216 = i210 + i213 + ((i214 | (~(803208291 | i215))) * (-754)) + ((i215 | (-785818721)) * 754);
        int i217 = (i216 << 13) ^ i216;
        int i218 = i217 ^ (i217 >>> 17);
        ((int[]) objArr140[2])[0] = i218 ^ (i218 << 5);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    static {
        byte[] bArr = new byte[555];
        System.arraycopy("M\u0096S\u0004÷\u0013\u0002\u0001û\u0007\u000fÂ\u0000% á0\u0004\u0000×\"\u000f\u0004¼%7ï\u0006\u000f\bù\n\u0003Ù\"\u0017ó\t\u0005\týï\u0017\u0012\u0001\u0003\u0003\töá1ù\u0019¯\u0011%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\nò\u000b\tú\t\týæ)ü\nù\u0017õ\u0011Ã\t\fï\u000f\u0001ÿ\u0001\u0017õã2ó\u001aî\u0005\u000eý%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\n\u0003\u0001ù\u0002\nü\u000f\u0001\t\u0002\u0001\tû\u0003\u0016÷\u0000\u0016Ú&ù\u0005\u000bü\u0005\u0005ÿ\u0018û\fÁ\u0010\u0002Å8\u0012þ\r\u0005û\u000e½:\u0001\u0017ñ\u0005\u000b\tú\t\týË\u001c0ó\n\nü\r\nÑ6ú\u0006Ú&\u0015ù\u0011óï\u0015\u0015\u0006ùþ\n\u000bõ\u0011\nÓ*\u000fù\u0015ï\r\tù\u0005\u000bØ/ø\u0016üü\r\nÒ+\tú\t\tý%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\n\u0003\u0001ù\u0002\nü\u000f\u0001\t\u0002\u0001\tû\u0003\u0016÷\u0000\u0016Ú&ù\u0005\u000bü\u0005\u0005ÿ\u0018û\fÂ\"\u0010ü\u0011óÕ\u0015\"\u0010ü\u0011óæ0\u0003\n\u0002\u0001\u0001Ý7\u0000õ\u0011\u0000÷\u000fë*ù\nø\u0001\u0013ùþí\u0019\u0010ù\u0006\u0001Øó4%ø\u000fù\n\u0003æ\u0015\u001cøü\r\nÖ0ó\n\nü\r\n\u0003\u0001ù\u0002\nü\u000f\u0001\t\u0002\u0001\tû\u0003\u0016÷\u0000\u0016Ú&ù\u0005\u000bü\u0005\u0005ÿ\u0018û\fÂ\u0010\u0002Å=\f\u0004ü\týÍ7\u0011ú\u0012\u0001þÿÎ=\n\n¿Cü\u0000\u0016\u0006\u0001÷\fü\r\n¾?\t\nõ\u0011\u0000÷\u000fÆP\u0004ùø\u0010\u0002Å=\f\u0004ü\týÍ7\u0011ú\u0012\u0001þÿÎB\u0001ý\u0014ó\u0015û\u0000\u0012¿F\u0000ù\u0006\u0006\u0012¿7\u0013ýÉC\u0006ù\u0005\u000bÆP\u0004í\u0013\u0010\u0002Å:\u0001\u0017ñ\u0007\u000füË7\u0011ú\u0012\u0001þÿÎH\u0007üÅ?\t\nõ\u0011\u0000÷\u000fÆ:\u000f\u0002ø\f\tÄIô\u0010\u0005ùÍ('üí\u0017\u0000\u0016à\u0014\u0010\u0005ùÃHý\u0011ú\fýä5ó\r\n´\u0011".getBytes("ISO-8859-1"), 0, bArr, 0, 555);
        $$d = bArr;
        $$e = 158;
        $$a = new byte[]{88, 99, -94, -58, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
        $$b = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{36160, 55967, 8948, 35383, 53844, 14946, 33715, 60296, 13293, 39792, 58161, 19279, 37033, 63642, 16599, 43051, 7387, 19202, 45951, 7072, 17302, 44031, 4670, 31239, 41562, 2727, 29321, 56006, 257, 26905, 53582, 14779, 45565, 58918, 7760, 46738, 61091, 1745, 48896, 55166, 3923, 42907, 57338, 30675, 44053, 50219, 31856, 38037, 52401, 25803, 40216, 13647, 28015, 34195, 45561, 58916, 7765, 46736, 61119, 1757, 48896, 55042, 3929, 42889, 57272, 30708, 44037, 50229, 31841, 45565, 58918, 7760, 46738, 61091, 1745, 48896, 55166, 3933, 42904, 57252, 30638, 44077, 50235, 31856, 38041, 52394, 25825, 40192, 13657, 27992, 34192, 15830, 22005, 35357, 8780, 45567, 58941, 7750, 46738, 61097, 1750, 48912, 55057, 3916, 42904, 57272, 30697, 44047, 50233, 31856, 38041, 52403, 25830, 34909, 57310, 10145, 36722, 55134, 16169, 34545, 61077, 14070, 40573, 58945, 20038, 38394, 64974, 17814, 44342, 62744, 23882, 42161, 3254, 21706, 48188, 1120, 27649, 46058, 7148, 25477, 51970, 4972, 31503, 49795, 11002, 29398, 55898, 8821, 35242, 53646, 14842, 33071, 59714, 12585, 39086, 57491, 18635, 36985, 63566, 16452, 38838, 65486, 18379, 44863, 63282, 24395, 42675, 3813, 22145, 48694, 1635, 28243, 46545, 7613, 25997, 52485, 5409, 9406, 29544, 35601, 9111, 31677, 37836, 10823, 16934, 39448, 13007, 19109, 58019, 14664, 20779, 59683, 389, 22959, 61946, 2051, 41042, 63608, 4238, 43139, 49383, 8031, 46941, 53047, 26552, 49118, 55264, 28220, 34377, 56932, 30443, 36544, 9488, 32057, 38172, 11716, 17827, 40399, 13388, 19571, 58487, 15514, 21677, 60662, 15106, 21284, 60202, 908, 23512, 62383, 2573, 41558, 64099, 4830, 43663, 49895, 6453, 45324, 51561, 25011, 47511};
        b = -678191765954828728L;
    }

    private static String $$g(int i, int i2, byte b2) {
        int i3 = 115 - (i * 3);
        int i4 = b2 * 3;
        byte[] bArr = $$c;
        int i5 = (i2 * 2) + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5++;
            i3 += i5;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i5];
            i5++;
            i3 = b3 + i3;
            i7 = i8;
        }
    }
}
