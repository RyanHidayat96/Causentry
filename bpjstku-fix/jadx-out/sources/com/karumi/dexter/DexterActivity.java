package com.karumi.dexter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.ActivityCompat;
import androidx.core.view.ViewCompat;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.UseCaseAttachStateAttachStateFilter;
import defpackage.UseCaseAttachStateExternalSyntheticLambda1;
import defpackage.abortCapture;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.getActive;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import defpackage.setUseCaseInactive;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class DexterActivity extends Activity implements ActivityCompat.OnRequestPermissionsResultCallback {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static final byte[] $$g;
    private static final int $$h;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;
    private static int asInterface;
    private static char b;
    private static final byte[] $$c = {58, 66, -1, 15};
    private static final int $$f = 164;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 103
            byte[] r0 = com.karumi.dexter.DexterActivity.$$a
            int r6 = r6 * 2
            int r1 = r6 + 14
            int r5 = r5 * 3
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 13
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r5
            r4 = r6
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r5]
            int r3 = r3 + 1
        L2b:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.karumi.dexter.DexterActivity.d(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.karumi.dexter.DexterActivity.$$d
            int r6 = 53 - r6
            int r7 = r7 + 84
            int r8 = 162 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L26
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L26:
            int r7 = r7 + r8
            int r8 = r3 + 1
            int r7 = r7 + (-11)
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.karumi.dexter.DexterActivity.e(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 84
            int r8 = 99 - r8
            int r6 = r6 + 4
            byte[] r0 = com.karumi.dexter.DexterActivity.$$g
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r5 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            r3 = r0[r6]
        L22:
            int r6 = r6 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.karumi.dexter.DexterActivity.f(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:152:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x049f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x039d A[Catch: NameNotFoundException -> 0x0731, TryCatch #5 {NameNotFoundException -> 0x0731, blocks: (B:3:0x0008, B:5:0x00e5, B:6:0x0119, B:9:0x0125, B:12:0x0152, B:16:0x023d, B:19:0x02a5, B:23:0x0326, B:28:0x0335, B:34:0x0357, B:36:0x0394, B:38:0x039d, B:39:0x03d3, B:41:0x03e2, B:42:0x041c, B:61:0x04b5, B:63:0x04bb, B:64:0x04f5, B:76:0x05c9, B:50:0x0497, B:52:0x049d, B:53:0x049e, B:31:0x0341, B:54:0x049f, B:56:0x04ac, B:58:0x04b2, B:59:0x04b3, B:44:0x0424, B:46:0x043a, B:47:0x0486, B:14:0x0156, B:18:0x0241, B:22:0x02b7), top: B:145:0x0008, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x03e2 A[Catch: NameNotFoundException -> 0x0731, TryCatch #5 {NameNotFoundException -> 0x0731, blocks: (B:3:0x0008, B:5:0x00e5, B:6:0x0119, B:9:0x0125, B:12:0x0152, B:16:0x023d, B:19:0x02a5, B:23:0x0326, B:28:0x0335, B:34:0x0357, B:36:0x0394, B:38:0x039d, B:39:0x03d3, B:41:0x03e2, B:42:0x041c, B:61:0x04b5, B:63:0x04bb, B:64:0x04f5, B:76:0x05c9, B:50:0x0497, B:52:0x049d, B:53:0x049e, B:31:0x0341, B:54:0x049f, B:56:0x04ac, B:58:0x04b2, B:59:0x04b3, B:44:0x0424, B:46:0x043a, B:47:0x0486, B:14:0x0156, B:18:0x0241, B:22:0x02b7), top: B:145:0x0008, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x043a A[Catch: all -> 0x0496, TryCatch #2 {all -> 0x0496, blocks: (B:44:0x0424, B:46:0x043a, B:47:0x0486), top: B:141:0x0424, outer: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.reflect.Method] */
    private boolean isTargetSdkUnderAndroidM() throws Throwable {
        ?? r2;
        int i;
        boolean z;
        int i2;
        int i3;
        String string;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i4 = 2 % 2;
        try {
            ArrayList arrayList = new ArrayList();
            Class<?>[] clsArr = null;
            int i5 = 1;
            Object[] objArr2 = new Object[1];
            a(new char[]{57169, 19926, 57147, 63092, 63452, 7101, 32812, 10389, 12403, 59253, 59103, 2734, 302, 54307, 54753, 14733, 4614, 50501, 50403, 10389}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            c(new char[]{12201, 17629, 46399, 21155, 60052, 17926, 28769, 676, 30387, 53680, 63492, 8700, 56115, 49198, 44700, 474, 13185, 10787}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.notification_gojek_app).substring(4, 5).codePointAt(0) - 91, objArr3);
            Class<?> cls2 = Class.forName("android.content.pm.PackageManager");
            byte b2 = (byte) 0;
            byte b3 = b2;
            byte b4 = b3;
            Object[] objArr4 = new Object[1];
            d(b2, b3, b4, objArr4);
            String str = (String) objArr4[0];
            Class<?>[] clsArr2 = {String.class, Integer.TYPE};
            Class<?> cls3 = Class.forName("android.app.ApplicationPackageManager");
            Object[] objArr5 = new Object[1];
            d(b2, b3, b4, objArr5);
            Method[] methodArr = {cls2.getMethod(str, clsArr2), cls3.getMethod((String) objArr5[0], String.class, Integer.TYPE)};
            int i6 = -2001519171;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int i7 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2822;
                int i8 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
                byte b5 = $$d[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                e(b5, b6, (short) (b6 | 158), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, i7, i8, 1814927978, false, (String) objArr6[0], null);
            }
            int i9 = 16;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) != null) {
                i = i6;
                break;
            }
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getScrollBarSize() >> 8), Color.rgb(0, 0, 0) + 16780039, (ViewConfiguration.getPressedStateDuration() >> 16) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i10 = asBinder + 61;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i = i6;
                    break;
                }
                Method method = declaredMethods[i12];
                try {
                    Object[] objArr7 = new Object[i5];
                    a(new char[]{38231, 43914, 38205, 4136, 4368, 27018, 26336, 23202, 31349, 297, 19, 30873, 19240, 12927, 13068, 19366, 22549, 8961, 8751, 23212, 10515, 56407, 21787, 46526, 15903, 52509, 17485, 33859}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(clsArr, clsArr)).getApplicationContext().getPackageName().codePointAt(i5) - 110, objArr7);
                    Class<?> cls4 = Class.forName((String) objArr7[0]);
                    char[] cArr = new char[i9];
                    // fill-array-data instruction
                    cArr[0] = 50522;
                    cArr[1] = 61142;
                    cArr[2] = 50493;
                    cArr[3] = 21872;
                    cArr[4] = 5258;
                    cArr[5] = 15848;
                    cArr[6] = 25464;
                    cArr[7] = 3820;
                    cArr[8] = 10809;
                    cArr[9] = 17533;
                    cArr[10] = 1411;
                    cArr[11] = 11487;
                    cArr[12] = 6955;
                    cArr[13] = 30568;
                    cArr[14] = 13972;
                    cArr[15] = 8190;
                    Object[] objArr8 = new Object[i5];
                    a(cArr, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(clsArr, clsArr)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr8);
                    Object[] objArr9 = new Object[i5];
                    objArr9[0] = Integer.valueOf(((Integer) cls4.getMethod((String) objArr8[0], clsArr).invoke(method, clsArr)).intValue());
                    Object[] objArr10 = new Object[i5];
                    a(new char[]{58905, 35712, 58995, 12322, 9726, 28266, 21006, 23874, 2363, 8483, 13565, 32633, 14438, 4725, 2018, 19526, 11099, 779, 5825, 23884, 23133, 64605, 25077, 45652, 19777, 60694, 28842, 33710, 31796, 56825}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(clsArr, clsArr)).getApplicationContext().getResources().getString(com.bpjstku.R.string.uikit_uob_web_instruction_6).substring(13, 14).codePointAt(0) - 108, objArr10);
                    Class<?> cls5 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[i5];
                    c(new char[]{4843, 39214, 40203, 48575, 5350, 53040, 19016, 48886, 64001, 31434}, View.MeasureSpec.makeMeasureSpec(0, 0) + 8, objArr11);
                    String str2 = (String) objArr11[0];
                    Class<?>[] clsArr3 = new Class[i5];
                    clsArr3[0] = Integer.TYPE;
                    if (((Boolean) cls5.getMethod(str2, clsArr3).invoke(null, objArr9)).booleanValue()) {
                        Class cls6 = Long.TYPE;
                        Object[] objArr12 = new Object[i5];
                        a(new char[]{38231, 43914, 38205, 4136, 4368, 27018, 26336, 23202, 31349, 297, 19, 30873, 19240, 12927, 13068, 19366, 22549, 8961, 8751, 23212, 10515, 56407, 21787, 46526, 15903, 52509, 17485, 33859}, 1 - TextUtils.indexOf("", ""), objArr12);
                        Class<?> cls7 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        c(new char[]{26961, 10289, 25005, 4959, 19500, 41614, 1523, 19694, 64982, 43852, 31719, 29857, 3002, 47430, 4575, 13266}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.validation_shippingcity_empty).substring(18, 19).codePointAt(0) - 92, objArr13);
                        if (cls6.equals(cls7.getMethod((String) objArr13[0], null).invoke(method, null))) {
                            int i13 = asInterface + 105;
                            asBinder = i13 % 128;
                            int i14 = i13 % 2;
                            Object[] objArr14 = new Object[1];
                            a(new char[]{38231, 43914, 38205, 4136, 4368, 27018, 26336, 23202, 31349, 297, 19, 30873, 19240, 12927, 13068, 19366, 22549, 8961, 8751, 23212, 10515, 56407, 21787, 46526, 15903, 52509, 17485, 33859}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr14);
                            Class<?> cls8 = Class.forName((String) objArr14[0]);
                            Object[] objArr15 = new Object[1];
                            c(new char[]{47243, 47260, 43012, 42460, 58216, 63249, 57662, 64025, 44719, 56043, 30445, 51969, '5', 32031, 52634, 47929, 8775, 36443, 8353, 25293}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, objArr15);
                            Object[] objArr16 = (Object[]) cls8.getMethod((String) objArr15[0], null).invoke(method, null);
                            if (objArr16.length == 2) {
                                int i15 = asBinder + 61;
                                asInterface = i15 % 128;
                                if (i15 % 2 == 0) {
                                    if (Long.TYPE.equals(objArr16[1])) {
                                        int i16 = asInterface + 53;
                                        asBinder = i16 % 128;
                                        int i17 = i16 % 2;
                                        objArr = new Object[1];
                                        a(new char[]{38231, 43914, 38205, 4136, 4368, 27018, 26336, 23202, 31349, 297, 19, 30873, 19240, 12927, 13068, 19366, 22549, 8961, 8751, 23212, 10515, 56407, 21787, 46526, 15903, 52509, 17485, 33859}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr);
                                        if (Class.forName((String) objArr[0]).equals(objArr16[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                                int iResolveOpacity = 2823 - Drawable.resolveOpacity(0, 0);
                                                int deadChar = KeyEvent.getDeadChar(0, 0) + 22;
                                                byte b7 = $$d[7];
                                                byte b8 = b7;
                                                Object[] objArr17 = new Object[1];
                                                e(b7, b8, (short) (b8 | 158), objArr17);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, iResolveOpacity, deadChar, 1814927978, false, (String) objArr17[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                int mode = 2823 - View.MeasureSpec.getMode(0);
                                                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22;
                                                byte b9 = $$d[7];
                                                byte b10 = b9;
                                                Object[] objArr18 = new Object[1];
                                                e(b9, b10, (short) (b10 | 158), objArr18);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, mode, keyRepeatDelay, 1814927978, false, (String) objArr18[0], null);
                                            }
                                            try {
                                                Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                    int fadingEdgeLength = 2823 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                    int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0');
                                                    Object[] objArr20 = new Object[1];
                                                    e((byte) 52, $$d[54], (short) 106, objArr20);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, fadingEdgeLength, iIndexOf, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr19)).longValue();
                                                i = -2001519171;
                                                break;
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } else if (Long.TYPE.equals(objArr16[0])) {
                                    int i18 = asInterface + 53;
                                    asBinder = i18 % 128;
                                    int i19 = i18 % 2;
                                    objArr = new Object[1];
                                    a(new char[]{38231, 43914, 38205, 4136, 4368, 27018, 26336, 23202, 31349, 297, 19, 30873, 19240, 12927, 13068, 19366, 22549, 8961, 8751, 23212, 10515, 56407, 21787, 46526, 15903, 52509, 17485, 33859}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr);
                                    if (Class.forName((String) objArr[0]).equals(objArr16[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                                            int iResolveOpacity2 = 2823 - Drawable.resolveOpacity(0, 0);
                                            int deadChar2 = KeyEvent.getDeadChar(0, 0) + 22;
                                            byte b11 = $$d[7];
                                            byte b12 = b11;
                                            Object[] objArr110 = new Object[1];
                                            e(b11, b12, (short) (b12 | 158), objArr110);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState2, iResolveOpacity2, deadChar2, 1814927978, false, (String) objArr110[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                            int mode2 = 2823 - View.MeasureSpec.getMode(0);
                                            int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22;
                                            byte b13 = $$d[7];
                                            byte b14 = b13;
                                            Object[] objArr111 = new Object[1];
                                            e(b13, b14, (short) (b14 | 158), objArr111);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration2, mode2, keyRepeatDelay2, 1814927978, false, (String) objArr111[0], null);
                                        }
                                        Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            int fadingEdgeLength2 = 2823 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                            int iIndexOf2 = 21 - TextUtils.indexOf((CharSequence) "", '0');
                                            Object[] objArr21 = new Object[1];
                                            e((byte) 52, $$d[54], (short) 106, objArr21);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, fadingEdgeLength2, iIndexOf2, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                        i = -2001519171;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    i12++;
                    i6 = -2001519171;
                    clsArr = null;
                    i5 = 1;
                    i9 = 16;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                int iAxisFromString = 2822 - MotionEvent.axisFromString("");
                int defaultSize = 22 - View.getDefaultSize(0, 0);
                byte b15 = $$d[7];
                byte b16 = b15;
                Object[] objArr22 = new Object[1];
                e(b15, b16, (short) (b16 | 158), objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iAxisFromString, defaultSize, 1814927978, false, (String) objArr22[0], null);
            }
            r2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null);
            try {
                try {
                    r2 = new Object[]{r2};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mode3 = (char) View.MeasureSpec.getMode(0);
                        int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2823;
                        int i20 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
                        Object[] objArr23 = new Object[1];
                        e((byte) 52, (byte) ($$d[64] + 1), (short) 106, objArr23);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode3, keyRepeatDelay3, i20, 1025296417, false, (String) objArr23[0], new Class[]{Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, r2);
                    r2 = 3;
                    try {
                        Object[] objArr24 = {0, methodArr, null};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char touchSlop = (char) (37657 - (ViewConfiguration.getTouchSlop() >> 8));
                            int i21 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2719;
                            int iAlpha = Color.alpha(0) + 19;
                            Object[] objArr25 = new Object[1];
                            e((byte) 52, (byte) ($$d[64] + 1), (short) 106, objArr25);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(touchSlop, i21, iAlpha, -1568796068, false, (String) objArr25[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                        }
                        r2 = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr24);
                        long jLongValue = r2.longValue();
                        long j = -409104469;
                        long j2 = 253;
                        long j3 = (j2 * j) + (j2 * jLongValue);
                        long j4 = -252;
                        long j5 = -1;
                        long j6 = jLongValue ^ j5;
                        long j7 = ((j ^ j5) | j6) ^ j5;
                        long j8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
                        long j9 = j6 | (j8 ^ j5);
                        long j10 = j | jLongValue;
                        long j11 = (j10 | j8) ^ j5;
                        long j12 = j3 + ((j7 | (j9 ^ j5) | j11) * j4) + (j4 * j10) + (((long) 252) * (((j9 | j) ^ j5) | j11)) + ((long) (-1401301376));
                        int i22 = (int) (j12 >> 32);
                        try {
                            boolean z2 = false;
                            try {
                                int i23 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
                                int i24 = (-102020256) + (((~((~i23) | 283765403)) | (-1996352224)) * (-245));
                                int i25 = ~(i23 | 283765403);
                                int i26 = i22 & (i24 + (i25 * (-245)) + ((i25 | 1720991814) * 245));
                                int i27 = (int) j12;
                                z2 = false;
                                int i28 = (~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc) | 640650709;
                                int i29 = (i27 & ((-1530691388) + (i28 * 495) + (((~i28) | 69602432) * 495))) | i26;
                                int i30 = i29 >>> 24;
                                int i31 = i29 & ViewCompat.MEASURED_SIZE_MASK;
                                if (i30 != 0) {
                                    z = true;
                                } else {
                                    int i32 = asInterface + 99;
                                    asBinder = i32 % 128;
                                    if (i32 % 2 != 0) {
                                        int i33 = 3 / 5;
                                    }
                                    z = false;
                                }
                                if (z) {
                                    int i34 = asInterface + 15;
                                    asBinder = i34 % 128;
                                    i2 = 2;
                                    int i35 = i34 % 2;
                                    i3 = 1;
                                } else {
                                    i2 = 2;
                                    i3 = 0;
                                }
                                if (!z || i31 >= i2) {
                                    string = null;
                                } else {
                                    int i36 = asBinder + 83;
                                    asInterface = i36 % 128;
                                    if (i36 % i2 == 0) {
                                        Method method2 = methodArr[i31];
                                        Object obj = null;
                                        try {
                                            obj.hashCode();
                                            throw null;
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                    Method method3 = methodArr[i31];
                                    if (method3 != null) {
                                        string = method3.toString();
                                    } else {
                                        string = null;
                                    }
                                }
                                arrayList.add(string);
                                if ((i30 + 6) * i3 != 0) {
                                    throw new NullPointerException();
                                }
                                r2 = 0;
                                if (getPackageManager().getPackageInfo(getPackageName(), 0).applicationInfo.targetSdkVersion < 23) {
                                    int i37 = asBinder + 11;
                                    asInterface = i37 % 128;
                                    int i38 = i37 % 2;
                                    return true;
                                }
                                return r2;
                            } catch (PackageManager.NameNotFoundException unused) {
                                r2 = z2;
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            r2 = 0;
                        }
                    } catch (Throwable th4) {
                        Throwable cause3 = th4.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th4;
                    }
                } catch (Throwable th5) {
                    Throwable cause4 = th5.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th5;
                }
            } catch (PackageManager.NameNotFoundException unused3) {
            }
        } catch (PackageManager.NameNotFoundException unused4) {
            r2 = 0;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 61;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 9;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char trimmedLength = (char) (64838 - TextUtils.getTrimmedLength(""));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1357;
                    int size = View.MeasureSpec.getSize(0) + 38;
                    byte b2 = (byte) ($$c[2] + 1);
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, iIndexOf, size, 894276454, false, $$i(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 468 - (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.keyCodeFromString("") + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                break;
            }
            int i4 = $10 + 85;
            $11 = i4 % 128;
            int i5 = 58224;
            char c = 1;
            if (i4 % 2 == 0) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 % 1];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i6 = 0;
            while (i6 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i7 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                int i8 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentbindingInflater1);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[c] = Integer.valueOf(i7);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char minimumFlingVelocity = (char) (47773 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 468;
                        int iAlpha = 13 - Color.alpha(i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, packedPositionType, iAlpha, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 469 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int iAxisFromString = MotionEvent.axisFromString("") + 2324;
                int offsetAfter = 44 - TextUtils.getOffsetAfter("", 0);
                byte b2 = $$c[2];
                byte b3 = (byte) (b2 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maxKeyCode, iAxisFromString, offsetAfter, -1312321721, false, $$i(b3, b3, (byte) (-b2)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
        int i9 = $11 + 53;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -523091446
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle r41) {
        /*
            Method dump skipped, instruction units count: 13340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.karumi.dexter.DexterActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    protected final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) setUseCaseInactive.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        int i6 = (-310631218) + (((~((-208947476) | i5)) | 139739411 | (~(648059492 | i5))) * (-880));
        int i7 = (~((-208947476) | (~i5))) | (-648059493);
        int i8 = ~(i5 | 208947475);
        if (i4 != i6 + ((i7 | i8) * (-880)) + (i8 * 880)) {
            int i9 = 10662320 % 2;
            throw new ArithmeticException();
        }
        int i10 = ((Field) UseCaseAttachStateAttachStateFilter.b[0]).getInt(null);
        int iNextInt = new Random().nextInt(1349122310);
        if (i10 != (((~(1760866805 | iNextInt)) | (-1726824407)) * 262) + 629092917 + (((~((~iNextInt) | 1760866805)) | (-1726824407)) * 262)) {
            throw new RuntimeException("69497448");
        }
        int i11 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i12 = (~System.identityHashCode(this)) | 31348322;
        if (i11 != (-947696263) + (i12 * 495) + (((~i12) | 8914498) * 495)) {
            int i13 = asInterface + 17;
            asBinder = i13 % 128;
            if (i13 % 2 != 0) {
                int[] iArr = new int[1552116240];
                iArr[1552116239] = 0;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            } else {
                int[] iArr2 = new int[1552116240];
                iArr2[1552116239] = 1;
                int i14 = (-607267088) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i15 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i16 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        if (i15 != 221489124 + (((~i16) | 2051754727) * 1444) + (((~(i16 | (-1962476246))) | (~(246564914 | i16)) | 1883833029) * (-1444)) + 396803504) {
            throw new RuntimeException("5815589");
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 46400), 40 - TextUtils.getCapsMode("", 0, 0), 19 - TextUtils.getCapsMode("", 0, 0), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 46400), (ViewConfiguration.getScrollBarSize() >> 8) + 40, (ViewConfiguration.getLongPressTimeout() >> 16) + 19, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onResume();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // android.app.Activity
    protected final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        asInterface = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - MotionEvent.axisFromString("")), 39 - TextUtils.lastIndexOf("", '0', 0), TextUtils.getCapsMode("", 0, 0) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
                }
                Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46399 - TextUtils.lastIndexOf("", '0')), 40 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.green(0) + 19, 41588667, false, "b", new Class[0]);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
                super.onPause();
                return;
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 46400), 40 - (Process.myPid() >> 22), 19 - TextUtils.indexOf("", ""), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 46400), (Process.myTid() >> 22) + 40, 19 - ((Process.getThreadPriority(0) + 20) >> 6), 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(obj2, null);
            super.onPause();
            int i3 = 93 / 0;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int iMyTid = (Process.myTid() >> 22) + 1031;
            int i2 = 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte b2 = $$d[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            e(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, iMyTid, i2, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{48647, 53648, 34306, 1755, 26538, 32327, 7513, 43458, 35533, 55733, 22620, 316, 49710, 39546, 34360, 31819, 37437, 57107, 35461, 64376, 17251, 31358, 19036, 37570}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{23111, 7053, 53511, 26764, 64961, 8562, 6108, 6576, 38749, 57621, 42114, 32395, 20906, 5828, 53998, 12362, 33715, 34934}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 83, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int i3 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15;
            byte b4 = $$d[7];
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            e(b4, b5, (short) (b5 | 89), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, i3, keyRepeatTimeout, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int gidForName = 1030 - Process.getGidForName("");
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 15;
                Object[] objArr6 = new Object[1];
                e((byte) 52, (byte) ($$d[64] + 1), (short) 106, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, gidForName, packedPositionGroup, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = ((346233223 + (((~(iIdentityHashCode | (-387169921))) | (~((-631450091) | i6))) * 333)) + (((~(iIdentityHashCode | (-631450091))) | (~(i6 | (-387169921)))) * 333)) - 2062883105;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            a(new char[]{57169, 19926, 57147, 63092, 63452, 7101, 32812, 10389, 12403, 59253, 59103, 2734, 302, 54307, 54753, 14733, 4614, 50501, 50403, 10389}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{12201, 17629, 46399, 21155, 60052, 17926, 28769, 676, 30387, 53680, 63492, 8700, 56115, 49198, 44700, 474, 13185, 10787}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.uikit_shopeepay).substring(0, 9).length() + 7, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-830124522};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.getDefaultSize(0, 0) + 46038), 1134 - (ViewConfiguration.getTouchSlop() >> 8), 18 - TextUtils.getCapsMode("", 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -2062883105, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cMyPid = (char) (Process.myPid() >> 22);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1032;
                    int i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
                    byte b6 = $$d[7];
                    byte b7 = b6;
                    Object[] objArr12 = new Object[1];
                    e(b6, b7, b7, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, iLastIndexOf, i10, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 45993), View.getDefaultSize(0, 0) + 1117, (ViewConfiguration.getLongPressTimeout() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
                    int i11 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15;
                    Object[] objArr13 = new Object[1];
                    e((byte) 52, (byte) ($$d[64] + 1), (short) 106, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, trimmedLength, i11, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new char[]{48647, 53648, 34306, 1755, 26538, 32327, 7513, 43458, 35533, 55733, 22620, 316, 49710, 39546, 34360, 31819, 37437, 57107, 35461, 64376, 17251, 31358, 19036, 37570}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.gopay).substring(0, 5).codePointAt(0) - 49, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new char[]{23111, 7053, 53511, 26764, 64961, 8562, 6108, 6576, 38749, 57621, 42114, 32395, 20906, 5828, 53998, 12362, 33715, 34934}, KeyEvent.normalizeMetaState(0) + 15, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1031;
                        int packedPositionGroup2 = 15 - ExpandableListView.getPackedPositionGroup(0L);
                        byte b8 = $$d[7];
                        byte b9 = b8;
                        Object[] objArr16 = new Object[1];
                        e(b8, b9, (short) (b9 | 89), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarSize, windowTouchSlop, packedPositionGroup2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i12 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                        int i13 = 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte b10 = $$d[7];
                        byte b11 = b10;
                        Object[] objArr17 = new Object[1];
                        e(b10, b11, b11, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(windowTouchSlop2, i12, i13, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            int i16 = asBinder + 43;
            asInterface = i16 % 128;
            int i17 = i16 % 2;
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.card_details_error_message).substring(8, 9).codePointAt(0) - 282425826;
            int i21 = i18 + (-884641734) + ((~((~iCodePointAt) | (-17253153))) * 433) + (((~((-115876934) | iCodePointAt)) | (-128403237)) * (-433)) + (((~(iCodePointAt | (-128403237))) | (-133130086)) * 433);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr18[2])[0] = i23 ^ (i23 << 5);
            int i24 = asBinder + 13;
            asInterface = i24 % 128;
            int i25 = i24 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i15];
            int i26 = i15 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i26) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i30 = ~startUptimeMillis;
            int i31 = i27 + (-1326199723) + (((~((-7407897) | i30)) | 251688066) * 220) + (((~(i30 | (-821135706))) | 1065415875) * (-440)) + ((startUptimeMillis | (-7407897)) * 220);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr19[2])[0] = i33 ^ (i33 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c2 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
            int iMakeMeasureSpec = 1755 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr = $$d;
            byte b12 = (byte) (bArr[33] - 1);
            byte b13 = bArr[7];
            Object[] objArr20 = new Object[1];
            e(b12, b13, (short) (b13 | 37), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, iMakeMeasureSpec, tapTimeout, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i34 = asInterface + 65;
            asBinder = i34 % 128;
            int i35 = i34 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char packedPositionGroup3 = (char) (29944 - ExpandableListView.getPackedPositionGroup(0L));
                int capsMode = 1755 - TextUtils.getCapsMode("", 0, 0);
                int i36 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                byte b14 = $$d[7];
                byte b15 = b14;
                Object[] objArr21 = new Object[1];
                e(b14, b15, (short) (b15 | 89), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(packedPositionGroup3, capsMode, i36, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i37 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i38 = ~i37;
            int i39 = ((((-528484238) + ((i37 | 353367962) * (-859))) + (((~(i37 | (-353113755))) | (~(353367962 | i38))) * 859)) + (((~(140765536 | i38)) | (-493879291)) * 859)) - 1133608136;
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i41 ^ (i41 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            a(new char[]{57169, 19926, 57147, 63092, 63452, 7101, 32812, 10389, 12403, 59253, 59103, 2734, 302, 54307, 54753, 14733, 4614, 50501, 50403, 10389}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.payment_unsuccessful).substring(0, 1).codePointAt(0) - 79, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            c(new char[]{12201, 17629, 46399, 21155, 60052, 17926, 28769, 676, 30387, 53680, 63492, 8700, 56115, 49198, 44700, 474, 13185, 10787}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-830124522};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 42049), 1727 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -1133608136);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
                int iAxisFromString = MotionEvent.axisFromString("") + 1756;
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                byte b16 = $$d[7];
                byte b17 = b16;
                Object[] objArr26 = new Object[1];
                e(b16, b17, (short) (b17 | 89), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(offsetBefore, iAxisFromString, packedPositionType, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                c(new char[]{48647, 53648, 34306, 1755, 26538, 32327, 7513, 43458, 35533, 55733, 22620, 316, 49710, 39546, 34360, 31819, 37437, 57107, 35461, 64376, 17251, 31358, 19036, 37570}, 22 - KeyEvent.normalizeMetaState(0), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                c(new char[]{23111, 7053, 53511, 26764, 64961, 8562, 6108, 6576, 38749, 57621, 42114, 32395, 20906, 5828, 53998, 12362, 33715, 34934}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
                    int mode = View.MeasureSpec.getMode(0) + 1755;
                    int packedPositionGroup4 = ExpandableListView.getPackedPositionGroup(0L) + 23;
                    byte b18 = $$d[7];
                    byte b19 = b18;
                    Object[] objArr29 = new Object[1];
                    e(b18, b19, (short) (b19 | 158), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, mode, packedPositionGroup4, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char packedPositionGroup5 = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
                    int iKeyCodeFromString = 1755 - KeyEvent.keyCodeFromString("");
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                    byte[] bArr2 = $$d;
                    byte b20 = (byte) (bArr2[33] - 1);
                    byte b21 = bArr2[7];
                    Object[] objArr30 = new Object[1];
                    e(b20, b21, (short) (b21 | 37), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionGroup5, iKeyCodeFromString, scrollBarFadeDuration, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i42 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i43 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i43 == i42) {
            int i44 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int i45 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i46 = (~(110167330 | i45)) | 288100956;
            int i47 = ~((~i45) | (-75498531));
            int i48 = i44 + (-1818901727) + ((i46 | i47) * (-470)) + (((~(i45 | 398268286)) | i47) * 470);
            int i49 = (i48 << 13) ^ i48;
            int i50 = i49 ^ (i49 >>> 17);
            ((int[]) objArr31[3])[0] = i50 ^ (i50 << 5);
            int i51 = asBinder + 109;
            asInterface = i51 % 128;
            if (i51 % 2 == 0) {
                int i52 = 74 / 0;
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
        if (strArr5 != null) {
            int i53 = asBinder + 27;
            asInterface = i53 % 128;
            int i54 = i53 % 2;
            for (String str2 : strArr5) {
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i43 / (((i43 - 1) * i43) % 2), 0).show();
        int i55 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i56 = i55 + (((~((-167905546) | iIdentityHashCode2)) * 521) - 402832200) + (((~((~iIdentityHashCode2) | (-167905546))) | (-1065287504)) * 521);
        int i57 = (i56 << 13) ^ i56;
        int i58 = i57 ^ (i57 >>> 17);
        ((int[]) objArr32[3])[0] = i58 ^ (i58 << 5);
    }

    @Override // android.app.Activity
    protected final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) UseCaseAttachStateExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iNextInt = new Random().nextInt(1471002333);
        int i3 = ~iNextInt;
        if (i2 != 1805844019 + (((~((-671354882) | i3)) | (~((-624681) | iNextInt)) | (~(1782446459 | iNextInt))) * 765) + (((~((-671979562) | i3)) | 671354881) * 1530) + (((~(iNextInt | (-671979562))) | (~(i3 | 1782446459))) * 765)) {
            int i4 = asBinder + 5;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            int[] iArr = new int[1963798608];
            iArr[1963798607] = 1;
            int i6 = (-1674516304) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i7 = asInterface + 59;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = ((Field) getActive.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i10 = (-1840120968) + ((iUptimeMillis | 297652607) * (-859));
        int i11 = ~iUptimeMillis;
        if (i9 != i10 + (((~(iUptimeMillis | (-287637551))) | (~(297652607 | i11))) * 859) + (((~(1821963601 | i11)) | (-2109601152)) * 859)) {
            int i12 = 1632005796 % 2;
            throw new ArithmeticException();
        }
        int i13 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_camera_screen_instructions_blink_smile_and_your_eyes).substring(0, 25).codePointAt(14) + 446684031;
        int i14 = ~((-377979202) | iCodePointAt);
        int i15 = ~iCodePointAt;
        if (i13 != (-1765936719) + ((i14 | (~(i15 | 1606933851))) * 497) + (((~(iCodePointAt | 1606933851)) | (~((-398967108) | i15)) | 20987906) * 497)) {
            int i16 = (-1444571382) % 2;
            throw new ArithmeticException();
        }
        int i17 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i18 = (-547510484) + ((iIdentityHashCode | 270549264) * 988);
        int i19 = ~iIdentityHashCode;
        if (i17 != i18 + (((~(820166928 | i19)) | 1209271372) * (-1976)) + (((~(iIdentityHashCode | (-1758889037))) | 270549264 | (~(1758889036 | i19))) * 988)) {
            throw new RuntimeException("-1320333790");
        }
        super.onStart();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        Dexter.onActivityDestroyed();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    protected final void onNewIntent(Intent intent) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onNewIntent(intent);
        Dexter.onActivityReady(this);
        if (i3 != 0) {
            throw null;
        }
        int i4 = asInterface + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        if (isTargetSdkUnderAndroidM()) {
            linkedList2.addAll(Arrays.asList(strArr));
        } else {
            int i3 = asInterface + 25;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 < strArr.length; i5++) {
                String str = strArr[i5];
                int i6 = iArr[i5];
                if (i6 == -2 || i6 == -1) {
                    linkedList2.add(str);
                } else if (i6 == 0) {
                    int i7 = asBinder + 91;
                    asInterface = i7 % 128;
                    int i8 = i7 % 2;
                    linkedList.add(str);
                }
            }
        }
        Dexter.onPermissionsRequested(linkedList, linkedList2);
    }

    static {
        byte[] bArr = new byte[TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO];
        System.arraycopy("m0Â&\u0001ð2Ýî\nù\u0000+àî)Þ\u0004þ\u0015èÿò\rðOÏÞ\u000bô\nù\u0000\u001dîç\u000b\u0007öù-Ó\u0010ùù\u0007öù\u0000\u0002\n\u0001ù\u0007ô\u0002ú\u0001\u0002ú\b\u0000í\f\u0003í)Ý\nþø\u0007þþ\u0004ë\b÷@Þ\u000bô\nù\u0000\u001dîç\u000b\u0007öù-Ó\u0010ùù\u0007öù\u0011øú\túú\u0006\u001dÚ\u0007ù\nì\u000eò@ó\u0001>Ëñ\u0005öþ\bõF½ý\fñ\röù\u0012ì\nù\u0000?Éú\u0001ýô\u0012ô\b\u0001î\r5éÞð\u0012÷ü'Ú\u0001ýô\u0012ô(áî\r\"Ýî\nò\fôúT°\u0002\n\u0001ù\u0007ôGÿºú\u0001\u0002ú\b\u0000?\u00ad\f\u0003í)Ý\nþøG¿þþ\u0004ë\b÷OðÞ\u000bô\nù\u0000\u001dîç\u000b\u0007öù-Ó\u0010ùù\u0007öù\u0000\u0002\n\u0001ù\u0007ô\u0002ú\u0001\u0002ú\b\u0000í\f\u0003í)Ý\nþø\u0007þþ\u0004ë\b÷@\u0001ð0Úþü\u0007!Òù\u0006\tð\u001bíô\u000bþú\u001aí\u0003î\u000eú\u0011ì\u0003í\u0001ð íø\u0006\u0001î\u000e\u0000\u001aÔ\u000e÷Þ\u000bô\nù\u0000\u001dîç\u000b\u0007öù-Ó\u0010ùù\u0007öù\u0000\u0002\n\u0001ù\u0007ô\u0002ú\u0001\u0002ú\b\u0000í\f\u0003í)Ý\nþø\u0007þþ\u0004ë\b÷Bó\u0001>Æ÷ÿ\u0007ú\u00066Ìò\tñ\u0002\u0005\u00045ÆùùDÀ\u0007\u0003íý\u0002\f÷\u0007öùEÄúù\u000eò\u0003\fô=³ÿ\u0017ûó\u0001>Ëñ\u0005öþ\bõF½ý\fñ\röù\u0012ì\nù\u0000?¿þú\n\u0002ü\u0005\u0001ì\nù\u0000?ßÞú\n\u0002ü\u0005\u0001ì\nù\u0000+Òúÿ\u0004\u0001\u0019ê\u0002ÿðO°\u0002\n\u0001ù\u0007ôGÿºú\u0001\u0002ú\b\u0000?ºú\u0003\u0004\u0001îO¿þþ\u0004ë\b÷Oò\fýýõþ\u000eò.áó\u0007ò\u0010<ÏÞ\u000bô\nù\u0000\u001dîç\u000b\u0007öù-Ó\u0010ùù\u0007öù\u0011øú\túú\u0006\u001dÚ\u0007ù\nì\u000eò@Þ\u000bô\nù\u0000\u001dîç\u000b\u0007öù-Ó\u0010ùù\u0007öù\u0000\u0002\n\u0001ù\u0007ô\u0002ú\u0001\u0002ú\b\u0000í\f\u0003í)Ý\nþø\u0007þþ\u0004ë\b÷A".getBytes("ISO-8859-1"), 0, bArr, 0, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO);
        $$g = bArr;
        $$h = 160;
        $$d = new byte[]{82, Base64.padSymbol, -66, -42, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        $$e = 44;
        $$a = new byte[]{117, 50, 102, 124, -2, 15, -36, 17, 2, 8, -10, 6, -2, -28, 37, -8, 9};
        $$b = 230;
        asBinder = 0;
        asInterface = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -4930233274485943899L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 28131;
        b = (char) 18691;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 23125;
        TuitionPaymentFragmentbindingInflater1 = (char) 5208;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r5, int r6, short r7) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r7 = r7 + 107
            byte[] r0 = com.karumi.dexter.DexterActivity.$$c
            int r5 = r5 * 3
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r0[r6]
        L24:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.karumi.dexter.DexterActivity.$$i(byte, int, short):java.lang.String");
    }
}
