package com.akexorcist.localizationactivity.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
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
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.R;
import defpackage.MediaSessionCompatCallbackStubApi21;
import defpackage.MediaSessionCompatCallbackStubApi23;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.getRccTransportControlFlagsFromActions;
import defpackage.initSession;
import defpackage.onScroll;
import defpackage.setCurrentControllerInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0004J\u001d\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0015\u0010\u001b\u001a\u00020\u00188CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/akexorcist/localizationactivity/ui/LocalizationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LsetCurrentControllerInfo;", "<init>", "()V", "Landroid/content/Context;", "p0", "", "attachBaseContext", "(Landroid/content/Context;)V", "getApplicationContext", "()Landroid/content/Context;", "getBaseContext", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "", "p1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;Ljava/lang/String;)V", "LMediaSessionCompatCallbackStubApi23;", "b", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 4, 2})
public abstract class LocalizationActivity extends AppCompatActivity implements setCurrentControllerInfo {
    private static short[] g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<MediaSessionCompatCallbackStubApi23>() { // from class: com.akexorcist.localizationactivity.ui.LocalizationActivity$localizationDelegate$2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
        public final MediaSessionCompatCallbackStubApi23 invoke() {
            return new MediaSessionCompatCallbackStubApi23(this.this$0);
        }

        {
            super(0);
        }
    });
    private static final byte[] $$c = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
    private static final int $$f = 2;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$p = {117, 50, 102, 124, 15, 1, -60, 60, 11, 3, -5, 8, -4, -52, 54, 16, -7, 17, 0, -3, -2, -51, 65, 0, -4, 19, -14, 20, -6, -1, 17, -66, 69, -1, -8, 5, 5, 17, -66, 62, 8, 9, -12, 16, -1, -10, 14, -59, 79, 3, -11, -6, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, 2, 0, -8, 1, 9, -5, 14, 0, 8, 1, 0, 8, -6, 2, 21, -10, -1, 21, -39, 37, -8, 4, 10, -5, 4, 4, -2, 23, -6, 11, -64, 15, 1, -60, 60, 11, 3, -5, 8, -4, -52, 54, 16, -7, 17, 0, -3, -2, -51, 60, 9, 9, -66, 65, 6, -9, 1, 22, -8, 9, 2, -61, 79, 3, -22, 19, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, -15, 10, 8, -7, 8, 8, -4, -27, 40, -5, 9, -8, 22, -12, 16, -62, 1, 18, -30, 19, 18, -10, 3, 12, -37, 41, -8, 21, -8, -16, 23, -29, 40, -5, 12, -42, 58, -38, 37, -6, 9, 6, -6, 14, 8, 15, 1, -60, 60, 11, 3, -5, 8, -4, -52, 54, 16, -7, 17, 0, -3, -2, -51, 60, 9, 9, -66, 54, 23, 2, -9, -55, 54, 18, -4, -56, 72, -7, 1, 10, -2, 8, -61, 39, 22, 20, -4, -9, 1, 22, -8, 9, 2, -41, 48, 9, -4, -7, -14, 21, 16, 7, -10, -3, 5, 15, 1, -60, 72, 1, 7, -17, 20, -10, 19, -2, -63, 68, -1, 0, 15, 3, -1, -63, 62, 8, 9, -12, 16, -1, -10, 14, -59, Base64.padSymbol, 15, 3, -1, -63, 29, 47, 3, -1, -40, 44, -4, 5, 8, -6, -62, 17, 12, -4, -1, 16, -22, 30, -26, 21, 17, 3, -7, 9, 2, 15, 1, -60, 55, 17, -3, 12, 4, -6, 13, -68, 69, 5, -10, 17, -11, 12, 9, -16, 22, -8, 9, 2, -61, 69, 5, 0, -5, 14, -14, 15, -60, 63, 1, 15, -67, 68, 0, -5, 3, 0, 27, -3, -11, 1, 21, 0, -6, 14, 8, -72, 36, 32, -5, -29, 32, 27, -35, 21, 1, 21, 0, -6, 14, 8, -53, 37, 20, -8, 16, -10, 14, 8, -82, 82, 0, -8, 1, 9, -5, 14, -69, 3, 72, 8, 1, 0, 8, -6, 2, -61, 72, 8, -1, -2, 1, 20, -77, 67, 4, 4, -2, 23, -6, 11, -77, 16, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, 2, 0, -8, 1, 9, -5, 14, 0, 8, 1, 0, 8, -6, 2, 21, -10, -1, 21, -39, 37, -8, 4, 10, -5, 4, 4, -2, 23, -6, 11, -63};
    private static final int $$q = 44;
    private static final byte[] $$a = {42, -104, -68, 105, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
    private static final int $$b = 108;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -499790690;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1934795546;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 311021047;
    private static byte[] TuitionPaymentFragmentbindingInflater1 = {-10, -29, 26, -22, 17, -51, -50, 44, 18, -26, 30, -43, 38, 0, -2, 28, -10, -49, 59, -30, 21, 59, -36, -41, 1, -53, -59, 59, -56, -57, -49, 53, -16, -121, 123, -116, -90, 89, -121, 126, -114, 117, -87, -86, 52, -117, -50, 69, 116, 117, 114, -127, 121, -126, -23, 125, -127, 112, -115, -114, 121, -106, 107, 122, 119, -122, -118, 112, -126, -4, 8, -9, -8, 1, 31, -48, 14, 0, -8, 6, -2, 26, 41, 24, -75, 11, 4, 56, -63, -16, -15, -10, 5, -3, 6, -12, -126, 123, -120, 110, -125, -121, ByteCompanionObject.MIN_VALUE, -127, 125, 82, -80, 123, 116, -114, 125, ByteCompanionObject.MIN_VALUE, 111, -90, 38, -38, 18, 22, 56, -22, -23, -63, 38, -20, 18, -59, 63, 30, -39, 58, 20, -40, -23, 56, 18, -23, -39, 19, 63, 17, 22, -18, 17, -57, 62, 22, 19, -58, 39, 20, -39, Base64.padSymbol, -60, 21, Base64.padSymbol, 22, 20, -58, 57, 19, -20, 20, -62, -22, 22, 38, -39, 22, 59, 21, -58, 18, 23, 22, -19, 23, 37, -90, -12, -62, 11, -23, -58, 8, -57, -11, 59, 59, 22, -19, -60, 18, -18, -62, -60, 59, 57, -59, 20, -59, -9, -60, 21, 56, -11, -57, 56, 23, -19, -59, 59, -60, -62, 62, 19, -22, 22, -24, 20, -21, -58, -58, 57, -57, -59, 58, 10, -16, 9, -57, -10, 14, -59, -22, 17, -23, -63, 62, 22, -57, 58};

    private static void c(int i, int i2, byte b, Object[] objArr) {
        int i3 = 214 - i;
        int i4 = b + 84;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - i2];
        int i5 = 52 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i4 + (-i5)) - 11;
            i3++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 = (i4 + (-bArr[i3])) - 11;
                i3++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.akexorcist.localizationactivity.ui.LocalizationActivity.$$p
            int r1 = 108 - r8
            int r7 = 429 - r7
            int r6 = 103 - r6
            byte[] r1 = new byte[r1]
            int r8 = 107 - r8
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r6 = r6 + r7
            int r6 = r6 + (-3)
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akexorcist.localizationactivity.ui.LocalizationActivity.f(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01a9  */
    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2268;
                int mode = View.MeasureSpec.getMode(0) + 33;
                byte length = (byte) $$c.length;
                byte b2 = (byte) (length - 4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, iLastIndexOf, mode, 1387473586, false, $$i(length, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 79;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i8 = $10 + 5;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = TuitionPaymentFragmentbindingInflater1;
                if (bArr != null) {
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    int i9 = 0;
                    while (i9 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                            int iIndexOf = TextUtils.indexOf("", "", 0) + 3358;
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 18;
                            byte b3 = (byte) ($$f - 2);
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, iIndexOf, fadingEdgeLength, -1054011043, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i9++;
                        int i10 = $10 + 105;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentbindingInflater1;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2267;
                        int bitsPerPixel = 32 - ImageFormat.getBitsPerPixel(0);
                        byte length3 = (byte) $$c.length;
                        byte b5 = (byte) (length3 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, iCombineMeasuredStates, bitsPerPixel, 1387473586, false, $$i(length3, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) g[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i12 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                if (z) {
                    int i13 = $11 + 17;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char windowTouchSlop = (char) (55904 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int i14 = 2856 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int longPressTimeout = 13 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte b6 = (byte) ($$f + 1);
                    byte b7 = (byte) (b6 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, i14, longPressTimeout, -1529949196, false, $$i(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    for (int i15 = 0; i15 < length4; i15++) {
                        bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i16 = $10 + 13;
                    int i17 = i16 % 128;
                    $11 = i17;
                    if (i16 % 2 == 0) {
                        throw null;
                    }
                    if (z2) {
                        int i18 = i17 + 105;
                        $10 = i18 % 128;
                        if (i18 % 2 != 0) {
                            byte[] bArr6 = TuitionPaymentFragmentbindingInflater1;
                            int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - (((byte) (((byte) (((long) bArr6[i19]) - 3046761265686732006L)) >>> s)) ^ b));
                        } else {
                            byte[] bArr7 = TuitionPaymentFragmentbindingInflater1;
                            int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i20]) ^ 3046761265686732006L)) + s)) ^ b));
                        }
                    } else {
                        short[] sArr = g;
                        int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i21]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:219:0x1909  */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle p0) {
        Object[] objArr;
        String str;
        Object[] objArr2;
        String str2;
        String str3;
        String str4;
        Object[] objArr3;
        char c;
        String str5;
        Object[] objArr4;
        char c2;
        String str6;
        Object[] objArr5;
        String str7;
        int i;
        String str8;
        Object[] objArr6;
        char c3;
        int i2;
        String str9;
        Object[] objArr7;
        Object[] objArr8;
        int i3;
        String str10;
        String str11;
        String str12;
        Object[] objArr9;
        char c4;
        Object[] objArr10;
        int i4;
        Object[] objArr11;
        int i5 = 2 % 2;
        Object[] objArr12 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_1).substring(0, 3).codePointAt(0) + 1641770756, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 37, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_bni_transfer).substring(0, 8).length() - 8), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 7), (-1855492220) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, objArr12);
        String str13 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        e(Color.rgb(0, 0, 0) + 1658548052, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 37, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 107), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_2).substring(5, 6).codePointAt(0) + 67), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1855492198, objArr13);
        String str14 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        e(TextUtils.getTrimmedLength("") + 1641770841, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 37, (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1855492252, objArr14);
        String str15 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_failed).substring(0, 1).length() + 1641770839, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1051).substring(0, 32).length() - 33, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_message_not_enabled).substring(17, 18).length() - 1), (byte) ((-16777176) - Color.rgb(0, 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step3).substring(0, 1).length() - 1855492201, objArr15);
        String str16 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_card_prima).substring(46, 51).codePointAt(0) + 1641770800, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 37, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) ((-19) - View.MeasureSpec.getSize(0)), (-1855492147) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr16);
        String str17 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        e((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1641770833, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 12, (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (byte) ((-101) - (Process.myTid() >> 22)), (-1855492121) - Color.alpha(0), objArr17);
        String str18 = (String) objArr17[0];
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
            int i6 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
            int i7 = 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            Object[] objArr18 = new Object[1];
            c((short) 210, (byte) 15, $$a[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, i6, i7, 986134021, false, (String) objArr18[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char gidForName = (char) (29943 - Process.getGidForName(""));
                int absoluteGravity = 1755 - Gravity.getAbsoluteGravity(0, 0);
                int i8 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
                byte b = $$a[7];
                Object[] objArr19 = new Object[1];
                c((short) 173, b, b, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, absoluteGravity, i8, 1599039318, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr20[0])[0]}, new int[]{((int[]) objArr20[1])[0]}, (Object[]) objArr20[2], new int[1], (String[]) objArr20[4]};
            int i9 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i10 = 667941123 + (((-139690369) | i9) * 494) + (((~(i9 | (-206813603))) | 346848894) * 494) + 2071108774;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
            str14 = str14;
            str18 = str18;
            str17 = str17;
        } else {
            int iIntValue = ((Integer) Class.forName(str15).getMethod(str16, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr21 = {-1992732215};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 42049), View.MeasureSpec.makeMeasureSpec(0, 0) + 1726, 29 - View.getDefaultSize(0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrB$7879113 = onScroll.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr21), 2071108774, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char threadPriority = (char) (29944 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
                    byte b2 = $$a[7];
                    Object[] objArr22 = new Object[1];
                    c((short) 173, b2, b2, objArr22);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, doubleTapTimeout, pressedStateDuration, 1599039318, false, (String) objArr22[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    long jLongValue = ((Long) Class.forName(str13).getDeclaredMethod(str14, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                        int i13 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                        byte b3 = $$a[7];
                        Object[] objArr23 = new Object[1];
                        c((short) 121, b3, b3, objArr23);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, maximumDrawingCacheSize, i13, 1596667560, false, (String) objArr23[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c5 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                        int gidForName2 = Process.getGidForName("") + 1756;
                        int i14 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        Object[] objArr24 = new Object[1];
                        c((short) 210, (byte) 15, $$a[7], objArr24);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c5, gidForName2, i14, 986134021, false, (String) objArr24[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArrB$7879113;
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str19 : strArr) {
                    arrayList.add(str19);
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        int i17 = ((int[]) objArr[3])[0];
        Object[] objArr25 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
        int i18 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        int i19 = i17 + (-1169233475) + (((~(i18 | 638172304)) | 425569878) * (-668)) + ((638172304 | (~(425569878 | i18))) * 1336) + ((i18 | 1063108310) * 668);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr25[3])[0] = i21 ^ (i21 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 43042);
            int i22 = 3112 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int longPressTimeout = 22 - (ViewConfiguration.getLongPressTimeout() >> 16);
            byte b4 = $$a[7];
            Object[] objArr26 = new Object[1];
            c((short) 69, b4, b4, objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maxKeyCode, i22, longPressTimeout, -1272852037, false, (String) objArr26[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cIndexOf = (char) (43042 - TextUtils.indexOf("", "", 0, 0));
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 3111;
                int i23 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23;
                Object[] objArr27 = new Object[1];
                c((short) 210, (byte) 15, $$a[7], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, iMakeMeasureSpec, i23, 154975793, false, (String) objArr27[0], null);
            }
            Object[] objArr28 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            int i24 = ((int[]) objArr28[2])[0];
            int i25 = ((int[]) objArr28[1])[0];
            String[] strArr2 = (String[]) objArr28[3];
            int[] iArr = {i25};
            int iIdentityHashCode = System.identityHashCode(this);
            int i26 = ~iIdentityHashCode;
            int i27 = (~((-785903840) | i26)) | 650166339;
            int i28 = ~(iIdentityHashCode | 1054865119);
            int i29 = 1671019140 + ((i27 | i28) * (-502)) + ((i28 | (~(i26 | (-135737501)))) * TypedValues.PositionType.TYPE_DRAWPATH) + 1708614568;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr2[0])[0] = i31 ^ (i31 << 5);
            objArr2 = new Object[]{new int[1], iArr, new int[]{i24}, strArr2};
            str16 = str16;
            str = str14;
        } else {
            try {
                Object[] objArr29 = {null, Integer.valueOf(((Integer) Class.forName(str15).getMethod(str16, Object.class).invoke(null, this)).intValue()), 0, 1708614568};
                byte[] bArr = $$p;
                Object[] objArr30 = new Object[1];
                f(bArr[94], (short) 426, (byte) (-bArr[47]), objArr30);
                Class<?> cls = Class.forName((String) objArr30[0]);
                Object[] objArr31 = new Object[1];
                f(bArr[25], (short) 378, bArr[326], objArr31);
                Object[] objArr32 = (Object[]) cls.getMethod((String) objArr31[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr29);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char c6 = (char) (43041 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int packedPositionChild = 3110 - ExpandableListView.getPackedPositionChild(0L);
                    int scrollBarSize = 22 - (ViewConfiguration.getScrollBarSize() >> 8);
                    Object[] objArr33 = new Object[1];
                    c((short) 210, (byte) 15, $$a[7], objArr33);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c6, packedPositionChild, scrollBarSize, 154975793, false, (String) objArr33[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArr32);
                try {
                    str = str14;
                    long jLongValue2 = ((Long) Class.forName(str13).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43042);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 3111;
                        int jumpTapTimeout = 22 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte b5 = $$a[7];
                        Object[] objArr34 = new Object[1];
                        c((short) 173, b5, b5, objArr34);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(pressedStateDuration2, packedPositionType, jumpTapTimeout, -1269618118, false, (String) objArr34[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char cLastIndexOf = (char) (43041 - TextUtils.lastIndexOf("", '0', 0, 0));
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 3111;
                        int longPressTimeout2 = 22 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b6 = $$a[7];
                        Object[] objArr35 = new Object[1];
                        c((short) 69, b6, b6, objArr35);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cLastIndexOf, tapTimeout, longPressTimeout2, -1272852037, false, (String) objArr35[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                    objArr2 = objArr32;
                } catch (Exception unused2) {
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
        int i32 = ((int[]) objArr2[1])[0];
        int i33 = ((int[]) objArr2[2])[0];
        if (i33 == i32) {
            int i34 = ((int[]) objArr2[0])[0];
            int i35 = ((int[]) objArr2[2])[0];
            int i36 = ((int[]) objArr2[1])[0];
            String[] strArr3 = (String[]) objArr2[3];
            int[] iArr2 = {i36};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i37 = ~startUptimeMillis;
            int i38 = i34 + (-499709294) + (((~((-57460524) | i37)) | 35702563 | (~((-1647570936) | i37))) * (-1136)) + (((~((-57460524) | startUptimeMillis)) | (~((-1647570936) | startUptimeMillis)) | (~(1669328895 | i37))) * (-568)) + (((~(startUptimeMillis | (-35702564))) | (~(i37 | 1647570935)) | (~(57460523 | i37))) * 568);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr[0])[0] = i40 ^ (i40 << 5);
            Object[] objArr36 = {new int[1], iArr2, new int[]{i35}, strArr3};
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArr2[3];
            if (strArr4 != null) {
                for (String str20 : strArr4) {
                    arrayList2.add(str20);
                }
            }
            int[] iArr3 = new int[i33];
            int i41 = i33 - 1;
            iArr3[i41] = 1;
            Toast.makeText((Context) null, iArr3[((i33 * i41) % 2) - 1], 1).show();
            int i42 = ((int[]) objArr2[0])[0];
            int i43 = ((int[]) objArr2[2])[0];
            int i44 = ((int[]) objArr2[1])[0];
            String[] strArr5 = (String[]) objArr2[3];
            int[] iArr4 = {i43};
            int i45 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i46 = i42 + ((((-1744362186) + (((~i45) | 278971172) * 1324)) + (((~(i45 | 1424552748)) | (~(280478710 | i45))) * (-1324))) - 836217924);
            int i47 = (i46 << 13) ^ i46;
            int i48 = i47 ^ (i47 >>> 17);
            ((int[]) objArr[0])[0] = i48 ^ (i48 << 5);
            Object[] objArr37 = {new int[1], new int[]{i44}, iArr4, strArr5};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char c7 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int mirror = 924 - AndroidCharacter.getMirror('0');
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 11;
            Object[] objArr38 = new Object[1];
            c((short) 210, (byte) 15, $$a[7], objArr38);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c7, mirror, iLastIndexOf, -1650998592, false, (String) objArr38[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null);
        long jLongValue3 = ((Long) Class.forName(str13).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char c8 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int maxKeyCode2 = 876 - (KeyEvent.getMaxKeyCode() >> 16);
            int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte b7 = $$a[7];
            Object[] objArr39 = new Object[1];
            c((short) 173, b7, b7, objArr39);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c8, maxKeyCode2, windowTouchSlop, 2012020043, false, (String) objArr39[0], null);
        }
        if (j == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int maxKeyCode3 = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
                byte b8 = $$a[7];
                Object[] objArr40 = new Object[1];
                c((short) 69, b8, b8, objArr40);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(windowTouchSlop2, maxKeyCode3, iMakeMeasureSpec2, 2012931276, false, (String) objArr40[0], null);
            }
            Object[] objArr41 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr41[0])[0]}, new int[1], new int[]{((int[]) objArr41[2])[0]}, (String[]) objArr41[3]};
            int i49 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i50 = 143013812 + (((~(261878129 | i49)) | 268436998) * 104) + ((~((~i49) | (-228126770))) * (-104)) + ((i49 | 302188358) * 104) + 519695008;
            int i51 = (i50 << 13) ^ i50;
            int i52 = i51 ^ (i51 >>> 17);
            ((int[]) objArr3[1])[0] = i52 ^ (i52 << 5);
            str4 = "";
            str3 = str16;
            c = 2;
            str2 = str18;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                str2 = str18;
                baseContext = (Context) Class.forName(str17).getMethod(str2, new Class[0]).invoke(null, null);
            } else {
                str2 = str18;
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            str3 = str16;
            Object[] objArr42 = {baseContext, Integer.valueOf(((Integer) Class.forName(str15).getMethod(str3, Object.class).invoke(null, this)).intValue()), 0, 519695008};
            byte[] bArr2 = $$p;
            byte b9 = bArr2[94];
            Object[] objArr43 = new Object[1];
            f(b9, (short) (b9 | 322), bArr2[236], objArr43);
            Class<?> cls2 = Class.forName((String) objArr43[0]);
            Object[] objArr44 = new Object[1];
            f(bArr2[25], (short) 291, (byte) (bArr2[32] + 1), objArr44);
            Object[] objArr45 = (Object[]) cls2.getMethod((String) objArr44[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr42);
            if (baseContext != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 876;
                    int iRed = 10 - Color.red(0);
                    byte b10 = $$a[7];
                    Object[] objArr46 = new Object[1];
                    c((short) 69, b10, b10, objArr46);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(packedPositionGroup, maximumDrawingCacheSize2, iRed, 2012931276, false, (String) objArr46[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr45);
                try {
                    long jLongValue4 = ((Long) Class.forName(str13).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char c9 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        str4 = r11;
                        int iIndexOf = 875 - TextUtils.indexOf((CharSequence) str4, '0');
                        int iMyPid = (Process.myPid() >> 22) + 10;
                        byte b11 = $$a[7];
                        Object[] objArr47 = new Object[1];
                        c((short) 173, b11, b11, objArr47);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(c9, iIndexOf, iMyPid, 2012020043, false, (String) objArr47[0], null);
                    } else {
                        str4 = r11;
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 876;
                        int mode = View.MeasureSpec.getMode(0) + 10;
                        Object[] objArr48 = new Object[1];
                        c((short) 210, (byte) 15, $$a[7], objArr48);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cNormalizeMetaState, iNormalizeMetaState, mode, -1650998592, false, (String) objArr48[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } else {
                str2 = str2;
                str3 = str3;
                str4 = r11;
                objArr45 = objArr45;
            }
            objArr3 = objArr45;
            c = 2;
        }
        if (((int[]) objArr3[0])[0] != ((int[]) objArr3[c])[0]) {
            throw null;
        }
        int i53 = ((int[]) objArr3[1])[0];
        Object[] objArr49 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
        int i54 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        int i55 = i53 + (-277990625) + ((~((-33558533) | i54)) * (-783)) + (((~(i54 | (-63503408))) | (-103813637)) * 783);
        int i56 = (i55 << 13) ^ i55;
        int i57 = i56 ^ (i56 >>> 17);
        ((int[]) objArr49[1])[0] = i57 ^ (i57 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore(str4, 0);
            int i58 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
            int offsetAfter = TextUtils.getOffsetAfter(str4, 0) + 10;
            byte[] bArr3 = $$a;
            Object[] objArr50 = new Object[1];
            c((short) (-bArr3[8]), bArr3[0], (byte) (-bArr3[205]), objArr50);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(offsetBefore, i58, offsetAfter, -1199417970, false, (String) objArr50[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null);
        long jLongValue5 = ((Long) Class.forName(str13).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iArgb = 876 - Color.argb(0, 0, 0, 0);
            int iRed2 = Color.red(0) + 10;
            byte[] bArr4 = $$a;
            Object[] objArr51 = new Object[1];
            c(bArr4[25], (byte) 52, (byte) (-bArr4[27]), objArr51);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(jumpTapTimeout2, iArgb, iRed2, 254769921, false, (String) objArr51[0], null);
        }
        if (j2 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char c10 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 876;
                int iLastIndexOf2 = TextUtils.lastIndexOf(str4, '0', 0) + 11;
                byte[] bArr5 = $$a;
                Object[] objArr52 = new Object[1];
                c(bArr5[25], (byte) (-bArr5[81]), (byte) (-bArr5[205]), objArr52);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(c10, absoluteGravity2, iLastIndexOf2, 1324201839, false, (String) objArr52[0], null);
            }
            Object[] objArr53 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).get(null);
            Object[] objArr54 = {new int[]{((int[]) objArr53[0])[0]}, new int[1], new int[]{((int[]) objArr53[2])[0]}, (String[]) objArr53[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i59 = ~iFreeMemory;
            int i60 = (((1382973156 + ((iFreeMemory | 625932034) * (-859))) + (((~(iFreeMemory | (-84416003))) | (~(625932034 | i59))) * 859)) + (((~(585621805 | i59)) | (-670037808)) * 859)) - 851786944;
            int i61 = (i60 << 13) ^ i60;
            int i62 = i61 ^ (i61 >>> 17);
            ((int[]) objArr54[1])[0] = i62 ^ (i62 << 5);
            c2 = 2;
            String str21 = str3;
            objArr4 = objArr54;
            str5 = str21;
        } else {
            str5 = str3;
            Object[] objArr55 = {Integer.valueOf(((Integer) Class.forName(str15).getMethod(str5, Object.class).invoke(null, this)).intValue()), -851786944};
            byte[] bArr6 = $$p;
            byte b12 = bArr6[18];
            short s = (short) (b12 | 254);
            Object[] objArr56 = new Object[1];
            f(b12, s, (byte) (s & 335), objArr56);
            Class<?> cls3 = Class.forName((String) objArr56[0]);
            Object[] objArr57 = new Object[1];
            f(bArr6[25], (short) 378, bArr6[326], objArr57);
            objArr4 = (Object[]) cls3.getMethod((String) objArr57[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr55);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                int defaultSize = View.getDefaultSize(0, 0) + 876;
                int i63 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                byte[] bArr7 = $$a;
                Object[] objArr58 = new Object[1];
                c(bArr7[25], (byte) (-bArr7[81]), (byte) (-bArr7[205]), objArr58);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(packedPositionChild2, defaultSize, i63, 1324201839, false, (String) objArr58[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, objArr4);
            try {
                long jLongValue6 = ((Long) Class.forName(str13).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue6);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char c11 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i64 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                    byte[] bArr8 = $$a;
                    Object[] objArr59 = new Object[1];
                    c(bArr8[25], (byte) 52, (byte) (-bArr8[27]), objArr59);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c11, i64, minimumFlingVelocity, 254769921, false, (String) objArr59[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char capsMode = (char) TextUtils.getCapsMode(str4, 0, 0);
                    int iNormalizeMetaState2 = 876 - KeyEvent.normalizeMetaState(0);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                    byte[] bArr9 = $$a;
                    Object[] objArr60 = new Object[1];
                    c((short) (-bArr9[8]), bArr9[0], (byte) (-bArr9[205]), objArr60);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(capsMode, iNormalizeMetaState2, keyRepeatTimeout, -1199417970, false, (String) objArr60[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, lValueOf8);
                c2 = 2;
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr4[0])[0] != ((int[]) objArr4[c2])[0]) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr6 = (String[]) objArr4[3];
            if (strArr6 != null) {
                for (String str22 : strArr6) {
                    arrayList3.add(str22);
                }
            }
            throw null;
        }
        int i65 = asBinder + 23;
        asInterface = i65 % 128;
        int i66 = i65 % 2;
        int i67 = ((int[]) objArr4[1])[0];
        Object[] objArr61 = {new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i68 = i67 + ((((-875256932) + (((~iIdentityHashCode2) | 40378453) * 1324)) + (((~(iIdentityHashCode2 | (-135776907))) | (~(176087135 | iIdentityHashCode2))) * (-1324))) - 1005897060);
        int i69 = (i68 << 13) ^ i68;
        int i70 = i69 ^ (i69 >>> 17);
        ((int[]) objArr61[1])[0] = i70 ^ (i70 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b((char) (46401 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.getOffsetBefore(str4, 0) + 40, 19 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).get(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b((char) (46400 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), AndroidCharacter.getMirror('0') - '\b', 19 - Color.green(0), 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).invoke(obj, null);
        MediaSessionCompatCallbackStubApi23 mediaSessionCompatCallbackStubApi23 = (MediaSessionCompatCallbackStubApi23) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        LocalizationActivity localizationActivity = this;
        Intrinsics.checkNotNullParameter(localizationActivity, str4);
        mediaSessionCompatCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(localizationActivity);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
            char keyRepeatTimeout2 = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
            int i71 = 921 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i72 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            Object[] objArr62 = new Object[1];
            c((short) (-$$a[8]), (byte) 52, (byte) 14, objArr62);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(keyRepeatTimeout2, i71, i72, -1048449946, false, (String) objArr62[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                char c12 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31533);
                int i73 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 920;
                int maxKeyCode4 = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                Object[] objArr63 = new Object[1];
                c((short) 210, (byte) 15, $$a[7], objArr63);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c12, i73, maxKeyCode4, -1142834547, false, (String) objArr63[0], null);
            }
            Object[] objArr64 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).get(null);
            objArr5 = new Object[]{new int[1], new int[]{((int[]) objArr64[1])[0]}, (Object[]) objArr64[2], new int[]{((int[]) objArr64[3])[0]}, (String[]) objArr64[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i74 = ~iIdentityHashCode3;
            int i75 = ((((-807870549) + ((~(785805744 | i74)) * (-560))) + ((~(iIdentityHashCode3 | (-270634060))) * (-560))) + (((~(988273899 | i74)) | 68165904) * 560)) - 1750292517;
            int i76 = (i75 << 13) ^ i75;
            int i77 = i76 ^ (i76 >>> 17);
            ((int[]) objArr5[0])[0] = i77 ^ (i77 << 5);
            str = str;
            str6 = str2;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                str6 = str2;
                baseContext2 = (Context) Class.forName(str17).getMethod(str6, new Class[0]).invoke(null, null);
            } else {
                str6 = str2;
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            Object[] objArr65 = {baseContext2, Integer.valueOf(((Integer) Class.forName(str15).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, -1750292517};
            byte[] bArr10 = $$p;
            Object[] objArr66 = new Object[1];
            f(bArr10[94], (short) 225, bArr10[66], objArr66);
            Class<?> cls4 = Class.forName((String) objArr66[0]);
            Object[] objArr67 = new Object[1];
            f(bArr10[25], (short) 378, bArr10[326], objArr67);
            Object[] objArr68 = (Object[]) cls4.getMethod((String) objArr67[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr65);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char cBlue = (char) (Color.blue(0) + 31533);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 922;
                int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 28;
                Object[] objArr69 = new Object[1];
                c((short) 210, (byte) 15, $$a[7], objArr69);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cBlue, modifierMetaStateMask, iNormalizeMetaState3, -1142834547, false, (String) objArr69[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, objArr68);
            try {
                long jLongValue7 = ((Long) Class.forName(str13).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf9 = Long.valueOf(jLongValue7);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char cAxisFromString = (char) (31532 - MotionEvent.axisFromString(str4));
                    int iIndexOf2 = TextUtils.indexOf(str4, str4, 0, 0) + 921;
                    int iIndexOf3 = TextUtils.indexOf((CharSequence) str4, '0', 0) + 29;
                    byte b13 = $$a[7];
                    Object[] objArr70 = new Object[1];
                    c((short) 173, b13, b13, objArr70);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cAxisFromString, iIndexOf2, iIndexOf3, -778300370, false, (String) objArr70[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf9);
                Long lValueOf10 = Long.valueOf(jLongValue7 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf(str4, str4) + 31533);
                    int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
                    int iNormalizeMetaState4 = KeyEvent.normalizeMetaState(0) + 28;
                    Object[] objArr71 = new Object[1];
                    c((short) (-$$a[8]), (byte) 52, (byte) 14, objArr71);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cIndexOf2, iResolveOpacity, iNormalizeMetaState4, -1048449946, false, (String) objArr71[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf10);
                objArr5 = objArr68;
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        int i78 = ((int[]) objArr5[1])[0];
        int i79 = ((int[]) objArr5[3])[0];
        if (i79 == i78) {
            int i80 = asInterface + 1;
            asBinder = i80 % 128;
            int i81 = i80 % 2;
            int i82 = ((int[]) objArr5[0])[0];
            Object[] objArr72 = {new int[1], new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[]{((int[]) objArr5[3])[0]}, (String[]) objArr5[4]};
            str7 = "currentApplication";
            int i83 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i84 = i82 + (-1284503660) + ((~((-37556483) | i83)) * 623) + (((~i83) | 67117081) * (-623)) + (((~(i83 | 901820121)) | (~((-872259523) | i83)) | 37556482) * 623);
            int i85 = (i84 << 13) ^ i84;
            int i86 = i85 ^ (i85 >>> 17);
            i = 0;
            ((int[]) objArr72[0])[0] = i86 ^ (i86 << 5);
        } else {
            str7 = r6;
            ArrayList arrayList4 = new ArrayList();
            String[] strArr7 = (String[]) objArr5[4];
            if (strArr7 != null) {
                for (String str23 : strArr7) {
                    arrayList4.add(str23);
                }
            }
            Toast.makeText((Context) null, i79 / (((i79 - 1) * i79) % 2), 0).show();
            int i87 = ((int[]) objArr5[0])[0];
            Object[] objArr73 = {new int[1], new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[]{((int[]) objArr5[3])[0]}, (String[]) objArr5[4]};
            int i88 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str7, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i89 = ~i88;
            int i90 = i87 + 3284954 + (((~((-1323346771) | i89)) | 450732873) * (-90)) + (((~((-1323346771) | i88)) | (-1593682780)) * (-45)) + (((~(i88 | (-450732874))) | (-1323346771) | (~(i89 | 450732873))) * 45);
            int i91 = (i90 << 13) ^ i90;
            int i92 = i91 ^ (i91 >>> 17);
            i = 0;
            ((int[]) objArr73[0])[0] = i92 ^ (i92 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
            char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iLastIndexOf3 = TextUtils.lastIndexOf(str4, '0', i, i) + 2268;
            int threadPriority2 = 33 - ((Process.getThreadPriority(i) + 20) >> 6);
            byte b14 = $$a[7];
            Object[] objArr74 = new Object[1];
            c((short) 173, b14, b14, objArr74);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(doubleTapTimeout2, iLastIndexOf3, threadPriority2, -887667012, false, (String) objArr74[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                char cLastIndexOf2 = (char) (TextUtils.lastIndexOf(str4, '0', 0) + 1);
                int maximumDrawingCacheSize3 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2267;
                int doubleTapTimeout3 = 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                Object[] objArr75 = new Object[1];
                c((short) 210, (byte) 15, $$a[7], objArr75);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cLastIndexOf2, maximumDrawingCacheSize3, doubleTapTimeout3, -654680577, false, (String) objArr75[0], null);
            }
            Object[] objArr76 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).get(null);
            objArr6 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i93 = ((int[]) objArr76[0])[0];
            int i94 = ((int[]) objArr76[3])[0];
            String[] strArr8 = (String[]) objArr76[1];
            int i95 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i96 = ~(554876891 | i95);
            int i97 = 342699585 + ((237043712 | i96) * (-814)) + ((i96 | (~((~i95) | (-253836425))) | 538084179) * 407) + (((~(i95 | 253836424)) | (~((-554876892) | i95)) | 538084179) * 407) + 1993827832;
            int i98 = (i97 << 13) ^ i97;
            int i99 = i98 ^ (i98 >>> 17);
            ((int[]) objArr6[2])[0] = i99 ^ (i99 << 5);
            str15 = str15;
            str8 = str;
            c3 = 3;
            str5 = str5;
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                baseContext3 = (Context) Class.forName(str17).getMethod(str6, new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                if (baseContext3 instanceof ContextWrapper) {
                    int i100 = asInterface + 41;
                    asBinder = i100 % 128;
                    int i101 = i100 % 2;
                    if (((ContextWrapper) baseContext3).getBaseContext() != null) {
                        baseContext3 = baseContext3.getApplicationContext();
                    } else {
                        baseContext3 = null;
                    }
                } else {
                    baseContext3 = baseContext3.getApplicationContext();
                }
            }
            Object[] objArr77 = {baseContext3, Integer.valueOf(((Integer) Class.forName(str15).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 1993827832};
            byte[] bArr11 = $$p;
            byte b15 = bArr11[94];
            Object[] objArr78 = new Object[1];
            f(b15, (short) (b15 | 161), bArr11[39], objArr78);
            Class<?> cls5 = Class.forName((String) objArr78[0]);
            Object[] objArr79 = new Object[1];
            f(bArr11[25], (short) 378, bArr11[326], objArr79);
            Object[] objArr80 = (Object[]) cls5.getMethod((String) objArr79[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr77);
            if (baseContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                    char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iBlue = Color.blue(0) + 2267;
                    int i102 = 33 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    Object[] objArr81 = new Object[1];
                    c((short) 210, (byte) 15, $$a[7], objArr81);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(pressedStateDuration3, iBlue, i102, -654680577, false, (String) objArr81[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, objArr80);
                try {
                    str8 = str;
                    long jLongValue8 = ((Long) Class.forName(str13).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                        int i103 = 2267 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i104 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32;
                        byte b16 = $$a[7];
                        Object[] objArr82 = new Object[1];
                        c((short) 69, b16, b16, objArr82);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(cRgb, i103, i104, -874156483, false, (String) objArr82[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                        char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i105 = 2267 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iLastIndexOf4 = TextUtils.lastIndexOf(str4, '0', 0) + 34;
                        byte b17 = $$a[7];
                        Object[] objArr83 = new Object[1];
                        c((short) 173, b17, b17, objArr83);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(minimumFlingVelocity2, i105, iLastIndexOf4, -887667012, false, (String) objArr83[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                objArr80 = objArr80;
                str15 = str15;
                str8 = str;
                str5 = str5;
            }
            objArr6 = objArr80;
            c3 = 3;
        }
        int i106 = ((int[]) objArr6[c3])[0];
        int i107 = ((int[]) objArr6[0])[0];
        if (i107 == i106) {
            int i108 = asBinder + 111;
            asInterface = i108 % 128;
            int i109 = i108 % 2;
            Object[] objArr84 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i110 = ((int[]) objArr6[2])[0];
            int i111 = ((int[]) objArr6[0])[0];
            int i112 = ((int[]) objArr6[3])[0];
            String[] strArr9 = (String[]) objArr6[1];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i113 = ~iIdentityHashCode4;
            int i114 = i110 + 258730559 + (((~(231999300 | i113)) | (-1040712617) | (~((-231999301) | iIdentityHashCode4))) * (-564)) + ((~(iIdentityHashCode4 | (-201327361))) * 1128) + (((~((-1040712617) | i113)) | 30671940) * 564);
            int i115 = i114 ^ (i114 << 13);
            int i116 = i115 ^ (i115 >>> 17);
            i2 = 0;
            ((int[]) objArr84[2])[0] = i116 ^ (i116 << 5);
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr10 = (String[]) objArr6[1];
            if (strArr10 != null) {
                for (String str24 : strArr10) {
                    arrayList5.add(str24);
                }
            }
            Toast.makeText((Context) null, i107 / (((i107 - 1) * i107) % 2), 0).show();
            Object[] objArr85 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i117 = ((int[]) objArr6[2])[0];
            int i118 = ((int[]) objArr6[0])[0];
            int i119 = ((int[]) objArr6[3])[0];
            String[] strArr11 = (String[]) objArr6[1];
            int i120 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i121 = ~i120;
            int i122 = i117 + (-1911137429) + (((~((-542989307) | i121)) | 5505128) * 168) + ((~((-5505129) | i120)) * 168) + (((~(i120 | (-537484179))) | (~(i121 | (-265724010))) | 260218881) * 168);
            int i123 = i122 ^ (i122 << 13);
            int i124 = i123 ^ (i123 >>> 17);
            i2 = 0;
            ((int[]) objArr85[2])[0] = i124 ^ (i124 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
            char c13 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int offsetAfter2 = 876 - TextUtils.getOffsetAfter(str4, i2);
            int size = 10 - View.MeasureSpec.getSize(i2);
            Object[] objArr86 = new Object[1];
            c((short) (-$$a[8]), (byte) 52, (byte) 14, objArr86);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c13, offsetAfter2, size, 252381699, false, (String) objArr86[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str13).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
            char packedPositionChild3 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int bitsPerPixel = 875 - ImageFormat.getBitsPerPixel(0);
            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 10;
            byte b18 = $$a[7];
            Object[] objArr87 = new Object[1];
            c((short) 121, b18, b18, objArr87);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(packedPositionChild3, bitsPerPixel, packedPositionGroup2, 2009631821, false, (String) objArr87[0], null);
        }
        if (j3 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength(str4);
                int scrollBarSize2 = 876 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iMakeMeasureSpec3 = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte[] bArr12 = $$a;
                short s2 = bArr12[7];
                Object[] objArr88 = new Object[1];
                c(s2, (byte) (s2 | 52), bArr12[10], objArr88);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(trimmedLength, scrollBarSize2, iMakeMeasureSpec3, 256017550, false, (String) objArr88[0], null);
            }
            Object[] objArr89 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr89[0])[0]}, new int[1], new int[]{((int[]) objArr89[2])[0]}, (String[]) objArr89[3]};
            int i125 = ~((int) Runtime.getRuntime().freeMemory());
            int i126 = (-672258380) + (((~(i125 | 463049714)) | 2255885) * (-160)) + (((~(i125 | 422739485)) | 463049714) * 160) + 1093650929;
            int i127 = (i126 << 13) ^ i126;
            int i128 = i127 ^ (i127 >>> 17);
            ((int[]) objArr7[1])[0] = i128 ^ (i128 << 5);
            str9 = str5;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                baseContext4 = (Context) Class.forName(str17).getMethod(str6, new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
            }
            str9 = str5;
            Object[] objArr90 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str15).getMethod(str9, Object.class).invoke(null, this)).intValue()), 1093650929};
            byte[] bArr13 = $$p;
            Object[] objArr91 = new Object[1];
            f(bArr13[94], (short) 120, (byte) 94, objArr91);
            Class<?> cls6 = Class.forName((String) objArr91[0]);
            short s3 = (short) 107;
            Object[] objArr92 = new Object[1];
            f(bArr13[35], s3, (byte) s3, objArr92);
            Object[] objArr93 = (Object[]) cls6.getMethod((String) objArr92[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr90);
            if (baseContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                    char maxKeyCode5 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int iIndexOf4 = TextUtils.indexOf((CharSequence) str4, '0') + 877;
                    int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L) + 11;
                    byte[] bArr14 = $$a;
                    short s4 = bArr14[7];
                    Object[] objArr94 = new Object[1];
                    c(s4, (byte) (s4 | 52), bArr14[10], objArr94);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(maxKeyCode5, iIndexOf4, packedPositionChild4, 256017550, false, (String) objArr94[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, objArr93);
                try {
                    long jLongValue10 = ((Long) Class.forName(str13).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                        char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int i129 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                        int i130 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                        byte b19 = $$a[7];
                        Object[] objArr95 = new Object[1];
                        c((short) 121, b19, b19, objArr95);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(bitsPerPixel2, i129, i130, 2009631821, false, (String) objArr95[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue10 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                        char mode2 = (char) View.MeasureSpec.getMode(0);
                        int i131 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                        int i132 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
                        Object[] objArr96 = new Object[1];
                        c((short) (-$$a[8]), (byte) 52, (byte) 14, objArr96);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(mode2, i131, i132, 252381699, false, (String) objArr96[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf14);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            } else {
                objArr93 = objArr93;
            }
            objArr7 = objArr93;
        }
        int i133 = ((int[]) objArr7[2])[0];
        int i134 = ((int[]) objArr7[0])[0];
        if (i134 != i133) {
            throw new RuntimeException(String.valueOf(i134));
        }
        int i135 = ((int[]) objArr7[1])[0];
        Object[] objArr97 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
        int i136 = ~System.identityHashCode(this);
        int i137 = i135 + (-278877836) + ((503005143 | i136) * 184) + (((~(i136 | 475608471)) | 95103573) * 184);
        int i138 = (i137 << 13) ^ i137;
        int i139 = i138 ^ (i138 >>> 17);
        ((int[]) objArr97[1])[0] = i139 ^ (i139 << 5);
        int i140 = asInterface + 39;
        asBinder = i140 % 128;
        int i141 = i140 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
            char c14 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int iAxisFromString = MotionEvent.axisFromString(str4) + 652;
            int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44;
            byte b20 = $$a[7];
            Object[] objArr98 = new Object[1];
            c((short) 121, b20, b20, objArr98);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(c14, iAxisFromString, minimumFlingVelocity3, -459846511, false, (String) objArr98[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str13).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
            char mirror2 = (char) (AndroidCharacter.getMirror('0') - '0');
            int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 651;
            int capsMode2 = 44 - TextUtils.getCapsMode(str4, 0, 0);
            Object[] objArr99 = new Object[1];
            c((short) (-$$a[8]), (byte) 52, (byte) 14, objArr99);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(mirror2, keyRepeatTimeout3, capsMode2, -873460649, false, (String) objArr99[0], null);
        }
        if (j4 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                char c15 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int iMyTid = (Process.myTid() >> 22) + 651;
                int fadingEdgeLength = 44 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                Object[] objArr100 = new Object[1];
                c((short) 210, (byte) 15, $$a[7], objArr100);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(c15, iMyTid, fadingEdgeLength, -1595579076, false, (String) objArr100[0], null);
            }
            Object[] objArr101 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).get(null);
            objArr8 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i142 = ((int[]) objArr101[2])[0];
            int i143 = ((int[]) objArr101[0])[0];
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i144 = ((((-353373327) + (((~(104300886 | iIdentityHashCode5)) | 4741792) * 104)) + ((~((~iIdentityHashCode5) | (-1310983))) * (-104))) + ((iIdentityHashCode5 | 107731696) * 104)) - 1333075683;
            int i145 = (i144 << 13) ^ i144;
            int i146 = i145 ^ (i145 >>> 17);
            i3 = 0;
            ((int[]) objArr8[3])[0] = i146 ^ (i146 << 5);
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b((char) (TextUtils.indexOf((CharSequence) str4, '0') + 1), 1610 - TextUtils.indexOf(str4, str4), View.combineMeasuredStates(0, 0) + 26, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr102 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).newInstance(null), -1333075683, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) str4, '0', 0));
                int maxKeyCode6 = 651 - (KeyEvent.getMaxKeyCode() >> 16);
                int i147 = 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr103 = new Object[1];
                c((short) (-$$a[8]), (byte) 52, (byte) 14, objArr103);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cIndexOf3, maxKeyCode6, i147, 2075921419, false, (String) objArr103[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.blue(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 695, View.resolveSize(0, 0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - Gravity.getAbsoluteGravity(0, 0)), 793 - (ViewConfiguration.getLongPressTimeout() >> 16), 83 - View.resolveSize(0, 0)), Integer.TYPE, Integer.TYPE});
            }
            objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).invoke(null, objArr102);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                char modifierMetaStateMask2 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                int iAxisFromString2 = 650 - MotionEvent.axisFromString(str4);
                int iIndexOf5 = 44 - TextUtils.indexOf(str4, str4);
                Object[] objArr104 = new Object[1];
                c((short) 210, (byte) 15, $$a[7], objArr104);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(modifierMetaStateMask2, iAxisFromString2, iIndexOf5, -1595579076, false, (String) objArr104[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, objArr8);
            try {
                long jLongValue12 = ((Long) Class.forName(str13).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char cResolveSize = (char) View.resolveSize(0, 0);
                    int mirror3 = AndroidCharacter.getMirror('0') + 603;
                    int i148 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44;
                    Object[] objArr105 = new Object[1];
                    c((short) (-$$a[8]), (byte) 52, (byte) 14, objArr105);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cResolveSize, mirror3, i148, -873460649, false, (String) objArr105[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue12 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char longPressTimeout3 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iCombineMeasuredStates = 651 - View.combineMeasuredStates(0, 0);
                    int iGreen = 44 - Color.green(0);
                    byte b21 = $$a[7];
                    Object[] objArr106 = new Object[1];
                    c((short) 121, b21, b21, objArr106);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(longPressTimeout3, iCombineMeasuredStates, iGreen, -459846511, false, (String) objArr106[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf16);
                i3 = 0;
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        int i149 = ((int[]) objArr8[i3])[i3];
        int i150 = ((int[]) objArr8[2])[i3];
        if (i150 == i149) {
            Object[] objArr107 = new Object[4];
            int[] iArr5 = new int[1];
            objArr107[i3] = iArr5;
            int[] iArr6 = new int[1];
            objArr107[2] = iArr6;
            objArr107[3] = new int[1];
            int i151 = ((int[]) objArr8[3])[i3];
            int i152 = ((int[]) objArr8[2])[i3];
            int i153 = ((int[]) objArr8[i3])[i3];
            iArr6[i3] = i152;
            iArr5[i3] = i153;
            objArr107[1] = new String[i3];
            Class<?>[] clsArr = new Class[i3];
            str10 = str7;
            int i154 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str10, clsArr).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i155 = i151 + (((~((-273225745) | i154)) | (-276676283)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1732150848 + ((~((~i154) | (-273225745))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
            int i156 = (i155 << 13) ^ i155;
            int i157 = i156 ^ (i156 >>> 17);
            ((int[]) objArr107[3])[0] = i157 ^ (i157 << 5);
        } else {
            str10 = str7;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr12 = (String[]) objArr8[1];
            if (strArr12 != null) {
                for (String str25 : strArr12) {
                    arrayList6.add(str25);
                }
            }
            Toast.makeText((Context) null, i150 / (((i150 - 1) * i150) % 2), 0).show();
            Object[] objArr108 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i158 = ((int[]) objArr8[3])[0];
            int i159 = ((int[]) objArr8[2])[0];
            int i160 = ((int[]) objArr8[0])[0];
            int i161 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str10, new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            int i162 = i158 + 1049828164 + (((~(i161 | 1034622275)) | 5548712) * 305) + (((~((~i161) | 1034622275)) | 1031191465) * 305);
            int i163 = (i162 << 13) ^ i162;
            int i164 = i163 ^ (i163 >>> 17);
            ((int[]) objArr108[3])[0] = i164 ^ (i164 << 5);
        }
        MediaSessionCompatCallbackStubApi23 mediaSessionCompatCallbackStubApi24 = (MediaSessionCompatCallbackStubApi23) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        Locale localeTuitionPaymentFragmentbindingInflater1 = MediaSessionCompatCallbackStubApi21.TuitionPaymentFragmentbindingInflater1(mediaSessionCompatCallbackStubApi24.b);
        if (localeTuitionPaymentFragmentbindingInflater1 != null) {
            mediaSessionCompatCallbackStubApi24.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = localeTuitionPaymentFragmentbindingInflater1;
        } else {
            mediaSessionCompatCallbackStubApi24.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mediaSessionCompatCallbackStubApi24.b);
            int i165 = asInterface + 35;
            asBinder = i165 % 128;
            int i166 = i165 % 2;
        }
        try {
            Intent intent = mediaSessionCompatCallbackStubApi24.b.getIntent();
            if (intent != null) {
                int i167 = asInterface + 31;
                asBinder = i167 % 128;
                int i168 = i167 % 2;
                if (intent.getBooleanExtra("activity_locale_changed", false)) {
                    mediaSessionCompatCallbackStubApi24.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                    Intent intent2 = mediaSessionCompatCallbackStubApi24.b.getIntent();
                    if (intent2 != null) {
                        intent2.removeExtra("activity_locale_changed");
                    }
                }
            }
        } catch (BadParcelableException e2) {
            e2.printStackTrace();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char modifierMetaStateMask3 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 37568);
            int fadingEdgeLength2 = 625 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iLastIndexOf5 = TextUtils.lastIndexOf(str4, '0') + 15;
            Object[] objArr109 = new Object[1];
            c((short) (-$$a[8]), (byte) 52, (byte) 14, objArr109);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(modifierMetaStateMask3, fadingEdgeLength2, iLastIndexOf5, -477065106, false, (String) objArr109[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null);
        long jLongValue13 = ((Long) Class.forName(str13).getDeclaredMethod(str8, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
            char threadPriority3 = (char) (37567 - ((Process.getThreadPriority(0) + 20) >> 6));
            int iBlue2 = Color.blue(0) + 625;
            int pressedStateDuration4 = (ViewConfiguration.getPressedStateDuration() >> 16) + 14;
            byte b22 = $$a[7];
            Object[] objArr110 = new Object[1];
            c((short) 69, b22, b22, objArr110);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(threadPriority3, iBlue2, pressedStateDuration4, -976899241, false, (String) objArr110[0], null);
        }
        if (j5 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char offsetAfter3 = (char) (TextUtils.getOffsetAfter(str4, 0) + 37567);
                int i169 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 624;
                int i170 = 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b23 = $$a[7];
                Object[] objArr111 = new Object[1];
                c((short) 173, b23, b23, objArr111);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(offsetAfter3, i169, i170, -973632554, false, (String) objArr111[0], null);
            }
            Object[] objArr112 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).get(null);
            int i171 = ((int[]) objArr112[2])[0];
            int i172 = ((int[]) objArr112[0])[0];
            String[] strArr13 = (String[]) objArr112[3];
            int[] iArr7 = {i171};
            int i173 = ~System.identityHashCode(this);
            int i174 = ((((~((-407092824) | i173)) | 272632337) * (-241)) - 2020561815) + (((~(i173 | (-134460487))) | 1144012960) * 241) + 1714886998;
            int i175 = (i174 << 13) ^ i174;
            int i176 = i175 ^ (i175 >>> 17);
            ((int[]) objArr9[1])[0] = i176 ^ (i176 << 5);
            objArr9 = new Object[]{new int[]{i172}, new int[1], iArr7, strArr13};
            c4 = 0;
            str12 = str8;
            str11 = str9;
            str6 = str6;
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str17).getMethod(str6, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
            }
            str11 = str9;
            int iIntValue2 = ((Integer) Class.forName(str15).getMethod(str11, Object.class).invoke(null, this)).intValue();
            Object[] objArr113 = new Object[1];
            e(1641770785 - TextUtils.getOffsetBefore(str4, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod(str10, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 12, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod(str10, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.telkomsel_instruction_step2).substring(3, 4).codePointAt(0) - 117), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod(str10, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_4).substring(4, 5).length() - 17), ((Context) Class.forName("android.app.ActivityThread").getMethod(str10, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_internet_instruction_step3).substring(2, 3).length() - 1855492104, objArr113);
            String str26 = (String) objArr113[0];
            Object[] objArr114 = new Object[1];
            e(1641770833 - TextUtils.lastIndexOf(str4, '0', 0), ((Context) Class.forName("android.app.ActivityThread").getMethod(str10, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 12, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod(str10, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109), (byte) (View.resolveSizeAndState(0, 0, 0) + 34), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1855492038, objArr114);
            Object[] objArr115 = {baseContext5, new String[]{str26, (String) objArr114[0]}, Integer.valueOf(iIntValue2), 17, 1714886998};
            byte[] bArr15 = $$p;
            Object[] objArr116 = new Object[1];
            f(bArr15[94], (short) 107, bArr15[18], objArr116);
            Class<?> cls7 = Class.forName((String) objArr116[0]);
            Object[] objArr117 = new Object[1];
            f(bArr15[25], bArr15[18], bArr15[326], objArr117);
            Object[] objArr118 = (Object[]) cls7.getMethod((String) objArr117[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr115);
            int i177 = ((int[]) objArr118[0])[0];
            int i178 = ((int[]) objArr118[2])[0];
            if (baseContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                    char c16 = (char) (37568 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 625;
                    int maximumFlingVelocity = 14 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b24 = $$a[7];
                    Object[] objArr119 = new Object[1];
                    c((short) 173, b24, b24, objArr119);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(c16, packedPositionType2, maximumFlingVelocity, -973632554, false, (String) objArr119[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, objArr118);
                try {
                    str12 = str8;
                    long jLongValue14 = ((Long) Class.forName(str13).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue14);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                        char cRgb2 = (char) (Color.rgb(0, 0, 0) + 16814783);
                        int i179 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 625;
                        int gidForName3 = Process.getGidForName(str4) + 15;
                        byte b25 = $$a[7];
                        Object[] objArr120 = new Object[1];
                        c((short) 69, b25, b25, objArr120);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cRgb2, i179, gidForName3, -976899241, false, (String) objArr120[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                        char tapTimeout2 = (char) (37567 - (ViewConfiguration.getTapTimeout() >> 16));
                        int i180 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 624;
                        int i181 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13;
                        Object[] objArr121 = new Object[1];
                        c((short) (-$$a[8]), (byte) 52, (byte) 14, objArr121);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(tapTimeout2, i180, i181, -477065106, false, (String) objArr121[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                objArr118 = objArr118;
                str12 = str8;
                str6 = str6;
            }
            objArr9 = objArr118;
            c4 = 0;
        }
        int i182 = ((int[]) objArr9[c4])[c4];
        int i183 = ((int[]) objArr9[2])[c4];
        if (i183 != i182) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr14 = (String[]) objArr9[3];
            if (strArr14 != null) {
                for (String str27 : strArr14) {
                    arrayList7.add(str27);
                }
            }
            throw new RuntimeException(String.valueOf(i183));
        }
        int i184 = asInterface + 33;
        asBinder = i184 % 128;
        int i185 = i184 % 2;
        int i186 = ((int[]) objArr9[1])[0];
        int i187 = ((int[]) objArr9[2])[0];
        int i188 = ((int[]) objArr9[0])[0];
        String[] strArr15 = (String[]) objArr9[3];
        int[] iArr8 = {i187};
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod(str10, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 479207656;
        int i189 = (~((-1628606915) | iCodePointAt)) | 16781634;
        int i190 = ~((~iCodePointAt) | 1806956486);
        int i191 = i186 + 1121171508 + ((i189 | i190) * (-470)) + (((~(iCodePointAt | (-1611825281))) | i190) * 470);
        int i192 = i191 ^ (i191 << 13);
        int i193 = i192 ^ (i192 >>> 17);
        ((int[]) objArr[1])[0] = i193 ^ (i193 << 5);
        Object[] objArr122 = {new int[]{i188}, new int[1], iArr8, strArr15};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int packedPositionGroup3 = 1031 - ExpandableListView.getPackedPositionGroup(0L);
            int iIndexOf6 = 14 - TextUtils.indexOf((CharSequence) str4, '0', 0, 0);
            byte b26 = $$a[7];
            Object[] objArr123 = new Object[1];
            c((short) 69, b26, b26, objArr123);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cMyTid, packedPositionGroup3, iIndexOf6, 1357589585, false, (String) objArr123[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null);
        long jLongValue15 = ((Long) Class.forName(str13).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char c17 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int iIndexOf7 = 1030 - TextUtils.indexOf((CharSequence) str4, '0', 0, 0);
            int maximumDrawingCacheSize4 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15;
            byte b27 = $$a[7];
            Object[] objArr124 = new Object[1];
            c((short) 173, b27, b27, objArr124);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(c17, iIndexOf7, maximumDrawingCacheSize4, 1344079056, false, (String) objArr124[0], null);
        }
        if (j6 == ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char cIndexOf4 = (char) ((-1) - TextUtils.indexOf((CharSequence) str4, '0', 0, 0));
                int offsetBefore2 = 1031 - TextUtils.getOffsetBefore(str4, 0);
                int iIndexOf8 = 14 - TextUtils.indexOf((CharSequence) str4, '0');
                Object[] objArr125 = new Object[1];
                c((short) (-$$a[8]), (byte) 52, (byte) 14, objArr125);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(cIndexOf4, offsetBefore2, iIndexOf8, 632103528, false, (String) objArr125[0], null);
            }
            Object[] objArr126 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).get(null);
            objArr10 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i194 = ((int[]) objArr126[3])[0];
            int i195 = ((int[]) objArr126[1])[0];
            String[] strArr16 = (String[]) objArr126[0];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i196 = 2008359231 + (((~((-289278872) | iIdentityHashCode6)) | 285999873) * (-140)) + ((~((-3278999) | iIdentityHashCode6)) * 70) + (((~(iIdentityHashCode6 | 533559041)) | (-250838167)) * 70) + 1872225105;
            int i197 = (i196 << 13) ^ i196;
            int i198 = i197 ^ (i197 >>> 17);
            ((int[]) objArr10[2])[0] = i198 ^ (i198 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str15).getMethod(str11, Object.class).invoke(null, this)).intValue();
            Object[] objArr127 = {-2143746550};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b((char) (46038 - ExpandableListView.getPackedPositionGroup(0L)), 1134 - TextUtils.indexOf(str4, str4, 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr128 = {Integer.valueOf(iIntValue3), 0, 1872225105, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).newInstance(objArr127), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char cResolveSize2 = (char) View.resolveSize(0, 0);
                int offsetAfter4 = TextUtils.getOffsetAfter(str4, 0) + 1031;
                int iAlpha = Color.alpha(0) + 15;
                byte b28 = $$a[7];
                Object[] objArr129 = new Object[1];
                c((short) 69, b28, b28, objArr129);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(cResolveSize2, offsetAfter4, iAlpha, 1298546779, false, (String) objArr129[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45993), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1117, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
            }
            objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).invoke(null, objArr128);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char c18 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int i199 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i200 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14;
                Object[] objArr130 = new Object[1];
                c((short) (-$$a[8]), (byte) 52, (byte) 14, objArr130);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(c18, i199, i200, 632103528, false, (String) objArr130[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, objArr10);
            try {
                long jLongValue16 = ((Long) Class.forName(str13).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue16);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char defaultSize2 = (char) View.getDefaultSize(0, 0);
                    int i201 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1030;
                    int iMyPid2 = (Process.myPid() >> 22) + 15;
                    byte b29 = $$a[7];
                    Object[] objArr131 = new Object[1];
                    c((short) 173, b29, b29, objArr131);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(defaultSize2, i201, iMyPid2, 1344079056, false, (String) objArr131[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int minimumFlingVelocity4 = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int i202 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte b30 = $$a[7];
                    Object[] objArr132 = new Object[1];
                    c((short) 69, b30, b30, objArr132);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cCombineMeasuredStates, minimumFlingVelocity4, i202, 1357589585, false, (String) objArr132[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf20);
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        int i203 = ((int[]) objArr10[1])[0];
        int i204 = ((int[]) objArr10[3])[0];
        if (i204 == i203) {
            Object[] objArr133 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i205 = ((int[]) objArr10[2])[0];
            int i206 = ((int[]) objArr10[3])[0];
            int i207 = ((int[]) objArr10[1])[0];
            String[] strArr17 = (String[]) objArr10[0];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i208 = ~iIdentityHashCode7;
            int i209 = i205 + 433629483 + (((~((-187377088) | i208)) | (~((-56903083) | iIdentityHashCode7))) * (-370)) + (((~(iIdentityHashCode7 | (-187377088))) | (~(i208 | (-56903083))) | (-191849920)) * (-370)) + 2029973632;
            int i210 = (i209 << 13) ^ i209;
            int i211 = i210 ^ (i210 >>> 17);
            ((int[]) objArr133[2])[0] = i211 ^ (i211 << 5);
            i4 = 0;
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr18 = (String[]) objArr10[0];
            if (strArr18 != null) {
                for (String str28 : strArr18) {
                    arrayList8.add(str28);
                }
            }
            Toast.makeText((Context) null, i204 / (((i204 - 1) * i204) % 2), 0).show();
            Object[] objArr134 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i212 = ((int[]) objArr10[2])[0];
            int i213 = ((int[]) objArr10[3])[0];
            int i214 = ((int[]) objArr10[1])[0];
            String[] strArr19 = (String[]) objArr10[0];
            int iMyPid3 = Process.myPid();
            int i215 = i212 + (-1111539135) + (((~(898872862 | iMyPid3)) | 33835168 | (~((-654592693) | iMyPid3))) * (-744)) + (((~iMyPid3) | 278115338) * 744) + ((iMyPid3 | (-33835169)) * 744);
            int i216 = i215 ^ (i215 << 13);
            int i217 = i216 ^ (i216 >>> 17);
            i4 = 0;
            ((int[]) objArr134[2])[0] = i217 ^ (i217 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char c19 = (char) (53893 - (CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)));
            int iIndexOf9 = 1320 - TextUtils.indexOf(str4, str4);
            int packedPositionChild5 = 35 - ExpandableListView.getPackedPositionChild(0L);
            Object[] objArr135 = new Object[1];
            c((short) (-$$a[8]), (byte) 52, (byte) 14, objArr135);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(c19, iIndexOf9, packedPositionChild5, -1433084963, false, (String) objArr135[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char gidForName4 = (char) (Process.getGidForName(str4) + 53894);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1320;
                int i218 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36;
                byte b31 = $$a[7];
                Object[] objArr136 = new Object[1];
                c((short) 173, b31, b31, objArr136);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(gidForName4, scrollDefaultDelay, i218, -1920778747, false, (String) objArr136[0], null);
            }
            Object[] objArr137 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            objArr11 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i219 = ((int[]) objArr137[0])[0];
            int i220 = ((int[]) objArr137[3])[0];
            String[] strArr20 = (String[]) objArr137[2];
            int i221 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str10, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i222 = ~i221;
            int i223 = 1698416412 + (((~((-71864709) | i222)) | 1298763116) * (-602)) + (((~(i221 | (-71864709))) | 71860484 | (~(1298767340 | i222))) * (-301)) + ((~(i222 | 1298763116)) * 301) + 802956457;
            int i224 = (i223 << 13) ^ i223;
            int i225 = i224 ^ (i224 >>> 17);
            ((int[]) objArr11[1])[0] = i225 ^ (i225 << 5);
        } else {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                int i226 = asInterface + 31;
                asBinder = i226 % 128;
                baseContext6 = i226 % 2 != 0 ? (Context) Class.forName(str17).getMethod(str6, new Class[0]).invoke(null, null) : (Context) Class.forName(str17).getMethod(str6, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
            }
            int iIntValue4 = ((Integer) Class.forName(str15).getMethod(str11, Object.class).invoke(null, this)).intValue();
            Object[] objArr138 = {-2143746550};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b((char) (47976 - ExpandableListView.getPackedPositionChild(0L)), Color.blue(0) + 1300, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr139 = {baseContext6, "com.bpjstku", 802956457, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).newInstance(objArr138), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                char trimmedLength2 = (char) (TextUtils.getTrimmedLength(str4) + 53893);
                int longPressTimeout4 = 1320 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 36;
                byte b32 = $$a[7];
                Object[] objArr140 = new Object[1];
                c((short) 173, b32, b32, objArr140);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(trimmedLength2, longPressTimeout4, packedPositionType3, 819724799, false, (String) objArr140[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) str4, '0') + 57879), 1394 - ExpandableListView.getPackedPositionGroup(0L), 74 - TextUtils.lastIndexOf(str4, '0', 0, 0)), Boolean.TYPE});
            }
            objArr11 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).invoke(null, objArr139);
            if (baseContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char cGreen = (char) (Color.green(0) + 53893);
                    int modifierMetaStateMask4 = ((byte) KeyEvent.getModifierMetaStateMask()) + 1321;
                    int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 36;
                    byte b33 = $$a[7];
                    Object[] objArr141 = new Object[1];
                    c((short) 173, b33, b33, objArr141);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cGreen, modifierMetaStateMask4, tapTimeout3, -1920778747, false, (String) objArr141[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, objArr11);
                try {
                    long jLongValue17 = ((Long) Class.forName(str13).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                        char c20 = (char) (53894 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int iRed3 = Color.red(0) + 1320;
                        int scrollBarFadeDuration = 36 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        Object[] objArr142 = new Object[1];
                        c((short) 210, (byte) 15, $$a[7], objArr142);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(c20, iRed3, scrollBarFadeDuration, -1273706634, false, (String) objArr142[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                        char doubleTapTimeout4 = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 53893);
                        int iRed4 = 1320 - Color.red(0);
                        int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 36;
                        Object[] objArr143 = new Object[1];
                        c((short) (-$$a[8]), (byte) 52, (byte) 14, objArr143);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(doubleTapTimeout4, iRed4, iResolveOpacity2, -1433084963, false, (String) objArr143[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
        }
        int i227 = ((int[]) objArr11[3])[0];
        int i228 = ((int[]) objArr11[0])[0];
        if (i228 != i227) {
            throw new RuntimeException(String.valueOf(i228));
        }
        Object[] objArr144 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i229 = ((int[]) objArr11[1])[0];
        int i230 = ((int[]) objArr11[0])[0];
        int i231 = ((int[]) objArr11[3])[0];
        String[] strArr21 = (String[]) objArr11[2];
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i232 = i229 + 1760814272 + (((-858315) | iMaxMemory) * (-627)) + (((~((-1235387926) | iMaxMemory)) | 135239899) * (-627)) + (((~(iMaxMemory | 135239899)) | (~((~iMaxMemory) | 1235387925))) * 627);
        int i233 = (i232 << 13) ^ i232;
        int i234 = i233 ^ (i233 >>> 17);
        ((int[]) objArr144[1])[0] = i234 ^ (i234 << 5);
        int i235 = asBinder + 79;
        asInterface = i235 % 128;
        int i236 = i235 % 2;
        super.onCreate(p0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.myTid() >> 22) + 46400), 39 - TextUtils.lastIndexOf("", '0', 0, 0), 19 - View.MeasureSpec.getSize(0), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46399 - TextUtils.lastIndexOf("", '0', 0)), 40 - (ViewConfiguration.getFadingEdgeLength() >> 16), 19 - Color.red(0), 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onResume();
            MediaSessionCompatCallbackStubApi23 mediaSessionCompatCallbackStubApi23 = (MediaSessionCompatCallbackStubApi23) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            LocalizationActivity localizationActivity = this;
            Intrinsics.checkNotNullParameter(localizationActivity, "");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: MediaSessionCompatCallbackStubApi23.2
                private /* synthetic */ Context $TuitionPaymentFragmentspecialinlinedviewModeldefault3;

                @Override // java.lang.Runnable
                public final void run() {
                    MediaSessionCompatCallbackStubApi23.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(context);
                    MediaSessionCompatCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault1(MediaSessionCompatCallbackStubApi23.this);
                }

                public AnonymousClass2() {
                    context = localizationActivity;
                }
            });
            int i2 = asBinder + 3;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context p0) {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        applyOverrideConfiguration(MediaSessionCompatCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0));
        super.attachBaseContext(p0);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSizeAndState = (char) (29944 - View.resolveSizeAndState(0, 0, 0));
            int iAxisFromString = 1754 - MotionEvent.axisFromString("");
            int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
            Object[] objArr2 = new Object[1];
            c((short) 210, (byte) 15, $$a[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, iAxisFromString, iMakeMeasureSpec, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = asInterface + 63;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0);
                byte b = $$a[7];
                Object[] objArr3 = new Object[1];
                c((short) 173, b, b, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, keyRepeatTimeout, iLastIndexOf, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i5 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{i5}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i7 = ~i6;
            int i8 = (((784505070 + ((((~((-288362635) | i7)) | (~((-172007717) | i6))) | (~(536130558 | i6))) * 765)) + ((288362634 | (~((-460370351) | i7))) * 1530)) + (((~(i6 | (-460370351))) | (~(i7 | 536130558))) * 765)) - 1616404105;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(1641770840 - MotionEvent.axisFromString(""), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_unsuccessful).substring(0, 1).length() - 2, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_akulaku).substring(18, 21).length() - 1855492219, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_confirm_button).substring(1, 3).codePointAt(0) + 1641770743, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step5).substring(28, 30).length() - 3, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_expiry_date).substring(14, 16).codePointAt(1) - 108), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 66), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1855492211, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1693303642};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - TextUtils.indexOf("", "")), 1727 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -1616404105);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 1756;
                    int iMyPid = (Process.myPid() >> 22) + 23;
                    byte b2 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c((short) 173, b2, b2, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, iLastIndexOf2, iMyPid, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1641770832, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_bank_transfer_bca).substring(8, 9).length() - 2, (short) KeyEvent.getDeadChar(0, 0), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_1).substring(4, 5).codePointAt(0) + 73), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_dialog_screen_primary_cta_text).substring(5, 14).codePointAt(7) - 1855492299, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_bni).substring(1, 3).codePointAt(1) + 1641770715, (-1) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_credit_card_4).substring(1, 3).codePointAt(1) - 22), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 1855492269, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cRed = (char) (29944 - Color.red(0));
                        int iBlue = Color.blue(0) + 1755;
                        int gidForName = Process.getGidForName("") + 24;
                        byte b3 = $$a[7];
                        Object[] objArr11 = new Object[1];
                        c((short) 121, b3, b3, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, iBlue, gidForName, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollBarFadeDuration = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1755;
                        int iResolveOpacity2 = 23 - Drawable.resolveOpacity(0, 0);
                        Object[] objArr12 = new Object[1];
                        c((short) 210, (byte) 15, $$a[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, iResolveOpacity, iResolveOpacity2, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i11 = asInterface + 105;
                    asBinder = i11 % 128;
                    int i12 = i11 % 2;
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
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                while (i2 < strArr.length) {
                    int i15 = asInterface + 3;
                    asBinder = i15 % 128;
                    int i16 = i15 % 2;
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i17 = asInterface + 33;
        asBinder = i17 % 128;
        int i18 = i17 % 2;
        int i19 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        int i20 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        Object[] objArr13 = {new int[]{i20}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i21 = ~((-121082519) | iIdentityHashCode);
        int i22 = ~iIdentityHashCode;
        int i23 = i21 | (~(91519907 | i22));
        int i24 = ~(121082518 | i22);
        int i25 = i19 + (-1712959483) + ((i23 | i24) * (-516)) + (((~(iIdentityHashCode | (-87298691))) | (~((-4221218) | i22))) * 516) + ((4221217 | i24) * 516);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        ((int[]) objArr13[3])[0] = i27 ^ (i27 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1031;
            int trimmedLength = TextUtils.getTrimmedLength("") + 15;
            byte b4 = $$a[7];
            Object[] objArr14 = new Object[1];
            c((short) 69, b4, b4, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iKeyCodeFromString, trimmedLength, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e((KeyEvent.getMaxKeyCode() >> 16) + 1641770832, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_done_step1).substring(92, 93).length() - 2, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_permata_alto).substring(0, 12).codePointAt(7) - 47), (byte) (KeyEvent.getDeadChar(0, 0) + 105), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_invalid_merchant_url).substring(0, 13).length() - 1855492197, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e((ViewConfiguration.getLongPressTimeout() >> 16) + 1641770836, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 37, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_at_atm).substring(4, 5).codePointAt(0) - 16), (ViewConfiguration.getLongPressTimeout() >> 16) - 1855492162, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int iMyTid = (Process.myTid() >> 22) + 1031;
            int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte b5 = $$a[7];
            Object[] objArr17 = new Object[1];
            c((short) 173, b5, b5, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(edgeSlop, iMyTid, iIndexOf, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int iLastIndexOf3 = 14 - TextUtils.lastIndexOf("", '0');
                Object[] objArr18 = new Object[1];
                c((short) (-$$a[8]), (byte) 52, (byte) 14, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cKeyCodeFromString, iIndexOf2, iLastIndexOf3, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr19[3])[0];
            int i29 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i30 = (-1610426597) + (((~((~iUptimeMillis) | (-1026469949))) | (-782189779)) * (-235)) + (((~((-1026469949) | iUptimeMillis)) | (-782189779)) * (-470)) + (((~(iUptimeMillis | (-739115025))) | (-1069544703)) * 235) + 1738068433;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[2])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1641770830, ImageFormat.getBitsPerPixel(0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step6).substring(28, 29).length() - 1), (byte) (14 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_dialog_screen_warning_text_blur_image).substring(30, 31).codePointAt(0) - 1855492248, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(1641770840 - View.MeasureSpec.makeMeasureSpec(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bca_prima).substring(0, 9).codePointAt(4) - 81, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama4_bni).substring(14, 15).length() - 1), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step4).substring(89, 91).length() + 38), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step3).substring(3, 4).length() - 1855492201, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {1693303642};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46037), 1134 - TextUtils.indexOf("", ""), View.MeasureSpec.getSize(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 1738068433, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                int iIndexOf3 = 1031 - TextUtils.indexOf("", "");
                int iResolveSizeAndState = 15 - View.resolveSizeAndState(0, 0, 0);
                byte b6 = $$a[7];
                Object[] objArr24 = new Object[1];
                c((short) 69, b6, b6, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(trimmedLength2, iIndexOf3, iResolveSizeAndState, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.getDefaultSize(0, 0) + 45993), 1117 - TextUtils.indexOf("", ""), 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int size = 15 - View.MeasureSpec.getSize(0);
                Object[] objArr25 = new Object[1];
                c((short) (-$$a[8]), (byte) 52, (byte) 14, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c, maximumDrawingCacheSize, size, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1641770831, TextUtils.indexOf((CharSequence) "", '0', 0), (short) TextUtils.indexOf("", "", 0), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 94), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1855492220, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(View.combineMeasuredStates(0, 0) + 1641770836, (ViewConfiguration.getJumpTapTimeout() >> 16) - 1, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 112), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_address).substring(0, 6).codePointAt(3) - 10), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step5).substring(37, 38).length() - 1855492163, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                    int iIndexOf4 = 1031 - TextUtils.indexOf("", "");
                    int i33 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
                    byte b7 = $$a[7];
                    Object[] objArr28 = new Object[1];
                    c((short) 173, b7, b7, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, iIndexOf4, i33, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int i34 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                    int iGreen = 15 - Color.green(0);
                    byte b8 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((short) 69, b8, b8, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionGroup, i34, iGreen, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i35 = asBinder + 37;
                asInterface = i35 % 128;
                int i36 = i35 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i37 = ((int[]) objArr[1])[0];
        int i38 = ((int[]) objArr[3])[0];
        if (i38 != i37) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                while (i2 < strArr3.length) {
                    arrayList2.add(strArr3[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i38));
        }
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i39 = ((int[]) objArr[2])[0];
        int i40 = ((int[]) objArr[3])[0];
        int i41 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iMyTid2 = Process.myTid();
        int i42 = i39 + ((~(iMyTid2 | (-463972342))) * TypedValues.CycleType.TYPE_EASING) + 354782477 + (((~((~iMyTid2) | (-463972342))) | 537923594) * TypedValues.CycleType.TYPE_EASING);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr30[2])[0] = i44 ^ (i44 << 5);
    }

    @Override // android.content.ContextWrapper
    public Context getBaseContext() {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = super.getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "");
        Context contextTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MediaSessionCompatCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault1(baseContext);
        int i4 = asInterface + 3;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return contextTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        Context contextTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = 2 % 2;
        int i2 = asBinder + 105;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Context applicationContext = super.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            contextTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MediaSessionCompatCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault1(applicationContext);
            int i3 = 74 / 0;
        } else {
            Context applicationContext2 = super.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
            contextTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MediaSessionCompatCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault1(applicationContext2);
        }
        int i4 = asInterface + 35;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return contextTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        MediaSessionCompatCallbackStubApi23 mediaSessionCompatCallbackStubApi23 = (MediaSessionCompatCallbackStubApi23) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        Resources resources = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Intrinsics.checkNotNullParameter(resources, "");
        Resources resourcesTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRccTransportControlFlagsFromActions.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaSessionCompatCallbackStubApi23.b, resources);
        int i4 = asBinder + 125;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return resourcesTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, String p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        MediaSessionCompatCallbackStubApi23 mediaSessionCompatCallbackStubApi23 = (MediaSessionCompatCallbackStubApi23) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        LocalizationActivity localizationActivity = this;
        Intrinsics.checkNotNullParameter(localizationActivity, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Locale locale = new Locale(p0, p1);
        Intrinsics.checkNotNullParameter(localizationActivity, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (!MediaSessionCompatCallbackStubApi23.b(locale, MediaSessionCompatCallbackStubApi21.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault1(localizationActivity, MediaSessionCompatCallbackStubApi21.b(localizationActivity)))) {
            int i2 = asInterface + 33;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            MediaSessionCompatCallbackStubApi21.b(mediaSessionCompatCallbackStubApi23.b, locale);
            mediaSessionCompatCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = asInterface + 61;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 3;
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46400), 40 - (Process.myPid() >> 22), 20 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 46401), 40 - ((Process.getThreadPriority(0) + 20) >> 6), 19 - (Process.myTid() >> 22), 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onPause();
            int i4 = asBinder + 17;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = asInterface + 123;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r5, short r6, byte r7) {
        /*
            byte[] r0 = com.akexorcist.localizationactivity.ui.LocalizationActivity.$$c
            int r6 = r6 * 2
            int r1 = r6 + 1
            int r5 = 121 - r5
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r3 = r0[r7]
        L24:
            int r7 = r7 + 1
            int r5 = r5 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akexorcist.localizationactivity.ui.LocalizationActivity.$$i(short, short, byte):java.lang.String");
    }
}
