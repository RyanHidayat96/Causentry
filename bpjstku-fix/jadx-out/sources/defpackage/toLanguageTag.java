package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentAsikActiveUpdateSecondaryDataBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.AsikActiveUpdateSecondaryDataFragment$bindingInflater$1;
import com.google.gson.internal.bind.TypeAdapters;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.mapPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u000e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0015\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00168BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R.\u0010\u0017\u001a\u001c\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"LtoLanguageTag;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentAsikActiveUpdateSecondaryDataBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "INotificationSideChannel", "cancel", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "asBinder", "()I", "TuitionPaymentFragmentbindingInflater1", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/domain/user/model/User;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class toLanguageTag extends AutoValue_ImmutableImageInfo<FragmentAsikActiveUpdateSecondaryDataBinding> {
    private static int INotificationSideChannel;
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static boolean asBinder;
    private static boolean asInterface;
    private static int b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: getLocales
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return toLanguageTag.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {22, 102, 43, -6};
    private static final int $$f = 37;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {43, 23, 22, -14, -43, 1, -11, 55, -27, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$e = 50;
    private static final byte[] $$a = {117, 57, 101, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 81;
    private static int notify = 0;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1412a = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i5)) | i9 | (~(i8 | i5));
        int i11 = ~i5;
        int i12 = (~(i8 | i11)) | i9;
        int i13 = (~(i11 | i7)) | i2;
        int i14 = i + i2 + i4 + ((-700610695) * i3) + ((-1151578525) * i6);
        int i15 = i14 * i14;
        int i16 = (1165304685 * i) + 1030029312 + ((-1366800679) * i2) + (i10 * (-1762861932)) + (i12 * (-1762861932)) + ((-1762861932) * i13) + ((-597557248) * i4) + ((-665714688) * i3) + (367394816 * i6) + (374145024 * i15);
        int i17 = ((i * 323709325) - 650539883) + (i2 * 323709049) + (i10 * 276) + (i12 * 276) + (i13 * 276) + (i4 * 323709601) + (i3 * (-499299047)) + (i6 * 1568885315) + (i15 * (-395509760));
        if (i16 + (i17 * i17 * (-772603904)) != 1) {
            return b(objArr);
        }
        int i18 = 2 % 2;
        int i19 = d + 9;
        f1412a = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r0 = 53 - r6
            int r8 = r8 * 4
            int r8 = 84 - r8
            byte[] r1 = defpackage.toLanguageTag.$$a
            int r7 = 92 - r7
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.toLanguageTag.c(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.toLanguageTag.$$d
            int r8 = r8 * 47
            int r8 = r8 + 6
            int r6 = r6 * 6
            int r6 = 84 - r6
            int r7 = r7 * 5
            int r7 = 8 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2f:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-10)
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.toLanguageTag.f(int, short, short, java.lang.Object[]):void");
    }

    public toLanguageTag() {
        final toLanguageTag tolanguagetag = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveUpdateSecondaryDataFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = tolanguagetag;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveUpdateSecondaryDataBinding> d() {
        int i = 2 % 2;
        int i2 = f1412a + 43;
        d = i2 % 128;
        int i3 = i2 % 2;
        AsikActiveUpdateSecondaryDataFragment$bindingInflater$1 asikActiveUpdateSecondaryDataFragment$bindingInflater$1 = AsikActiveUpdateSecondaryDataFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = d + 13;
        f1412a = i4 % 128;
        if (i4 % 2 != 0) {
            return asikActiveUpdateSecondaryDataFragment$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
        int i3 = -1;
        int i4 = 0;
        if (cArr3 != null) {
            int i5 = $11 + 65;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr3[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i3;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.resolveSizeAndState(i4, i4, i4) + 31339), 2994 - KeyEvent.keyCodeFromString(""), 16 - TextUtils.lastIndexOf("", '0'), 1182129903, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i3 = -1;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(b)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - View.resolveSize(0, 0)), 253 - ExpandableListView.getPackedPositionType(0L), 21 - Process.getGidForName(""), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i7 = 1687675375;
        if (asBinder) {
            int i8 = $10 + 103;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33603 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 3085 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (asInterface) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i10 = $10 + 83;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 33602), 3085 - Color.green(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 26, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                i7 = 1687675375;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i12 = $11 + 37;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i14 = $10 + 5;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 << 1) + getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] + iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >>>= 1;
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
            }
        }
        objArr[0] = new String(cArr6);
        int i15 = $11 + 89;
        $10 = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 49 / 0;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() throws Throwable {
        Object[] objArr;
        char c = 2;
        int i = 2 % 2;
        int i2 = f1412a + 73;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int iMyTid = 876 - (Process.myTid() >> 22);
            int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(0);
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b2, (byte) (b2 | 88), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, iMyTid, iNormalizeMetaState, -1650998592, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int touchSlop = 876 - (ViewConfiguration.getTouchSlop() >> 8);
            int iRed = Color.red(0) + 10;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            c(b4, (byte) (b4 | 52), b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, touchSlop, iRed, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = f1412a + 123;
            d = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int packedPositionChild = 875 - ExpandableListView.getPackedPositionChild(0L);
                int iResolveOpacity = 10 - Drawable.resolveOpacity(0, 0);
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                c(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, packedPositionChild, iResolveOpacity, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i6 = ~((int) Runtime.getRuntime().maxMemory());
            int i7 = ((1699803170 + ((~((-272629969) | i6)) * (-783))) + (((~(i6 | (-274469629))) | (-314779858)) * 783)) - 881697949;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(null, null, 127 - (KeyEvent.getMaxKeyCode() >> 16), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(null, null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = d + 9;
                f1412a = i10 % 128;
                if (i10 % 2 == 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(null, null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(null, null, ExpandableListView.getPackedPositionGroup(0L) + 127, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -881697949};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[5];
                byte b8 = b7;
                Object[] objArr13 = new Object[1];
                f(b7, b8, (byte) (b8 - 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b9 = bArr2[5];
                byte b10 = (byte) (b9 - 1);
                Object[] objArr14 = new Object[1];
                f(b10, b10, b9, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        int doubleTapTimeout = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte b11 = $$a[7];
                        byte b12 = b11;
                        Object[] objArr15 = new Object[1];
                        c(b11, b12, b12, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter, doubleTapTimeout, iIndexOf, 2012931276, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(null, null, TextUtils.getTrimmedLength("") + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(null, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
                            int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            byte b13 = $$a[7];
                            byte b14 = b13;
                            Object[] objArr18 = new Object[1];
                            c(b14, (byte) (b14 | 52), b13, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, absoluteGravity, pressedStateDuration, 2012020043, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                            int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                            int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0');
                            byte[] bArr3 = $$a;
                            byte b15 = bArr3[5];
                            Object[] objArr19 = new Object[1];
                            c(b15, (byte) (b15 | 88), bArr3[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(threadPriority, threadPriority2, iLastIndexOf, -1650998592, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i11 = ((int[]) objArr[c])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i14 = ~iIdentityHashCode;
            int i15 = i13 + 1558849364 + ((iIdentityHashCode | 541362596) * 988) + (((~(583847868 | i14)) | (-586022912)) * (-1976)) + (((~(iIdentityHashCode | 543537639)) | 541362596 | (~((-543537640) | i14))) * 988);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr20[1])[0] = i17 ^ (i17 << 5);
            return;
        }
        int[] iArr = new int[i12];
        int i18 = i12 - 1;
        iArr[i18] = 1;
        Toast.makeText((Context) null, iArr[((i12 * i18) % 2) - 1], 1).show();
        int i19 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iMyTid2 = Process.myTid();
        int i20 = i19 + (-208210156) + (((~((-600762096) | iMyTid2)) | 42477285) * 1504) + ((~(iMyTid2 | (-558284811))) * (-1504)) + 787193184;
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr21[1])[0] = i22 ^ (i22 << 5);
    }

    public static /* synthetic */ User b(toLanguageTag tolanguagetag) {
        int i = 2 % 2;
        int i2 = f1412a + 51;
        d = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) tolanguagetag.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = d + 33;
        f1412a = i4 % 128;
        if (i4 % 2 != 0) {
            return userAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        INotificationSideChannel = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        int i = notify + 95;
        INotificationSideChannel = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getA() {
        int i = 2 % 2;
        int i2 = d + 1;
        int i3 = i2 % 128;
        f1412a = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 1;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.fragment_asik_active_update_secondary_data;
        }
        throw null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        int i = 2 % 2;
        int i2 = d + 15;
        f1412a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(2028227993, -2028227992, new Object[]{this}, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        int i = 2 % 2;
        int i2 = d + 57;
        f1412a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        int i = 2 % 2;
        int i2 = f1412a + 5;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = d + 5;
        f1412a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = d + 45;
        f1412a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-688091623, 688091623, new Object[]{this}, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{47222, 47209, 47219, 47205, 47208, 47214, 47145, 47204, 47172, 47262, 47203, 47218, 47210, 47188, 47211, 47220, 47212, 47207, 47173, 47190, 47201, 47171, 47215, 47202, 47213, 47216, 47183};
        b = 2047719447;
        asInterface = true;
        asBinder = true;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = d + 115;
        f1412a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, short r6, byte r7) {
        /*
            byte[] r0 = defpackage.toLanguageTag.$$c
            int r5 = r5 + 4
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r7 = r7 + 67
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L12
            r7 = r5
            r3 = r6
            goto L27
        L12:
            r4 = r7
            r7 = r5
            r5 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            if (r2 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
        L27:
            int r3 = -r3
            int r5 = r5 + r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.toLanguageTag.$$g(byte, short, byte):java.lang.String");
    }
}
