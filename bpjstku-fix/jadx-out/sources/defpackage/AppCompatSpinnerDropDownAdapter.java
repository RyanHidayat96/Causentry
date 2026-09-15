package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.devicebinding.model.request.CheckMembershipRequest;
import com.bpjstku.data.devicebinding.model.response.CheckMembershipResponse;
import com.bpjstku.data.devicebinding.model.response.LivenessBeginResponse;
import com.bpjstku.data.devicebinding.model.response.LivenessEndResponse;
import com.bpjstku.data.devicebinding.model.response.SendEmailOtpResponse;
import com.bpjstku.data.devicebinding.model.response.SubmitDeviceBindingResponse;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class AppCompatSpinnerDropDownAdapter extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<onRestoreInstanceState>> TuitionPaymentFragmentbindingInflater1;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<LivenessBeginResponse>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData<VirtualCameraAdapter1<LivenessEndResponse>> f66a;
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> asBinder;
    public final MutableLiveData<VirtualCameraAdapter1<SubmitDeviceBindingResponse>> asInterface;
    public final MutableLiveData<VirtualCameraAdapter1<CheckMembershipResponse>> b;
    public final MutableLiveData<VirtualCameraAdapter1<SendEmailOtpResponse>> d;
    public final registerlambda1 g;
    private static final byte[] $$c = {59, -124, -78, 46};
    private static final int $$f = 123;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {86, -48, ByteCompanionObject.MIN_VALUE, 88, 39, -36, 39, 10, 16, -19, 42, -5, 22, 8, -6, 7, -25, 38, 19, 8, -2, 7, 10, 16, -20, 39, -36, 39, 10, 16, -19, 42, -5, 22, 8, -6, 7, -23, 57, -9, 17, 14, -36, 33, 21, -2, 16, 1, 21, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, -10, 15, 13, -2, 13, 13, 1, -22, 45, 0, 14, -3, 27, -7, 21, -57};
    private static final int $$e = 141;
    private static final byte[] $$a = {97, 58, 103, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 206;
    private static int cancelAll = 0;
    private static int onTransact = 1;
    private static char[] cancel = {36580, 18245, 7613, 54269, 43090, 32394, 13557, 3433, 50074, 39400, 28263, 9388, 64212, 45856, 35189, 24530, 5128, 59976, 41173, 30976, 20350, 1448, 45561, 30814, 8865, 60646, 38743, 16799, 3052, 12812, 64649, 42723, 20796, 7058, 50653, 35879, 46717};
    private static long INotificationSideChannel = -704291103593039822L;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = ~(i7 | i8 | i2);
        int i10 = ~i2;
        int i11 = i9 | (~(i7 | i10 | i4));
        int i12 = (~(i2 | i8)) | i7 | (~(i10 | i4));
        int i13 = i + i4 + i5 + (1112421973 * i3) + ((-1897213938) * i6);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i) - 781189120) + ((-1395624931) * i4) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i5) + ((-1446510592) * i3) + (892338176 * i6) + ((-1657864192) * i14);
        int i16 = (i * 2010092721) + 1217064380 + (i4 * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i5 * 2010091741) + (i3 * (-1378896031)) + (i6 * 856652822) + (i14 * 563281920);
        int i17 = i15 + (i16 * i16 * (-1077346304));
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i17 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i17 == 3) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i17 != 4) {
            return i17 != 5 ? b(objArr) : g(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.AppCompatSpinnerDropDownAdapter.$$a
            int r8 = r8 * 15
            int r1 = 53 - r8
            int r7 = r7 * 3
            int r7 = r7 + 84
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r4 = -r4
            int r6 = r6 + r4
            int r7 = r7 + 1
            int r6 = r6 + (-11)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AppCompatSpinnerDropDownAdapter.c(byte, short, byte, java.lang.Object[]):void");
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
    private static void f(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 5
            int r7 = 84 - r7
            int r8 = r8 * 8
            int r0 = 46 - r8
            byte[] r1 = defpackage.AppCompatSpinnerDropDownAdapter.$$d
            int r6 = r6 * 45
            int r6 = 48 - r6
            byte[] r0 = new byte[r0]
            int r8 = 45 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L31:
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AppCompatSpinnerDropDownAdapter.f(byte, int, byte, java.lang.Object[]):void");
    }

    public AppCompatSpinnerDropDownAdapter(r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        this.g = registerlambda1Var;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<CheckMembershipResponse>> mutableLiveData = new MutableLiveData<>();
        this.b = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<SendEmailOtpResponse>> mutableLiveData2 = new MutableLiveData<>();
        this.d = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData3 = new MutableLiveData<>();
        this.asBinder = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<SubmitDeviceBindingResponse>> mutableLiveData4 = new MutableLiveData<>();
        this.asInterface = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<onRestoreInstanceState>> mutableLiveData5 = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<LivenessBeginResponse>> mutableLiveData6 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData6;
        MutableLiveData<VirtualCameraAdapter1<LivenessEndResponse>> mutableLiveData7 = new MutableLiveData<>();
        this.f66a = mutableLiveData7;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        mutableLiveData2.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData3.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData4.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData5.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData6.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData7.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $10 + 105;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(cancel[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.getDeadChar(0, 0), (Process.myPid() >> 22) + 2187, 40 - (ViewConfiguration.getFadingEdgeLength() >> 16), 841711447, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(INotificationSideChannel), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char mode = (char) (View.MeasureSpec.getMode(0) + 33017);
                    int fadingEdgeLength = 3011 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int trimmedLength = TextUtils.getTrimmedLength("") + 26;
                    byte b3 = (byte) ($$f & 6);
                    byte b4 = (byte) (b3 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, fadingEdgeLength, trimmedLength, 321985076, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 36505);
                    int i7 = 3376 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 17;
                    byte b5 = (byte) ($$f & 5);
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, i7, scrollBarSize, -968507904, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i8 = $10 + 115;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 36505);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3376;
                int defaultSize = View.getDefaultSize(0, 0) + 17;
                byte b7 = (byte) ($$f & 5);
                byte b8 = (byte) (b7 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, maximumDrawingCacheSize, defaultSize, -968507904, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (((CharSequence) objectRef.element).length() != 0) {
            b((String) objectRef.element, str);
            return;
        }
        Intrinsics.checkNotNull(FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: getCompoundDrawableTintMode
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) throws Throwable {
                AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objectRef, this, str, task);
            }
        }));
        int i2 = cancelAll + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter = (AppCompatSpinnerDropDownAdapter) objArr[0];
        String str = (String) objArr[1];
        CheckMembershipRequest checkMembershipRequest = (CheckMembershipRequest) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(checkMembershipRequest, "");
        MutableLiveData<VirtualCameraAdapter1<CheckMembershipResponse>> mutableLiveData = appCompatSpinnerDropDownAdapter.b;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, checkMembershipRequest)));
        final Function1 function1 = new Function1() { // from class: getDropDownView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (CheckMembershipResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: areAllItemsEnabled
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                AppCompatSpinnerDropDownAdapter.notify(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: AppCompatSpinnerSavedState
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppCompatSpinnerDropDownAdapter.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: AppCompatTextClassifierHelper
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentbindingInflater1(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i2 = cancelAll + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        final AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter = (AppCompatSpinnerDropDownAdapter) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        MutableLiveData<VirtualCameraAdapter1<SendEmailOtpResponse>> mutableLiveData = appCompatSpinnerDropDownAdapter.d;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str)));
        final Function1 function1 = new Function1() { // from class: setHorizontalOriginalOffset
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (SendEmailOtpResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: registerDataSetObserver
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                Object[] objArr2 = {function1, obj};
                AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-186431215, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr2, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 186431218, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        };
        final Function1 function2 = new Function1() { // from class: computeContentWidth
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {57, -56, 23, -36, 12, -11, 13, -4, -7, -6, -55, 68, 1, -6, -1, -2, 2, 1, -71, 71, -67, -7, 62, -9, -2, 4, -9, -52, 30, 23, -2, 4, -9, -32, 47, -4, 7, -5, -15, 12, -48, 43, -3, 2, -16, 18, -52, 46, -8, -56, 3, -19, 46, 33, -20, 16, -17, 14, -10, 6, 3, -12, 5, -2, -44, 29, 10, -1, -11, -2, 1, 7, -28, 33, -4, 8, 0, 32, -13, 10, -12, 5, -2, -31, 16, 23, -13, -9, 8, 5, -47, 43, -18, 5, 5, -9, 8, 5, -2, -4, -12, -3, 5, -9, 10, -4, 4, -3, -4, 4, -10, -2, 17, -14, -5, 17, -43, 33, -12, 0, 6, -9, 0, 0, -6, 19, -10, 7, -66};
            private static final int $$e = 77;
            private static final byte[] $$a = {59, -124, -78, 46, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
            private static final int $$b = 241;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6730440991607333569L;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r5, short r6, short r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = defpackage.computeContentWidth.$$a
                    int r1 = r5 + 1
                    int r7 = r7 * 3
                    int r7 = 100 - r7
                    int r6 = r6 * 10
                    int r6 = r6 + 4
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r5
                    r7 = r6
                    r4 = r2
                    goto L27
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r5) goto L25
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L25:
                    r3 = r0[r6]
                L27:
                    int r3 = -r3
                    int r6 = r6 + 1
                    int r7 = r7 + r3
                    int r7 = r7 + (-5)
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.computeContentWidth.a(short, short, short, java.lang.Object[]):void");
            }

            private static void c(int i2, short s, int i3, Object[] objArr2) {
                byte[] bArr = $$d;
                int i4 = (s * 13) + 84;
                int i5 = i3 * 21;
                int i6 = 77 - (i2 * 73);
                byte[] bArr2 = new byte[i5 + 53];
                int i7 = i5 + 52;
                int i8 = -1;
                if (bArr == null) {
                    i6++;
                    i4 = i4 + i6 + 1;
                }
                while (true) {
                    i8++;
                    bArr2[i8] = (byte) i4;
                    if (i8 == i7) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    } else {
                        byte b = bArr[i6];
                        i6++;
                        i4 = i4 + b + 1;
                    }
                }
            }

            private static void b(char[] cArr, int i2, Object[] objArr2) throws Throwable {
                int i3 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                int i4 = $11 + 99;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i6 = $10 + 75;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getTrimmedLength("") + 19472), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2624, 13 - TextUtils.indexOf("", "", 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                        try {
                            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (MotionEvent.axisFromString("") + 39423), 481 - Gravity.getAbsoluteGravity(0, 0), Color.green(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4);
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
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0')), 481 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.getDefaultSize(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr5);
                }
                objArr2[0] = new String(cArr2);
                int i9 = $11 + 113;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 0 / 0;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr2;
                int i2 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 877;
                    int i3 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
                    byte[] bArr = $$a;
                    byte b = bArr[8];
                    byte b2 = bArr[11];
                    Object[] objArr3 = new Object[1];
                    a(b, b2, (byte) (b2 + 1), objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, iIndexOf, i3, -1199417970, false, (String) objArr3[0], null);
                }
                Object obj2 = null;
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr4 = new Object[1];
                b(new char[]{62533, 46853, 29406, 15803, 63863, 42182, 26522, 8995, 60979, 43408, 21788, 4114, 54249, 40788, 23042, 1504, 49337, 35928, 20422, 2710, 46699, 28980}, Color.rgb(0, 0, 0) + 16794447, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b(new char[]{62529, 20017, 32951, 56127, 7603, 20508, 43670, 60729, 10121, 31236, 48370, 63331, 18913, 35948, 50911}, ExpandableListView.getPackedPositionGroup(0L) + 47737, objArr5);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int gidForName = Process.getGidForName("") + 877;
                    int iIndexOf2 = TextUtils.indexOf("", "") + 10;
                    byte b3 = $$a[11];
                    byte b4 = b3;
                    Object[] objArr6 = new Object[1];
                    a(b4, (byte) (b4 + 1), b3, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, gidForName, iIndexOf2, 254769921, false, (String) objArr6[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i4 = TuitionPaymentFragmentbindingInflater1 + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                    int i5 = i4 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        int iIndexOf3 = TextUtils.indexOf("", "", 0) + 876;
                        int iGreen = 10 - Color.green(0);
                        byte b5 = $$a[10];
                        byte b6 = (byte) (b5 >>> 2);
                        Object[] objArr7 = new Object[1];
                        a(b5, b6, b6, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, iIndexOf3, iGreen, 1324201839, false, (String) objArr7[0], null);
                    }
                    Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr2 = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i6 = ((((~(899554012 | iIdentityHashCode)) | (-228272750)) * 262) - 1428484810) + (((~((~iIdentityHashCode) | 899554012)) | (-228272750)) * 262) + 162101416;
                    int i7 = (i6 << 13) ^ i6;
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr2[1])[0] = i8 ^ (i8 << 5);
                } else {
                    Object[] objArr9 = new Object[1];
                    b(new char[]{62542, 45644, 30784, 9822, 60462, 43621, 20595, 7797, 50187, 33371, 18477, 63038, 48187, 31269, 8255, 61134}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17930, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    b(new char[]{62541, 56293, 43787, 31397, 19140, 6772, 59790, 47582, 35140, 22664, 10277, 63579, 53211, 40746, 28486, 16106}, (-16765019) - Color.rgb(0, 0, 0), objArr10);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
                    int i9 = TuitionPaymentFragmentbindingInflater1 + 29;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                    int i10 = i9 % 2;
                    try {
                        Object[] objArr11 = {Integer.valueOf(iIntValue), 162101416};
                        byte[] bArr2 = $$d;
                        byte b7 = bArr2[12];
                        byte b8 = b7;
                        Object[] objArr12 = new Object[1];
                        c(b7, b8, b8, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        byte b9 = bArr2[76];
                        byte b10 = b9;
                        Object[] objArr13 = new Object[1];
                        c(b9, b10, b10, objArr13);
                        Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                            int fadingEdgeLength = 876 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int iGreen2 = 10 - Color.green(0);
                            byte b11 = $$a[10];
                            byte b12 = (byte) (b11 >>> 2);
                            Object[] objArr15 = new Object[1];
                            a(b11, b12, b12, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, fadingEdgeLength, iGreen2, 1324201839, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                        try {
                            Object[] objArr16 = new Object[1];
                            b(new char[]{62533, 46853, 29406, 15803, 63863, 42182, 26522, 8995, 60979, 43408, 21788, 4114, 54249, 40788, 23042, 1504, 49337, 35928, 20422, 2710, 46699, 28980}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17231, objArr16);
                            Class<?> cls4 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            b(new char[]{62529, 20017, 32951, 56127, 7603, 20508, 43670, 60729, 10121, 31236, 48370, 63331, 18913, 35948, 50911}, 47737 - TextUtils.getOffsetAfter("", 0), objArr17);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 876;
                                int iBlue = 10 - Color.blue(0);
                                byte b13 = $$a[11];
                                byte b14 = b13;
                                Object[] objArr18 = new Object[1];
                                a(b14, (byte) (b14 + 1), b13, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout, longPressTimeout, iBlue, 254769921, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cMyPid = (char) (Process.myPid() >> 22);
                                int deadChar = KeyEvent.getDeadChar(0, 0) + 876;
                                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 10;
                                byte[] bArr3 = $$a;
                                byte b15 = bArr3[8];
                                byte b16 = bArr3[11];
                                Object[] objArr19 = new Object[1];
                                a(b15, b16, (byte) (b16 + 1), objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, deadChar, threadPriority, -1199417970, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            objArr2 = objArr14;
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
                int i11 = ((int[]) objArr2[2])[0];
                int i12 = ((int[]) objArr2[0])[0];
                if (i12 != i11) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr2[3];
                    if (strArr != null) {
                        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
                        TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                        int i14 = i13 % 2;
                        for (String str2 : strArr) {
                            arrayList.add(str2);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i12));
                }
                int i15 = TuitionPaymentFragmentbindingInflater1 + 103;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                int i16 = i15 % 2;
                int i17 = ((int[]) objArr2[1])[0];
                Object[] objArr20 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i18 = i17 + (((~(741497151 | iMaxMemory)) | (-44774956)) * 398) + 1569354404 + (((~((~iMaxMemory) | 741497151)) | (-44774956)) * 398);
                int i19 = (i18 << 13) ^ i18;
                int i20 = i19 ^ (i19 >>> 17);
                ((int[]) objArr20[1])[0] = i20 ^ (i20 << 5);
                int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                TuitionPaymentFragmentbindingInflater1 = i21 % 128;
                int i22 = i21 % 2;
                AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (i22 == 0) {
                    return (Unit) AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-463684868, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{appCompatSpinnerDropDownAdapter2, (Throwable) obj}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 463684868, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                }
                obj2.hashCode();
                throw null;
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: AppCompatSpinnerDropdownPopup
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                AppCompatSpinnerDropDownAdapter.asInterface(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i2 = onTransact + 65;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter = (AppCompatSpinnerDropDownAdapter) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 19;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            super.onCleared();
            appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDisposed();
            throw null;
        }
        super.onCleared();
        if (!appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDisposed()) {
            appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
        }
        int i3 = onTransact + 35;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final void b(String str, String str2) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String string = Settings.Secure.getString(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContentResolver(), "android_id");
        Intrinsics.checkExpressionValueIsNotNull(string, "");
        MutableLiveData<VirtualCameraAdapter1<onRestoreInstanceState>> mutableLiveData = this.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.g.b(str2, string)));
        final Function1 function1 = new Function1() { // from class: updateTypefaceAndStyle
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (onRestoreInstanceState) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: createTintInfo
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                AppCompatSpinnerDropDownAdapter.g(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setTextSizeInternal
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: applyCompoundDrawablesTints
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                AppCompatSpinnerDropDownAdapter.a(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        acquireBuffer acquirebuffer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 43042);
            int iCombineMeasuredStates = 3111 - View.combineMeasuredStates(0, 0);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 22;
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, iCombineMeasuredStates, iMakeMeasureSpec, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (16153 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(KeyEvent.normalizeMetaState(0) + 22, Color.green(0) + 15, (char) TextUtils.getCapsMode("", 0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (43042 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            int windowTouchSlop = 3111 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iKeyCodeFromString = 22 - KeyEvent.keyCodeFromString("");
            byte[] bArr = $$a;
            byte b3 = bArr[5];
            byte b4 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, windowTouchSlop, iKeyCodeFromString, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollDefaultDelay = (char) (43042 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int offsetBefore = 3111 - TextUtils.getOffsetBefore("", 0);
                int iIndexOf = 22 - TextUtils.indexOf("", "", 0);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr2[40], bArr2[7], bArr2[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, offsetBefore, iIndexOf, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i2 = ((int[]) objArr7[2])[0];
            int i3 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int i4 = ~((~System.identityHashCode(this)) | 499453435);
            int i5 = ((((402916568 | i4) * (-374)) + 326922640) + ((i4 | 96536867) * 374)) - 312894261;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
            objArr = new Object[]{new int[1], new int[]{i3}, new int[]{i2}, strArr};
        } else {
            int length = str != null ? str.length() : 0;
            int i8 = onTransact + 53;
            cancelAll = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr8 = {null, Integer.valueOf(length), 0, -312894261};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[47];
                Object[] objArr9 = new Object[1];
                f(b5, b5, bArr3[59], objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b6 = bArr3[59];
                Object[] objArr10 = new Object[1];
                f(b6, b6, bArr3[47], objArr10);
                Object[] objArr11 = (Object[]) cls2.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (43041 - TextUtils.lastIndexOf("", '0', 0));
                    int i10 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3110;
                    int offsetAfter = 22 - TextUtils.getOffsetAfter("", 0);
                    byte[] bArr4 = $$a;
                    Object[] objArr12 = new Object[1];
                    c(bArr4[40], bArr4[7], bArr4[5], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, i10, offsetAfter, 154975793, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr11);
                try {
                    Object[] objArr13 = new Object[1];
                    e(MotionEvent.axisFromString("") + 1, 22 - View.resolveSizeAndState(0, 0, 0), (char) (16153 - (Process.myPid() >> 22)), objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    e(22 - Drawable.resolveOpacity(0, 0), View.resolveSizeAndState(0, 0, 0) + 15, (char) Color.red(0), objArr14);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 43043);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3111;
                        int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21;
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[5];
                        byte b8 = bArr5[7];
                        Object[] objArr15 = new Object[1];
                        c(b7, b8, b8, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, maximumFlingVelocity, i11, -1269618118, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char tapTimeout = (char) (43042 - (ViewConfiguration.getTapTimeout() >> 16));
                        int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3111;
                        int iCombineMeasuredStates2 = 22 - View.combineMeasuredStates(0, 0);
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr16 = new Object[1];
                        c(b9, b10, b10, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(tapTimeout, scrollDefaultDelay2, iCombineMeasuredStates2, -1272852037, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr11;
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
        if (((int[]) objArr[2])[0] == ((int[]) objArr[1])[0]) {
            int i12 = ((int[]) objArr[0])[0];
            int i13 = ((int[]) objArr[2])[0];
            int i14 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr = {i13};
            int iIdentityHashCode = System.identityHashCode(this);
            int i15 = ~iIdentityHashCode;
            int i16 = i12 + (-1536820718) + (((~(1032626787 | i15)) | 672404671) * (-328)) + ((iIdentityHashCode | 672404671) * 164) + (((~(iIdentityHashCode | (-1032626788))) | 671350819 | (~(i15 | 1033680639))) * 164);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
            Object[] objArr17 = {new int[1], new int[]{i14}, iArr, strArr2};
            int i19 = onTransact + 11;
            cancelAll = i19 % 128;
            int i20 = i19 % 2;
            acquirebuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (i20 != 0) {
                int i21 = 14 / 0;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[3];
        if (strArr3 != null) {
            for (String str3 : strArr3) {
                arrayList.add(str3);
            }
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter, onRestoreInstanceState onrestoreinstancestate) {
        Unit unit;
        int i = 2 % 2;
        int i2 = cancelAll + 111;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            MutableLiveData<VirtualCameraAdapter1<onRestoreInstanceState>> mutableLiveData = appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentbindingInflater1;
            VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(onrestoreinstancestate));
            unit = Unit.INSTANCE;
            int i3 = 1 / 0;
        } else {
            MutableLiveData<VirtualCameraAdapter1<onRestoreInstanceState>> mutableLiveData2 = appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentbindingInflater1;
            VirtualCameraAdapter1.Companion bVar2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(onrestoreinstancestate));
            unit = Unit.INSTANCE;
        }
        int i4 = cancelAll + 27;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter, Throwable th) {
        int i = 2 % 2;
        int i2 = cancelAll + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, appCompatSpinnerDropDownAdapter.asBinder);
        Unit unit = Unit.INSTANCE;
        int i4 = cancelAll + 79;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(th);
            setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentbindingInflater1);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentbindingInflater1);
        int i3 = 74 / 0;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 51;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = cancelAll + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = cancelAll + 119;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Ref.ObjectRef objectRef, AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter, String str, Task task) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(task, "");
        if (task.isSuccessful()) {
            int i2 = onTransact + 67;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            CharSequence charSequence = (CharSequence) task.getResult();
            if (charSequence != null && charSequence.length() != 0) {
                objectRef.element = task.getResult();
                appCompatSpinnerDropDownAdapter.b((String) objectRef.element, str);
                int i4 = cancelAll + 101;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        int i6 = cancelAll + 23;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 37 / 0;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter = (AppCompatSpinnerDropDownAdapter) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = cancelAll + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, appCompatSpinnerDropDownAdapter.d);
        Unit unit = Unit.INSTANCE;
        int i4 = cancelAll + 81;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter, CheckMembershipResponse checkMembershipResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        cancelAll = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            MutableLiveData<VirtualCameraAdapter1<CheckMembershipResponse>> mutableLiveData = appCompatSpinnerDropDownAdapter.b;
            VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(checkMembershipResponse));
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<VirtualCameraAdapter1<CheckMembershipResponse>> mutableLiveData2 = appCompatSpinnerDropDownAdapter.b;
        VirtualCameraAdapter1.Companion bVar2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(checkMembershipResponse));
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 63;
        cancelAll = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter, Throwable th) {
        Unit unit;
        int i = 2 % 2;
        int i2 = cancelAll + 19;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(th);
            setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, appCompatSpinnerDropDownAdapter.f66a);
            unit = Unit.INSTANCE;
            int i3 = 37 / 0;
        } else {
            Intrinsics.checkNotNull(th);
            setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, appCompatSpinnerDropDownAdapter.f66a);
            unit = Unit.INSTANCE;
        }
        int i4 = cancelAll + 13;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = cancelAll + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = cancelAll + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = cancelAll + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = cancelAll + 49;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter, SendEmailOtpResponse sendEmailOtpResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            MutableLiveData<VirtualCameraAdapter1<SendEmailOtpResponse>> mutableLiveData = appCompatSpinnerDropDownAdapter.d;
            VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(sendEmailOtpResponse));
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<VirtualCameraAdapter1<SendEmailOtpResponse>> mutableLiveData2 = appCompatSpinnerDropDownAdapter.d;
        VirtualCameraAdapter1.Companion bVar2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(sendEmailOtpResponse));
        Unit unit2 = Unit.INSTANCE;
        int i3 = cancelAll + 51;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ void b(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        function1.invoke(obj);
        int i3 = cancelAll + 37;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = cancelAll + 123;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
            return null;
        }
        function1.invoke(obj);
        int i3 = 42 / 0;
        return null;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = cancelAll + 107;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
            throw null;
        }
        function1.invoke(obj);
        int i3 = cancelAll + 119;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void g(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = cancelAll + 67;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit asInterface(AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter, Throwable th) {
        int i = 2 % 2;
        int i2 = cancelAll + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, appCompatSpinnerDropDownAdapter.b);
        Unit unit = Unit.INSTANCE;
        int i4 = cancelAll + 15;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 101;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
            return null;
        }
        function1.invoke(obj);
        int i3 = 0 / 0;
        return null;
    }

    public static /* synthetic */ Unit b(AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter, LivenessBeginResponse livenessBeginResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<VirtualCameraAdapter1<LivenessBeginResponse>> mutableLiveData = appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(livenessBeginResponse));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 77;
        cancelAll = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void d(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onTransact + 27;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void a(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = cancelAll + 5;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
            throw null;
        }
        function1.invoke(obj);
        int i3 = onTransact + 29;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter, LivenessEndResponse livenessEndResponse) {
        int i = 2 % 2;
        int i2 = cancelAll + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<VirtualCameraAdapter1<LivenessEndResponse>> mutableLiveData = appCompatSpinnerDropDownAdapter.f66a;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(livenessEndResponse));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 53;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void INotificationSideChannel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = cancelAll + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onTransact + 61;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, java.lang.Object] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Ref.ObjectRef objectRef, AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter, String str, Task task) throws Throwable {
        CharSequence charSequence;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(task, "");
        Object obj = null;
        if (task.isSuccessful() && (charSequence = (CharSequence) task.getResult()) != null && charSequence.length() != 0) {
            int i2 = onTransact + 67;
            cancelAll = i2 % 128;
            if (i2 % 2 != 0) {
                objectRef.element = task.getResult();
                appCompatSpinnerDropDownAdapter.b((String) objectRef.element, str);
                obj.hashCode();
                throw null;
            }
            objectRef.element = task.getResult();
            appCompatSpinnerDropDownAdapter.b((String) objectRef.element, str);
        }
        int i3 = onTransact + 23;
        cancelAll = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter, BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = appCompatSpinnerDropDownAdapter.asBinder;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        Unit unit = Unit.INSTANCE;
        int i4 = cancelAll + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void notify(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = cancelAll + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = cancelAll + 101;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit b(AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter, Throwable th) {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(-463684868, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{appCompatSpinnerDropDownAdapter, th}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 463684868, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, CheckMembershipRequest checkMembershipRequest) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(597578040, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, str, checkMembershipRequest}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -597578038, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-856258149, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 856258153, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void b(String str) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(1549146552, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, str}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1549146551, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, short r8) {
        /*
            byte[] r0 = defpackage.AppCompatSpinnerDropDownAdapter.$$c
            int r6 = r6 * 3
            int r6 = r6 + 109
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + 1
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AppCompatSpinnerDropDownAdapter.$$g(short, short, short):java.lang.String");
    }
}
