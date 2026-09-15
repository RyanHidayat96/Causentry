package defpackage;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ExpandableListView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.work.WorkInfo;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentAsikActiveParticipantPersonalDataBinding;
import com.bpjstku.presentation.asik.resign.salariedworker.AsikResignSalariedWorkerPersonalDataFragment$bindingInflater$1;
import com.google.android.gms.measurement.internal.zzny;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u0015\u0010\u0011\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R.\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"LonBind;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentAsikActiveParticipantPersonalDataBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "LsetOnItemSelectedAction;", "b", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;", "TuitionPaymentFragmentbindingInflater1", "", "I", "asBinder", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onBind extends AutoValue_ImmutableImageInfo<FragmentAsikActiveParticipantPersonalDataBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Calendar TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: LayoutIncludeDetector
        private static final byte[] $$c = {49, -45, -112, 57};
        private static final int $$d = 191;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {87, -91, 60, 112};
        private static final int $$b = 227;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int b = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {16799, 64751, 15206, 31149, 46140, 62097, 12781, 27767, 43715, 59710, 10129, 25111, 41312, 57338, 6751, 22691, 38690, 54681, 4326, 22460, 60096, 11638, 28545, 41482, 58551, 10192, 31339, 48372, 65283, 12715, 29728, 46929, 51676, 3168, 20122, 33038, 50099, 45565, 3224, 52012, 35280, 17499, 743, 49540, 40020, 23203, 6485, 55190, 37462, 20737, 12188, 59941, 43213, 53602, 27732, 44000, 59648, 9418, 25140, 41300, 64729, 14963, 31122, 46853, 62188, 12753, 20298, 35555, 51214, 1930, 17768, 32845, 57313, 7524, 22684, 38456, 54693, 4314, 44600, 60906, 11030, 26279, 42045, 58180, 16117, 31865, 48056, 63789, 13377, 29636, 45436, 52372, 2585, 45554, 3225, 52024, 57660, 23561, 39861, 55618, 5336, 21038, 37148, 52364, 2608, 18822, 34652, 49912, 409, 32543, 47802, 63561, 14236, 30079, 45075, 61375, 11578, 26818, 42602, 58826, 8326, 40487, 56758, 7007, 22247, 38004, 54043, 45485, 2042, 47820, 32120, 16280, 62034, 46252, 30668, 10817, 60651, 44810, 24989, 9332, 59209, 39378, 23675, 7830, 53522, 37872, 22229, 2425, 52220, 36356, 16544, 829, 50754, 30880, 15205, 64905, 45100, 29364, 13776, 59501, 43762, 27936, 12206, 58053};
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 4944035510656240886L;

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 3
                int r7 = r7 + 1
                byte[] r0 = defpackage.LayoutIncludeDetector.$$a
                int r8 = r8 * 3
                int r8 = 4 - r8
                int r9 = r9 * 4
                int r9 = r9 + 98
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2b
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L26
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L26:
                r3 = r0[r8]
                r6 = r3
                r3 = r9
                r9 = r6
            L2b:
                int r9 = -r9
                int r8 = r8 + 1
                int r9 = r9 + r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutIncludeDetector.c(int, short, byte, java.lang.Object[]):void");
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = b + 101;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            setOnItemSelectedAction setonitemselectedactionTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onBind.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i4 = TuitionPaymentFragmentbindingInflater1 + 109;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 66 / 0;
            }
            return setonitemselectedactionTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = $11 + 59;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i % i5])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf("", "", 0, 0) + 2187, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39, 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        try {
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 33017);
                                int iResolveSize = View.resolveSize(0, 0) + 3011;
                                int i6 = 26 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                byte b4 = (byte) ($$d & 2);
                                byte b5 = (byte) (b4 - 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, iResolveSize, i6, 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                            try {
                                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char cMyTid = (char) (36505 - (Process.myTid() >> 22));
                                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 3377;
                                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17;
                                    byte b6 = (byte) ($$d & 1);
                                    byte b7 = (byte) (b6 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, iIndexOf, minimumFlingVelocity, -968507904, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.getDefaultSize(0, 0), TextUtils.lastIndexOf("", '0', 0) + 2188, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40, 841711447, false, $$e(b8, b9, b9), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 33017);
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3011;
                            int iGreen = 26 - Color.green(0);
                            byte b10 = (byte) ($$d & 2);
                            byte b11 = (byte) (b10 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, jumpTapTimeout, iGreen, 321985076, false, $$e(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cGreen = (char) (36505 - Color.green(0));
                            int scrollBarFadeDuration = 3376 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i8 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 16;
                            byte b12 = (byte) ($$d & 1);
                            byte b13 = (byte) (b12 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, scrollBarFadeDuration, i8, -968507904, false, $$e(b12, b13, b13), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i9 = $11 + 99;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36504);
                        int i10 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3377;
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 18;
                        byte b14 = (byte) ($$d & 1);
                        byte b15 = (byte) (b14 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, i10, modifierMetaStateMask, -968507904, false, $$e(b14, b15, b15), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                    int i11 = 60 / 0;
                } else {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cCombineMeasuredStates = (char) (36505 - View.combineMeasuredStates(0, 0));
                        int i12 = 3377 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int iMakeMeasureSpec = 17 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte b16 = (byte) ($$d & 1);
                        byte b17 = (byte) (b16 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cCombineMeasuredStates, i12, iMakeMeasureSpec, -968507904, false, $$e(b16, b17, b17), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
                }
            }
            objArr[0] = new String(cArr);
        }

        /* JADX WARN: Code duplicated, block: B:108:0x088a  */
        /* JADX WARN: Code duplicated, block: B:110:0x08ba  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v124 */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v42 */
        /* JADX WARN: Type inference failed for: r8v46, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r8v61, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r8v62 */
        /* JADX WARN: Type inference failed for: r8v9 */
        /* JADX WARN: Type inference failed for: r8v93 */
        /* JADX WARN: Type inference failed for: r8v94 */
        /* JADX WARN: Type inference failed for: r8v95 */
        public static Object[] TuitionPaymentFragmentbindingInflater1(int i, int i2) throws Throwable {
            int i3;
            ?? r8;
            String line;
            ?? r9;
            char c;
            Object[] objArr;
            Object[] objArr2;
            int i4;
            int i5;
            int i6;
            int i7;
            String str;
            ?? r10;
            int i8;
            int i9;
            Class<?> cls;
            Method method;
            int i10 = 2 % 2;
            int i11 = TuitionPaymentFragmentbindingInflater1;
            int i12 = (i11 ^ 45) + ((i11 & 45) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            try {
                String[] strArr = new String[2];
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                int i14 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i15 = ((i14 | 19) << 1) - (i14 ^ 19);
                int i16 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                Object[] objArr3 = new Object[1];
                a(iCombineMeasuredStates, i15, (char) ((i16 & 61546) + (i16 | 61546)), objArr3);
                strArr[0] = (String) objArr3[0];
                int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                int i17 = (scrollBarSize & 19) + (scrollBarSize | 19);
                int capsMode = TextUtils.getCapsMode("", 0, 0);
                int i18 = capsMode * (-830);
                int i19 = (i18 & 14976) + (i18 | 14976);
                int i20 = ~i;
                int i21 = ~(((-19) ^ i20) | ((-19) & i20));
                int i22 = TuitionPaymentFragmentbindingInflater1 + 87;
                b = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = (capsMode ^ 18) | (capsMode & 18);
                    int i24 = ~((i23 & i) | (i23 ^ i));
                    int i25 = (i24 & i21) | (i21 ^ i24);
                    int i26 = -((i25 ^ (-831)) + ((i25 & (-831)) << 1));
                    int i27 = ((i19 | i26) << 1) - (i26 ^ i19);
                    int i28 = (-19) | capsMode;
                    i8 = i27 / ((-1662) >>> (~((i28 & i) | (i28 ^ i))));
                } else {
                    int i29 = ~((capsMode ^ 18) | (capsMode & 18) | i);
                    int i30 = ((i29 & i21) | (i21 ^ i29)) * (-831);
                    int i31 = (i19 ^ i30) + ((i30 & i19) << 1);
                    int i32 = (-19) | capsMode;
                    i8 = i31 + ((~((i32 & i) | (i32 ^ i))) * (-1662));
                }
                int i33 = ~capsMode;
                int i34 = ~((i33 & i20) | (i33 ^ i20));
                int i35 = ~((capsMode ^ i) | (capsMode & i));
                int i36 = (i34 & i35) | (i34 ^ i35);
                int i37 = ~(18 | i);
                int i38 = i8 + (831 * ((i36 & i37) | (i36 ^ i37)));
                int i39 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int i40 = (i39 * (-755)) - 44520085;
                int i41 = ~i39;
                int i42 = TuitionPaymentFragmentbindingInflater1;
                int i43 = (i42 & 7) + (i42 | 7);
                b = i43 % 128;
                if (i43 % 2 == 0) {
                    int i44 = i40 % (1512 << (~(i41 | (-58968))));
                    int i45 = (i39 ^ 58967) | (i39 & 58967);
                    int i46 = -((~((~i39) | (-58968))) | (~((i45 & i) | (i45 ^ i))));
                    int i47 = -(-(((i46 | (-756)) << 1) - (i46 ^ (-756))));
                    i9 = (i44 & i47) + (i47 | i44);
                } else {
                    int i48 = (~(i41 | (-58968))) * 1512;
                    int i49 = (i40 ^ i48) + ((i40 & i48) << 1);
                    int i50 = ~(i41 | (-58968));
                    int i51 = i39 | 58967;
                    int i52 = ~((i51 & i) | (i51 ^ i));
                    i9 = i49 + (((i50 & i52) | (i50 ^ i52)) * (-756));
                }
                int i53 = (i39 ^ 58967) | (i39 & 58967);
                Object[] objArr4 = new Object[1];
                a(i17, i38, (char) ((i9 - (~(756 * ((i53 & i20) | (i53 ^ i20))))) - 1), objArr4);
                strArr[1] = (String) objArr4[0];
                int i54 = b;
                int i55 = (i54 & 41) + (i54 | 41);
                TuitionPaymentFragmentbindingInflater1 = i55 % 128;
                int i56 = i55 % 2;
                int i57 = 0;
                while (true) {
                    if (i57 >= 2) {
                        i3 = i;
                        break;
                    }
                    int i58 = b;
                    int i59 = (i58 & 1) + (i58 | 1);
                    TuitionPaymentFragmentbindingInflater1 = i59 % 128;
                    int i60 = i59 % 2;
                    String str2 = strArr[i57];
                    int i61 = 36 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)));
                    int i62 = TuitionPaymentFragmentbindingInflater1;
                    int i63 = (i62 ^ 121) + ((i62 & 121) << 1);
                    b = i63 % 128;
                    int i64 = i63 % 2;
                    int i65 = -(-TextUtils.lastIndexOf("", '0', 0));
                    Object[] objArr5 = new Object[1];
                    a(i61, (i65 ^ 17) + ((i65 & 17) << 1), (char) KeyEvent.normalizeMetaState(0), objArr5);
                    String str3 = (String) objArr5[0];
                    int i66 = b;
                    int i67 = ((i66 | 27) << 1) - (i66 ^ 27);
                    TuitionPaymentFragmentbindingInflater1 = i67 % 128;
                    if (i67 % 2 != 0) {
                        cls = Class.forName(str3);
                        method = cls.getMethod(str2, new Class[0]);
                    } else {
                        cls = Class.forName(str3);
                        method = cls.getMethod(str2, new Class[0]);
                    }
                    int i68 = TuitionPaymentFragmentbindingInflater1;
                    int i69 = ((i68 | 117) << 1) - (i68 ^ 117);
                    b = i69 % 128;
                    if (i69 % 2 == 0) {
                        ((Boolean) method.invoke(cls, null)).booleanValue();
                        throw null;
                    }
                    if (((Boolean) method.invoke(cls, null)).booleanValue()) {
                        i3 = i ^ 1;
                        int i70 = b + 95;
                        TuitionPaymentFragmentbindingInflater1 = i70 % 128;
                        int i71 = i70 % 2;
                        break;
                    }
                    i57++;
                }
            } catch (Exception unused) {
                i3 = (i & (-3)) | ((~i) & 2);
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char capsMode2 = (char) (2419 - TextUtils.getCapsMode("", 0, 0));
                    int packedPositionChild = 2844 - ExpandableListView.getPackedPositionChild(0L);
                    int size = 5 - View.MeasureSpec.getSize(0);
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    Object[] objArr6 = new Object[1];
                    c(b2, b3, b3, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode2, packedPositionChild, size, -501222268, false, (String) objArr6[0], new Class[0]);
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                long j = 915048405;
                long j2 = -1;
                long j3 = jLongValue ^ j2;
                long j4 = 494;
                long j5 = j ^ j2;
                long j6 = ((long) i) ^ j2;
                long j7 = (((long) 495) * j) + (((long) (-493)) * jLongValue) + (((long) (-988)) * (j | j3)) + ((jLongValue | j5 | j6) * j4) + (j4 * (((j5 | j3) ^ j2) | ((j6 | jLongValue) ^ j2) | ((jLongValue | j) ^ j2))) + ((long) (-2074235091));
                int iNextInt = new Random().nextInt();
                int i72 = ~iNextInt;
                int i73 = ((int) (j7 >> 32)) & ((-1098367492) + (((~((-716374541) | i72)) | (~((-4369) | iNextInt)) | (~((-4472963) | iNextInt))) * 765) + (((~((-716378909) | i72)) | 716374540) * 1530) + (((~(iNextInt | (-716378909))) | (~(i72 | (-4472963)))) * 765));
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i74 = ~iUptimeMillis;
                int i75 = ((int) j7) & ((-1350102331) + ((~((-66776316) | i74)) * (-560)) + ((~(iUptimeMillis | (-38831186))) * (-560)) + (((~((-1370450095) | i74)) | 1342504964) * 560));
                int i76 = ~i;
                int i77 = ((i73 & i75) | (i73 ^ i75)) ^ 1;
                int i78 = -i77;
                int i79 = ((i77 & i78) | (i77 ^ i78)) >> 31;
                int i80 = (i79 & i) | (((i & (-11)) | (i76 & 10)) & (~i79));
                int i81 = (~(i & i3)) & (i | i3);
                int i82 = -i81;
                int i83 = ((i81 & i82) | (i81 ^ i82)) >> 31;
                int i84 = i80 & (~i83);
                int i85 = i3 & i83;
                int i86 = (i84 ^ i85) | (i85 & i84);
                try {
                    int i87 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i88 = (i87 ^ 53) + ((i87 & 53) << 1);
                    int i89 = -Gravity.getAbsoluteGravity(0, 0);
                    int i90 = (i89 ^ 40) + ((i89 & 40) << 1);
                    int i91 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                    r8 = new Object[1];
                    a(i88, i90, (char) (((i91 | 24785) << 1) - (i91 ^ 24785)), r8);
                    File file = new File((String) r8[0]);
                    if (!file.canRead()) {
                        int i92 = b + 39;
                        TuitionPaymentFragmentbindingInflater1 = i92 % 128;
                        int i93 = i92 % 2;
                        r10 = "";
                        line = null;
                        r9 = r10;
                    } else {
                        try {
                            FileReader fileReader = new FileReader(file);
                            BufferedReader bufferedReader = new BufferedReader(fileReader);
                            try {
                                line = bufferedReader.readLine();
                                int i94 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i95 = (i94 * (-432)) - (-40362);
                                int i96 = ~i94;
                                int i97 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i98 = (i97 & i96) | (i96 ^ i97);
                                int i99 = -(-((~((i98 & 93) | (i98 ^ 93))) * 433));
                                int i100 = (i95 & i99) + (i95 | i99);
                                int i101 = ~(((-94) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-94) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                int i102 = ((i101 & i96) | (i96 ^ i101)) * (-433);
                                int i103 = ((i100 | i102) << 1) - (i102 ^ i100);
                                int i104 = ~i94;
                                int i105 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & i104) | (i104 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                int i106 = ~(i94 | 93);
                                int i107 = ((i106 & i105) | (i105 ^ i106)) * 433;
                                r8 = "";
                                try {
                                    Object[] objArr7 = new Object[1];
                                    a((i103 ^ i107) + ((i107 & i103) << 1), 1 - (~(-TextUtils.lastIndexOf(r8, '0', 0))), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr7);
                                    if (line.equals((String) objArr7[0])) {
                                        fileReader.close();
                                        bufferedReader.close();
                                        int i108 = b + 3;
                                        TuitionPaymentFragmentbindingInflater1 = i108 % 128;
                                        int i109 = i108 % 2;
                                        r10 = r8;
                                        line = null;
                                        r9 = r10;
                                    } else {
                                        int i110 = b;
                                        int i111 = ((i110 | 23) << 1) - (i110 ^ 23);
                                        TuitionPaymentFragmentbindingInflater1 = i111 % 128;
                                        int i112 = i111 % 2;
                                        fileReader.close();
                                        bufferedReader.close();
                                        int i113 = TuitionPaymentFragmentbindingInflater1;
                                        int i114 = ((i113 | 5) << 1) - (i113 ^ 5);
                                        b = i114 % 128;
                                        int i115 = i114 % 2;
                                        r9 = r8;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    fileReader.close();
                                    bufferedReader.close();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Exception unused3) {
                    r8 = "";
                }
                try {
                    int i116 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i117 = (i116 * 866) - 82944;
                    int i118 = -(-(((~((~i116) | (~i))) | (-97)) * (-865)));
                    int i119 = (i117 ^ i118) + ((i117 & i118) << 1);
                    int i120 = -(-((~((i116 ^ i) | (i116 & i))) * 865));
                    int i121 = (i119 ^ i120) + ((i120 & i119) << 1);
                    int i122 = -(-(((~((i116 & i76) | (i76 ^ i116))) | (~(((-97) & i76) | ((-97) ^ i76)))) * 865));
                    int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
                    int i124 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i125 = i124 * 881;
                    int i126 = (i125 & 28192) + (i125 | 28192);
                    int i127 = ~i124;
                    int i128 = ~((i127 ^ (-33)) | (i127 & (-33)));
                    int i129 = ~((i127 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i127 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i130 = (i129 & i128) | (i128 ^ i129);
                    int i131 = ~(((-33) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-33) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i132 = ((i130 & i131) | (i130 ^ i131)) * (-880);
                    int i133 = (i126 ^ i132) + ((i132 & i126) << 1);
                    int i134 = ~i124;
                    int i135 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i136 = (~((i134 & i135) | (i134 ^ i135))) | 32;
                    int i137 = ~((i124 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i124 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i138 = -(-(((i136 ^ i137) | (i136 & i137)) * (-880)));
                    int i139 = (i133 & i138) + (i138 | i133);
                    int i140 = i137 * 880;
                    int i141 = (i139 & i140) + (i140 | i139);
                    int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i142 = doubleTapTimeout * (-1335);
                    int i143 = ((i142 | (-13755541)) << 1) - (i142 ^ (-13755541));
                    int i144 = (doubleTapTimeout ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (doubleTapTimeout & iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                    int i145 = i143 + (((~i144) | (-20624)) * (-668));
                    int i146 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault4 | (-20624));
                    int i147 = -(-(((doubleTapTimeout & i146) | (doubleTapTimeout ^ i146)) * 1336));
                    int i148 = ((i145 | i147) << 1) - (i147 ^ i145);
                    int i149 = ((i144 ^ (-20624)) | (i144 & (-20624))) * 668;
                    char c2 = (char) (((i148 | i149) << 1) - (i149 ^ i148));
                    Object[] objArr8 = new Object[1];
                    a(i123, i141, c2, objArr8);
                    File file2 = new File((String) objArr8[0]);
                    if (file2.canRead()) {
                        FileReader fileReader2 = new FileReader(file2);
                        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                        try {
                            String line2 = bufferedReader2.readLine();
                            int i150 = 125 - (~(-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))));
                            int i151 = -MotionEvent.axisFromString(r9);
                            int i152 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i153 = i152 * 495;
                            int i154 = (i153 ^ (-493)) + (((-493) & i153) << 1);
                            int i155 = -(-((i152 | (-2)) * (-988)));
                            int i156 = ((i154 | i155) << 1) - (i155 ^ i154);
                            int i157 = ~i152;
                            int i158 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                            int i159 = i156 + (((i157 ^ 1) | (i157 & 1) | i158) * 494);
                            int i160 = ~((i157 & (-2)) | (i157 ^ (-2)));
                            int i161 = ~(i158 | 1);
                            int i162 = (i160 & i161) | (i160 ^ i161);
                            int i163 = ~((i152 & 1) | (i152 ^ 1));
                            char c3 = (char) (i159 + (((i162 & i163) | (i162 ^ i163)) * 494));
                            Object[] objArr9 = new Object[1];
                            a(i150, i151, c3, objArr9);
                            boolean zEquals = line2.equals((String) objArr9[0]);
                            fileReader2.close();
                            bufferedReader2.close();
                            int i164 = TuitionPaymentFragmentbindingInflater1 + 11;
                            b = i164 % 128;
                            if (i164 % 2 == 0) {
                                int i165 = 5 % 3;
                            }
                            if (zEquals) {
                                int i166 = -TextUtils.indexOf((CharSequence) r9, '0', 0);
                                int i167 = i166 * (-919);
                                int i168 = (i167 ^ (-116713)) + ((i167 & (-116713)) << 1);
                                int i169 = ~i166;
                                int i170 = (i169 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i169 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                int i171 = ~((i170 & i) | (i170 ^ i));
                                int i172 = ~i;
                                int i173 = ((-128) ^ i172) | ((-128) & i172);
                                int i174 = ~((i173 & i166) | (i173 ^ i166));
                                int i175 = -(-(((i171 & i174) | (i171 ^ i174)) * 920));
                                int i176 = (i168 & i175) + (i175 | i168);
                                int i177 = ~((i169 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i169 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                int i178 = ~i166;
                                int i179 = i176 + ((i177 | (~((i178 ^ i172) | (i172 & i178)))) * 920);
                                int i180 = i178 | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                int i181 = ~((i180 & i76) | (i180 ^ i76));
                                int i182 = (i178 & 127) | (i178 ^ 127);
                                int i183 = ~((i182 & i) | (i182 ^ i));
                                int i184 = (i181 & i183) | (i181 ^ i183);
                                int i185 = ~((i166 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i166) | i);
                                int i186 = i179 + (((i185 & i184) | (i184 ^ i185)) * 920);
                                int i187 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i188 = i187 * 758;
                                int i189 = (i188 ^ (-27216)) + ((i188 & (-27216)) << 1);
                                int i190 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                int i191 = -(-(((i187 ^ i190) | (i187 & i190)) * (-757)));
                                int i192 = (((i189 ^ i191) + ((i189 & i191) << 1)) - (~(-(-((~((((-37) & i187) | ((-37) ^ i187)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault6)) * 1514))))) - 1;
                                int i193 = ~i187;
                                int i194 = ~((i193 & (-37)) | (i193 ^ (-37)));
                                int i195 = ~(i190 | (-37));
                                int i196 = (i187 & 36) | (i187 ^ 36);
                                int i197 = i192 + (((~((i196 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i196 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) | (i195 & i194) | (i194 ^ i195)) * 757);
                                int i198 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                Object[] objArr10 = new Object[1];
                                a(i186, i197, (char) ((i198 & 46664) + (i198 | 46664)), objArr10);
                                File file3 = new File((String) objArr10[0]);
                                if (!file3.canRead()) {
                                    int i199 = b + 101;
                                    TuitionPaymentFragmentbindingInflater1 = i199 % 128;
                                    int i200 = i199 % 2;
                                } else {
                                    FileReader fileReader3 = new FileReader(file3);
                                    BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                    try {
                                        String line3 = bufferedReader3.readLine();
                                        int i201 = -TextUtils.indexOf((CharSequence) r9, '0', 0, 0);
                                        int i202 = (i201 ^ 126) + ((i201 & 126) << 1);
                                        int i203 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        long packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
                                        int i204 = b + 115;
                                        TuitionPaymentFragmentbindingInflater1 = i204 % 128;
                                        if (i204 % 2 != 0) {
                                            Object[] objArr11 = new Object[1];
                                            a(i202, i203, (char) (packedPositionForGroup > 1L ? 1 : (packedPositionForGroup == 1L ? 0 : -1)), objArr11);
                                            str = (String) objArr11[0];
                                        } else {
                                            Object[] objArr12 = new Object[1];
                                            a(i202, i203, (char) (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), objArr12);
                                            str = (String) objArr12[0];
                                        }
                                        boolean zEquals2 = line3.equals(str);
                                        fileReader3.close();
                                        bufferedReader3.close();
                                        if (zEquals2 && line != null) {
                                            int i205 = b;
                                            int i206 = ((i205 | 85) << 1) - (i205 ^ 85);
                                            TuitionPaymentFragmentbindingInflater1 = i206 % 128;
                                            int i207 = i206 % 2;
                                            objArr = new Object[]{new int[]{(~(i & 20)) & (i | 20)}, new String[]{line}};
                                            c = 0;
                                        }
                                    } catch (Throwable th3) {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                        throw th3;
                                    }
                                }
                            }
                            int i208 = ((int[]) objArr[c])[c];
                            int i209 = (~(i & i86)) & (i | i86);
                            int i210 = (i209 | (-i209)) >> 31;
                            int i211 = (i86 & i210) | ((~i210) & i208);
                            String[] strArr2 = (String[]) objArr[1];
                            Object[] objArr13 = new Object[2];
                            int i212 = (i208 & i76) | ((~i208) & i);
                            int i213 = ((i212 | (-i212)) >> 31) & 1;
                            int i214 = (~(((-i213) | i213) >> 31)) & 1;
                            int i215 = TuitionPaymentFragmentbindingInflater1;
                            int i216 = (i215 ^ 13) + ((i215 & 13) << 1);
                            int i217 = i216 % 128;
                            b = i217;
                            int i218 = i216 % 2;
                            objArr13[i213] = null;
                            objArr13[i214] = strArr2;
                            String[] strArr3 = (String[]) objArr13[0];
                            int i219 = (i217 ^ 1) + ((i217 & 1) << 1);
                            int i220 = i219 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i220;
                            int i221 = i219 % 2;
                            int i222 = i ^ i211;
                            int i223 = -i222;
                            int i224 = (((i222 & i223) | (i222 ^ i223)) >> 31) & 16;
                            int i225 = i220 + 87;
                            b = i225 % 128;
                            int i226 = i225 % 2;
                            objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i211}, strArr3};
                            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                            int i227 = ~iFreeMemory;
                            int i228 = (((((~(11727980 | i227)) | (~((-52038210) | iFreeMemory))) | (~(i227 | 52038209))) * 959) - 1488347180) + (((~(iFreeMemory | 52038209)) | (~(i227 | (-52038210))) | (~(11727980 | iFreeMemory))) * 959);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i229 = i224 * 221;
                            int i230 = -(-(i228 * (-219)));
                            int i231 = ((i229 | i230) << 1) - (i229 ^ i230);
                            int i232 = ~i224;
                            int i233 = ~i228;
                            int i234 = ~((i232 & i233) | (i232 ^ i233));
                            int i235 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                            int i236 = (i235 ^ i224) | (i235 & i224);
                            int i237 = ~((i236 & i228) | (i236 ^ i228));
                            int i238 = ((i234 & i237) | (i234 ^ i237)) * 220;
                            int i239 = ((i231 | i238) << 1) - (i238 ^ i231);
                            int i240 = ((~((i235 ^ i228) | (i235 & i228))) | i224) * (-440);
                            int i241 = ((i239 | i240) << 1) - (i240 ^ i239);
                            int i242 = i224 | i228;
                            int i243 = TuitionPaymentFragmentbindingInflater1;
                            int i244 = ((i243 | 37) << 1) - (i243 ^ 37);
                            int i245 = i244 % 128;
                            b = i245;
                            int i246 = i244 % 2;
                            i4 = i241 + (220 * ((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & i242) | (i242 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7)));
                            int i247 = i4 * (-494);
                            int i248 = -(-(i2 * (-494)));
                            int i249 = (i247 ^ i248) + ((i247 & i248) << 1);
                            int i250 = (~((i4 ^ i2) | (i4 & i2))) * (-495);
                            int i251 = (i249 ^ i250) + ((i250 & i249) << 1);
                            int i252 = -(-((i4 | i76) * 495));
                            i5 = (i251 ^ i252) + ((i252 & i251) << 1);
                            int i253 = i245 + 125;
                            TuitionPaymentFragmentbindingInflater1 = i253 % 128;
                            i6 = i253 % 2;
                            i7 = ~i4;
                            if (i6 != 0) {
                                int i254 = ~i2;
                                int i255 = ~((i7 & i254) | (i7 ^ i254));
                                int i256 = ~((i76 ^ i4) | (i76 & i4));
                                int i257 = i5 >>> (495 >> ((i255 & i256) | (i255 ^ i256)));
                                int i258 = i257 ^ (i257 * 84);
                                int i259 = i258 << 57;
                                int i260 = (i258 | i259) & (~(i258 & i259));
                                int i261 = i260 % 4;
                                ((int[]) objArr2[1])[0] = (i260 | i261) & (~(i260 & i261));
                                return objArr2;
                            }
                            int i262 = ~i2;
                            int i263 = ~((i7 & i262) | (i7 ^ i262));
                            int i264 = ~((~i) | i4);
                            int i265 = ((i263 & i264) | (i263 ^ i264)) * 495;
                            int i266 = (i5 ^ i265) + ((i265 & i5) << 1);
                            int i267 = i266 << 13;
                            int i268 = (i267 | i266) & (~(i266 & i267));
                            int i269 = i268 ^ (i268 >>> 17);
                            int i270 = i269 << 5;
                            ((int[]) objArr2[1])[0] = ((~i269) & i270) | ((~i270) & i269);
                            return objArr2;
                        } catch (Throwable th4) {
                            fileReader2.close();
                            bufferedReader2.close();
                            throw th4;
                        }
                    }
                    int i271 = b + 3;
                    TuitionPaymentFragmentbindingInflater1 = i271 % 128;
                    int i272 = i271 % 2;
                } catch (Exception unused4) {
                }
                objArr = new Object[2];
                int[] iArr = new int[1];
                objArr[0] = iArr;
                int i273 = b;
                int i274 = (i273 ^ 113) + ((i273 & 113) << 1);
                TuitionPaymentFragmentbindingInflater1 = i274 % 128;
                c = 0;
                String[] strArr4 = new String[0];
                if (i274 % 2 != 0) {
                    int i275 = 92 / 0;
                }
                iArr[0] = i;
                objArr[1] = strArr4;
                int i2010 = ((int[]) objArr[c])[c];
                int i2011 = (~(i & i86)) & (i | i86);
                int i2110 = (i2011 | (-i2011)) >> 31;
                int i2111 = (i86 & i2110) | ((~i2110) & i2010);
                String[] strArr5 = (String[]) objArr[1];
                Object[] objArr14 = new Object[2];
                int i2112 = (i2010 & i76) | ((~i2010) & i);
                int i2113 = ((i2112 | (-i2112)) >> 31) & 1;
                int i2114 = (~(((-i2113) | i2113) >> 31)) & 1;
                int i2115 = TuitionPaymentFragmentbindingInflater1;
                int i2116 = (i2115 ^ 13) + ((i2115 & 13) << 1);
                int i2117 = i2116 % 128;
                b = i2117;
                int i2118 = i2116 % 2;
                objArr14[i2113] = null;
                objArr14[i2114] = strArr5;
                String[] strArr6 = (String[]) objArr14[0];
                int i2119 = (i2117 ^ 1) + ((i2117 & 1) << 1);
                int i2210 = i2119 % 128;
                TuitionPaymentFragmentbindingInflater1 = i2210;
                int i2211 = i2119 % 2;
                int i2212 = i ^ i2111;
                int i2213 = -i2212;
                int i2214 = (((i2212 & i2213) | (i2212 ^ i2213)) >> 31) & 16;
                int i2215 = i2210 + 87;
                b = i2215 % 128;
                int i2216 = i2215 % 2;
                objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i2111}, strArr6};
                int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                int i2217 = ~iFreeMemory2;
                int i2218 = (((((~(11727980 | i2217)) | (~((-52038210) | iFreeMemory2))) | (~(i2217 | 52038209))) * 959) - 1488347180) + (((~(iFreeMemory2 | 52038209)) | (~(i2217 | (-52038210))) | (~(11727980 | iFreeMemory2))) * 959);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i2219 = i2214 * 221;
                int i2310 = -(-(i2218 * (-219)));
                int i2311 = ((i2219 | i2310) << 1) - (i2219 ^ i2310);
                int i2312 = ~i2214;
                int i2313 = ~i2218;
                int i2314 = ~((i2312 & i2313) | (i2312 ^ i2313));
                int i2315 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                int i2316 = (i2315 ^ i2214) | (i2315 & i2214);
                int i2317 = ~((i2316 & i2218) | (i2316 ^ i2218));
                int i2318 = ((i2314 & i2317) | (i2314 ^ i2317)) * 220;
                int i2319 = ((i2311 | i2318) << 1) - (i2318 ^ i2311);
                int i2410 = ((~((i2315 ^ i2218) | (i2315 & i2218))) | i2214) * (-440);
                int i2411 = ((i2319 | i2410) << 1) - (i2410 ^ i2319);
                int i2412 = i2214 | i2218;
                int i2413 = TuitionPaymentFragmentbindingInflater1;
                int i2414 = ((i2413 | 37) << 1) - (i2413 ^ 37);
                int i2415 = i2414 % 128;
                b = i2415;
                int i2416 = i2414 % 2;
                i4 = i2411 + (220 * ((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & i2412) | (i2412 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8)));
                int i2417 = i4 * (-494);
                int i2418 = -(-(i2 * (-494)));
                int i2419 = (i2417 ^ i2418) + ((i2417 & i2418) << 1);
                int i2510 = (~((i4 ^ i2) | (i4 & i2))) * (-495);
                int i2511 = (i2419 ^ i2510) + ((i2510 & i2419) << 1);
                int i2512 = -(-((i4 | i76) * 495));
                i5 = (i2511 ^ i2512) + ((i2512 & i2511) << 1);
                int i2513 = i2415 + 125;
                TuitionPaymentFragmentbindingInflater1 = i2513 % 128;
                i6 = i2513 % 2;
                i7 = ~i4;
                if (i6 != 0) {
                    int i2514 = ~i2;
                    int i2515 = ~((i7 & i2514) | (i7 ^ i2514));
                    int i2516 = ~((i76 ^ i4) | (i76 & i4));
                    int i2517 = i5 >>> (495 >> ((i2515 & i2516) | (i2515 ^ i2516)));
                    int i2518 = i2517 ^ (i2517 * 84);
                    int i2519 = i2518 << 57;
                    int i2610 = (i2518 | i2519) & (~(i2518 & i2519));
                    int i2611 = i2610 % 4;
                    ((int[]) objArr2[1])[0] = (i2610 | i2611) & (~(i2610 & i2611));
                    return objArr2;
                }
                int i2612 = ~i2;
                int i2613 = ~((i7 & i2612) | (i7 ^ i2612));
                int i2614 = ~((~i) | i4);
                int i2615 = ((i2613 & i2614) | (i2613 ^ i2614)) * 495;
                int i2616 = (i5 ^ i2615) + ((i2615 & i5) << 1);
                int i2617 = i2616 << 13;
                int i2618 = (i2617 | i2616) & (~(i2616 & i2617));
                int i2619 = i2618 ^ (i2618 >>> 17);
                int i276 = i2619 << 5;
                ((int[]) objArr2[1])[0] = ((~i2619) & i276) | ((~i276) & i2619);
                return objArr2;
            } catch (Throwable th5) {
                Throwable cause = th5.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th5;
            }
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
        private static java.lang.String $$e(int r7, short r8, short r9) {
            /*
                int r9 = r9 * 3
                int r9 = 1 - r9
                int r7 = r7 * 3
                int r7 = r7 + 109
                int r8 = r8 * 2
                int r8 = 4 - r8
                byte[] r0 = defpackage.LayoutIncludeDetector.$$c
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L29
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r9) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L24:
                r3 = r0[r8]
                r6 = r3
                r3 = r8
                r8 = r6
            L29:
                int r7 = r7 + r8
                int r8 = r3 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutIncludeDetector.$$e(int, short, short):java.lang.String");
        }
    });

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
    }

    /* JADX INFO: renamed from: onBind$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LonBind$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "LonBind;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LonBind;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static onBind TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            onBind onbind = new onBind();
            onbind.setArguments(new Bundle());
            return onbind;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public onBind() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = calendar;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.fragment_asik_active_participant_personal_data;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantPersonalDataBinding> d() {
        return AsikResignSalariedWorkerPersonalDataFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        FragmentAsikActiveParticipantPersonalDataBinding fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AppLocalesMetadataHolderServiceApi24Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onBind.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) obj);
            }
        }));
        EditText editText = fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new getServiceInfo(this));
        }
        CardView cardView = fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub.cvIdCardUpload;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        CardView cardView2 = cardView;
        Function1 function1 = new Function1() { // from class: popOutdatedAttrHolders
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onBind.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(cardView2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        cardView2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        FragmentAsikActiveParticipantPersonalDataBinding fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub.tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_field_nik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16)})));
        TextInputLayout textInputLayout2 = fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub.tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        TextInputLayout textInputLayout3 = fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub.tilBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(onBind onbind, int i, int i2, int i3) {
        onbind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(1, i);
        onbind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(2, i2);
        onbind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(5, i3);
        onbind.INotificationSideChannelStub().edtBirthDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(onbind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getTime()));
    }

    public static /* synthetic */ setOnItemSelectedAction TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return new setOnItemSelectedAction();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion bVar = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        lambdasetActive6androidxcameracamera2interopCamera2CameraControl lambdasetactive6androidxcameracamera2interopcamera2cameracontrol = new lambdasetActive6androidxcameracamera2interopCamera2CameraControl(null);
        Intrinsics.checkNotNullParameter(lambdasetactive6androidxcameracamera2interopcamera2cameracontrol, "");
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdasetactive6androidxcameracamera2interopcamera2cameracontrol);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(onBind onbind, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        setOnItemSelectedAction setonitemselectedaction = (setOnItemSelectedAction) onbind.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        FragmentManager childFragmentManager = onbind.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            setonitemselectedaction.show(childFragmentManager, setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(final onBind onbind, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: AppLocalesMetadataHolderService
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    onBind.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, i, i2, i3);
                }
            }, onbind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(1), onbind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(2), onbind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }
}
