package com.esafirm.imagepicker.features;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.R;
import com.esafirm.imagepicker.features.cameraonly.CameraOnlyConfig;
import com.esafirm.imagepicker.model.Image;
import defpackage.CameraUseCaseAdapter;
import defpackage.ImagePipeline;
import defpackage.JpegBytes2DiskIn;
import defpackage.ViewPortBuilder;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.clearProcessingRequest;
import defpackage.copyFileToMediaStore;
import defpackage.copyTempFileToUri;
import defpackage.createExtraImageCapture;
import defpackage.createPacketWithHalRotation;
import defpackage.createProcessingRequest;
import defpackage.getUpdatedTransform;
import defpackage.initSession;
import defpackage.lambdaprocessInputPacket5;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.submitProcessingRequest;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import kotlin.io.encoding.Base64;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
public class ImagePickerActivity extends AppCompatActivity implements copyFileToMediaStore, JpegBytes2DiskIn {
    private ActionBar TuitionPaymentFragmentbindingInflater1;
    private ImagePickerConfig TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private submitProcessingRequest TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {49, -45, -112, 57};
    private static final int $$f = 120;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {31, 115, -100, -11, -2, -19, 45, -41, -5, -7, 4, 30, -49, -10, 3, 6, -19, 24, -22, -15, 8, -5, -9, 23, -22, 0, -21, 11, -9, 14, -23, 0, -22, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, Base64.padSymbol, -16, -2, 59, -56, -18, 2, -13, -5, 5, -14, 67, -58, -1, -23, 15, 47, -70, -6, -1, -2, -6, Base64.padSymbol, -67, -6, 7, -5, -11, 58, -72, 9, -16, -8, 12, -18, -5, 66, -28, -42, 7, -10, 31, -37, -4, -15, 0, -1, -9, -1, 21, -23, -16, -8, 12, -18, -5, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 63, -56, -3, 1, 21, -15, -15, -13, 12, 2, 9, -23, -18, 0, -1, -13, -3, 7, -10, -3, 33, -41, 4, -13, 12, 9, -23, -18, 0, -1, -13, -3, 7, -10, -3, 33, -41, 4, -13, 34, -41, -10, 11, -17, 0, 9, -15, 55, -2, -19, 47, -56, -3, 1, 24, -26, -21, 17, 13, -21, -23, 0, 47, -57, 17, -12, -7, 7, -5, -14, 3, 14, -26, -21, 17, -18, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, 14, -11, -9, 6, -9, -9, 3, 26, -41, 4, -10, 7, -23, 11, -17, Base64.padSymbol, 0, -1, -16, -4, 0, 57, 1, -63, -9, -10, 11, -17, 0, 9, -15, 58, -57, -2, -6, -9, -1, 47, 0, -40, -23, -11, 7, -28, 81, -50, -23, -11, 7, -28, 34, -32, -10, -1, 11, -6, -16, -2, 59, -56, -18, 2, -13, -5, 5, -14, 67, -58, -1, -23, 15, 47, -71, -8, 12, -20, 12, -8, -9, 3, 53, -72, 9, -12, -6, -9, 11, 51, -39, -40, 12, -20, 12, -8, -9, 3, 34, -51, 3, -16, -2, 59, -61, -12, -4, 4, -9, 3, 51, -55, -17, 6, -18, -1, 2, 1, 50, -61, -10, -10, 65, -63, -9, -10, 11, -17, 0, 9, -15, 58, -67, 4, 0, -22, -6, -1, 9, -12, 4, -13, -10, 66, -80, -4, 9, -8, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62};
    private static final int $$e = 248;
    private static final byte[] $$a = {30, 17, -35, 104, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
    private static final int $$b = 76;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int g = 1;
    private static int b = -83722272;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 1
            int r7 = r7 + 4
            byte[] r1 = com.esafirm.imagepicker.features.ImagePickerActivity.$$a
            int r8 = 103 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r4 = r8
            r3 = r2
            r8 = r7
            goto L26
        L11:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r8]
        L26:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r8 = r8 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esafirm.imagepicker.features.ImagePickerActivity.a(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001e -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.esafirm.imagepicker.features.ImagePickerActivity.$$d
            int r7 = r7 + 4
            int r1 = r8 + 1
            int r6 = 111 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r4 = r2
            goto L28
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L1e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L1e:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L28:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-4)
            r7 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esafirm.imagepicker.features.ImagePickerActivity.d(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Locale locale;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        String str = createPacketWithHalRotation.TuitionPaymentFragmentbindingInflater1;
        Locale locale2 = new Locale((str == null || str.isEmpty()) ? Locale.getDefault().getLanguage() : createPacketWithHalRotation.TuitionPaymentFragmentbindingInflater1);
        String strValueOf = String.valueOf(locale2);
        int i2 = 0;
        if (strValueOf.length() == 5) {
            locale = new Locale(strValueOf.substring(0, 2), strValueOf.substring(3, 5).toUpperCase());
        } else if (strValueOf.equals("zh")) {
            int i3 = g + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 34 / 0;
                if (Locale.getDefault().getCountry().equals("TW")) {
                    locale = new Locale("zh", "TW");
                } else {
                    locale2 = new Locale("zh", "CN");
                    locale = locale2;
                }
            } else if (Locale.getDefault().getCountry().equals("TW")) {
                locale = new Locale("zh", "TW");
            } else {
                locale2 = new Locale("zh", "CN");
                locale = locale2;
            }
        } else {
            locale = locale2;
        }
        Locale.setDefault(locale);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        super.attachBaseContext(context.createConfigurationContext(configuration));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
            int i5 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 23;
            byte[] bArr = $$a;
            short s = bArr[7];
            byte b2 = bArr[91];
            Object[] objArr2 = new Object[1];
            a((byte) 37, s, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, i5, packedPositionGroup, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 29944);
                int iRgb = Color.rgb(0, 0, 0) + 16778971;
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 23;
                Object[] objArr3 = new Object[1];
                a((byte) 52, (short) 37, $$a[91], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iRgb, edgeSlop, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = (((711695537 + (((~(64815298 | i6)) | (268439100 | (~((-277417725) | i6)))) * (-1136))) + ((((~((-277417725) | iIdentityHashCode)) | (~(64815298 | iIdentityHashCode))) | (~(i6 | (-55836675)))) * (-568))) + ((((~(277417724 | i6)) | (~(i6 | (-64815299)))) | (~(iIdentityHashCode | (-268439101)))) * 568)) - 1728048051;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 113, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_status_title).substring(15, 18).length() + 13, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, new char[]{65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 116, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_1).substring(5, 6).codePointAt(0) - 20, new char[]{2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {197235171};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42050 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1726, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -1728048051);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char mirror = (char) (AndroidCharacter.getMirror('0') + 29896);
                    int i10 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int packedPositionGroup2 = 23 - ExpandableListView.getPackedPositionGroup(0L);
                    Object[] objArr8 = new Object[1];
                    a((byte) 52, (short) 37, $$a[91], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror, i10, packedPositionGroup2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 114, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, TextUtils.indexOf("", "") + 7, new char[]{1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    c(true, ((byte) KeyEvent.getModifierMetaStateMask()) + 234, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_description_text).substring(0, 43).codePointAt(30) - 17, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_confirm_button).substring(1, 3).length() + 3, new char[]{'\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char longPressTimeout = (char) (29944 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                        int offsetBefore = 23 - TextUtils.getOffsetBefore("", 0);
                        Object[] objArr11 = new Object[1];
                        a((byte) 52, (short) 89, $$a[91], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout, fadingEdgeLength, offsetBefore, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cBlue = (char) (Color.blue(0) + 29944);
                        int i11 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1754;
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
                        byte[] bArr2 = $$a;
                        Object[] objArr12 = new Object[1];
                        a((byte) 37, bArr2[7], bArr2[91], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, i11, iResolveSizeAndState, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr == null) {
                throw null;
            }
            int i12 = g + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
            int i13 = i12 % 2;
            while (i2 < strArr.length) {
                arrayList.add(strArr[i2]);
                i2++;
            }
            throw null;
        }
        int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i15 = ~iIdentityHashCode2;
        int i16 = i14 + 1132961130 + ((~(267072024 | i15)) * 979) + ((iIdentityHashCode2 | 479674450) * (-979)) + (((~(iIdentityHashCode2 | 267072024)) | (~(i15 | 479674450))) * 979);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr13[3])[0] = i18 ^ (i18 << 5);
        int i19 = g + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
        int i20 = i19 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int iMyTid = (Process.myTid() >> 22) + 1031;
            int size = View.MeasureSpec.getSize(0) + 15;
            Object[] objArr14 = new Object[1];
            a((byte) 52, (short) 141, $$a[91], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mode, iMyTid, size, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_card).substring(0, 1).codePointAt(0) + 146, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 76, 7 - ExpandableListView.getPackedPositionGroup(0L), new char[]{1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483}, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        c(true, 233 - View.resolveSizeAndState(0, 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step1).substring(28, 30).length() + 13, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step5).substring(8, 9).length() + 4, new char[]{'\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534}, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int mode2 = View.MeasureSpec.getMode(0) + 1031;
            int pressedStateDuration = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
            Object[] objArr17 = new Object[1];
            a((byte) 52, (short) 37, $$a[91], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(windowTouchSlop, mode2, pressedStateDuration, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                int iAlpha = Color.alpha(0) + 1031;
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
                byte[] bArr3 = $$a;
                byte b3 = bArr3[7];
                Object[] objArr18 = new Object[1];
                a(b3, (short) (b3 | 193), (byte) (bArr3[88] - 1), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cAxisFromString, iAlpha, scrollDefaultDelay, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr19[3])[0];
            int i22 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i23 = 1866967784 + (((~((-685249490) | iIdentityHashCode3)) | 546313104) * 345) + (((~((-685249490) | (~iIdentityHashCode3))) | (-987282424)) * 345) + ((~(iIdentityHashCode3 | (-546313105))) * 345) + 706246412;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr[2])[0] = i25 ^ (i25 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step2).substring(28, 29).codePointAt(0) + 131, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unknown_error_while_decrypting_response).substring(0, 39).length() - 23, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3, new char[]{65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20}, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            c(true, ExpandableListView.getPackedPositionGroup(0L) + 232, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step1).substring(2, 4).codePointAt(1) - 85, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, new char[]{2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501}, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {197235171};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 1134, 18 - (ViewConfiguration.getWindowTouchSlop() >> 8), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 706246412, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int iRed = 1031 - Color.red(0);
                int iCombineMeasuredStates = 15 - View.combineMeasuredStates(0, 0);
                Object[] objArr24 = new Object[1];
                a((byte) 52, (short) 141, $$a[91], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cCombineMeasuredStates, iRed, iCombineMeasuredStates, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getTouchSlop() >> 8)), MotionEvent.axisFromString("") + 1118, 17 - Color.blue(0)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int scrollBarFadeDuration = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte[] bArr4 = $$a;
                byte b4 = bArr4[7];
                Object[] objArr25 = new Object[1];
                a(b4, (short) (b4 | 193), (byte) (bArr4[88] - 1), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c, scrollBarFadeDuration, iLastIndexOf, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step4).substring(76, 78).length() + 227, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 29, new char[]{1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 127, (ViewConfiguration.getJumpTapTimeout() >> 16) + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto7_bni).substring(105, 113).codePointAt(6) - 104, new char[]{'\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cRed = (char) Color.red(0);
                    int iIndexOf = 1031 - TextUtils.indexOf("", "");
                    int iIndexOf2 = 14 - TextUtils.indexOf((CharSequence) "", '0');
                    Object[] objArr28 = new Object[1];
                    a((byte) 52, (short) 37, $$a[91], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRed, iIndexOf, iIndexOf2, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                    int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
                    int iGreen = Color.green(0) + 15;
                    Object[] objArr29 = new Object[1];
                    a((byte) 52, (short) 141, $$a[91], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c2, trimmedLength, iGreen, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i26 = ((int[]) objArr[1])[0];
        int i27 = ((int[]) objArr[3])[0];
        if (i27 != i26) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
                g = i28 % 128;
                int i29 = i28 % 2;
                while (i2 < strArr3.length) {
                    arrayList2.add(strArr3[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i27));
        }
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i30 = ((int[]) objArr[2])[0];
        int i31 = ((int[]) objArr[3])[0];
        int i32 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i33 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        int i34 = i30 + 373476489 + (((~(i33 | 871645921)) | 67147030) * (-160)) + (((~(i33 | 627365751)) | 871645921) * 160);
        int i35 = (i34 << 13) ^ i34;
        int i36 = i35 ^ (i35 >>> 17);
        ((int[]) objArr30[2])[0] = i36 ^ (i36 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x016e  */
    /* JADX WARN: Code duplicated, block: B:33:0x016f  */
    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        long j;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            j = 0;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            int i6 = $11 + 43;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (KeyEvent.getMaxKeyCode() >> 16) + 3291, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, 1199271174, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 651 - (KeyEvent.getMaxKeyCode() >> 16), 44 - (ViewConfiguration.getTapTimeout() >> 16), -450685997, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i9 = $10 + 37;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i11 = $10 + 53;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), 652 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 44, -450685997, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
                j = 0;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:147:0x1008  */
    /* JADX WARN: Code duplicated, block: B:148:0x10a2  */
    /* JADX WARN: Code duplicated, block: B:151:0x1137  */
    /* JADX WARN: Code duplicated, block: B:154:0x1183  */
    /* JADX WARN: Code duplicated, block: B:156:0x118c  */
    /* JADX WARN: Code duplicated, block: B:158:0x1258  */
    /* JADX WARN: Code duplicated, block: B:160:0x125f  */
    /* JADX WARN: Code duplicated, block: B:162:0x1272  */
    /* JADX WARN: Code duplicated, block: B:168:0x1282  */
    /* JADX WARN: Code duplicated, block: B:172:0x1320  */
    /* JADX WARN: Code duplicated, block: B:174:0x1333  */
    /* JADX WARN: Code duplicated, block: B:179:0x13a3  */
    /* JADX WARN: Code duplicated, block: B:180:0x13e6  */
    /* JADX WARN: Code duplicated, block: B:183:0x1402  */
    /* JADX WARN: Code duplicated, block: B:187:0x144b  */
    /* JADX WARN: Code duplicated, block: B:191:0x1463  */
    /* JADX WARN: Code duplicated, block: B:193:0x14de  */
    /* JADX WARN: Code duplicated, block: B:197:0x1512 A[Catch: all -> 0x3952, TryCatch #1 {all -> 0x3952, blocks: (B:195:0x150c, B:197:0x1512, B:198:0x1540, B:393:0x2c26, B:395:0x2c3b, B:396:0x2c6b, B:353:0x27ac, B:355:0x27c1, B:356:0x27f6, B:358:0x2833, B:359:0x28b5, B:302:0x22d9, B:304:0x22df, B:305:0x230c, B:307:0x2337, B:308:0x23c6, B:214:0x16f5, B:216:0x170a, B:217:0x1737, B:219:0x176b, B:220:0x17e4), top: B:591:0x150c }] */
    /* JADX WARN: Code duplicated, block: B:201:0x1552  */
    /* JADX WARN: Code duplicated, block: B:204:0x15ba  */
    /* JADX WARN: Code duplicated, block: B:205:0x15ff  */
    /* JADX WARN: Code duplicated, block: B:208:0x1616  */
    /* JADX WARN: Code duplicated, block: B:210:0x161f  */
    /* JADX WARN: Code duplicated, block: B:213:0x16d7  */
    /* JADX WARN: Code duplicated, block: B:216:0x170a A[Catch: all -> 0x3952, TryCatch #1 {all -> 0x3952, blocks: (B:195:0x150c, B:197:0x1512, B:198:0x1540, B:393:0x2c26, B:395:0x2c3b, B:396:0x2c6b, B:353:0x27ac, B:355:0x27c1, B:356:0x27f6, B:358:0x2833, B:359:0x28b5, B:302:0x22d9, B:304:0x22df, B:305:0x230c, B:307:0x2337, B:308:0x23c6, B:214:0x16f5, B:216:0x170a, B:217:0x1737, B:219:0x176b, B:220:0x17e4), top: B:591:0x150c }] */
    /* JADX WARN: Code duplicated, block: B:219:0x176b A[Catch: all -> 0x3952, TryCatch #1 {all -> 0x3952, blocks: (B:195:0x150c, B:197:0x1512, B:198:0x1540, B:393:0x2c26, B:395:0x2c3b, B:396:0x2c6b, B:353:0x27ac, B:355:0x27c1, B:356:0x27f6, B:358:0x2833, B:359:0x28b5, B:302:0x22d9, B:304:0x22df, B:305:0x230c, B:307:0x2337, B:308:0x23c6, B:214:0x16f5, B:216:0x170a, B:217:0x1737, B:219:0x176b, B:220:0x17e4), top: B:591:0x150c }] */
    /* JADX WARN: Code duplicated, block: B:223:0x17f7  */
    /* JADX WARN: Code duplicated, block: B:228:0x1866  */
    /* JADX WARN: Code duplicated, block: B:231:0x18bc  */
    /* JADX WARN: Code duplicated, block: B:235:0x1915  */
    /* JADX WARN: Code duplicated, block: B:237:0x19a7  */
    /* JADX WARN: Code duplicated, block: B:240:0x1a13  */
    /* JADX WARN: Code duplicated, block: B:241:0x1a57  */
    /* JADX WARN: Code duplicated, block: B:244:0x1a6d  */
    /* JADX WARN: Code duplicated, block: B:246:0x1a76  */
    /* JADX WARN: Code duplicated, block: B:248:0x1b55  */
    /* JADX WARN: Code duplicated, block: B:250:0x1b5c  */
    /* JADX WARN: Code duplicated, block: B:251:0x1b70  */
    /* JADX WARN: Code duplicated, block: B:253:0x1b74  */
    /* JADX WARN: Code duplicated, block: B:255:0x1b78  */
    /* JADX WARN: Code duplicated, block: B:257:0x1b84  */
    /* JADX WARN: Code duplicated, block: B:260:0x1b8e  */
    /* JADX WARN: Code duplicated, block: B:261:0x1b90  */
    /* JADX WARN: Code duplicated, block: B:264:0x1b9f A[PHI: r1
  0x1b9f: PHI (r1v304 android.content.Context) = (r1v303 android.content.Context), (r1v323 android.content.Context) binds: [B:252:0x1b72, B:260:0x1b8e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:269:0x1d3b  */
    /* JADX WARN: Code duplicated, block: B:271:0x1d44  */
    /* JADX WARN: Code duplicated, block: B:276:0x1da9  */
    /* JADX WARN: Code duplicated, block: B:277:0x1dec  */
    /* JADX WARN: Code duplicated, block: B:280:0x1e04  */
    /* JADX WARN: Code duplicated, block: B:284:0x1e57  */
    /* JADX WARN: Code duplicated, block: B:288:0x1e6b  */
    /* JADX WARN: Code duplicated, block: B:290:0x212b  */
    /* JADX WARN: Code duplicated, block: B:293:0x2196  */
    /* JADX WARN: Code duplicated, block: B:294:0x21da  */
    /* JADX WARN: Code duplicated, block: B:297:0x21ef  */
    /* JADX WARN: Code duplicated, block: B:299:0x21f8  */
    /* JADX WARN: Code duplicated, block: B:301:0x22d5  */
    /* JADX WARN: Code duplicated, block: B:304:0x22df A[Catch: all -> 0x3952, TryCatch #1 {all -> 0x3952, blocks: (B:195:0x150c, B:197:0x1512, B:198:0x1540, B:393:0x2c26, B:395:0x2c3b, B:396:0x2c6b, B:353:0x27ac, B:355:0x27c1, B:356:0x27f6, B:358:0x2833, B:359:0x28b5, B:302:0x22d9, B:304:0x22df, B:305:0x230c, B:307:0x2337, B:308:0x23c6, B:214:0x16f5, B:216:0x170a, B:217:0x1737, B:219:0x176b, B:220:0x17e4), top: B:591:0x150c }] */
    /* JADX WARN: Code duplicated, block: B:307:0x2337 A[Catch: all -> 0x3952, TryCatch #1 {all -> 0x3952, blocks: (B:195:0x150c, B:197:0x1512, B:198:0x1540, B:393:0x2c26, B:395:0x2c3b, B:396:0x2c6b, B:353:0x27ac, B:355:0x27c1, B:356:0x27f6, B:358:0x2833, B:359:0x28b5, B:302:0x22d9, B:304:0x22df, B:305:0x230c, B:307:0x2337, B:308:0x23c6, B:214:0x16f5, B:216:0x170a, B:217:0x1737, B:219:0x176b, B:220:0x17e4), top: B:591:0x150c }] */
    /* JADX WARN: Code duplicated, block: B:311:0x23d9  */
    /* JADX WARN: Code duplicated, block: B:316:0x2443  */
    /* JADX WARN: Code duplicated, block: B:319:0x249c  */
    /* JADX WARN: Code duplicated, block: B:323:0x24ee  */
    /* JADX WARN: Code duplicated, block: B:324:0x2586  */
    /* JADX WARN: Code duplicated, block: B:326:0x2592  */
    /* JADX WARN: Code duplicated, block: B:329:0x2596 A[LOOP:3: B:327:0x2593->B:329:0x2596, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:333:0x263c  */
    /* JADX WARN: Code duplicated, block: B:336:0x2692  */
    /* JADX WARN: Code duplicated, block: B:338:0x26a6  */
    /* JADX WARN: Code duplicated, block: B:341:0x275c  */
    /* JADX WARN: Code duplicated, block: B:343:0x2763  */
    /* JADX WARN: Code duplicated, block: B:345:0x2776  */
    /* JADX WARN: Code duplicated, block: B:351:0x2786  */
    /* JADX WARN: Code duplicated, block: B:355:0x27c1 A[Catch: all -> 0x3952, TryCatch #1 {all -> 0x3952, blocks: (B:195:0x150c, B:197:0x1512, B:198:0x1540, B:393:0x2c26, B:395:0x2c3b, B:396:0x2c6b, B:353:0x27ac, B:355:0x27c1, B:356:0x27f6, B:358:0x2833, B:359:0x28b5, B:302:0x22d9, B:304:0x22df, B:305:0x230c, B:307:0x2337, B:308:0x23c6, B:214:0x16f5, B:216:0x170a, B:217:0x1737, B:219:0x176b, B:220:0x17e4), top: B:591:0x150c }] */
    /* JADX WARN: Code duplicated, block: B:358:0x2833 A[Catch: all -> 0x3952, TryCatch #1 {all -> 0x3952, blocks: (B:195:0x150c, B:197:0x1512, B:198:0x1540, B:393:0x2c26, B:395:0x2c3b, B:396:0x2c6b, B:353:0x27ac, B:355:0x27c1, B:356:0x27f6, B:358:0x2833, B:359:0x28b5, B:302:0x22d9, B:304:0x22df, B:305:0x230c, B:307:0x2337, B:308:0x23c6, B:214:0x16f5, B:216:0x170a, B:217:0x1737, B:219:0x176b, B:220:0x17e4), top: B:591:0x150c }] */
    /* JADX WARN: Code duplicated, block: B:361:0x28c0  */
    /* JADX WARN: Code duplicated, block: B:363:0x28c9  */
    /* JADX WARN: Code duplicated, block: B:368:0x2936  */
    /* JADX WARN: Code duplicated, block: B:369:0x2980  */
    /* JADX WARN: Code duplicated, block: B:372:0x299a  */
    /* JADX WARN: Code duplicated, block: B:376:0x29ec  */
    /* JADX WARN: Code duplicated, block: B:380:0x2a03  */
    /* JADX WARN: Code duplicated, block: B:381:0x2a6c  */
    /* JADX WARN: Code duplicated, block: B:384:0x2afd  */
    /* JADX WARN: Code duplicated, block: B:387:0x2b4c  */
    /* JADX WARN: Code duplicated, block: B:389:0x2b55  */
    /* JADX WARN: Code duplicated, block: B:392:0x2c06  */
    /* JADX WARN: Code duplicated, block: B:395:0x2c3b A[Catch: all -> 0x3952, TryCatch #1 {all -> 0x3952, blocks: (B:195:0x150c, B:197:0x1512, B:198:0x1540, B:393:0x2c26, B:395:0x2c3b, B:396:0x2c6b, B:353:0x27ac, B:355:0x27c1, B:356:0x27f6, B:358:0x2833, B:359:0x28b5, B:302:0x22d9, B:304:0x22df, B:305:0x230c, B:307:0x2337, B:308:0x23c6, B:214:0x16f5, B:216:0x170a, B:217:0x1737, B:219:0x176b, B:220:0x17e4), top: B:591:0x150c }] */
    /* JADX WARN: Code duplicated, block: B:399:0x2c85  */
    /* JADX WARN: Code duplicated, block: B:404:0x2cf2  */
    /* JADX WARN: Code duplicated, block: B:405:0x2d35  */
    /* JADX WARN: Code duplicated, block: B:408:0x2d4f  */
    /* JADX WARN: Code duplicated, block: B:412:0x2da6  */
    /* JADX WARN: Code duplicated, block: B:414:0x2e23  */
    /* JADX WARN: Code duplicated, block: B:417:0x2e6e  */
    /* JADX WARN: Code duplicated, block: B:419:0x2e77  */
    /* JADX WARN: Code duplicated, block: B:422:0x2f45  */
    /* JADX WARN: Code duplicated, block: B:426:0x2fe0  */
    /* JADX WARN: Code duplicated, block: B:431:0x304f  */
    /* JADX WARN: Code duplicated, block: B:432:0x3097  */
    /* JADX WARN: Code duplicated, block: B:435:0x30b1  */
    /* JADX WARN: Code duplicated, block: B:439:0x310b  */
    /* JADX WARN: Code duplicated, block: B:440:0x3177  */
    /* JADX WARN: Code duplicated, block: B:442:0x3183  */
    /* JADX WARN: Code duplicated, block: B:445:0x3187 A[LOOP:1: B:443:0x3184->B:445:0x3187, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:449:0x3227  */
    /* JADX WARN: Code duplicated, block: B:452:0x3274  */
    /* JADX WARN: Code duplicated, block: B:454:0x327d  */
    /* JADX WARN: Code duplicated, block: B:457:0x334d  */
    /* JADX WARN: Code duplicated, block: B:459:0x3354  */
    /* JADX WARN: Code duplicated, block: B:461:0x3367  */
    /* JADX WARN: Code duplicated, block: B:463:0x336b  */
    /* JADX WARN: Code duplicated, block: B:466:0x337f  */
    /* JADX WARN: Code duplicated, block: B:467:0x3381  */
    /* JADX WARN: Code duplicated, block: B:472:0x3423  */
    /* JADX WARN: Code duplicated, block: B:477:0x348f  */
    /* JADX WARN: Code duplicated, block: B:480:0x34e9  */
    /* JADX WARN: Code duplicated, block: B:484:0x3544  */
    /* JADX WARN: Code duplicated, block: B:509:0x3891  */
    /* JADX WARN: Code duplicated, block: B:512:0x389c  */
    /* JADX WARN: Code duplicated, block: B:514:0x38aa  */
    /* JADX WARN: Code duplicated, block: B:517:0x38ae A[LOOP:0: B:515:0x38ab->B:517:0x38ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:524:0x38c8  */
    /* JADX WARN: Code duplicated, block: B:526:0x38d6  */
    /* JADX WARN: Code duplicated, block: B:528:0x38e2  */
    /* JADX WARN: Code duplicated, block: B:529:0x38e4  */
    /* JADX WARN: Code duplicated, block: B:532:0x38e8 A[LOOP:2: B:530:0x38e5->B:532:0x38e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:539:0x390a  */
    /* JADX WARN: Code duplicated, block: B:541:0x3918  */
    /* JADX WARN: Code duplicated, block: B:544:0x391c A[LOOP:4: B:542:0x3919->B:544:0x391c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:547:0x3926  */
    /* JADX WARN: Code duplicated, block: B:549:0x3934  */
    /* JADX WARN: Code duplicated, block: B:552:0x3938 A[LOOP:5: B:550:0x3935->B:552:0x3938, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:562:0x395d  */
    /* JADX WARN: Code duplicated, block: B:564:0x396b  */
    /* JADX WARN: Code duplicated, block: B:567:0x396f A[LOOP:6: B:565:0x396c->B:567:0x396f, LOOP_END] */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        String str;
        Object[] objArr;
        Object[] objArr2;
        int i;
        String str2;
        Object[] objArr3;
        String str3;
        Object[] objArr4;
        int i2;
        int i3;
        String str4;
        int i4;
        Object[] objArr5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Context baseContext;
        String str5;
        Object[] objArr6;
        Object[] objArr7;
        char c;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        ArrayList arrayList;
        String[] strArr;
        int i5;
        Object[] objArr8;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
        long j;
        long jLongValue;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
        Object[] objArr9;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15;
        int i6;
        int i7;
        ArrayList arrayList2;
        String[] strArr2;
        int i8;
        Object[] objArr10;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16;
        long j2;
        long jLongValue2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17;
        Context baseContext2;
        String str6;
        Object[] objArr11;
        Object[] objArr12;
        Object[] objArr13;
        char c2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20;
        int i9;
        ArrayList arrayList3;
        String[] strArr3;
        int i10;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21;
        long j3;
        long jLongValue3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24;
        Object[] objArr14;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList4;
        String[] strArr4;
        Object[] objArr15;
        int i14;
        int i15;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28;
        Context baseContext3;
        String str7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30;
        Object[] objArr16;
        Object[] objArr17;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33;
        int i16;
        int i17;
        Object[] objArr18;
        int i18;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38;
        Object[] objArr19;
        int i19;
        int i20;
        ArrayList arrayList5;
        String[] strArr5;
        int i21;
        int i22;
        Object[] objArr20;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42;
        Object[] objArr21;
        int i23;
        int i24;
        ArrayList arrayList6;
        String[] strArr6;
        Object[] objArr22;
        int i25;
        int i26;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43;
        Context baseContext4;
        Object[] objArr23;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46;
        ArrayList arrayList7;
        String[] strArr7;
        int i27;
        Intent intent;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54;
        int i28 = 2 % 2;
        Object[] objArr24 = new Object[1];
        c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step3).substring(0, 3).length() + 226, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step2).substring(8, 9).length() + 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step2).substring(1, 3).length() + 5, new char[]{1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483}, objArr24);
        String str8 = (String) objArr24[0];
        Object[] objArr25 = new Object[1];
        c(true, 233 - View.combineMeasuredStates(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 31, new char[]{'\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534}, objArr25);
        String str9 = (String) objArr25[0];
        Object[] objArr26 = new Object[1];
        c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step6).substring(6, 7).length() + 227, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_gif).substring(0, 3).codePointAt(2) - 54, 2 - View.MeasureSpec.getSize(0), new char[]{65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20}, objArr26);
        String str10 = (String) objArr26[0];
        Object[] objArr27 = new Object[1];
        c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 196, TextUtils.lastIndexOf("", '0', 0) + 17, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_1).substring(1, 3).codePointAt(1) - 93, new char[]{2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501}, objArr27);
        String str11 = (String) objArr27[0];
        Object[] objArr28 = new Object[1];
        c(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 218, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 10, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unknown_error_encryption).substring(0, 47).codePointAt(2) - 105, new char[]{65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2}, objArr28);
        String str12 = (String) objArr28[0];
        Object[] objArr29 = new Object[1];
        c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 200, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 7, new char[]{4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529}, objArr29);
        String str13 = (String) objArr29[0];
        int i29 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_title).substring(18, 19).codePointAt(0) - 349438074;
        int i30 = ~iCodePointAt;
        if (i29 != 1823967272 + ((~(430125708 | i30)) * (-560)) + ((~(iCodePointAt | 1539047407)) * (-560)) + (((~((-1260113252) | i30)) | 151191552) * 560)) {
            int i31 = (-1384608930) % 2;
            throw new ArithmeticException();
        }
        int i32 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i33 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i34 = ~((-1983388217) | i33);
        int i35 = ~i33;
        int i36 = (~(i35 | 595667748)) | i34;
        int i37 = ~(1983388216 | i35);
        if (i32 != 1383279020 + ((i36 | i37) * (-516)) + (((~((-570427937) | i33)) | (~((-25239813) | i35))) * 516) + ((25239812 | i37) * 516)) {
            throw new RuntimeException("474615188");
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
            int i38 = 877 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iRgb = Color.rgb(0, 0, 0) + 16777226;
            byte[] bArr = $$a;
            Object[] objArr30 = new Object[1];
            a((byte) 37, bArr[7], bArr[91], objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cLastIndexOf, i38, iRgb, -1650998592, false, (String) objArr30[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).getLong(null);
        long jLongValue4 = ((Long) Class.forName(str8).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 876;
            int iCombineMeasuredStates = 10 - View.combineMeasuredStates(0, 0);
            Object[] objArr31 = new Object[1];
            a((byte) 52, (short) 37, $$a[91], objArr31);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cResolveOpacity, deadChar, iCombineMeasuredStates, 2012020043, false, (String) objArr31[0], null);
        }
        if (j4 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iResolveOpacity = 876 - Drawable.resolveOpacity(0, 0);
                int defaultSize = 10 - View.getDefaultSize(0, 0);
                Object[] objArr32 = new Object[1];
                a((byte) 52, (short) 141, $$a[91], objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(maximumFlingVelocity, iResolveOpacity, defaultSize, 2012931276, false, (String) objArr32[0], null);
            }
            Object[] objArr33 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr33[0])[0]}, new int[1], new int[]{((int[]) objArr33[2])[0]}, (String[]) objArr33[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i39 = 1615783924 + (((~((-50405482) | (~startElapsedRealtime))) | (~((-10095253) | startElapsedRealtime))) * (-272)) + (((~((-252010860) | startElapsedRealtime)) | 201605378) * (-272)) + (((~(startElapsedRealtime | 252010859)) | (-211700631)) * 272) + 1033483979;
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr[1])[0] = i41 ^ (i41 << 5);
            str = str9;
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str12).getMethod(str13, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
            }
            try {
                Object[] objArr34 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue()), 0, 1033483979};
                byte[] bArr2 = $$d;
                byte b2 = bArr2[20];
                short s = bArr2[55];
                Object[] objArr35 = new Object[1];
                d(b2, s, (byte) (s & 29), objArr35);
                Class<?> cls = Class.forName((String) objArr35[0]);
                Object[] objArr36 = new Object[1];
                d((byte) (bArr2[39] + 1), (short) (-bArr2[41]), (byte) (bArr2[368] - 1), objArr36);
                Object[] objArr37 = (Object[]) cls.getMethod((String) objArr36[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr34);
                if (baseContext5 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                        char cResolveSize = (char) View.resolveSize(0, 0);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 876;
                        int iRgb2 = Color.rgb(0, 0, 0) + 16777226;
                        Object[] objArr38 = new Object[1];
                        a((byte) 52, (short) 141, $$a[91], objArr38);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cResolveSize, trimmedLength, iRgb2, 2012931276, false, (String) objArr38[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, objArr37);
                    try {
                        str = str9;
                        long jLongValue5 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue5);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                            char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 876;
                            int capsMode = 10 - TextUtils.getCapsMode("", 0, 0);
                            Object[] objArr39 = new Object[1];
                            a((byte) 52, (short) 37, $$a[91], objArr39);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(bitsPerPixel, offsetBefore, capsMode, 2012020043, false, (String) objArr39[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue5 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                            char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 877;
                            int size = View.MeasureSpec.getSize(0) + 10;
                            byte[] bArr3 = $$a;
                            Object[] objArr40 = new Object[1];
                            a((byte) 37, bArr3[7], bArr3[91], objArr40);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(c3, iLastIndexOf, size, -1650998592, false, (String) objArr40[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr37 = objArr37;
                    str = str9;
                }
                objArr = objArr37;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i42 = ((int[]) objArr[2])[0];
        int i43 = ((int[]) objArr[0])[0];
        if (i43 == i42) {
            int i44 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i45 = ~System.identityHashCode(this);
            int i46 = i44 + (((1213162868 + (((~(i45 | 536850175)) | (~((-476349457) | i45))) * (-184))) + (((50405474 | (~((-526754931) | i45))) | (~(486444701 | i45))) * 184)) - 1857525264);
            int i47 = (i46 << 13) ^ i46;
            int i48 = i47 ^ (i47 >>> 17);
            i = 0;
            ((int[]) objArr2[1])[0] = i48 ^ (i48 << 5);
        } else {
            Toast.makeText((Context) null, i43 / (((i43 - 1) * i43) % 2), 0).show();
            int i49 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i50 = i49 + 956575104 + (((~(333994308 | startUptimeMillis)) | 27267140) * (-502)) + ((~((~startUptimeMillis) | 401571677)) * (-502)) + (((~(startUptimeMillis | (-374304538))) | 333994308) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i51 = i50 ^ (i50 << 13);
            int i52 = i51 ^ (i51 >>> 17);
            i = 0;
            ((int[]) objArr2[1])[0] = i52 ^ (i52 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(i, i, i);
            int iAxisFromString = MotionEvent.axisFromString("") + 877;
            int iAlpha = 10 - Color.alpha(i);
            byte[] bArr4 = $$a;
            Object[] objArr41 = new Object[1];
            a(bArr4[9], (short) 193, bArr4[88], objArr41);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cResolveSizeAndState, iAxisFromString, iAlpha, -1199417970, false, (String) objArr41[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).getLong(null);
        long jLongValue6 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
            char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
            int iAlpha2 = Color.alpha(0) + 876;
            int i53 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte[] bArr5 = $$a;
            byte b3 = bArr5[7];
            Object[] objArr42 = new Object[1];
            a(b3, (short) (b3 | 203), bArr5[14], objArr42);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(trimmedLength2, iAlpha2, i53, 254769921, false, (String) objArr42[0], null);
        }
        if (j5 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int iKeyCodeFromString = 876 - KeyEvent.keyCodeFromString("");
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 11;
                byte[] bArr6 = $$a;
                Object[] objArr43 = new Object[1];
                a(bArr6[78], (short) 203, bArr6[88], objArr43);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(edgeSlop, iKeyCodeFromString, modifierMetaStateMask, 1324201839, false, (String) objArr43[0], null);
            }
            Object[] objArr44 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr44[0])[0]}, new int[1], new int[]{((int[]) objArr44[2])[0]}, (String[]) objArr44[3]};
            str2 = "currentApplication";
            int i54 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str2, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i55 = ~i54;
            int i56 = (((1858126516 + (((~(232604678 | i55)) | 268442073) * 168)) + ((~((-268442074) | i54)) * 168)) + (((~(i54 | 501046751)) | ((~(i55 | (-272914908))) | 4472834)) * 168)) - 226326622;
            int i57 = (i56 << 13) ^ i56;
            int i58 = i57 ^ (i57 >>> 17);
            ((int[]) objArr3[1])[0] = i58 ^ (i58 << 5);
        } else {
            str2 = r10;
            Object[] objArr45 = {Integer.valueOf(((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue()), -226326622};
            byte[] bArr7 = $$d;
            Object[] objArr46 = new Object[1];
            d(bArr7[117], (short) (-bArr7[430]), bArr7[238], objArr46);
            Class<?> cls2 = Class.forName((String) objArr46[0]);
            Object[] objArr47 = new Object[1];
            d((byte) (bArr7[39] + 1), (short) 135, (byte) (bArr7[368] - 1), objArr47);
            Object[] objArr48 = (Object[]) cls2.getMethod((String) objArr47[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr45);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 877;
                int i59 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr8 = $$a;
                Object[] objArr49 = new Object[1];
                a(bArr8[78], (short) 203, bArr8[88], objArr49);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(offsetAfter, packedPositionChild, i59, 1324201839, false, (String) objArr49[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, objArr48);
            try {
                long jLongValue7 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue7);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char c4 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int scrollDefaultDelay = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte[] bArr9 = $$a;
                    byte b4 = bArr9[7];
                    Object[] objArr50 = new Object[1];
                    a(b4, (short) (b4 | 203), bArr9[14], objArr50);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(c4, iIndexOf, scrollDefaultDelay, 254769921, false, (String) objArr50[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue7 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                    char trimmedLength3 = (char) TextUtils.getTrimmedLength("");
                    int iRed = 876 - Color.red(0);
                    int i60 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte[] bArr10 = $$a;
                    Object[] objArr51 = new Object[1];
                    a(bArr10[9], (short) 193, bArr10[88], objArr51);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(trimmedLength3, iRed, i60, -1199417970, false, (String) objArr51[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).set(null, lValueOf4);
                objArr3 = objArr48;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr3[0])[0] != ((int[]) objArr3[2])[0]) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr8 = (String[]) objArr3[3];
            if (strArr8 != null) {
                for (String str14 : strArr8) {
                    arrayList8.add(str14);
                }
            }
            throw null;
        }
        int i61 = ((int[]) objArr3[1])[0];
        Object[] objArr52 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i62 = i61 + (-773709920) + (((~(49101356 | iIdentityHashCode)) | 44640812) * (-502)) + ((~((~iIdentityHashCode) | 134052397)) * (-502)) + (((~(iIdentityHashCode | (-89411586))) | 49101356) * TypedValues.PositionType.TYPE_DRAWPATH);
        int i63 = (i62 << 13) ^ i62;
        int i64 = i63 ^ (i63 >>> 17);
        ((int[]) objArr52[1])[0] = i64 ^ (i64 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
            char c5 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int threadPriority = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
            int i65 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte[] bArr11 = $$a;
            byte b5 = bArr11[7];
            Object[] objArr53 = new Object[1];
            a(b5, (short) (b5 | 193), (byte) (bArr11[88] - 1), objArr53);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(c5, threadPriority, i65, 252381699, false, (String) objArr53[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).getLong(null);
        long jLongValue8 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
            char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
            int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
            int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 10;
            Object[] objArr54 = new Object[1];
            a((byte) 52, (short) 89, $$a[91], objArr54);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(offsetBefore2, scrollDefaultDelay2, offsetAfter2, 2009631821, false, (String) objArr54[0], null);
        }
        if (j6 != ((jLongValue8 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).getLong(null) << 52) >>> 52)) >> 12)) {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                baseContext6 = (Context) Class.forName(str12).getMethod(str3, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                str3 = str13;
                if ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) {
                    str3 = str13;
                    baseContext6 = null;
                } else {
                    str3 = str13;
                    str3 = str13;
                    baseContext6 = baseContext6.getApplicationContext();
                }
            }
            str3 = str13;
            str3 = str13;
            Object[] objArr55 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue()), 1893998054};
            byte[] bArr12 = $$d;
            byte b6 = bArr12[100];
            Object[] objArr56 = new Object[1];
            d((byte) (b6 - 1), (short) 187, b6, objArr56);
            Class<?> cls3 = Class.forName((String) objArr56[0]);
            Object[] objArr57 = new Object[1];
            d((byte) (bArr12[39] + 1), (short) 135, (byte) (bArr12[368] - 1), objArr57);
            objArr4 = (Object[]) cls3.getMethod((String) objArr57[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr55);
            if (baseContext6 != null) {
                int i66 = g + 25;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i66 % 128;
                try {
                    if (i66 % 2 != 0) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                            char c6 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                            int i67 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int scrollBarFadeDuration = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            byte b7 = $$a[7];
                            byte b8 = b7;
                            Object[] objArr58 = new Object[1];
                            a(b8, (short) (b8 | 210), b7, objArr58);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(c6, i67, scrollBarFadeDuration, 256017550, false, (String) objArr58[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, objArr4);
                        long jLongValue9 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[1]).invoke(null, new Object[1])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue9);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                            int windowTouchSlop = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int gidForName = Process.getGidForName("") + 11;
                            Object[] objArr59 = new Object[1];
                            a((byte) 52, (short) 89, $$a[91], objArr59);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cKeyCodeFromString, windowTouchSlop, gidForName, 2009631821, false, (String) objArr59[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue9 << 27);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int keyRepeatTimeout = 876 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 10;
                            byte[] bArr13 = $$a;
                            byte b9 = bArr13[7];
                            Object[] objArr60 = new Object[1];
                            a(b9, (short) (b9 | 193), (byte) (bArr13[88] - 1), objArr60);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(maximumDrawingCacheSize, keyRepeatTimeout, iResolveOpacity2, 252381699, false, (String) objArr60[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf6);
                    } else {
                        str11 = str11;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                            char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int offsetAfter3 = TextUtils.getOffsetAfter("", 0) + 876;
                            int size2 = View.MeasureSpec.getSize(0) + 10;
                            byte b10 = $$a[7];
                            byte b11 = b10;
                            Object[] objArr61 = new Object[1];
                            a(b11, (short) (b11 | 210), b10, objArr61);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(maximumFlingVelocity2, offsetAfter3, size2, 256017550, false, (String) objArr61[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, objArr4);
                        long jLongValue10 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf7 = Long.valueOf(jLongValue10);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
                            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                            int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
                            int touchSlop = 10 - (ViewConfiguration.getTouchSlop() >> 8);
                            Object[] objArr62 = new Object[1];
                            a((byte) 52, (short) 89, $$a[91], objArr62);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(maxKeyCode, scrollBarFadeDuration2, touchSlop, 2009631821, false, (String) objArr62[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).set(null, lValueOf7);
                        Long lValueOf8 = Long.valueOf(jLongValue10 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault74 == null) {
                            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int scrollBarFadeDuration3 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
                            int iIndexOf2 = 10 - TextUtils.indexOf("", "", 0, 0);
                            byte[] bArr14 = $$a;
                            byte b12 = bArr14[7];
                            Object[] objArr63 = new Object[1];
                            a(b12, (short) (b12 | 193), (byte) (bArr14[88] - 1), objArr63);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.b(doubleTapTimeout, scrollBarFadeDuration3, iIndexOf2, 252381699, false, (String) objArr63[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault74).set(null, lValueOf8);
                    }
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            }
            i2 = ((int[]) objArr4[2])[0];
            i3 = ((int[]) objArr4[0])[0];
            if (i3 == i2) {
                int i68 = g + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i68 % 128;
                int i69 = i68 % 2;
                int i70 = ((int[]) objArr4[1])[0];
                objArr5 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
                str4 = str2;
                int i71 = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
                int i72 = ~((-138051878) | i71);
                int i73 = (-1308334500) + ((1179904 | i72) * (-280)) + ((i72 | (~(97741648 | i71))) * 140);
                int i74 = ~((-136871974) | i71);
                int i75 = ~i71;
                int i76 = i70 + i73 + (((~(i75 | 234613621)) | i74 | (~((-1179905) | i75))) * 140);
                int i77 = i76 ^ (i76 << 13);
                int i78 = i77 ^ (i77 >>> 17);
                ((int[]) objArr5[1])[0] = i78 ^ (i78 << 5);
                i4 = 1;
            } else {
                str4 = str2;
                int[] iArr = new int[i3];
                int i79 = i3 - 1;
                iArr[i79] = 1;
                Toast.makeText((Context) null, iArr[((i3 * i79) % 2) - 1], 1).show();
                int i80 = ((int[]) objArr4[1])[0];
                Object[] objArr64 = {new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i81 = ~((-568587351) | iIdentityHashCode2);
                int i82 = (-1017486348) + ((23122944 | i81) * (-280)) + ((i81 | (~(528277121 | iIdentityHashCode2))) * 140);
                int i83 = ~((-545464407) | iIdentityHashCode2);
                int i84 = ~iIdentityHashCode2;
                int i85 = i80 + i82 + (((~(i84 | 1073741527)) | i83 | (~((-23122945) | i84))) * 140);
                int i86 = (i85 << 13) ^ i85;
                int i87 = i86 ^ (i86 >>> 17);
                i4 = 1;
                ((int[]) objArr64[1])[0] = i87 ^ (i87 << 5);
                objArr5 = objArr64;
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char gidForName2 = (char) (Process.getGidForName("") + i4);
                int i88 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2266;
                int i89 = 34 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                Object[] objArr65 = new Object[1];
                a((byte) 52, (short) 37, $$a[91], objArr65);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName2, i88, i89, -887667012, false, (String) objArr65[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                    char c7 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int scrollBarFadeDuration4 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2267;
                    int i90 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32;
                    byte[] bArr15 = $$a;
                    Object[] objArr66 = new Object[1];
                    a((byte) 37, bArr15[7], bArr15[91], objArr66);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c7, scrollBarFadeDuration4, i90, -654680577, false, (String) objArr66[0], null);
                }
                Object[] objArr67 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).get(null);
                objArr7 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i91 = ((int[]) objArr67[0])[0];
                int i92 = ((int[]) objArr67[3])[0];
                String[] strArr9 = (String[]) objArr67[1];
                int i93 = ~((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
                int i94 = 408439959 + (((~(804256703 | i93)) | 4456612) * (-828)) + ((i93 | 804256703) * (-828)) + 1373337560;
                int i95 = (i94 << 13) ^ i94;
                int i96 = i95 ^ (i95 >>> 17);
                ((int[]) objArr7[2])[0] = i96 ^ (i96 << 5);
                str3 = str3;
                str5 = str11;
                c = 3;
                objArr5 = objArr5;
            } else {
                baseContext = getBaseContext();
                if (baseContext == null) {
                    baseContext = (Context) Class.forName(str12).getMethod(str3, new Class[0]).invoke(null, null);
                }
                if (baseContext != null) {
                    if ((baseContext instanceof ContextWrapper) || ((ContextWrapper) baseContext).getBaseContext() != null) {
                        baseContext = baseContext.getApplicationContext();
                    } else {
                        baseContext = null;
                    }
                }
                str5 = str11;
                Object[] objArr68 = {baseContext, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 1577957592};
                byte[] bArr16 = $$d;
                byte b13 = bArr16[20];
                Object[] objArr69 = new Object[1];
                d(b13, (short) (b13 | 226), (byte) (-bArr16[41]), objArr69);
                Class<?> cls4 = Class.forName((String) objArr69[0]);
                Object[] objArr70 = new Object[1];
                d((byte) (bArr16[39] + 1), (short) 262, (byte) (-bArr16[33]), objArr70);
                objArr6 = (Object[]) cls4.getMethod((String) objArr70[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr68);
                if (baseContext != null) {
                    int i97 = g + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i97 % 128;
                    int i98 = i97 % 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c8 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                        int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 2267;
                        int threadPriority2 = 33 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte[] bArr17 = $$a;
                        Object[] objArr71 = new Object[1];
                        a((byte) 37, bArr17[7], bArr17[91], objArr71);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c8, touchSlop2, threadPriority2, -654680577, false, (String) objArr71[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, objArr6);
                    try {
                        long jLongValue11 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf9 = Long.valueOf(jLongValue11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char offsetAfter4 = (char) TextUtils.getOffsetAfter("", 0);
                            int tapTimeout = 2267 - (ViewConfiguration.getTapTimeout() >> 16);
                            int iGreen = Color.green(0) + 33;
                            Object[] objArr72 = new Object[1];
                            a((byte) 52, (short) 141, $$a[91], objArr72);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter4, tapTimeout, iGreen, -874156483, false, (String) objArr72[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, lValueOf9);
                        Long lValueOf10 = Long.valueOf(jLongValue11 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char modifierMetaStateMask2 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                            int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 2267;
                            int offsetAfter5 = TextUtils.getOffsetAfter("", 0) + 33;
                            Object[] objArr73 = new Object[1];
                            a((byte) 52, (short) 37, $$a[91], objArr73);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask2, iCombineMeasuredStates2, offsetAfter5, -887667012, false, (String) objArr73[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf10);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr6 = objArr6;
                    objArr5 = objArr5;
                    str3 = str3;
                }
                objArr7 = objArr6;
                c = 3;
            }
            if (((int[]) objArr7[0])[0] == ((int[]) objArr7[c])[0]) {
                arrayList = new ArrayList();
                strArr = (String[]) objArr7[1];
                if (strArr != null) {
                    for (String str15 : strArr) {
                        arrayList.add(str15);
                    }
                }
                throw null;
            }
            objArr8 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i99 = ((int[]) objArr7[2])[0];
            int i100 = ((int[]) objArr7[0])[0];
            int i101 = ((int[]) objArr7[3])[0];
            String[] strArr10 = (String[]) objArr7[1];
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i102 = 1912611025 + ((startElapsedRealtime2 | 1059640729) * (-50));
            int i103 = ~((-822609033) | startElapsedRealtime2);
            int i104 = ~startElapsedRealtime2;
            int i105 = i99 + i102 + ((i103 | (~(1073536445 | i104))) * 50) + (((~(i104 | 1059640729)) | (~(250927413 | i104)) | (-1073536446)) * 50);
            int i106 = (i105 << 13) ^ i105;
            int i107 = i106 ^ (i106 >>> 17);
            ((int[]) objArr8[2])[0] = i107 ^ (i107 << 5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf("", "") + 46400), Color.argb(0, 0, 0, 0) + 40, 19 - TextUtils.indexOf("", "", 0, 0), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null);
            try {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (46401 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 40 - View.MeasureSpec.getSize(0), Color.rgb(0, 0, 0) + 16777235, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(obj, null);
                super.onCreate(bundle);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1031;
                    int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
                    Object[] objArr74 = new Object[1];
                    a((byte) 52, (short) 141, $$a[91], objArr74);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionGroup, windowTouchSlop2, threadPriority3, 1357589585, false, (String) objArr74[0], null);
                }
                j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
                jLongValue = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
                    int i108 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
                    Object[] objArr75 = new Object[1];
                    a((byte) 52, (short) 37, $$a[91], objArr75);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumDrawingCacheSize2, touchSlop3, i108, 1344079056, false, (String) objArr75[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                        char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int deadChar2 = KeyEvent.getDeadChar(0, 0) + 1031;
                        int touchSlop4 = 15 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte[] bArr18 = $$a;
                        byte b14 = bArr18[7];
                        Object[] objArr76 = new Object[1];
                        a(b14, (short) (b14 | 193), (byte) (bArr18[88] - 1), objArr76);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(edgeSlop2, deadChar2, touchSlop4, 632103528, false, (String) objArr76[0], null);
                    }
                    Object[] objArr77 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
                    objArr9 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                    int i109 = ((int[]) objArr77[3])[0];
                    int i110 = ((int[]) objArr77[1])[0];
                    String[] strArr11 = (String[]) objArr77[0];
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i111 = ~iElapsedRealtime;
                    int i112 = ((((-1882456999) + (((~(i111 | 559527106)) | ((~(315246936 | i111)) | (-870055387))) * 464)) + (((-554808451) | iElapsedRealtime) * (-464))) + (((~(iElapsedRealtime | 559527106)) | (-870055387)) * 464)) - 1591509105;
                    int i113 = (i112 << 13) ^ i112;
                    int i114 = i113 ^ (i113 >>> 17);
                    ((int[]) objArr9[2])[0] = i114 ^ (i114 << 5);
                } else {
                    int iIntValue = ((Integer) Class.forName(str10).getMethod(str5, Object.class).invoke(null, this)).intValue();
                    Object[] objArr78 = {-611472346};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (46038 - TextUtils.getOffsetBefore("", 0)), 1134 - TextUtils.getCapsMode("", 0, 0), View.getDefaultSize(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr79 = {Integer.valueOf(iIntValue), 0, -1591509105, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).newInstance(objArr78), false};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                        int offsetAfter6 = 1031 - TextUtils.getOffsetAfter("", 0);
                        int scrollDefaultDelay3 = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        Object[] objArr80 = new Object[1];
                        a((byte) 52, (short) 141, $$a[91], objArr80);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cResolveOpacity2, offsetAfter6, scrollDefaultDelay3, 1298546779, false, (String) objArr80[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 45993), 1117 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Boolean.TYPE});
                    }
                    objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr79);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                        int i115 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
                        byte[] bArr19 = $$a;
                        byte b15 = bArr19[7];
                        Object[] objArr81 = new Object[1];
                        a(b15, (short) (b15 | 193), (byte) (bArr19[88] - 1), objArr81);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(scrollBarSize, pressedStateDuration, i115, 632103528, false, (String) objArr81[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, objArr9);
                    try {
                        long jLongValue12 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf11 = Long.valueOf(jLongValue12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                            char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                            int edgeSlop3 = 1031 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
                            Object[] objArr82 = new Object[1];
                            a((byte) 52, (short) 37, $$a[91], objArr82);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(packedPositionChild2, edgeSlop3, longPressTimeout, 1344079056, false, (String) objArr82[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf11);
                        Long lValueOf12 = Long.valueOf(jLongValue12 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                            int gidForName3 = 1030 - Process.getGidForName("");
                            int i116 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            Object[] objArr83 = new Object[1];
                            a((byte) 52, (short) 141, $$a[91], objArr83);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAxisFromString, gidForName3, i116, 1357589585, false, (String) objArr83[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf12);
                    } catch (Exception unused5) {
                        throw new RuntimeException();
                    }
                }
                i6 = ((int[]) objArr9[1])[0];
                i7 = ((int[]) objArr9[3])[0];
                if (i7 == i6) {
                    arrayList2 = new ArrayList();
                    strArr2 = (String[]) objArr9[0];
                    if (strArr2 != null) {
                        for (String str16 : strArr2) {
                            arrayList2.add(str16);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i7));
                }
                objArr10 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i117 = ((int[]) objArr9[2])[0];
                int i118 = ((int[]) objArr9[3])[0];
                int i119 = ((int[]) objArr9[1])[0];
                String[] strArr12 = (String[]) objArr9[0];
                int i120 = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
                int i121 = ~i120;
                int i122 = i117 + 1812472440 + (((~((-927421933) | i121)) | 683141762) * (-865)) + ((~(i120 | 927421932)) * 865) + (((~(683141762 | i121)) | (~(i121 | 927421932))) * 865);
                int i123 = (i122 << 13) ^ i122;
                int i124 = i123 ^ (i123 >>> 17);
                ((int[]) objArr10[2])[0] = i124 ^ (i124 << 5);
                int i125 = g + 105;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i125 % 128;
                int i126 = i125 % 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cMyPid = (char) ((Process.myPid() >> 22) + 37567);
                    int iAxisFromString2 = 624 - MotionEvent.axisFromString("");
                    int iIndexOf3 = 13 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte[] bArr20 = $$a;
                    byte b16 = bArr20[7];
                    Object[] objArr84 = new Object[1];
                    a(b16, (short) (b16 | 193), (byte) (bArr20[88] - 1), objArr84);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMyPid, iAxisFromString2, iIndexOf3, -477065106, false, (String) objArr84[0], null);
                }
                j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null);
                jLongValue2 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char c9 = (char) (37568 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int deadChar3 = KeyEvent.getDeadChar(0, 0) + 625;
                    int iAlpha3 = Color.alpha(0) + 14;
                    Object[] objArr85 = new Object[1];
                    a((byte) 52, (short) 141, $$a[91], objArr85);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c9, deadChar3, iAlpha3, -976899241, false, (String) objArr85[0], null);
                }
                if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).getLong(null) << 52) >>> 52)) >> 12)) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                        char fadingEdgeLength = (char) (37567 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int minimumFlingVelocity = 625 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i127 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14;
                        Object[] objArr86 = new Object[1];
                        a((byte) 52, (short) 37, $$a[91], objArr86);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(fadingEdgeLength, minimumFlingVelocity, i127, -973632554, false, (String) objArr86[0], null);
                    }
                    Object[] objArr87 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).get(null);
                    int i128 = ((int[]) objArr87[2])[0];
                    int i129 = ((int[]) objArr87[0])[0];
                    String[] strArr13 = (String[]) objArr87[3];
                    int[] iArr2 = {i128};
                    int length = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_expired).substring(7, 9).length() + 812520087;
                    int i130 = 185355544 + (((~((~length) | (-1736412421))) | 87297028) * 446) + (((~(length | (-1649115393))) | 28672) * 446) + 1098071972;
                    int i131 = (i130 << 13) ^ i130;
                    int i132 = i131 ^ (i131 >>> 17);
                    ((int[]) objArr13[1])[0] = i132 ^ (i132 << 5);
                    objArr13 = new Object[]{new int[]{i129}, new int[1], iArr2, strArr13};
                    c2 = 0;
                    str6 = str3;
                } else {
                    baseContext2 = getBaseContext();
                    if (baseContext2 == null) {
                        str6 = str3;
                        baseContext2 = (Context) Class.forName(str12).getMethod(str6, new Class[0]).invoke(null, null);
                    } else {
                        str6 = str3;
                    }
                    if (baseContext2 == null) {
                        objArr11 = null;
                    } else {
                        if (baseContext2 instanceof ContextWrapper) {
                            i9 = g + 23;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                            if (i9 % 2 == 0) {
                                ((ContextWrapper) baseContext2).getBaseContext();
                                throw null;
                            }
                            if (((ContextWrapper) baseContext2).getBaseContext() != null) {
                                baseContext2 = null;
                                objArr11 = null;
                            }
                        }
                        objArr11 = null;
                        baseContext2 = baseContext2.getApplicationContext();
                    }
                    int iIntValue2 = ((Integer) Class.forName(str10).getMethod(str5, Object.class).invoke(objArr11, this)).intValue();
                    Object[] objArr88 = new Object[1];
                    c(true, 203 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(objArr11, objArr11)).getApplicationContext().getPackageName().length() + 53, ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(objArr11, objArr11)).getApplicationContext().getResources().getString(R.string.permata_bank_transfer).substring(0, 7).codePointAt(3) - 82, new char[]{25, 65518, 28, 25, 65518, 65518, 65516, 28, 65517, 65512, 65518, 65516, 24, 28, 28, 65516, 29, 29, 65520, 65517, 29, 25, 24, 24, 29, 28, 65513, 25, 65513, 29, 25, 25, 65515, 65519, 65520, 25, 65513, 65519, 65515, 24, 65519, 65511, 24, 65516, 65514, 28, 29, 65519, 65515, 65516, 29, 24, 65519, 65512, 65512, 65520, 65513, 24, 65520, 65520, 65515, 27, 65514, 65512}, objArr88);
                    String str17 = (String) objArr88[0];
                    Object[] objArr89 = new Object[1];
                    c(true, ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 163, ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_atm_transfer_step4).substring(4, 6).codePointAt(1) - 48, ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 10, new char[]{65519, 65522, 65521, '!', ' ', 65517, 65517, 28, ' ', 65519, 65516, 65520, 29, 65524, 65523, 65524, 65524, 65518, 65524, 29, 65519, 29, 65521, '!', 65522, 65520, 65518, 65521, 65518, 65517, 65519, '!', 65517, ' ', 29, 65515, '!', ' ', 65522, 29, 65520, 65515, 65521, 31, 28, 30, '!', 65521, 65515, 28, 65519, 65517, '!', 30, 65517, 65518, 65519, 29, 65524, 65524, 30, 65524, 65518, 65518}, objArr89);
                    Object[] objArr90 = {baseContext2, new String[]{str17, (String) objArr89[0]}, Integer.valueOf(iIntValue2), 17, 818303148};
                    byte[] bArr21 = $$d;
                    byte b17 = bArr21[25];
                    Object[] objArr91 = new Object[1];
                    d(b17, (short) (b17 | 299), (byte) (-bArr21[327]), objArr91);
                    Class<?> cls5 = Class.forName((String) objArr91[0]);
                    Object[] objArr92 = new Object[1];
                    d(bArr21[48], (short) 339, bArr21[25], objArr92);
                    objArr12 = (Object[]) cls5.getMethod((String) objArr92[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr90);
                    int i133 = ((int[]) objArr12[0])[0];
                    int i134 = ((int[]) objArr12[2])[0];
                    if (baseContext2 != null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                            char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 37567);
                            int iGreen2 = Color.green(0) + 625;
                            int iGreen3 = 14 - Color.green(0);
                            Object[] objArr93 = new Object[1];
                            a((byte) 52, (short) 37, $$a[91], objArr93);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cCombineMeasuredStates, iGreen2, iGreen3, -973632554, false, (String) objArr93[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, objArr12);
                        try {
                            long jLongValue13 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf13 = Long.valueOf(jLongValue13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                char cIndexOf = (char) (37567 - TextUtils.indexOf("", ""));
                                int defaultSize2 = 625 - View.getDefaultSize(0, 0);
                                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14;
                                Object[] objArr94 = new Object[1];
                                a((byte) 52, (short) 141, $$a[91], objArr94);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cIndexOf, defaultSize2, keyRepeatDelay, -976899241, false, (String) objArr94[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf13);
                            Long lValueOf14 = Long.valueOf(jLongValue13 >> 12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                                char doubleTapTimeout2 = (char) (37567 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 625;
                                int packedPositionGroup2 = 14 - ExpandableListView.getPackedPositionGroup(0L);
                                byte[] bArr22 = $$a;
                                byte b18 = bArr22[7];
                                Object[] objArr95 = new Object[1];
                                a(b18, (short) (b18 | 193), (byte) (bArr22[88] - 1), objArr95);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(doubleTapTimeout2, longPressTimeout2, packedPositionGroup2, -477065106, false, (String) objArr95[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, lValueOf14);
                        } catch (Exception unused6) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr12 = objArr12;
                    }
                    objArr13 = objArr12;
                    c2 = 0;
                }
                if (((int[]) objArr13[2])[c2] == ((int[]) objArr13[c2])[c2]) {
                    arrayList3 = new ArrayList();
                    strArr3 = (String[]) objArr13[3];
                    if (strArr3 != null) {
                        for (String str18 : strArr3) {
                            arrayList3.add(str18);
                        }
                    }
                    throw null;
                }
                int i135 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
                g = i135 % 128;
                int i136 = i135 % 2;
                int i137 = ((int[]) objArr13[1])[0];
                int i138 = ((int[]) objArr13[2])[0];
                int i139 = ((int[]) objArr13[0])[0];
                String[] strArr14 = (String[]) objArr13[3];
                int[] iArr3 = {i138};
                int iIdentityHashCode3 = System.identityHashCode(this);
                int i140 = i137 + (((~((-1689046557) | iIdentityHashCode3)) | 1823208688) * 398) + 2143211552 + (((~((~iIdentityHashCode3) | (-1689046557))) | 1823208688) * 398);
                int i141 = i140 ^ (i140 << 13);
                int i142 = i141 ^ (i141 >>> 17);
                Object obj2 = new Object[]{new int[]{i139}, new int[1], iArr3, strArr14}[1];
                ((int[]) obj2)[0] = i142 ^ (i142 << 5);
                int i143 = ((int[]) objArr2[1])[0];
                int i144 = ((((i143 * i143) - (~(-(180800095 * i143)))) - 1) - (~(-(i143 * (-1230180253))))) - 1;
                int i145 = (i144 & 1973591745) + (1973591745 | i144);
                int i146 = i145 >> 16;
                int i147 = (((-131071) & i146) + (i146 | (-131071))) / 65536;
                int i148 = (i147 & 1) + (i147 | 1);
                int i149 = (i145 & i148) + (i148 | i145);
                int i150 = i145 >> 25;
                int i151 = (-(i149 ^ ((((i150 & (-255)) + (i150 | (-255))) / 128) - (-1)))) + 8;
                int i152 = ((i151 >> 20) - 8191) / 4096;
                int i153 = 5821312 / ((i151 & (-((((i152 | 1) << 1) - (i152 ^ 1)) - (-1)))) * 1246);
                int i154 = ((int[]) objArr52[1])[0];
                int i155 = i154 * i154;
                int i156 = -(1166158799 * i154);
                int i157 = (((i155 & i156) + (i155 | i156)) - (~(-(i154 * (-2085611891))))) - 1656167357;
                int i158 = ((i157 >> 24) - 511) / 256;
                int i159 = (i157 - (~(((i158 | 1) << 1) - (i158 ^ 1)))) - 1;
                int i160 = ((i157 >> 16) - 131071) / 65536;
                int i161 = (-(i159 ^ ((i160 ^ 1) + ((i160 & 1) << 1)))) - (-1);
                int i162 = i161 >> 18;
                int i163 = ((i162 ^ (-32767)) + ((i162 & (-32767)) << 1)) / 16384;
                int i164 = (i163 ^ 1) + ((i163 & 1) << 1);
                int i165 = i153 + (1066373 / ((i161 & (-(((i164 | 1) << 1) - (i164 ^ 1)))) * 1259));
                int i166 = ((int[]) objArr5[1])[0];
                int i167 = ((i166 * i166) - (~(-(1520651278 * i166)))) - 1;
                int i168 = -(i166 * (-788111114));
                int i169 = (i167 ^ i168) + ((i168 & i167) << 1);
                int i170 = (i169 & 1326291460) + (1326291460 | i169);
                int i171 = (((i170 >> 28) - 31) / 16) - (-1);
                int i172 = (i170 ^ i171) + ((i171 & i170) << 1);
                int i173 = ((i170 >> 19) - 16383) / 8192;
                int i174 = (-(i172 ^ ((i173 & 1) + (i173 | 1)))) + 9;
                int i175 = i174 >> 26;
                int i176 = ((i175 ^ ComposerKt.defaultsKey) + ((i175 & ComposerKt.defaultsKey) << 1)) / 64;
                int i177 = (i176 & 1) + (i176 | 1);
                int i178 = i165 + (4743441 / ((i174 & (-((i177 & 1) + (i177 | 1)))) * 1119));
                int i179 = ((int[]) objArr8[2])[0];
                int i180 = i179 * i179;
                int i181 = -(1329298052 * i179);
                int i182 = (i180 ^ i181) + ((i180 & i181) << 1);
                int i183 = -(i179 * 1629163812);
                int i184 = (i182 ^ i183) + ((i183 & i182) << 1);
                int i185 = ((i184 | 1212413840) << 1) - (1212413840 ^ i184);
                int i186 = i185 >> 28;
                int i187 = ((((i186 | (-31)) << 1) - (i186 ^ (-31))) / 16) - (-1);
                int i188 = (i185 ^ i187) + ((i187 & i185) << 1);
                int i189 = i185 >> 21;
                int i190 = (((i189 | (-4095)) << 1) - (i189 ^ (-4095))) / 2048;
                int i191 = -(i188 ^ (((i190 | 1) << 1) - (i190 ^ 1)));
                int i192 = ((i191 | 7) << 1) - (i191 ^ 7);
                int i193 = i192 >> 29;
                int i194 = (((i193 | (-15)) << 1) - (i193 ^ (-15))) / 8;
                int i195 = i178 + (2410625 / (((-(((i194 ^ 1) + ((i194 & 1) << 1)) - (-1))) & i192) * 725));
                int i196 = ((int[]) objArr10[2])[0];
                int i197 = i196 * i196;
                int i198 = -(1332111193 * i196);
                int i199 = (i197 & i198) + (i197 | i198);
                int i200 = -(i196 * 1869382301);
                int i201 = ((i199 | i200) << 1) - (i200 ^ i199);
                int i202 = (i201 & 1968860697) + (1968860697 | i201);
                int i203 = i202 >> 18;
                int i204 = ((i203 & (-32767)) + (i203 | (-32767))) / 16384;
                int i205 = (i202 - (~(((i204 | 1) << 1) - (i204 ^ 1)))) - 1;
                int i206 = i202 >> 19;
                int i207 = (-(i205 ^ (((((i206 | (-16383)) << 1) - (i206 ^ (-16383))) / 8192) - (-1)))) + 3;
                int i208 = i207 >> 17;
                int i209 = (((-65535) & i208) + (i208 | (-65535))) / 32768;
                int i210 = i195 + (4958478 / ((i207 & (-((((i209 | 1) << 1) - (i209 ^ 1)) - (-1)))) * 1711));
                int i211 = ((int[]) obj2)[0];
                int i212 = ((i211 * i211) - (~(-(1771270277 * i211)))) - 1;
                int i213 = -(i211 * 1685574011);
                int i214 = ((i212 ^ i213) + ((i212 & i213) << 1)) - 1354694656;
                int i215 = i214 >> 21;
                int i216 = (((i215 | (-4095)) << 1) - (i215 ^ (-4095))) / 2048;
                int i217 = (i216 ^ 1) + ((i216 & 1) << 1);
                int i218 = ((i214 | i217) << 1) - (i217 ^ i214);
                int i219 = i214 >> 22;
                int i220 = (((i219 | (-2047)) << 1) - (i219 ^ (-2047))) / 1024;
                int i221 = (-(((i220 ^ 1) + ((i220 & 1) << 1)) ^ i218)) + 3;
                int i222 = i221 >> 25;
                int i223 = (((i222 ^ (-255)) + ((i222 & (-255)) << 1)) / 128) - (-1);
                setResult(i210 + ((-19155390) / ((i221 & (-((i223 & 1) + (i223 | 1)))) * 1910)));
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char c10 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                    int i224 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                    int i225 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44;
                    Object[] objArr96 = new Object[1];
                    a((byte) 52, (short) 89, $$a[91], objArr96);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(c10, i224, i225, -459846511, false, (String) objArr96[0], null);
                }
                j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null);
                jLongValue3 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char longPressTimeout3 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 652;
                    int size3 = View.MeasureSpec.getSize(0) + 44;
                    byte[] bArr23 = $$a;
                    byte b19 = bArr23[7];
                    Object[] objArr97 = new Object[1];
                    a(b19, (short) (b19 | 193), (byte) (bArr23[88] - 1), objArr97);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(longPressTimeout3, iLastIndexOf2, size3, -873460649, false, (String) objArr97[0], null);
                }
                if (j3 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).getLong(null) << 52) >>> 52)) >> 12)) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                        char mode = (char) View.MeasureSpec.getMode(0);
                        int keyRepeatTimeout2 = 651 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int iRgb3 = (-16777172) - Color.rgb(0, 0, 0);
                        byte[] bArr24 = $$a;
                        Object[] objArr98 = new Object[1];
                        a((byte) 37, bArr24[7], bArr24[91], objArr98);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(mode, keyRepeatTimeout2, iRgb3, -1595579076, false, (String) objArr98[0], null);
                    }
                    Object[] objArr99 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).get(null);
                    objArr14 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i226 = ((int[]) objArr99[2])[0];
                    int i227 = ((int[]) objArr99[0])[0];
                    int iCodePointAt2 = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_bca).substring(1, 3).codePointAt(0) - 493722370;
                    int i228 = ((((-1286553375) + ((7630458 | iCodePointAt2) * 376)) + (((~((~iCodePointAt2) | 199193994)) | 2099824) * (-376))) + (((~(iCodePointAt2 | (-199193995))) | (-195763185)) * 376)) - 608635772;
                    int i229 = (i228 << 13) ^ i228;
                    int i230 = i229 ^ (i229 >>> 17);
                    ((int[]) objArr14[3])[0] = i230 ^ (i230 << 5);
                    i11 = 0;
                } else {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.indexOf((CharSequence) "", '0') + 1611, 25 - ExpandableListView.getPackedPositionChild(0L), 2145681644, false, null, new Class[0]);
                    }
                    Object[] objArr100 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).newInstance(null), -608635772, 0};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                        char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int iResolveSize = View.resolveSize(0, 0) + 651;
                        int minimumFlingVelocity2 = 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte[] bArr25 = $$a;
                        byte b20 = bArr25[7];
                        Object[] objArr101 = new Object[1];
                        a(b20, (short) (b20 | 193), (byte) (bArr25[88] - 1), objArr101);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(maxKeyCode2, iResolveSize, minimumFlingVelocity2, 2075921419, false, (String) objArr101[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0) + 695, 97 - ExpandableListView.getPackedPositionChild(0L)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 793 - (KeyEvent.getMaxKeyCode() >> 16), 83 - View.MeasureSpec.makeMeasureSpec(0, 0)), Integer.TYPE, Integer.TYPE});
                    }
                    objArr14 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr100);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                        char minimumFlingVelocity3 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 652;
                        int jumpTapTimeout = 44 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte[] bArr26 = $$a;
                        Object[] objArr102 = new Object[1];
                        a((byte) 37, bArr26[7], bArr26[91], objArr102);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(minimumFlingVelocity3, iIndexOf4, jumpTapTimeout, -1595579076, false, (String) objArr102[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, objArr14);
                    try {
                        long jLongValue14 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf15 = Long.valueOf(jLongValue14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                            char scrollBarFadeDuration5 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int maximumDrawingCacheSize3 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 651;
                            int mirror = AndroidCharacter.getMirror('0') - 4;
                            byte[] bArr27 = $$a;
                            byte b21 = bArr27[7];
                            Object[] objArr103 = new Object[1];
                            a(b21, (short) (b21 | 193), (byte) (bArr27[88] - 1), objArr103);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(scrollBarFadeDuration5, maximumDrawingCacheSize3, mirror, -873460649, false, (String) objArr103[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf15);
                        Long lValueOf16 = Long.valueOf(jLongValue14 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                            char cIndexOf2 = (char) TextUtils.indexOf("", "");
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 651;
                            int i231 = 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            Object[] objArr104 = new Object[1];
                            a((byte) 52, (short) 89, $$a[91], objArr104);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cIndexOf2, absoluteGravity, i231, -459846511, false, (String) objArr104[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf16);
                        i11 = 0;
                    } catch (Exception unused7) {
                        throw new RuntimeException();
                    }
                }
                i12 = ((int[]) objArr14[i11])[i11];
                i13 = ((int[]) objArr14[2])[i11];
                if (i13 == i12) {
                    objArr15 = new Object[4];
                    int[] iArr4 = new int[1];
                    objArr15[i11] = iArr4;
                    int[] iArr5 = new int[1];
                    objArr15[2] = iArr5;
                    objArr15[3] = new int[1];
                    int i232 = ((int[]) objArr14[3])[i11];
                    int i233 = ((int[]) objArr14[2])[i11];
                    int i234 = ((int[]) objArr14[i11])[i11];
                    iArr5[i11] = i233;
                    iArr4[i11] = i234;
                    objArr15[1] = new String[i11];
                    int length2 = ((Context) Class.forName(r2).getMethod(str4, new Class[i11]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima5).substring(12, 13).length() + 914850897;
                    int i235 = ~length2;
                    int i236 = i232 + 2059756501 + (((~((-796775) | i235)) | 4227584) * 220) + (((~(i235 | (-666725736))) | 670156545) * (-440)) + ((length2 | (-796775)) * 220);
                    int i237 = (i236 << 13) ^ i236;
                    int i238 = i237 ^ (i237 >>> 17);
                    ((int[]) objArr15[3])[0] = i238 ^ (i238 << 5);
                    i14 = 0;
                } else {
                    arrayList4 = new ArrayList();
                    strArr4 = (String[]) objArr14[1];
                    if (strArr4 != null) {
                        for (String str19 : strArr4) {
                            arrayList4.add(str19);
                        }
                    }
                    int[] iArr6 = new int[i13];
                    int i239 = i13 - 1;
                    iArr6[i239] = 1;
                    Toast.makeText((Context) null, iArr6[((i13 * i239) % 2) - 1], 1).show();
                    objArr15 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i240 = ((int[]) objArr14[3])[0];
                    int i241 = ((int[]) objArr14[2])[0];
                    int i242 = ((int[]) objArr14[0])[0];
                    int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i243 = ~iFreeMemory;
                    int i244 = i240 + (-1317025084) + (((~((-1063790832) | i243)) | (~(1060360021 | i243))) * (-867)) + (((~((-1063790832) | iFreeMemory)) | 4726954 | (~(1060360021 | iFreeMemory))) * (-1734)) + (((~(iFreeMemory | 1065086975)) | (~(i243 | (-4726955))) | (~((-1059063878) | iFreeMemory))) * 867);
                    int i245 = (i244 << 13) ^ i244;
                    int i246 = i245 ^ (i245 >>> 17);
                    i14 = 0;
                    ((int[]) objArr15[3])[0] = i246 ^ (i246 << 5);
                }
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    char c11 = (char) (53893 - (TypedValue.complexToFraction(i14, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i14, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int threadPriority4 = 1320 - ((Process.getThreadPriority(i14) + 20) >> 6);
                    int i247 = 36 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr28 = $$a;
                    byte b22 = bArr28[7];
                    Object[] objArr105 = new Object[1];
                    a(b22, (short) (b22 | 193), (byte) (bArr28[88] - 1), objArr105);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(c11, threadPriority4, i247, -1433084963, false, (String) objArr105[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).getLong(null) != -1) {
                    int i248 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
                    g = i248 % 128;
                    int i249 = i248 % 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                        char mode2 = (char) (53893 - View.MeasureSpec.getMode(0));
                        int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1321;
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 36;
                        Object[] objArr106 = new Object[1];
                        a((byte) 52, (short) 37, $$a[91], objArr106);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(mode2, iIndexOf5, absoluteGravity2, -1920778747, false, (String) objArr106[0], null);
                    }
                    Object[] objArr107 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).get(null);
                    objArr17 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                    int i250 = ((int[]) objArr107[0])[0];
                    int i251 = ((int[]) objArr107[3])[0];
                    String[] strArr15 = (String[]) objArr107[2];
                    int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                    int i252 = ~iFreeMemory2;
                    int i253 = (((~(i252 | 1321182145)) | (~((-49445680) | i252)) | 4216878) * (-397)) + 1623291184 + ((iFreeMemory2 | 1280170222) * 397) + 1629500296;
                    int i254 = (i253 << 13) ^ i253;
                    int i255 = i254 ^ (i254 >>> 17);
                    ((int[]) objArr17[1])[0] = i255 ^ (i255 << 5);
                    objArr15 = objArr15;
                    str7 = str5;
                } else {
                    baseContext3 = getBaseContext();
                    if (baseContext3 == null) {
                        baseContext3 = (Context) Class.forName(str12).getMethod(str6, new Class[0]).invoke(null, null);
                    }
                    if (baseContext3 != null) {
                        if ((baseContext3 instanceof ContextWrapper) || ((ContextWrapper) baseContext3).getBaseContext() != null) {
                            baseContext3 = baseContext3.getApplicationContext();
                        } else {
                            baseContext3 = null;
                        }
                    }
                    str7 = str5;
                    int iIntValue3 = ((Integer) Class.forName(str10).getMethod(str7, Object.class).invoke(null, this)).intValue();
                    Object[] objArr108 = {1141588826};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b((char) (47977 - TextUtils.getCapsMode("", 0, 0)), 1300 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr109 = {baseContext3, "com.bpjstku", 1629500296, Integer.valueOf(iIntValue3), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).newInstance(objArr108), false};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                        char size4 = (char) (View.MeasureSpec.getSize(0) + 53893);
                        int keyRepeatDelay2 = 1320 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iResolveSize2 = 36 - View.resolveSize(0, 0);
                        Object[] objArr110 = new Object[1];
                        a((byte) 52, (short) 37, $$a[91], objArr110);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(size4, keyRepeatDelay2, iResolveSize2, 819724799, false, (String) objArr110[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 1394, 75 - Color.red(0)), Boolean.TYPE});
                    }
                    objArr16 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).invoke(null, objArr109);
                    if (baseContext3 != null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                            char cMyTid = (char) (53893 - (Process.myTid() >> 22));
                            int defaultSize3 = View.getDefaultSize(0, 0) + 1320;
                            int i256 = 36 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            Object[] objArr111 = new Object[1];
                            a((byte) 52, (short) 37, $$a[91], objArr111);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cMyTid, defaultSize3, i256, -1920778747, false, (String) objArr111[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, objArr16);
                        try {
                            long jLongValue15 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf17 = Long.valueOf(jLongValue15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                                char jumpTapTimeout2 = (char) (53893 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                                int iResolveOpacity3 = 1320 - Drawable.resolveOpacity(0, 0);
                                int i257 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 35;
                                byte[] bArr29 = $$a;
                                Object[] objArr112 = new Object[1];
                                a((byte) 37, bArr29[7], bArr29[91], objArr112);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(jumpTapTimeout2, iResolveOpacity3, i257, -1273706634, false, (String) objArr112[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf17);
                            Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                                char offsetBefore3 = (char) (TextUtils.getOffsetBefore("", 0) + 53893);
                                int i258 = 1320 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int iKeyCodeFromString2 = 36 - KeyEvent.keyCodeFromString("");
                                byte[] bArr30 = $$a;
                                byte b23 = bArr30[7];
                                Object[] objArr113 = new Object[1];
                                a(b23, (short) (b23 | 193), (byte) (bArr30[88] - 1), objArr113);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(offsetBefore3, i258, iKeyCodeFromString2, -1433084963, false, (String) objArr113[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf18);
                        } catch (Exception unused8) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr16 = objArr16;
                        objArr15 = objArr15;
                    }
                    objArr17 = objArr16;
                }
                i16 = ((int[]) objArr17[3])[0];
                i17 = ((int[]) objArr17[0])[0];
                if (i17 == i16) {
                    objArr18 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                    int i259 = ((int[]) objArr17[1])[0];
                    int i260 = ((int[]) objArr17[0])[0];
                    int i261 = ((int[]) objArr17[3])[0];
                    String[] strArr16 = (String[]) objArr17[2];
                    int i262 = ~new Random().nextInt(186081569);
                    int i263 = i259 + (-935965132) + (((-688180229) | i262) * 494) + (((~(i262 | 342569706)) | (-690872045)) * 494);
                    int i264 = (i263 << 13) ^ i263;
                    int i265 = i264 ^ (i264 >>> 17);
                    i18 = 0;
                    ((int[]) objArr18[1])[0] = i265 ^ (i265 << 5);
                } else {
                    Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
                    objArr18 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                    int i266 = ((int[]) objArr17[1])[0];
                    int i267 = ((int[]) objArr17[0])[0];
                    int i268 = ((int[]) objArr17[3])[0];
                    String[] strArr17 = (String[]) objArr17[2];
                    int i269 = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
                    int i270 = i266 + (((1450655216 + (((~((-134503191) | i269)) | 134497042) * 1504)) + ((~(i269 | (-6149))) * (-1504))) - 500115648);
                    int i271 = i270 ^ (i270 << 13);
                    int i272 = i271 ^ (i271 >>> 17);
                    i18 = 0;
                    ((int[]) objArr18[1])[0] = i272 ^ (i272 << 5);
                }
                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                    char jumpTapTimeout3 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                    int mode3 = View.MeasureSpec.getMode(i18) + 1755;
                    int i273 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte[] bArr31 = $$a;
                    Object[] objArr114 = new Object[1];
                    a((byte) 37, bArr31[7], bArr31[91], objArr114);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(jumpTapTimeout3, mode3, i273, 986134021, false, (String) objArr114[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null) != -1) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                        char c12 = (char) (29944 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int iKeyCodeFromString3 = KeyEvent.keyCodeFromString("") + 1755;
                        int iResolveSize3 = View.resolveSize(0, 0) + 23;
                        Object[] objArr115 = new Object[1];
                        a((byte) 52, (short) 37, $$a[91], objArr115);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(c12, iKeyCodeFromString3, iResolveSize3, 1599039318, false, (String) objArr115[0], null);
                    }
                    Object[] objArr116 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).get(null);
                    objArr19 = new Object[]{new int[]{((int[]) objArr116[0])[0]}, new int[]{((int[]) objArr116[1])[0]}, (Object[]) objArr116[2], new int[1], (String[]) objArr116[4]};
                    int iIdentityHashCode4 = System.identityHashCode(this);
                    int i274 = (-750631223) + (((~((-53877529) | iIdentityHashCode4)) | 20189952) * 1504) + ((~(iIdentityHashCode4 | (-33687577))) * (-1504)) + 1109529304;
                    int i275 = (i274 << 13) ^ i274;
                    int i276 = i275 ^ (i275 >>> 17);
                    ((int[]) objArr19[3])[0] = i276 ^ (i276 << 5);
                    objArr18 = objArr18;
                } else {
                    int iIntValue4 = ((Integer) Class.forName(str10).getMethod(str7, Object.class).invoke(null, this)).intValue();
                    Object[] objArr117 = {1141588826};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b((char) (42049 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1726, 29 - TextUtils.getCapsMode("", 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue4, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).newInstance(objArr117), 447212392, false, true);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                        char c13 = (char) (29945 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int i277 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                        int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
                        Object[] objArr118 = new Object[1];
                        a((byte) 52, (short) 37, $$a[91], objArr118);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(c13, i277, doubleTapTimeout3, 1599039318, false, (String) objArr118[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                    try {
                        long jLongValue16 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf19 = Long.valueOf(jLongValue16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                            char offsetAfter7 = (char) (TextUtils.getOffsetAfter("", 0) + 29944);
                            int jumpTapTimeout4 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                            int iResolveSizeAndState = 23 - View.resolveSizeAndState(0, 0, 0);
                            Object[] objArr119 = new Object[1];
                            a((byte) 52, (short) 89, $$a[91], objArr119);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(offsetAfter7, jumpTapTimeout4, iResolveSizeAndState, 1596667560, false, (String) objArr119[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf19);
                        Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                            char cIndexOf3 = (char) (29944 - TextUtils.indexOf("", "", 0, 0));
                            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 1756;
                            int capsMode2 = 23 - TextUtils.getCapsMode("", 0, 0);
                            byte[] bArr32 = $$a;
                            Object[] objArr120 = new Object[1];
                            a((byte) 37, bArr32[7], bArr32[91], objArr120);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cIndexOf3, iLastIndexOf3, capsMode2, 986134021, false, (String) objArr120[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf20);
                        objArr19 = objArrTuitionPaymentFragmentbindingInflater1$7879113;
                    } catch (Exception unused9) {
                        throw new RuntimeException();
                    }
                }
                i19 = ((int[]) objArr19[1])[0];
                i20 = ((int[]) objArr19[0])[0];
                if (i20 == i19) {
                    arrayList5 = new ArrayList();
                    strArr5 = (String[]) objArr19[4];
                    if (strArr5 != null) {
                        i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
                        g = i21 % 128;
                        if (i21 % 2 == 0) {
                            i22 = 1;
                        } else {
                            i22 = 0;
                        }
                        while (i22 < strArr5.length) {
                            arrayList5.add(strArr5[i22]);
                            i22++;
                        }
                    }
                    throw new RuntimeException(String.valueOf(i20));
                }
                int i278 = ((int[]) objArr19[3])[0];
                objArr20 = new Object[]{new int[]{((int[]) objArr19[0])[0]}, new int[]{((int[]) objArr19[1])[0]}, (Object[]) objArr19[2], new int[1], (String[]) objArr19[4]};
                int i279 = (int) Runtime.getRuntime().totalMemory();
                int i280 = ~i279;
                int i281 = i278 + 1571001705 + ((~(910394724 | i280)) * (-560)) + ((~(i279 | 1071118190)) * (-560)) + (((~((-697792299) | i280)) | 537068832) * 560);
                int i282 = (i281 << 13) ^ i281;
                int i283 = i282 ^ (i282 >>> 17);
                ((int[]) objArr20[3])[0] = i283 ^ (i283 << 5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                    char cIndexOf4 = (char) (TextUtils.indexOf("", "", 0, 0) + 43042);
                    int iResolveSize4 = 3111 - View.resolveSize(0, 0);
                    int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0') + 23;
                    Object[] objArr121 = new Object[1];
                    a((byte) 52, (short) 141, $$a[91], objArr121);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cIndexOf4, iResolveSize4, iIndexOf6, -1272852037, false, (String) objArr121[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).getLong(null) != -1) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                        char cBlue = (char) (Color.blue(0) + 43042);
                        int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 3111;
                        int i284 = 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte[] bArr33 = $$a;
                        Object[] objArr122 = new Object[1];
                        a((byte) 37, bArr33[7], bArr33[91], objArr122);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cBlue, scrollBarSize2, i284, 154975793, false, (String) objArr122[0], null);
                    }
                    Object[] objArr123 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).get(null);
                    int i285 = ((int[]) objArr123[2])[0];
                    int i286 = ((int[]) objArr123[1])[0];
                    String[] strArr18 = (String[]) objArr123[3];
                    int[] iArr7 = {i286};
                    int i287 = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
                    int i288 = ~i287;
                    int i289 = (-831190174) + (((~(1510876909 | i288)) | 26251280) * 184) + ((i287 | 1342973640) * (-184)) + ((~((-194154550) | i288)) * 184) + 221980214;
                    int i290 = (i289 << 13) ^ i289;
                    int i291 = i290 ^ (i290 >>> 17);
                    ((int[]) objArr21[0])[0] = i291 ^ (i291 << 5);
                    objArr21 = new Object[]{new int[1], iArr7, new int[]{i285}, strArr18};
                    objArr20 = objArr20;
                } else {
                    Object[] objArr124 = {null, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, 221980214};
                    byte[] bArr34 = $$d;
                    short s2 = (short) 339;
                    Object[] objArr125 = new Object[1];
                    d(bArr34[117], s2, (byte) (bArr34[46] + 1), objArr125);
                    Class<?> cls6 = Class.forName((String) objArr125[0]);
                    Object[] objArr126 = new Object[1];
                    d(bArr34[48], s2, bArr34[25], objArr126);
                    Object[] objArr127 = (Object[]) cls6.getMethod((String) objArr126[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr124);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                        char c14 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43042);
                        int offsetAfter8 = 3111 - TextUtils.getOffsetAfter("", 0);
                        int i292 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte[] bArr35 = $$a;
                        Object[] objArr128 = new Object[1];
                        a((byte) 37, bArr35[7], bArr35[91], objArr128);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(c14, offsetAfter8, i292, 154975793, false, (String) objArr128[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, objArr127);
                    try {
                        long jLongValue17 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf21 = Long.valueOf(jLongValue17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                            char cAlpha = (char) (43042 - Color.alpha(0));
                            int i293 = 3111 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int edgeSlop4 = 22 - (ViewConfiguration.getEdgeSlop() >> 16);
                            Object[] objArr129 = new Object[1];
                            a((byte) 52, (short) 37, $$a[91], objArr129);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cAlpha, i293, edgeSlop4, -1269618118, false, (String) objArr129[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf21);
                        Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                            char c15 = (char) (43042 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                            int iAxisFromString3 = MotionEvent.axisFromString("") + 3112;
                            int iIndexOf7 = TextUtils.indexOf("", "", 0, 0) + 22;
                            Object[] objArr130 = new Object[1];
                            a((byte) 52, (short) 141, $$a[91], objArr130);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c15, iAxisFromString3, iIndexOf7, -1272852037, false, (String) objArr130[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf22);
                        objArr21 = objArr127;
                    } catch (Exception unused10) {
                        throw new RuntimeException();
                    }
                }
                i23 = ((int[]) objArr21[1])[0];
                i24 = ((int[]) objArr21[2])[0];
                if (i24 == i23) {
                    int i294 = ((int[]) objArr21[0])[0];
                    int i295 = ((int[]) objArr21[2])[0];
                    int i296 = ((int[]) objArr21[1])[0];
                    String[] strArr19 = (String[]) objArr21[3];
                    int[] iArr8 = {i296};
                    int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                    int i297 = i294 + 712524294 + (((~(iFreeMemory3 | 341064511)) | (-1363966948)) * (-668)) + ((341064511 | (~((-1363966948) | iFreeMemory3))) * 1336) + ((iFreeMemory3 | (-1091059905)) * 668);
                    int i298 = (i297 << 13) ^ i297;
                    int i299 = i298 ^ (i298 >>> 17);
                    ((int[]) objArr22[0])[0] = i299 ^ (i299 << 5);
                    objArr22 = new Object[]{new int[1], iArr8, new int[]{i295}, strArr19};
                    i25 = 0;
                } else {
                    arrayList6 = new ArrayList();
                    strArr6 = (String[]) objArr21[3];
                    if (strArr6 != null) {
                        for (String str20 : strArr6) {
                            arrayList6.add(str20);
                        }
                    }
                    Toast.makeText((Context) null, i24 / (((i24 - 1) * i24) % 2), 0).show();
                    int i300 = ((int[]) objArr21[0])[0];
                    int i301 = ((int[]) objArr21[2])[0];
                    int i302 = ((int[]) objArr21[1])[0];
                    String[] strArr20 = (String[]) objArr21[3];
                    int[] iArr9 = {i301};
                    int[] iArr10 = {i302};
                    int i303 = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
                    int i304 = i300 + (-1466618082) + (((~((-1302809439) | i303)) | (-1610574815)) * (-502)) + ((~((~i303) | (-1208352795))) * (-502)) + (((~(i303 | (-402222021))) | (-1302809439)) * TypedValues.PositionType.TYPE_DRAWPATH);
                    int i305 = (i304 << 13) ^ i304;
                    int i306 = i305 ^ (i305 >>> 17);
                    i25 = 0;
                    ((int[]) objArr22[0])[0] = i306 ^ (i306 << 5);
                    objArr22 = new Object[]{new int[1], iArr10, iArr9, strArr20};
                }
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char cLastIndexOf2 = (char) (31532 - TextUtils.lastIndexOf("", '0', i25));
                    int mode4 = 921 - View.MeasureSpec.getMode(i25);
                    int iCombineMeasuredStates3 = View.combineMeasuredStates(i25, i25) + 28;
                    byte[] bArr36 = $$a;
                    byte b24 = bArr36[7];
                    Object[] objArr131 = new Object[1];
                    a(b24, (short) (b24 | 193), (byte) (bArr36[88] - 1), objArr131);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cLastIndexOf2, mode4, iCombineMeasuredStates3, -1048449946, false, (String) objArr131[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null) != -1) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                        char threadPriority5 = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 31533);
                        int scrollDefaultDelay4 = 921 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int deadChar4 = KeyEvent.getDeadChar(0, 0) + 28;
                        byte[] bArr37 = $$a;
                        Object[] objArr132 = new Object[1];
                        a((byte) 37, bArr37[7], bArr37[91], objArr132);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(threadPriority5, scrollDefaultDelay4, deadChar4, -1142834547, false, (String) objArr132[0], null);
                    }
                    Object[] objArr133 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).get(null);
                    objArr23 = new Object[]{new int[1], new int[]{((int[]) objArr133[1])[0]}, (Object[]) objArr133[2], new int[]{((int[]) objArr133[3])[0]}, (String[]) objArr133[4]};
                    int i307 = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1797882882;
                    int i308 = ~i307;
                    int i309 = ((((-767051142) + (((~((-761438958) | i308)) | (-1012640687)) * (-865))) + ((~(i307 | 761438957)) * 865)) + (((~((-1012640687) | i308)) | (~(i308 | 761438957))) * 865)) - 2005480525;
                    int i310 = (i309 << 13) ^ i309;
                    int i311 = i310 ^ (i310 >>> 17);
                    ((int[]) objArr23[0])[0] = i311 ^ (i311 << 5);
                } else {
                    baseContext4 = getBaseContext();
                    if (baseContext4 == null) {
                        baseContext4 = (Context) Class.forName(str12).getMethod(str6, new Class[0]).invoke(null, null);
                    }
                    if (baseContext4 != null) {
                        if (baseContext4 instanceof ContextWrapper) {
                            int i312 = g + 109;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i312 % 128;
                            int i313 = i312 % 2;
                            if (((ContextWrapper) baseContext4).getBaseContext() != null) {
                                baseContext4 = baseContext4.getApplicationContext();
                            } else {
                                baseContext4 = null;
                            }
                        } else {
                            baseContext4 = baseContext4.getApplicationContext();
                        }
                    }
                    Object[] objArr134 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, -2005480525};
                    byte[] bArr38 = $$d;
                    byte b25 = bArr38[117];
                    Object[] objArr135 = new Object[1];
                    d(b25, (short) (b25 | 370), bArr38[100], objArr135);
                    Class<?> cls7 = Class.forName((String) objArr135[0]);
                    Object[] objArr136 = new Object[1];
                    d((byte) (bArr38[39] + 1), (short) 429, (byte) (bArr38[368] - 1), objArr136);
                    objArr23 = (Object[]) cls7.getMethod((String) objArr136[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr134);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        char cIndexOf5 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        int scrollBarFadeDuration6 = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                        byte[] bArr39 = $$a;
                        Object[] objArr137 = new Object[1];
                        a((byte) 37, bArr39[7], bArr39[91], objArr137);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(cIndexOf5, scrollBarFadeDuration6, modifierMetaStateMask3, -1142834547, false, (String) objArr137[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, objArr23);
                    try {
                        long jLongValue18 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf23 = Long.valueOf(jLongValue18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                            char c16 = (char) (31533 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 922;
                            int minimumFlingVelocity4 = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            Object[] objArr138 = new Object[1];
                            a((byte) 52, (short) 37, $$a[91], objArr138);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(c16, packedPositionChild3, minimumFlingVelocity4, -778300370, false, (String) objArr138[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf23);
                        Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                            char defaultSize4 = (char) (View.getDefaultSize(0, 0) + 31533);
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 921;
                            int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0) + 29;
                            byte[] bArr40 = $$a;
                            byte b26 = bArr40[7];
                            Object[] objArr139 = new Object[1];
                            a(b26, (short) (b26 | 193), (byte) (bArr40[88] - 1), objArr139);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(defaultSize4, packedPositionType, iLastIndexOf4, -1048449946, false, (String) objArr139[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, lValueOf24);
                    } catch (Exception unused11) {
                        throw new RuntimeException();
                    }
                }
                if (((int[]) objArr23[3])[0] == ((int[]) objArr23[1])[0]) {
                    arrayList7 = new ArrayList();
                    strArr7 = (String[]) objArr23[4];
                    if (strArr7 != null) {
                        for (String str21 : strArr7) {
                            arrayList7.add(str21);
                        }
                    }
                    throw null;
                }
                int i314 = g + 75;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i314 % 128;
                int i315 = i314 % 2;
                int i316 = ((int[]) objArr23[0])[0];
                Object[] objArr140 = {new int[1], new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[]{((int[]) objArr23[3])[0]}, (String[]) objArr23[4]};
                int iIdentityHashCode5 = System.identityHashCode(this);
                int i317 = i316 + 2106421723 + (((~((-1727752120) | iIdentityHashCode5)) | 46294692) * 576) + (((~((~iIdentityHashCode5) | (-1681457428))) | 32832) * 576) + 895938816;
                int i318 = (i317 << 13) ^ i317;
                int i319 = i318 ^ (i318 >>> 17);
                ((int[]) objArr140[0])[0] = i319 ^ (i319 << 5);
                intent = getIntent();
                if (intent != null || intent.getExtras() == null) {
                    if (getUpdatedTransform.b == null) {
                        getUpdatedTransform.b = new getUpdatedTransform();
                    }
                    finish();
                }
                Bundle extras = getIntent().getExtras();
                int i320 = ((int[]) objArr18[1])[0];
                int i321 = i320 * i320;
                int i322 = -(1461666736 * i320);
                int i323 = ((i321 | i322) << 1) - (i321 ^ i322);
                int i324 = -(i320 * 1723229418);
                int i325 = ((i323 & i324) + (i324 | i323)) - (-1490263849);
                int i326 = i325 >> 18;
                int i327 = (((i326 ^ (-32767)) + ((i326 & (-32767)) << 1)) / 16384) - (-1);
                int i328 = (i325 ^ i327) + ((i327 & i325) << 1);
                int i329 = i325 >> 27;
                int i330 = (((i329 | (-63)) << 1) - (i329 ^ (-63))) / 32;
                int i331 = (-(i328 ^ (((i330 | 1) << 1) - (i330 ^ 1)))) + 3;
                int i332 = i331 >> 23;
                int i333 = (((i332 | (-1023)) << 1) - (i332 ^ (-1023))) / 512;
                int i334 = (i333 & 1) + (i333 | 1);
                int i335 = 3396249 / ((i331 & (-((i334 & 1) + (i334 | 1)))) * 1823);
                int i336 = ((int[]) objArr20[3])[0];
                int i337 = i336 * i336;
                int i338 = -(2059699882 * i336);
                int i339 = ((i337 | i338) << 1) - (i337 ^ i338);
                int i340 = -(i336 * (-78131416));
                int i341 = ((i339 | i340) << 1) - (i340 ^ i339);
                int i342 = (i341 & 514672657) + (514672657 | i341);
                int i343 = i342 >> 27;
                int i344 = (((i343 | (-63)) << 1) - (i343 ^ (-63))) / 32;
                int i345 = ((i344 | 1) << 1) - (i344 ^ 1);
                int i346 = (i342 & i345) + (i345 | i342);
                int i347 = i342 >> 16;
                int i348 = ((((-131071) | i347) << 1) - (i347 ^ (-131071))) / 65536;
                int i349 = (-(i346 ^ (((i348 | 1) << 1) - (i348 ^ 1)))) + 5;
                int i350 = i349 >> 21;
                int i351 = ((i350 & (-4095)) + (i350 | (-4095))) / 2048;
                int i352 = i335 + (1065350 / ((i349 & (-((((i351 | 1) << 1) - (i351 ^ 1)) - (-1)))) * 1639));
                int i353 = ((int[]) objArr22[0])[0];
                int i354 = i353 * i353;
                int i355 = -(1919740311 * i353);
                int i356 = (i354 & i355) + (i354 | i355);
                int i357 = -(i353 * 603998225);
                int i358 = (i356 ^ i357) + ((i357 & i356) << 1);
                int i359 = (i358 ^ 212627344) + ((212627344 & i358) << 1);
                int i360 = ((i359 >> 15) - 262143) / 131072;
                int i361 = ((i360 | 1) << 1) - (i360 ^ 1);
                int i362 = ((i359 | i361) << 1) - (i361 ^ i359);
                int i363 = i359 >> 23;
                int i364 = (((i363 | (-1023)) << 1) - (i363 ^ (-1023))) / 512;
                int i365 = -(i362 ^ (((i364 | 1) << 1) - (i364 ^ 1)));
                int i366 = (i365 ^ 6) + ((i365 & 6) << 1);
                int i367 = i366 >> 17;
                int i368 = ((((-65535) | i367) << 1) - (i367 ^ (-65535))) / 32768;
                int i369 = (i368 ^ 1) + ((i368 & 1) << 1);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (ImagePickerConfig) extras.getParcelable("1\\22\\ImagePickerConfig".substring(i352 + ((-4185060) / (((-((i369 ^ 1) + ((i369 & 1) << 1))) & i366) * 935))));
                Bundle extras2 = getIntent().getExtras();
                int i370 = ((int[]) objArr15[3])[0];
                int i371 = i370 * i370;
                int i372 = -(841659930 * i370);
                int i373 = (i371 ^ i372) + ((i371 & i372) << 1);
                int i374 = -(i370 * (-194216392));
                int i375 = (i373 & i374) + (i374 | i373);
                int i376 = (i375 & (-958702959)) + ((-958702959) | i375);
                int i377 = i376 >> 25;
                int i378 = (((i377 | (-255)) << 1) - (i377 ^ (-255))) / 128;
                int i379 = (-(((i378 & 1) + (i378 | 1)) ^ ((i376 - (~(i378 + 1))) - 1))) + 9;
                int i380 = i379 >> 27;
                int i381 = (((i380 ^ (-63)) + ((i380 & (-63)) << 1)) / 32) - (-1);
                int i382 = 7458264 / ((i379 & (-(((i381 | 1) << 1) - (i381 ^ 1)))) * 1752);
                int i383 = ((int[]) objArr140[0])[0];
                int i384 = i383 * i383;
                int i385 = -(1342497826 * i383);
                int i386 = (i384 ^ i385) + ((i384 & i385) << 1);
                int i387 = -(i383 * (-875105308));
                int i388 = ((i386 | i387) << 1) - (i387 ^ i386);
                int i389 = ((i388 | 623085577) << 1) - (623085577 ^ i388);
                int i390 = i389 >> 25;
                int i391 = (i389 - (~((((i390 ^ (-255)) + ((i390 & (-255)) << 1)) / 128) - (-1)))) - 1;
                int i392 = i389 >> 24;
                int i393 = (((i392 | (-511)) << 1) - (i392 ^ (-511))) / 256;
                int i394 = (-(i391 ^ ((i393 & 1) + (i393 | 1)))) + 4;
                int i395 = i394 >> 28;
                int i396 = ((i395 & (-31)) + (i395 | (-31))) / 16;
                CameraOnlyConfig cameraOnlyConfig = (CameraOnlyConfig) extras2.getParcelable("14\\17\\26\\CameraOnlyConfig".substring(i382 + ((-389760) / ((i394 & (-(((i396 ^ 1) + ((i396 & 1) << 1)) - (-1)))) * 210))));
                if (cameraOnlyConfig != null) {
                    FrameLayout frameLayout = new FrameLayout(this);
                    frameLayout.setId(R.id.ef_imagepicker_fragment_placeholder);
                    setContentView(frameLayout);
                } else {
                    setTheme(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                    setContentView(R.layout.ef_activity_image_picker);
                    setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
                    ActionBar supportActionBar = getSupportActionBar();
                    this.TuitionPaymentFragmentbindingInflater1 = supportActionBar;
                    if (supportActionBar != null) {
                        Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), getResources().getConfiguration().getLayoutDirection() == 1 ? 2131231044 : 2131231043);
                        int i397 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
                        if (i397 != -1 && drawable != null) {
                            drawable.setColorFilter(i397, PorterDuff.Mode.SRC_ATOP);
                        }
                        this.TuitionPaymentFragmentbindingInflater1.setDisplayHomeAsUpEnabled(true);
                        this.TuitionPaymentFragmentbindingInflater1.setHomeAsUpIndicator(drawable);
                        this.TuitionPaymentFragmentbindingInflater1.setDisplayShowTitleEnabled(true);
                    }
                }
                if (bundle != null) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (submitProcessingRequest) getSupportFragmentManager().findFragmentById(R.id.ef_imagepicker_fragment_placeholder);
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = submitProcessingRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, cameraOnlyConfig);
                FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransactionBeginTransaction.replace(R.id.ef_imagepicker_fragment_placeholder, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                fragmentTransactionBeginTransaction.commit();
                return;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault75 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault75 == null) {
            char c17 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int iArgb = Color.argb(0, 0, 0, 0) + 876;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
            byte b27 = $$a[7];
            byte b28 = b27;
            Object[] objArr141 = new Object[1];
            a(b28, (short) (b28 | 210), b27, objArr141);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault75 = initSession.b(c17, iArgb, iMakeMeasureSpec, 256017550, false, (String) objArr141[0], null);
        }
        Object[] objArr142 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault75).get(null);
        objArr4 = new Object[]{new int[]{((int[]) objArr142[0])[0]}, new int[1], new int[]{((int[]) objArr142[2])[0]}, (String[]) objArr142[3]};
        int i398 = ~((~((int) Process.getElapsedCpuTime())) | 729360815);
        int i399 = ((688914826 | i398) * (-374)) + 2049486690 + ((i398 | 40445989) * 374) + 1893998054;
        int i400 = (i399 << 13) ^ i399;
        int i401 = i400 ^ (i400 >>> 17);
        ((int[]) objArr4[1])[0] = i401 ^ (i401 << 5);
        str3 = str13;
        str11 = str11;
        i2 = ((int[]) objArr4[2])[0];
        i3 = ((int[]) objArr4[0])[0];
        if (i3 == i2) {
            int i610 = g + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i610 % 128;
            int i611 = i610 % 2;
            int i710 = ((int[]) objArr4[1])[0];
            objArr5 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
            str4 = str2;
            int i711 = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i712 = ~((-138051878) | i711);
            int i713 = (-1308334500) + ((1179904 | i712) * (-280)) + ((i712 | (~(97741648 | i711))) * 140);
            int i714 = ~((-136871974) | i711);
            int i715 = ~i711;
            int i716 = i710 + i713 + (((~(i715 | 234613621)) | i714 | (~((-1179905) | i715))) * 140);
            int i717 = i716 ^ (i716 << 13);
            int i718 = i717 ^ (i717 >>> 17);
            ((int[]) objArr5[1])[0] = i718 ^ (i718 << 5);
            i4 = 1;
        } else {
            str4 = str2;
            int[] iArr11 = new int[i3];
            int i719 = i3 - 1;
            iArr11[i719] = 1;
            Toast.makeText((Context) null, iArr11[((i3 * i719) % 2) - 1], 1).show();
            int i810 = ((int[]) objArr4[1])[0];
            Object[] objArr610 = {new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i811 = ~((-568587351) | iIdentityHashCode6);
            int i812 = (-1017486348) + ((23122944 | i811) * (-280)) + ((i811 | (~(528277121 | iIdentityHashCode6))) * 140);
            int i813 = ~((-545464407) | iIdentityHashCode6);
            int i814 = ~iIdentityHashCode6;
            int i815 = i810 + i812 + (((~(i814 | 1073741527)) | i813 | (~((-23122945) | i814))) * 140);
            int i816 = (i815 << 13) ^ i815;
            int i817 = i816 ^ (i816 >>> 17);
            i4 = 1;
            ((int[]) objArr610[1])[0] = i817 ^ (i817 << 5);
            objArr5 = objArr610;
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char gidForName4 = (char) (Process.getGidForName("") + i4);
            int i818 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2266;
            int i819 = 34 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            Object[] objArr611 = new Object[1];
            a((byte) 52, (short) 37, $$a[91], objArr611);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName4, i818, i819, -887667012, false, (String) objArr611[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char c18 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int scrollBarFadeDuration7 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2267;
                int i910 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32;
                byte[] bArr110 = $$a;
                Object[] objArr612 = new Object[1];
                a((byte) 37, bArr110[7], bArr110[91], objArr612);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c18, scrollBarFadeDuration7, i910, -654680577, false, (String) objArr612[0], null);
            }
            Object[] objArr613 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).get(null);
            objArr7 = new Object[]{new int[]{i91}, strArr9, new int[1], new int[]{i92}};
            int i911 = ((int[]) objArr613[0])[0];
            int i912 = ((int[]) objArr613[3])[0];
            String[] strArr21 = (String[]) objArr613[1];
            int i913 = ~((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            int i914 = 408439959 + (((~(804256703 | i913)) | 4456612) * (-828)) + ((i913 | 804256703) * (-828)) + 1373337560;
            int i915 = (i914 << 13) ^ i914;
            int i916 = i915 ^ (i915 >>> 17);
            ((int[]) objArr7[2])[0] = i916 ^ (i916 << 5);
            str3 = str3;
            str5 = str11;
            c = 3;
            objArr5 = objArr5;
        } else {
            baseContext = getBaseContext();
            if (baseContext == null) {
                baseContext = (Context) Class.forName(str12).getMethod(str3, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if (baseContext instanceof ContextWrapper) {
                    baseContext = baseContext.getApplicationContext();
                } else {
                    baseContext = baseContext.getApplicationContext();
                }
            }
            str5 = str11;
            Object[] objArr614 = {baseContext, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 1577957592};
            byte[] bArr111 = $$d;
            byte b110 = bArr111[20];
            Object[] objArr615 = new Object[1];
            d(b110, (short) (b110 | 226), (byte) (-bArr111[41]), objArr615);
            Class<?> cls8 = Class.forName((String) objArr615[0]);
            Object[] objArr710 = new Object[1];
            d((byte) (bArr111[39] + 1), (short) 262, (byte) (-bArr111[33]), objArr710);
            objArr6 = (Object[]) cls8.getMethod((String) objArr710[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr614);
            if (baseContext != null) {
                int i917 = g + 113;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i917 % 128;
                int i918 = i917 % 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c19 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                    int touchSlop5 = (ViewConfiguration.getTouchSlop() >> 8) + 2267;
                    int threadPriority6 = 33 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte[] bArr112 = $$a;
                    Object[] objArr711 = new Object[1];
                    a((byte) 37, bArr112[7], bArr112[91], objArr711);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c19, touchSlop5, threadPriority6, -654680577, false, (String) objArr711[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, objArr6);
                long jLongValue19 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf25 = Long.valueOf(jLongValue19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char offsetAfter9 = (char) TextUtils.getOffsetAfter("", 0);
                    int tapTimeout2 = 2267 - (ViewConfiguration.getTapTimeout() >> 16);
                    int iGreen4 = Color.green(0) + 33;
                    Object[] objArr712 = new Object[1];
                    a((byte) 52, (short) 141, $$a[91], objArr712);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter9, tapTimeout2, iGreen4, -874156483, false, (String) objArr712[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, lValueOf25);
                Long lValueOf110 = Long.valueOf(jLongValue19 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char modifierMetaStateMask4 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int iCombineMeasuredStates4 = View.combineMeasuredStates(0, 0) + 2267;
                    int offsetAfter10 = TextUtils.getOffsetAfter("", 0) + 33;
                    Object[] objArr713 = new Object[1];
                    a((byte) 52, (short) 37, $$a[91], objArr713);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask4, iCombineMeasuredStates4, offsetAfter10, -887667012, false, (String) objArr713[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf110);
            } else {
                objArr6 = objArr6;
                objArr5 = objArr5;
                str3 = str3;
            }
            objArr7 = objArr6;
            c = 3;
        }
        if (((int[]) objArr7[0])[0] == ((int[]) objArr7[c])[0]) {
            arrayList = new ArrayList();
            strArr = (String[]) objArr7[1];
            if (strArr != null) {
                while (i5 < strArr.length) {
                    arrayList.add(str15);
                }
            }
            throw null;
        }
        objArr8 = new Object[]{new int[]{i100}, strArr10, new int[1], new int[]{i101}};
        int i919 = ((int[]) objArr7[2])[0];
        int i1010 = ((int[]) objArr7[0])[0];
        int i1011 = ((int[]) objArr7[3])[0];
        String[] strArr110 = (String[]) objArr7[1];
        int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
        int i1012 = 1912611025 + ((startElapsedRealtime3 | 1059640729) * (-50));
        int i1013 = ~((-822609033) | startElapsedRealtime3);
        int i1014 = ~startElapsedRealtime3;
        int i1015 = i919 + i1012 + ((i1013 | (~(1073536445 | i1014))) * 50) + (((~(i1014 | 1059640729)) | (~(250927413 | i1014)) | (-1073536446)) * 50);
        int i1016 = (i1015 << 13) ^ i1015;
        int i1017 = i1016 ^ (i1016 >>> 17);
        ((int[]) objArr8[2])[0] = i1017 ^ (i1017 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf("", "") + 46400), Color.argb(0, 0, 0, 0) + 40, 19 - TextUtils.indexOf("", "", 0, 0), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (46401 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 40 - View.MeasureSpec.getSize(0), Color.rgb(0, 0, 0) + 16777235, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(obj3, null);
        super.onCreate(bundle);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char packedPositionGroup3 = (char) ExpandableListView.getPackedPositionGroup(0L);
            int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1031;
            int threadPriority7 = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
            Object[] objArr714 = new Object[1];
            a((byte) 52, (short) 141, $$a[91], objArr714);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionGroup3, windowTouchSlop3, threadPriority7, 1357589585, false, (String) objArr714[0], null);
        }
        j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        jLongValue = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char maximumDrawingCacheSize4 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int touchSlop6 = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
            int i1018 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
            Object[] objArr715 = new Object[1];
            a((byte) 52, (short) 37, $$a[91], objArr715);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumDrawingCacheSize4, touchSlop6, i1018, 1344079056, false, (String) objArr715[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                char edgeSlop5 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int deadChar5 = KeyEvent.getDeadChar(0, 0) + 1031;
                int touchSlop7 = 15 - (ViewConfiguration.getTouchSlop() >> 8);
                byte[] bArr113 = $$a;
                byte b111 = bArr113[7];
                Object[] objArr716 = new Object[1];
                a(b111, (short) (b111 | 193), (byte) (bArr113[88] - 1), objArr716);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(edgeSlop5, deadChar5, touchSlop7, 632103528, false, (String) objArr716[0], null);
            }
            Object[] objArr717 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
            objArr9 = new Object[]{strArr11, new int[]{i110}, new int[1], new int[]{i109}};
            int i1019 = ((int[]) objArr717[3])[0];
            int i1110 = ((int[]) objArr717[1])[0];
            String[] strArr111 = (String[]) objArr717[0];
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i1111 = ~iElapsedRealtime2;
            int i1112 = ((((-1882456999) + (((~(i1111 | 559527106)) | ((~(315246936 | i1111)) | (-870055387))) * 464)) + (((-554808451) | iElapsedRealtime2) * (-464))) + (((~(iElapsedRealtime2 | 559527106)) | (-870055387)) * 464)) - 1591509105;
            int i1113 = (i1112 << 13) ^ i1112;
            int i1114 = i1113 ^ (i1113 >>> 17);
            ((int[]) objArr9[2])[0] = i1114 ^ (i1114 << 5);
        } else {
            int iIntValue5 = ((Integer) Class.forName(str10).getMethod(str5, Object.class).invoke(null, this)).intValue();
            Object[] objArr718 = {-611472346};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (46038 - TextUtils.getOffsetBefore("", 0)), 1134 - TextUtils.getCapsMode("", 0, 0), View.getDefaultSize(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr719 = {Integer.valueOf(iIntValue5), 0, -1591509105, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).newInstance(objArr718), false};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cResolveOpacity3 = (char) Drawable.resolveOpacity(0, 0);
                int offsetAfter11 = 1031 - TextUtils.getOffsetAfter("", 0);
                int scrollDefaultDelay5 = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                Object[] objArr810 = new Object[1];
                a((byte) 52, (short) 141, $$a[91], objArr810);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cResolveOpacity3, offsetAfter11, scrollDefaultDelay5, 1298546779, false, (String) objArr810[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 45993), 1117 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Boolean.TYPE});
            }
            objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr719);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char scrollBarSize3 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                int i1115 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
                byte[] bArr114 = $$a;
                byte b112 = bArr114[7];
                Object[] objArr811 = new Object[1];
                a(b112, (short) (b112 | 193), (byte) (bArr114[88] - 1), objArr811);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(scrollBarSize3, pressedStateDuration2, i1115, 632103528, false, (String) objArr811[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, objArr9);
            long jLongValue110 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf111 = Long.valueOf(jLongValue110);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char packedPositionChild4 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                int edgeSlop6 = 1031 - (ViewConfiguration.getEdgeSlop() >> 16);
                int longPressTimeout4 = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
                Object[] objArr812 = new Object[1];
                a((byte) 52, (short) 37, $$a[91], objArr812);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(packedPositionChild4, edgeSlop6, longPressTimeout4, 1344079056, false, (String) objArr812[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf111);
            Long lValueOf112 = Long.valueOf(jLongValue110 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cAxisFromString2 = (char) ((-1) - MotionEvent.axisFromString(""));
                int gidForName5 = 1030 - Process.getGidForName("");
                int i1116 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                Object[] objArr813 = new Object[1];
                a((byte) 52, (short) 141, $$a[91], objArr813);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAxisFromString2, gidForName5, i1116, 1357589585, false, (String) objArr813[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf112);
        }
        i6 = ((int[]) objArr9[1])[0];
        i7 = ((int[]) objArr9[3])[0];
        if (i7 == i6) {
            arrayList2 = new ArrayList();
            strArr2 = (String[]) objArr9[0];
            if (strArr2 != null) {
                while (i8 < strArr2.length) {
                    arrayList2.add(str16);
                }
            }
            throw new RuntimeException(String.valueOf(i7));
        }
        objArr10 = new Object[]{strArr12, new int[]{i119}, new int[1], new int[]{i118}};
        int i1117 = ((int[]) objArr9[2])[0];
        int i1118 = ((int[]) objArr9[3])[0];
        int i1119 = ((int[]) objArr9[1])[0];
        String[] strArr112 = (String[]) objArr9[0];
        int i1210 = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        int i1211 = ~i1210;
        int i1212 = i1117 + 1812472440 + (((~((-927421933) | i1211)) | 683141762) * (-865)) + ((~(i1210 | 927421932)) * 865) + (((~(683141762 | i1211)) | (~(i1211 | 927421932))) * 865);
        int i1213 = (i1212 << 13) ^ i1212;
        int i1214 = i1213 ^ (i1213 >>> 17);
        ((int[]) objArr10[2])[0] = i1214 ^ (i1214 << 5);
        int i1215 = g + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1215 % 128;
        int i1216 = i1215 % 2;
        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
            char cMyPid2 = (char) ((Process.myPid() >> 22) + 37567);
            int iAxisFromString4 = 624 - MotionEvent.axisFromString("");
            int iIndexOf8 = 13 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte[] bArr210 = $$a;
            byte b113 = bArr210[7];
            Object[] objArr814 = new Object[1];
            a(b113, (short) (b113 | 193), (byte) (bArr210[88] - 1), objArr814);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMyPid2, iAxisFromString4, iIndexOf8, -477065106, false, (String) objArr814[0], null);
        }
        j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null);
        jLongValue2 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
            char c20 = (char) (37568 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int deadChar6 = KeyEvent.getDeadChar(0, 0) + 625;
            int iAlpha4 = Color.alpha(0) + 14;
            Object[] objArr815 = new Object[1];
            a((byte) 52, (short) 141, $$a[91], objArr815);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c20, deadChar6, iAlpha4, -976899241, false, (String) objArr815[0], null);
        }
        if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                char fadingEdgeLength2 = (char) (37567 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                int minimumFlingVelocity5 = 625 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int i1217 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14;
                Object[] objArr816 = new Object[1];
                a((byte) 52, (short) 37, $$a[91], objArr816);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(fadingEdgeLength2, minimumFlingVelocity5, i1217, -973632554, false, (String) objArr816[0], null);
            }
            Object[] objArr817 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).get(null);
            int i1218 = ((int[]) objArr817[2])[0];
            int i1219 = ((int[]) objArr817[0])[0];
            String[] strArr113 = (String[]) objArr817[3];
            int[] iArr12 = {i1218};
            int length3 = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_expired).substring(7, 9).length() + 812520087;
            int i1310 = 185355544 + (((~((~length3) | (-1736412421))) | 87297028) * 446) + (((~(length3 | (-1649115393))) | 28672) * 446) + 1098071972;
            int i1311 = (i1310 << 13) ^ i1310;
            int i1312 = i1311 ^ (i1311 >>> 17);
            ((int[]) objArr13[1])[0] = i1312 ^ (i1312 << 5);
            objArr13 = new Object[]{new int[]{i1219}, new int[1], iArr12, strArr113};
            c2 = 0;
            str6 = str3;
        } else {
            baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                str6 = str3;
                baseContext2 = (Context) Class.forName(str12).getMethod(str6, new Class[0]).invoke(null, null);
            } else {
                str6 = str3;
            }
            if (baseContext2 == null) {
                objArr11 = null;
            } else {
                if (baseContext2 instanceof ContextWrapper) {
                    i9 = g + 23;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                    if (i9 % 2 == 0) {
                        ((ContextWrapper) baseContext2).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) baseContext2).getBaseContext() != null) {
                        baseContext2 = null;
                        objArr11 = null;
                    }
                }
                objArr11 = null;
                baseContext2 = baseContext2.getApplicationContext();
            }
            int iIntValue6 = ((Integer) Class.forName(str10).getMethod(str5, Object.class).invoke(objArr11, this)).intValue();
            Object[] objArr818 = new Object[1];
            c(true, 203 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(objArr11, objArr11)).getApplicationContext().getPackageName().length() + 53, ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(objArr11, objArr11)).getApplicationContext().getResources().getString(R.string.permata_bank_transfer).substring(0, 7).codePointAt(3) - 82, new char[]{25, 65518, 28, 25, 65518, 65518, 65516, 28, 65517, 65512, 65518, 65516, 24, 28, 28, 65516, 29, 29, 65520, 65517, 29, 25, 24, 24, 29, 28, 65513, 25, 65513, 29, 25, 25, 65515, 65519, 65520, 25, 65513, 65519, 65515, 24, 65519, 65511, 24, 65516, 65514, 28, 29, 65519, 65515, 65516, 29, 24, 65519, 65512, 65512, 65520, 65513, 24, 65520, 65520, 65515, 27, 65514, 65512}, objArr818);
            String str110 = (String) objArr818[0];
            Object[] objArr819 = new Object[1];
            c(true, ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 163, ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_atm_transfer_step4).substring(4, 6).codePointAt(1) - 48, ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 10, new char[]{65519, 65522, 65521, '!', ' ', 65517, 65517, 28, ' ', 65519, 65516, 65520, 29, 65524, 65523, 65524, 65524, 65518, 65524, 29, 65519, 29, 65521, '!', 65522, 65520, 65518, 65521, 65518, 65517, 65519, '!', 65517, ' ', 29, 65515, '!', ' ', 65522, 29, 65520, 65515, 65521, 31, 28, 30, '!', 65521, 65515, 28, 65519, 65517, '!', 30, 65517, 65518, 65519, 29, 65524, 65524, 30, 65524, 65518, 65518}, objArr819);
            Object[] objArr910 = {baseContext2, new String[]{str110, (String) objArr819[0]}, Integer.valueOf(iIntValue6), 17, 818303148};
            byte[] bArr211 = $$d;
            byte b114 = bArr211[25];
            Object[] objArr911 = new Object[1];
            d(b114, (short) (b114 | 299), (byte) (-bArr211[327]), objArr911);
            Class<?> cls9 = Class.forName((String) objArr911[0]);
            Object[] objArr912 = new Object[1];
            d(bArr211[48], (short) 339, bArr211[25], objArr912);
            objArr12 = (Object[]) cls9.getMethod((String) objArr912[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr910);
            int i1313 = ((int[]) objArr12[0])[0];
            int i1314 = ((int[]) objArr12[2])[0];
            if (baseContext2 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char cCombineMeasuredStates2 = (char) (View.combineMeasuredStates(0, 0) + 37567);
                    int iGreen5 = Color.green(0) + 625;
                    int iGreen6 = 14 - Color.green(0);
                    Object[] objArr913 = new Object[1];
                    a((byte) 52, (short) 37, $$a[91], objArr913);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cCombineMeasuredStates2, iGreen5, iGreen6, -973632554, false, (String) objArr913[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, objArr12);
                long jLongValue111 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf113 = Long.valueOf(jLongValue111);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                    char cIndexOf6 = (char) (37567 - TextUtils.indexOf("", ""));
                    int defaultSize5 = 625 - View.getDefaultSize(0, 0);
                    int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14;
                    Object[] objArr914 = new Object[1];
                    a((byte) 52, (short) 141, $$a[91], objArr914);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cIndexOf6, defaultSize5, keyRepeatDelay3, -976899241, false, (String) objArr914[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf113);
                Long lValueOf114 = Long.valueOf(jLongValue111 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    char doubleTapTimeout4 = (char) (37567 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int longPressTimeout5 = (ViewConfiguration.getLongPressTimeout() >> 16) + 625;
                    int packedPositionGroup4 = 14 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr212 = $$a;
                    byte b115 = bArr212[7];
                    Object[] objArr915 = new Object[1];
                    a(b115, (short) (b115 | 193), (byte) (bArr212[88] - 1), objArr915);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(doubleTapTimeout4, longPressTimeout5, packedPositionGroup4, -477065106, false, (String) objArr915[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, lValueOf114);
            } else {
                objArr12 = objArr12;
            }
            objArr13 = objArr12;
            c2 = 0;
        }
        if (((int[]) objArr13[2])[c2] == ((int[]) objArr13[c2])[c2]) {
            arrayList3 = new ArrayList();
            strArr3 = (String[]) objArr13[3];
            if (strArr3 != null) {
                while (i10 < strArr3.length) {
                    arrayList3.add(str18);
                }
            }
            throw null;
        }
        int i1315 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        g = i1315 % 128;
        int i1316 = i1315 % 2;
        int i1317 = ((int[]) objArr13[1])[0];
        int i1318 = ((int[]) objArr13[2])[0];
        int i1319 = ((int[]) objArr13[0])[0];
        String[] strArr114 = (String[]) objArr13[3];
        int[] iArr13 = {i1318};
        int iIdentityHashCode7 = System.identityHashCode(this);
        int i1410 = i1317 + (((~((-1689046557) | iIdentityHashCode7)) | 1823208688) * 398) + 2143211552 + (((~((~iIdentityHashCode7) | (-1689046557))) | 1823208688) * 398);
        int i1411 = i1410 ^ (i1410 << 13);
        int i1412 = i1411 ^ (i1411 >>> 17);
        Object obj4 = new Object[]{new int[]{i1319}, new int[1], iArr13, strArr114}[1];
        ((int[]) obj4)[0] = i1412 ^ (i1412 << 5);
        int i1413 = ((int[]) objArr2[1])[0];
        int i1414 = ((((i1413 * i1413) - (~(-(180800095 * i1413)))) - 1) - (~(-(i1413 * (-1230180253))))) - 1;
        int i1415 = (i1414 & 1973591745) + (1973591745 | i1414);
        int i1416 = i1415 >> 16;
        int i1417 = (((-131071) & i1416) + (i1416 | (-131071))) / 65536;
        int i1418 = (i1417 & 1) + (i1417 | 1);
        int i1419 = (i1415 & i1418) + (i1418 | i1415);
        int i1510 = i1415 >> 25;
        int i1511 = (-(i1419 ^ ((((i1510 & (-255)) + (i1510 | (-255))) / 128) - (-1)))) + 8;
        int i1512 = ((i1511 >> 20) - 8191) / 4096;
        int i1513 = 5821312 / ((i1511 & (-((((i1512 | 1) << 1) - (i1512 ^ 1)) - (-1)))) * 1246);
        int i1514 = ((int[]) objArr52[1])[0];
        int i1515 = i1514 * i1514;
        int i1516 = -(1166158799 * i1514);
        int i1517 = (((i1515 & i1516) + (i1515 | i1516)) - (~(-(i1514 * (-2085611891))))) - 1656167357;
        int i1518 = ((i1517 >> 24) - 511) / 256;
        int i1519 = (i1517 - (~(((i1518 | 1) << 1) - (i1518 ^ 1)))) - 1;
        int i1610 = ((i1517 >> 16) - 131071) / 65536;
        int i1611 = (-(i1519 ^ ((i1610 ^ 1) + ((i1610 & 1) << 1)))) - (-1);
        int i1612 = i1611 >> 18;
        int i1613 = ((i1612 ^ (-32767)) + ((i1612 & (-32767)) << 1)) / 16384;
        int i1614 = (i1613 ^ 1) + ((i1613 & 1) << 1);
        int i1615 = i1513 + (1066373 / ((i1611 & (-(((i1614 | 1) << 1) - (i1614 ^ 1)))) * 1259));
        int i1616 = ((int[]) objArr5[1])[0];
        int i1617 = ((i1616 * i1616) - (~(-(1520651278 * i1616)))) - 1;
        int i1618 = -(i1616 * (-788111114));
        int i1619 = (i1617 ^ i1618) + ((i1618 & i1617) << 1);
        int i1710 = (i1619 & 1326291460) + (1326291460 | i1619);
        int i1711 = (((i1710 >> 28) - 31) / 16) - (-1);
        int i1712 = (i1710 ^ i1711) + ((i1711 & i1710) << 1);
        int i1713 = ((i1710 >> 19) - 16383) / 8192;
        int i1714 = (-(i1712 ^ ((i1713 & 1) + (i1713 | 1)))) + 9;
        int i1715 = i1714 >> 26;
        int i1716 = ((i1715 ^ ComposerKt.defaultsKey) + ((i1715 & ComposerKt.defaultsKey) << 1)) / 64;
        int i1717 = (i1716 & 1) + (i1716 | 1);
        int i1718 = i1615 + (4743441 / ((i1714 & (-((i1717 & 1) + (i1717 | 1)))) * 1119));
        int i1719 = ((int[]) objArr8[2])[0];
        int i1810 = i1719 * i1719;
        int i1811 = -(1329298052 * i1719);
        int i1812 = (i1810 ^ i1811) + ((i1810 & i1811) << 1);
        int i1813 = -(i1719 * 1629163812);
        int i1814 = (i1812 ^ i1813) + ((i1813 & i1812) << 1);
        int i1815 = ((i1814 | 1212413840) << 1) - (1212413840 ^ i1814);
        int i1816 = i1815 >> 28;
        int i1817 = ((((i1816 | (-31)) << 1) - (i1816 ^ (-31))) / 16) - (-1);
        int i1818 = (i1815 ^ i1817) + ((i1817 & i1815) << 1);
        int i1819 = i1815 >> 21;
        int i1910 = (((i1819 | (-4095)) << 1) - (i1819 ^ (-4095))) / 2048;
        int i1911 = -(i1818 ^ (((i1910 | 1) << 1) - (i1910 ^ 1)));
        int i1912 = ((i1911 | 7) << 1) - (i1911 ^ 7);
        int i1913 = i1912 >> 29;
        int i1914 = (((i1913 | (-15)) << 1) - (i1913 ^ (-15))) / 8;
        int i1915 = i1718 + (2410625 / (((-(((i1914 ^ 1) + ((i1914 & 1) << 1)) - (-1))) & i1912) * 725));
        int i1916 = ((int[]) objArr10[2])[0];
        int i1917 = i1916 * i1916;
        int i1918 = -(1332111193 * i1916);
        int i1919 = (i1917 & i1918) + (i1917 | i1918);
        int i2010 = -(i1916 * 1869382301);
        int i2011 = ((i1919 | i2010) << 1) - (i2010 ^ i1919);
        int i2012 = (i2011 & 1968860697) + (1968860697 | i2011);
        int i2013 = i2012 >> 18;
        int i2014 = ((i2013 & (-32767)) + (i2013 | (-32767))) / 16384;
        int i2015 = (i2012 - (~(((i2014 | 1) << 1) - (i2014 ^ 1)))) - 1;
        int i2016 = i2012 >> 19;
        int i2017 = (-(i2015 ^ (((((i2016 | (-16383)) << 1) - (i2016 ^ (-16383))) / 8192) - (-1)))) + 3;
        int i2018 = i2017 >> 17;
        int i2019 = (((-65535) & i2018) + (i2018 | (-65535))) / 32768;
        int i2110 = i1915 + (4958478 / ((i2017 & (-((((i2019 | 1) << 1) - (i2019 ^ 1)) - (-1)))) * 1711));
        int i2111 = ((int[]) obj4)[0];
        int i2112 = ((i2111 * i2111) - (~(-(1771270277 * i2111)))) - 1;
        int i2113 = -(i2111 * 1685574011);
        int i2114 = ((i2112 ^ i2113) + ((i2112 & i2113) << 1)) - 1354694656;
        int i2115 = i2114 >> 21;
        int i2116 = (((i2115 | (-4095)) << 1) - (i2115 ^ (-4095))) / 2048;
        int i2117 = (i2116 ^ 1) + ((i2116 & 1) << 1);
        int i2118 = ((i2114 | i2117) << 1) - (i2117 ^ i2114);
        int i2119 = i2114 >> 22;
        int i2210 = (((i2119 | (-2047)) << 1) - (i2119 ^ (-2047))) / 1024;
        int i2211 = (-(((i2210 ^ 1) + ((i2210 & 1) << 1)) ^ i2118)) + 3;
        int i2212 = i2211 >> 25;
        int i2213 = (((i2212 ^ (-255)) + ((i2212 & (-255)) << 1)) / 128) - (-1);
        setResult(i2110 + ((-19155390) / ((i2211 & (-((i2213 & 1) + (i2213 | 1)))) * 1910)));
        objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            char c110 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int i2214 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
            int i2215 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44;
            Object[] objArr916 = new Object[1];
            a((byte) 52, (short) 89, $$a[91], objArr916);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(c110, i2214, i2215, -459846511, false, (String) objArr916[0], null);
        }
        j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null);
        jLongValue3 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
            char longPressTimeout6 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int iLastIndexOf5 = TextUtils.lastIndexOf("", '0', 0) + 652;
            int size5 = View.MeasureSpec.getSize(0) + 44;
            byte[] bArr213 = $$a;
            byte b116 = bArr213[7];
            Object[] objArr917 = new Object[1];
            a(b116, (short) (b116 | 193), (byte) (bArr213[88] - 1), objArr917);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(longPressTimeout6, iLastIndexOf5, size5, -873460649, false, (String) objArr917[0], null);
        }
        if (j3 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                char mode5 = (char) View.MeasureSpec.getMode(0);
                int keyRepeatTimeout3 = 651 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iRgb4 = (-16777172) - Color.rgb(0, 0, 0);
                byte[] bArr214 = $$a;
                Object[] objArr918 = new Object[1];
                a((byte) 37, bArr214[7], bArr214[91], objArr918);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(mode5, keyRepeatTimeout3, iRgb4, -1595579076, false, (String) objArr918[0], null);
            }
            Object[] objArr919 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).get(null);
            objArr14 = new Object[]{new int[]{i227}, new String[0], new int[]{i226}, new int[1]};
            int i2216 = ((int[]) objArr919[2])[0];
            int i2217 = ((int[]) objArr919[0])[0];
            int iCodePointAt3 = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_bca).substring(1, 3).codePointAt(0) - 493722370;
            int i2218 = ((((-1286553375) + ((7630458 | iCodePointAt3) * 376)) + (((~((~iCodePointAt3) | 199193994)) | 2099824) * (-376))) + (((~(iCodePointAt3 | (-199193995))) | (-195763185)) * 376)) - 608635772;
            int i2219 = (i2218 << 13) ^ i2218;
            int i2310 = i2219 ^ (i2219 >>> 17);
            ((int[]) objArr14[3])[0] = i2310 ^ (i2310 << 5);
            i11 = 0;
        } else {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.indexOf((CharSequence) "", '0') + 1611, 25 - ExpandableListView.getPackedPositionChild(0L), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr1010 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).newInstance(null), -608635772, 0};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char maxKeyCode3 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int iResolveSize5 = View.resolveSize(0, 0) + 651;
                int minimumFlingVelocity6 = 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte[] bArr215 = $$a;
                byte b29 = bArr215[7];
                Object[] objArr1011 = new Object[1];
                a(b29, (short) (b29 | 193), (byte) (bArr215[88] - 1), objArr1011);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(maxKeyCode3, iResolveSize5, minimumFlingVelocity6, 2075921419, false, (String) objArr1011[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0) + 695, 97 - ExpandableListView.getPackedPositionChild(0L)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 793 - (KeyEvent.getMaxKeyCode() >> 16), 83 - View.MeasureSpec.makeMeasureSpec(0, 0)), Integer.TYPE, Integer.TYPE});
            }
            objArr14 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr1010);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char minimumFlingVelocity7 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iIndexOf9 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 652;
                int jumpTapTimeout5 = 44 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte[] bArr216 = $$a;
                Object[] objArr1012 = new Object[1];
                a((byte) 37, bArr216[7], bArr216[91], objArr1012);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(minimumFlingVelocity7, iIndexOf9, jumpTapTimeout5, -1595579076, false, (String) objArr1012[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, objArr14);
            long jLongValue112 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf115 = Long.valueOf(jLongValue112);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char scrollBarFadeDuration8 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int maximumDrawingCacheSize5 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 651;
                int mirror2 = AndroidCharacter.getMirror('0') - 4;
                byte[] bArr217 = $$a;
                byte b210 = bArr217[7];
                Object[] objArr1013 = new Object[1];
                a(b210, (short) (b210 | 193), (byte) (bArr217[88] - 1), objArr1013);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(scrollBarFadeDuration8, maximumDrawingCacheSize5, mirror2, -873460649, false, (String) objArr1013[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf115);
            Long lValueOf116 = Long.valueOf(jLongValue112 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char cIndexOf7 = (char) TextUtils.indexOf("", "");
                int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 651;
                int i2311 = 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr1014 = new Object[1];
                a((byte) 52, (short) 89, $$a[91], objArr1014);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cIndexOf7, absoluteGravity3, i2311, -459846511, false, (String) objArr1014[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf116);
            i11 = 0;
        }
        i12 = ((int[]) objArr14[i11])[i11];
        i13 = ((int[]) objArr14[2])[i11];
        if (i13 == i12) {
            objArr15 = new Object[4];
            int[] iArr14 = new int[1];
            objArr15[i11] = iArr14;
            int[] iArr15 = new int[1];
            objArr15[2] = iArr15;
            objArr15[3] = new int[1];
            int i2312 = ((int[]) objArr14[3])[i11];
            int i2313 = ((int[]) objArr14[2])[i11];
            int i2314 = ((int[]) objArr14[i11])[i11];
            iArr15[i11] = i2313;
            iArr14[i11] = i2314;
            objArr15[1] = new String[i11];
            int length4 = ((Context) Class.forName(r2).getMethod(str4, new Class[i11]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima5).substring(12, 13).length() + 914850897;
            int i2315 = ~length4;
            int i2316 = i2312 + 2059756501 + (((~((-796775) | i2315)) | 4227584) * 220) + (((~(i2315 | (-666725736))) | 670156545) * (-440)) + ((length4 | (-796775)) * 220);
            int i2317 = (i2316 << 13) ^ i2316;
            int i2318 = i2317 ^ (i2317 >>> 17);
            ((int[]) objArr15[3])[0] = i2318 ^ (i2318 << 5);
            i14 = 0;
        } else {
            arrayList4 = new ArrayList();
            strArr4 = (String[]) objArr14[1];
            if (strArr4 != null) {
                while (i15 < strArr4.length) {
                    arrayList4.add(str19);
                }
            }
            int[] iArr16 = new int[i13];
            int i2319 = i13 - 1;
            iArr16[i2319] = 1;
            Toast.makeText((Context) null, iArr16[((i13 * i2319) % 2) - 1], 1).show();
            objArr15 = new Object[]{new int[]{i242}, new String[0], new int[]{i241}, new int[1]};
            int i2410 = ((int[]) objArr14[3])[0];
            int i2411 = ((int[]) objArr14[2])[0];
            int i2412 = ((int[]) objArr14[0])[0];
            int iFreeMemory4 = (int) Runtime.getRuntime().freeMemory();
            int i2413 = ~iFreeMemory4;
            int i2414 = i2410 + (-1317025084) + (((~((-1063790832) | i2413)) | (~(1060360021 | i2413))) * (-867)) + (((~((-1063790832) | iFreeMemory4)) | 4726954 | (~(1060360021 | iFreeMemory4))) * (-1734)) + (((~(iFreeMemory4 | 1065086975)) | (~(i2413 | (-4726955))) | (~((-1059063878) | iFreeMemory4))) * 867);
            int i2415 = (i2414 << 13) ^ i2414;
            int i2416 = i2415 ^ (i2415 >>> 17);
            i14 = 0;
            ((int[]) objArr15[3])[0] = i2416 ^ (i2416 << 5);
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
            char c111 = (char) (53893 - (TypedValue.complexToFraction(i14, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i14, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int threadPriority8 = 1320 - ((Process.getThreadPriority(i14) + 20) >> 6);
            int i2417 = 36 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr218 = $$a;
            byte b211 = bArr218[7];
            Object[] objArr1015 = new Object[1];
            a(b211, (short) (b211 | 193), (byte) (bArr218[88] - 1), objArr1015);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(c111, threadPriority8, i2417, -1433084963, false, (String) objArr1015[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).getLong(null) != -1) {
            int i2418 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
            g = i2418 % 128;
            int i2419 = i2418 % 2;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                char mode6 = (char) (53893 - View.MeasureSpec.getMode(0));
                int iIndexOf10 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1321;
                int absoluteGravity4 = Gravity.getAbsoluteGravity(0, 0) + 36;
                Object[] objArr1016 = new Object[1];
                a((byte) 52, (short) 37, $$a[91], objArr1016);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(mode6, iIndexOf10, absoluteGravity4, -1920778747, false, (String) objArr1016[0], null);
            }
            Object[] objArr1017 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).get(null);
            objArr17 = new Object[]{new int[]{i250}, new int[1], strArr15, new int[]{i251}};
            int i2510 = ((int[]) objArr1017[0])[0];
            int i2511 = ((int[]) objArr1017[3])[0];
            String[] strArr115 = (String[]) objArr1017[2];
            int iFreeMemory5 = (int) Runtime.getRuntime().freeMemory();
            int i2512 = ~iFreeMemory5;
            int i2513 = (((~(i2512 | 1321182145)) | (~((-49445680) | i2512)) | 4216878) * (-397)) + 1623291184 + ((iFreeMemory5 | 1280170222) * 397) + 1629500296;
            int i2514 = (i2513 << 13) ^ i2513;
            int i2515 = i2514 ^ (i2514 >>> 17);
            ((int[]) objArr17[1])[0] = i2515 ^ (i2515 << 5);
            objArr15 = objArr15;
            str7 = str5;
        } else {
            baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                baseContext3 = (Context) Class.forName(str12).getMethod(str6, new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                if (baseContext3 instanceof ContextWrapper) {
                    baseContext3 = baseContext3.getApplicationContext();
                } else {
                    baseContext3 = baseContext3.getApplicationContext();
                }
            }
            str7 = str5;
            int iIntValue7 = ((Integer) Class.forName(str10).getMethod(str7, Object.class).invoke(null, this)).intValue();
            Object[] objArr1018 = {1141588826};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b((char) (47977 - TextUtils.getCapsMode("", 0, 0)), 1300 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr1019 = {baseContext3, "com.bpjstku", 1629500296, Integer.valueOf(iIntValue7), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).newInstance(objArr1018), false};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char size6 = (char) (View.MeasureSpec.getSize(0) + 53893);
                int keyRepeatDelay4 = 1320 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iResolveSize6 = 36 - View.resolveSize(0, 0);
                Object[] objArr1110 = new Object[1];
                a((byte) 52, (short) 37, $$a[91], objArr1110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(size6, keyRepeatDelay4, iResolveSize6, 819724799, false, (String) objArr1110[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 1394, 75 - Color.red(0)), Boolean.TYPE});
            }
            objArr16 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).invoke(null, objArr1019);
            if (baseContext3 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char cMyTid2 = (char) (53893 - (Process.myTid() >> 22));
                    int defaultSize6 = View.getDefaultSize(0, 0) + 1320;
                    int i2516 = 36 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    Object[] objArr1111 = new Object[1];
                    a((byte) 52, (short) 37, $$a[91], objArr1111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cMyTid2, defaultSize6, i2516, -1920778747, false, (String) objArr1111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, objArr16);
                long jLongValue113 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf117 = Long.valueOf(jLongValue113);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char jumpTapTimeout6 = (char) (53893 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int iResolveOpacity4 = 1320 - Drawable.resolveOpacity(0, 0);
                    int i2517 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 35;
                    byte[] bArr219 = $$a;
                    Object[] objArr1112 = new Object[1];
                    a((byte) 37, bArr219[7], bArr219[91], objArr1112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(jumpTapTimeout6, iResolveOpacity4, i2517, -1273706634, false, (String) objArr1112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf117);
                Long lValueOf118 = Long.valueOf(jLongValue113 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                    char offsetBefore4 = (char) (TextUtils.getOffsetBefore("", 0) + 53893);
                    int i2518 = 1320 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iKeyCodeFromString4 = 36 - KeyEvent.keyCodeFromString("");
                    byte[] bArr310 = $$a;
                    byte b212 = bArr310[7];
                    Object[] objArr1113 = new Object[1];
                    a(b212, (short) (b212 | 193), (byte) (bArr310[88] - 1), objArr1113);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(offsetBefore4, i2518, iKeyCodeFromString4, -1433084963, false, (String) objArr1113[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf118);
            } else {
                objArr16 = objArr16;
                objArr15 = objArr15;
            }
            objArr17 = objArr16;
        }
        i16 = ((int[]) objArr17[3])[0];
        i17 = ((int[]) objArr17[0])[0];
        if (i17 == i16) {
            objArr18 = new Object[]{new int[]{i260}, new int[1], strArr16, new int[]{i261}};
            int i2519 = ((int[]) objArr17[1])[0];
            int i2610 = ((int[]) objArr17[0])[0];
            int i2611 = ((int[]) objArr17[3])[0];
            String[] strArr116 = (String[]) objArr17[2];
            int i2612 = ~new Random().nextInt(186081569);
            int i2613 = i2519 + (-935965132) + (((-688180229) | i2612) * 494) + (((~(i2612 | 342569706)) | (-690872045)) * 494);
            int i2614 = (i2613 << 13) ^ i2613;
            int i2615 = i2614 ^ (i2614 >>> 17);
            i18 = 0;
            ((int[]) objArr18[1])[0] = i2615 ^ (i2615 << 5);
        } else {
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            objArr18 = new Object[]{new int[]{i267}, new int[1], strArr17, new int[]{i268}};
            int i2616 = ((int[]) objArr17[1])[0];
            int i2617 = ((int[]) objArr17[0])[0];
            int i2618 = ((int[]) objArr17[3])[0];
            String[] strArr117 = (String[]) objArr17[2];
            int i2619 = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i2710 = i2616 + (((1450655216 + (((~((-134503191) | i2619)) | 134497042) * 1504)) + ((~(i2619 | (-6149))) * (-1504))) - 500115648);
            int i2711 = i2710 ^ (i2710 << 13);
            int i2712 = i2711 ^ (i2711 >>> 17);
            i18 = 0;
            ((int[]) objArr18[1])[0] = i2712 ^ (i2712 << 5);
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
            char jumpTapTimeout7 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
            int mode7 = View.MeasureSpec.getMode(i18) + 1755;
            int i2713 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            byte[] bArr311 = $$a;
            Object[] objArr1114 = new Object[1];
            a((byte) 37, bArr311[7], bArr311[91], objArr1114);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(jumpTapTimeout7, mode7, i2713, 986134021, false, (String) objArr1114[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null) != -1) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                char c112 = (char) (29944 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int iKeyCodeFromString5 = KeyEvent.keyCodeFromString("") + 1755;
                int iResolveSize7 = View.resolveSize(0, 0) + 23;
                Object[] objArr1115 = new Object[1];
                a((byte) 52, (short) 37, $$a[91], objArr1115);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(c112, iKeyCodeFromString5, iResolveSize7, 1599039318, false, (String) objArr1115[0], null);
            }
            Object[] objArr1116 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).get(null);
            objArr19 = new Object[]{new int[]{((int[]) objArr1116[0])[0]}, new int[]{((int[]) objArr1116[1])[0]}, (Object[]) objArr1116[2], new int[1], (String[]) objArr1116[4]};
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i2714 = (-750631223) + (((~((-53877529) | iIdentityHashCode8)) | 20189952) * 1504) + ((~(iIdentityHashCode8 | (-33687577))) * (-1504)) + 1109529304;
            int i2715 = (i2714 << 13) ^ i2714;
            int i2716 = i2715 ^ (i2715 >>> 17);
            ((int[]) objArr19[3])[0] = i2716 ^ (i2716 << 5);
            objArr18 = objArr18;
        } else {
            int iIntValue8 = ((Integer) Class.forName(str10).getMethod(str7, Object.class).invoke(null, this)).intValue();
            Object[] objArr1117 = {1141588826};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b((char) (42049 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1726, 29 - TextUtils.getCapsMode("", 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentbindingInflater1$7879114 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue8, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).newInstance(objArr1117), 447212392, false, true);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char c113 = (char) (29945 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int i2717 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                int doubleTapTimeout5 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
                Object[] objArr1118 = new Object[1];
                a((byte) 52, (short) 37, $$a[91], objArr1118);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(c113, i2717, doubleTapTimeout5, 1599039318, false, (String) objArr1118[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879114);
            long jLongValue114 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf119 = Long.valueOf(jLongValue114);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                char offsetAfter12 = (char) (TextUtils.getOffsetAfter("", 0) + 29944);
                int jumpTapTimeout8 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                int iResolveSizeAndState2 = 23 - View.resolveSizeAndState(0, 0, 0);
                Object[] objArr1119 = new Object[1];
                a((byte) 52, (short) 89, $$a[91], objArr1119);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(offsetAfter12, jumpTapTimeout8, iResolveSizeAndState2, 1596667560, false, (String) objArr1119[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf119);
            Long lValueOf26 = Long.valueOf(jLongValue114 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char cIndexOf8 = (char) (29944 - TextUtils.indexOf("", "", 0, 0));
                int iLastIndexOf6 = TextUtils.lastIndexOf("", '0', 0, 0) + 1756;
                int capsMode3 = 23 - TextUtils.getCapsMode("", 0, 0);
                byte[] bArr312 = $$a;
                Object[] objArr1210 = new Object[1];
                a((byte) 37, bArr312[7], bArr312[91], objArr1210);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cIndexOf8, iLastIndexOf6, capsMode3, 986134021, false, (String) objArr1210[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf26);
            objArr19 = objArrTuitionPaymentFragmentbindingInflater1$7879114;
        }
        i19 = ((int[]) objArr19[1])[0];
        i20 = ((int[]) objArr19[0])[0];
        if (i20 == i19) {
            arrayList5 = new ArrayList();
            strArr5 = (String[]) objArr19[4];
            if (strArr5 != null) {
                i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
                g = i21 % 128;
                if (i21 % 2 == 0) {
                    i22 = 1;
                } else {
                    i22 = 0;
                }
                while (i22 < strArr5.length) {
                    arrayList5.add(strArr5[i22]);
                    i22++;
                }
            }
            throw new RuntimeException(String.valueOf(i20));
        }
        int i2718 = ((int[]) objArr19[3])[0];
        objArr20 = new Object[]{new int[]{((int[]) objArr19[0])[0]}, new int[]{((int[]) objArr19[1])[0]}, (Object[]) objArr19[2], new int[1], (String[]) objArr19[4]};
        int i2719 = (int) Runtime.getRuntime().totalMemory();
        int i2810 = ~i2719;
        int i2811 = i2718 + 1571001705 + ((~(910394724 | i2810)) * (-560)) + ((~(i2719 | 1071118190)) * (-560)) + (((~((-697792299) | i2810)) | 537068832) * 560);
        int i2812 = (i2811 << 13) ^ i2811;
        int i2813 = i2812 ^ (i2812 >>> 17);
        ((int[]) objArr20[3])[0] = i2813 ^ (i2813 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
            char cIndexOf9 = (char) (TextUtils.indexOf("", "", 0, 0) + 43042);
            int iResolveSize8 = 3111 - View.resolveSize(0, 0);
            int iIndexOf11 = TextUtils.indexOf((CharSequence) "", '0') + 23;
            Object[] objArr1211 = new Object[1];
            a((byte) 52, (short) 141, $$a[91], objArr1211);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cIndexOf9, iResolveSize8, iIndexOf11, -1272852037, false, (String) objArr1211[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).getLong(null) != -1) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char cBlue2 = (char) (Color.blue(0) + 43042);
                int scrollBarSize4 = (ViewConfiguration.getScrollBarSize() >> 8) + 3111;
                int i2814 = 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte[] bArr313 = $$a;
                Object[] objArr1212 = new Object[1];
                a((byte) 37, bArr313[7], bArr313[91], objArr1212);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cBlue2, scrollBarSize4, i2814, 154975793, false, (String) objArr1212[0], null);
            }
            Object[] objArr1213 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).get(null);
            int i2815 = ((int[]) objArr1213[2])[0];
            int i2816 = ((int[]) objArr1213[1])[0];
            String[] strArr118 = (String[]) objArr1213[3];
            int[] iArr17 = {i2816};
            int i2817 = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i2818 = ~i2817;
            int i2819 = (-831190174) + (((~(1510876909 | i2818)) | 26251280) * 184) + ((i2817 | 1342973640) * (-184)) + ((~((-194154550) | i2818)) * 184) + 221980214;
            int i2910 = (i2819 << 13) ^ i2819;
            int i2911 = i2910 ^ (i2910 >>> 17);
            ((int[]) objArr21[0])[0] = i2911 ^ (i2911 << 5);
            objArr21 = new Object[]{new int[1], iArr17, new int[]{i2815}, strArr118};
            objArr20 = objArr20;
        } else {
            Object[] objArr1214 = {null, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, 221980214};
            byte[] bArr314 = $$d;
            short s3 = (short) 339;
            Object[] objArr1215 = new Object[1];
            d(bArr314[117], s3, (byte) (bArr314[46] + 1), objArr1215);
            Class<?> cls10 = Class.forName((String) objArr1215[0]);
            Object[] objArr1216 = new Object[1];
            d(bArr314[48], s3, bArr314[25], objArr1216);
            Object[] objArr1217 = (Object[]) cls10.getMethod((String) objArr1216[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr1214);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char c114 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43042);
                int offsetAfter13 = 3111 - TextUtils.getOffsetAfter("", 0);
                int i2912 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte[] bArr315 = $$a;
                Object[] objArr1218 = new Object[1];
                a((byte) 37, bArr315[7], bArr315[91], objArr1218);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(c114, offsetAfter13, i2912, 154975793, false, (String) objArr1218[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, objArr1217);
            long jLongValue115 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf27 = Long.valueOf(jLongValue115);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char cAlpha2 = (char) (43042 - Color.alpha(0));
                int i2913 = 3111 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int edgeSlop7 = 22 - (ViewConfiguration.getEdgeSlop() >> 16);
                Object[] objArr1219 = new Object[1];
                a((byte) 52, (short) 37, $$a[91], objArr1219);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cAlpha2, i2913, edgeSlop7, -1269618118, false, (String) objArr1219[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf27);
            Long lValueOf28 = Long.valueOf(jLongValue115 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char c115 = (char) (43042 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                int iAxisFromString5 = MotionEvent.axisFromString("") + 3112;
                int iIndexOf12 = TextUtils.indexOf("", "", 0, 0) + 22;
                Object[] objArr1310 = new Object[1];
                a((byte) 52, (short) 141, $$a[91], objArr1310);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c115, iAxisFromString5, iIndexOf12, -1272852037, false, (String) objArr1310[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf28);
            objArr21 = objArr1217;
        }
        i23 = ((int[]) objArr21[1])[0];
        i24 = ((int[]) objArr21[2])[0];
        if (i24 == i23) {
            int i2914 = ((int[]) objArr21[0])[0];
            int i2915 = ((int[]) objArr21[2])[0];
            int i2916 = ((int[]) objArr21[1])[0];
            String[] strArr119 = (String[]) objArr21[3];
            int[] iArr18 = {i2916};
            int iFreeMemory6 = (int) Runtime.getRuntime().freeMemory();
            int i2917 = i2914 + 712524294 + (((~(iFreeMemory6 | 341064511)) | (-1363966948)) * (-668)) + ((341064511 | (~((-1363966948) | iFreeMemory6))) * 1336) + ((iFreeMemory6 | (-1091059905)) * 668);
            int i2918 = (i2917 << 13) ^ i2917;
            int i2919 = i2918 ^ (i2918 >>> 17);
            ((int[]) objArr22[0])[0] = i2919 ^ (i2919 << 5);
            objArr22 = new Object[]{new int[1], iArr18, new int[]{i2915}, strArr119};
            i25 = 0;
        } else {
            arrayList6 = new ArrayList();
            strArr6 = (String[]) objArr21[3];
            if (strArr6 != null) {
                while (i26 < strArr6.length) {
                    arrayList6.add(str20);
                }
            }
            Toast.makeText((Context) null, i24 / (((i24 - 1) * i24) % 2), 0).show();
            int i3010 = ((int[]) objArr21[0])[0];
            int i3011 = ((int[]) objArr21[2])[0];
            int i3012 = ((int[]) objArr21[1])[0];
            String[] strArr22 = (String[]) objArr21[3];
            int[] iArr19 = {i3011};
            int[] iArr110 = {i3012};
            int i3013 = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            int i3014 = i3010 + (-1466618082) + (((~((-1302809439) | i3013)) | (-1610574815)) * (-502)) + ((~((~i3013) | (-1208352795))) * (-502)) + (((~(i3013 | (-402222021))) | (-1302809439)) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i3015 = (i3014 << 13) ^ i3014;
            int i3016 = i3015 ^ (i3015 >>> 17);
            i25 = 0;
            ((int[]) objArr22[0])[0] = i3016 ^ (i3016 << 5);
            objArr22 = new Object[]{new int[1], iArr110, iArr19, strArr22};
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
            char cLastIndexOf3 = (char) (31532 - TextUtils.lastIndexOf("", '0', i25));
            int mode8 = 921 - View.MeasureSpec.getMode(i25);
            int iCombineMeasuredStates5 = View.combineMeasuredStates(i25, i25) + 28;
            byte[] bArr316 = $$a;
            byte b213 = bArr316[7];
            Object[] objArr1311 = new Object[1];
            a(b213, (short) (b213 | 193), (byte) (bArr316[88] - 1), objArr1311);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cLastIndexOf3, mode8, iCombineMeasuredStates5, -1048449946, false, (String) objArr1311[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null) != -1) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char threadPriority9 = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 31533);
                int scrollDefaultDelay6 = 921 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int deadChar7 = KeyEvent.getDeadChar(0, 0) + 28;
                byte[] bArr317 = $$a;
                Object[] objArr1312 = new Object[1];
                a((byte) 37, bArr317[7], bArr317[91], objArr1312);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(threadPriority9, scrollDefaultDelay6, deadChar7, -1142834547, false, (String) objArr1312[0], null);
            }
            Object[] objArr1313 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).get(null);
            objArr23 = new Object[]{new int[1], new int[]{((int[]) objArr1313[1])[0]}, (Object[]) objArr1313[2], new int[]{((int[]) objArr1313[3])[0]}, (String[]) objArr1313[4]};
            int i3017 = ((Context) Class.forName(r2).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1797882882;
            int i3018 = ~i3017;
            int i3019 = ((((-767051142) + (((~((-761438958) | i3018)) | (-1012640687)) * (-865))) + ((~(i3017 | 761438957)) * 865)) + (((~((-1012640687) | i3018)) | (~(i3018 | 761438957))) * 865)) - 2005480525;
            int i3110 = (i3019 << 13) ^ i3019;
            int i3111 = i3110 ^ (i3110 >>> 17);
            ((int[]) objArr23[0])[0] = i3111 ^ (i3111 << 5);
        } else {
            baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                baseContext4 = (Context) Class.forName(str12).getMethod(str6, new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                if (baseContext4 instanceof ContextWrapper) {
                    int i3112 = g + 109;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3112 % 128;
                    int i3113 = i3112 % 2;
                    if (((ContextWrapper) baseContext4).getBaseContext() != null) {
                        baseContext4 = baseContext4.getApplicationContext();
                    } else {
                        baseContext4 = null;
                    }
                } else {
                    baseContext4 = baseContext4.getApplicationContext();
                }
            }
            Object[] objArr1314 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, -2005480525};
            byte[] bArr318 = $$d;
            byte b214 = bArr318[117];
            Object[] objArr1315 = new Object[1];
            d(b214, (short) (b214 | 370), bArr318[100], objArr1315);
            Class<?> cls11 = Class.forName((String) objArr1315[0]);
            Object[] objArr1316 = new Object[1];
            d((byte) (bArr318[39] + 1), (short) 429, (byte) (bArr318[368] - 1), objArr1316);
            objArr23 = (Object[]) cls11.getMethod((String) objArr1316[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr1314);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                char cIndexOf10 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int scrollBarFadeDuration9 = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int modifierMetaStateMask5 = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                byte[] bArr319 = $$a;
                Object[] objArr1317 = new Object[1];
                a((byte) 37, bArr319[7], bArr319[91], objArr1317);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(cIndexOf10, scrollBarFadeDuration9, modifierMetaStateMask5, -1142834547, false, (String) objArr1317[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, objArr23);
            long jLongValue116 = ((Long) Class.forName(str8).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf29 = Long.valueOf(jLongValue116);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                char c116 = (char) (31533 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int packedPositionChild5 = ExpandableListView.getPackedPositionChild(0L) + 922;
                int minimumFlingVelocity8 = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                Object[] objArr1318 = new Object[1];
                a((byte) 52, (short) 37, $$a[91], objArr1318);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(c116, packedPositionChild5, minimumFlingVelocity8, -778300370, false, (String) objArr1318[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf29);
            Long lValueOf210 = Long.valueOf(jLongValue116 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                char defaultSize7 = (char) (View.getDefaultSize(0, 0) + 31533);
                int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 921;
                int iLastIndexOf7 = TextUtils.lastIndexOf("", '0', 0) + 29;
                byte[] bArr41 = $$a;
                byte b215 = bArr41[7];
                Object[] objArr1319 = new Object[1];
                a(b215, (short) (b215 | 193), (byte) (bArr41[88] - 1), objArr1319);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(defaultSize7, packedPositionType2, iLastIndexOf7, -1048449946, false, (String) objArr1319[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, lValueOf210);
        }
        if (((int[]) objArr23[3])[0] == ((int[]) objArr23[1])[0]) {
            arrayList7 = new ArrayList();
            strArr7 = (String[]) objArr23[4];
            if (strArr7 != null) {
                while (i27 < strArr7.length) {
                    arrayList7.add(str21);
                }
            }
            throw null;
        }
        int i3114 = g + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3114 % 128;
        int i3115 = i3114 % 2;
        int i3116 = ((int[]) objArr23[0])[0];
        Object[] objArr143 = {new int[1], new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[]{((int[]) objArr23[3])[0]}, (String[]) objArr23[4]};
        int iIdentityHashCode9 = System.identityHashCode(this);
        int i3117 = i3116 + 2106421723 + (((~((-1727752120) | iIdentityHashCode9)) | 46294692) * 576) + (((~((~iIdentityHashCode9) | (-1681457428))) | 32832) * 576) + 895938816;
        int i3118 = (i3117 << 13) ^ i3117;
        int i3119 = i3118 ^ (i3118 >>> 17);
        ((int[]) objArr143[0])[0] = i3119 ^ (i3119 << 5);
        intent = getIntent();
        if (intent != null) {
        }
        if (getUpdatedTransform.b == null) {
            getUpdatedTransform.b = new getUpdatedTransform();
        }
        finish();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        int i = 2 % 2;
        int i2 = g + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        getMenuInflater().inflate(R.menu.ef_image_picker_menu_main, menu);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        g = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        ImagePickerConfig imagePickerConfig;
        int i = 2 % 2;
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_camera);
        if (menuItemFindItem != null && (imagePickerConfig = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != null) {
            int i2 = g + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            menuItemFindItem.setVisible(imagePickerConfig.cancel);
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_done);
        if (menuItemFindItem2 != null) {
            String string = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (string == null || string.length() == 0) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                g = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
                g = i6 % 128;
                if (!(i6 % 2 != 0)) {
                }
                menuItemFindItem2.setTitle(string);
                menuItemFindItem2.setVisible(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f1409a.b());
            }
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
            g = i7 % 128;
            int i8 = i7 % 2;
            string = getString(R.string.ef_done);
            menuItemFindItem2.setTitle(string);
            menuItemFindItem2.setVisible(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f1409a.b());
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(menuItem);
        try {
            int itemId = menuItem.getItemId();
            if (itemId == 16908332) {
                onBackPressed();
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
                g = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (itemId == R.id.menu_done) {
                submitProcessingRequest submitprocessingrequest = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                copyTempFileToUri copytempfiletouri = submitprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                clearProcessingRequest clearprocessingrequest = submitprocessingrequest.f1409a;
                if (clearprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    throw new IllegalStateException("Must call setupAdapters first!");
                }
                copytempfiletouri.TuitionPaymentFragmentspecialinlinedviewModeldefault2(clearprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                return true;
            }
            if (itemId != R.id.menu_camera) {
                boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                return zOnOptionsItemSelected;
            }
            int i4 = g + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return true;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        submitProcessingRequest submitprocessingrequest = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (!submitprocessingrequest.b) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z = submitprocessingrequest.f1409a.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                throw null;
            }
            clearProcessingRequest clearprocessingrequest = submitprocessingrequest.f1409a;
            if (!(!clearprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b)) {
                int i3 = g + 25;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                if (i3 % 2 != 0) {
                    clearprocessingrequest.asInterface.getAdapter();
                    throw null;
                }
                if (clearprocessingrequest.asInterface.getAdapter() != null && !(clearprocessingrequest.asInterface.getAdapter() instanceof createProcessingRequest)) {
                    int i4 = g + 111;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                    int i5 = i4 % 2;
                    clearprocessingrequest.b(null);
                    submitprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(submitprocessingrequest.f1409a.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
                    g = i6 % 128;
                    int i7 = i6 % 2;
                    return;
                }
            }
        }
        super.onBackPressed();
    }

    @Override // defpackage.copyFileToMediaStore
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        int i = 2 % 2;
        int i2 = g + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.TuitionPaymentFragmentbindingInflater1.setTitle(str);
            supportInvalidateOptionsMenu();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.TuitionPaymentFragmentbindingInflater1.setTitle(str);
        supportInvalidateOptionsMenu();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        g = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // defpackage.copyFileToMediaStore
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = g + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        finish();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.copyFileToMediaStore
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Intent intent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            setResult(-1, intent);
            finish();
            int i3 = 82 / 0;
        } else {
            setResult(-1, intent);
            finish();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.JpegBytes2DiskIn
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) {
        int i = 2 % 2;
        int i2 = g + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(z);
        int i4 = g + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.JpegBytes2DiskIn
    public final void b(List<Image> list, List<lambdaprocessInputPacket5> list2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        g = i2 % 128;
        int i3 = i2 % 2;
        submitProcessingRequest submitprocessingrequest = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ImagePickerConfig imagePickerConfigB = submitprocessingrequest.b();
        if (imagePickerConfigB != null && !(!imagePickerConfigB.b)) {
            submitprocessingrequest.f1409a.b(list2);
            submitprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(submitprocessingrequest.f1409a.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            return;
        }
        clearProcessingRequest clearprocessingrequest = submitprocessingrequest.f1409a;
        ImagePipeline imagePipeline = clearprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        imagePipeline.TuitionPaymentFragmentbindingInflater1.clear();
        imagePipeline.TuitionPaymentFragmentbindingInflater1.addAll(list);
        clearprocessingrequest.TuitionPaymentFragmentbindingInflater1(clearprocessingrequest.d);
        clearprocessingrequest.asInterface.setAdapter(clearprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        submitprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(submitprocessingrequest.f1409a.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.JpegBytes2DiskIn
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
            throw null;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        g = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // defpackage.JpegBytes2DiskIn
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        g = i2 % 128;
        int i3 = i2 % 2;
        submitProcessingRequest submitprocessingrequest = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        submitprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setVisibility(8);
        submitprocessingrequest.asBinder.setVisibility(8);
        submitprocessingrequest.TuitionPaymentFragmentbindingInflater1.setVisibility(0);
        int i4 = g + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.JpegBytes2DiskIn
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            throw null;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        g = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // defpackage.JpegBytes2DiskIn
    public final void TuitionPaymentFragmentbindingInflater1(List<Image> list) {
        int i = 2 % 2;
        submitProcessingRequest submitprocessingrequest = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("selectedImages", (ArrayList) list);
        submitprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(intent);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = g + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1903081961;
        if (i4 != ((((~(i5 | 396937134)) | (-1226924678)) * 56) - 525712336) + (((~((~i5) | (-1226924678))) | 396937134) * 56)) {
            throw new RuntimeException("516456220");
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i7 = 1386620826 + (((~((~iIdentityHashCode) | 2105053198)) | (-2138690928)) * (-245));
        int i8 = ~(iIdentityHashCode | 2105053198);
        if (i6 != i7 + (i8 * (-245)) + ((i8 | 389141867) * 245)) {
            throw new RuntimeException("-87960491");
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 46401), ((byte) KeyEvent.getModifierMetaStateMask()) + 41, 20 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46399 - TextUtils.indexOf((CharSequence) "", '0', 0)), 40 - (ViewConfiguration.getTapTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onResume();
            int i9 = g + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            if (i9 % 2 != 0) {
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

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = g + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46401 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 40, 19 - Gravity.getAbsoluteGravity(0, 0), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46401 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40, ((byte) KeyEvent.getModifierMetaStateMask()) + 20, 41588667, false, "b", new Class[0]);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
                super.onPause();
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46400 - TextUtils.getOffsetBefore("", 0)), 40 - TextUtils.getTrimmedLength(""), 19 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.green(0) + 46400), 40 - Gravity.getAbsoluteGravity(0, 0), 18 - TextUtils.indexOf((CharSequence) "", '0'), 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(obj2, null);
            super.onPause();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
            g = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = 1690030092 + (((~((-1053459926) | iIdentityHashCode)) | 809631876 | (~((-1883447469) | iIdentityHashCode))) * (-754));
        int i6 = ~((-809631877) | iIdentityHashCode);
        int i7 = ~iIdentityHashCode;
        if (i4 != i5 + ((i6 | (~((-1073815593) | i7))) * (-754)) + ((i7 | (-1053459926)) * 754)) {
            throw new RuntimeException("-1740686761");
        }
        int i8 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i9 = ~layoutDirection;
        if (i8 != (-458405284) + ((21013120 | i9) * (-192)) + (((~(1908518532 | i9)) | 171594081) * (-384)) + (((~(layoutDirection | (-1887505413))) | (~(i9 | 2080112613)) | (~((-171594082) | layoutDirection))) * DerHeader.TAG_CLASS_PRIVATE)) {
            int i10 = 2048925920 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        g = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 41 / 0;
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
    private static java.lang.String $$g(short r5, short r6, int r7) {
        /*
            byte[] r0 = com.esafirm.imagepicker.features.ImagePickerActivity.$$c
            int r7 = r7 + 119
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r5 = r5 * 2
            int r5 = 1 - r5
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r5
            r4 = r6
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r4 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esafirm.imagepicker.features.ImagePickerActivity.$$g(short, short, int):java.lang.String");
    }
}
