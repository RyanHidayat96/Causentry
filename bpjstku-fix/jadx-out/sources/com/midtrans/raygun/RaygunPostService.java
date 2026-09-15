package com.midtrans.raygun;

import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.os.Bundle;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.bpjstku.R;
import com.bpjstku.data.point.PointDataStore;
import defpackage.DualSurfaceProcessorNodeExternalSyntheticLambda0;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.initSession;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.onCaptureSessionEnd;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public class RaygunPostService extends Service {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;
    private static char d;
    private static int g;
    private Intent TuitionPaymentFragmentbindingInflater1;
    private int b = 0;
    private static final byte[] $$c = {60, 80, 13, 34};
    private static final int $$f = 183;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 103 - r6
            int r0 = 53 - r7
            byte[] r1 = com.midtrans.raygun.RaygunPostService.$$a
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L29:
            int r8 = r8 + r6
            int r6 = r3 + 1
            int r8 = r8 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.raygun.RaygunPostService.a(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.midtrans.raygun.RaygunPostService.$$d
            int r6 = r6 + 4
            int r7 = r7 + 84
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r6
            r4 = r2
            goto L2b
        L10:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.raygun.RaygunPostService.e(short, int, short, java.lang.Object[]):void");
    }

    static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(RaygunPostService raygunPostService) {
        int i = 2 % 2;
        int i2 = g + 11;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((ConnectivityManager) raygunPostService.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            obj.hashCode();
            throw null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) raygunPostService.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager.getActiveNetworkInfo() == null || (!connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting())) {
            return false;
        }
        int i3 = g + 29;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        throw null;
    }

    static /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault2(RaygunPostService raygunPostService) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 7;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = raygunPostService.b;
        raygunPostService.b = i5 - 1;
        int i6 = i2 + 1;
        g = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static /* synthetic */ int b(RaygunPostService raygunPostService) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 121;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = raygunPostService.b;
        int i6 = i2 + 25;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 67;
        g = i4 % 128;
        int i5 = i4 % 2;
        this.TuitionPaymentFragmentbindingInflater1 = intent;
        final Bundle extras = intent.getExtras();
        if (extras != null) {
            Thread thread = new Thread(new Runnable() { // from class: com.midtrans.raygun.RaygunPostService.5
                @Override // java.lang.Runnable
                public final void run() {
                    String str = (String) extras.get(NotificationCompat.CATEGORY_MESSAGE);
                    String str2 = (String) extras.get("apikey");
                    if ("True".equals((String) extras.get("isPulse"))) {
                        DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(str2, str);
                    } else if (RaygunPostService.TuitionPaymentFragmentbindingInflater1(RaygunPostService.this)) {
                        DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, str);
                    } else {
                        synchronized (this) {
                            ArrayList<File> arrayList = new ArrayList(Arrays.asList(RaygunPostService.this.getCacheDir().listFiles()));
                            int i6 = 0;
                            for (File file : arrayList) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(Integer.toString(i6));
                                sb.append(".raygun");
                                String string = sb.toString();
                                if (DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file.getName()).equals("raygun") && !file.getName().equals(string)) {
                                    break;
                                } else if (i6 < 64) {
                                    i6++;
                                } else {
                                    ((File) arrayList.get(0)).delete();
                                }
                            }
                            File cacheDir = RaygunPostService.this.getCacheDir();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(Integer.toString(i6));
                            sb2.append(".raygun");
                            File file2 = new File(cacheDir, sb2.toString());
                            try {
                                try {
                                    MessageApiKey messageApiKey = new MessageApiKey(str2, str);
                                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file2));
                                    objectOutputStream.writeObject(messageApiKey);
                                    objectOutputStream.close();
                                } catch (IOException e2) {
                                    e2.getMessage();
                                }
                            } catch (FileNotFoundException e3) {
                                e3.getMessage();
                            }
                        }
                    }
                    RaygunPostService.TuitionPaymentFragmentspecialinlinedviewModeldefault2(RaygunPostService.this);
                    if (RaygunPostService.b(RaygunPostService.this) == 0) {
                        RaygunPostService.this.stopSelf();
                    }
                }
            });
            thread.setDaemon(true);
            this.b++;
            thread.start();
            int i6 = asBinder + 99;
            g = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 22 / 0;
            }
            return 2;
        }
        int i8 = g + 91;
        asBinder = i8 % 128;
        return i8 % 2 == 0 ? 4 : 2;
    }

    @Override // android.app.Service
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = g + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        stopService(this.TuitionPaymentFragmentbindingInflater1);
        int i4 = asBinder + 45;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $11 + 95;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i5 = 58224;
                int i6 = 0;
                while (i6 < 16) {
                    char c2 = cArr3[1];
                    char c3 = cArr3[c];
                    int i7 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                    int i8 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(d);
                        objArr2[2] = Integer.valueOf(i8);
                        objArr2[1] = Integer.valueOf(i7);
                        objArr2[c] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char maximumDrawingCacheSize = (char) (47773 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 468;
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 13;
                            Class[] clsArr = new Class[4];
                            clsArr[c] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, maximumFlingVelocity, fadingEdgeLength, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        int i9 = i6;
                        Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - View.resolveSize(0, 0)), View.resolveSizeAndState(0, 0, 0) + 468, View.MeasureSpec.makeMeasureSpec(0, 0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                        i6 = i9 + 1;
                        c = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 2323 - (ViewConfiguration.getPressedStateDuration() >> 16), Process.getGidForName("") + 45, -1312321721, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } else {
                objArr[0] = new String(cArr2, 0, i);
                int i10 = $10 + 59;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:17:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:19:0x0180  */
    /* JADX WARN: Code duplicated, block: B:22:0x020d A[Catch: all -> 0x0a83, TryCatch #1 {all -> 0x0a83, blocks: (B:20:0x01f9, B:22:0x020d, B:23:0x023e, B:59:0x06e2, B:61:0x06f6, B:62:0x0726, B:64:0x0758, B:65:0x07d1), top: B:103:0x01f9 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0258  */
    /* JADX WARN: Code duplicated, block: B:31:0x030d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0361  */
    @Override // android.app.Service, android.content.ContextWrapper
    protected void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        int i2 = asBinder + 75;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
                int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte[] bArr = $$a;
                byte b = bArr[91];
                Object[] objArr2 = new Object[1];
                a(b, (byte) (b - 4), bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, keyRepeatDelay, iMakeMeasureSpec, 986134021, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
            int i3 = 74 / 0;
            if (j != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char size = (char) (View.MeasureSpec.getSize(0) + 29944);
                    int offsetAfter = 1755 - TextUtils.getOffsetAfter("", 0);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[91];
                    byte b3 = bArr2[7];
                    Object[] objArr3 = new Object[1];
                    a(b2, b3, (short) (b3 | 37), objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, offsetAfter, longPressTimeout, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i4 = 1320524901 + ((~((~iIdentityHashCode) | (-75502603))) * (-116)) + ((997041124 | iIdentityHashCode) * 116) + (((~(iIdentityHashCode | 784438698)) | 288105028) * 116) + 690613547;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i6 ^ (i6 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                c(new char[]{31206, 3323, 48901, 48722, 19883, 15620, 52894, 32091, 62419, 61585, 27825, 13967, 27542, 34594, 35177, 13863, 55075, 46240}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                c(new char[]{40712, 10062, 3695, 31597, 64337, 38367, 41338, 2384, 34229, 3791, 63263, 16640, 48699, 3090, 64799, 52138, 25533, 12726}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {1619806349};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 42050), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1727, (-16777187) - Color.rgb(0, 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), 690613547, false, true);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char absoluteGravity = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
                        byte[] bArr3 = $$a;
                        byte b4 = bArr3[91];
                        byte b5 = bArr3[7];
                        Object[] objArr8 = new Object[1];
                        a(b4, b5, (short) (b5 | 37), objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, maxKeyCode, offsetBefore, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                    try {
                        Object[] objArr9 = new Object[1];
                        c(new char[]{30635, 30355, 29151, 18403, 64551, 1939, 6235, 23298, 8031, 41648, 58509, 32306, 16438, 23018, 24720, 4426, 9484, 60089, 44437, 35049, 15457, 36558, 14328, 59884}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_delete_message).substring(1, 2).codePointAt(0) - 75, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        c(new char[]{10977, 52246, 30079, 51403, 62961, 64263, 2040, 28515, 64142, 10141, 44716, 9625, 40386, 9810, 4701, 7453, 11613, 5614}, 14 - ExpandableListView.getPackedPositionChild(0L), objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char maxKeyCode2 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 29944);
                            int scrollDefaultDelay = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                            byte[] bArr4 = $$a;
                            byte b6 = bArr4[91];
                            byte b7 = bArr4[7];
                            Object[] objArr11 = new Object[1];
                            a(b6, b7, (short) (b7 | 89), objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode2, scrollDefaultDelay, iIndexOf, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29945);
                            int i7 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                            int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte[] bArr5 = $$a;
                            byte b8 = bArr5[91];
                            Object[] objArr12 = new Object[1];
                            a(b8, (byte) (b8 - 4), bArr5[7], objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, i7, scrollBarSize, 986134021, false, (String) objArr12[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
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
        } else {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char cAxisFromString = (char) (29943 - MotionEvent.axisFromString(""));
                int iRgb = (-16775461) - Color.rgb(0, 0, 0);
                int i8 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
                byte[] bArr6 = $$a;
                byte b9 = bArr6[91];
                Object[] objArr13 = new Object[1];
                a(b9, (byte) (b9 - 4), bArr6[7], objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAxisFromString, iRgb, i8, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char size2 = (char) (View.MeasureSpec.getSize(0) + 29944);
                    int offsetAfter2 = 1755 - TextUtils.getOffsetAfter("", 0);
                    int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
                    byte[] bArr7 = $$a;
                    byte b10 = bArr7[91];
                    byte b11 = bArr7[7];
                    Object[] objArr14 = new Object[1];
                    a(b10, b11, (short) (b11 | 37), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size2, offsetAfter2, longPressTimeout2, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i9 = 1320524901 + ((~((~iIdentityHashCode2) | (-75502603))) * (-116)) + ((997041124 | iIdentityHashCode2) * 116) + (((~(iIdentityHashCode2 | 784438698)) | 288105028) * 116) + 690613547;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i11 ^ (i11 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                c(new char[]{31206, 3323, 48901, 48722, 19883, 15620, 52894, 32091, 62419, 61585, 27825, 13967, 27542, 34594, 35177, 13863, 55075, 46240}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                c(new char[]{40712, 10062, 3695, 31597, 64337, 38367, 41338, 2384, 34229, 3791, 63263, 16640, 48699, 3090, 64799, 52138, 25533, 12726}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {1619806349};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 42050), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1727, (-16777187) - Color.rgb(0, 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), 690613547, false, true);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char absoluteGravity2 = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
                    int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 23;
                    byte[] bArr8 = $$a;
                    byte b12 = bArr8[91];
                    byte b13 = bArr8[7];
                    Object[] objArr19 = new Object[1];
                    a(b12, b13, (short) (b13 | 37), objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity2, maxKeyCode3, offsetBefore2, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                Object[] objArr20 = new Object[1];
                c(new char[]{30635, 30355, 29151, 18403, 64551, 1939, 6235, 23298, 8031, 41648, 58509, 32306, 16438, 23018, 24720, 4426, 9484, 60089, 44437, 35049, 15457, 36558, 14328, 59884}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_delete_message).substring(1, 2).codePointAt(0) - 75, objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                c(new char[]{10977, 52246, 30079, 51403, 62961, 64263, 2040, 28515, 64142, 10141, 44716, 9625, 40386, 9810, 4701, 7453, 11613, 5614}, 14 - ExpandableListView.getPackedPositionChild(0L), objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maxKeyCode4 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 29944);
                    int scrollDefaultDelay2 = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                    byte[] bArr9 = $$a;
                    byte b14 = bArr9[91];
                    byte b15 = bArr9[7];
                    Object[] objArr111 = new Object[1];
                    a(b14, b15, (short) (b15 | 89), objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode4, scrollDefaultDelay2, iIndexOf2, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29945);
                    int i12 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                    int scrollBarSize2 = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte[] bArr10 = $$a;
                    byte b16 = bArr10[91];
                    Object[] objArr112 = new Object[1];
                    a(b16, (byte) (b16 - 4), bArr10[7], objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf2, i12, scrollBarSize2, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i14 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i14 == i13) {
            int i15 = g + 109;
            asBinder = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr21 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i18 = i17 + 1203717843 + (((~iIdentityHashCode3) | 281023106) * 1324) + (((~(iIdentityHashCode3 | (-222096729))) | (~(434699154 | iIdentityHashCode3))) * (-1324)) + 596446990;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[3])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i21 = g + 25;
                    asBinder = i21 % 128;
                    int i22 = i21 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i23 = i14 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr22 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i25 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i26 = ~i25;
            int i27 = i24 + ((((~(399863406 | i26)) | (~((-68419595) | i25))) * 988) - 1510273643) + (((~(i25 | 118841386)) | 281022020 | (~(i26 | (-68419595)))) * 988);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr22[3])[0] = i29 ^ (i29 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int iResolveSize = 1031 - View.resolveSize(0, 0);
            int iIndexOf3 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte[] bArr11 = $$a;
            byte b17 = bArr11[91];
            byte b18 = bArr11[7];
            Object[] objArr23 = new Object[1];
            a(b17, b18, (short) (b18 | 141), objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(edgeSlop, iResolveSize, iIndexOf3, 1357589585, false, (String) objArr23[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr24 = new Object[1];
        c(new char[]{30635, 30355, 29151, 18403, 64551, 1939, 6235, 23298, 8031, 41648, 58509, 32306, 16438, 23018, 24720, 4426, 9484, 60089, 44437, 35049, 15457, 36558, 14328, 59884}, 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr24);
        Class<?> cls5 = Class.forName((String) objArr24[0]);
        Object[] objArr25 = new Object[1];
        c(new char[]{10977, 52246, 30079, 51403, 62961, 64263, 2040, 28515, 64142, 10141, 44716, 9625, 40386, 9810, 4701, 7453, 11613, 5614}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15, objArr25);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr25[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cAxisFromString2 = (char) (MotionEvent.axisFromString("") + 1);
            int mirror = 1079 - AndroidCharacter.getMirror('0');
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 15;
            byte[] bArr12 = $$a;
            byte b19 = bArr12[91];
            byte b20 = bArr12[7];
            Object[] objArr26 = new Object[1];
            a(b19, b20, (short) (b20 | 37), objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cAxisFromString2, mirror, iResolveOpacity, 1344079056, false, (String) objArr26[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cResolveSize = (char) View.resolveSize(0, 0);
                int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
                int gidForName = Process.getGidForName("") + 16;
                int i30 = $$b;
                Object[] objArr27 = new Object[1];
                a((byte) (i30 & 7), (byte) 52, (short) (i30 & 995), objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cResolveSize, trimmedLength, gidForName, 632103528, false, (String) objArr27[0], null);
            }
            Object[] objArr28 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr28[3])[0];
            int i32 = ((int[]) objArr28[1])[0];
            String[] strArr2 = (String[]) objArr28[0];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i33 = ~iIdentityHashCode4;
            int i34 = (((413783828 + ((~(465817391 | i33)) * 979)) + ((iIdentityHashCode4 | 710097561) * (-979))) + (((~(iIdentityHashCode4 | 465817391)) | (~(i33 | 710097561))) * 979)) - 2142666888;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr[2])[0] = i36 ^ (i36 << 5);
        } else {
            Object[] objArr29 = new Object[1];
            c(new char[]{31206, 3323, 48901, 48722, 19883, 15620, 52894, 32091, 62419, 61585, 27825, 13967, 27542, 34594, 35177, 13863, 55075, 46240}, 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr29);
            Class<?> cls6 = Class.forName((String) objArr29[0]);
            Object[] objArr30 = new Object[1];
            c(new char[]{40712, 10062, 3695, 31597, 64337, 38367, 41338, 2384, 34229, 3791, 63263, 16640, 48699, 3090, 64799, 52138, 25533, 12726}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr30);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr30[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr31 = {1619806349};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 46038), 1133 - TextUtils.lastIndexOf("", '0'), ExpandableListView.getPackedPositionChild(0L) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr32 = {Integer.valueOf(iIntValue3), 0, -2142666888, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr31), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char gidForName2 = (char) ((-1) - Process.getGidForName(""));
                int i37 = 1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int touchSlop = 15 - (ViewConfiguration.getTouchSlop() >> 8);
                byte[] bArr13 = $$a;
                byte b21 = bArr13[91];
                byte b22 = bArr13[7];
                Object[] objArr33 = new Object[1];
                a(b21, b22, (short) (b22 | 141), objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(gidForName2, i37, touchSlop, 1298546779, false, (String) objArr33[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (Process.myPid() >> 22)), (ViewConfiguration.getScrollBarSize() >> 8) + 1117, Drawable.resolveOpacity(0, 0) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr32);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cRed = (char) Color.red(0);
                int packedPositionType = 1031 - ExpandableListView.getPackedPositionType(0L);
                int packedPositionType2 = 15 - ExpandableListView.getPackedPositionType(0L);
                int i38 = $$b;
                Object[] objArr34 = new Object[1];
                a((byte) (i38 & 7), (byte) 52, (short) (i38 & 995), objArr34);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRed, packedPositionType, packedPositionType2, 632103528, false, (String) objArr34[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr35 = new Object[1];
                c(new char[]{30635, 30355, 29151, 18403, 64551, 1939, 6235, 23298, 8031, 41648, 58509, 32306, 16438, 23018, 24720, 4426, 9484, 60089, 44437, 35049, 15457, 36558, 14328, 59884}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 94, objArr35);
                Class<?> cls7 = Class.forName((String) objArr35[0]);
                Object[] objArr36 = new Object[1];
                c(new char[]{10977, 52246, 30079, 51403, 62961, 64263, 2040, 28515, 64142, 10141, 44716, 9625, 40386, 9810, 4701, 7453, 11613, 5614}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step2).substring(28, 29).length() + 14, objArr36);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr36[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1031;
                    int fadingEdgeLength2 = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr14 = $$a;
                    byte b23 = bArr14[91];
                    byte b24 = bArr14[7];
                    Object[] objArr37 = new Object[1];
                    a(b23, b24, (short) (b24 | 37), objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(fadingEdgeLength, iCombineMeasuredStates, fadingEdgeLength2, 1344079056, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    int iRgb2 = Color.rgb(0, 0, 0) + 16778247;
                    int offsetAfter3 = 15 - TextUtils.getOffsetAfter("", 0);
                    byte[] bArr15 = $$a;
                    byte b25 = bArr15[91];
                    byte b26 = bArr15[7];
                    Object[] objArr38 = new Object[1];
                    a(b25, b26, (short) (b26 | 141), objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(deadChar, iRgb2, offsetAfter3, 1357589585, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i39 = ((int[]) objArr[1])[0];
        int i40 = ((int[]) objArr[3])[0];
        if (i40 == i39) {
            Object[] objArr39 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i41 = ((int[]) objArr[2])[0];
            int i42 = ((int[]) objArr[3])[0];
            int i43 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i44 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i45 = i41 + 1739565539 + (((~i44) | 253758578) * 1324) + (((~(i44 | (-10215690))) | (~(254495859 | i44))) * (-1324)) + 1830773742;
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr39[2])[0] = i47 ^ (i47 << 5);
            int i48 = asBinder + 3;
            g = i48 % 128;
            if (i48 % 2 != 0) {
                throw null;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i49 = 0;
            while (i49 < strArr4.length) {
                int i50 = g + 123;
                asBinder = i50 % 128;
                int i51 = i50 % 2;
                arrayList2.add(strArr4[i49]);
                i49++;
                int i52 = asBinder + 31;
                g = i52 % 128;
                int i53 = i52 % 2;
            }
        }
        Toast.makeText((Context) null, i40 / (((i40 - 1) * i40) % 2), 0).show();
        Object[] objArr40 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i54 = ((int[]) objArr[2])[0];
        int i55 = ((int[]) objArr[3])[0];
        int i56 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i57 = ~System.identityHashCode(this);
        int i58 = i54 + 644797189 + (((~((-303081507) | i57)) | 547361676) * (-828)) + ((i57 | (-303081507)) * (-828)) + 1843383800;
        int i59 = (i58 << 13) ^ i58;
        int i60 = i59 ^ (i59 >>> 17);
        ((int[]) objArr40[2])[0] = i60 ^ (i60 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:196:0x1399  */
    /* JADX WARN: Code duplicated, block: B:197:0x13a5  */
    @Override // android.app.Service
    public void onCreate() throws Throwable {
        Object[] objArr;
        String str;
        String str2;
        Object[] objArr2;
        Object[] objArr3;
        int i;
        String str3;
        String str4;
        Object[] objArr4;
        String str5;
        Object[] objArr5;
        int i2;
        String str6;
        Object[] objArr6;
        int i3;
        Object[] objArr7;
        String str7;
        int i4;
        Object[] objArr8;
        int i5;
        Object[] objArr9;
        int i6;
        Object[] objArr10;
        String str8;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        int i7 = 2 % 2;
        Object[] objArr11 = new Object[1];
        c(new char[]{30635, 30355, 29151, 18403, 64551, 1939, 6235, 23298, 8031, 41648, 58509, 32306, 16438, 23018, 24720, 4426, 9484, 60089, 44437, 35049, 15457, 36558, 14328, 59884}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_general_network_error_timeout).substring(0, 37).codePointAt(20) - 83, objArr11);
        String str9 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        c(new char[]{10977, 52246, 30079, 51403, 62961, 64263, 2040, 28515, 64142, 10141, 44716, 9625, 40386, 9810, 4701, 7453, 11613, 5614}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr12);
        String str10 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        c(new char[]{31206, 3323, 48901, 48722, 19883, 15620, 52894, 32091, 62419, 61585, 27825, 13967, 27542, 34594, 35177, 13863, 55075, 46240}, 16 - Color.blue(0), objArr13);
        String str11 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        c(new char[]{40712, 10062, 3695, 31597, 64337, 38367, 41338, 2384, 34229, 3791, 63263, 16640, 48699, 3090, 64799, 52138, 25533, 12726}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_5).substring(6, 7).codePointAt(0) - 81, objArr14);
        String str12 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        c(new char[]{43466, 19920, 265, 23383, 42761, 26941, 19936, 58339, 59576, 36356, 52968, 11882, 25384, 39071, 58589, 22336, 37098, 46853, 53423, 30344, 55494, 45468, 3399, 52451, 48276, 26721, 28288, 19936}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 10, objArr15);
        String str13 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        c(new char[]{23619, 2144, 59961, 62994, 17716, 47953, 63471, 2297, 7414, 9315, 9221, 51593, 60883, 19006, 30837, 1799, 47263, 23127, 52763, 25634}, View.getDefaultSize(0, 0) + 18, objArr16);
        String str14 = (String) objArr16[0];
        int i8 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        if (i8 != (-22730376) + ((646408240 | (~(1494778631 | (~i9)))) * 446) + (((~(i9 | 2141186871)) | 18382848) * 446) + 535266208) {
            throw null;
        }
        int i10 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i10 != 1100061850 + (((~((~iIdentityHashCode) | 219936829)) | 1918894784) * 529) + (((~(iIdentityHashCode | 219936829)) | 1935848160) * 529)) {
            int i11 = 753866172 % 2;
            throw new ArithmeticException();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 10;
            Object[] objArr17 = new Object[1];
            a($$a[88], (byte) 42, (short) ($$b & 995), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, scrollBarSize, iIndexOf, -1199417970, false, (String) objArr17[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        long jLongValue = ((Long) Class.forName(str9).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int maximumFlingVelocity = 876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iMakeMeasureSpec = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
            Object[] objArr18 = new Object[1];
            a($$a[14], (byte) 52, (short) 203, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, maximumFlingVelocity, iMakeMeasureSpec, 254769921, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                int windowTouchSlop = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iIndexOf2 = 9 - TextUtils.indexOf((CharSequence) "", '0');
                byte[] bArr = $$a;
                Object[] objArr19 = new Object[1];
                a(bArr[88], bArr[81], (short) 203, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, windowTouchSlop, iIndexOf2, 1324201839, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr20[0])[0]}, new int[1], new int[]{((int[]) objArr20[2])[0]}, (String[]) objArr20[3]};
            int i12 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i13 = ((((~((-542638123) | i12)) | (-805255168)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1532535902) + ((~((~i12) | (-542638123))) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 2063689827;
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr[1])[0] = i15 ^ (i15 << 5);
            str10 = str10;
        } else {
            try {
                Object[] objArr21 = {Integer.valueOf(((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue()), 2063689827};
                byte[] bArr2 = $$d;
                short s = bArr2[56];
                byte b = bArr2[113];
                Object[] objArr22 = new Object[1];
                e(s, b, (byte) (b | 32), objArr22);
                Class<?> cls = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                e(bArr2[413], bArr2[9], bArr2[80], objArr23);
                Object[] objArr24 = (Object[]) cls.getMethod((String) objArr23[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr21);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iBlue = 876 - Color.blue(0);
                    int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 10;
                    byte[] bArr3 = $$a;
                    Object[] objArr25 = new Object[1];
                    a(bArr3[88], bArr3[81], (short) 203, objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration, iBlue, iIndexOf3, 1324201839, false, (String) objArr25[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr24);
                try {
                    long jLongValue2 = ((Long) Class.forName(str9).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iLastIndexOf = 875 - TextUtils.lastIndexOf("", '0');
                        int iMyTid = 10 - (Process.myTid() >> 22);
                        Object[] objArr26 = new Object[1];
                        a($$a[14], (byte) 52, (short) 203, objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollDefaultDelay, iLastIndexOf, iMyTid, 254769921, false, (String) objArr26[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 1);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 876;
                        int absoluteGravity2 = 10 - Gravity.getAbsoluteGravity(0, 0);
                        Object[] objArr27 = new Object[1];
                        a($$a[88], (byte) 42, (short) ($$b & 995), objArr27);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(gidForName, longPressTimeout, absoluteGravity2, -1199417970, false, (String) objArr27[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr24;
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
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[0])[0];
        if (i17 == i16) {
            int i18 = ((int[]) objArr[1])[0];
            Object[] objArr28 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i19 = i18 + (-981816544) + (((~((-502798413) | iFreeMemory)) | 73930760) * 345) + (((~((-502798413) | (~iFreeMemory))) | (-536418944)) * 345) + ((~(iFreeMemory | (-73930761))) * 345);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr28[1])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str15 : strArr) {
                    arrayList.add(str15);
                }
            }
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            int i22 = ((int[]) objArr[1])[0];
            Object[] objArr29 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i23 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i24 = i22 + (-1703544620) + (((~(526611413 | i23)) | 545818666) * 576) + (((~((~i23) | 1072430079)) | 21102976) * 576) + 858939008;
            int i25 = i24 ^ (i24 << 13);
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr29[1])[0] = i26 ^ (i26 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char mirror = (char) (31581 - AndroidCharacter.getMirror('0'));
            int edgeSlop = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
            int windowTouchSlop2 = 28 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int i27 = $$b;
            Object[] objArr30 = new Object[1];
            a((byte) (i27 & 7), (byte) 52, (short) (i27 & 995), objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mirror, edgeSlop, windowTouchSlop2, -1048449946, false, (String) objArr30[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
            int i28 = g + 31;
            asBinder = i28 % 128;
            int i29 = i28 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char keyRepeatTimeout = (char) (31533 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                int i30 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int modifierMetaStateMask = 27 - ((byte) KeyEvent.getModifierMetaStateMask());
                byte[] bArr4 = $$a;
                byte b2 = bArr4[91];
                Object[] objArr31 = new Object[1];
                a(b2, (byte) (b2 - 4), bArr4[7], objArr31);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatTimeout, i30, modifierMetaStateMask, -1142834547, false, (String) objArr31[0], null);
            }
            Object[] objArr32 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr32[1])[0]}, (Object[]) objArr32[2], new int[]{((int[]) objArr32[3])[0]}, (String[]) objArr32[4]};
            int iNextInt = new Random().nextInt();
            int i31 = ~(462838161 | iNextInt);
            int i32 = (-214690189) + ((1143055370 | i31) * (-814)) + ((i31 | (~((~iNextInt) | (-1311241483))) | 294652049) * 407) + (((~(iNextInt | 1311241482)) | (~((-462838162) | iNextInt)) | 294652049) * 407) + 161672317;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr2[0])[0] = i34 ^ (i34 << 5);
            str = str14;
            str2 = str10;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                baseContext = (Context) Class.forName(str13).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                str = str14;
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    str = str14;
                    baseContext = null;
                } else {
                    str = str14;
                    str = str14;
                    baseContext = baseContext.getApplicationContext();
                }
            }
            str = str14;
            str = str14;
            Object[] objArr33 = {baseContext, Integer.valueOf(((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue()), 0, 161672317};
            byte[] bArr5 = $$d;
            Object[] objArr34 = new Object[1];
            e((short) 83, bArr5[15], bArr5[408], objArr34);
            Class<?> cls2 = Class.forName((String) objArr34[0]);
            byte b3 = bArr5[9];
            Object[] objArr35 = new Object[1];
            e((short) 121, b3, (byte) (b3 | 52), objArr35);
            Object[] objArr36 = (Object[]) cls2.getMethod((String) objArr35[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr33);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char maximumFlingVelocity2 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31533);
                int pressedStateDuration2 = 921 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 28;
                byte[] bArr6 = $$a;
                byte b4 = bArr6[91];
                Object[] objArr37 = new Object[1];
                a(b4, (byte) (b4 - 4), bArr6[7], objArr37);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(maximumFlingVelocity2, pressedStateDuration2, offsetBefore, -1142834547, false, (String) objArr37[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArr36);
            try {
                str2 = str10;
                long jLongValue3 = ((Long) Class.forName(str9).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31534);
                    int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 921;
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 28;
                    byte[] bArr7 = $$a;
                    byte b5 = bArr7[91];
                    byte b6 = bArr7[7];
                    Object[] objArr38 = new Object[1];
                    a(b5, b6, (short) (b6 | 37), objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, absoluteGravity3, iKeyCodeFromString, -778300370, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                    int iIndexOf4 = 920 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int i35 = 28 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i36 = $$b;
                    Object[] objArr39 = new Object[1];
                    a((byte) (i36 & 7), (byte) 52, (short) (i36 & 995), objArr39);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c2, iIndexOf4, i35, -1048449946, false, (String) objArr39[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                objArr2 = objArr36;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i37 = ((int[]) objArr2[1])[0];
        int i38 = ((int[]) objArr2[3])[0];
        if (i38 != i37) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr2 = (String[]) objArr2[4];
            if (strArr2 != null) {
                for (String str16 : strArr2) {
                    arrayList2.add(str16);
                }
            }
            throw new RuntimeException(String.valueOf(i38));
        }
        int i39 = ((int[]) objArr2[0])[0];
        Object[] objArr40 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{((int[]) objArr2[3])[0]}, (String[]) objArr2[4]};
        int i40 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        int i41 = ~i40;
        int i42 = i39 + 81443043 + (((~((-1765656114) | i41)) | 32800) * 168) + ((~((-32801) | i40)) * 168) + (((~(i40 | (-1765623314))) | (~(i41 | (-8423531))) | 8390730) * 168);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr40[0])[0] = i44 ^ (i44 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char packedPositionType = (char) (43042 - ExpandableListView.getPackedPositionType(0L));
            int iArgb = Color.argb(0, 0, 0, 0) + 3111;
            int i45 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte[] bArr8 = $$a;
            byte b7 = bArr8[91];
            byte b8 = bArr8[7];
            Object[] objArr41 = new Object[1];
            a(b7, b8, (short) (b8 | 141), objArr41);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(packedPositionType, iArgb, i45, -1272852037, false, (String) objArr41[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char scrollDefaultDelay2 = (char) (43042 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int modifierMetaStateMask2 = 3110 - ((byte) KeyEvent.getModifierMetaStateMask());
                int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 23;
                byte[] bArr9 = $$a;
                byte b9 = bArr9[91];
                Object[] objArr42 = new Object[1];
                a(b9, (byte) (b9 - 4), bArr9[7], objArr42);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollDefaultDelay2, modifierMetaStateMask2, modifierMetaStateMask3, 154975793, false, (String) objArr42[0], null);
            }
            Object[] objArr43 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).get(null);
            int i46 = ((int[]) objArr43[2])[0];
            int i47 = ((int[]) objArr43[1])[0];
            String[] strArr3 = (String[]) objArr43[3];
            int[] iArr = {i47};
            int i48 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i49 = (-541248434) + (((-404365825) | i48) * 494) + (((~(i48 | 658885853)) | (-421471897)) * 494) + 1892242136;
            int i50 = (i49 << 13) ^ i49;
            int i51 = i50 ^ (i50 >>> 17);
            ((int[]) objArr3[0])[0] = i51 ^ (i51 << 5);
            objArr3 = new Object[]{new int[1], iArr, new int[]{i46}, strArr3};
        } else {
            Object[] objArr44 = {null, Integer.valueOf(((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue()), 0, 1892242136};
            byte[] bArr10 = $$d;
            Object[] objArr45 = new Object[1];
            e((short) 173, bArr10[113], (byte) (-bArr10[1]), objArr45);
            Class<?> cls3 = Class.forName((String) objArr45[0]);
            Object[] objArr46 = new Object[1];
            e(bArr10[413], bArr10[9], bArr10[80], objArr46);
            Object[] objArr47 = (Object[]) cls3.getMethod((String) objArr46[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr44);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char offsetAfter = (char) (43042 - TextUtils.getOffsetAfter("", 0));
                int iMyTid2 = 3111 - (Process.myTid() >> 22);
                int i52 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21;
                byte[] bArr11 = $$a;
                byte b10 = bArr11[91];
                Object[] objArr48 = new Object[1];
                a(b10, (byte) (b10 - 4), bArr11[7], objArr48);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(offsetAfter, iMyTid2, i52, 154975793, false, (String) objArr48[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, objArr47);
            try {
                str2 = str2;
                long jLongValue4 = ((Long) Class.forName(str9).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char packedPositionGroup = (char) (43042 - ExpandableListView.getPackedPositionGroup(0L));
                    int i53 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3111;
                    int iIndexOf5 = TextUtils.indexOf("", "", 0, 0) + 22;
                    byte[] bArr12 = $$a;
                    byte b11 = bArr12[91];
                    byte b12 = bArr12[7];
                    Object[] objArr49 = new Object[1];
                    a(b11, b12, (short) (b12 | 37), objArr49);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(packedPositionGroup, i53, iIndexOf5, -1269618118, false, (String) objArr49[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43041);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 3111;
                    int iArgb2 = Color.argb(0, 0, 0, 0) + 22;
                    byte[] bArr13 = $$a;
                    byte b13 = bArr13[91];
                    byte b14 = bArr13[7];
                    Object[] objArr50 = new Object[1];
                    a(b13, b14, (short) (b14 | 141), objArr50);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(c3, iMakeMeasureSpec2, iArgb2, -1272852037, false, (String) objArr50[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf6);
                objArr3 = objArr47;
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        int i54 = ((int[]) objArr3[1])[0];
        int i55 = ((int[]) objArr3[2])[0];
        if (i55 == i54) {
            int i56 = ((int[]) objArr3[0])[0];
            int i57 = ((int[]) objArr3[2])[0];
            int i58 = ((int[]) objArr3[1])[0];
            String[] strArr4 = (String[]) objArr3[3];
            int[] iArr2 = {i58};
            int i59 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1714307697;
            int i60 = ~i59;
            int i61 = i56 + 1775596998 + (((~(i60 | 1136855631)) | 568175827) * (-1042)) + ((1136855631 | i59) * 521) + (((~(i59 | (-568175828))) | 29427779 | (~(i60 | 1675603679))) * 521);
            int i62 = (i61 << 13) ^ i61;
            int i63 = i62 ^ (i62 >>> 17);
            ((int[]) objArr[0])[0] = i63 ^ (i63 << 5);
            Object[] objArr51 = {new int[1], iArr2, new int[]{i57}, strArr4};
            i = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr5 = (String[]) objArr3[3];
            if (strArr5 != null) {
                for (String str17 : strArr5) {
                    arrayList3.add(str17);
                }
            }
            int[] iArr3 = new int[i55];
            int i64 = i55 - 1;
            iArr3[i64] = 1;
            Toast.makeText((Context) null, iArr3[((i55 * i64) % 2) - 1], 1).show();
            int i65 = ((int[]) objArr3[0])[0];
            int i66 = ((int[]) objArr3[2])[0];
            int i67 = ((int[]) objArr3[1])[0];
            String[] strArr6 = (String[]) objArr3[3];
            int[] iArr4 = {i66};
            int[] iArr5 = {i67};
            int i68 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i69 = ~i68;
            int i70 = i65 + (-1964675432) + ((i68 | 900379314) * (-859)) + (((~(i68 | (-631373873))) | (~(900379314 | i69))) * 859) + (((~((-804652145) | i69)) | 173278272) * 859);
            int i71 = (i70 << 13) ^ i70;
            int i72 = i71 ^ (i71 >>> 17);
            i = 0;
            ((int[]) objArr[0])[0] = i72 ^ (i72 << 5);
            Object[] objArr52 = {new int[1], iArr5, iArr4, strArr6};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(i, i);
            int offsetAfter2 = TextUtils.getOffsetAfter("", i) + 2267;
            int defaultSize = View.getDefaultSize(i, i) + 33;
            byte[] bArr14 = $$a;
            byte b15 = bArr14[91];
            byte b16 = bArr14[7];
            Object[] objArr53 = new Object[1];
            a(b15, b16, (short) (b16 | 37), objArr53);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cResolveOpacity, offsetAfter2, defaultSize, -887667012, false, (String) objArr53[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char c4 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i73 = 2268 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int i74 = 32 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte[] bArr15 = $$a;
                byte b17 = bArr15[91];
                Object[] objArr54 = new Object[1];
                a(b17, (byte) (b17 - 4), bArr15[7], objArr54);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c4, i73, i74, -654680577, false, (String) objArr54[0], null);
            }
            Object[] objArr55 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).get(null);
            objArr4 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i75 = ((int[]) objArr55[0])[0];
            int i76 = ((int[]) objArr55[3])[0];
            String[] strArr7 = (String[]) objArr55[1];
            int i77 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i78 = (((((~((-884411716) | i77)) | 75694147) * (-566)) + 701927557) + ((~(i77 | (-808717569))) * 566)) - 1843038137;
            int i79 = (i78 << 13) ^ i78;
            int i80 = i79 ^ (i79 >>> 17);
            ((int[]) objArr4[2])[0] = i80 ^ (i80 << 5);
            str9 = str9;
            str3 = str;
            str4 = str2;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                str3 = str;
                baseContext2 = (Context) Class.forName(str13).getMethod(str3, new Class[0]).invoke(null, null);
            } else {
                str3 = str;
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            Object[] objArr56 = {baseContext2, Integer.valueOf(((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue()), 0, -1843038137};
            int i81 = $$e;
            byte[] bArr16 = $$d;
            Object[] objArr57 = new Object[1];
            e((short) (i81 | 193), bArr16[113], (byte) (bArr16[103] - 1), objArr57);
            Class<?> cls4 = Class.forName((String) objArr57[0]);
            Object[] objArr58 = new Object[1];
            e((short) (i81 | 264), bArr16[17], bArr16[9], objArr58);
            Object[] objArr59 = (Object[]) cls4.getMethod((String) objArr58[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr56);
            if (baseContext2 != null) {
                int i82 = asBinder + 63;
                g = i82 % 128;
                int i83 = i82 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int packedPositionChild = 2266 - ExpandableListView.getPackedPositionChild(0L);
                    int iIndexOf6 = 33 - TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr17 = $$a;
                    byte b18 = bArr17[91];
                    Object[] objArr60 = new Object[1];
                    a(b18, (byte) (b18 - 4), bArr17[7], objArr60);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(minimumFlingVelocity, packedPositionChild, iIndexOf6, -654680577, false, (String) objArr60[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, objArr59);
                try {
                    str4 = str2;
                    long jLongValue5 = ((Long) Class.forName(str9).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue5);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int gidForName2 = Process.getGidForName("") + 2268;
                        int iIndexOf7 = 33 - TextUtils.indexOf("", "", 0);
                        byte[] bArr18 = $$a;
                        byte b19 = bArr18[91];
                        byte b20 = bArr18[7];
                        Object[] objArr61 = new Object[1];
                        a(b19, b20, (short) (b20 | 141), objArr61);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cMyPid, gidForName2, iIndexOf7, -874156483, false, (String) objArr61[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                        char scrollDefaultDelay3 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int edgeSlop2 = 2267 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 33;
                        byte[] bArr19 = $$a;
                        byte b21 = bArr19[91];
                        byte b22 = bArr19[7];
                        Object[] objArr62 = new Object[1];
                        a(b21, b22, (short) (b22 | 37), objArr62);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(scrollDefaultDelay3, edgeSlop2, iCombineMeasuredStates, -887667012, false, (String) objArr62[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf8);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } else {
                str9 = str9;
                objArr59 = objArr59;
                str4 = str2;
            }
            objArr4 = objArr59;
        }
        int i84 = ((int[]) objArr4[3])[0];
        int i85 = ((int[]) objArr4[0])[0];
        if (i85 == i84) {
            Object[] objArr63 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i86 = ((int[]) objArr4[2])[0];
            int i87 = ((int[]) objArr4[0])[0];
            int i88 = ((int[]) objArr4[3])[0];
            String[] strArr8 = (String[]) objArr4[1];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i89 = ~iElapsedRealtime;
            int i90 = i86 + (-1296145017) + (((~((-17301673) | i89)) | (~((-35729922) | iElapsedRealtime)) | (~((-738380051) | iElapsedRealtime))) * 765) + (((~((-53031594) | i89)) | android.R.drawable.stat_sys_vp_phone_call_on_hold) * 1530) + (((~(iElapsedRealtime | (-53031594))) | (~(i89 | (-738380051)))) * 765);
            int i91 = (i90 << 13) ^ i90;
            int i92 = i91 ^ (i91 >>> 17);
            ((int[]) objArr63[2])[0] = i92 ^ (i92 << 5);
        } else {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr9 = (String[]) objArr4[1];
            if (strArr9 != null) {
                int i93 = g + 81;
                asBinder = i93 % 128;
                int i94 = i93 % 2;
                int i95 = 0;
                while (i95 < strArr9.length) {
                    arrayList4.add(strArr9[i95]);
                    i95++;
                    int i96 = g + 7;
                    asBinder = i96 % 128;
                    int i97 = i96 % 2;
                }
            }
            int[] iArr6 = new int[i85];
            int i98 = i85 - 1;
            iArr6[i98] = 1;
            Toast.makeText((Context) null, iArr6[((i85 * i98) % 2) - 1], 1).show();
            Object[] objArr64 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i99 = ((int[]) objArr4[2])[0];
            int i100 = ((int[]) objArr4[0])[0];
            int i101 = ((int[]) objArr4[3])[0];
            String[] strArr10 = (String[]) objArr4[1];
            int i102 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i103 = i99 + 629227781 + (((~((~i102) | (-109834842))) | (~(535821279 | i102))) * (-302)) + ((~((-109834842) | i102)) * (-604)) + (((~(i102 | 425986438)) | 153094402) * 302);
            int i104 = (i103 << 13) ^ i103;
            int i105 = i104 ^ (i104 >>> 17);
            ((int[]) objArr64[2])[0] = i105 ^ (i105 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
            char cMyPid2 = (char) (53893 - (Process.myPid() >> 22));
            int absoluteGravity4 = 1320 - Gravity.getAbsoluteGravity(0, 0);
            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 36;
            int i106 = $$b;
            Object[] objArr65 = new Object[1];
            a((byte) (i106 & 7), (byte) 52, (short) (i106 & 995), objArr65);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cMyPid2, absoluteGravity4, packedPositionType2, -1433084963, false, (String) objArr65[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char c5 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 53893);
                int i107 = 1321 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int scrollDefaultDelay4 = 36 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte[] bArr20 = $$a;
                byte b23 = bArr20[91];
                byte b24 = bArr20[7];
                Object[] objArr66 = new Object[1];
                a(b23, b24, (short) (b24 | 37), objArr66);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(c5, i107, scrollDefaultDelay4, -1920778747, false, (String) objArr66[0], null);
            }
            Object[] objArr67 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).get(null);
            objArr5 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i108 = ((int[]) objArr67[0])[0];
            int i109 = ((int[]) objArr67[3])[0];
            String[] strArr11 = (String[]) objArr67[2];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i110 = (((((~((-408057435) | iIdentityHashCode2)) | 22088) * (-566)) + 1383129632) + ((~(iIdentityHashCode2 | (-408035347))) * 566)) - 142125952;
            int i111 = (i110 << 13) ^ i110;
            int i112 = i111 ^ (i111 >>> 17);
            ((int[]) objArr5[1])[0] = i112 ^ (i112 << 5);
            str12 = str12;
            str5 = str4;
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                baseContext3 = (Context) Class.forName(str13).getMethod(str3, new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                if (baseContext3 instanceof ContextWrapper) {
                    int i113 = asBinder + 21;
                    g = i113 % 128;
                    if (i113 % 2 != 0) {
                        int i114 = 14 / 0;
                        if (((ContextWrapper) baseContext3).getBaseContext() != null) {
                            baseContext3 = baseContext3.getApplicationContext();
                        } else {
                            int i115 = g + 1;
                            asBinder = i115 % 128;
                            int i116 = i115 % 2;
                            baseContext3 = null;
                        }
                    } else if (((ContextWrapper) baseContext3).getBaseContext() != null) {
                        baseContext3 = baseContext3.getApplicationContext();
                    } else {
                        int i117 = g + 1;
                        asBinder = i117 % 128;
                        int i118 = i117 % 2;
                        baseContext3 = null;
                    }
                } else {
                    baseContext3 = baseContext3.getApplicationContext();
                }
            }
            int iIntValue = ((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr68 = {-1193326593};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 47976), TextUtils.indexOf((CharSequence) "", '0') + 1301, 20 - KeyEvent.normalizeMetaState(0), -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr69 = {baseContext3, "com.bpjstku", -142125952, Integer.valueOf(iIntValue), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).newInstance(objArr68), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                    char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 53893);
                    int longPressTimeout2 = 1320 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iArgb3 = 36 - Color.argb(0, 0, 0, 0);
                    byte[] bArr21 = $$a;
                    byte b25 = bArr21[91];
                    byte b26 = bArr21[7];
                    Object[] objArr70 = new Object[1];
                    a(b25, b26, (short) (b26 | 37), objArr70);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(scrollBarFadeDuration, longPressTimeout2, iArgb3, 819724799, false, (String) objArr70[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - TextUtils.getOffsetBefore("", 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 1394, 75 - Gravity.getAbsoluteGravity(0, 0)), Boolean.TYPE});
                }
                Object[] objArr71 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).invoke(null, objArr69);
                if (baseContext3 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                        char cGreen = (char) (Color.green(0) + 53893);
                        int scrollDefaultDelay5 = 1320 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int size = 36 - View.MeasureSpec.getSize(0);
                        byte[] bArr22 = $$a;
                        byte b27 = bArr22[91];
                        byte b28 = bArr22[7];
                        Object[] objArr72 = new Object[1];
                        a(b27, b28, (short) (b28 | 37), objArr72);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cGreen, scrollDefaultDelay5, size, -1920778747, false, (String) objArr72[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, objArr71);
                    try {
                        str5 = str4;
                        long jLongValue6 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf9 = Long.valueOf(jLongValue6);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                            char c6 = (char) (53894 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            int iBlue2 = 1320 - Color.blue(0);
                            int mirror2 = 'T' - AndroidCharacter.getMirror('0');
                            byte[] bArr23 = $$a;
                            byte b29 = bArr23[91];
                            Object[] objArr73 = new Object[1];
                            a(b29, (byte) (b29 - 4), bArr23[7], objArr73);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c6, iBlue2, mirror2, -1273706634, false, (String) objArr73[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, lValueOf9);
                        Long lValueOf10 = Long.valueOf(jLongValue6 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                            char offsetAfter3 = (char) (TextUtils.getOffsetAfter("", 0) + 53893);
                            int i119 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1319;
                            int iMyTid3 = 36 - (Process.myTid() >> 22);
                            int i120 = $$b;
                            Object[] objArr74 = new Object[1];
                            a((byte) (i120 & 7), (byte) 52, (short) (i120 & 995), objArr74);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(offsetAfter3, i119, iMyTid3, -1433084963, false, (String) objArr74[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, lValueOf10);
                    } catch (Exception unused5) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr71 = objArr71;
                    str12 = str12;
                    str5 = str4;
                }
                objArr5 = objArr71;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i121 = ((int[]) objArr5[3])[0];
        int i122 = ((int[]) objArr5[0])[0];
        if (i122 == i121) {
            Object[] objArr75 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i123 = ((int[]) objArr5[1])[0];
            int i124 = ((int[]) objArr5[0])[0];
            int i125 = ((int[]) objArr5[3])[0];
            String[] strArr12 = (String[]) objArr5[2];
            int i126 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i127 = i123 + (((~(i126 | 915716405)) | 454911419) * 56) + 1565187184 + (((~((~i126) | 454911419)) | 915716405) * 56);
            int i128 = (i127 << 13) ^ i127;
            int i129 = i128 ^ (i128 >>> 17);
            i2 = 0;
            ((int[]) objArr75[1])[0] = i129 ^ (i129 << 5);
        } else {
            Toast.makeText((Context) null, i122 / (((i122 - 1) * i122) % 2), 0).show();
            Object[] objArr76 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i130 = ((int[]) objArr5[1])[0];
            int i131 = ((int[]) objArr5[0])[0];
            int i132 = ((int[]) objArr5[3])[0];
            String[] strArr13 = (String[]) objArr5[2];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i133 = ~(305203755 | iIdentityHashCode3);
            int i134 = i130 + 1878773609 + ((763368644 | i133) * (-814)) + ((i133 | (~((~iIdentityHashCode3) | (-1065424070))) | 3148330) * 407) + (((~(iIdentityHashCode3 | 1065424069)) | (~((-305203756) | iIdentityHashCode3)) | 3148330) * 407);
            int i135 = i134 ^ (i134 << 13);
            int i136 = i135 ^ (i135 >>> 17);
            i2 = 0;
            ((int[]) objArr76[1])[0] = i136 ^ (i136 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
            char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int iArgb4 = Color.argb(i2, i2, i2, i2) + 876;
            int i137 = 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i138 = $$b;
            Object[] objArr77 = new Object[1];
            a((byte) (i138 & 7), (byte) 52, (short) (i138 & 995), objArr77);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(scrollBarFadeDuration2, iArgb4, i137, 252381699, false, (String) objArr77[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
            char longPressTimeout3 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int iCombineMeasuredStates2 = 876 - View.combineMeasuredStates(0, 0);
            int mirror3 = AndroidCharacter.getMirror('0') - '&';
            byte[] bArr24 = $$a;
            byte b30 = bArr24[91];
            byte b31 = bArr24[7];
            Object[] objArr78 = new Object[1];
            a(b30, b31, (short) (b31 | 89), objArr78);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(longPressTimeout3, iCombineMeasuredStates2, mirror3, 2009631821, false, (String) objArr78[0], null);
        }
        if (j2 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                char modifierMetaStateMask4 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 876;
                int scrollBarSize2 = 10 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte b32 = $$a[7];
                Object[] objArr79 = new Object[1];
                a(b32, (byte) (b32 | 52), (short) 210, objArr79);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(modifierMetaStateMask4, iNormalizeMetaState, scrollBarSize2, 256017550, false, (String) objArr79[0], null);
            }
            Object[] objArr80 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr80[0])[0]}, new int[1], new int[]{((int[]) objArr80[2])[0]}, (String[]) objArr80[3]};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i139 = 1153572500 + (((~((-201353189) | iIdentityHashCode4)) | 67118560 | (~(161042959 | iIdentityHashCode4))) * (-880));
            int i140 = (~((-201353189) | (~iIdentityHashCode4))) | (-161042960);
            int i141 = ~(iIdentityHashCode4 | 201353188);
            int i142 = ((i139 + ((i140 | i141) * (-880))) + (i141 * 880)) - 1417724740;
            int i143 = (i142 << 13) ^ i142;
            int i144 = i143 ^ (i143 >>> 17);
            ((int[]) objArr6[1])[0] = i144 ^ (i144 << 5);
            str6 = str12;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                baseContext4 = (Context) Class.forName(str13).getMethod(str3, new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
            }
            str6 = str12;
            Object[] objArr81 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str11).getMethod(str6, Object.class).invoke(null, this)).intValue()), -1417724740};
            short s2 = (short) ($$e | 264);
            byte[] bArr25 = $$d;
            Object[] objArr82 = new Object[1];
            e(s2, bArr25[113], bArr25[317], objArr82);
            Class<?> cls5 = Class.forName((String) objArr82[0]);
            byte b33 = bArr25[9];
            Object[] objArr83 = new Object[1];
            e((short) 121, b33, (byte) (b33 | 52), objArr83);
            Object[] objArr84 = (Object[]) cls5.getMethod((String) objArr83[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr81);
            if (baseContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                    char scrollBarFadeDuration3 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i145 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                    byte b34 = $$a[7];
                    Object[] objArr85 = new Object[1];
                    a(b34, (byte) (b34 | 52), (short) 210, objArr85);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(scrollBarFadeDuration3, i145, jumpTapTimeout, 256017550, false, (String) objArr85[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, objArr84);
                try {
                    long jLongValue8 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                        char c7 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int trimmedLength = 876 - TextUtils.getTrimmedLength("");
                        int doubleTapTimeout = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte[] bArr26 = $$a;
                        byte b35 = bArr26[91];
                        byte b36 = bArr26[7];
                        Object[] objArr86 = new Object[1];
                        a(b35, b36, (short) (b36 | 89), objArr86);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c7, trimmedLength, doubleTapTimeout, 2009631821, false, (String) objArr86[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                        char scrollDefaultDelay6 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iRed = 876 - Color.red(0);
                        int iRed2 = 10 - Color.red(0);
                        int i146 = $$b;
                        Object[] objArr87 = new Object[1];
                        a((byte) (i146 & 7), (byte) 52, (short) (i146 & 995), objArr87);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(scrollDefaultDelay6, iRed, iRed2, 252381699, false, (String) objArr87[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                objArr84 = objArr84;
            }
            objArr6 = objArr84;
        }
        int i147 = ((int[]) objArr6[2])[0];
        int i148 = ((int[]) objArr6[0])[0];
        if (i148 == i147) {
            int i149 = ((int[]) objArr6[1])[0];
            Object[] objArr88 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i150 = ~iUptimeMillis;
            int i151 = i149 + (-1535302460) + (((~(234046093 | i150)) | (~((-228655758) | iUptimeMillis))) * (-831)) + ((~(503012079 | iUptimeMillis)) * (-1662)) + (((~(iUptimeMillis | (-234046094))) | (~(i150 | (-274356323))) | (~(274356322 | iUptimeMillis))) * 831);
            int i152 = (i151 << 13) ^ i151;
            int i153 = i152 ^ (i152 >>> 17);
            i3 = 0;
            ((int[]) objArr88[1])[0] = i153 ^ (i153 << 5);
        } else {
            Toast.makeText((Context) null, i148 / (((i148 - 1) * i148) % 2), 0).show();
            int i154 = ((int[]) objArr6[1])[0];
            Object[] objArr89 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int i155 = (int) Runtime.getRuntime().totalMemory();
            int i156 = ~i155;
            int i157 = i154 + (-488181860) + (((~(821791928 | i156)) | (-862102158) | (~((-821791929) | i155))) * (-564)) + ((~(i155 | (-811761801))) * 1128) + (((~((-862102158) | i156)) | 10030128) * 564);
            int i158 = i157 ^ (i157 << 13);
            int i159 = i158 ^ (i158 >>> 17);
            i3 = 0;
            ((int[]) objArr89[1])[0] = i159 ^ (i159 << 5);
        }
        super.onCreate();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', i3));
            int i160 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 875;
            int iIndexOf8 = TextUtils.indexOf((CharSequence) "", '0', i3) + 11;
            byte[] bArr27 = $$a;
            byte b37 = bArr27[91];
            Object[] objArr90 = new Object[1];
            a(b37, (byte) (b37 - 4), bArr27[7], objArr90);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(cIndexOf, i160, iIndexOf8, -1650998592, false, (String) objArr90[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
            char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 877;
            int iMyTid4 = 10 - (Process.myTid() >> 22);
            byte[] bArr28 = $$a;
            byte b38 = bArr28[91];
            byte b39 = bArr28[7];
            Object[] objArr91 = new Object[1];
            a(b38, b39, (short) (b39 | 37), objArr91);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cIndexOf2, iLastIndexOf2, iMyTid4, 2012020043, false, (String) objArr91[0], null);
        }
        if (j3 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                int iIndexOf9 = TextUtils.indexOf("", "", 0, 0) + 876;
                int iRed3 = 10 - Color.red(0);
                byte[] bArr29 = $$a;
                byte b40 = bArr29[91];
                byte b41 = bArr29[7];
                Object[] objArr92 = new Object[1];
                a(b40, b41, (short) (b41 | 141), objArr92);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(bitsPerPixel, iIndexOf9, iRed3, 2012931276, false, (String) objArr92[0], null);
            }
            Object[] objArr93 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr93[0])[0]}, new int[1], new int[]{((int[]) objArr93[2])[0]}, (String[]) objArr93[3]};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i161 = ~iIdentityHashCode5;
            int i162 = ((2070192700 + (((~(302734322 | i161)) | (~((-343044552) | iIdentityHashCode5))) * (-370))) + ((((~(iIdentityHashCode5 | 302734322)) | (~(i161 | (-343044552)))) | 34146864) * (-370))) - 793388534;
            int i163 = (i162 << 13) ^ i162;
            int i164 = i163 ^ (i163 >>> 17);
            ((int[]) objArr7[1])[0] = i164 ^ (i164 << 5);
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str13).getMethod(str3, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
            }
            Object[] objArr94 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str11).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, -542826326};
            byte[] bArr30 = $$d;
            Object[] objArr95 = new Object[1];
            e((short) 367, bArr30[113], (byte) ($$e + 2), objArr95);
            Class<?> cls6 = Class.forName((String) objArr95[0]);
            short s3 = (short) TypedValues.CycleType.TYPE_WAVE_PERIOD;
            byte b42 = bArr30[9];
            Object[] objArr96 = new Object[1];
            e(s3, b42, (byte) (b42 | 52), objArr96);
            objArr7 = (Object[]) cls6.getMethod((String) objArr96[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr94);
            if (baseContext5 != null) {
                int i165 = asBinder + 19;
                g = i165 % 128;
                int i166 = i165 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                    char longPressTimeout4 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iMyPid = (Process.myPid() >> 22) + 876;
                    int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 10;
                    byte[] bArr31 = $$a;
                    byte b43 = bArr31[91];
                    byte b44 = bArr31[7];
                    Object[] objArr97 = new Object[1];
                    a(b43, b44, (short) (b44 | 141), objArr97);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(longPressTimeout4, iMyPid, packedPositionGroup2, 2012931276, false, (String) objArr97[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, objArr7);
                try {
                    long jLongValue10 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                        char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                        int i167 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                        int i168 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte[] bArr32 = $$a;
                        byte b45 = bArr32[91];
                        byte b46 = bArr32[7];
                        Object[] objArr98 = new Object[1];
                        a(b45, b46, (short) (b46 | 37), objArr98);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cIndexOf3, i167, i168, 2012020043, false, (String) objArr98[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue10 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iLastIndexOf3 = 875 - TextUtils.lastIndexOf("", '0', 0);
                        int i169 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
                        byte[] bArr33 = $$a;
                        byte b47 = bArr33[91];
                        Object[] objArr99 = new Object[1];
                        a(b47, (byte) (b47 - 4), bArr33[7], objArr99);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(fadingEdgeLength, iLastIndexOf3, i169, -1650998592, false, (String) objArr99[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf14);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            }
        }
        int i170 = ((int[]) objArr7[2])[0];
        int i171 = ((int[]) objArr7[0])[0];
        if (i171 == i170) {
            int i172 = ((int[]) objArr7[1])[0];
            Object[] objArr100 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            str7 = "currentApplication";
            int i173 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i174 = ~i173;
            int i175 = i172 + (-810060588) + ((i174 | 16530) * (-192)) + (((~(228343998 | i174)) | 268637697) * (-384)) + (((~(i173 | (-228327469))) | (~(i174 | 496981695)) | (~((-268637698) | i173))) * DerHeader.TAG_CLASS_PRIVATE);
            int i176 = i175 ^ (i175 << 13);
            int i177 = i176 ^ (i176 >>> 17);
            ((int[]) objArr100[1])[0] = i177 ^ (i177 << 5);
            i4 = 0;
        } else {
            str7 = r6;
            Toast.makeText((Context) null, i171 / (((i171 - 1) * i171) % 2), 0).show();
            int i178 = ((int[]) objArr7[1])[0];
            Object[] objArr101 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i179 = i178 + 1001096684 + (((~iIdentityHashCode6) | 261712469) * 1444) + (((~(iIdentityHashCode6 | (-651897539))) | (~(692207767 | iIdentityHashCode6)) | 110701120) * (-1444)) + 22157684;
            int i180 = i179 ^ (i179 << 13);
            int i181 = i180 ^ (i180 >>> 17);
            i4 = 0;
            ((int[]) objArr101[1])[0] = i181 ^ (i181 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
            char offsetAfter4 = (char) TextUtils.getOffsetAfter("", i4);
            int iMyPid2 = 651 - (Process.myPid() >> 22);
            int iResolveSize = View.resolveSize(i4, i4) + 44;
            byte[] bArr34 = $$a;
            byte b48 = bArr34[91];
            byte b49 = bArr34[7];
            Object[] objArr102 = new Object[1];
            a(b48, b49, (short) (b49 | 89), objArr102);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(offsetAfter4, iMyPid2, iResolveSize, -459846511, false, (String) objArr102[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int i182 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 650;
            int i183 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43;
            int i184 = $$b;
            Object[] objArr103 = new Object[1];
            a((byte) (i184 & 7), (byte) 52, (short) (i184 & 995), objArr103);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(tapTimeout, i182, i183, -873460649, false, (String) objArr103[0], null);
        }
        if (j4 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).getLong(null) << 52) >>> 52)) >> 12)) {
            int i185 = asBinder + 47;
            g = i185 % 128;
            int i186 = i185 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int bitsPerPixel2 = 650 - ImageFormat.getBitsPerPixel(0);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 44;
                byte[] bArr35 = $$a;
                byte b50 = bArr35[91];
                Object[] objArr104 = new Object[1];
                a(b50, (byte) (b50 - 4), bArr35[7], objArr104);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(maximumDrawingCacheSize, bitsPerPixel2, maxKeyCode, -1595579076, false, (String) objArr104[0], null);
            }
            Object[] objArr105 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).get(null);
            objArr8 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i187 = ((int[]) objArr105[2])[0];
            int i188 = ((int[]) objArr105[0])[0];
            int i189 = ~(((Context) Class.forName(r2).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_tablet_step1).substring(25, 35).length() - 141440676);
            int i190 = ((((-1304225011) + ((~((-4999275) | i189)) * 52)) + (((~(179480068 | i189)) | ((~(176049258 | i189)) | (-184479343))) * (-52))) + (((~(i189 | (-179480069))) | 171049984) * 52)) - 1418572894;
            int i191 = (i190 << 13) ^ i190;
            int i192 = i191 ^ (i191 >>> 17);
            ((int[]) objArr8[3])[0] = i192 ^ (i192 << 5);
            i5 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 1609 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 26 - (ViewConfiguration.getTouchSlop() >> 8), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr106 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).newInstance(null), -1418572894, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char cBlue = (char) Color.blue(0);
                int i193 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 650;
                int iMyPid3 = (Process.myPid() >> 22) + 44;
                int i194 = $$b;
                Object[] objArr107 = new Object[1];
                a((byte) (i194 & 7), (byte) 52, (short) (i194 & 995), objArr107);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cBlue, i193, iMyPid3, 2075921419, false, (String) objArr107[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 695 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 97), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 793, 83 - (ViewConfiguration.getScrollBarSize() >> 8)), Integer.TYPE, Integer.TYPE});
            }
            objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).invoke(null, objArr106);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
                int iResolveSize2 = 651 - View.resolveSize(0, 0);
                int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 44;
                byte[] bArr36 = $$a;
                byte b51 = bArr36[91];
                Object[] objArr108 = new Object[1];
                a(b51, (byte) (b51 - 4), bArr36[7], objArr108);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(offsetBefore2, iResolveSize2, fadingEdgeLength2, -1595579076, false, (String) objArr108[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, objArr8);
            try {
                long jLongValue12 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int mode = 651 - View.MeasureSpec.getMode(0);
                    int iResolveSize3 = View.resolveSize(0, 0) + 44;
                    int i195 = $$b;
                    Object[] objArr109 = new Object[1];
                    a((byte) (i195 & 7), (byte) 52, (short) (i195 & 995), objArr109);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cMakeMeasureSpec, mode, iResolveSize3, -873460649, false, (String) objArr109[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue12 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                    int i196 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 651;
                    int i197 = 45 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte[] bArr37 = $$a;
                    byte b52 = bArr37[91];
                    byte b53 = bArr37[7];
                    Object[] objArr110 = new Object[1];
                    a(b52, b53, (short) (b53 | 89), objArr110);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cLastIndexOf2, i196, i197, -459846511, false, (String) objArr110[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf16);
                i5 = 0;
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        int i198 = ((int[]) objArr8[i5])[i5];
        int i199 = ((int[]) objArr8[2])[i5];
        if (i199 == i198) {
            Object[] objArr111 = new Object[4];
            int[] iArr7 = new int[1];
            objArr111[i5] = iArr7;
            int[] iArr8 = new int[1];
            objArr111[2] = iArr8;
            objArr111[3] = new int[1];
            int i200 = ((int[]) objArr8[3])[i5];
            int i201 = ((int[]) objArr8[2])[i5];
            int i202 = ((int[]) objArr8[i5])[i5];
            iArr8[i5] = i201;
            iArr7[i5] = i202;
            objArr111[1] = new String[i5];
            int iNextInt2 = new Random().nextInt();
            int i203 = ~iNextInt2;
            int i204 = i200 + (-1866583853) + (((~(482832106 | i203)) | (-486534895)) * 98) + (((~(i203 | (-486262917))) | 482832106 | (~(486262916 | iNextInt2))) * (-49)) + (((~(iNextInt2 | 482832106)) | 271978) * 49);
            int i205 = (i204 << 13) ^ i204;
            int i206 = i205 ^ (i205 >>> 17);
            ((int[]) objArr111[3])[0] = i206 ^ (i206 << 5);
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr14 = (String[]) objArr8[1];
            if (strArr14 != null) {
                for (String str18 : strArr14) {
                    arrayList5.add(str18);
                }
            }
            Toast.makeText((Context) null, i199 / (((i199 - 1) * i199) % 2), 0).show();
            Object[] objArr112 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i207 = ((int[]) objArr8[3])[0];
            int i208 = ((int[]) objArr8[2])[0];
            int i209 = ((int[]) objArr8[0])[0];
            int i210 = ~System.identityHashCode(this);
            int i211 = i207 + ((((-627838047) + (((~(i210 | 176156351)) | (~((-170623014) | i210))) * (-184))) + (((4482074 | (~((-175105088) | i210))) | (~(171674277 | i210))) * 184)) - 193432760);
            int i212 = i211 ^ (i211 << 13);
            int i213 = i212 ^ (i212 >>> 17);
            ((int[]) objArr112[3])[0] = i213 ^ (i213 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
            char scrollBarFadeDuration4 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int packedPositionChild2 = 1030 - ExpandableListView.getPackedPositionChild(0L);
            int mirror4 = AndroidCharacter.getMirror('0') - '!';
            byte[] bArr38 = $$a;
            byte b54 = bArr38[91];
            byte b55 = bArr38[7];
            Object[] objArr113 = new Object[1];
            a(b54, b55, (short) (b55 | 141), objArr113);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(scrollBarFadeDuration4, packedPositionChild2, mirror4, 1357589585, false, (String) objArr113[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).getLong(null);
        long jLongValue13 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char c8 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int iResolveSize4 = 1031 - View.resolveSize(0, 0);
            int iMakeMeasureSpec3 = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr39 = $$a;
            byte b56 = bArr39[91];
            byte b57 = bArr39[7];
            Object[] objArr114 = new Object[1];
            a(b56, b57, (short) (b57 | 37), objArr114);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(c8, iResolveSize4, iMakeMeasureSpec3, 1344079056, false, (String) objArr114[0], null);
        }
        if (j5 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                char c9 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                int scrollBarSize3 = 1031 - (ViewConfiguration.getScrollBarSize() >> 8);
                int i214 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i215 = $$b;
                Object[] objArr115 = new Object[1];
                a((byte) (i215 & 7), (byte) 52, (short) (i215 & 995), objArr115);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(c9, scrollBarSize3, i214, 632103528, false, (String) objArr115[0], null);
            }
            Object[] objArr116 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
            objArr9 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i216 = ((int[]) objArr116[3])[0];
            int i217 = ((int[]) objArr116[1])[0];
            String[] strArr15 = (String[]) objArr116[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i218 = (((((~(389077003 | startElapsedRealtime)) | (-854629247)) * 262) - 829805915) + (((~((~startElapsedRealtime) | 389077003)) | (-854629247)) * 262)) - 228019554;
            int i219 = (i218 << 13) ^ i218;
            int i220 = i219 ^ (i219 >>> 17);
            ((int[]) objArr9[2])[0] = i220 ^ (i220 << 5);
        } else {
            int iIntValue2 = ((Integer) Class.forName(str11).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr117 = {-1277214688};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b((char) (46038 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1133, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr118 = {Integer.valueOf(iIntValue2), 0, -228019554, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).newInstance(objArr117), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char defaultSize2 = (char) View.getDefaultSize(0, 0);
                int iGreen = Color.green(0) + 1031;
                int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 16;
                byte[] bArr40 = $$a;
                byte b58 = bArr40[91];
                byte b59 = bArr40[7];
                Object[] objArr119 = new Object[1];
                a(b58, b59, (short) (b59 | 141), objArr119);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(defaultSize2, iGreen, packedPositionChild3, 1298546779, false, (String) objArr119[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - ((byte) KeyEvent.getModifierMetaStateMask())), Process.getGidForName("") + 1118, 16 - MotionEvent.axisFromString("")), Boolean.TYPE});
            }
            objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).invoke(null, objArr118);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                char offsetAfter5 = (char) TextUtils.getOffsetAfter("", 0);
                int i221 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1030;
                int i222 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14;
                int i223 = $$b;
                Object[] objArr120 = new Object[1];
                a((byte) (i223 & 7), (byte) 52, (short) (i223 & 995), objArr120);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(offsetAfter5, i221, i222, 632103528, false, (String) objArr120[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, objArr9);
            try {
                long jLongValue14 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf17 = Long.valueOf(jLongValue14);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char cRed = (char) Color.red(0);
                    int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                    int iAxisFromString = 14 - MotionEvent.axisFromString("");
                    byte[] bArr41 = $$a;
                    byte b60 = bArr41[91];
                    byte b61 = bArr41[7];
                    Object[] objArr121 = new Object[1];
                    a(b60, b61, (short) (b61 | 37), objArr121);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cRed, packedPositionGroup3, iAxisFromString, 1344079056, false, (String) objArr121[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf17);
                Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                    char bitsPerPixel3 = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                    int scrollBarFadeDuration5 = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int threadPriority = 15 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte[] bArr42 = $$a;
                    byte b62 = bArr42[91];
                    byte b63 = bArr42[7];
                    Object[] objArr122 = new Object[1];
                    a(b62, b63, (short) (b63 | 141), objArr122);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(bitsPerPixel3, scrollBarFadeDuration5, threadPriority, 1357589585, false, (String) objArr122[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf18);
            } catch (Exception unused9) {
                throw new RuntimeException();
            }
        }
        int i224 = ((int[]) objArr9[1])[0];
        int i225 = ((int[]) objArr9[3])[0];
        if (i225 == i224) {
            Object[] objArr123 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i226 = ((int[]) objArr9[2])[0];
            int i227 = ((int[]) objArr9[3])[0];
            int i228 = ((int[]) objArr9[1])[0];
            String[] strArr16 = (String[]) objArr9[0];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i229 = (~(70558017 | iIdentityHashCode7)) | 314576042;
            int i230 = ~iIdentityHashCode7;
            int i231 = i226 + (-2118306439) + ((i229 | (~((-70295873) | i230))) * 886) + (((~(i230 | (-70558018))) | 314838187) * (-1772)) + ((~(i230 | 314838187)) * 886);
            int i232 = (i231 << 13) ^ i231;
            int i233 = i232 ^ (i232 >>> 17);
            i6 = 0;
            ((int[]) objArr123[2])[0] = i233 ^ (i233 << 5);
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr17 = (String[]) objArr9[0];
            if (strArr17 != null) {
                for (String str19 : strArr17) {
                    arrayList6.add(str19);
                }
            }
            Toast.makeText((Context) null, i225 / (((i225 - 1) * i225) % 2), 0).show();
            Object[] objArr124 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i234 = ((int[]) objArr9[2])[0];
            int i235 = ((int[]) objArr9[3])[0];
            int i236 = ((int[]) objArr9[1])[0];
            String[] strArr18 = (String[]) objArr9[0];
            int i237 = ~((~Process.myUid()) | 657905196);
            int i238 = i234 + ((2507264 | i237) * (-374)) + 876306209 + ((i237 | 655397932) * 374);
            int i239 = (i238 << 13) ^ i238;
            int i240 = i239 ^ (i239 >>> 17);
            i6 = 0;
            ((int[]) objArr124[2])[0] = i240 ^ (i240 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char tapTimeout2 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 37567);
            int i241 = 625 - (CdmaCellLocation.convertQuartSecToDecDegrees(i6) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i6) == 0.0d ? 0 : -1));
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 14;
            int i242 = $$b;
            Object[] objArr125 = new Object[1];
            a((byte) (i242 & 7), (byte) 52, (short) (i242 & 995), objArr125);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(tapTimeout2, i241, touchSlop, -477065106, false, (String) objArr125[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null);
        long jLongValue15 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
            char c10 = (char) (37568 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int mirror5 = AndroidCharacter.getMirror('0') + 577;
            int iResolveOpacity = 14 - Drawable.resolveOpacity(0, 0);
            byte[] bArr43 = $$a;
            byte b64 = bArr43[91];
            byte b65 = bArr43[7];
            Object[] objArr126 = new Object[1];
            a(b64, b65, (short) (b65 | 141), objArr126);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(c10, mirror5, iResolveOpacity, -976899241, false, (String) objArr126[0], null);
        }
        if (j6 == ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char size2 = (char) (37567 - View.MeasureSpec.getSize(0));
                int scrollBarFadeDuration6 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 625;
                int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 14;
                byte[] bArr44 = $$a;
                byte b66 = bArr44[91];
                byte b67 = bArr44[7];
                Object[] objArr127 = new Object[1];
                a(b66, b67, (short) (b67 | 37), objArr127);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(size2, scrollBarFadeDuration6, maxKeyCode2, -973632554, false, (String) objArr127[0], null);
            }
            Object[] objArr128 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
            int i243 = ((int[]) objArr128[2])[0];
            int i244 = ((int[]) objArr128[0])[0];
            String[] strArr19 = (String[]) objArr128[3];
            int[] iArr9 = {i243};
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i245 = ~((-268706058) | iIdentityHashCode8);
            int i246 = ~iIdentityHashCode8;
            int i247 = ((2066916089 + ((i245 | (~((-1141506597) | i246))) * 497)) + (((~(iIdentityHashCode8 | (-1141506597))) | ((~((-413525468) | i246)) | 144819410)) * 497)) - 1040511871;
            int i248 = (i247 << 13) ^ i247;
            int i249 = i248 ^ (i248 >>> 17);
            ((int[]) objArr10[1])[0] = i249 ^ (i249 << 5);
            objArr10 = new Object[]{new int[]{i244}, new int[1], iArr9, strArr19};
        } else {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                int i250 = g + 77;
                asBinder = i250 % 128;
                int i251 = i250 % 2;
                baseContext6 = (Context) Class.forName(str13).getMethod(str8, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                if ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) {
                    str8 = str3;
                    baseContext6 = null;
                } else {
                    str8 = str3;
                    str8 = str3;
                    baseContext6 = baseContext6.getApplicationContext();
                }
            }
            str8 = str3;
            int iIntValue3 = ((Integer) Class.forName(str11).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr129 = new Object[1];
            c(new char[]{17523, 42098, 22997, 20029, 62431, 19827, 27979, 48637, 31820, 8625, 22048, 60520, 20648, 28283, 3248, 40751, 17764, 21524, 5853, 51641, 41355, 44376, 24050, 36226, 26034, 58623, 11831, 56767, 48217, 5406, 47149, 11013, 8059, 54612, 49942, 43895, 23287, 35228, 947, 4733, 5719, 40459, 14482, 28607, 39348, 38794, 15643, 33653, 55502, 41370, 45379, 31759, 11812, 21066, 59613, 56573, 34600, 47406, 1818, 222, 17214, 9957, 26413, 40003, 1790, 64963}, ((Context) Class.forName(r2).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 53, objArr129);
            String str20 = (String) objArr129[0];
            Object[] objArr130 = new Object[1];
            c(new char[]{8661, 16011, 39623, 40411, 52624, 30440, 52506, 12120, 23474, 21254, 26618, 7275, 65089, 25959, 5520, 57466, 45694, 62495, 5742, 2565, 16895, 7911, 36213, 21206, 29276, 62351, 14811, 23237, 27544, 62547, 57731, 23860, 48574, 23291, 45549, 11230, 65033, 28941, 57569, 30340, 39792, 48864, 40895, 46122, 18853, 37030, 38431, 63809, 40007, 10370, 613, 5929, 19712, 55289, 39828, 41918, 34713, 26533, 60213, 24833, 449, 46464, 15772, 28054, 31153, 34442}, ((Context) Class.forName(r2).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step3).substring(0, 3).codePointAt(1) + 18, objArr130);
            Object[] objArr131 = {baseContext6, new String[]{str20, (String) objArr130[0]}, Integer.valueOf(iIntValue3), 17, -1040511871};
            byte[] bArr45 = $$d;
            Object[] objArr132 = new Object[1];
            e((short) 475, (byte) (-bArr45[3]), bArr45[58], objArr132);
            Class<?> cls7 = Class.forName((String) objArr132[0]);
            byte b68 = bArr45[9];
            Object[] objArr133 = new Object[1];
            e((short) 492, b68, (byte) (b68 | 52), objArr133);
            objArr10 = (Object[]) cls7.getMethod((String) objArr133[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr131);
            int i252 = ((int[]) objArr10[0])[0];
            int i253 = ((int[]) objArr10[2])[0];
            if (baseContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                    char c11 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 37566);
                    int iArgb5 = 625 - Color.argb(0, 0, 0, 0);
                    int iLastIndexOf4 = 13 - TextUtils.lastIndexOf("", '0');
                    byte[] bArr46 = $$a;
                    byte b69 = bArr46[91];
                    byte b70 = bArr46[7];
                    Object[] objArr134 = new Object[1];
                    a(b69, b70, (short) (b70 | 37), objArr134);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(c11, iArgb5, iLastIndexOf4, -973632554, false, (String) objArr134[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr10);
                try {
                    long jLongValue16 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue16);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                        char mode2 = (char) (View.MeasureSpec.getMode(0) + 37567);
                        int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L) + 626;
                        int packedPositionType3 = 14 - ExpandableListView.getPackedPositionType(0L);
                        byte[] bArr47 = $$a;
                        byte b71 = bArr47[91];
                        byte b72 = bArr47[7];
                        Object[] objArr135 = new Object[1];
                        a(b71, b72, (short) (b72 | 141), objArr135);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(mode2, packedPositionChild4, packedPositionType3, -976899241, false, (String) objArr135[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 37568);
                        int packedPositionChild5 = ExpandableListView.getPackedPositionChild(0L) + 626;
                        int i254 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14;
                        int i255 = $$b;
                        Object[] objArr136 = new Object[1];
                        a((byte) (i255 & 7), (byte) 52, (short) (i255 & 995), objArr136);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(cAxisFromString, packedPositionChild5, i254, -477065106, false, (String) objArr136[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf20);
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            }
        }
        int i256 = ((int[]) objArr10[0])[0];
        int i257 = ((int[]) objArr10[2])[0];
        if (i257 == i256) {
            int i258 = asBinder + 31;
            g = i258 % 128;
            int i259 = i258 % 2;
            int i260 = ((int[]) objArr10[1])[0];
            int i261 = ((int[]) objArr10[2])[0];
            int i262 = ((int[]) objArr10[0])[0];
            String[] strArr20 = (String[]) objArr10[3];
            int[] iArr10 = {i261};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i263 = ~startUptimeMillis;
            int i264 = i260 + (-2007392400) + (((~((-861504161) | i263)) | 962233960) * (-90)) + (((~((-861504161) | startUptimeMillis)) | (-995854057)) * (-45)) + (((~(startUptimeMillis | (-962233961))) | (-861504161) | (~(i263 | 962233960))) * 45);
            int i265 = i264 ^ (i264 << 13);
            int i266 = i265 ^ (i265 >>> 17);
            ((int[]) objArr[1])[0] = i266 ^ (i266 << 5);
            Object[] objArr137 = {new int[]{i262}, new int[1], iArr10, strArr20};
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr21 = (String[]) objArr10[3];
            if (strArr21 != null) {
                for (String str21 : strArr21) {
                    arrayList7.add(str21);
                }
            }
            Toast.makeText((Context) null, i257 / (((i257 - 1) * i257) % 2), 0).show();
            int i267 = ((int[]) objArr10[1])[0];
            int i268 = ((int[]) objArr10[2])[0];
            int i269 = ((int[]) objArr10[0])[0];
            String[] strArr22 = (String[]) objArr10[3];
            int[] iArr11 = {i268};
            int i270 = ((Context) Class.forName(r2).getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i271 = ~i270;
            int i272 = i267 + 1773601728 + (((~(1722810087 | i271)) | 100928033) * 220) + (((~(i271 | 1722170019)) | 101568101) * (-440)) + ((i270 | 1722810087) * 220);
            int i273 = i272 ^ (i272 << 13);
            int i274 = i273 ^ (i273 >>> 17);
            ((int[]) objArr[1])[0] = i274 ^ (i274 << 5);
            Object[] objArr138 = {new int[]{i269}, new int[1], iArr11, strArr22};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char packedPositionChild6 = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
            int maximumFlingVelocity3 = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int i275 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            byte[] bArr48 = $$a;
            byte b73 = bArr48[91];
            Object[] objArr139 = new Object[1];
            a(b73, (byte) (b73 - 4), bArr48[7], objArr139);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(packedPositionChild6, maximumFlingVelocity3, i275, 986134021, false, (String) objArr139[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                char absoluteGravity5 = (char) (Gravity.getAbsoluteGravity(0, 0) + 29944);
                int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 1755;
                int trimmedLength2 = TextUtils.getTrimmedLength("") + 23;
                byte[] bArr49 = $$a;
                byte b74 = bArr49[91];
                byte b75 = bArr49[7];
                Object[] objArr140 = new Object[1];
                a(b74, b75, (short) (b75 | 37), objArr140);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(absoluteGravity5, threadPriority2, trimmedLength2, 1599039318, false, (String) objArr140[0], null);
            }
            Object[] objArr141 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr141[0])[0]}, new int[]{((int[]) objArr141[1])[0]}, (Object[]) objArr141[2], new int[1], (String[]) objArr141[4]};
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i276 = 1885227093 + (((~(151058305 | iFreeMemory2)) | (-363660732)) * (-948)) + ((~((~iFreeMemory2) | (-346882107))) * (-948)) + 478733500;
            int i277 = (i276 << 13) ^ i276;
            int i278 = i277 ^ (i277 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i278 ^ (i278 << 5);
        } else {
            int iIntValue4 = ((Integer) Class.forName(str11).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr142 = {-1277214688};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b((char) (42049 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1726, 30 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue4, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).newInstance(objArr142), 877626432, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char c12 = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int iLastIndexOf5 = TextUtils.lastIndexOf("", '0', 0) + 1756;
                int iIndexOf10 = 23 - TextUtils.indexOf("", "", 0);
                byte[] bArr50 = $$a;
                byte b76 = bArr50[91];
                byte b77 = bArr50[7];
                Object[] objArr143 = new Object[1];
                a(b76, b77, (short) (b77 | 37), objArr143);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(c12, iLastIndexOf5, iIndexOf10, 1599039318, false, (String) objArr143[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
            try {
                long jLongValue17 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue17);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                    char longPressTimeout5 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                    int packedPositionType4 = 1755 - ExpandableListView.getPackedPositionType(0L);
                    int trimmedLength3 = TextUtils.getTrimmedLength("") + 23;
                    byte[] bArr51 = $$a;
                    byte b78 = bArr51[91];
                    byte b79 = bArr51[7];
                    Object[] objArr144 = new Object[1];
                    a(b78, b79, (short) (b79 | 89), objArr144);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(longPressTimeout5, packedPositionType4, trimmedLength3, 1596667560, false, (String) objArr144[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
                    int iLastIndexOf6 = TextUtils.lastIndexOf("", '0', 0) + 1756;
                    int i279 = 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte[] bArr52 = $$a;
                    byte b80 = bArr52[91];
                    Object[] objArr145 = new Object[1];
                    a(b80, (byte) (b80 - 4), bArr52[7], objArr145);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cRgb, iLastIndexOf6, i279, 986134021, false, (String) objArr145[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
            } catch (Exception unused11) {
                throw new RuntimeException();
            }
        }
        int i280 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i281 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i281 != i280) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr23 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr23 != null) {
                for (String str22 : strArr23) {
                    arrayList8.add(str22);
                }
            }
            throw new RuntimeException(String.valueOf(i281));
        }
        int i282 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        Object[] objArr146 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int i283 = ((Context) Class.forName(r2).getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        int i284 = i282 + 370336724 + (((-604013954) | i283) * (-627)) + (((~(663259043 | i283)) | 875861469) * (-627)) + (((~(i283 | 875861469)) | (~((~i283) | (-663259044)))) * 627);
        int i285 = (i284 << 13) ^ i284;
        int i286 = i285 ^ (i285 >>> 17);
        ((int[]) objArr146[3])[0] = i286 ^ (i286 << 5);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 7;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 125;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    static {
        byte[] bArr = new byte[549];
        System.arraycopy("$¶±ë\fþÁ9\b\u0000ø\u0005ùÉ3\rö\u000eýúûÊ9\u0006\u0006»?øü\u0012\u0002ýó\bø\t\u0006º;\u0005\u0006ñ\rüó\u000bÂL\u0000õô!ô\u000bõ\u0006ÿâ\u0011\u0018ôø\t\u0006Ò,ï\u0006\u0006ø\t\u0006î\u0007\u0005ö\u0005\u0005ùâ%ø\u0006õ\u0013ñ\r¿\rö\u000eýúûÊE\u0002û\u0000ÿ\u0003\u0002ºH¾ú?øÿ\u0005øÍ$\u000f\u0013õ\u0005ùÜ,þ\u0003ñ\u0013°\r!ô\u000bõ\u0006ÿâ\u0011\u0018ôø\t\u0006Ò,ï\u0006\u0006ø\t\u0006ÿýõþ\u0006ø\u000bý\u0005þý\u0005÷ÿ\u0012óü\u0012Ö\"õ\u0001\u0007ø\u0001\u0001û\u0014÷\b¾\fþÁ6ý\u0013í\u0003\u000bøÇ3\rö\u000eýúûÊD\u0003øÁ;\u0005\u0006ñ\rüó\u000bÂ6\u000bþô\b\u0005ÀEð\f\u0001õÉ$#øÔ\"\u0011õ\u0006ÿå\u0010\f\u0001õ¿Oò\töÝ\"\u0011õ\u0006ÿ¶\u000eò\u000e\fþÁ6ý\u0013í\u0003\u000bøÇ3\rö\u000eýúûÊD\u0003øÁ;\u0005\u0006ñ\rüó\u000bÂ6\u000bþô\b\u0005ÀEð\f\u0001õÉ$#øé\u0013ü\u0012Ü\u0010\f\u0001õ¿Dù\rö\bùà1ï\t\u0006°\r\fþÁ9\b\u0000ø\u0005ùÉ3\rö\u000eýúûÊ>ýù\u0010ï\u0011÷ü\u000e»Büõ\u0002\u0002\u000e»;\u0005\u0006ñ\rüó\u000bÂL\u0000è\u0018î\fþÁ9\b\u0000ø\u0005ùÉ3\rö\u000eýúûÊ?ô\u0013ñ\r÷ø\u000bÂ;\u0005\u0006ñ\rüó\u000bÂ&\u0011\u0013üÐ.ï\u0016ê\u0001\nùã\u001d\u0007\u0004õ\r²\r!ô\u000bõ\u0006ÿâ\u0011\u0018ôø\t\u0006Ò,ï\u0006\u0006ø\t\u0006ÿýõþ\u0006ø\u000bý\u0005þý\u0005÷ÿ\u0012óü\u0012Ö\"õ\u0001\u0007ø\u0001\u0001û\u0014÷\b¿\u0005\bë\u000býûý\u0013ñß.ï\u0016ê\u0001\nù!ô\u000bõ\u0006ÿâ\u0011\u0018ôø\t\u0006Ò,ï\u0006\u0006ø\t\u0006ÿýõþ\u0006ø\u000bý\u0005þý\u0005÷ÿ\u0012óü\u0012Ö\"õ\u0001\u0007ø\u0001\u0001û\u0014÷\b½".getBytes("ISO-8859-1"), 0, bArr, 0, 549);
        $$d = bArr;
        $$e = 54;
        $$a = new byte[]{97, 58, 103, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
        $$b = 221;
        g = 0;
        asBinder = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 63605;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 64435;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 48656;
        d = (char) 30943;
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
    private static java.lang.String $$g(int r5, short r6, byte r7) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r7 = r7 + 108
            int r5 = r5 * 2
            int r0 = 1 - r5
            byte[] r1 = com.midtrans.raygun.RaygunPostService.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
        L28:
            int r6 = r6 + 1
            int r4 = -r4
            int r7 = r7 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.raygun.RaygunPostService.$$g(int, short, byte):java.lang.String");
    }
}
