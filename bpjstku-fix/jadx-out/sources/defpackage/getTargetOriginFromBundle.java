package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.databinding.FragmentSalariedWorkerPhoneNumberVerificationBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity;
import com.bpjstku.presentation.membership.registration.newregistration.VerificationRequestType;
import com.bpjstku.presentation.membership.registration.registeredmember.SalariedWorkerRegistrationActivity;
import com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPhoneNumberVerificationFragment$bindingInflater$1;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import com.google.android.material.button.MaterialButton;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getFocusY;
import defpackage.getUntrustedCreatorPackageName;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import defpackage.setSplitTrack;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0015\u0010\u000f\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0012\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0019\u001a\u00020\u001c8\u0015X\u0095D¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR.\u0010$\u001a\u001c\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"LgetTargetOriginFromBundle;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentSalariedWorkerPhoneNumberVerificationBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "TuitionPaymentFragmentbindingInflater1", "()Ljava/lang/String;", "LsetSplitTrack;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/Lazy;", "LgetUntrustedCreatorPackageName;", "a", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "b", "", "I", "asBinder", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getTargetOriginFromBundle extends AutoValue_ImmutableImageInfo<FragmentSalariedWorkerPhoneNumberVerificationBinding> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private CodeNamePair b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.b = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.b.invoke(obj);
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    /* JADX INFO: renamed from: getTargetOriginFromBundle$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LgetTargetOriginFromBundle$b;", "", "<init>", "()V", "LgetTargetOriginFromBundle;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LgetTargetOriginFromBundle;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$c = {15, -9, 64, -81};
        private static final int $$f = 107;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {36, -74, -79, -21, 52, -17, 5, 6, -28, 33, -2, -13, -4, 12, -36, 36, 3, -4, -39, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -12, 64, 33, -12, 11, -11, 6, -1, -30, 17, 24, -12, -8, 9, 6, -46, 44, -17, 6, 6, -8, 9, 6, -18, 7, 5, -10, 5, 5, -7, -30, 37, -8, 6, -11, 19, -15, 13, -65};
        private static final int $$e = 203;
        private static final byte[] $$a = {118, 35, -100, -35, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
        private static final int $$b = 106;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static long b = -6377398940819159759L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 6378;

        private static void a(int i, int i2, int i3, Object[] objArr) {
            int i4 = (i * 52) + 4;
            int i5 = 98 - (i3 * 14);
            int i6 = i2 * 52;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i6 + 1];
            int i7 = -1;
            if (bArr == null) {
                i7 = -1;
                i5 = (i5 + i4) - 11;
                i4++;
            }
            while (true) {
                int i8 = i7 + 1;
                bArr2[i8] = (byte) i5;
                if (i8 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i9 = i5;
                int i10 = i4 + 1;
                i7 = i8;
                i5 = (i9 + bArr[i4]) - 11;
                i4 = i10;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r0 = 41 - r6
                byte[] r1 = defpackage.getTargetOriginFromBundle.Companion.$$d
                int r7 = r7 * 19
                int r7 = r7 + 65
                int r8 = r8 + 4
                byte[] r0 = new byte[r0]
                int r6 = 40 - r6
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2f
            L16:
                r3 = r2
            L17:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L26:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2f:
                int r7 = r7 + r8
                r8 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.getTargetOriginFromBundle.Companion.d(byte, byte, byte, java.lang.Object[]):void");
        }

        private Companion() {
        }

        private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            char c2;
            int i2 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr.length;
            char[] cArr5 = new char[length2];
            int i3 = 0;
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            int i4 = $10 + 25;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i6 = $10 + 37;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c3 = (char) (8329 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int iLastIndexOf = 1234 - TextUtils.lastIndexOf("", '0', i3, i3);
                        int iMyTid = 35 - (Process.myTid() >> 22);
                        byte b2 = (byte) ($$f & 6);
                        byte b3 = (byte) (b2 - 3);
                        String str$$g = $$g(b2, b3, (byte) (b3 + 1));
                        Class[] clsArr = new Class[1];
                        clsArr[i3] = Object.class;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, iLastIndexOf, iMyTid, -653973969, false, str$$g, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) i3;
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getCapsMode("", i3, i3), 2764 - (Process.myTid() >> 22), 14 - (KeyEvent.getMaxKeyCode() >> 16), 1504416861, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 252 - TextUtils.lastIndexOf("", '0', 0, 0), View.MeasureSpec.getMode(0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char scrollDefaultDelay = (char) (65200 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                                    int iIndexOf = 2891 - TextUtils.indexOf("", "");
                                    int scrollBarFadeDuration = 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    byte b6 = (byte) ($$f & 5);
                                    byte b7 = (byte) (-b6);
                                    String str$$g2 = $$g(b6, b7, (byte) (b7 + 1));
                                    c2 = 2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollDefaultDelay, iIndexOf, scrollBarFadeDuration, 2012627446, false, str$$g2, new Class[]{Integer.TYPE, Integer.TYPE});
                                } else {
                                    c2 = 2;
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = sessionProcessor.b;
                                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                                i3 = 0;
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
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr6);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0275  */
        /* JADX WARN: Code duplicated, block: B:27:0x0277  */
        @JvmStatic
        public final getTargetOriginFromBundle TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char touchSlop = (char) (37567 - (ViewConfiguration.getTouchSlop() >> 8));
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 625;
                int iArgb = Color.argb(0, 0, 0, 0) + 14;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, iResolveOpacity, iArgb, -477065106, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{33326, 11716, 49482, 19706}, (char) View.MeasureSpec.getMode(0), View.resolveSize(0, 0), new char[]{18875, 53578, 31927, 1495, 24725, 31533, 13385, 25520, 43394, 15493, 21871, 41431, 18748, 52619, 47522, 56014, 33510, 27651, 51835, 39349, 29114, 34863}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{41818, 29154, 8699, 9685}, (char) (54560 - TextUtils.indexOf((CharSequence) "", '0', 0)), (-76422494) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{58490, 36908, 46253, 12534, 29395, 22385, 40081, 56197, 737, 41104, 17495, 12854, 54015, 45856, 14319}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cLastIndexOf = (char) (37566 - TextUtils.lastIndexOf("", '0', 0));
                int iAlpha = Color.alpha(0) + 625;
                int bitsPerPixel = 13 - ImageFormat.getBitsPerPixel(0);
                byte[] bArr = $$a;
                byte b4 = bArr[7];
                byte b5 = (byte) (-bArr[5]);
                Object[] objArr5 = new Object[1];
                a(b4, b5, b5, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iAlpha, bitsPerPixel, -976899241, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 37567);
                    int i4 = 626 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i5 = 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b6 = (byte) (-$$a[5]);
                    byte b7 = b6;
                    Object[] objArr6 = new Object[1];
                    a(b6, b7, b7, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i4, i5, -973632554, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i6 = ((int[]) objArr7[2])[0];
                int i7 = ((int[]) objArr7[0])[0];
                String[] strArr = (String[]) objArr7[3];
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i8 = (~((-1207441670) | startUptimeMillis)) | 79171585;
                int i9 = ~startUptimeMillis;
                int i10 = (-1662073218) + ((i8 | (~(1744566535 | i9))) * 886) + (((~(i9 | 1207441669)) | 616296451) * (-1772)) + ((~(i9 | 616296451)) * 886) + 1328051224;
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
                ((int[]) objArr[1])[0] = i12 ^ (i12 << 5);
                objArr = new Object[]{new int[]{i7}, new int[1], new int[]{i6}, strArr};
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{54677, 28176, 3359, 63854}, (char) ((Process.myTid() >> 22) + 28173), Color.red(0), new char[]{9293, 43500, 51608, 23589, 64249, 2702, 12501, 11646, 49107, 14042, 13782, 45770, 11314, 24921, 12144, 25677, 11342, 57282, 15087, 61028, 14741, 40060, 9186, 1510, 65023, 39927}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{32236, 45087, 32266, 12170}, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 35454), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, new char[]{48301, 5172, 33083, 61438, 15924, 6134, 13670, 62318, 24750, 45836, 19828, 31273, 12200, 15822, 21259, 25676, 61600, 63933}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
                        TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i14 = 0 / 0;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{21120, 47450, 62709, 1208}, (char) (47348 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), KeyEvent.keyCodeFromString(""), new char[]{14293, 46826, 2768, 63400, 34750, 6143, 3765, 11182, 59985, 32872, 4901, 1186, 48289, 47359, 58517, 65088}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{28859, 31000, 18637, 28257}, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 24903), Process.myTid() >> 22, new char[]{39474, 20832, 59642, 21639, 39613, 51891, 58202, 16684, 35875, 27317, 6247, 20069, 46366, 13440, 6386, 61795}, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr12 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{6548, 50693, 14617, 14277}, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), Color.argb(0, 0, 0, 0), new char[]{36916, 52231, 8153, 43300, 21137, 19906, 24969, 12274, 55222, 16019, 60233, 33651, 22230, 47464, 31663, 31601, 29235, 62906, 26517, 3247, 55929, 38065, 15042, 47346, 25936, 19931, 54045, 44203, 53819, 55870, 64567, 43525, 22773, 41273, 18837, 2338, 30061, 53672, 50970, 28279, 5836, 49457, 7248, 11029, 39226, 12968, 20544, 32068, 7630, 41973, 31677, 3487, 61631, 10532, 8790, 53836, 20155, 16156, 63934, 40037, 48836, 7803, 26812, 18651}, objArr12);
                String str = (String) objArr12[0];
                Object[] objArr13 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{22599, 21877, 65511, 26160}, (char) KeyEvent.keyCodeFromString(""), ViewConfiguration.getMaximumFlingVelocity() >> 16, new char[]{62348, 45422, 44297, 18027, 18768, 22052, 15988, 59411, 39004, 41036, 35122, 45866, 23933, 59167, 203, 55649, 52606, 28708, 26125, 42162, 47860, 59863, 49787, 29661, 48794, 4934, 46632, 31078, 64713, 47387, 35428, 20520, 22026, 14761, 23138, 976, 12394, 19885, 9256, 52143, 3776, 59772, 9466, 62966, 2708, 27638, 1301, 36678, 32790, 43821, 17366, 7247, 26305, 35412, 5595, 21219, 47016, 14889, 40619, 48176, 40357, 61015, 56041, 58908}, objArr13);
                String[] strArr2 = {str, (String) objArr13[0]};
                int i15 = TuitionPaymentFragmentbindingInflater1 + 103;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                int i16 = i15 % 2;
                try {
                    Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 1328051224};
                    byte[] bArr2 = $$d;
                    byte b8 = bArr2[49];
                    byte b9 = (byte) (b8 + 1);
                    Object[] objArr15 = new Object[1];
                    d(b9, b9, b8, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    byte b10 = (byte) (-bArr2[49]);
                    Object[] objArr16 = new Object[1];
                    d(b10, b10, (byte) (-bArr2[18]), objArr16);
                    Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                    int i17 = ((int[]) objArr17[0])[0];
                    int i18 = ((int[]) objArr17[2])[0];
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37568);
                            int minimumFlingVelocity = 625 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int mirror = '>' - AndroidCharacter.getMirror('0');
                            byte b11 = (byte) (-$$a[5]);
                            byte b12 = b11;
                            Object[] objArr18 = new Object[1];
                            a(b11, b12, b12, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, minimumFlingVelocity, mirror, -973632554, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                        try {
                            Object[] objArr19 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{33326, 11716, 49482, 19706}, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.getOffsetAfter("", 0), new char[]{18875, 53578, 31927, 1495, 24725, 31533, 13385, 25520, 43394, 15493, 21871, 41431, 18748, 52619, 47522, 56014, 33510, 27651, 51835, 39349, 29114, 34863}, objArr19);
                            Class<?> cls5 = Class.forName((String) objArr19[0]);
                            Object[] objArr20 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{41818, 29154, 8699, 9685}, (char) (Color.red(0) + 54561), Drawable.resolveOpacity(0, 0) - 76422493, new char[]{58490, 36908, 46253, 12534, 29395, 22385, 40081, 56197, 737, 41104, 17495, 12854, 54015, 45856, 14319}, objArr20);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cLastIndexOf2 = (char) (37566 - TextUtils.lastIndexOf("", '0', 0, 0));
                                int iResolveSize = View.resolveSize(0, 0) + 625;
                                int maximumFlingVelocity = 14 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                byte[] bArr3 = $$a;
                                byte b13 = bArr3[7];
                                byte b14 = (byte) (-bArr3[5]);
                                Object[] objArr21 = new Object[1];
                                a(b13, b14, b14, objArr21);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf2, iResolveSize, maximumFlingVelocity, -976899241, false, (String) objArr21[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 37567);
                                int iIndexOf = TextUtils.indexOf("", "", 0) + 625;
                                int i19 = 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                byte b15 = $$a[7];
                                byte b16 = b15;
                                Object[] objArr22 = new Object[1];
                                a(b15, b16, b16, objArr22);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, iIndexOf, i19, -477065106, false, (String) objArr22[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr17;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i20 = ((int[]) objArr[0])[0];
            int i21 = ((int[]) objArr[2])[0];
            if (i21 == i20) {
                int i22 = ((int[]) objArr[1])[0];
                int i23 = ((int[]) objArr[2])[0];
                int i24 = ((int[]) objArr[0])[0];
                String[] strArr3 = (String[]) objArr[3];
                int[] iArr = {i23};
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i25 = ~iFreeMemory;
                int i26 = i22 + (-577033532) + ((iFreeMemory | 82564) * 988) + (((~(752178069 | i25)) | 319464546) * (-1976)) + (((~(iFreeMemory | (-1071560052))) | 82564 | (~(1071560051 | i25))) * 988);
                int i27 = (i26 << 13) ^ i26;
                int i28 = i27 ^ (i27 >>> 17);
                ((int[]) objArr[1])[0] = i28 ^ (i28 << 5);
                Object[] objArr23 = {new int[]{i24}, new int[1], iArr, strArr3};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr4 = (String[]) objArr[3];
                if (strArr4 != null) {
                    int i29 = 0;
                    while (i29 < strArr4.length) {
                        arrayList.add(strArr4[i29]);
                        i29++;
                        int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
                        TuitionPaymentFragmentbindingInflater1 = i30 % 128;
                        int i31 = i30 % 2;
                    }
                }
                Toast.makeText((Context) null, i21 / (((i21 - 1) * i21) % 2), 0).show();
                int i32 = ((int[]) objArr[1])[0];
                int i33 = ((int[]) objArr[2])[0];
                int i34 = ((int[]) objArr[0])[0];
                String[] strArr5 = (String[]) objArr[3];
                int i35 = (~((int) Runtime.getRuntime().totalMemory())) | 122776543;
                int i36 = i32 + 1172476560 + (i35 * 495) + (((~i35) | 88082697) * 495);
                int i37 = (i36 << 13) ^ i36;
                int i38 = i37 ^ (i37 >>> 17);
                ((int[]) objArr[1])[0] = i38 ^ (i38 << 5);
                Object[] objArr24 = {new int[]{i34}, new int[1], new int[]{i33}, strArr5};
            }
            return new getTargetOriginFromBundle();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static String $$g(byte b2, int i, byte b3) {
            int i2 = 104 - b2;
            int i3 = i + 4;
            int i4 = b3 * 4;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i4 + 1];
            int i5 = -1;
            if (bArr == null) {
                int i6 = i3 + (-i4);
                i3 = i3;
                i2 = i6;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i2;
                int i7 = i3 + 1;
                if (i5 == i4) {
                    return new String(bArr2, 0);
                }
                i3 = i7;
                i2 += -bArr[i7];
            }
        }
    }

    public getTargetOriginFromBundle() {
        final getTargetOriginFromBundle gettargetoriginfrombundle = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPhoneNumberVerificationFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = gettargetoriginfrombundle;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(setSplitTrack.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        final getTargetOriginFromBundle gettargetoriginfrombundle2 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPhoneNumberVerificationFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = gettargetoriginfrombundle2.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPhoneNumberVerificationFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                return getFocusY.b(gettargetoriginfrombundle2, Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: CustomTabsServiceConnection
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((getUntrustedCreatorPackageName) this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.getValue();
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.fragment_salaried_worker_phone_number_verification;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentSalariedWorkerPhoneNumberVerificationBinding> d() {
        return SalariedWorkerPhoneNumberVerificationFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentSalariedWorkerPhoneNumberVerificationBinding fragmentSalariedWorkerPhoneNumberVerificationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentSalariedWorkerPhoneNumberVerificationBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CustomTabsServiceFilePurpose
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getTargetOriginFromBundle.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, fragmentSalariedWorkerPhoneNumberVerificationBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        fragmentSalariedWorkerPhoneNumberVerificationBindingINotificationSideChannelStub.tvPrefix.setOnClickListener(new View.OnClickListener() { // from class: CustomTabsServiceResult
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getTargetOriginFromBundle.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, fragmentSalariedWorkerPhoneNumberVerificationBindingINotificationSideChannelStub, view);
            }
        });
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        EditText editText = INotificationSideChannelStub().edtPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(editText, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(editText, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
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

    private final String TuitionPaymentFragmentbindingInflater1() {
        String strReplace$default = StringsKt.replace$default(StringsKt.trim((CharSequence) INotificationSideChannelStub().tvPrefix.getText().toString()).toString(), "+", "", false, 4, (Object) null);
        String string = StringsKt.trim((CharSequence) INotificationSideChannelStub().edtPhoneNumber.getText().toString()).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(strReplace$default);
        sb.append(string);
        return sb.toString();
    }

    public static /* synthetic */ void b(final getTargetOriginFromBundle gettargetoriginfrombundle, final FragmentSalariedWorkerPhoneNumberVerificationBinding fragmentSalariedWorkerPhoneNumberVerificationBinding, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getItemView.Companion companion = getItemView.INSTANCE;
            getItemView getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getItemView.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gettargetoriginfrombundle.b, new Function1() { // from class: CustomTabsServiceRelation
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getTargetOriginFromBundle.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, fragmentSalariedWorkerPhoneNumberVerificationBinding, (CodeNamePair) obj);
                }
            });
            FragmentManager childFragmentManager = gettargetoriginfrombundle.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(childFragmentManager, getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0099  */
    /* JADX WARN: Code duplicated, block: B:6:0x0053  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getTargetOriginFromBundle gettargetoriginfrombundle, FragmentSalariedWorkerPhoneNumberVerificationBinding fragmentSalariedWorkerPhoneNumberVerificationBinding, View view) {
        int length;
        Intrinsics.checkNotNullParameter(view, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, gettargetoriginfrombundle.requireContext());
        fragmentSalariedWorkerPhoneNumberVerificationBinding.salariedWorkerPhoneNumberContainer.requestFocus();
        if (Intrinsics.areEqual(StringsKt.trim((CharSequence) fragmentSalariedWorkerPhoneNumberVerificationBinding.tvPrefix.getText().toString()).toString(), "+62")) {
            String string = StringsKt.trim((CharSequence) fragmentSalariedWorkerPhoneNumberVerificationBinding.edtPhoneNumber.getText().toString()).toString();
            Intrinsics.checkNotNullParameter(string, "");
            if (new Regex("^(?![01234579]|61|6[23456789]|60|0[1-7]|09)\\d{9,14}$").matches(string)) {
                length = StringsKt.trim((CharSequence) fragmentSalariedWorkerPhoneNumberVerificationBinding.edtPhoneNumber.getText().toString()).toString().length();
                if (4 <= length || length >= 16) {
                    String string2 = gettargetoriginfrombundle.getString(R.string.error_format_phone_number);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string2, 0).show();
                } else {
                    setSplitTrack setsplittrack = (setSplitTrack) gettargetoriginfrombundle.TuitionPaymentFragmentbindingInflater1.getValue();
                    String strTuitionPaymentFragmentbindingInflater1 = gettargetoriginfrombundle.TuitionPaymentFragmentbindingInflater1();
                    RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) gettargetoriginfrombundle.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str = registeredMemberRegistration != null ? registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1 : null;
                    setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new PhoneVerificationRequest(strTuitionPaymentFragmentbindingInflater1, str != null ? str : ""));
                }
            } else {
                String string3 = gettargetoriginfrombundle.getString(R.string.error_format_phone_number);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string3, 0).show();
            }
        } else {
            length = StringsKt.trim((CharSequence) fragmentSalariedWorkerPhoneNumberVerificationBinding.edtPhoneNumber.getText().toString()).toString().length();
            if (4 <= length) {
                String string4 = gettargetoriginfrombundle.getString(R.string.error_format_phone_number);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string4, 0).show();
            } else {
                String string5 = gettargetoriginfrombundle.getString(R.string.error_format_phone_number);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string5, 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getTargetOriginFromBundle gettargetoriginfrombundle, FragmentSalariedWorkerPhoneNumberVerificationBinding fragmentSalariedWorkerPhoneNumberVerificationBinding, CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        gettargetoriginfrombundle.b = codeNamePair;
        fragmentSalariedWorkerPhoneNumberVerificationBinding.tvPhoneExample.setVisibility(Intrinsics.areEqual(codeNamePair.b, "+62") ? 0 : 8);
        if (codeNamePair.b.length() > 0) {
            fragmentSalariedWorkerPhoneNumberVerificationBinding.tvPrefix.setText(codeNamePair.b);
        } else {
            String string = gettargetoriginfrombundle.getString(R.string.label_dialcode_empty);
            Intrinsics.checkNotNullExpressionValue(string, "");
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(getTargetOriginFromBundle gettargetoriginfrombundle, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        Citizenship citizenship;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            gettargetoriginfrombundle.IconCompatParcelizer();
            str = "loading_registration_account_step_third_result";
        } else {
            String strName = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                gettargetoriginfrombundle.write();
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) gettargetoriginfrombundle.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                ((getUntrustedCreatorPackageName) gettargetoriginfrombundle.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.setValue(registeredMemberRegistration != null ? RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, gettargetoriginfrombundle.TuitionPaymentFragmentbindingInflater1(), null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, null, null, null, null, null, null, null, null, 8380159) : null);
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) gettargetoriginfrombundle.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                if (registeredMemberRegistration2 != null && (citizenship = registeredMemberRegistration2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != null) {
                    strName = citizenship.name();
                }
                if (Intrinsics.areEqual(strName, "WNI")) {
                    NewRegistrationActivity newRegistrationActivity = (NewRegistrationActivity) gettargetoriginfrombundle.getActivity();
                    if (newRegistrationActivity != null) {
                        newRegistrationActivity.b(VerificationRequestType.PHONE);
                    }
                } else {
                    SalariedWorkerRegistrationActivity salariedWorkerRegistrationActivity = (SalariedWorkerRegistrationActivity) gettargetoriginfrombundle.getActivity();
                    if (salariedWorkerRegistrationActivity != null) {
                        salariedWorkerRegistrationActivity.b(VerificationRequestType.PHONE);
                    }
                }
                str = "success_registration_account_step_third_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                gettargetoriginfrombundle.write();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                String string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                String string2 = gettargetoriginfrombundle.getString(R.string.error_phone_number_not_match);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                if (StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String string3 = gettargetoriginfrombundle.getString(R.string.title_phone_number_not_match);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    String string4 = gettargetoriginfrombundle.getString(R.string.message_phone_number_not_match);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    String string5 = gettargetoriginfrombundle.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string3, string4, string5, new Function0() { // from class: getApplicationContext
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    }, 96);
                    FragmentManager childFragmentManager = gettargetoriginfrombundle.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    getTargetOriginFromBundle gettargetoriginfrombundle2 = gettargetoriginfrombundle;
                    String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    Intrinsics.checkNotNullParameter(gettargetoriginfrombundle2, "");
                    Intrinsics.checkNotNullParameter(strValueOf, "");
                    BaseActivity baseActivity = (BaseActivity) gettargetoriginfrombundle2.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
                    }
                }
                str = "failure_registration_account_step_third_result";
            } else {
                str = "";
            }
        }
        FragmentActivity activity = gettargetoriginfrombundle.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        ((setSplitTrack) this.TuitionPaymentFragmentbindingInflater1.getValue()).IconCompatParcelizer.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: requestPostMessageChannelWithExtras
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getTargetOriginFromBundle.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        MembershipType membershipType;
        String str;
        String strSubstring;
        String strSubstring2;
        String str2;
        String str3;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        String strName = null;
        if (registeredMemberRegistration != null && (str = registeredMemberRegistration.g) != null && str.length() > 0) {
            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            if (registeredMemberRegistration2 == null || (str3 = registeredMemberRegistration2.g) == null) {
                strSubstring = null;
            } else {
                strSubstring = str3.substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            }
            RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            if (registeredMemberRegistration3 == null || (str2 = registeredMemberRegistration3.g) == null) {
                strSubstring2 = null;
            } else {
                strSubstring2 = str2.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            }
            INotificationSideChannelStub().tvPrefix.setText("+".concat(String.valueOf(strSubstring)));
            INotificationSideChannelStub().edtPhoneNumber.setText(strSubstring2);
        }
        RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        if (registeredMemberRegistration4 != null && (membershipType = registeredMemberRegistration4.TuitionPaymentFragmentspecialinlinedviewModeldefault2) != null) {
            strName = membershipType.name();
        }
        if (!Intrinsics.areEqual(strName, "PMI")) {
            TextView textView = INotificationSideChannelStub().tvPrefix;
            textView.setClickable(false);
            textView.setFocusable(false);
            textView.setEnabled(false);
            return;
        }
        TextView textView2 = INotificationSideChannelStub().tvPrefix;
        textView2.setClickable(true);
        textView2.setFocusable(true);
        textView2.setEnabled(true);
    }
}
