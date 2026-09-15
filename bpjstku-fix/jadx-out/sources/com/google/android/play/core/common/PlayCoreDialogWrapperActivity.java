package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.ResultReceiver;
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
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.R;
import defpackage.CameraUseCaseAdapter;
import defpackage.EncoderImplByteBufferInput;
import defpackage.SessionProcessor;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getConfigs;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public class PlayCoreDialogWrapperActivity extends Activity {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static long b;
    private static int d;
    private ResultReceiver TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
    private static final int $$f = 35;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 84
            byte[] r0 = com.google.android.play.core.common.PlayCoreDialogWrapperActivity.$$a
            int r6 = r6 + 4
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r7 = r8
            r5 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r0[r6]
        L23:
            int r7 = r7 + r3
            int r6 = r6 + 1
            int r7 = r7 + (-11)
            r3 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.common.PlayCoreDialogWrapperActivity.c(int, short, byte, java.lang.Object[]):void");
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
    private static void e(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.play.core.common.PlayCoreDialogWrapperActivity.$$d
            int r7 = r7 + 65
            int r9 = r9 + 4
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L26
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L26:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-4)
            int r9 = r3 + 1
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.common.PlayCoreDialogWrapperActivity.e(short, int, short, java.lang.Object[]):void");
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            super.onActivityResult(i, i2, intent);
            throw null;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            d = i5 % 128;
            int i6 = i5 % 2;
            ResultReceiver resultReceiver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (resultReceiver != null) {
                if (i2 == -1) {
                    resultReceiver.send(1, new Bundle());
                } else if (i2 == 0) {
                    resultReceiver.send(2, new Bundle());
                }
            }
        }
        finish();
    }

    private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i5 = $10 + 29;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i7 = $10 + 107;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8329 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Color.green(0) + 1235, MotionEvent.axisFromString("") + 36, -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 2765, 14 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1504416861, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43324 - Process.getGidForName("")), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 253, TextUtils.getTrimmedLength("") + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 65200);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2891;
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 17;
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    String str$$g = $$g(b6, b7, (byte) (b7 + 1));
                    i2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, iKeyCodeFromString, absoluteGravity, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i3 = i2;
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

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            bundle.putParcelable("result_receiver", this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        } else {
            bundle.putParcelable("result_receiver", this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i3 = 37 / 0;
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        String str;
        String str2;
        String str3;
        Object[] objArr3;
        int i;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        String str4;
        Object obj;
        Object[] objArr7;
        Object[] objArr8;
        String str5;
        String str6;
        Object[] objArr9;
        char c;
        Object[] objArr10;
        String str7;
        Object[] objArr11;
        int i2;
        Object[] objArr12;
        String str8;
        Object[] objArr13;
        int i3;
        Object[] objArr14;
        int i4;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Intent intent;
        int i5 = 2 % 2;
        Object[] objArr15 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{9144, 40068, 22997, 8793}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_message_status_code_407).substring(10, 11).length() - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.delete_this_card).substring(11, 12).length() - 1, new char[]{34431, 23573, 41611, 48862, 57829, 47636, 11939, 19013, 15524, 44139, 12514, 29479, 26542, 15292, 16797, 10068, 5755, 44795, 27985, 3815, 3673, 62194}, objArr15);
        String str9 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{53749, 13698, 35067, 42129}, (char) (37256 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_atm_bni).substring(0, 7).codePointAt(2) - 80379260, new char[]{6919, 26860, 45589, 24462, 5986, 29853, 47089, 27342, 3847, 17556, 50221, 31220, 55990, 10800, 26614}, objArr16);
        String str10 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{45795, 18339, 58782, 63220}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellDetailsTitle).substring(0, 7).codePointAt(6) + 62610), Drawable.resolveOpacity(0, 0), new char[]{58456, 45218, 11574, 19668, 38813, 44310, 54351, 46809, 43747, 37811, 5458, 45121, 3436, 63180, 26728, 32184}, objArr17);
        String str11 = (String) objArr17[0];
        Object[] objArr18 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{55003, 60227, 60446, 49550}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 36473), TextUtils.lastIndexOf("", '0', 0) + 1, new char[]{57566, 62304, 5521, 7353, 16624, 48642, 29889, 44597, 34218, 32844, 54360, 40498, 15698, 7126, 4829, 8935}, objArr18);
        String str12 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{29059, 4110, 16747, 24062}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 65053), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 99, new char[]{41595, 34209, 45079, 61041, 43266, 3969, 55830, 36452, 48770, 37055, 16288, 39772, 17913, 31639, 59030, 23111, 53923, 29465, 6796, 44929, 34328, 20937, 25329, 48670, 31986, 26220}, objArr19);
        String str13 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{18809, 37226, 25297, 2654}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step5).substring(17, 18).codePointAt(0) + 24052), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{39387, 30366, 57733, 48683, 4622, 51245, 44272, 22212, 12073, 19480, 2129, 54185, 39449, 13023, 45477, 707, 40589, 23565}, objArr20);
        String str14 = (String) objArr20[0];
        int i6 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i7 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 556807105);
        if (i6 != 395883585 + ((~((-18874885) | i7)) * (-783)) + (((~(i7 | (-1495270958))) | (-665283415)) * 783)) {
            throw new RuntimeException("-601811336");
        }
        int i8 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        int i10 = (-1607257720) + (((~((-708932804) | i9)) | (-1870123162)) * (-318));
        int i11 = ~((-1870123162) | i9);
        int i12 = ~i9;
        if (i8 != i10 + (((~(i12 | 1870132443)) | i11) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~((-1161199641) | i12)) | (~(i9 | 1870132443))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
            int i13 = (-1632271364) % 2;
            throw new ArithmeticException();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (53893 - TextUtils.indexOf("", "", 0));
            int i14 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1319;
            int absoluteGravity = 36 - Gravity.getAbsoluteGravity(0, 0);
            short s = $$a[7];
            Object[] objArr21 = new Object[1];
            c(s, (byte) (s | 14), (byte) 52, objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i14, absoluteGravity, -1433084963, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i15 = d + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
            int i16 = i15 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 53893);
                int keyRepeatTimeout = 1320 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36;
                short s2 = $$a[7];
                byte b2 = (byte) s2;
                Object[] objArr22 = new Object[1];
                c(s2, b2, b2, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, keyRepeatTimeout, keyRepeatTimeout2, -1920778747, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i17 = ((int[]) objArr23[0])[0];
            int i18 = ((int[]) objArr23[3])[0];
            String[] strArr = (String[]) objArr23[2];
            int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i20 = ~i19;
            int i21 = ((((-1756802320) + ((201916416 | i20) * (-192))) + (((~((-871823296) | i20)) | 296888113) * (-384))) + (((~(i19 | 1073739711)) | ((~(i20 | (-574935183))) | (~((-296888114) | i19)))) * DerHeader.TAG_CLASS_PRIVATE)) - 279150512;
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr[1])[0] = i23 ^ (i23 << 5);
            str11 = str11;
            str14 = str14;
            str12 = str12;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                baseContext = (Context) Class.forName(str13).getMethod(str14, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            int iIntValue = ((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr24 = {1484805987};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (47977 - (Process.myTid() >> 22)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1299, 20 - TextUtils.indexOf("", ""), -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr25 = {baseContext, "com.bpjstku", -279150512, Integer.valueOf(iIntValue), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr24), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char offsetAfter = (char) (53893 - TextUtils.getOffsetAfter("", 0));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1321;
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 36;
                    short s3 = $$a[7];
                    byte b3 = (byte) s3;
                    Object[] objArr26 = new Object[1];
                    c(s3, b3, b3, objArr26);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter, iIndexOf, doubleTapTimeout, 819724799, false, (String) objArr26[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 1394, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 75), Boolean.TYPE});
                }
                Object[] objArr27 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr25);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char edgeSlop = (char) (53893 - (ViewConfiguration.getEdgeSlop() >> 16));
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1320;
                        int trimmedLength = 36 - TextUtils.getTrimmedLength("");
                        short s4 = $$a[7];
                        byte b4 = (byte) s4;
                        Object[] objArr28 = new Object[1];
                        c(s4, b4, b4, objArr28);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, windowTouchSlop, trimmedLength, -1920778747, false, (String) objArr28[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArr27);
                    try {
                        long jLongValue = ((Long) Class.forName(str9).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) (53894 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int iCombineMeasuredStates = 1320 - View.combineMeasuredStates(0, 0);
                            int iResolveOpacity = 36 - Drawable.resolveOpacity(0, 0);
                            byte b5 = $$a[7];
                            Object[] objArr29 = new Object[1];
                            c((short) 52, b5, (byte) (b5 | 15), objArr29);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iCombineMeasuredStates, iResolveOpacity, -1273706634, false, (String) objArr29[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char offsetAfter2 = (char) (TextUtils.getOffsetAfter("", 0) + 53893);
                            int threadPriority = 1320 - ((Process.getThreadPriority(0) + 20) >> 6);
                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37;
                            short s5 = $$a[7];
                            Object[] objArr30 = new Object[1];
                            c(s5, (byte) (s5 | 14), (byte) 52, objArr30);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetAfter2, threadPriority, iIndexOf2, -1433084963, false, (String) objArr30[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    str14 = str14;
                    objArr27 = objArr27;
                }
                objArr = objArr27;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i24 = ((int[]) objArr[3])[0];
        int i25 = ((int[]) objArr[0])[0];
        if (i25 == i24) {
            objArr2 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i26 = ((int[]) objArr[1])[0];
            int i27 = ((int[]) objArr[0])[0];
            int i28 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[2];
            int iIdentityHashCode = System.identityHashCode(this);
            int i29 = ~iIdentityHashCode;
            int i30 = i26 + (-1939283844) + ((iIdentityHashCode | 510888618) * (-859)) + (((~(iIdentityHashCode | (-305299459))) | (~(510888618 | i29))) * 859) + (((~((-859739207) | i29)) | 554439748) * 859);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr2[1])[0] = i32 ^ (i32 << 5);
        } else {
            int[] iArr = new int[i25];
            int i33 = i25 - 1;
            iArr[i33] = 1;
            Toast.makeText((Context) null, iArr[((i25 * i33) % 2) - 1], 1).show();
            objArr2 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i34 = ((int[]) objArr[1])[0];
            int i35 = ((int[]) objArr[0])[0];
            int i36 = ((int[]) objArr[3])[0];
            String[] strArr3 = (String[]) objArr[2];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i37 = ~startUptimeMillis;
            int i38 = i34 + 450273580 + (((~(i37 | 339961802)) | 1030666022) * (-1042)) + ((339961802 | startUptimeMillis) * 521) + (((~(startUptimeMillis | (-1030666023))) | 339879682 | (~(i37 | 1030748142))) * 521);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr2[1])[0] = i40 ^ (i40 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c3 = (char) (37568 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 625;
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 14;
            short s6 = $$a[7];
            Object[] objArr31 = new Object[1];
            c(s6, (byte) (s6 | 14), (byte) 52, objArr31);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, touchSlop, fadingEdgeLength, -477065106, false, (String) objArr31[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        long jLongValue2 = ((Long) Class.forName(str9).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cIndexOf2 = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0'));
            int tapTimeout = 625 - (ViewConfiguration.getTapTimeout() >> 16);
            int i41 = 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte b6 = $$a[7];
            Object[] objArr32 = new Object[1];
            c((short) 89, b6, b6, objArr32);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf2, tapTimeout, i41, -976899241, false, (String) objArr32[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c4 = (char) (37567 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 625;
                int scrollBarFadeDuration = 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                short s7 = $$a[7];
                byte b7 = (byte) s7;
                Object[] objArr33 = new Object[1];
                c(s7, b7, b7, objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c4, tapTimeout2, scrollBarFadeDuration, -973632554, false, (String) objArr33[0], null);
            }
            Object[] objArr34 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i42 = ((int[]) objArr34[2])[0];
            int i43 = ((int[]) objArr34[0])[0];
            String[] strArr4 = (String[]) objArr34[3];
            int[] iArr2 = {i42};
            int i44 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i45 = ~i44;
            int i46 = (((508685448 + ((~(4197456 | i45)) * (-560))) + ((~(i44 | (-1815343273))) * (-560))) + (((~(1819540664 | i45)) | 64) * 560)) - 2127150264;
            int i47 = (i46 << 13) ^ i46;
            int i48 = i47 ^ (i47 >>> 17);
            ((int[]) objArr3[1])[0] = i48 ^ (i48 << 5);
            objArr3 = new Object[]{new int[]{i43}, new int[1], iArr2, strArr4};
            i = 0;
            str2 = str12;
            str3 = str10;
            str13 = str13;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                str = str14;
                baseContext2 = (Context) Class.forName(str13).getMethod(str, new Class[0]).invoke(null, null);
            } else {
                str = str14;
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            str2 = str12;
            int iIntValue2 = ((Integer) Class.forName(str11).getMethod(str2, Object.class).invoke(null, this)).intValue();
            Object[] objArr35 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{57460, 11229, 45563, 52196}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_instruction_text).substring(0, 32).codePointAt(16) - 101), View.MeasureSpec.getSize(0), new char[]{2223, 64280, 5246, 64789, 11847, 30863, 9967, 14523, 46470, 30343, 15985, 51622, 13688, 40009, 51881, 58613, 28353, 48687, 18980, 52684, 59000, 59473, 44080, 55707, 48058, 44722, 49631, 26937, 19649, 7919, 60746, 31592, 20935, 19216, 30278, 3279, 41604, 34880, 7994, 5734, 53161, 26005, 20644, 33155, 5510, 55596, 50259, 50416, 26681, 42401, 14718, 62482, 39370, 51766, 59778, 55005, 31612, 53418, 63483, 18874, 27680, 9106, 17520, 12822}, objArr35);
            String str15 = (String) objArr35[0];
            str14 = str;
            Object[] objArr36 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{40044, 13711, 23340, 64199}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_1).substring(1, 3).length() - 2), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama7).substring(105, 113).codePointAt(0) - 32, new char[]{20839, 13208, 15515, 55428, 19402, 31292, 13487, 16072, 5251, 60248, 4008, 34015, 35759, 46075, 45475, 12123, 64548, 16583, 42626, 57191, 58200, 38108, 8420, 25160, 48438, 63971, 64953, 42361, 50485, 49096, 4108, 55100, 41625, 32921, 19793, 17248, 18465, 24871, 56814, 56252, 52465, 13774, 797, 36360, 52824, 19298, 15522, 23610, 55036, 13838, 2939, 458, 28342, 10594, 60362, 58559, 33737, 30326, 13314, 41971, 29468, 60303, 11497, 5165}, objArr36);
            String[] strArr5 = {str15, (String) objArr36[0]};
            int i49 = d + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i49 % 128;
            int i50 = i49 % 2;
            try {
                Object[] objArr37 = {baseContext2, strArr5, Integer.valueOf(iIntValue2), 17, -2127150264};
                byte[] bArr = $$d;
                byte b8 = bArr[12];
                Object[] objArr38 = new Object[1];
                e(b8, (short) (-bArr[15]), b8, objArr38);
                Class<?> cls = Class.forName((String) objArr38[0]);
                Object[] objArr39 = new Object[1];
                e(bArr[35], (short) (-bArr[9]), (short) (-bArr[15]), objArr39);
                Object[] objArr40 = (Object[]) cls.getMethod((String) objArr39[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr37);
                int i51 = ((int[]) objArr40[0])[0];
                int i52 = ((int[]) objArr40[2])[0];
                if (baseContext2 != null) {
                    int i53 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
                    d = i53 % 128;
                    int i54 = i53 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 37567);
                        int iIndexOf3 = 624 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 14;
                        short s8 = $$a[7];
                        byte b9 = (byte) s8;
                        Object[] objArr41 = new Object[1];
                        c(s8, b9, b9, objArr41);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cKeyCodeFromString, iIndexOf3, deadChar, -973632554, false, (String) objArr41[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, objArr40);
                    try {
                        str3 = str10;
                        long jLongValue3 = ((Long) Class.forName(str9).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf3 = Long.valueOf(jLongValue3);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                            char deadChar2 = (char) (37567 - KeyEvent.getDeadChar(0, 0));
                            int maxKeyCode = 625 - (KeyEvent.getMaxKeyCode() >> 16);
                            int bitsPerPixel = 13 - ImageFormat.getBitsPerPixel(0);
                            byte b10 = $$a[7];
                            Object[] objArr42 = new Object[1];
                            c((short) 89, b10, b10, objArr42);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(deadChar2, maxKeyCode, bitsPerPixel, -976899241, false, (String) objArr42[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf3);
                        Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 37568);
                            int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 625;
                            int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14;
                            short s9 = $$a[7];
                            Object[] objArr43 = new Object[1];
                            c(s9, (byte) (s9 | 14), (byte) 52, objArr43);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAxisFromString, threadPriority2, keyRepeatDelay2, -477065106, false, (String) objArr43[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf4);
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr40 = objArr40;
                    str3 = str10;
                    str13 = str13;
                }
                objArr3 = objArr40;
                i = 0;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i55 = ((int[]) objArr3[i])[i];
        int i56 = ((int[]) objArr3[2])[i];
        if (i56 == i55) {
            objArr4 = new Object[4];
            int[] iArr3 = new int[1];
            objArr4[i] = iArr3;
            objArr4[1] = new int[1];
            int[] iArr4 = new int[1];
            objArr4[2] = iArr4;
            int i57 = ((int[]) objArr3[1])[i];
            int i58 = ((int[]) objArr3[2])[i];
            int i59 = ((int[]) objArr3[i])[i];
            String[] strArr6 = (String[]) objArr3[3];
            iArr4[i] = i58;
            iArr3[i] = i59;
            int i60 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[i]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i61 = i57 + (-1718784756) + (((~((~i60) | (-201851043))) | (~(1012922111 | i60))) * (-302)) + ((~((-201851043) | i60)) * (-604)) + (((~(i60 | 811071069)) | 255060) * 302);
            int i62 = (i61 << 13) ^ i61;
            int i63 = i62 ^ (i62 >>> 17);
            ((int[]) objArr4[1])[0] = i63 ^ (i63 << 5);
            objArr4[3] = strArr6;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr7 = (String[]) objArr3[3];
            if (strArr7 != null) {
                int i64 = 0;
                while (i64 < strArr7.length) {
                    int i65 = d + 87;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i65 % 128;
                    if (i65 % 2 != 0) {
                        arrayList.add(strArr7[i64]);
                        i64 += 125;
                    } else {
                        arrayList.add(strArr7[i64]);
                        i64++;
                    }
                }
            }
            int[] iArr5 = new int[i56];
            int i66 = i56 - 1;
            iArr5[i66] = 1;
            Toast.makeText((Context) null, iArr5[((i56 * i66) % 2) - 1], 1).show();
            int i67 = ((int[]) objArr3[1])[0];
            int i68 = ((int[]) objArr3[2])[0];
            int i69 = ((int[]) objArr3[0])[0];
            String[] strArr8 = (String[]) objArr3[3];
            int iMyTid = Process.myTid();
            int i70 = i67 + (-2122724920) + (((~(84328007 | iMyTid)) | (-1739587272) | (~(1739410113 | iMyTid))) * (-744)) + (((~iMyTid) | 84150849) * 744) + ((iMyTid | 1739587271) * 744);
            int i71 = (i70 << 13) ^ i70;
            int i72 = i71 ^ (i71 >>> 17);
            ((int[]) objArr4[1])[0] = i72 ^ (i72 << 5);
            objArr4 = new Object[]{new int[]{i69}, new int[1], new int[]{i68}, strArr8};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iAlpha = 15 - Color.alpha(0);
            byte b11 = $$a[7];
            Object[] objArr44 = new Object[1];
            c((short) 89, b11, b11, objArr44);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(minimumFlingVelocity, maximumDrawingCacheSize, iAlpha, 1357589585, false, (String) objArr44[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null);
        long jLongValue4 = ((Long) Class.forName(str9).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
            char c5 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int i73 = 1032 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int iRgb = (-16777201) - Color.rgb(0, 0, 0);
            short s10 = $$a[7];
            byte b12 = (byte) s10;
            Object[] objArr45 = new Object[1];
            c(s10, b12, b12, objArr45);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c5, i73, iRgb, 1344079056, false, (String) objArr45[0], null);
        }
        if (j2 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1032;
                int iIndexOf4 = TextUtils.indexOf("", "", 0, 0) + 15;
                short s11 = $$a[7];
                Object[] objArr46 = new Object[1];
                c(s11, (byte) (s11 | 14), (byte) 52, objArr46);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(offsetBefore, iLastIndexOf, iIndexOf4, 632103528, false, (String) objArr46[0], null);
            }
            Object[] objArr47 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).get(null);
            objArr5 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i74 = ((int[]) objArr47[3])[0];
            int i75 = ((int[]) objArr47[1])[0];
            String[] strArr9 = (String[]) objArr47[0];
            int i76 = (~System.identityHashCode(this)) | 709926247;
            int i77 = ((244364666 + (i76 * 495)) + (((~i76) | 537955330) * 495)) - 1886388042;
            int i78 = (i77 << 13) ^ i77;
            int i79 = i78 ^ (i78 >>> 17);
            ((int[]) objArr5[2])[0] = i79 ^ (i79 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str11).getMethod(str2, Object.class).invoke(null, this)).intValue();
            Object[] objArr48 = {1484805987};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b((char) (46038 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1134 - (ViewConfiguration.getTouchSlop() >> 8), 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr49 = {Integer.valueOf(iIntValue3), 0, -1886388042, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).newInstance(objArr48), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                int i80 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1030;
                int i81 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte b13 = $$a[7];
                Object[] objArr50 = new Object[1];
                c((short) 89, b13, b13, objArr50);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cLastIndexOf, i80, i81, 1298546779, false, (String) objArr50[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0') + 45994), 1117 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17), Boolean.TYPE});
            }
            Object[] objArr51 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr49);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 15;
                short s12 = $$a[7];
                Object[] objArr52 = new Object[1];
                c(s12, (byte) (s12 | 14), (byte) 52, objArr52);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(windowTouchSlop2, minimumFlingVelocity2, packedPositionType, 632103528, false, (String) objArr52[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, objArr51);
            try {
                long jLongValue5 = ((Long) Class.forName(str9).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue5);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char cRed = (char) Color.red(0);
                    int iIndexOf5 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 15;
                    short s13 = $$a[7];
                    byte b14 = (byte) s13;
                    Object[] objArr53 = new Object[1];
                    c(s13, b14, b14, objArr53);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cRed, iIndexOf5, absoluteGravity2, 1344079056, false, (String) objArr53[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue5 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                    int iNormalizeMetaState = 1031 - KeyEvent.normalizeMetaState(0);
                    int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 15;
                    byte b15 = $$a[7];
                    Object[] objArr54 = new Object[1];
                    c((short) 89, b15, b15, objArr54);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cLastIndexOf2, iNormalizeMetaState, iResolveOpacity2, 1357589585, false, (String) objArr54[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf6);
                objArr5 = objArr51;
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr5[3])[0] != ((int[]) objArr5[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr10 = (String[]) objArr5[0];
            if (strArr10 != null) {
                for (String str16 : strArr10) {
                    arrayList2.add(str16);
                }
            }
            throw null;
        }
        Object[] objArr55 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i82 = ((int[]) objArr5[2])[0];
        int i83 = ((int[]) objArr5[3])[0];
        int i84 = ((int[]) objArr5[1])[0];
        String[] strArr11 = (String[]) objArr5[0];
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i85 = ~iMaxMemory;
        int i86 = i82 + (-1532087423) + (((~((-652980049) | i85)) | 610994704) * 184) + ((iMaxMemory | (-939245563)) * (-184)) + ((~((-897260219) | i85)) * 184);
        int i87 = (i86 << 13) ^ i86;
        int i88 = i87 ^ (i87 >>> 17);
        ((int[]) objArr55[2])[0] = i88 ^ (i88 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
            char cIndexOf3 = (char) (43042 - TextUtils.indexOf("", "", 0, 0));
            int windowTouchSlop3 = 3111 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iResolveSizeAndState = 22 - View.resolveSizeAndState(0, 0, 0);
            byte b16 = $$a[7];
            Object[] objArr56 = new Object[1];
            c((short) 89, b16, b16, objArr56);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cIndexOf3, windowTouchSlop3, iResolveSizeAndState, -1272852037, false, (String) objArr56[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43042);
                int i89 = 3111 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iIndexOf6 = TextUtils.indexOf("", "") + 22;
                byte b17 = $$a[7];
                Object[] objArr57 = new Object[1];
                c((short) 52, b17, (byte) (b17 | 15), objArr57);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(scrollBarSize, i89, iIndexOf6, 154975793, false, (String) objArr57[0], null);
            }
            Object[] objArr58 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).get(null);
            int i90 = ((int[]) objArr58[2])[0];
            int i91 = ((int[]) objArr58[1])[0];
            String[] strArr12 = (String[]) objArr58[3];
            int[] iArr6 = {i90};
            int[] iArr7 = {i91};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i92 = ~iIdentityHashCode2;
            int i93 = (((60185379 + (((~((-1485274652) | i92)) | 1350977048) * 98)) + ((((~(i92 | (-219756808))) | (-1485274652)) | (~(219756807 | iIdentityHashCode2))) * (-49))) + (((~(iIdentityHashCode2 | (-1485274652))) | (-1570733856)) * 49)) - 938189664;
            int i94 = (i93 << 13) ^ i93;
            int i95 = i94 ^ (i94 >>> 17);
            ((int[]) objArr6[0])[0] = i95 ^ (i95 << 5);
            objArr6 = new Object[]{new int[1], iArr7, iArr6, strArr12};
        } else {
            Object[] objArr59 = {null, Integer.valueOf(((Integer) Class.forName(str11).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, -938189664};
            byte[] bArr2 = $$d;
            Object[] objArr60 = new Object[1];
            e((byte) (bArr2[18] - 1), bArr2[98], (short) 77, objArr60);
            Class<?> cls2 = Class.forName((String) objArr60[0]);
            byte b18 = (byte) ($$e >>> 1);
            short s14 = bArr2[12];
            Object[] objArr61 = new Object[1];
            e(b18, s14, (short) (s14 | 127), objArr61);
            Object[] objArr62 = (Object[]) cls2.getMethod((String) objArr61[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr59);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char c6 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43043);
                int iIndexOf7 = TextUtils.indexOf("", "") + 3111;
                int trimmedLength2 = 22 - TextUtils.getTrimmedLength("");
                byte b19 = $$a[7];
                Object[] objArr63 = new Object[1];
                c((short) 52, b19, (byte) (b19 | 15), objArr63);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c6, iIndexOf7, trimmedLength2, 154975793, false, (String) objArr63[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, objArr62);
            try {
                long jLongValue6 = ((Long) Class.forName(str9).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue6);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                    char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43042);
                    int iAxisFromString = 3110 - MotionEvent.axisFromString("");
                    int offsetAfter3 = TextUtils.getOffsetAfter("", 0) + 22;
                    short s15 = $$a[7];
                    byte b20 = (byte) s15;
                    Object[] objArr64 = new Object[1];
                    c(s15, b20, b20, objArr64);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(maximumFlingVelocity, iAxisFromString, offsetAfter3, -1269618118, false, (String) objArr64[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    char gidForName = (char) (43041 - Process.getGidForName(""));
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 3112;
                    int windowTouchSlop4 = 22 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte b21 = $$a[7];
                    Object[] objArr65 = new Object[1];
                    c((short) 89, b21, b21, objArr65);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(gidForName, iLastIndexOf2, windowTouchSlop4, -1272852037, false, (String) objArr65[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf8);
                objArr6 = objArr62;
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr6[2])[0] != ((int[]) objArr6[1])[0]) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr13 = (String[]) objArr6[3];
            if (strArr13 != null) {
                for (String str17 : strArr13) {
                    arrayList3.add(str17);
                }
            }
            throw null;
        }
        int i96 = d + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i96 % 128;
        int i97 = i96 % 2;
        int i98 = ((int[]) objArr6[0])[0];
        int i99 = ((int[]) objArr6[2])[0];
        int i100 = ((int[]) objArr6[1])[0];
        String[] strArr14 = (String[]) objArr6[3];
        int[] iArr8 = {i100};
        String str18 = "currentApplication";
        int i101 = (~(((Context) Class.forName("android.app.ActivityThread").getMethod(str18, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_indosat_phone_number).substring(0, 20).length() - 998044361)) | 33695441;
        int i102 = i98 + (-2084430734) + (i101 * 495) + (((~i101) | 33685585) * 495);
        int i103 = (i102 << 13) ^ i102;
        int i104 = i103 ^ (i103 >>> 17);
        ((int[]) objArr[0])[0] = i104 ^ (i104 << 5);
        Object[] objArr66 = {new int[1], iArr8, new int[]{i99}, strArr14};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
            char bitsPerPixel2 = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
            int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2267;
            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 34;
            short s16 = $$a[7];
            byte b22 = (byte) s16;
            Object[] objArr67 = new Object[1];
            c(s16, b22, b22, objArr67);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(bitsPerPixel2, scrollBarFadeDuration2, iLastIndexOf3, -887667012, false, (String) objArr67[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                int absoluteGravity3 = 2267 - Gravity.getAbsoluteGravity(0, 0);
                int doubleTapTimeout2 = 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte b23 = $$a[7];
                Object[] objArr68 = new Object[1];
                c((short) 52, b23, (byte) (b23 | 15), objArr68);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(packedPositionType2, absoluteGravity3, doubleTapTimeout2, -654680577, false, (String) objArr68[0], null);
            }
            Object[] objArr69 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).get(null);
            objArr7 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i105 = ((int[]) objArr69[0])[0];
            int i106 = ((int[]) objArr69[3])[0];
            String[] strArr15 = (String[]) objArr69[1];
            int i107 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod(str18, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.input_1).substring(3, 4).length() - 734027273);
            int i108 = 982692943 + ((~(531364959 | i107)) * 52) + (((~(361386014 | i107)) | (~((-447327302) | i107)) | 169978945) * (-52)) + (((~(i107 | (-361386015))) | 84037658) * 52) + 1970852661;
            int i109 = (i108 << 13) ^ i108;
            int i110 = i109 ^ (i109 >>> 17);
            ((int[]) objArr7[2])[0] = i110 ^ (i110 << 5);
            str18 = str18;
            objArr55 = objArr55;
            str4 = str14;
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                str4 = str14;
                baseContext3 = (Context) Class.forName(str13).getMethod(str4, new Class[0]).invoke(null, null);
            } else {
                str4 = str14;
            }
            if (baseContext3 == null) {
                obj = null;
            } else {
                if (baseContext3 instanceof ContextWrapper) {
                    int i111 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
                    d = i111 % 128;
                    if (i111 % 2 == 0) {
                        ((ContextWrapper) baseContext3).getBaseContext();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) baseContext3).getBaseContext() == null) {
                        baseContext3 = null;
                        obj = null;
                    }
                }
                obj = null;
                baseContext3 = baseContext3.getApplicationContext();
            }
            Object[] objArr70 = {baseContext3, Integer.valueOf(((Integer) Class.forName(str11).getMethod(str2, Object.class).invoke(obj, this)).intValue()), 0, 1970852661};
            byte[] bArr3 = $$d;
            Object[] objArr71 = new Object[1];
            e((byte) (bArr3[18] - 1), (short) 139, (short) ($$e | 60), objArr71);
            Class<?> cls3 = Class.forName((String) objArr71[0]);
            Object[] objArr72 = new Object[1];
            e(bArr3[35], (short) (-bArr3[232]), (short) 266, objArr72);
            Object[] objArr73 = (Object[]) cls3.getMethod((String) objArr72[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr70);
            if (baseContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int pressedStateDuration = 2267 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 33;
                    byte b24 = $$a[7];
                    Object[] objArr74 = new Object[1];
                    c((short) 52, b24, (byte) (b24 | 15), objArr74);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cMakeMeasureSpec, pressedStateDuration, pressedStateDuration2, -654680577, false, (String) objArr74[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, objArr73);
                try {
                    long jLongValue7 = ((Long) Class.forName(str9).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue7);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                        char cBlue = (char) Color.blue(0);
                        int iRed = Color.red(0) + 2267;
                        int iBlue = Color.blue(0) + 33;
                        byte b25 = $$a[7];
                        Object[] objArr75 = new Object[1];
                        c((short) 89, b25, b25, objArr75);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cBlue, iRed, iBlue, -874156483, false, (String) objArr75[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue7 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int mode = View.MeasureSpec.getMode(0) + 2267;
                        int trimmedLength3 = TextUtils.getTrimmedLength("") + 33;
                        short s17 = $$a[7];
                        byte b26 = (byte) s17;
                        Object[] objArr76 = new Object[1];
                        c(s17, b26, b26, objArr76);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(packedPositionGroup, mode, trimmedLength3, -887667012, false, (String) objArr76[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } else {
                objArr73 = objArr73;
                str18 = str18;
                objArr55 = objArr55;
            }
            objArr7 = objArr73;
        }
        int i112 = ((int[]) objArr7[3])[0];
        int i113 = ((int[]) objArr7[0])[0];
        if (i113 != i112) {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr16 = (String[]) objArr7[1];
            if (strArr16 != null) {
                for (String str19 : strArr16) {
                    arrayList4.add(str19);
                }
            }
            throw new RuntimeException(String.valueOf(i113));
        }
        int i114 = d + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i114 % 128;
        int i115 = i114 % 2;
        Object[] objArr77 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i116 = ((int[]) objArr7[2])[0];
        int i117 = ((int[]) objArr7[0])[0];
        int i118 = ((int[]) objArr7[3])[0];
        String[] strArr17 = (String[]) objArr7[1];
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i119 = i116 + 1171503519 + (((~(iIdentityHashCode3 | 637401732)) | (-171311584)) * (-668)) + ((637401732 | (~((-171311584) | iIdentityHashCode3))) * 1336) + ((iIdentityHashCode3 | (-167903580)) * 668);
        int i120 = (i119 << 13) ^ i119;
        int i121 = i120 ^ (i120 >>> 17);
        ((int[]) objArr77[2])[0] = i121 ^ (i121 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
            char packedPositionChild = (char) (31532 - ExpandableListView.getPackedPositionChild(0L));
            int scrollBarFadeDuration3 = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i122 = 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            short s18 = $$a[7];
            Object[] objArr78 = new Object[1];
            c(s18, (byte) (s18 | 14), (byte) 52, objArr78);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(packedPositionChild, scrollBarFadeDuration3, i122, -1048449946, false, (String) objArr78[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char cLastIndexOf3 = (char) (31532 - TextUtils.lastIndexOf("", '0', 0));
                int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 921;
                int i123 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                byte b27 = $$a[7];
                Object[] objArr79 = new Object[1];
                c((short) 52, b27, (byte) (b27 | 15), objArr79);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cLastIndexOf3, minimumFlingVelocity3, i123, -1142834547, false, (String) objArr79[0], null);
            }
            Object[] objArr80 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).get(null);
            objArr8 = new Object[]{new int[1], new int[]{((int[]) objArr80[1])[0]}, (Object[]) objArr80[2], new int[]{((int[]) objArr80[3])[0]}, (String[]) objArr80[4]};
            int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
            int i124 = ~iMaxMemory2;
            int i125 = 1647385943 + (((~((-1758866788) | i124)) | (-15212857) | (~(1758866787 | iMaxMemory2))) * (-564)) + ((~(iMaxMemory2 | (-2621465))) * 1128) + (((~((-15212857) | i124)) | (-1761488252)) * 564) + 1438185287;
            int i126 = (i125 << 13) ^ i125;
            int i127 = i126 ^ (i126 >>> 17);
            ((int[]) objArr8[0])[0] = i127 ^ (i127 << 5);
            objArr77 = objArr77;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                baseContext4 = (Context) Class.forName(str13).getMethod(str4, new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
            }
            Object[] objArr81 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str11).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, 1438185287};
            byte[] bArr4 = $$d;
            Object[] objArr82 = new Object[1];
            e(bArr4[309], bArr4[5], (short) TypedValues.AttributesType.TYPE_PIVOT_TARGET, objArr82);
            Class<?> cls4 = Class.forName((String) objArr82[0]);
            Object[] objArr83 = new Object[1];
            e(bArr4[35], (short) (-bArr4[232]), (short) 266, objArr83);
            Object[] objArr84 = (Object[]) cls4.getMethod((String) objArr83[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr81);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char cIndexOf4 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 921;
                int iGreen = 28 - Color.green(0);
                byte b28 = $$a[7];
                Object[] objArr85 = new Object[1];
                c((short) 52, b28, (byte) (b28 | 15), objArr85);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(cIndexOf4, iCombineMeasuredStates2, iGreen, -1142834547, false, (String) objArr85[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, objArr84);
            try {
                long jLongValue8 = ((Long) Class.forName(str9).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf11 = Long.valueOf(jLongValue8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char c7 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                    int i128 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 921;
                    int maxKeyCode2 = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                    short s19 = $$a[7];
                    byte b29 = (byte) s19;
                    Object[] objArr86 = new Object[1];
                    c(s19, b29, b29, objArr86);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(c7, i128, maxKeyCode2, -778300370, false, (String) objArr86[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf11);
                Long lValueOf12 = Long.valueOf(jLongValue8 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                    char pressedStateDuration3 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 31533);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 921;
                    int i129 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    short s20 = $$a[7];
                    Object[] objArr87 = new Object[1];
                    c(s20, (byte) (s20 | 14), (byte) 52, objArr87);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(pressedStateDuration3, iMakeMeasureSpec, i129, -1048449946, false, (String) objArr87[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf12);
                objArr8 = objArr84;
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        }
        int i130 = ((int[]) objArr8[1])[0];
        int i131 = ((int[]) objArr8[3])[0];
        if (i131 != i130) {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr18 = (String[]) objArr8[4];
            if (strArr18 != null) {
                int i132 = 0;
                while (i132 < strArr18.length) {
                    int i133 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
                    d = i133 % 128;
                    if (i133 % 2 == 0) {
                        arrayList5.add(strArr18[i132]);
                        i132 += 24;
                    } else {
                        arrayList5.add(strArr18[i132]);
                        i132++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i131));
        }
        int i134 = ((int[]) objArr8[0])[0];
        Object[] objArr88 = {new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
        int iIdentityHashCode4 = System.identityHashCode(this);
        int i135 = ~iIdentityHashCode4;
        int i136 = i134 + 1053551265 + (((~((-1657022897) | i135)) | (~((-117056748) | iIdentityHashCode4))) * (-370)) + (((~(iIdentityHashCode4 | (-1657022897))) | (~(i135 | (-117056748))) | (-1727933948)) * (-370)) + 614566344;
        int i137 = (i136 << 13) ^ i136;
        int i138 = i137 ^ (i137 >>> 17);
        ((int[]) objArr88[0])[0] = i138 ^ (i138 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
            char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int iResolveSizeAndState2 = 876 - View.resolveSizeAndState(0, 0, 0);
            int i139 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte b30 = $$a[7];
            Object[] objArr89 = new Object[1];
            c((short) 52, b30, (byte) (b30 | 15), objArr89);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(packedPositionChild2, iResolveSizeAndState2, i139, -1650998592, false, (String) objArr89[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str9).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int iIndexOf8 = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int iMyTid2 = 10 - (Process.myTid() >> 22);
            short s21 = $$a[7];
            byte b31 = (byte) s21;
            Object[] objArr90 = new Object[1];
            c(s21, b31, b31, objArr90);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cCombineMeasuredStates, iIndexOf8, iMyTid2, 2012020043, false, (String) objArr90[0], null);
        }
        if (j3 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int iIndexOf9 = 875 - TextUtils.indexOf((CharSequence) "", '0');
                int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 10;
                byte b32 = $$a[7];
                Object[] objArr91 = new Object[1];
                c((short) 89, b32, b32, objArr91);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(scrollBarSize2, iIndexOf9, packedPositionType3, 2012931276, false, (String) objArr91[0], null);
            }
            Object[] objArr92 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).get(null);
            objArr9 = new Object[]{new int[]{((int[]) objArr92[0])[0]}, new int[1], new int[]{((int[]) objArr92[2])[0]}, (String[]) objArr92[3]};
            str5 = str18;
            int i140 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str5, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1073740481;
            int i141 = (((-549971510) + (((~(i140 | 299781259)) | 237056564) * 305)) + (((~((~i140) | 299781259)) | 259471030) * 305)) - 460633050;
            int i142 = (i141 << 13) ^ i141;
            int i143 = i142 ^ (i142 >>> 17);
            ((int[]) objArr9[1])[0] = i143 ^ (i143 << 5);
            str6 = str3;
            c = 2;
            str4 = str4;
        } else {
            str5 = str18;
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str13).getMethod(str4, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
            }
            Object[] objArr93 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str11).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, -460633050};
            byte[] bArr5 = $$d;
            byte b33 = (byte) (-bArr5[15]);
            Object[] objArr94 = new Object[1];
            e(b33, (short) (b33 | 65), (short) ($$e | 264), objArr94);
            Class<?> cls5 = Class.forName((String) objArr94[0]);
            Object[] objArr95 = new Object[1];
            e(bArr5[35], (short) (-bArr5[232]), (short) 266, objArr95);
            Object[] objArr96 = (Object[]) cls5.getMethod((String) objArr95[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr93);
            if (baseContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int i144 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
                    int touchSlop2 = 10 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte b34 = $$a[7];
                    Object[] objArr97 = new Object[1];
                    c((short) 89, b34, b34, objArr97);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(size, i144, touchSlop2, 2012931276, false, (String) objArr97[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, objArr96);
                try {
                    str6 = str3;
                    long jLongValue10 = ((Long) Class.forName(str9).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                        char cGreen = (char) Color.green(0);
                        int iAlpha2 = 876 - Color.alpha(0);
                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 10;
                        short s22 = $$a[7];
                        byte b35 = (byte) s22;
                        Object[] objArr98 = new Object[1];
                        c(s22, b35, b35, objArr98);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cGreen, iAlpha2, iNormalizeMetaState2, 2012020043, false, (String) objArr98[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue10 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        char tapTimeout3 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int defaultSize = View.getDefaultSize(0, 0) + 876;
                        int i145 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte b36 = $$a[7];
                        Object[] objArr99 = new Object[1];
                        c((short) 52, b36, (byte) (b36 | 15), objArr99);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(tapTimeout3, defaultSize, i145, -1650998592, false, (String) objArr99[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf14);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            } else {
                objArr96 = objArr96;
                str6 = str3;
                str4 = str4;
            }
            objArr9 = objArr96;
            c = 2;
        }
        if (((int[]) objArr9[0])[0] != ((int[]) objArr9[c])[0]) {
            throw null;
        }
        int i146 = ((int[]) objArr9[1])[0];
        Object[] objArr100 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
        int i147 = ~System.identityHashCode(this);
        int i148 = i146 + ((((~((-349177999) | i147)) | 76548102) * (-241)) - 295521734) + (((~(i147 | (-272629897))) | (-385415872)) * 241);
        int i149 = (i148 << 13) ^ i148;
        int i150 = i149 ^ (i149 >>> 17);
        ((int[]) objArr100[1])[0] = i150 ^ (i150 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
            char c8 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
            int iRed2 = 10 - Color.red(0);
            Object[] objArr101 = new Object[1];
            c((short) 141, $$a[153], (byte) ($$b >>> 2), objArr101);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(c8, maximumFlingVelocity2, iRed2, -1199417970, false, (String) objArr101[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str9).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
            int iResolveSize = View.resolveSize(0, 0) + 10;
            byte b37 = $$a[33];
            Object[] objArr102 = new Object[1];
            c((short) 151, b37, (byte) (b37 | 36), objArr102);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(edgeSlop2, edgeSlop3, iResolveSize, 254769921, false, (String) objArr102[0], null);
        }
        if (j4 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int i151 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
                int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 10;
                byte[] bArr6 = $$a;
                Object[] objArr103 = new Object[1];
                c((short) 151, bArr6[153], bArr6[44], objArr103);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cResolveOpacity, i151, touchSlop3, 1324201839, false, (String) objArr103[0], null);
            }
            Object[] objArr104 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).get(null);
            objArr10 = new Object[]{new int[]{((int[]) objArr104[0])[0]}, new int[1], new int[]{((int[]) objArr104[2])[0]}, (String[]) objArr104[3]};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i152 = (((14126196 + (((~(iIdentityHashCode5 | 326215700)) | 285905471) * (-668))) + ((326215700 | (~(285905471 | iIdentityHashCode5))) * 1336)) + ((iIdentityHashCode5 | 326875711) * 668)) - 1337879104;
            int i153 = (i152 << 13) ^ i152;
            int i154 = i153 ^ (i153 >>> 17);
            ((int[]) objArr10[1])[0] = i154 ^ (i154 << 5);
        } else {
            Object[] objArr105 = {Integer.valueOf(((Integer) Class.forName(str11).getMethod(str2, Object.class).invoke(null, this)).intValue()), -1337879104};
            byte[] bArr7 = $$d;
            Object[] objArr106 = new Object[1];
            e((byte) (bArr7[18] - 1), bArr7[90], (short) 436, objArr106);
            Class<?> cls6 = Class.forName((String) objArr106[0]);
            Object[] objArr107 = new Object[1];
            e(bArr7[35], (short) (-bArr7[9]), (short) (-bArr7[15]), objArr107);
            objArr10 = (Object[]) cls6.getMethod((String) objArr107[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr105);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int trimmedLength4 = 876 - TextUtils.getTrimmedLength("");
                int iResolveSizeAndState3 = View.resolveSizeAndState(0, 0, 0) + 10;
                byte[] bArr8 = $$a;
                Object[] objArr108 = new Object[1];
                c((short) 151, bArr8[153], bArr8[44], objArr108);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cMyPid, trimmedLength4, iResolveSizeAndState3, 1324201839, false, (String) objArr108[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, objArr10);
            try {
                long jLongValue12 = ((Long) Class.forName(str9).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 876;
                    int iResolveSize2 = View.resolveSize(0, 0) + 10;
                    byte b38 = $$a[33];
                    Object[] objArr109 = new Object[1];
                    c((short) 151, b38, (byte) (b38 | 36), objArr109);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cNormalizeMetaState, iResolveOpacity3, iResolveSize2, 254769921, false, (String) objArr109[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue12 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char cLastIndexOf4 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                    int iMakeMeasureSpec2 = 876 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int fadingEdgeLength2 = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    Object[] objArr110 = new Object[1];
                    c((short) 141, $$a[153], (byte) ($$b >>> 2), objArr110);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cLastIndexOf4, iMakeMeasureSpec2, fadingEdgeLength2, -1199417970, false, (String) objArr110[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf16);
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        int i155 = ((int[]) objArr10[2])[0];
        int i156 = ((int[]) objArr10[0])[0];
        if (i156 == i155) {
            int i157 = ((int[]) objArr10[1])[0];
            objArr11 = new Object[]{new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
            str7 = str5;
            int i158 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i159 = 1527501492 + ((~(i158 | 341743412)) * 216);
            int i160 = ~i158;
            int i161 = i157 + i159 + ((369071999 | i160) * (-216)) + (((~(i160 | 341743412)) | (-301433184)) * 216);
            int i162 = i161 ^ (i161 << 13);
            int i163 = i162 ^ (i162 >>> 17);
            i2 = 0;
            ((int[]) objArr11[1])[0] = i163 ^ (i163 << 5);
        } else {
            str7 = str5;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr19 = (String[]) objArr10[3];
            if (strArr19 != null) {
                for (String str20 : strArr19) {
                    arrayList6.add(str20);
                }
            }
            Toast.makeText((Context) null, i156 / (((i156 - 1) * i156) % 2), 0).show();
            int i164 = ((int[]) objArr10[1])[0];
            objArr11 = new Object[]{new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
            int i165 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i166 = 1153572500 + (((~((-54587167) | i165)) | 50341398 | (~(14276937 | i165))) * (-880));
            int i167 = (~((-54587167) | (~i165))) | (-14276938);
            int i168 = ~(i165 | 54587166);
            int i169 = i164 + i166 + ((i167 | i168) * (-880)) + (i168 * 880);
            int i170 = i169 ^ (i169 << 13);
            int i171 = i170 ^ (i170 >>> 17);
            i2 = 0;
            ((int[]) objArr11[1])[0] = i171 ^ (i171 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
            char c9 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int iBlue2 = 876 - Color.blue(i2);
            int mode2 = View.MeasureSpec.getMode(i2) + 10;
            short s23 = $$a[7];
            Object[] objArr111 = new Object[1];
            c(s23, (byte) (s23 | 14), (byte) 52, objArr111);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(c9, iBlue2, mode2, 252381699, false, (String) objArr111[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).getLong(null);
        long jLongValue13 = ((Long) Class.forName(str9).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int threadPriority3 = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
            int iArgb = Color.argb(0, 0, 0, 0) + 10;
            byte b39 = $$a[7];
            Object[] objArr112 = new Object[1];
            c((short) 158, b39, b39, objArr112);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(capsMode, threadPriority3, iArgb, 2009631821, false, (String) objArr112[0], null);
        }
        if (j5 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                char scrollBarSize3 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int i172 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 875;
                int tapTimeout4 = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                Object[] objArr113 = new Object[1];
                c((short) 210, $$a[54], (byte) 52, objArr113);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(scrollBarSize3, i172, tapTimeout4, 256017550, false, (String) objArr113[0], null);
            }
            Object[] objArr114 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
            objArr12 = new Object[]{new int[]{((int[]) objArr114[0])[0]}, new int[1], new int[]{((int[]) objArr114[2])[0]}, (String[]) objArr114[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i173 = (-110414582) + (((~((~iUptimeMillis) | 751930427)) | 36336196) * 529) + (((~(iUptimeMillis | 751930427)) | 711620198) * 529) + 1520812684;
            int i174 = (i173 << 13) ^ i173;
            int i175 = i174 ^ (i174 >>> 17);
            ((int[]) objArr12[1])[0] = i175 ^ (i175 << 5);
        } else {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                int i176 = d + 23;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i176 % 128;
                int i177 = i176 % 2;
                baseContext6 = (Context) Class.forName(str13).getMethod(str4, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
            }
            Object[] objArr115 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str11).getMethod(str2, Object.class).invoke(null, this)).intValue()), 1520812684};
            byte[] bArr9 = $$d;
            Object[] objArr116 = new Object[1];
            e((byte) (bArr9[18] - 1), (short) (-bArr9[58]), (short) ($$e | TypedValues.CycleType.TYPE_EASING), objArr116);
            Class<?> cls7 = Class.forName((String) objArr116[0]);
            Object[] objArr117 = new Object[1];
            e(bArr9[35], (short) (-bArr9[232]), (short) 535, objArr117);
            objArr12 = (Object[]) cls7.getMethod((String) objArr117[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr115);
            if (baseContext6 != null) {
                int i178 = d + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i178 % 128;
                int i179 = i178 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                    char keyRepeatDelay3 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i180 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                    int i181 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    Object[] objArr118 = new Object[1];
                    c((short) 210, $$a[54], (byte) 52, objArr118);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(keyRepeatDelay3, i180, i181, 256017550, false, (String) objArr118[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, objArr12);
                try {
                    long jLongValue14 = ((Long) Class.forName(str9).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue14);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                        char doubleTapTimeout3 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iIndexOf10 = TextUtils.indexOf((CharSequence) "", '0') + 877;
                        int capsMode2 = 10 - TextUtils.getCapsMode("", 0, 0);
                        byte b40 = $$a[7];
                        Object[] objArr119 = new Object[1];
                        c((short) 158, b40, b40, objArr119);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(doubleTapTimeout3, iIndexOf10, capsMode2, 2009631821, false, (String) objArr119[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                        char edgeSlop4 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0, 0) + 877;
                        int i182 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
                        short s24 = $$a[7];
                        Object[] objArr120 = new Object[1];
                        c(s24, (byte) (s24 | 14), (byte) 52, objArr120);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(edgeSlop4, iLastIndexOf4, i182, 252381699, false, (String) objArr120[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            }
        }
        int i183 = ((int[]) objArr12[2])[0];
        int i184 = ((int[]) objArr12[0])[0];
        if (i184 == i183) {
            int i185 = ((int[]) objArr12[1])[0];
            objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
            str8 = str7;
            int i186 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str8, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 823100618;
            int i187 = i185 + 8382540 + (((~((-11070225) | i186)) | 51380453) * (-756)) + (((~i186) | (-11070225)) * 756);
            int i188 = i187 ^ (i187 << 13);
            int i189 = i188 ^ (i188 >>> 17);
            ((int[]) objArr13[1])[0] = i189 ^ (i189 << 5);
            i3 = 0;
        } else {
            str8 = str7;
            int[] iArr9 = new int[i184];
            int i190 = i184 - 1;
            iArr9[i190] = 1;
            Toast.makeText((Context) null, iArr9[((i184 * i190) % 2) - 1], 1).show();
            int i191 = ((int[]) objArr12[1])[0];
            objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i192 = ~iIdentityHashCode6;
            int i193 = i191 + 1148077754 + (((~(i192 | (-147454120))) | 13168771 | (~((-53479001) | iIdentityHashCode6))) * 717) + (((~(iIdentityHashCode6 | (-147454120))) | (~(i192 | (-53479001))) | 13168771) * 717);
            int i194 = (i193 << 13) ^ i193;
            int i195 = i194 ^ (i194 >>> 17);
            i3 = 0;
            ((int[]) objArr13[1])[0] = i195 ^ (i195 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
            char windowTouchSlop5 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iRgb2 = Color.rgb(i3, i3, i3) + 16777867;
            int bitsPerPixel3 = 43 - ImageFormat.getBitsPerPixel(i3);
            byte b41 = $$a[7];
            Object[] objArr121 = new Object[1];
            c((short) 158, b41, b41, objArr121);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(windowTouchSlop5, iRgb2, bitsPerPixel3, -459846511, false, (String) objArr121[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).getLong(null);
        long jLongValue15 = ((Long) Class.forName(str9).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
            char c10 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int iLastIndexOf5 = TextUtils.lastIndexOf("", '0', 0) + 652;
            int iIndexOf11 = TextUtils.indexOf("", "", 0) + 44;
            short s25 = $$a[7];
            Object[] objArr122 = new Object[1];
            c(s25, (byte) (s25 | 14), (byte) 52, objArr122);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(c10, iLastIndexOf5, iIndexOf11, -873460649, false, (String) objArr122[0], null);
        }
        if (j6 == ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                char touchSlop4 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int i196 = 651 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int i197 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43;
                byte b42 = $$a[7];
                Object[] objArr123 = new Object[1];
                c((short) 52, b42, (byte) (b42 | 15), objArr123);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(touchSlop4, i196, i197, -1595579076, false, (String) objArr123[0], null);
            }
            Object[] objArr124 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).get(null);
            objArr14 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i198 = ((int[]) objArr124[2])[0];
            int i199 = ((int[]) objArr124[0])[0];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i200 = ~iIdentityHashCode7;
            int i201 = (-1027205059) + (((~((-1042695412) | i200)) | 1046126221) * (-328)) + ((iIdentityHashCode7 | 1046126221) * 164) + (((~(iIdentityHashCode7 | 1042695411)) | 5806604 | (~(i200 | (-2375795)))) * 164) + 273603688;
            int i202 = (i201 << 13) ^ i201;
            int i203 = i202 ^ (i202 >>> 17);
            ((int[]) objArr14[3])[0] = i203 ^ (i203 << 5);
            i4 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 1610 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 26 - KeyEvent.normalizeMetaState(0), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr125 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).newInstance(null), 273603688, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char cLastIndexOf5 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                int offsetBefore2 = 651 - TextUtils.getOffsetBefore("", 0);
                int fadingEdgeLength3 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 44;
                short s26 = $$a[7];
                Object[] objArr126 = new Object[1];
                c(s26, (byte) (s26 | 14), (byte) 52, objArr126);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cLastIndexOf5, offsetBefore2, fadingEdgeLength3, 2075921419, false, (String) objArr126[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getTrimmedLength(""), 695 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 98 - View.combineMeasuredStates(0, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - TextUtils.indexOf("", "", 0, 0)), View.MeasureSpec.getMode(0) + 793, 82 - TextUtils.indexOf((CharSequence) "", '0', 0)), Integer.TYPE, Integer.TYPE});
            }
            objArr14 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).invoke(null, objArr125);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char pressedStateDuration4 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int i204 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                int iIndexOf12 = 43 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte b43 = $$a[7];
                Object[] objArr127 = new Object[1];
                c((short) 52, b43, (byte) (b43 | 15), objArr127);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(pressedStateDuration4, i204, iIndexOf12, -1595579076, false, (String) objArr127[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr14);
            try {
                long jLongValue16 = ((Long) Class.forName(str9).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue16);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char maximumFlingVelocity3 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i205 = 652 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int offsetBefore3 = 44 - TextUtils.getOffsetBefore("", 0);
                    short s27 = $$a[7];
                    Object[] objArr128 = new Object[1];
                    c(s27, (byte) (s27 | 14), (byte) 52, objArr128);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(maximumFlingVelocity3, i205, offsetBefore3, -873460649, false, (String) objArr128[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char edgeSlop5 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 651;
                    int iResolveSizeAndState4 = View.resolveSizeAndState(0, 0, 0) + 44;
                    byte b44 = $$a[7];
                    Object[] objArr129 = new Object[1];
                    c((short) 158, b44, b44, objArr129);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(edgeSlop5, keyRepeatTimeout3, iResolveSizeAndState4, -459846511, false, (String) objArr129[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf20);
                i4 = 0;
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr14[2])[i4] != ((int[]) objArr14[i4])[i4]) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr20 = (String[]) objArr14[1];
            if (strArr20 != null) {
                for (String str21 : strArr20) {
                    arrayList7.add(str21);
                }
            }
            throw null;
        }
        Object[] objArr130 = new Object[4];
        int[] iArr10 = new int[1];
        objArr130[i4] = iArr10;
        int[] iArr11 = new int[1];
        objArr130[2] = iArr11;
        objArr130[3] = new int[1];
        int i206 = ((int[]) objArr14[3])[i4];
        int i207 = ((int[]) objArr14[2])[i4];
        int i208 = ((int[]) objArr14[i4])[i4];
        iArr11[i4] = i207;
        iArr10[i4] = i208;
        objArr130[1] = new String[i4];
        int i209 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str8, new Class[i4]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i210 = i206 + 1384684869 + (((~(i209 | (-939111818))) | 942542627) * 191) + (((~((~i209) | (-939111818))) | 807929089) * 191);
        int i211 = (i210 << 13) ^ i210;
        int i212 = i211 ^ (i211 >>> 17);
        ((int[]) objArr130[3])[0] = i212 ^ (i212 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char packedPositionType4 = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
            int scrollBarSize4 = (ViewConfiguration.getScrollBarSize() >> 8) + 1755;
            int mode3 = View.MeasureSpec.getMode(0) + 23;
            byte b45 = $$a[7];
            Object[] objArr131 = new Object[1];
            c((short) 52, b45, (byte) (b45 | 15), objArr131);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(packedPositionType4, scrollBarSize4, mode3, 986134021, false, (String) objArr131[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                int longPressTimeout = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int size2 = 23 - View.MeasureSpec.getSize(0);
                short s28 = $$a[7];
                byte b46 = (byte) s28;
                Object[] objArr132 = new Object[1];
                c(s28, b46, b46, objArr132);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(jumpTapTimeout, longPressTimeout, size2, 1599039318, false, (String) objArr132[0], null);
            }
            Object[] objArr133 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr133[0])[0]}, new int[]{((int[]) objArr133[1])[0]}, (Object[]) objArr133[2], new int[1], (String[]) objArr133[4]};
            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
            int i213 = ~startUptimeMillis2;
            int i214 = 1566088347 + (((~((-102013425) | i213)) | (~((-110589002) | startUptimeMillis2))) * (-370)) + (((~(startUptimeMillis2 | (-102013425))) | (~(i213 | (-110589002))) | (-110624250)) * (-370)) + 1548788296;
            int i215 = (i214 << 13) ^ i214;
            int i216 = i215 ^ (i215 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i216 ^ (i216 << 5);
        } else {
            int iIntValue4 = ((Integer) Class.forName(str11).getMethod(str2, Object.class).invoke(null, this)).intValue();
            Object[] objArr134 = {1484805987};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b((char) (42048 - ImageFormat.getBitsPerPixel(0)), View.resolveSizeAndState(0, 0, 0) + 1726, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue4, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).newInstance(objArr134), -469912164);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char cLastIndexOf6 = (char) (TextUtils.lastIndexOf("", '0') + 29945);
                int deadChar3 = 1755 - KeyEvent.getDeadChar(0, 0);
                int i217 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22;
                short s29 = $$a[7];
                byte b47 = (byte) s29;
                Object[] objArr135 = new Object[1];
                c(s29, b47, b47, objArr135);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(cLastIndexOf6, deadChar3, i217, 1599039318, false, (String) objArr135[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
            try {
                long jLongValue17 = ((Long) Class.forName(str9).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue17);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                    char c11 = (char) (29945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int modifierMetaStateMask = 1754 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int fadingEdgeLength4 = 23 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte b48 = $$a[7];
                    Object[] objArr136 = new Object[1];
                    c((short) 158, b48, b48, objArr136);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(c11, modifierMetaStateMask, fadingEdgeLength4, 1596667560, false, (String) objArr136[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char cIndexOf5 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
                    int mirror = AndroidCharacter.getMirror('0') + 1707;
                    int iIndexOf13 = TextUtils.indexOf("", "") + 23;
                    byte b49 = $$a[7];
                    Object[] objArr137 = new Object[1];
                    c((short) 52, b49, (byte) (b49 | 15), objArr137);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cIndexOf5, mirror, iIndexOf13, 986134021, false, (String) objArr137[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
            } catch (Exception unused11) {
                throw new RuntimeException();
            }
        }
        int i218 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i219 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i219 != i218) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr21 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr21 != null) {
                for (String str22 : strArr21) {
                    arrayList8.add(str22);
                }
            }
            throw new RuntimeException(String.valueOf(i219));
        }
        int i220 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        Object[] objArr138 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i221 = ~iElapsedRealtime;
        int i222 = (~(112531287 | i221)) | 289415296;
        int i223 = ~(iElapsedRealtime | (-76812871));
        int i224 = i220 + ((i222 | i223) * (-252)) + 130812985 + ((i223 | (~(i221 | 401946583))) * 252);
        int i225 = (i224 << 13) ^ i224;
        int i226 = i225 ^ (i225 >>> 17);
        ((int[]) objArr138[3])[0] = i226 ^ (i226 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b((char) (46400 - View.getDefaultSize(0, 0)), 40 - TextUtils.getCapsMode("", 0, 0), TextUtils.lastIndexOf("", '0', 0) + 20, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).get(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 46401), 40 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).invoke(obj3, null);
        Intent intent2 = getIntent();
        int i227 = ((int[]) objArr2[1])[0];
        int i228 = i227 * i227;
        int i229 = -(1746843954 * i227);
        int i230 = ((i228 | i229) << 1) - (i228 ^ i229);
        int i231 = -(i227 * (-848946354));
        int i232 = ((i230 | i231) << 1) - (i231 ^ i230);
        int i233 = (i232 ^ 890834944) + ((890834944 & i232) << 1);
        int i234 = i233 >> 19;
        int i235 = ((i234 ^ (-16383)) + ((i234 & (-16383)) << 1)) / 8192;
        int i236 = (i235 ^ 1) + ((i235 & 1) << 1);
        int i237 = ((i233 | i236) << 1) - (i236 ^ i233);
        int i238 = i233 >> 18;
        int i239 = ((i238 ^ (-32767)) + ((i238 & (-32767)) << 1)) / 16384;
        int i240 = -((((i239 | 1) << 1) - (i239 ^ 1)) ^ i237);
        int i241 = (i240 ^ 6) + ((i240 & 6) << 1);
        int i242 = i241 >> 16;
        int i243 = ((((-131071) ^ i242) + ((i242 & (-131071)) << 1)) / 65536) + 1;
        int i244 = 323334 / (((-((i243 ^ 1) + ((i243 & 1) << 1))) & i241) * 1633);
        int i245 = ((int[]) objArr55[2])[0];
        int i246 = i245 * i245;
        int i247 = -(495630197 * i245);
        int i248 = ((((i246 | i247) << 1) - (i246 ^ i247)) - (~(-(i245 * 568592401)))) - 1;
        int i249 = (i248 & 1184648841) + (1184648841 | i248);
        int i250 = i249 >> 18;
        int i251 = ((i250 ^ (-32767)) + ((i250 & (-32767)) << 1)) / 16384;
        int i252 = ((i251 | 1) << 1) - (i251 ^ 1);
        int i253 = ((i249 | i252) << 1) - (i252 ^ i249);
        int i254 = ((i249 >> 20) - 8191) / 4096;
        int i255 = (-(i253 ^ ((i254 & 1) + (i254 | 1)))) + 9;
        int i256 = i255 >> 19;
        int i257 = ((i256 & (-16383)) + (i256 | (-16383))) / 8192;
        int i258 = ((i257 | 1) << 1) - (i257 ^ 1);
        int i259 = i244 + (4846194 / ((i255 & (-((i258 ^ 1) + ((i258 & 1) << 1)))) * 1783));
        int i260 = ((int[]) objArr77[2])[0];
        int i261 = i260 * i260;
        int i262 = -(55679426 * i260);
        int i263 = (i261 ^ i262) + ((i261 & i262) << 1);
        int i264 = -(i260 * 1503423960);
        int i265 = ((i263 | i264) << 1) - (i264 ^ i263);
        int i266 = ((i265 | 883192361) << 1) - (883192361 ^ i265);
        int i267 = i266 >> 21;
        int i268 = ((i267 & (-4095)) + (i267 | (-4095))) / 2048;
        int i269 = (i268 & 1) + (i268 | 1);
        int i270 = (i266 & i269) + (i269 | i266);
        int i271 = i266 >> 16;
        int i272 = ((((-131071) | i271) << 1) - (i271 ^ (-131071))) / 65536;
        int i273 = -(((i272 & 1) + (i272 | 1)) ^ i270);
        int i274 = ((i273 | 4) << 1) - (i273 ^ 4);
        int i275 = (((i274 >> 23) - 1023) / 512) + 1;
        int i276 = i259 + (90240 / (((-((i275 ^ 1) + ((i275 & 1) << 1))) & i274) * 564));
        int i277 = ((int[]) objArr88[0])[0];
        int i278 = ((((i277 * i277) - (~(-(1387413357 * i277)))) - 1) - (~(-(i277 * 910205035)))) - (-1577484687);
        int i279 = ((i278 >> 22) - 2047) / 1024;
        int i280 = (i279 & 1) + (i279 | 1);
        int i281 = (i278 & i280) + (i280 | i278);
        int i282 = i278 >> 24;
        int i283 = (-(i281 ^ ((((i282 ^ (-511)) + ((i282 & (-511)) << 1)) / 256) + 1))) + 3;
        int i284 = i283 >> 29;
        int i285 = ((i284 ^ (-15)) + ((i284 & (-15)) << 1)) / 8;
        int i286 = (i285 & 1) + (i285 | 1);
        int i287 = i276 + (1207338 / ((i283 & (-((i286 & 1) + (i286 | 1)))) * 1663));
        int i288 = ((int[]) objArr130[3])[0];
        int i289 = i288 * i288;
        int i290 = -(1215505225 * i288);
        int i291 = (i289 & i290) + (i289 | i290);
        int i292 = -(i288 * (-16489099));
        int i293 = (i291 & i292) + (i292 | i291);
        int i294 = (i293 ^ 1936431937) + ((1936431937 & i293) << 1);
        int i295 = i294 >> 22;
        int i296 = (((i295 | (-2047)) << 1) - (i295 ^ (-2047))) / 1024;
        int i297 = (i296 & 1) + (i296 | 1);
        int i298 = (i294 ^ i297) + ((i297 & i294) << 1);
        int i299 = i294 >> 24;
        int i300 = ((i299 & (-511)) + (i299 | (-511))) / 256;
        int i301 = -((((i300 | 1) << 1) - (i300 ^ 1)) ^ i298);
        int i302 = ((i301 | 2) << 1) - (i301 ^ 2);
        int i303 = i302 >> 29;
        int i304 = (((i303 ^ (-15)) + ((i303 & (-15)) << 1)) / 8) + 1;
        String strSubstring = "31/24/29/26/window_flags".substring(i287 + ((-816750) / (((-(((i304 | 1) << 1) - (i304 ^ 1))) & i302) * 675)));
        int i305 = ((int[]) objArr4[1])[0];
        int i306 = i305 * i305;
        int i307 = -(561335075 * i305);
        int i308 = (i306 ^ i307) + ((i306 & i307) << 1);
        int i309 = -(i305 * 551125703);
        int i310 = ((i308 | i309) << 1) - (i309 ^ i308);
        int i311 = (i310 & (-1307695495)) + ((-1307695495) | i310);
        int i312 = i311 >> 25;
        int i313 = ((i311 >> 24) - 511) / 256;
        int i314 = -(((i311 - (~(((((i312 | (-255)) << 1) - (i312 ^ (-255))) / 128) + 1))) - 1) ^ (((i313 | 1) << 1) - (i313 ^ 1)));
        int i315 = (i314 ^ 4) + ((i314 & 4) << 1);
        int i316 = i315 >> 18;
        int i317 = (((i316 ^ (-32767)) + ((i316 & (-32767)) << 1)) / 16384) + 1;
        int i318 = 27376 / (((-((i317 ^ 1) + ((i317 & 1) << 1))) & i315) * 118);
        int i319 = ((int[]) objArr66[0])[0];
        int i320 = ((i319 * i319) - (~(-(1026826969 * i319)))) - 1;
        int i321 = -(i319 * 1454806283);
        int i322 = ((i320 | i321) << 1) - (i320 ^ i321);
        int i323 = (i322 & 574222532) + (574222532 | i322);
        int i324 = ((i323 >> 25) - 255) / 128;
        int i325 = (i324 ^ 1) + ((i324 & 1) << 1);
        int i326 = (i323 ^ i325) + ((i325 & i323) << 1);
        int i327 = i323 >> 29;
        int i328 = ((i327 ^ (-15)) + ((i327 & (-15)) << 1)) / 8;
        int i329 = -(i326 ^ ((i328 & 1) + (i328 | 1)));
        int i330 = (i329 & 9) + (i329 | 9);
        int i331 = ((i330 >> 23) - 1023) / 512;
        int i332 = i318 + (1085508 / (((-(((i331 & 1) + (i331 | 1)) + 1)) & i330) * 437));
        int i333 = ((int[]) objArr100[1])[0];
        int i334 = i333 * i333;
        int i335 = -(829271406 * i333);
        int i336 = (i334 ^ i335) + ((i334 & i335) << 1);
        int i337 = -(i333 * (-1877641274));
        int i338 = ((i336 & i337) + (i337 | i336)) - 534248284;
        int i339 = ((i338 >> 16) - 131071) / 65536;
        int i340 = ((i339 | 1) << 1) - (i339 ^ 1);
        int i341 = (i338 & i340) + (i340 | i338);
        int i342 = i338 >> 20;
        int i343 = ((i342 & (-8191)) + (i342 | (-8191))) / 4096;
        int i344 = -(i341 ^ (((i343 | 1) << 1) - (i343 ^ 1)));
        int i345 = (i344 ^ 1) + ((i344 & 1) << 1);
        int i346 = i345 >> 20;
        int i347 = ((i346 & (-8191)) + (i346 | (-8191))) / 4096;
        int i348 = (i347 ^ 1) + ((i347 & 1) << 1);
        int i349 = i332 + (53130 / (((-(((i348 | 1) << 1) - (i348 ^ 1))) & i345) * 759));
        int i350 = ((int[]) objArr11[1])[0];
        int i351 = i350 * i350;
        int i352 = -(811774173 * i350);
        int i353 = ((i351 | i352) << 1) - (i351 ^ i352);
        int i354 = -(i350 * 410879077);
        int i355 = (i353 ^ i354) + ((i354 & i353) << 1);
        int i356 = (i355 & (-1750787775)) + ((-1750787775) | i355);
        int i357 = i356 >> 24;
        int i358 = (((i357 | (-511)) << 1) - (i357 ^ (-511))) / 256;
        int i359 = ((i358 | 1) << 1) - (i358 ^ 1);
        int i360 = (i356 & i359) + (i359 | i356);
        int i361 = i356 >> 25;
        int i362 = ((i361 ^ (-255)) + ((i361 & (-255)) << 1)) / 128;
        int i363 = -((((i362 | 1) << 1) - (i362 ^ 1)) ^ i360);
        int i364 = (i363 ^ 2) + ((i363 & 2) << 1);
        int i365 = ((i364 >> 20) - 8191) / 4096;
        int i366 = (i365 ^ 1) + ((i365 & 1) << 1);
        int i367 = i349 + (2041988 / (((-(((i366 | 1) << 1) - (i366 ^ 1))) & i364) * 1391));
        int i368 = ((int[]) objArr13[1])[0];
        int i369 = ((((i368 * i368) - (~(-(1301259493 * i368)))) - 1) - (~(-(i368 * (-1876798261))))) - 1;
        int i370 = ((i369 | 1178203712) << 1) - (1178203712 ^ i369);
        int i371 = i370 >> 22;
        int i372 = ((i371 & (-2047)) + (i371 | (-2047))) / 1024;
        int i373 = (i372 ^ 1) + ((i372 & 1) << 1);
        int i374 = ((i370 | i373) << 1) - (i373 ^ i370);
        int i375 = i370 >> 26;
        int i376 = ((i375 & ComposerKt.defaultsKey) + (i375 | ComposerKt.defaultsKey)) / 64;
        int i377 = (-((((i376 | 1) << 1) - (i376 ^ 1)) ^ i374)) + 9;
        int i378 = ((i377 >> 17) - 65535) / 32768;
        int i379 = ((i378 | 1) << 1) - (i378 ^ 1);
        int i380 = i367 + (7441596 / ((i377 & (-((i379 ^ 1) + ((i379 & 1) << 1)))) * 1684));
        int i381 = ((int[]) objArr138[3])[0];
        int i382 = ((i381 * i381) - (~(-(1741106510 * i381)))) - 1;
        int i383 = -(i381 * (-39197204));
        int i384 = ((i382 ^ i383) + ((i383 & i382) << 1)) - (-1873373769);
        int i385 = i384 >> 23;
        int i386 = i385 ^ (-1023);
        int i387 = (((i385 | (-1023)) << 1) - i386) / 512;
        int i388 = (i387 ^ 1) + ((i387 & 1) << 1);
        int i389 = (i386 + ((i385 & (-1023)) << 1)) / 512;
        int i390 = (-((((i389 | 1) << 1) - (i389 ^ 1)) ^ (((i384 | i388) << 1) - (i384 ^ i388)))) + 1;
        int i391 = i390 >> 16;
        int i392 = ((((-131071) | i391) << 1) - (i391 ^ (-131071))) / 65536;
        int intExtra = intent2.getIntExtra(strSubstring, i380 + ((-2204037) / ((i390 & (-(((i392 ^ 1) + ((i392 & 1) << 1)) + 1))) * 1353)));
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            Intent intent3 = new Intent();
            intent3.putExtra("window_flags", intExtra);
            intent = intent3;
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        PendingIntent pendingIntent = extras != null ? (PendingIntent) extras.get("confirmation_intent") : null;
        if (extras == null || pendingIntent == null) {
            ResultReceiver resultReceiver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (resultReceiver != null) {
                resultReceiver.send(3, new Bundle());
            }
            finish();
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
        } catch (IntentSender.SendIntentException unused12) {
            ResultReceiver resultReceiver2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (resultReceiver2 != null) {
                resultReceiver2.send(3, new Bundle());
            }
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i4 = ~iElapsedRealtime;
            if (i3 != 1168966376 + (((~(1066925455 | i4)) | 524848) * 168) + ((~((-524849) | iElapsedRealtime)) * 168) + (((~(iElapsedRealtime | 1067450303)) | (~(i4 | (-236937913))) | 236413064) * 168)) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            if (i5 != (-573117390) + (((~(iElapsedRealtime2 | 40829443)) | 830512344) * 305) + (((~((~iElapsedRealtime2) | 40829443)) | 870816986) * 305)) {
                throw null;
            }
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ~((int) Runtime.getRuntime().totalMemory());
        if (i6 != (-2083550867) + (((~((-1550729673) | i7)) | (-1028326293)) * (-983)) + (((~(i7 | (-1028326293))) | 553714196) * 983)) {
            throw new RuntimeException("-461380097");
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 46401), 40 - (ViewConfiguration.getEdgeSlop() >> 16), 18 - ExpandableListView.getPackedPositionChild(0L), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 46400), 40 - ExpandableListView.getPackedPositionType(0L), Color.red(0) + 19, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onResume();
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            d = i8 % 128;
            int i9 = i8 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // android.app.Activity
    protected void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 46400), View.resolveSize(0, 0) + 40, 19 - TextUtils.indexOf("", ""), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = null;
        Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46400 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40, 19 - ExpandableListView.getPackedPositionGroup(0L), 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj2, null);
            super.onPause();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int tapTimeout = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
            int i3 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16;
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            c((short) 89, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, tapTimeout, i3, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{9144, 40068, 22997, 8793}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{34431, 23573, 41611, 48862, 57829, 47636, 11939, 19013, 15524, 44139, 12514, 29479, 26542, 15292, 16797, 10068, 5755, 44795, 27985, 3815, 3673, 62194}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{53749, 13698, 35067, 42129}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 37144), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_consent_screen_cta_text_continue_next_step).substring(2, 3).length() - 80379184, new char[]{6919, 26860, 45589, 24462, 5986, 29853, 47089, 27342, 3847, 17556, 50221, 31220, 55990, 10800, 26614}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int windowTouchSlop = 1031 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
            short s = $$a[7];
            byte b3 = (byte) s;
            Object[] objArr5 = new Object[1];
            c(s, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, windowTouchSlop, scrollDefaultDelay, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int i4 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                short s2 = $$a[7];
                Object[] objArr6 = new Object[1];
                c(s2, (byte) (s2 | 14), (byte) 52, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop2, i4, maximumFlingVelocity, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i8 = (((1866967784 + (((~((-989063760) | i7)) | 311656458) * 345)) + (((~((-989063760) | (~i7))) | (-1056440048)) * 345)) + ((~(i7 | (-311656459))) * 345)) - 119188072;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{45795, 18339, 58782, 63220}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 62682), (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{58456, 45218, 11574, 19668, 38813, 44310, 54351, 46809, 43747, 37811, 5458, 45121, 3436, 63180, 26728, 32184}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{55003, 60227, 60446, 49550}, (char) (Color.red(0) + 36588), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106, new char[]{57566, 62304, 5521, 7353, 16624, 48642, 29889, 44597, 34218, 32844, 54360, 40498, 15698, 7126, 4829, 8935}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {709326762};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46039 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1134 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -119188072, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 15;
                    byte b4 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c((short) 89, b4, b4, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild, scrollBarFadeDuration, scrollBarSize, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45994), 1117 - TextUtils.indexOf("", ""), 17 - View.resolveSizeAndState(0, 0, 0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
                    int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 15;
                    short s3 = $$a[7];
                    Object[] objArr13 = new Object[1];
                    c(s3, (byte) (s3 | 14), (byte) 52, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration2, touchSlop, windowTouchSlop3, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    a(new char[]{0, 0, 0, 0}, new char[]{9144, 40068, 22997, 8793}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step1).substring(14, 15).codePointAt(0) - 110), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step4).substring(0, 1).length() - 1, new char[]{34431, 23573, 41611, 48862, 57829, 47636, 11939, 19013, 15524, 44139, 12514, 29479, 26542, 15292, 16797, 10068, 5755, 44795, 27985, 3815, 3673, 62194}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    a(new char[]{0, 0, 0, 0}, new char[]{53749, 13698, 35067, 42129}, (char) (37256 - (ViewConfiguration.getPressedStateDuration() >> 16)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_image_captured_failed).substring(6, 7).codePointAt(0) - 80379215, new char[]{6919, 26860, 45589, 24462, 5986, 29853, 47089, 27342, 3847, 17556, 50221, 31220, 55990, 10800, 26614}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iIndexOf = 1031 - TextUtils.indexOf("", "");
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 16;
                        short s4 = $$a[7];
                        byte b5 = (byte) s4;
                        Object[] objArr16 = new Object[1];
                        c(s4, b5, b5, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, iIndexOf, bitsPerPixel, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int i11 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int iMyPid = (Process.myPid() >> 22) + 15;
                        byte b6 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c((short) 89, b6, b6, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMyPid, i11, iMyPid, 1357589585, false, (String) objArr17[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[3])[0];
        int i16 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i17 = ~((~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout) | 99623328);
        int i18 = i14 + ((90185760 | i17) * (-374)) + 379332905 + ((i17 | 9437568) * 374);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr18[2])[0] = i20 ^ (i20 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cMakeMeasureSpec = (char) (29944 - View.MeasureSpec.makeMeasureSpec(0, 0));
            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 1756;
            int i21 = 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            byte b7 = $$a[7];
            Object[] objArr19 = new Object[1];
            c((short) 52, b7, (byte) (b7 | 15), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMakeMeasureSpec, packedPositionChild2, i21, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
            d = i22 % 128;
            int i23 = i22 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                int i24 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                short s5 = $$a[7];
                byte b8 = (byte) s5;
                Object[] objArr20 = new Object[1];
                c(s5, b8, b8, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cMyTid, packedPositionGroup, i24, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i25 = ((int[]) objArr21[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{i25}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i26 = ~elapsedCpuTime;
            int i27 = ((((-1942013371) + (((~(elapsedCpuTime | (-762113997))) | ((~((-303042563) | i26)) | 90440136)) * (-68))) + ((~((-671673861) | i26)) * (-68))) + (((~(762113996 | i26)) | (-974716423)) * 68)) - 1373827751;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{45795, 18339, 58782, 63220}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step2).substring(8, 9).codePointAt(0) + 62583), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.akulaku_instruction_step4).substring(0, 1).length() - 1, new char[]{58456, 45218, 11574, 19668, 38813, 44310, 54351, 46809, 43747, 37811, 5458, 45121, 3436, 63180, 26728, 32184}, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{55003, 60227, 60446, 49550}, (char) (36588 - Gravity.getAbsoluteGravity(0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cancel_transaction).substring(1, 7).codePointAt(5) - 109, new char[]{57566, 62304, 5521, 7353, 16624, 48642, 29889, 44597, 34218, 32844, 54360, 40498, 15698, 7126, 4829, 8935}, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {709326762};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42050 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1726 - View.resolveSizeAndState(0, 0, 0), Color.green(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -1373827751, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c4 = (char) (29945 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int i30 = 1755 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int windowTouchSlop4 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 23;
                short s6 = $$a[7];
                byte b9 = (byte) s6;
                Object[] objArr25 = new Object[1];
                c(s6, b9, b9, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c4, i30, windowTouchSlop4, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
            try {
                Object[] objArr26 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{9144, 40068, 22997, 8793}, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_card_message).substring(0, 1).length() - 1, new char[]{34431, 23573, 41611, 48862, 57829, 47636, 11939, 19013, 15524, 44139, 12514, 29479, 26542, 15292, 16797, 10068, 5755, 44795, 27985, 3815, 3673, 62194}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{53749, 13698, 35067, 42129}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.seconds).substring(1, 2).length() + 37255), (-80379183) - ExpandableListView.getPackedPositionGroup(0L), new char[]{6919, 26860, 45589, 24462, 5986, 29853, 47089, 27342, 3847, 17556, 50221, 31220, 55990, 10800, 26614}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 29945);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1755;
                    int iIndexOf2 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte b10 = $$a[7];
                    Object[] objArr28 = new Object[1];
                    c((short) 158, b10, b10, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cLastIndexOf, offsetBefore, iIndexOf2, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf2 = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                    int offsetAfter = 1755 - TextUtils.getOffsetAfter("", 0);
                    int windowTouchSlop5 = 23 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte b11 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((short) 52, b11, (byte) (b11 | 15), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf2, offsetAfter, windowTouchSlop5, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i32 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i32 != i31) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr4 != null) {
                while (i2 < strArr4.length) {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i32));
        }
        int i33 = d + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i33 % 128;
        int i34 = i33 % 2;
        int i35 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        int i36 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        Object[] objArr30 = {new int[]{i36}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i37 = i35 + 1332474231 + (((~iIdentityHashCode) | 212603354) * 1444) + (((~(iIdentityHashCode | (-840084978))) | (~(1052687403 | iIdentityHashCode)) | 464) * (-1444)) + 1119200346;
        int i38 = (i37 << 13) ^ i37;
        int i39 = i38 ^ (i38 >>> 17);
        ((int[]) objArr30[3])[0] = i39 ^ (i39 << 5);
        int i40 = d + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i40 % 128;
        if (i40 % 2 != 0) {
            throw null;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1338439580
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // android.app.Activity
    protected void onStart() {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.common.PlayCoreDialogWrapperActivity.onStart():void");
    }

    static {
        byte[] bArr = new byte[591];
        System.arraycopy("$¶±ëÈ\r÷ö\u0018Ûþ\t\u0000ð Øù\u0000#É\u0000\u000bï\u0000\tñ\u0015Ö\u0007ö\bÿí\u0007\u0002\u0013çð\u0007úÿ-\b¼Û\bñ\u0007öý\u001aëä\b\u0004óö*Ð\röö\u0004óö\u000eõ÷\u0006÷÷\u0003\u001a×\u0004ö\u0007é\u000bï=ðþ;Ãôü\u0004÷\u00033Éï\u0006îÿ\u0002\u00012ÃööAÉèý\b6Éí\u00037·\u0006þõ\u0001÷<Á÷ö\u000bï\u0000\tñ:°\u0014èðþ;Èî\u0002óû\u0005òCºú\tî\nóö\u000fé\u0007öý<½\u0004ô\u0007ùïû\u0007ûõ>Éúüðö\u0003ö\u000fúë\u0007ï\u0011é\u0007öý<¼\u0005ê\u0012úë\u0007ï\u0011é\u0007öý<Üåê#äõý\u0005\u000bíï\u0005ÿù\u0002þé\u0007öý\u0018éî\ní/Úë\u0007ï\tñ÷QÌÛ\bñ\u0007öý\u001aëä\b\u0004óö*Ð\röö\u0004óö\u000eõ÷\u0006÷÷\u0003\u001a×\u0004ö\u0007é\u000bï=Û\bñ\u0007öý\u001aëä\b\u0004óö*Ð\röö\u0004óöýÿ\u0007þö\u0004ñÿ÷þÿ÷\u0005ýê\t\u0000ê&Ú\u0007ûõ\u0004ûû\u0001è\u0005ô=þí\u001eéþðù\n÷÷\u0003\u001aáö=¸\t\u0000úë\u0007ï\réFÁ÷ö\u000bï\u0000\tñ:»û\u0007ï\ré\u0001ùûA»\të\nïø\u0011ûò\u00033Ûéë\nïø\u0011ûò\u0003\nê÷\u0006ñô1Ïö\u0003\u0006ÿëõQÌÛ\bñ\u0007öý\u001aëä\b\u0004óö*Ð\röö\u0004óö\u000eõ÷\u0006÷÷\u0003\u001a×\u0004ö\u0007é\u000bï=ðþ;Èî\u0002óû\u0005òCÆÿé\u000fûõ÷\u0006÷÷\u00035éÚë\u0007ï\tñ÷2Ðýö\u000fúë-Úóö\u000bï,Õ÷\u0006÷÷\u0003ðþ;Ãôü\u0004÷\u00033Éï\u0006îÿ\u0002\u00012¾ÿ\u0003ì\rë\u0005\u0000îAº\u0000\u0007úúîAÁ÷ö\u000bï\u0000\tñ:°ü\u000bñÛ\bñ\u0007öý\u001aëä\b\u0004óö*Ð\röö\u0004óöýÿ\u0007þö\u0004ñÿ÷þÿ÷\u0005ýê\t\u0000ê&Ú\u0007ûõ\u0004ûû\u0001è\u0005ô?".getBytes("ISO-8859-1"), 0, bArr, 0, 591);
        $$d = bArr;
        $$e = 67;
        $$a = new byte[]{1, -81, 2, 79, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        $$b = 171;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        d = 1;
        b = -6377398940819159759L;
        TuitionPaymentFragmentbindingInflater1 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 5322;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, byte r6, byte r7) {
        /*
            byte[] r0 = com.google.android.play.core.common.PlayCoreDialogWrapperActivity.$$c
            int r6 = r6 * 3
            int r6 = r6 + 1
            int r7 = r7 + 102
            int r5 = r5 * 4
            int r5 = 3 - r5
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r4 = r0[r5]
        L26:
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.common.PlayCoreDialogWrapperActivity.$$g(byte, byte, byte):java.lang.String");
    }
}
