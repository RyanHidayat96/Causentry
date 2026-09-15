package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentJpnSimulationResultBinding;
import com.bpjstku.domain.simulation.model.Periodic;
import com.bpjstku.presentation.program.jpn.JpnPeriodicFragment$bindingInflater$1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R\u001a\u0010\r\u001a\u00020\f8\u0015X\u0095D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R.\u0010\u0017\u001a\u001c\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00118UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0019\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d"}, d2 = {"LfindLowestQualityProfiles;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentJpnSimulationResultBinding;", "<init>", "()V", "", "cancelAll", "b_", "onTransact", "g", "cancel", "INotificationSideChannel", "", "b", "I", "asBinder", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lkotlin/jvm/functions/Function3;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/simulation/model/Periodic;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/domain/simulation/model/Periodic;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LonCameraPendingOpen;", "Lkotlin/Lazy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class findLowestQualityProfiles extends AutoValue_CameraState_StateError<FragmentJpnSimulationResultBinding> {
    private static int INotificationSideChannel;
    private static char TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f901a;
    private static char asBinder;
    private static char asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private Periodic TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {102, -96, -78, -55};
    private static final int $$f = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {113, 29, -123, -97, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -55, 2, -20, 18, 50, -68, -5, 15, -17, 15, -5, -6, 6, 56, -69, 12, -9, -3, -6, 14, 54, -36, -37, 15, -17, 15, -5, -6, 6, 37, -48, 6};
    private static final int $$e = 189;
    private static final byte[] $$a = {117, 57, 101, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 180;
    private static int cancel = 1;
    private static int d = 0;
    private static int onTransact = 1;
    private final int b = R.layout.fragment_jpn_simulation_result;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: Camera2EncoderProfilesProviderApi31Impl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return findLowestQualityProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r0 = r6 + 38
            int r8 = r8 * 52
            int r8 = 108 - r8
            byte[] r1 = defpackage.findLowestQualityProfiles.$$a
            int r7 = r7 * 2
            int r7 = 84 - r7
            byte[] r0 = new byte[r0]
            int r6 = r6 + 37
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r7 = r8
            r3 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L31:
            int r8 = r8 + 1
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.findLowestQualityProfiles.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 43
            int r0 = 44 - r6
            int r7 = 99 - r7
            int r5 = r5 * 43
            int r5 = 47 - r5
            byte[] r1 = defpackage.findLowestQualityProfiles.$$d
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = -1
            if (r1 != 0) goto L17
            r7 = r5
            r4 = r6
            r3 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L28:
            r4 = r1[r5]
        L2a:
            int r4 = -r4
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.findLowestQualityProfiles.f(short, int, int, java.lang.Object[]):void");
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i6 = $10 + 1;
            $11 = i6 % 128;
            if (i6 % i4 == 0) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 % 0];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            int i7 = 58224;
            while (i2 < 16) {
                int i8 = $11 + 57;
                $10 = i8 % 128;
                int i9 = i8 % i4;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i10 = i7;
                int i11 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) asInterface) ^ 8611973335120459638L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asBinder);
                    objArr2[i4] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 47773);
                        int maximumDrawingCacheSize = 468 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iGreen = Color.green(0) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i4] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, maximumDrawingCacheSize, iGreen, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    onCaptureSessionEnd oncapturesessionend2 = oncapturesessionend;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f901a)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), View.combineMeasuredStates(0, 0) + 468, 13 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 = i10 - 40503;
                    i2++;
                    int i13 = $10 + 125;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    oncapturesessionend = oncapturesessionend2;
                    i4 = 2;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            onCaptureSessionEnd oncapturesessionend3 = oncapturesessionend;
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend3, oncapturesessionend3};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int iIndexOf = TextUtils.indexOf("", "", 0) + 2323;
                int pressedStateDuration = 44 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte b = (byte) 0;
                byte b2 = b;
                String str$$g = $$g(b, b2, b2);
                i3 = 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter, iIndexOf, pressedStateDuration, -1312321721, false, str$$g, new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            oncapturesessionend = oncapturesessionend3;
            i4 = i3;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getA() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cNormalizeMetaState = (char) (43042 - KeyEvent.normalizeMetaState(0));
            int i2 = 3111 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 22;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[5], bArr[7], bArr[40], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, i2, maxKeyCode, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{26869, 54817, 35072, 61866, 59652, 42569, 4478, 16540, 488, 32938, 65167, 23074, 23907, 27744, 5999, 29743, 43085, 50864, 34087, 31599, 19880, 52755, 17654, 3084}, (-16777194) - Color.rgb(0, 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{10915, 37595, 55489, 26792, 18997, 5995, 18995, 23217, 47883, 24672, 1740, 44429, 33717, 23312, 63471, 26882, 19432, 9959}, 15 - TextUtils.indexOf("", "", 0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) (43042 - (ViewConfiguration.getTouchSlop() >> 8));
            int iMakeMeasureSpec = 3111 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int i3 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b = bArr2[5];
            Object[] objArr5 = new Object[1];
            c(b, bArr2[7], b, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, iMakeMeasureSpec, i3, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = d + 75;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (43042 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int defaultSize = View.getDefaultSize(0, 0) + 3111;
                int i6 = 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b2, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, defaultSize, i6, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int i9 = ~((int) SystemClock.elapsedRealtime());
            int i10 = ((740022530 + (((-1377125633) | i9) * 184)) + (((~(i9 | 231389730)) | (-1511999267)) * 184)) - 1957248636;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
            objArr = new Object[]{new int[1], new int[]{i8}, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{64928, 17151, 39863, 5511, 16447, 8290, 13955, 2063, 8861, 1549, 28767, 44338, 35008, 28838, 46692, 52395, 32302, 56910}, 16 - TextUtils.getOffsetBefore("", 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{59828, 9812, 37212, 43230, 63291, 21317, 57625, 46378, 62672, 59196, 35355, 41793, 55185, 61171, 55306, 34305, 41624, 65036}, 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, -1957248636};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[5];
                byte b5 = (byte) (b4 - 1);
                Object[] objArr11 = new Object[1];
                f(b4, b5, b5, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b6 = bArr3[5];
                byte b7 = (byte) (b6 - 1);
                byte b8 = b6;
                Object[] objArr12 = new Object[1];
                f(b7, b8, b8, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cArgb = (char) (Color.argb(0, 0, 0, 0) + 43042);
                    int mode = 3111 - View.MeasureSpec.getMode(0);
                    int i13 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
                    byte b9 = $$a[7];
                    byte b10 = b9;
                    Object[] objArr14 = new Object[1];
                    c(b9, b10, b10, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, mode, i13, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{26869, 54817, 35072, 61866, 59652, 42569, 4478, 16540, 488, 32938, 65167, 23074, 23907, 27744, 5999, 29743, 43085, 50864, 34087, 31599, 19880, 52755, 17654, 3084}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{10915, 37595, 55489, 26792, 18997, 5995, 18995, 23217, 47883, 24672, 1740, 44429, 33717, 23312, 63471, 26882, 19432, 9959}, TextUtils.lastIndexOf("", '0', 0, 0) + 16, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char modifierMetaStateMask = (char) (43041 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int iRgb = (-16774105) - Color.rgb(0, 0, 0);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 22;
                        byte[] bArr4 = $$a;
                        byte b11 = bArr4[5];
                        Object[] objArr17 = new Object[1];
                        c(b11, bArr4[7], b11, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(modifierMetaStateMask, iRgb, absoluteGravity, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (43043 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int i14 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3111;
                        int size = View.MeasureSpec.getSize(0) + 22;
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        c(bArr5[5], bArr5[7], bArr5[40], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i14, size, -1272852037, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 == i15) {
            int i17 = ((int[]) objArr[0])[0];
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i18};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i20 = i17 + 176979026 + (((~(425535023 | startElapsedRealtime)) | (-1566553856) | (~(1279496435 | startElapsedRealtime))) * (-744)) + (((~startElapsedRealtime) | 138477603) * 744) + ((startElapsedRealtime | 1566553855) * 744);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr[0])[0] = i22 ^ (i22 << 5);
            Object[] objArr19 = {new int[1], new int[]{i19}, iArr2, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i23 = onTransact + 111;
                d = i23 % 128;
                int i24 = i23 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            int i25 = ((int[]) objArr[0])[0];
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr3 = {i26};
            int i28 = ~System.identityHashCode(this);
            int i29 = i25 + 426838298 + (((~(1434433018 | i28)) | 270598440) * (-828)) + ((i28 | 1434433018) * (-828)) + 1995401260;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr[0])[0] = i31 ^ (i31 << 5);
            Object[] objArr20 = {new int[1], new int[]{i27}, iArr3, strArr4};
        }
        return this.b;
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentJpnSimulationResultBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        d = i2 % 128;
        int i3 = i2 % 2;
        JpnPeriodicFragment$bindingInflater$1 jpnPeriodicFragment$bindingInflater$1 = JpnPeriodicFragment$bindingInflater$1.b;
        int i4 = d + 15;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return jpnPeriodicFragment$bindingInflater$1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        int i = 2 % 2;
        int i2 = d + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arguments != null ? (Periodic) arguments.getParcelable("jpn_periodic") : null;
        int i4 = d + 125;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        int i = 2 % 2;
        RecyclerView recyclerView = asInterface().rvJpnSimulationResult;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.addItemDecoration(new setCameraOperatingMode(24, 24));
        recyclerView.setAdapter((onCameraPendingOpen) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i2 = onTransact + 111;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        int i = 2 % 2;
        int i2 = d + 81;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Periodic periodic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (periodic != null) {
            int i4 = i3 + 117;
            d = i4 % 128;
            int i5 = i4 % 2;
            ((onCameraPendingOpen) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(periodic.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = d + 113;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 5;
            }
        }
    }

    public static /* synthetic */ onCameraPendingOpen TuitionPaymentFragmentspecialinlinedviewModeldefault2(findLowestQualityProfiles findlowestqualityprofiles) {
        int i = 2 % 2;
        Context contextRequireContext = findlowestqualityprofiles.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Object obj = null;
        onCameraPendingOpen oncamerapendingopen = new onCameraPendingOpen(contextRequireContext, null, 2, null);
        int i2 = onTransact + 35;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return oncamerapendingopen;
        }
        obj.hashCode();
        throw null;
    }

    static {
        INotificationSideChannel = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        int i = cancel + 77;
        INotificationSideChannel = i % 128;
        int i2 = i % 2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        int i = 2 % 2;
        int i2 = d + 69;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 = (char) 36422;
        f901a = (char) 13398;
        asInterface = (char) 2369;
        asBinder = (char) 30303;
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
    private static java.lang.String $$g(int r5, byte r6, short r7) {
        /*
            byte[] r0 = defpackage.findLowestQualityProfiles.$$c
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r5 = r5 * 4
            int r5 = r5 + 108
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
        L28:
            int r5 = r5 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.findLowestQualityProfiles.$$g(int, byte, short):java.lang.String");
    }
}
