package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentScholarBenefitStep1Binding;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.scholarship.benefit.ScholarBenefitActivity;
import com.bpjstku.presentation.scholarship.benefit.fragment.ScholarBenefitStep1Fragment$bindingInflater$1;
import com.google.android.material.button.MaterialButton;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u000b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR.\u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u000f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"LisRawSupported;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentScholarBenefitStep1Binding;", "<init>", "()V", "", "g", "cancelAll", "INotificationSideChannel", "cancel", "onTransact", "", "asBinder", "()I", "b", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lkotlin/jvm/functions/Function3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class isRawSupported extends AutoValue_CameraState_StateError<FragmentScholarBenefitStep1Binding> {
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {68, -119, -76, 97};
    private static final int $$f = 58;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {109, 48, -62, 38, -6, 17, -6, 7, 2, 19, 4, -23, 24, 19, 7, -4, 13, -61, 52, 18, -5, 19, 2, -1, 0, 25, -16, 3, 17, -3, 18, -12, 7, 17, 8, -8, 9, 9, -7, 11, 3, 3, 3, 20, 9, 6, 2, -8, -12, 18, 15, -1, -16, 30, -1, 22, 6, 2, -8, -14, 24, 17, 9, -11, 19, 6, 38, -7, 16, -6, 11, 4, -25, 22, 29, -7, -3, 14, 11, -41, 49, -12, 11, 11, -3, 14, 11, -13, 12, 10, -5, 10, 10, -2, -25, 42, -3, 11, -6, 24, -10, 18, -60, 17, 3, -58, 62, 13, 5, -3, 10, -2, -50, 56, 18, -5, 19, 2, -1, 0, -49, 68, -7, 24, -10, 18, -4, -3, 16, -57, 58, 17, 2, 8, 8, -63, 76, 4, -6, 8, 2, 16, -6, 1, 19, -64, 40, 41, -15, 18, 11, -6, 22, -16, 18, -22, 35, -76, 36, 52, -8, 1, 24, -10, -30, 50, 14, -14, 19, -28, 24, 19, 7, -4, 13};
    private static final int $$e = 35;
    private static final byte[] $$a = {64, 73, -26, 82, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 89;
    private static int asInterface = 0;
    private static int d = 1;
    private static int b = 739938458;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795646;
    private static int TuitionPaymentFragmentbindingInflater1 = -653137478;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {24, 28, -31, -5, 58, 24, 19, -29, 22, -54, -49, 73, -20, -93, 38, 9, 22, 23, -30, 26, -25, 116, -80, 97, -124, -125, 104, -117, 102, 119, 106, -69, -121, 97, -65, -99, 50, 98, 43, 79, 78, 44, 42, 102, 62, 119, 38, 56, -98, 60, -106, 98, -85, 124, 98, -123, -66, 72, -110, -116, 98, -111, -114, -106, -100, 18, 33, 34, 27, 57, 74, 8, 26, 34, 16, 88, 4, -13, 2, 111, 21, 30, -30, 91, 42, 43, 32, 31, 39, 16, -34, -105, -40, -126, -33, -37, -48, -47, -107, 110, -64, -105, -116, -94, -107, -48, -125, -26, -26, -26, -26, -26, -26};

    static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentbindingInflater1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i4) | i7);
        int i9 = ~i;
        int i10 = i8 | (~(i9 | i4)) | (~(i3 | i4));
        int i11 = i7 | i4;
        int i12 = i9 | i11;
        int i13 = i3 + i4 + i6 + ((-1542968645) * i2) + (1789173782 * i5);
        int i14 = i13 * i13;
        int i15 = (1553370224 * i3) + 752877568 + ((-368479342) * i4) + (i10 * 1186558865) + (1921849566 * i11) + (1186558865 * i12) + ((-1555038208) * i6) + (1802502144 * i2) + (148897792 * i5) + (289275904 * i14);
        int i16 = (i3 * (-930071408)) + 1959937684 + (i4 * (-930070194)) + (i10 * TypedValues.MotionType.TYPE_PATHMOTION_ARC) + (i11 * (-1214)) + (i12 * TypedValues.MotionType.TYPE_PATHMOTION_ARC) + (i6 * (-930070801)) + (i2 * 1059663509) + (i5 * (-1428764534)) + (i14 * 484573184);
        if (i15 + (i16 * i16 * 411172864) != 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        int i17 = 2 % 2;
        int i18 = asInterface + 5;
        d = i18 % 128;
        int i19 = i18 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = 144 - r6
            byte[] r0 = defpackage.isRawSupported.$$a
            int r5 = r5 * 14
            int r5 = r5 + 84
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r5
            r5 = r7
            r4 = r2
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            int r6 = r6 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r0[r6]
        L27:
            int r5 = r5 + r3
            int r5 = r5 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isRawSupported.a(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 1
            int r7 = 108 - r7
            int r6 = 174 - r6
            byte[] r1 = defpackage.isRawSupported.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r4 = r7
            r3 = r2
            r7 = r6
            goto L28
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
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
            r6 = r5
        L28:
            int r6 = r6 + r4
            int r6 = r6 + (-5)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isRawSupported.e(short, byte, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        d = i2 % 128;
        int i3 = i2 % 2;
        ScholarBenefitStep1Fragment$bindingInflater$1 scholarBenefitStep1Fragment$bindingInflater$1 = ScholarBenefitStep1Fragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = asInterface + 15;
        d = i4 % 128;
        int i5 = i4 % 2;
        return scholarBenefitStep1Fragment$bindingInflater$1;
    }

    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.getDefaultSize(0, 0), 2267 - ExpandableListView.getPackedPositionGroup(0L), 33 - (ViewConfiguration.getScrollBarSize() >> 8), 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                            int iRgb = (-16773858) - Color.rgb(0, 0, 0);
                            int iMakeMeasureSpec = 18 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            byte length2 = (byte) $$c.length;
                            byte b5 = (byte) (length2 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, iRgb, iMakeMeasureSpec, -1054011043, false, $$g(length2, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 2267, 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1387473586, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i7 = $11 + 55;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L)) + i5;
                try {
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 1;
                        byte b9 = (byte) (b8 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 55904), 2855 - TextUtils.getOffsetBefore("", 0), TextUtils.lastIndexOf("", '0') + 14, -1529949196, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (bArr4 != null) {
                        int length3 = bArr4.length;
                        byte[] bArr5 = new byte[length3];
                        int i9 = 0;
                        while (i9 < length3) {
                            int i10 = $11 + 29;
                            $10 = i10 % 128;
                            if (i10 % 2 != 0) {
                                bArr5[i9] = (byte) (((long) bArr4[i9]) % 3046761265686732006L);
                            } else {
                                bArr5[i9] = (byte) (((long) bArr4[i9]) ^ 3046761265686732006L);
                                i9++;
                            }
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i11 = $10 + 53;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (z) {
                            byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i13 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i13 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i13]) ^ 3046761265686732006L)) + s)) ^ b2));
                            int i14 = $11 + 83;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                        } else {
                            short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                            int i17 = $10 + 11;
                            $11 = i17 % 128;
                            int i18 = i17 % 2;
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x085f  */
    @Override // defpackage.LifecycleCameraRepository
    public final void g() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i = 2 % 2;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "");
        final generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist = (generateUltraHdrSupportedCombinationList) ((ScholarBenefitActivity) fragmentActivityRequireActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43042);
            int iBlue = 3111 - Color.blue(0);
            int i2 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            a(b2, (short) (b2 | 141), (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iBlue, i2, -1272852037, false, (String) objArr5[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr6 = new Object[1];
        c((-1438430460) - TextUtils.lastIndexOf("", '0', 0), (-78) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (TextUtils.indexOf("", "", 0, 0) + 3), (byte) (9 - Drawable.resolveOpacity(0, 0)), ExpandableListView.getPackedPositionType(0L) + 1598567300, objArr6);
        Class<?> cls = Class.forName((String) objArr6[0]);
        Object[] objArr7 = new Object[1];
        c(Color.alpha(0) - 1438430455, MotionEvent.axisFromString("") - 84, (short) (10 - (ViewConfiguration.getScrollBarSize() >> 8)), (byte) (100 - Gravity.getAbsoluteGravity(0, 0)), 1598567321 - KeyEvent.normalizeMetaState(0), objArr7);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr7[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43042);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 3111;
            int deadChar = KeyEvent.getDeadChar(0, 0) + 22;
            Object[] objArr8 = new Object[1];
            a($$a[7], (short) $$b, (byte) 52, objArr8);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, maxKeyCode, deadChar, -1269618118, false, (String) objArr8[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43042);
                int packedPositionType = 3111 - ExpandableListView.getPackedPositionType(0L);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 23;
                byte b3 = $$a[7];
                short s = (short) (b3 | 37);
                Object[] objArr9 = new Object[1];
                a(b3, s, (byte) s, objArr9);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatDelay, packedPositionType, iLastIndexOf, 154975793, false, (String) objArr9[0], null);
            }
            Object[] objArr10 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr10[2])[0];
            int i4 = ((int[]) objArr10[1])[0];
            String[] strArr = (String[]) objArr10[3];
            int[] iArr = {i3};
            int iNextInt = new Random().nextInt(2020009915);
            int i5 = ~iNextInt;
            int i6 = (-501573702) + (((~(iNextInt | 1121385902)) | (~((-46184741) | i5)) | (-1658846719)) * (-68)) + ((~((-537460817) | i5)) * (-68)) + (((~((-1121385903) | i5)) | (-583645557)) * 68) + 246570374;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            objArr = new Object[]{new int[1], new int[]{i4}, iArr, strArr};
        } else {
            Object[] objArr11 = new Object[1];
            c((-1438430451) - TextUtils.indexOf((CharSequence) "", '0', 0), (-84) - View.resolveSizeAndState(0, 0, 0), (short) (84 - ImageFormat.getBitsPerPixel(0)), (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 41), ExpandableListView.getPackedPositionType(0L) + 1598567335, objArr11);
            Class<?> cls2 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(TextUtils.getCapsMode("", 0, 0) - 1438430451, TextUtils.getOffsetAfter("", 0) - 84, (short) (TextUtils.indexOf("", "", 0) - 120), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 7), 1598567349 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr12);
            try {
                Object[] objArr13 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, 246570374};
                int i9 = $$e;
                byte[] bArr = $$d;
                Object[] objArr14 = new Object[1];
                e((short) (i9 | 136), bArr[24], bArr[106], objArr14);
                Class<?> cls3 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                e(bArr[0], bArr[12], (byte) (i9 + 2), objArr15);
                Object[] objArr16 = (Object[]) cls3.getMethod((String) objArr15[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char windowTouchSlop = (char) (43042 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int gidForName = 3110 - Process.getGidForName("");
                    int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                    byte b4 = $$a[7];
                    short s2 = (short) (b4 | 37);
                    Object[] objArr17 = new Object[1];
                    a(b4, s2, (byte) s2, objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, gidForName, i10, 154975793, false, (String) objArr17[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                try {
                    Object[] objArr18 = new Object[1];
                    c((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1438430460, (-78) - View.resolveSize(0, 0), (short) (3 - TextUtils.indexOf("", "")), (byte) (9 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1598567301, objArr18);
                    Class<?> cls4 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    c((-1438430456) - TextUtils.lastIndexOf("", '0'), (-86) - TextUtils.indexOf((CharSequence) "", '0'), (short) (Color.red(0) + 10), (byte) (100 - (ViewConfiguration.getWindowTouchSlop() >> 8)), Color.green(0) + 1598567321, objArr19);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char size = (char) (43042 - View.MeasureSpec.getSize(0));
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 3111;
                        int iAxisFromString = 21 - MotionEvent.axisFromString("");
                        Object[] objArr20 = new Object[1];
                        a($$a[7], (short) $$b, (byte) 52, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(size, capsMode, iAxisFromString, -1269618118, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43041);
                        int iMyTid = (Process.myTid() >> 22) + 3111;
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22;
                        byte b5 = $$a[7];
                        Object[] objArr21 = new Object[1];
                        a(b5, (short) (b5 | 141), (byte) 52, objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, iMyTid, scrollBarFadeDuration, -1272852037, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr16;
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr[0])[0];
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i14};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i16 = i13 + (((1470212582 + (((~((~iMaxMemory) | (-1581025469))) | 103024676) * 446)) + (((~(iMaxMemory | (-1478000793))) | 20981314) * 446)) - 1295634760);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr2[0])[0] = i18 ^ (i18 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i15}, iArr2, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i19 = d + 55;
                asInterface = i19 % 128;
                int i20 = 2;
                int i21 = i19 % 2;
                int i22 = 0;
                while (i22 < strArr3.length) {
                    int i23 = d + 35;
                    asInterface = i23 % 128;
                    if (i23 % i20 != 0) {
                        arrayList.add(strArr3[i22]);
                        i22 += 102;
                    } else {
                        arrayList.add(strArr3[i22]);
                        i22++;
                    }
                    i20 = 2;
                }
            }
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            int i24 = ((int[]) objArr[0])[0];
            int i25 = ((int[]) objArr[2])[0];
            int i26 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr3 = {i25};
            int iIdentityHashCode = System.identityHashCode(this);
            int i27 = ~iIdentityHashCode;
            int i28 = i24 + (-1578892992) + (((~((-32047249) | i27)) | (~((-1672984211) | iIdentityHashCode))) * 217) + (((~(iIdentityHashCode | (-32047249))) | 27328656) * 217) + (((~((-1672984211) | i27)) | 32047248) * 217);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[0])[0] = i30 ^ (i30 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i26}, iArr3, strArr4};
            int i31 = asInterface + 49;
            d = i31 % 128;
            int i32 = i31 % 2;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 31533);
            int pressedStateDuration = 921 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int offsetBefore = 28 - TextUtils.getOffsetBefore("", 0);
            byte[] bArr2 = $$a;
            byte b6 = bArr2[132];
            short s3 = bArr2[7];
            Object[] objArr22 = new Object[1];
            a(b6, s3, (byte) s3, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveSizeAndState, pressedStateDuration, offsetBefore, -1048449946, false, (String) objArr22[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr23 = new Object[1];
        c((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1438430459, Color.green(0) - 78, (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 10), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1598567300, objArr23);
        Class<?> cls5 = Class.forName((String) objArr23[0]);
        Object[] objArr24 = new Object[1];
        c((-1438430456) - TextUtils.indexOf((CharSequence) "", '0'), (-85) - TextUtils.getCapsMode("", 0, 0), (short) (10 - Color.green(0)), (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 100), 1598567321 - (ViewConfiguration.getScrollBarSize() >> 8), objArr24);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char defaultSize = (char) (31533 - View.getDefaultSize(0, 0));
            int i33 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 920;
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
            Object[] objArr25 = new Object[1];
            a($$a[7], (short) $$b, (byte) 52, objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(defaultSize, i33, longPressTimeout, -778300370, false, (String) objArr25[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i34 = d + 75;
            asInterface = i34 % 128;
            int i35 = i34 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c4 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31533);
                int iResolveSize = 921 - View.resolveSize(0, 0);
                int iMyPid = 28 - (Process.myPid() >> 22);
                byte b7 = $$a[7];
                short s4 = (short) (b7 | 37);
                Object[] objArr26 = new Object[1];
                a(b7, s4, (byte) s4, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c4, iResolveSize, iMyPid, -1142834547, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr3 = new Object[]{new int[1], new int[]{((int[]) objArr27[1])[0]}, (Object[]) objArr27[2], new int[]{((int[]) objArr27[3])[0]}, (String[]) objArr27[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i36 = ~((-933176309) | startElapsedRealtime);
            int i37 = ~startElapsedRealtime;
            int i38 = i36 | (~(840903335 | i37));
            int i39 = ~(933176308 | i37);
            int i40 = 2142293455 + ((i38 | i39) * (-516)) + (((~(startElapsedRealtime | (-840901285))) | (~(i37 | (-2052)))) * 516) + ((2051 | i39) * 516) + 660372265;
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr3[0])[0] = i42 ^ (i42 << 5);
        } else {
            Object[] objArr28 = new Object[1];
            c((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1438430459, (-74) - (ViewConfiguration.getLongPressTimeout() >> 16), (short) (34 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (byte) (22 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1598567365, objArr28);
            Class<?> cls6 = Class.forName((String) objArr28[0]);
            Object[] objArr29 = new Object[1];
            c((-1438430457) - View.resolveSize(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) - 82, (short) ((-86) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) (29 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1598567390, objArr29);
            Context applicationContext = (Context) cls6.getMethod((String) objArr29[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i43 = asInterface + 3;
                    d = i43 % 128;
                    int i44 = i43 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                }
            }
            Object[] objArr30 = new Object[1];
            c((-1438430449) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 85, (short) (Color.red(0) + 85), (byte) (TextUtils.lastIndexOf("", '0', 0) - 39), 1598567334 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr30);
            Class<?> cls7 = Class.forName((String) objArr30[0]);
            Object[] objArr31 = new Object[1];
            c((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1438430450, ExpandableListView.getPackedPositionGroup(0L) - 84, (short) ((-119) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 7), KeyEvent.keyCodeFromString("") + 1598567350, objArr31);
            Object[] objArr32 = {applicationContext, Integer.valueOf(((Integer) cls7.getMethod((String) objArr31[0], Object.class).invoke(null, this)).intValue()), 0, 660372265};
            byte[] bArr3 = $$d;
            Object[] objArr33 = new Object[1];
            e((short) 72, bArr3[36], (byte) 72, objArr33);
            Class<?> cls8 = Class.forName((String) objArr33[0]);
            byte b8 = bArr3[24];
            Object[] objArr34 = new Object[1];
            e(b8, bArr3[89], b8, objArr34);
            objArr3 = (Object[]) cls8.getMethod((String) objArr34[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr32);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c5 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31532);
                int i45 = 921 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int deadChar2 = 28 - KeyEvent.getDeadChar(0, 0);
                byte b9 = $$a[7];
                short s5 = (short) (b9 | 37);
                Object[] objArr35 = new Object[1];
                a(b9, s5, (byte) s5, objArr35);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c5, i45, deadChar2, -1142834547, false, (String) objArr35[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr3);
            try {
                Object[] objArr36 = new Object[1];
                c((Process.myPid() >> 22) - 1438430459, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 79, (short) (3 - TextUtils.getTrimmedLength("")), (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 9), TextUtils.lastIndexOf("", '0', 0, 0) + 1598567301, objArr36);
                Class<?> cls9 = Class.forName((String) objArr36[0]);
                Object[] objArr37 = new Object[1];
                c((-1438430455) - View.combineMeasuredStates(0, 0), Color.argb(0, 0, 0, 0) - 85, (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 10), (byte) (101 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1598567320, objArr37);
                long jLongValue4 = ((Long) cls9.getDeclaredMethod((String) objArr37[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 31533);
                    int i46 = 921 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int iIndexOf = 28 - TextUtils.indexOf("", "");
                    Object[] objArr38 = new Object[1];
                    a($$a[7], (short) $$b, (byte) 52, objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(threadPriority, i46, iIndexOf, -778300370, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 921;
                    int iMyTid2 = (Process.myTid() >> 22) + 28;
                    byte[] bArr4 = $$a;
                    byte b10 = bArr4[132];
                    short s6 = bArr4[7];
                    Object[] objArr39 = new Object[1];
                    a(b10, s6, (byte) s6, objArr39);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf, iResolveOpacity, iMyTid2, -1048449946, false, (String) objArr39[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i47 = ((int[]) objArr3[1])[0];
        int i48 = ((int[]) objArr3[3])[0];
        if (i48 == i47) {
            int i49 = ((int[]) objArr3[0])[0];
            objArr4 = new Object[]{new int[1], new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[]{((int[]) objArr3[3])[0]}, (String[]) objArr3[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i50 = ~((-953847368) | (~iIdentityHashCode2));
            int i51 = i49 + ((((2179088 | i50) | (~(953847367 | iIdentityHashCode2))) * (-338)) - 1784355909) + (((~(iIdentityHashCode2 | 956026455)) | i50) * 338);
            int i52 = (i51 << 13) ^ i51;
            int i53 = i52 ^ (i52 >>> 17);
            ((int[]) objArr4[0])[0] = i53 ^ (i53 << 5);
            int i54 = asInterface + 81;
            d = i54 % 128;
            if (i54 % 2 == 0) {
                int i55 = 5 % 4;
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr3[4];
            if (strArr5 != null) {
                for (String str : strArr5) {
                    arrayList2.add(str);
                }
            }
            int[] iArr4 = new int[i48];
            int i56 = i48 - 1;
            iArr4[i56] = 1;
            Toast.makeText((Context) null, iArr4[((i48 * i56) % 2) - 1], 1).show();
            int i57 = ((int[]) objArr3[0])[0];
            objArr4 = new Object[]{new int[1], new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[]{((int[]) objArr3[3])[0]}, (String[]) objArr3[4]};
            int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
            int i58 = ~iMaxMemory2;
            int i59 = i57 + (-1992129140) + (((~((-214990009) | i58)) | (~((-1559089636) | i58))) * (-867)) + (((~((-214990009) | iMaxMemory2)) | 213930144 | (~((-1559089636) | iMaxMemory2))) * (-1734)) + (((~(iMaxMemory2 | (-1345159492))) | (~(i58 | (-213930145))) | (~((-1059865) | iMaxMemory2))) * 867);
            int i60 = (i59 << 13) ^ i59;
            int i61 = i60 ^ (i60 >>> 17);
            ((int[]) objArr4[0])[0] = i61 ^ (i61 << 5);
        }
        MaterialButton materialButton = asInterface().fragScholarStep1Next;
        int i62 = ((int[]) objArr2[0])[0];
        int i63 = ((((i62 * i62) - (~(-(407308673 * i62)))) - 1) - (~(-(i62 * (-1348017789))))) - (-1296700931);
        int i64 = (((i63 >> 16) - 131071) / 65536) + 1;
        int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
        int i66 = i63 >> 18;
        int i67 = (((i66 | (-32767)) << 1) - (i66 ^ (-32767))) / 16384;
        int i68 = (-(((i67 & 1) + (i67 | 1)) ^ i65)) + 3;
        int i69 = ((i68 >> 21) - 4095) / 2048;
        int i70 = ((i69 | 1) << 1) - (i69 ^ 1);
        int i71 = 471195 / ((i68 & (-((i70 & 1) + (i70 | 1)))) * 849);
        int i72 = ((int[]) objArr4[0])[0];
        int i73 = i72 * i72;
        int i74 = -(2101824926 * i72);
        int i75 = (i73 & i74) + (i73 | i74);
        int i76 = -(i72 * 786452584);
        int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
        int i78 = ((i77 | 1708644873) << 1) - (1708644873 ^ i77);
        int i79 = i78 >> 20;
        int i80 = ((i79 & (-8191)) + (i79 | (-8191))) / 4096;
        int i81 = (i80 & 1) + (i80 | 1);
        int i82 = (i78 ^ i81) + ((i81 & i78) << 1);
        int i83 = ((i78 >> 24) - 511) / 256;
        int i84 = -(i82 ^ ((i83 ^ 1) + ((i83 & 1) << 1)));
        int i85 = (i84 & 9) + (i84 | 9);
        int i86 = i85 >> 18;
        int i87 = ((i86 ^ (-32767)) + ((i86 & (-32767)) << 1)) / 16384;
        int i88 = (i87 ^ 1) + ((i87 & 1) << 1);
        Intrinsics.checkNotNullExpressionValue(materialButton, "10|fragScholarStep1Next".substring(i71 + ((-1823094) / (((-(((i88 | 1) << 1) - (i88 ^ 1))) & i85) * 1113))));
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: SupportedSurfaceCombinationFeatureSettings
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isRawSupported.TuitionPaymentFragmentspecialinlinedviewModeldefault1(generateultrahdrsupportedcombinationlist, (View) obj);
            }
        }));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        int i = 2 % 2;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "");
        final ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = (ActivityResultContractsPickVisualMediaMediaCapabilities) ((ScholarBenefitActivity) fragmentActivityRequireActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity2, "");
        generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist = (generateUltraHdrSupportedCombinationList) ((ScholarBenefitActivity) fragmentActivityRequireActivity2).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        final FragmentScholarBenefitStep1Binding fragmentScholarBenefitStep1BindingAsInterface = asInterface();
        generateultrahdrsupportedcombinationlist.asBinder.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: SupportedSurfaceCombinationApi23Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isRawSupported.TuitionPaymentFragmentspecialinlinedviewModeldefault1(fragmentScholarBenefitStep1BindingAsInterface, activityResultContractsPickVisualMediaMediaCapabilities, (ScholarPersonDetail) obj);
            }
        }));
        int i2 = asInterface + 35;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(FragmentScholarBenefitStep1Binding fragmentScholarBenefitStep1Binding, ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, final ScholarPersonDetail scholarPersonDetail) {
        String str;
        String upperCase;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2;
        String str3;
        int i = 2 % 2;
        TextView textView = fragmentScholarBenefitStep1Binding.fragScholarNikpeserta;
        String str4 = scholarPersonDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        textView.setText(str4 != null ? str4 : "-");
        TextView textView2 = fragmentScholarBenefitStep1Binding.fragScholarNamapeserta;
        String str5 = scholarPersonDetail.b;
        textView2.setText(str5 != null ? str5 : "-");
        TextView textView3 = fragmentScholarBenefitStep1Binding.fragScholarKpjpeserta;
        String str6 = scholarPersonDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str7 = null;
        if (str6 != null) {
            int i2 = d + 67;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            str = str6;
        }
        textView3.setText(str);
        fragmentScholarBenefitStep1Binding.fragScholarNik.setText(scholarPersonDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        fragmentScholarBenefitStep1Binding.fragScholarName.setText(scholarPersonDetail.TuitionPaymentFragmentbindingInflater1);
        fragmentScholarBenefitStep1Binding.fragScholarStatuspenerima.setText((CharSequence) new Function1() { // from class: getHighResolutionOutputSizes
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isRawSupported.TuitionPaymentFragmentspecialinlinedviewModeldefault3(scholarPersonDetail, (String) obj);
            }
        }.invoke(scholarPersonDetail.getSessionToken));
        fragmentScholarBenefitStep1Binding.fragScholarPob.setText(scholarPersonDetail.d);
        String strSubstring = scholarPersonDetail.asInterface.substring(8, 10);
        String str8 = "";
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        String strSubstring2 = scholarPersonDetail.asInterface.substring(5, 7);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        String strSubstring3 = scholarPersonDetail.asInterface.substring(0, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
        StringBuilder sb = new StringBuilder();
        sb.append(strSubstring);
        sb.append("-");
        sb.append(strSubstring2);
        sb.append("-");
        sb.append(strSubstring3);
        String strTuitionPaymentFragmentbindingInflater1 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(sb.toString());
        if (scholarPersonDetail.asInterface.length() >= 10) {
            TextView textView4 = fragmentScholarBenefitStep1Binding.fragScholarDob;
            String strSubstring4 = scholarPersonDetail.asInterface.substring(8, 10);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
            String strSubstring5 = scholarPersonDetail.asInterface.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring5, "");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strSubstring4);
            sb2.append(" ");
            sb2.append(strTuitionPaymentFragmentbindingInflater1);
            sb2.append(" ");
            sb2.append(strSubstring5);
            textView4.setText(sb2.toString());
        }
        TextView textView5 = fragmentScholarBenefitStep1Binding.fragScholarGender;
        String upperCase2 = scholarPersonDetail.a.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        if (Intrinsics.areEqual(upperCase2, "P")) {
            upperCase = "PEREMPUAN";
        } else if (Intrinsics.areEqual(upperCase2, "L")) {
            int i3 = d + 31;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 48 / 0;
            }
            upperCase = "LAKI-LAKI";
        } else {
            upperCase = scholarPersonDetail.a.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
        }
        textView5.setText(upperCase);
        fragmentScholarBenefitStep1Binding.fragScholarAddress.setText(scholarPersonDetail.asBinder);
        TextView textView6 = fragmentScholarBenefitStep1Binding.fragScholarEmail;
        User userAsBinder = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        textView6.setText((userAsBinder == null || (str3 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? "-" : str3);
        TextView textView7 = fragmentScholarBenefitStep1Binding.fragScholarPhone;
        try {
            User userAsBinder2 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            if (userAsBinder2 != null) {
                int i5 = d + 43;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    str2 = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i6 = 55 / 0;
                } else {
                    str2 = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
                str7 = str2;
            }
            if (str7 != null) {
                str8 = str7;
            }
            strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str8);
        } catch (Exception unused) {
        }
        textView7.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        int i = 2 % 2;
        int i2 = d + 19;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNull(fragmentActivityRequireActivity, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity2, "");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, View view) {
        int i = 2 % 2;
        int i2 = d + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        generateultrahdrsupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(2);
        Unit unit = Unit.INSTANCE;
        int i4 = d + 81;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(ScholarPersonDetail scholarPersonDetail, String str) {
        int i = 2 % 2;
        int i2 = d + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            str.length();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str2 = str;
        if (str2.length() == 0) {
            return str;
        }
        String string = StringsKt.trim((CharSequence) CollectionsKt.last(StringsKt.split$default((CharSequence) str2, new String[]{" "}, false, 0, 6, (Object) null))).toString();
        int i4 = scholarPersonDetail.cancelAll;
        StringBuilder sb = new StringBuilder("PENERIMA BEASISWA KE-");
        sb.append(string);
        sb.append(" DARI ");
        sb.append(i4);
        sb.append(" ANAK PESERTA");
        String string2 = sb.toString();
        int i5 = asInterface + 65;
        d = i5 % 128;
        int i6 = i5 % 2;
        return string2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(FragmentScholarBenefitStep1Binding fragmentScholarBenefitStep1Binding, ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, ScholarPersonDetail scholarPersonDetail) {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        d = i2 % 128;
        int i3 = i2 % 2;
        Unit unitTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(fragmentScholarBenefitStep1Binding, activityResultContractsPickVisualMediaMediaCapabilities, scholarPersonDetail);
        int i4 = asInterface + 25;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return unitTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentScholarBenefitStep1Binding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return (Function3) TuitionPaymentFragmentbindingInflater1(getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, getTextOn.TuitionPaymentFragmentbindingInflater1(), 1855999980, -1855999980, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = d + 15;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        d = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.fragment_scholar_benefit_step1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        int i = 2 % 2;
        int i2 = d + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        TuitionPaymentFragmentbindingInflater1(getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, getTextOn.TuitionPaymentFragmentbindingInflater1(), -2075483141, 2075483142, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, int r8) {
        /*
            int r6 = r6 + 117
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r1 = defpackage.isRawSupported.$$c
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isRawSupported.$$g(int, int, int):java.lang.String");
    }
}
