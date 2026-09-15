package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentContactBinding;
import com.bpjstku.presentation.contact.ContactFragment$bindingInflater$1;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R.\u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0010\u001a\u00020\u00138\u0015X\u0095D¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"LBaseMenuPresenter;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentContactBinding;", "<init>", "()V", "", "b_", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lkotlin/jvm/functions/Function3;", "b", "", "I", "asBinder", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BaseMenuPresenter extends AutoValue_CameraState_StateError<FragmentContactBinding> {
    private static short[] d;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.fragment_contact;
    private static final byte[] $$c = {68, 104, -93, -37};
    private static final int $$f = 69;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {Base64.padSymbol, -108, 49, -100, 7, -22, 27, -26, -18, 4, -3, -26, 4, -12, 0, 30, -58, -4, -8, -8, 27, -26, -19, -11, 9, -21, -8, -6, -40, 5, -18, 4, -13, -6, 23, -24, -31, 5, 1, -16, -13, 39, -51, 10, -13, -13, 1, -16, -13, 11, -14, -12, 3, -12, -12, 0, 23, -44, 1, -13, 4, -26, 8, -20, 58};
    private static final int $$e = 163;
    private static final byte[] $$a = {43, 23, 22, -14, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 102;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f89a = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1714741107;
    private static int TuitionPaymentFragmentbindingInflater1 = -1934795625;
    private static int b = -1771278919;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {-110, 110, -103, -77, 76, -110, 107, -101, 96, -68, -65, 33, -98, -37, 80, 97, 96, 103, -108, 108, -105, 60, -64, 49, -52, -49, 56, -41, 42, 59, 54, -57, -53, 49, -61, 123, -124, -117, 114, 108, -93, 125, 115, -117, 117, -115, 105, 90, 107, -58, 120, 119, 75, -78, -125, -126, -123, 118, -114, 117, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, 72, -79, 65, -70, 102, 101, -121, -71, 77, -75, 126, -115, -85, 85, -73, -121, 115, -86, 93, 115, -108, -97, 73, -125, -115, 115, ByteCompanionObject.MIN_VALUE, -113, -121, 125, 29, -31, 41, 45, 3, -47, -46, -6, 29, -41, 41, -2, 4, 37, -30, 1, 47, -29, -46, 3, 41, -46, -30, 40, 4, 42, 45, -43, 42, -4, 5, 45, 40, -3, 28, 47, -30, 6, -1, 46, 6, 45, 47, -3, 2, 40, -41, 47, -7, -47, 45, 29, -30, 45, 0, 46, -3, 41, 44, 45, -42, 44, 30, -101, -83, 100, -122, -87, 103, -88, -102, 84, 84, 121, -126, -85, 125, -127, -83, -85, 84, 86, -86, 123, -86, -104, -85, 122, 87, -102, -88, 87, 120, -126, -86, 84, -85, -83, 81, 124, -123, 121, -121, 123, -124, -87, -87, 86, -88, -86, 85, 101, -97, 102, -88, -103, 97, -86, -123, 126, -122, -82, 81, 121, -88, 85, -26, -26, -26, -26, -26, -26, -26, -26};

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = defpackage.BaseMenuPresenter.$$a
            int r8 = r8 * 52
            int r1 = 53 - r8
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2e:
            int r7 = r7 + r6
            int r6 = r7 + (-11)
            int r7 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BaseMenuPresenter.c(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.BaseMenuPresenter.$$d
            int r7 = r7 + 4
            int r8 = r8 * 31
            int r8 = r8 + 84
            int r6 = r6 * 13
            int r1 = r6 + 25
            byte[] r1 = new byte[r1]
            int r6 = r6 + 24
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L31
        L16:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1a:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L31:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-7)
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BaseMenuPresenter.f(short, byte, byte, java.lang.Object[]):void");
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentContactBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f89a + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ContactFragment$bindingInflater$1 contactFragment$bindingInflater$1 = ContactFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = asBinder + 23;
        f89a = i4 % 128;
        int i5 = i4 % 2;
        return contactFragment$bindingInflater$1;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        int i3 = i2 % 128;
        f89a = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i3 + 3;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int scrollBarSize = 2267 - (ViewConfiguration.getScrollBarSize() >> 8);
                int maximumFlingVelocity = 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte length = (byte) $$c.length;
                byte b3 = (byte) (length - 4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, scrollBarSize, maximumFlingVelocity, 1387473586, false, $$g(length, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 111;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 4 / 5;
                }
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                j = 3046761265686732006L;
            } else {
                int i9 = $11 + 83;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr != null) {
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    int i10 = 0;
                    while (i10 < length2) {
                        int i11 = $10 + 27;
                        $11 = i11 % 128;
                        int i12 = i11 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 3357 - Process.getGidForName(""), 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i10++;
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iGreen = 2267 - Color.green(0);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 33;
                        byte length3 = (byte) $$c.length;
                        byte b6 = (byte) (length3 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, iGreen, trimmedLength, 1387473586, false, $$g(length3, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) d[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i13 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ j));
                if (z) {
                    i4 = 1;
                } else {
                    int i14 = $10 + 39;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i13 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(b), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 3;
                    byte b8 = (byte) (b7 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - Color.red(0)), 2855 - View.MeasureSpec.getSize(0), 13 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1529949196, false, $$g(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    for (int i16 = 0; i16 < length4; i16++) {
                        bArr5[i16] = (byte) (((long) bArr4[i16]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                        int i18 = $11 + 43;
                        $10 = i18 % 128;
                        if (i18 % 2 != 0) {
                            int i19 = 3 / 5;
                        }
                    } else {
                        short[] sArr = d;
                        int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    int i21 = $11 + 97;
                    $10 = i21 % 128;
                    if (i21 % 2 != 0) {
                        int i22 = 4 % 4;
                    }
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

    @Override // defpackage.LifecycleCameraRepository
    public final void g() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asBinder + 53;
        f89a = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumDrawingCacheSize = (char) (37567 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 625;
            int packedPositionGroup = 14 - ExpandableListView.getPackedPositionGroup(0L);
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            c((byte) (-b2), bArr[7], (byte) (-b2), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, maximumFlingVelocity, packedPositionGroup, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(Color.green(0) - 448868606, (-91) - TextUtils.indexOf("", "", 0), (short) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (byte) ((-16777092) - Color.rgb(0, 0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 359038059, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((-448868602) - View.combineMeasuredStates(0, 0), (KeyEvent.getMaxKeyCode() >> 16) - 98, (short) View.resolveSize(0, 0), (byte) (34 - (KeyEvent.getMaxKeyCode() >> 16)), View.MeasureSpec.getMode(0) + 359038080, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mode = (char) (37567 - View.MeasureSpec.getMode(0));
            int i4 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 624;
            int iRgb = (-16777202) - Color.rgb(0, 0, 0);
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            c(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, i4, iRgb, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = f89a + 31;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0'));
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 625;
                int i7 = 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b5 = bArr2[7];
                Object[] objArr6 = new Object[1];
                c(b5, (byte) (-bArr2[5]), b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, pressedStateDuration, i7, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i8 = ((int[]) objArr7[2])[0];
            int i9 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int i10 = ~((~((int) Process.getElapsedCpuTime())) | 1310674715);
            int i11 = ((((1074480658 | i10) * (-970)) - 1082045150) + ((i10 | 236194057) * 970)) - 141986160;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[1])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{new int[]{i9}, new int[1], new int[]{i8}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e((-448868606) - (Process.myPid() >> 22), TextUtils.getCapsMode("", 0, 0) - 87, (short) Color.green(0), (byte) ((-98) - View.getDefaultSize(0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 359038093, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e((-448868604) - Drawable.resolveOpacity(0, 0), (-95) - TextUtils.indexOf("", ""), (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), TextUtils.lastIndexOf("", '0', 0, 0) + 359038120, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i14 = f89a + 33;
                    asBinder = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 3 % 3;
                    }
                }
            }
            Object[] objArr10 = new Object[1];
            e((-448868597) - (ViewConfiguration.getTouchSlop() >> 8), (-97) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) ((-91) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 359038136 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(View.resolveSizeAndState(0, 0, 0) - 448868598, (ViewConfiguration.getScrollDefaultDelay() >> 16) - 97, (short) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (byte) (95 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ExpandableListView.getPackedPositionChild(0L) + 359038152, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            e((-448868654) - Process.getGidForName(""), TextUtils.getTrimmedLength("") - 49, (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 53), 359038166 - Color.alpha(0), objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            e((-448868604) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ImageFormat.getBitsPerPixel(0) - 48, (short) (ViewConfiguration.getTapTimeout() >> 16), (byte) (View.MeasureSpec.getSize(0) + 77), 359038228 - MotionEvent.axisFromString(""), objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, -141986160};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[14];
                byte b7 = bArr3[38];
                Object[] objArr15 = new Object[1];
                f(b6, (byte) (-b7), b7, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                Object[] objArr16 = new Object[1];
                f(bArr3[38], bArr3[34], bArr3[14], objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i16 = ((int[]) objArr17[0])[0];
                int i17 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 37567);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 626;
                        int i18 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13;
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[7];
                        Object[] objArr18 = new Object[1];
                        c(b8, (byte) (-bArr4[5]), b8, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSize, iIndexOf, i18, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        e((-448868606) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-91) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) ((-1) - ImageFormat.getBitsPerPixel(0)), (byte) (123 - TextUtils.lastIndexOf("", '0', 0, 0)), 359038059 - Drawable.resolveOpacity(0, 0), objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        e(TextUtils.indexOf("", "", 0, 0) - 448868602, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 99, (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (34 - TextUtils.getOffsetBefore("", 0)), 359038079 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 37568);
                            int i19 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 626;
                            int i20 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14;
                            byte b9 = $$a[7];
                            byte b10 = b9;
                            Object[] objArr21 = new Object[1];
                            c(b9, b10, b10, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, i19, i20, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char capsMode = (char) (37567 - TextUtils.getCapsMode("", 0, 0));
                            int i21 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 625;
                            int iRgb2 = Color.rgb(0, 0, 0) + 16777230;
                            byte[] bArr5 = $$a;
                            byte b11 = bArr5[5];
                            Object[] objArr22 = new Object[1];
                            c((byte) (-b11), bArr5[7], (byte) (-b11), objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(capsMode, i21, iRgb2, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i22 = ((int[]) objArr[0])[0];
        int i23 = ((int[]) objArr[2])[0];
        if (i23 == i22) {
            int i24 = f89a + 61;
            asBinder = i24 % 128;
            int i25 = i24 % 2;
            int i26 = ((int[]) objArr[1])[0];
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr = {i27};
            int iIdentityHashCode = System.identityHashCode(this);
            int i29 = ~((-969569960) | (~iIdentityHashCode));
            int i30 = i26 + ((35749952 | i29 | (~(969569959 | iIdentityHashCode))) * (-338)) + 1022320008 + (((~(iIdentityHashCode | 1005319911)) | i29) * 338);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[1])[0] = i32 ^ (i32 << 5);
            Object[] objArr23 = {new int[]{i28}, new int[1], iArr, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i33 = f89a + 93;
                asBinder = i33 % 128;
                int i34 = i33 % 2;
                for (String str2 : strArr3) {
                    arrayList.add(str2);
                }
            }
            int[] iArr2 = new int[i23];
            int i35 = i23 - 1;
            iArr2[i35] = 1;
            Toast.makeText((Context) null, iArr2[((i23 * i35) % 2) - 1], 1).show();
            int i36 = ((int[]) objArr[1])[0];
            int i37 = ((int[]) objArr[2])[0];
            int i38 = ((int[]) objArr[0])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr3 = {i37};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i39 = i36 + 467239304 + (((~((-624994124) | iIdentityHashCode2)) | 88088841) * 1504) + ((~(iIdentityHashCode2 | (-536905283))) * (-1504)) + 2014868128;
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr[1])[0] = i41 ^ (i41 << 5);
            Object[] objArr24 = {new int[]{i38}, new int[1], iArr3, strArr4};
        }
        asInterface().btnCallCareContactCenter.setOnClickListener(new collapseItemActionView(this));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseMenuPresenter baseMenuPresenter, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            FragmentActivity activity = baseMenuPresenter.getActivity();
            Intrinsics.checkNotNull(activity, "");
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_call_care_contact_center", "call_care_contact_center"));
            Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
            Intrinsics.checkNotNullParameter("call_care_contact_center", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("call_care_contact_center", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("call_care_contact_center", mapMutableMapOf);
            baseMenuPresenter.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:175")));
            ViewPortBuilder.b();
            int i2 = asBinder + 39;
            f89a = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 0 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        f89a = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
        int i = 2 % 2;
        int i2 = f89a + 103;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        f89a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        int i = 2 % 2;
        int i2 = f89a + 95;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        f89a = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r0 = defpackage.BaseMenuPresenter.$$c
            int r8 = r8 * 3
            int r1 = r8 + 1
            int r6 = 121 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BaseMenuPresenter.$$g(byte, byte, short):java.lang.String");
    }
}
