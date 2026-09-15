package com.bpjstku.presentation.account.setting;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.setting.model.request.ChangeDataFirstVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangePasswordRequest;
import com.bpjstku.data.user.model.request.LogoutRequest;
import com.bpjstku.databinding.ActivityEditProfileBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.account.setting.EditProfileActivity;
import com.bpjstku.presentation.account.setting.addkpj.AddKpjActivity;
import com.bpjstku.presentation.account.verify.AccountVerificationActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.util.custom.CircleImageView;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.libraries.places.internal.zzrf;
import com.google.android.libraries.places.widget.zzar;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraUseCaseAdapter;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.IntegerRes;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.deInitSession;
import defpackage.deriveCodec;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.message;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.onScroll;
import defpackage.share;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0016\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0015\u0010\u0018\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00198\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00198\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001cR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\u001d8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001fR\u001a\u0010\u0007\u001a\u00020 8\u0015X\u0095D¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\u0014\u0010\""}, d2 = {"Lcom/bpjstku/presentation/account/setting/EditProfileActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityEditProfileBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "onResume", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/domain/user/model/User;", "d", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LIntegerRes;", "TuitionPaymentFragmentbindingInflater1", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "Ljava/lang/String;", "LgetStringOrNull;", "LgetStringOrNull;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EditProfileActivity extends BindingBaseActivity<ActivityEditProfileBinding> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f456a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char g;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String b;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private getStringOrNull a;
    private static final byte[] $$c = {89, 92, -72, 43};
    private static final int $$f = 42;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {89, 107, -36, -112, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 27;
    private static int cancelAll = 1;
    private static int INotificationSideChannel = 0;
    private static int onTransact = 1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: FloatRange
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {67, -127, -109, 9};
        private static final int $$b = 81;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static long b = -3099693804734330144L;

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 3
                int r0 = 1 - r8
                int r6 = r6 * 3
                int r6 = 3 - r6
                byte[] r1 = defpackage.FloatRange.$$a
                int r7 = r7 * 2
                int r7 = 98 - r7
                byte[] r0 = new byte[r0]
                r2 = 0
                int r8 = 0 - r8
                if (r1 != 0) goto L18
                r3 = r8
                r4 = r2
                goto L30
            L18:
                r3 = r2
            L19:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r8) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L28:
                r4 = r1[r6]
                int r3 = r3 + 1
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L30:
                int r7 = -r7
                int r7 = r7 + r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.FloatRange.c(int, short, short, java.lang.Object[]):void");
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            EditProfileActivity editProfileActivity = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (i3 != 0) {
                return EditProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(editProfileActivity);
            }
            EditProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(editProfileActivity);
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i3 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getTapTimeout() >> 16)), (Process.myTid() >> 22) + 2624, TextUtils.lastIndexOf("", '0', 0) + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b ^ 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), AndroidCharacter.getMirror('0') + 433, 37 - TextUtils.indexOf("", "", 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i4 = $11 + 39;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i6 = $10 + 121;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 39422), (Process.myPid() >> 22) + 481, 37 - KeyEvent.keyCodeFromString(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i8 = $11 + 13;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            }
            objArr[0] = new String(cArr2);
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(int r24, int r25) {
            /*
                Method dump skipped, instruction units count: 2042
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.FloatRange.TuitionPaymentFragmentbindingInflater1(int, int):java.lang.Object[]");
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int asBinder = R.layout.activity_edit_profile;

    static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 b;

        TuitionPaymentFragmentbindingInflater1(Function1 function1) {
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

    /* JADX WARN: Code duplicated, block: B:29:0x014c  */
    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        String str;
        int i7 = ~i4;
        int i8 = (~(i7 | i)) | i2;
        int i9 = ~i;
        int i10 = ~i2;
        int i11 = (~(i9 | i10)) | i4;
        int i12 = (~(i2 | i9 | i4)) | (~(i7 | i9 | i10)) | (~(i10 | i | i4));
        int i13 = i + i4 + i3 + ((-104759182) * i5) + ((-453318476) * i6);
        int i14 = i13 * i13;
        int i15 = (i * 1504131295) + 1805123584 + (1504131295 * i4) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i3) + (711983104 * i5) + (1180696576 * i6) + (1022754816 * i14);
        int i16 = ((i * (-1431886989)) - 1507491630) + (i4 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * 122) + (i3 * (-1431886867)) + (i5 * 722567050) + (i6 * (-1618605404)) + (i14 * 297664512);
        int i17 = i15 + (i16 * i16 * (-277217280));
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i17 != 2) {
            if (i17 == 3) {
                return b(objArr);
            }
            if (i17 != 4) {
                return i17 != 5 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        EditProfileActivity editProfileActivity = (EditProfileActivity) objArr[0];
        int i18 = 2 % 2;
        int i19 = INotificationSideChannel + 67;
        onTransact = i19 % 128;
        int i20 = i19 % 2;
        EditProfileActivity editProfileActivity2 = editProfileActivity;
        Intrinsics.checkNotNullParameter(editProfileActivity2, "");
        editProfileActivity2.getWindow().addFlags(8192);
        editProfileActivity.TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityEditProfileBinding) ((ViewBinding) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityEditProfileBinding) ((ViewBinding) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(editProfileActivity.getString(R.string.title_edit_profile));
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (!(!Intrinsics.areEqual(userAsBinder != null ? userAsBinder.RemoteActionCompatParcelizer : null, "Y"))) {
            int i21 = onTransact + 63;
            INotificationSideChannel = i21 % 128;
            int i22 = i21 % 2;
            User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            if (userAsBinder2 != null) {
                int i23 = onTransact + 43;
                INotificationSideChannel = i23 % 128;
                int i24 = i23 % 2;
                str = userAsBinder2.INotificationSideChannelStubProxy;
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, ExifInterface.GPS_DIRECTION_TRUE)) {
                ((ActivityEditProfileBinding) ((ViewBinding) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvAddKpj.setVisibility(8);
            } else {
                ((ActivityEditProfileBinding) ((ViewBinding) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvAddKpj.setVisibility(0);
                int i25 = INotificationSideChannel + 73;
                onTransact = i25 % 128;
                int i26 = i25 % 2;
            }
        } else {
            ((ActivityEditProfileBinding) ((ViewBinding) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvAddKpj.setVisibility(0);
            int i27 = INotificationSideChannel + 73;
            onTransact = i27 % 128;
            int i28 = i27 % 2;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r0 = 53 - r6
            byte[] r1 = com.bpjstku.presentation.account.setting.EditProfileActivity.$$a
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-11)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.EditProfileActivity.c(short, int, short, java.lang.Object[]):void");
    }

    public EditProfileActivity() {
        final EditProfileActivity editProfileActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.account.setting.EditProfileActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = editProfileActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.account.setting.EditProfileActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = editProfileActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.account.setting.EditProfileActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/account/setting/EditProfileActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, EditProfileActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityEditProfileBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        EditProfileActivity$bindingInflater$1 editProfileActivity$bindingInflater$1 = EditProfileActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i3 == 0) {
            return editProfileActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.asBinder;
        if (i3 == 0) {
            int i5 = 78 / 0;
        }
        return i4;
    }

    private static final Unit a(final EditProfileActivity editProfileActivity, View view) {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_name", "init_change_email_account"));
        Intrinsics.checkNotNullParameter(editProfileActivity, "");
        Intrinsics.checkNotNullParameter("edit_email_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("edit_email_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("edit_email_account", mapMutableMapOf);
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        try {
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String str = null;
            if (userAsBinder != null) {
                int i2 = INotificationSideChannel + 99;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    String str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    throw null;
                }
                str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.valueOf(str));
            int i3 = INotificationSideChannel + 67;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception unused) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = "-";
        }
        StringBuilder sb = new StringBuilder("Sistem akan mengirimkan sms kode verifikasi ke nomor ");
        sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(". Apakah Anda yakin akan melanjutkan ke  proses berikutnya?");
        String string = sb.toString();
        String string2 = editProfileActivity.getString(R.string.action_ok_continue);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_phone, "Konfirmasi Pengiriman Kode Verifikasi", string, string2, new Function0() { // from class: FontRes
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (Unit) EditProfileActivity.TuitionPaymentFragmentbindingInflater1(-565586185, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 565586188, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault3}, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        }, editProfileActivity.getString(R.string.action_return), new Function0() { // from class: GravityInt
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditProfileActivity.g();
            }
        });
        editProfileActivity.a = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        FragmentManager supportFragmentManager = editProfileActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i5 = onTransact + 81;
            INotificationSideChannel = i5 % 128;
            int i6 = i5 % 2;
            getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ActivityEditProfileBinding activityEditProfileBinding = (ActivityEditProfileBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        TextView textView = activityEditProfileBinding.tvChangeProfilePhoto;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: IdRes
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (View) obj);
            }
        }));
        TextView textView2 = activityEditProfileBinding.tvEditPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: attributeId
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {27, -8, 5, 78, -17, 6, -18, -1, 2, 1, 50, -73, -6, 1, -4, -3, -7, -6, 66, -76, 62, 2, -67, 4, -3, -9, 4, 47, -73, 10, -18, -4, 6, -10, -3, 60, -35, -28, -3, -9, 4, 26, -48, -3, -10, -2, -1, -1, -4, 3, -17, 43, -48, -2, -7, 11, -23, 76, -52, -34, 13, -17, -9, -1, -3, -7, -6, 45, -48, -3, -10, -2, -1, -1, -11, 46, -51, 3, 51, -3, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 63};
            private static final int $$e = 114;
            private static final byte[] $$a = {0, -94, -62, -97, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
            private static final int $$b = 82;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static long b = -4696108320190344713L;

            private static void a(short s, int i2, int i3, Object[] objArr) {
                int i4 = 55 - (i2 * 52);
                byte[] bArr = $$a;
                int i5 = 98 - (i3 * 14);
                byte[] bArr2 = new byte[s + 1];
                int i6 = -1;
                if (bArr == null) {
                    i5 = (s + (-i5)) - 10;
                    i6 = -1;
                }
                while (true) {
                    int i7 = i6 + 1;
                    bArr2[i7] = (byte) i5;
                    i4++;
                    if (i7 == s) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i5 = (i5 + (-bArr[i4])) - 10;
                        i6 = i7;
                    }
                }
            }

            private static void d(byte b2, short s, byte b3, Object[] objArr) {
                int i2 = 97 - (b3 * 13);
                int i3 = b2 * 24;
                byte[] bArr = $$d;
                int i4 = 79 - (s * 76);
                byte[] bArr2 = new byte[i3 + 53];
                int i5 = i3 + 52;
                int i6 = -1;
                if (bArr == null) {
                    i2 = (i4 + (-i5)) - 4;
                    i4 = i4;
                }
                while (true) {
                    i6++;
                    int i7 = i4 + 1;
                    bArr2[i6] = (byte) i2;
                    if (i6 == i5) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i2 = (i2 + (-bArr[i7])) - 4;
                        i4 = i7;
                    }
                }
            }

            private static void c(char[] cArr, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                int i4 = $10 + 11;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i6 = $10 + 35;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = getrealtimecapturelatency.b;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - ((Process.getThreadPriority(0) + 20) >> 6)), 2624 - TextUtils.getCapsMode("", 0, 0), 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                            }
                            jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() / (b % 9053247990562531611L);
                            Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 482 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), View.getDefaultSize(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i8 = getrealtimecapturelatency.b;
                        Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 2624 - (ViewConfiguration.getKeyRepeatDelay() >> 16), MotionEvent.axisFromString("") + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (b ^ 9053247990562531611L);
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 481 - TextUtils.getOffsetBefore("", 0), 37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i9 = $10 + 111;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    try {
                        Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 481, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0216  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                    int iBlue = Color.blue(0) + 921;
                    int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    byte[] bArr = $$a;
                    byte b2 = bArr[0];
                    Object[] objArr2 = new Object[1];
                    a(b2, bArr[7], b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iBlue, maximumDrawingCacheSize, -1048449946, false, (String) objArr2[0], null);
                }
                Object obj2 = null;
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{63629, 57321, 46686, 36575, 25903, 15762, 5130, 60207, 50139, 39516, 29420, 18726, 8593, 63728, 57154, 47052, 36401, 26292, 15622, 5234, 60627, 49984}, ExpandableListView.getPackedPositionType(0L) + 10091, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{63625, 16929, 36303, 55167, 4635, 23980, 42830, 58073, 11649, 30500, 45770, 64627, 18185, 33452, 52295}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 47777, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cMyPid = (char) ((Process.myPid() >> 22) + 31533);
                    int i3 = 921 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 28;
                    byte b3 = $$a[7];
                    Object[] objArr5 = new Object[1];
                    a((byte) 52, b3, b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, i3, iNormalizeMetaState, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cAxisFromString = (char) (31532 - MotionEvent.axisFromString(""));
                        int i4 = 922 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 28;
                        byte[] bArr2 = $$a;
                        Object[] objArr6 = new Object[1];
                        a((byte) (bArr2[17] + 1), bArr2[0], bArr2[7], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, i4, touchSlop, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i5 = ~iIdentityHashCode;
                    int i6 = ~((-871885541) | i5);
                    int i7 = ~((-902194104) | iIdentityHashCode);
                    int i8 = ((((-414465930) + ((i6 | i7) * 1150)) + (((~(902194103 | i5)) | i7) * (-575))) + (((~(iIdentityHashCode | (-871885541))) | (~(i5 | 871885540))) * 575)) - 943726754;
                    int i9 = (i8 << 13) ^ i8;
                    int i10 = i9 ^ (i9 >>> 17);
                    ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{63629, 5327, 8210, 15481, 18871, 25860, 28998, 36569, 39653, 46633, 50078, 57229, 60209, 1894, 5294, 8198, 15434, 18840, 26098, 28962, 36540, 39637, 46592, 49762, 57269, 60173}, 60493 - (ViewConfiguration.getTouchSlop() >> 8), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{63631, 31272, 65020, 28813, 62029, 30199, 59582, 27258, 60692, 24741, 57962, 25886, 55491, 23152, 56630, 20698, 54163, 21827}, 33458 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i11 = TuitionPaymentFragmentbindingInflater1 + 107;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                            if (i11 % 2 != 0) {
                                ((ContextWrapper) applicationContext).getBaseContext();
                                obj2.hashCode();
                                throw null;
                            }
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{63622, 34080, 960, 33162, 3702, 36065, 2691, 38713, 5603, 37847, 4221, 40698, 7299, 39249, 10239, 42402}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 32172, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{63621, 2783, 7207, 12167, 12740, 17206, 22162, 22772, 27164, 32130, 36857, 37177, 42171, 46824, 47178, 52112}, TextUtils.lastIndexOf("", '0', 0) + 62040, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -943726754};
                        byte[] bArr3 = $$d;
                        byte b4 = bArr3[9];
                        Object[] objArr13 = new Object[1];
                        d(b4, b4, bArr3[117], objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b5 = bArr3[117];
                        Object[] objArr14 = new Object[1];
                        d(b5, b5, bArr3[9], objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 921;
                            int iNormalizeMetaState2 = 28 - KeyEvent.normalizeMetaState(0);
                            byte[] bArr4 = $$a;
                            Object[] objArr16 = new Object[1];
                            a((byte) (bArr4[17] + 1), bArr4[0], bArr4[7], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, jumpTapTimeout, iNormalizeMetaState2, -1142834547, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new char[]{63629, 57321, 46686, 36575, 25903, 15762, 5130, 60207, 50139, 39516, 29420, 18726, 8593, 63728, 57154, 47052, 36401, 26292, 15622, 5234, 60627, 49984}, 10091 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new char[]{63625, 16929, 36303, 55167, 4635, 23980, 42830, 58073, 11649, 30500, 45770, 64627, 18185, 33452, 52295}, ((Process.getThreadPriority(0) + 20) >> 6) + 47777, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31533);
                                int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 921;
                                int capsMode = 28 - TextUtils.getCapsMode("", 0, 0);
                                byte b6 = $$a[7];
                                Object[] objArr19 = new Object[1];
                                a((byte) 52, b6, b6, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, iNormalizeMetaState3, capsMode, -778300370, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c2 = (char) (31533 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 921;
                                int scrollBarSize = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
                                byte[] bArr5 = $$a;
                                byte b7 = bArr5[0];
                                Object[] objArr20 = new Object[1];
                                a(b7, bArr5[7], b7, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, keyRepeatDelay, scrollBarSize, -1048449946, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            objArr = objArr15;
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
                if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr == null) {
                        throw null;
                    }
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                    throw null;
                }
                int i12 = ((int[]) objArr[0])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i13 = ~iIdentityHashCode2;
                int i14 = 472914295 + (((~((-823623856) | i13)) | 805732524 | (~((-950455789) | i13)) | (~(968347119 | iIdentityHashCode2))) * (-84));
                int i15 = (~(iIdentityHashCode2 | (-950455789))) | 823623855;
                int i16 = ~(i13 | 950455788);
                int i17 = i12 + i14 + ((i15 | i16) * (-84)) + (((-968347120) | i16) * 84);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr21[0])[0] = i19 ^ (i19 << 5);
                int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                TuitionPaymentFragmentbindingInflater1 = i20 % 128;
                if (i20 % 2 != 0) {
                    return (Unit) EditProfileActivity.TuitionPaymentFragmentbindingInflater1(-1739855408, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1739855412, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj}, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                }
                int i21 = 96 / 0;
                return (Unit) EditProfileActivity.TuitionPaymentFragmentbindingInflater1(-1739855408, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1739855412, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj}, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        }));
        TextView textView3 = activityEditProfileBinding.tvEditPassword;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: flagMapping
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditProfileActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        TextView textView4 = activityEditProfileBinding.tvEditEmail;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: hasAttributeId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (Unit) EditProfileActivity.TuitionPaymentFragmentbindingInflater1(780219797, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -780219797, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this.TuitionPaymentFragmentbindingInflater1, (View) obj}, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        }));
        TextView textView5 = activityEditProfileBinding.tvAddKpj;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: name
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditProfileActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        int i2 = onTransact + 3;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        String str;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2;
        User userAsBinder;
        String str3;
        int i = 2 % 2;
        int i2 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        if (i2 != (((~((-824320035) | elapsedCpuTime)) | (-2141896188)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 2145669322 + ((~((~elapsedCpuTime) | (-824320035))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) {
            throw new RuntimeException("-1172399549");
        }
        int i3 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        if (i3 != ((346024308 + (((~iNextInt) | 605822981) * 1324)) + (((~(iNextInt | 1973231959)) | (~(605824005 | iNextInt))) * (-1324))) - 1012678132) {
            int i4 = INotificationSideChannel + 53;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            int[] iArr = new int[248497503];
            iArr[248497502] = 1;
            int i6 = 486380514 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i7 = onTransact + 91;
            INotificationSideChannel = i7 % 128;
            int i8 = i7 % 2;
        }
        super.onResume();
        ActivityEditProfileBinding activityEditProfileBinding = (ActivityEditProfileBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        TextView textView = activityEditProfileBinding.tvEmail;
        User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder2 != null) {
            int i9 = INotificationSideChannel + 97;
            onTransact = i9 % 128;
            if (i9 % 2 == 0) {
                str = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i10 = 9 / 0;
            } else {
                str = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = activityEditProfileBinding.tvPhoneNumber;
        try {
            User userAsBinder3 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            if (userAsBinder3 != null) {
                int i11 = onTransact + 117;
                INotificationSideChannel = i11 % 128;
                int i12 = i11 % 2;
                str3 = userAsBinder3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                str3 = null;
            }
            strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.valueOf(str3));
        } catch (Exception unused) {
        }
        textView2.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        User userAsBinder4 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder4 == null || (str2 = userAsBinder4.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
            return;
        }
        int i13 = onTransact + 21;
        INotificationSideChannel = i13 % 128;
        if (i13 % 2 != 0) {
            userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            int i14 = 17 / 0;
            if (userAsBinder == null) {
                return;
            }
        } else {
            userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            if (userAsBinder == null) {
                return;
            }
        }
        int i15 = INotificationSideChannel + 13;
        onTransact = i15 % 128;
        if (i15 % 2 == 0) {
            String str4 = userAsBinder.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        String str5 = userAsBinder.TuitionPaymentFragmentbindingInflater1;
        if (str5 != null) {
            ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, str5);
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        a();
        int i4 = onTransact + 1;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x011e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0136  */
    /* JADX WARN: Code duplicated, block: B:41:0x0182 A[Catch: all -> 0x0363, TryCatch #0 {all -> 0x0363, blocks: (B:11:0x002c, B:13:0x003a, B:14:0x0067, B:18:0x007d, B:20:0x008b, B:21:0x00bd, B:39:0x0138, B:41:0x0182, B:42:0x01f8), top: B:73:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x020b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0252 A[Catch: all -> 0x02df, TryCatch #1 {all -> 0x02df, blocks: (B:46:0x0217, B:48:0x0252, B:50:0x02be), top: B:75:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:57:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:61:0x0323  */
    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int length;
        char[] cArr2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = f456a;
        Object obj2 = null;
        int i5 = 3;
        if (cArr3 != null) {
            int i6 = $10 + 63;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), 2267 - View.resolveSizeAndState(0, 0, 0), Color.red(0) + 33, -1927765101, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                    i7++;
                    i5 = 3;
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
        Object[] objArr4 = {Integer.valueOf(g)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            byte b4 = (byte) 3;
            byte b5 = (byte) (b4 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 2267, 33 - (Process.myPid() >> 22), -1927765101, false, $$i(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $11 + 35;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $11 + 53;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                        i3 = 2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cResolveSizeAndState = (char) (49267 - View.resolveSizeAndState(0, 0, 0));
                            int iResolveSize = 3261 - View.resolveSize(0, 0);
                            int scrollBarSize = 30 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte b6 = (byte) ($$f & 7);
                            byte b7 = (byte) (b6 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, iResolveSize, scrollBarSize, -127612708, false, $$i(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            int i11 = $11 + 21;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            try {
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b8 = (byte) 0;
                                    byte b9 = b8;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22879 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (-16776622) - Color.rgb(0, 0, 0), 16 - TextUtils.indexOf((CharSequence) "", '0', 0), 1570859318, false, $$i(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i13];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i14 = $10 + 77;
                                $11 = i14 % 128;
                                int i15 = i14 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i16];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i17];
                            } else {
                                int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i18];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i19];
                                int i20 = $10 + 21;
                                $11 = i20 % 128;
                                i3 = 2;
                                int i21 = i20 % 2;
                            }
                        }
                        i3 = 2;
                    }
                } else {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                        i3 = 2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cResolveSizeAndState2 = (char) (49267 - View.resolveSizeAndState(0, 0, 0));
                            int iResolveSize2 = 3261 - View.resolveSize(0, 0);
                            int scrollBarSize2 = 30 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte b10 = (byte) ($$f & 7);
                            byte b11 = (byte) (b10 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState2, iResolveSize2, scrollBarSize2, -127612708, false, $$i(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            int i110 = $11 + 21;
                            $10 = i110 % 128;
                            int i111 = i110 % 2;
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b12 = (byte) 0;
                                byte b13 = b12;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22879 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (-16776622) - Color.rgb(0, 0, 0), 16 - TextUtils.indexOf((CharSequence) "", '0', 0), 1570859318, false, $$i(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                            int i112 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue2];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i112];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i113 = $10 + 77;
                                $11 = i113 % 128;
                                int i114 = i113 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i115 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i116 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i115];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i116];
                            } else {
                                int i117 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i118 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i117];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i118];
                                int i22 = $10 + 21;
                                $11 = i22 % 128;
                                i3 = 2;
                                int i23 = i22 % 2;
                            }
                        }
                        i3 = 2;
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += i3;
                obj2 = obj;
            }
        }
        for (int i24 = 0; i24 < i; i24++) {
            cArr4[i24] = (char) (cArr4[i24] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        EditProfileActivity editProfileActivity = this;
        ((IntegerRes) this.TuitionPaymentFragmentbindingInflater1.getValue()).d.observe(editProfileActivity, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: FractionRes
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentbindingInflater1.getValue()).onTransact.observe(editProfileActivity, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: toInclusive
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditProfileActivity.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentbindingInflater1.getValue()).INotificationSideChannelStub.observe(editProfileActivity, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: GuardedBy
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(editProfileActivity, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: InspectableProperty
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditProfileActivity.a(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentbindingInflater1.getValue()).asBinder.observe(editProfileActivity, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: fromInclusive
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditProfileActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentbindingInflater1.getValue()).cancel.observe(editProfileActivity, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: value
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditProfileActivity.asBinder(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentbindingInflater1.getValue()).asInterface.observe(editProfileActivity, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: HalfFloat
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (Unit) EditProfileActivity.TuitionPaymentFragmentbindingInflater1(116766469, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -116766464, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this.b, (VirtualCameraAdapter1) obj}, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        }));
        int i2 = INotificationSideChannel + 125;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = INotificationSideChannel + 117;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i3 = 40 / 0;
                } else {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = onTransact + 7;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 76 / 0;
            }
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArrB$7879113;
        int i = 0;
        EditProfileActivity editProfileActivity = (EditProfileActivity) objArr[0];
        int i2 = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
            int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
            int iRed = Color.red(0) + 15;
            byte b = $$a[7];
            short s = b;
            Object[] objArr3 = new Object[1];
            c(b, s, (byte) s, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i3, iRed, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{6, 16, '\b', 15, 2, '\t', 7, 0, 2, 24, 0, 22, 2, 20, 11, '\n', 23, 1, 4, '\t', 19, 5}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 71), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 93, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{19, 4, 2, 16, 24, '\f', '\t', 15, 11, 4, 20, 14, 6, 22, 13880}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_indomaret).substring(0, 9).codePointAt(2) - 43), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cGreen = (char) Color.green(0);
            int iBlue = Color.blue(0) + 1031;
            int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr6 = new Object[1];
            c(b3, (short) (b3 | 52), b2, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, iBlue, packedPositionChild, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i4 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
                int i5 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte b4 = (byte) 52;
                Object[] objArr7 = new Object[1];
                c(b4, (short) (b4 << 1), $$a[132], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, i4, i5, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr8[3])[0];
            int i7 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i8 = ~iUptimeMillis;
            int i9 = 368273445 + (((~((-179409431) | i8)) | 423689600) * (-328)) + ((iUptimeMillis | 423689600) * 164) + (((~(iUptimeMillis | 179409430)) | 289435008 | (~(i8 | (-45154839)))) * 164) + 572939915;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr2[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{21, 3, 11, 6, 4, 22, 6, 16, 17, 7, 0, 5, 20, '\f', 11, 24}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 2), Color.argb(0, 0, 0, 0) + 16, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{'\b', 6, '\n', '\f', '\f', 5, 15, 5, 6, 3, 21, 17, 4, 0, '\t', '\n'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_right_eye_closed).substring(0, 15).codePointAt(13) - 26), 16 - View.resolveSize(0, 0), objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, editProfileActivity)).intValue();
            try {
                Object[] objArr11 = {322001834};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 46038), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1134, (ViewConfiguration.getJumpTapTimeout() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 572939915, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                    int iResolveSizeAndState = 1031 - View.resolveSizeAndState(0, 0, 0);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 15;
                    byte b5 = $$a[7];
                    short s2 = b5;
                    Object[] objArr13 = new Object[1];
                    c(b5, s2, (byte) s2, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror, iResolveSizeAndState, scrollBarSize, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0') + 45994), ExpandableListView.getPackedPositionType(0L) + 1117, 17 - TextUtils.indexOf("", "", 0, 0)), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 16;
                    byte b6 = (byte) 52;
                    Object[] objArr14 = new Object[1];
                    c(b6, (short) (b6 << 1), $$a[132], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, pressedStateDuration, iIndexOf, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{6, 16, '\b', 15, 2, '\t', 7, 0, 2, 24, 0, 22, 2, 20, 11, '\n', 23, 1, 4, '\t', 19, 5}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_6).substring(3, 4).length() + 106), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_format_valid_until).substring(3, 4).codePointAt(0) - 75, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{19, 4, 2, 16, 24, '\f', '\t', 15, 11, 4, 20, 14, 6, 22, 13880}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 46), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iResolveOpacity = 1031 - Drawable.resolveOpacity(0, 0);
                        int iNormalizeMetaState = 15 - KeyEvent.normalizeMetaState(0);
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr17 = new Object[1];
                        c(b8, (short) (b8 | 52), b7, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, iResolveOpacity, iNormalizeMetaState, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                        int i12 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte b9 = $$a[7];
                        short s3 = b9;
                        Object[] objArr18 = new Object[1];
                        c(b9, s3, (byte) s3, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cCombineMeasuredStates, pressedStateDuration2, i12, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i13 = ((int[]) objArr2[1])[0];
        int i14 = ((int[]) objArr2[3])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr2[0];
            if (strArr2 != null) {
                int i15 = onTransact + 119;
                INotificationSideChannel = i15 % 128;
                int i16 = i15 % 2;
                while (i < strArr2.length) {
                    arrayList.add(strArr2[i]);
                    i++;
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i17 = INotificationSideChannel + 33;
        onTransact = i17 % 128;
        int i18 = i17 % 2;
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i19 = ((int[]) objArr2[2])[0];
        int i20 = ((int[]) objArr2[3])[0];
        int i21 = ((int[]) objArr2[1])[0];
        String[] strArr3 = (String[]) objArr2[0];
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i22 = ~startUptimeMillis;
        int i23 = i19 + (-1678138843) + (((~(startUptimeMillis | (-558498603))) | (~((-244411541) | i22)) | 131370) * (-68)) + ((~((-558367233) | i22)) * (-68)) + (((~(558498602 | i22)) | (-802778773)) * 68);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr19[2])[0] = i25 ^ (i25 << 5);
        int i26 = onTransact + 117;
        INotificationSideChannel = i26 % 128;
        int i27 = i26 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char windowTouchSlop = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
            int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
            byte[] bArr = $$a;
            Object[] objArr20 = new Object[1];
            c((byte) (bArr[33] - 1), (short) 104, bArr[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(windowTouchSlop, doubleTapTimeout, keyRepeatDelay, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c4 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29943);
                int pressedStateDuration3 = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int iIndexOf2 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte b10 = $$a[7];
                byte b11 = b10;
                Object[] objArr21 = new Object[1];
                c(b11, (short) (b11 | 52), b10, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c4, pressedStateDuration3, iIndexOf2, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i28 = ((int[]) objArr22[0])[0];
            objArrB$7879113 = new Object[]{new int[]{i28}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iNextInt = new Random().nextInt();
            int i29 = ~iNextInt;
            int i30 = 828653133 + (((~(327218486 | i29)) | (-539820913) | (~((-327218487) | iNextInt))) * (-564)) + ((~(iNextInt | (-305))) * 1128) + (((~((-539820913) | i29)) | 327218182) * 564) + 1625890573;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{21, 3, 11, 6, 4, 22, 6, 16, 17, 7, 0, 5, 20, '\f', 11, 24}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_shopeepay_qris).substring(0, 5).codePointAt(2) - 81, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{'\b', 6, '\n', '\f', '\f', 5, 15, 5, 6, 3, 21, 17, 4, 0, '\t', '\n'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_100_point).substring(0, 13).codePointAt(7) + 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step2).substring(4, 5).codePointAt(0) - 91, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, editProfileActivity)).intValue();
            Object[] objArr25 = {322001834};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - KeyEvent.keyCodeFromString("")), 1726 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$7879113 = onScroll.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1625890573, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1755;
                int i33 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte b12 = $$a[7];
                byte b13 = b12;
                Object[] objArr26 = new Object[1];
                c(b13, (short) (b13 | 52), b12, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(fadingEdgeLength, doubleTapTimeout2, i33, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{6, 16, '\b', 15, 2, '\t', 7, 0, 2, 24, 0, 22, 2, 20, 11, '\n', 23, 1, 4, '\t', 19, 5}, (byte) (View.MeasureSpec.getMode(0) + 107), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 76, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{19, 4, 2, 16, 24, '\f', '\t', 15, 11, 4, 20, 14, 6, 22, 13880}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 46), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.page_title_uobweb).substring(0, 11).codePointAt(10) - 83, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
                    int i34 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
                    int iResolveSizeAndState2 = 23 - View.resolveSizeAndState(0, 0, 0);
                    byte b14 = $$a[7];
                    byte b15 = b14;
                    Object[] objArr29 = new Object[1];
                    c(b15, (short) (b15 | 141), b14, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(threadPriority, i34, iResolveSizeAndState2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c5 = (char) (29944 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                    int i35 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte[] bArr2 = $$a;
                    Object[] objArr30 = new Object[1];
                    c((byte) (bArr2[33] - 1), (short) 104, bArr2[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c5, maximumDrawingCacheSize, i35, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArrB$7879113[1])[0];
        int i37 = ((int[]) objArrB$7879113[0])[0];
        if (i37 != i36) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrB$7879113[4];
            if (strArr4 != null) {
                while (i < strArr4.length) {
                    arrayList2.add(strArr4[i]);
                    i++;
                }
            }
            throw new RuntimeException(String.valueOf(i37));
        }
        int i38 = ((int[]) objArrB$7879113[3])[0];
        int i39 = ((int[]) objArrB$7879113[0])[0];
        Object[] objArr31 = {new int[]{i39}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int iMyPid = Process.myPid();
        int i40 = ~iMyPid;
        int i41 = i38 + ((((~(1073649630 | i40)) | (~((-329253387) | iMyPid))) * 988) - 1540912683) + (((~(iMyPid | 531793818)) | 541855812 | (~(i40 | (-329253387)))) * 988);
        int i42 = (i41 << 13) ^ i41;
        int i43 = i42 ^ (i42 >>> 17);
        ((int[]) objArr31[3])[0] = i43 ^ (i43 << 5);
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != 1012313816 + (((~(iIdentityHashCode | (-882724824))) | (-52737281)) * (-465)) + (((-882724824) | (~((-52737281) | iIdentityHashCode))) * 930) + ((iIdentityHashCode | (-263425)) * 465)) {
            throw null;
        }
        int i5 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i6 = (~((int) Runtime.getRuntime().freeMemory())) | 189575466;
        if (i5 != (-1347512947) + (i6 * 495) + (((~i6) | 172789794) * 495)) {
            int i7 = onTransact + 107;
            INotificationSideChannel = i7 % 128;
            int i8 = i7 % 2;
            int[] iArr = new int[1618163852];
            iArr[1618163851] = 1;
            int i9 = 2043827204 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i10 = INotificationSideChannel + 57;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
        }
        super.onStart();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_bad_response_server).substring(0, 24).codePointAt(19) + 575895135;
        int i5 = ~iCodePointAt;
        if (i4 != 1751402245 + (((~((-896705837) | i5)) | (~(iCodePointAt | (-1726693380)))) * 333) + (((~(iCodePointAt | (-896705837))) | (~(i5 | (-1726693380)))) * 333)) {
            int i6 = (-1783515456) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        int i9 = 2076412932 + ((i8 | 940904168) * (-50));
        int i10 = ~((-537134689) | i8);
        int i11 = ~i8;
        if (i7 != i9 + ((i10 | (~((-1101017109) | i11))) * 50) + (((~(i11 | 940904168)) | (~((-1638151797) | i11)) | 1101017108) * 50)) {
            throw new RuntimeException("59765409");
        }
        super.onCreate(bundle);
        int i12 = onTransact + 83;
        INotificationSideChannel = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 49 / 0;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        String str;
        EditProfileActivity editProfileActivity = (EditProfileActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            editProfileActivity.MediaBrowserCompat();
            str = "loading_logout";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = INotificationSideChannel + 79;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                editProfileActivity.IconCompatParcelizer();
                LoginActivity.Companion companion = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(editProfileActivity, null, true, 49);
                editProfileActivity.d_();
            } else {
                editProfileActivity.IconCompatParcelizer();
                LoginActivity.Companion companion2 = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(editProfileActivity, null, false, 6);
                editProfileActivity.d_();
            }
            int i3 = INotificationSideChannel + 17;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            str = "success_logout";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            editProfileActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            str = "failure_logout";
        } else {
            editProfileActivity.IconCompatParcelizer();
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_logout_result", str));
        Intrinsics.checkNotNullParameter(editProfileActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d() {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 97;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit b(EditProfileActivity editProfileActivity, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        final IntegerRes integerRes = (IntegerRes) editProfileActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String str4 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str4 == null) {
            int i4 = INotificationSideChannel + 3;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 38 / 0;
            }
            str4 = "";
        }
        ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest(str4, str2, str, str3);
        Intrinsics.checkNotNullParameter(changePasswordRequest, "");
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = integerRes.cancel;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(changePasswordRequest)));
        final Function1 function1 = new Function1() { // from class: VisibleForTestingCompanion
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(integerRes, (BaseModel) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: otherwise
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: VisibleForTesting
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.notify(integerRes, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: WorkerThread
            private static final byte[] $$c = {77, -106, 83, 4};
            private static final int $$f = 237;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {117, -15, -81, 1, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
            private static final int $$e = 198;
            private static final byte[] $$a = {1, 115, -83, 116, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 21, 49, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11, -1, 21, -17, -27, 39, 11, -7, 23, -19, -49, 64, -9, 15, -5, -55, 40, 22, 12, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
            private static final int $$b = 38;
            private static int d = 0;
            private static int asInterface = 1;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 53970;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 31920;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 20785;
            private static char b = 46252;
            private static long asBinder = -6377398940819159759L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f243a = -981105359;
            private static char g = 28038;

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void f(int r6, short r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r0 = 34 - r8
                    int r7 = r7 + 4
                    int r6 = r6 * 3
                    int r6 = 115 - r6
                    byte[] r1 = defpackage.WorkerThread.$$a
                    byte[] r0 = new byte[r0]
                    int r8 = 33 - r8
                    r2 = 0
                    if (r1 != 0) goto L15
                    r6 = r7
                    r3 = r8
                    r4 = r2
                    goto L2a
                L15:
                    r3 = r2
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L19:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L28:
                    r3 = r1[r6]
                L2a:
                    int r7 = r7 + r3
                    int r7 = r7 + (-2)
                    int r6 = r6 + 1
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.WorkerThread.f(int, short, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void h(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
                /*
                    int r7 = 103 - r7
                    byte[] r0 = defpackage.WorkerThread.$$d
                    int r8 = r8 * 52
                    int r8 = r8 + 1
                    int r9 = r9 + 4
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r7 = r8
                    r3 = r9
                    r4 = r2
                    goto L2a
                L13:
                    r3 = r2
                L14:
                    int r9 = r9 + 1
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r8) goto L25
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L25:
                    r3 = r0[r9]
                    r6 = r3
                    r3 = r9
                    r9 = r6
                L2a:
                    int r9 = -r9
                    int r7 = r7 + r9
                    int r7 = r7 + (-10)
                    r9 = r3
                    r3 = r4
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.WorkerThread.h(byte, byte, byte, java.lang.Object[]):void");
            }

            @Override // defpackage.logToString
            public final void accept(Object obj) {
                int i6 = 2 % 2;
                int i7 = d + 29;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                function2.invoke(obj);
                int i9 = d + 67;
                asInterface = i9 % 128;
                if (i9 % 2 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            private static void c(char[] cArr, int i6, Object[] objArr) throws Throwable {
                int i7 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                while (true) {
                    int i8 = 0;
                    if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                        objArr[0] = new String(cArr2, 0, i6);
                        return;
                    }
                    int i9 = $10 + 125;
                    $11 = i9 % 128;
                    int i10 = 58224;
                    char c = 1;
                    if (i9 % 2 == 0) {
                        cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        int i11 = oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        cArr3[0] = cArr[0];
                    } else {
                        cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    }
                    int i12 = 0;
                    while (i12 < 16) {
                        int i13 = $11 + 37;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        char c2 = cArr3[c];
                        char c3 = cArr3[i8];
                        int i15 = (c3 + i10) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                        int i16 = c3 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(b);
                            objArr2[2] = Integer.valueOf(i16);
                            objArr2[c] = Integer.valueOf(i15);
                            objArr2[i8] = Integer.valueOf(c2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char mode = (char) (47773 - View.MeasureSpec.getMode(i8));
                                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 468;
                                int i17 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12;
                                Class[] clsArr = new Class[4];
                                clsArr[i8] = Integer.TYPE;
                                clsArr[c] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, tapTimeout, i17, -2007001706, false, "o", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            cArr3[c] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i8]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 47774), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 468, 13 - TextUtils.getOffsetAfter("", 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i10 -= 40503;
                            i12++;
                            i8 = 0;
                            c = 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
                    Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.getDefaultSize(0, 0), 2323 - ExpandableListView.getPackedPositionGroup(0L), 44 - TextUtils.getOffsetBefore("", 0), -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
            }

            private static void e(char[] cArr, char[] cArr2, char c, char[] cArr3, int i6, Object[] objArr) throws Throwable {
                int i7 = 2;
                int i8 = 2 % 2;
                SessionProcessor sessionProcessor = new SessionProcessor();
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int length2 = cArr2.length;
                char[] cArr5 = new char[length2];
                System.arraycopy(cArr3, 0, cArr4, 0, length);
                System.arraycopy(cArr2, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i6));
                int length3 = cArr.length;
                char[] cArr6 = new char[length3];
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                    int i9 = $10 + 13;
                    $11 = i9 % 128;
                    int i10 = i9 % i7;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8328), 1234 - TextUtils.lastIndexOf("", '0', 0), TextUtils.indexOf("", "", 0) + 35, -653973969, false, $$g(b2, b3, (byte) (b3 | 6)), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        try {
                            Object[] objArr3 = {sessionProcessor};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getScrollBarSize() >> 8) + 2764, TextUtils.indexOf("", "", 0) + 14, 1504416861, false, $$g(b4, b4, (byte) $$c.length), new Class[]{Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            try {
                                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), TextUtils.indexOf("", "") + 253, 22 - KeyEvent.getDeadChar(0, 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                try {
                                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b5 = (byte) 0;
                                        byte b6 = b5;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65201 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 2891 - Color.green(0), 17 - ExpandableListView.getPackedPositionType(0L), 2012627446, false, $$g(b5, b6, (byte) (b6 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                    cArr4[iIntValue2] = sessionProcessor.b;
                                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (asBinder ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) f243a) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) g) ^ (-6377398940819159759L)))));
                                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                                    i7 = 2;
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
                int i11 = $11 + 123;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Code duplicated, block: B:103:0x0ac4 A[Catch: Exception -> 0x0e4a, all -> 0x0ec5, IOException -> 0x0ec9, TryCatch #7 {IOException -> 0x0ec9, blocks: (B:76:0x080c, B:100:0x0ab3, B:101:0x0ab6, B:103:0x0ac4, B:104:0x0b0c, B:106:0x0b22, B:107:0x0b69, B:109:0x0b7b, B:111:0x0be4, B:113:0x0c7f, B:115:0x0cd1, B:117:0x0cf6, B:119:0x0d87, B:141:0x0dd6, B:142:0x0dd9, B:184:0x0e4a, B:185:0x0ec4, B:147:0x0ddf, B:149:0x0de6, B:150:0x0de7, B:158:0x0df7, B:160:0x0dfe, B:161:0x0dff, B:164:0x0e08, B:166:0x0e0e, B:167:0x0e0f, B:170:0x0e18, B:172:0x0e1e, B:173:0x0e1f), top: B:288:0x080c }] */
            /* JADX WARN: Code duplicated, block: B:106:0x0b22 A[Catch: Exception -> 0x0e4a, all -> 0x0ec5, IOException -> 0x0ec9, TryCatch #7 {IOException -> 0x0ec9, blocks: (B:76:0x080c, B:100:0x0ab3, B:101:0x0ab6, B:103:0x0ac4, B:104:0x0b0c, B:106:0x0b22, B:107:0x0b69, B:109:0x0b7b, B:111:0x0be4, B:113:0x0c7f, B:115:0x0cd1, B:117:0x0cf6, B:119:0x0d87, B:141:0x0dd6, B:142:0x0dd9, B:184:0x0e4a, B:185:0x0ec4, B:147:0x0ddf, B:149:0x0de6, B:150:0x0de7, B:158:0x0df7, B:160:0x0dfe, B:161:0x0dff, B:164:0x0e08, B:166:0x0e0e, B:167:0x0e0f, B:170:0x0e18, B:172:0x0e1e, B:173:0x0e1f), top: B:288:0x080c }] */
            /* JADX WARN: Code duplicated, block: B:111:0x0be4 A[Catch: all -> 0x0ec5, IOException -> 0x0ec9, TryCatch #7 {IOException -> 0x0ec9, blocks: (B:76:0x080c, B:100:0x0ab3, B:101:0x0ab6, B:103:0x0ac4, B:104:0x0b0c, B:106:0x0b22, B:107:0x0b69, B:109:0x0b7b, B:111:0x0be4, B:113:0x0c7f, B:115:0x0cd1, B:117:0x0cf6, B:119:0x0d87, B:141:0x0dd6, B:142:0x0dd9, B:184:0x0e4a, B:185:0x0ec4, B:147:0x0ddf, B:149:0x0de6, B:150:0x0de7, B:158:0x0df7, B:160:0x0dfe, B:161:0x0dff, B:164:0x0e08, B:166:0x0e0e, B:167:0x0e0f, B:170:0x0e18, B:172:0x0e1e, B:173:0x0e1f), top: B:288:0x080c }] */
            /* JADX WARN: Code duplicated, block: B:113:0x0c7f A[Catch: all -> 0x0ec5, IOException -> 0x0ec9, TryCatch #7 {IOException -> 0x0ec9, blocks: (B:76:0x080c, B:100:0x0ab3, B:101:0x0ab6, B:103:0x0ac4, B:104:0x0b0c, B:106:0x0b22, B:107:0x0b69, B:109:0x0b7b, B:111:0x0be4, B:113:0x0c7f, B:115:0x0cd1, B:117:0x0cf6, B:119:0x0d87, B:141:0x0dd6, B:142:0x0dd9, B:184:0x0e4a, B:185:0x0ec4, B:147:0x0ddf, B:149:0x0de6, B:150:0x0de7, B:158:0x0df7, B:160:0x0dfe, B:161:0x0dff, B:164:0x0e08, B:166:0x0e0e, B:167:0x0e0f, B:170:0x0e18, B:172:0x0e1e, B:173:0x0e1f), top: B:288:0x080c }] */
            /* JADX WARN: Code duplicated, block: B:115:0x0cd1 A[Catch: all -> 0x0ec5, IOException -> 0x0ec9, TryCatch #7 {IOException -> 0x0ec9, blocks: (B:76:0x080c, B:100:0x0ab3, B:101:0x0ab6, B:103:0x0ac4, B:104:0x0b0c, B:106:0x0b22, B:107:0x0b69, B:109:0x0b7b, B:111:0x0be4, B:113:0x0c7f, B:115:0x0cd1, B:117:0x0cf6, B:119:0x0d87, B:141:0x0dd6, B:142:0x0dd9, B:184:0x0e4a, B:185:0x0ec4, B:147:0x0ddf, B:149:0x0de6, B:150:0x0de7, B:158:0x0df7, B:160:0x0dfe, B:161:0x0dff, B:164:0x0e08, B:166:0x0e0e, B:167:0x0e0f, B:170:0x0e18, B:172:0x0e1e, B:173:0x0e1f), top: B:288:0x080c }] */
            /* JADX WARN: Code duplicated, block: B:117:0x0cf6 A[Catch: all -> 0x0ec5, IOException -> 0x0ec9, TryCatch #7 {IOException -> 0x0ec9, blocks: (B:76:0x080c, B:100:0x0ab3, B:101:0x0ab6, B:103:0x0ac4, B:104:0x0b0c, B:106:0x0b22, B:107:0x0b69, B:109:0x0b7b, B:111:0x0be4, B:113:0x0c7f, B:115:0x0cd1, B:117:0x0cf6, B:119:0x0d87, B:141:0x0dd6, B:142:0x0dd9, B:184:0x0e4a, B:185:0x0ec4, B:147:0x0ddf, B:149:0x0de6, B:150:0x0de7, B:158:0x0df7, B:160:0x0dfe, B:161:0x0dff, B:164:0x0e08, B:166:0x0e0e, B:167:0x0e0f, B:170:0x0e18, B:172:0x0e1e, B:173:0x0e1f), top: B:288:0x080c }] */
            /* JADX WARN: Code duplicated, block: B:160:0x0dfe A[Catch: Exception -> 0x0e4a, all -> 0x0ec5, IOException -> 0x0ec9, TryCatch #7 {IOException -> 0x0ec9, blocks: (B:76:0x080c, B:100:0x0ab3, B:101:0x0ab6, B:103:0x0ac4, B:104:0x0b0c, B:106:0x0b22, B:107:0x0b69, B:109:0x0b7b, B:111:0x0be4, B:113:0x0c7f, B:115:0x0cd1, B:117:0x0cf6, B:119:0x0d87, B:141:0x0dd6, B:142:0x0dd9, B:184:0x0e4a, B:185:0x0ec4, B:147:0x0ddf, B:149:0x0de6, B:150:0x0de7, B:158:0x0df7, B:160:0x0dfe, B:161:0x0dff, B:164:0x0e08, B:166:0x0e0e, B:167:0x0e0f, B:170:0x0e18, B:172:0x0e1e, B:173:0x0e1f), top: B:288:0x080c }] */
            /* JADX WARN: Code duplicated, block: B:161:0x0dff A[Catch: Exception -> 0x0e4a, all -> 0x0ec5, IOException -> 0x0ec9, TryCatch #7 {IOException -> 0x0ec9, blocks: (B:76:0x080c, B:100:0x0ab3, B:101:0x0ab6, B:103:0x0ac4, B:104:0x0b0c, B:106:0x0b22, B:107:0x0b69, B:109:0x0b7b, B:111:0x0be4, B:113:0x0c7f, B:115:0x0cd1, B:117:0x0cf6, B:119:0x0d87, B:141:0x0dd6, B:142:0x0dd9, B:184:0x0e4a, B:185:0x0ec4, B:147:0x0ddf, B:149:0x0de6, B:150:0x0de7, B:158:0x0df7, B:160:0x0dfe, B:161:0x0dff, B:164:0x0e08, B:166:0x0e0e, B:167:0x0e0f, B:170:0x0e18, B:172:0x0e1e, B:173:0x0e1f), top: B:288:0x080c }] */
            /* JADX WARN: Code duplicated, block: B:192:0x0ecb  */
            /* JADX WARN: Code duplicated, block: B:225:0x13d9 A[EDGE_INSN: B:225:0x13d9->B:226:0x13de BREAK  A[LOOP:5: B:205:0x10d5->B:224:0x13c9], PHI: r1 r3
  0x13d9: PHI (r1v45 int) = (r1v42 int), (r1v42 int), (r1v51 int) binds: [B:201:0x1052, B:203:0x10cf, B:340:0x13d9] A[DONT_GENERATE, DONT_INLINE]
  0x13d9: PHI (r3v79 java.lang.String[]) = (r3v77 java.lang.String[]), (r3v77 java.lang.String[]), (r3v82 java.lang.String[]) binds: [B:201:0x1052, B:203:0x10cf, B:340:0x13d9] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:25:0x0396  */
            /* JADX WARN: Code duplicated, block: B:27:0x0399  */
            /* JADX WARN: Code duplicated, block: B:286:0x0739 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:30:0x03bb A[Catch: all -> 0x1bbd, TryCatch #15 {all -> 0x1bbd, blocks: (B:13:0x0221, B:15:0x0237, B:17:0x028b, B:28:0x03a4, B:30:0x03bb, B:32:0x0418, B:215:0x1277, B:217:0x128e, B:219:0x12e3, B:241:0x1469, B:243:0x1476, B:244:0x14b5, B:246:0x15c4, B:248:0x15d1, B:250:0x161a, B:252:0x1735, B:254:0x1742, B:255:0x178c, B:257:0x1882, B:259:0x188f, B:260:0x18dd, B:262:0x19cd, B:264:0x19da, B:265:0x1a28), top: B:300:0x0221 }] */
            /* JADX WARN: Code duplicated, block: B:315:0x06df A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:31:0x0414  */
            /* JADX WARN: Code duplicated, block: B:327:0x04c6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:328:0x04d7 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:334:0x0ec9 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:335:0x0dab A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:336:0x0dab A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:337:0x0dab A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:36:0x04c8 A[LOOP:1: B:26:0x0397->B:36:0x04c8, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:37:0x04d7 A[EDGE_INSN: B:37:0x04d7->B:38:0x04de BREAK  A[LOOP:1: B:26:0x0397->B:36:0x04c8], PHI: r3 r4 r7
  0x04d7: PHI (r3v130 int) = (r3v73 int), (r3v320 int) binds: [B:24:0x0394, B:328:0x04d7] A[DONT_GENERATE, DONT_INLINE]
  0x04d7: PHI (r4v194 java.lang.Object) = (r4v149 java.lang.Object), (r4v232 java.lang.Object) binds: [B:24:0x0394, B:328:0x04d7] A[DONT_GENERATE, DONT_INLINE]
  0x04d7: PHI (r7v97 int) = (r7v96 int), (r7v202 int) binds: [B:24:0x0394, B:328:0x04d7] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:40:0x05bb  */
            /* JADX WARN: Code duplicated, block: B:42:0x0643  */
            /* JADX WARN: Code duplicated, block: B:44:0x0661  */
            /* JADX WARN: Multi-variable type inference failed */
            public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i6, int i7, int i8) throws Throwable {
                int i9;
                String[] strArr;
                Object obj;
                int i10;
                int i11;
                String[] strArr2;
                int i12;
                int i13;
                int length;
                int i14;
                int i15;
                String str5;
                int i16;
                int i17;
                int i18;
                Object obj2;
                int i19;
                int i20;
                Object obj3;
                int i21;
                String[] strArrSplit;
                int length2;
                int i22;
                String str6;
                Object[] objArr;
                int i23;
                int i24;
                int i25;
                Process processExec;
                Throwable th;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Throwable th2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                DataOutputStream dataOutputStream;
                Throwable th3;
                Throwable cause;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                String[] strArrSplit2;
                int length3;
                int i26;
                String str7;
                Object[] objArr2;
                Object[] objArr3;
                Object[] objArr4;
                String[] strArrSplit3;
                int i27;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                int i28;
                int i29;
                int i30 = 1;
                int i31 = 0;
                if (context != null) {
                    try {
                        int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i32 = ~jumpTapTimeout;
                        int i33 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i34 = ~((i32 ^ i33) | (i33 & i32));
                        int i35 = ~jumpTapTimeout;
                        int i36 = (i35 ^ 23) | (i35 & 23);
                        int i37 = ~i36;
                        int i38 = (i34 & i37) | (i34 ^ i37);
                        int i39 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i40 = ~((i39 & 23) | (i39 ^ 23));
                        int i41 = (((((jumpTapTimeout * 398) - 9108) - (~(((i38 & i40) | (i38 ^ i40)) * (-397)))) - 1) - (~((~((i35 ^ 23) | (i35 & 23))) * (-397)))) - 1;
                        int i42 = ~i36;
                        int i43 = ((~((jumpTapTimeout & (-24)) | ((-24) ^ jumpTapTimeout))) | (i42 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ i42)) * 397;
                        int i44 = (i41 & i43) + (i43 | i41);
                        Object[] objArr5 = new Object[1];
                        c(new char[]{54822, 55930, 55483, 53473, 19374, 1345, 25588, 14081, 45966, 4651, 19917, 36426, 22609, 61719, 20899, 62874, 65108, 41776, 865, 41877, 61372, 37130, 40641, 24401, 42209, 22973}, i44, objArr5);
                        Class<?> cls = Class.forName((String) objArr5[0]);
                        int i45 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int i46 = i45 * (-661);
                        int i47 = (i46 & (-661)) + (i46 | (-661));
                        int i48 = ~i6;
                        int i49 = ~i45;
                        int i50 = i47 + (((~((i49 ^ (-2)) | (i49 & (-2)))) | i48) * 1324);
                        int i51 = ~((i45 ^ i6) | (i45 & i6));
                        int i52 = ~((i6 ^ 1) | (i6 & 1));
                        int i53 = ((i51 ^ i52) | (i51 & i52)) * (-1324);
                        int i54 = (i50 & i53) + (i50 | i53);
                        int i55 = ~i45;
                        int i56 = ~((i55 & 1) | (i55 ^ 1));
                        int i57 = ~(((-2) ^ i45) | (i45 & (-2)));
                        int i58 = i54 + (((i56 ^ i57) | (i57 & i56)) * 662);
                        Object[] objArr6 = new Object[1];
                        e(new char[]{61554, 43840, 552, 34989, 56297, 63354, 27525, 58438, 59191, 56084, 18700, 18099, 60328, 56867}, new char[]{0, 0, 0, 0}, (char) (28039 - TextUtils.lastIndexOf("", '0', 0, 0)), new char[]{58629, 18272, 34884, 8557}, i58, objArr6);
                        String str8 = (String) cls.getMethod((String) objArr6[0], null).invoke(context, null);
                        int i59 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int i60 = (i59 & 24) + (i59 | 24);
                        Object[] objArr7 = new Object[1];
                        c(new char[]{54822, 55930, 55483, 53473, 19374, 1345, 25588, 14081, 45966, 4651, 19917, 36426, 22609, 61719, 20899, 62874, 65108, 41776, 865, 41877, 61372, 37130, 40641, 24401, 42209, 22973}, i60, objArr7);
                        Class<?> cls2 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        c(new char[]{12734, 8335, '[', 45337, 32924, 12240, 25953, 23769, 17735, 14478, 29298, 53484, 48888, 60653, 43300, 8767, 7254, 52692, 48146, 57957}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 18, objArr8);
                        Object objInvoke = cls2.getMethod((String) objArr8[0], null).invoke(context, null);
                        byte[] bArr = $$a;
                        byte b2 = (byte) (-bArr[35]);
                        byte b3 = bArr[28];
                        Object[] objArr9 = new Object[1];
                        f(b2, b3, b3, objArr9);
                        Class<?> cls3 = Class.forName((String) objArr9[0]);
                        byte b4 = bArr[57];
                        int i61 = $$b;
                        Object[] objArr10 = new Object[1];
                        f(b4, (byte) (i61 - 5), (byte) (-bArr[40]), objArr10);
                        int iIndexOf = ((String) cls3.getField((String) objArr10[0]).get(objInvoke)).indexOf(str8);
                        char c = '3';
                        if (iIndexOf > 0) {
                            byte b5 = (byte) (-bArr[35]);
                            byte b6 = bArr[28];
                            Object[] objArr11 = new Object[1];
                            f(b5, b6, b6, objArr11);
                            Class<?> cls4 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            f(bArr[57], (byte) (i61 - 5), (byte) (-bArr[40]), objArr12);
                            String str9 = (String) cls4.getField((String) objArr12[0]).get(objInvoke);
                            int length4 = str9.length();
                            int i62 = (length4 ^ (-16)) + ((length4 & (-16)) << 1);
                            if (i62 >= 0) {
                                int i63 = 0;
                                while (true) {
                                    if (i63 > i62) {
                                        i14 = i48;
                                        i15 = 0;
                                        break;
                                    }
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i64 = i63 * (-885);
                                    int i65 = ((28368 | i64) << 1) - (i64 ^ 28368);
                                    int i66 = ~i63;
                                    int i67 = ~(((-17) ^ i66) | ((-17) & i66));
                                    int i68 = ~(i66 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                    int i69 = (i67 ^ i68) | (i68 & i67);
                                    int i70 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i71 = i70 | 16;
                                    int i72 = ~((i71 ^ i63) | (i71 & i63));
                                    int i73 = i65 + (((i69 ^ i72) | (i72 & i69)) * 886);
                                    int i74 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i75 = ~((i74 & i63) | (i74 ^ i63));
                                    String strSubstring = str9.substring(i63, (((i73 - (~(((i75 & 16) | (i75 ^ 16)) * (-1772)))) - 1) - (~(-(-((~((i70 ^ 16) | (i70 & 16))) * 886))))) - 1);
                                    try {
                                        Object[] objArr13 = new Object[2];
                                        objArr13[i30] = 931995;
                                        objArr13[i31] = strSubstring;
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char offsetAfter = (char) TextUtils.getOffsetAfter("", i31);
                                            int iIndexOf2 = TextUtils.indexOf("", "", i31, i31) + 3393;
                                            int iAxisFromString = 8 - MotionEvent.axisFromString("");
                                            byte[] bArr2 = $$d;
                                            byte b7 = (byte) (-bArr2[c]);
                                            Object[] objArr14 = new Object[i30];
                                            h(b7, (byte) (b7 - 5), bArr2[37], objArr14);
                                            String str10 = (String) objArr14[0];
                                            Class[] clsArr = new Class[2];
                                            clsArr[0] = String.class;
                                            clsArr[i30] = Integer.TYPE;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, iIndexOf2, iAxisFromString, 1203525406, false, str10, clsArr);
                                        }
                                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr13)).longValue();
                                        long j = 314428477;
                                        long j2 = -575;
                                        long j3 = (j2 * j) + (j2 * jLongValue);
                                        long j4 = 576;
                                        long j5 = -1;
                                        long j6 = j ^ j5;
                                        long j7 = jLongValue ^ j5;
                                        long j8 = (j6 | j7) ^ j5;
                                        int i76 = i62;
                                        i14 = i48;
                                        long j9 = i6;
                                        long j10 = j3 + ((j8 | ((j7 | j9) ^ j5)) * j4) + ((((j6 | jLongValue) ^ j5) | (((j7 | (j9 ^ j5)) | j) ^ j5)) * j4) + (j4 * j8) + ((long) (-316498354));
                                        int i77 = ~i6;
                                        int i78 = (~(784566165 | i77)) | (-2144577472);
                                        int i79 = ~((-713163414) | i6);
                                        int i80 = ((int) (j10 >> 32)) & ((-1398840534) + ((i78 | i79) * (-502)) + (((~(i77 | (-1360011307))) | i79) * TypedValues.PositionType.TYPE_DRAWPATH));
                                        int i81 = (int) Runtime.getRuntime().totalMemory();
                                        int i82 = ((int) j10) & (((~(2133041837 | i81)) * TypedValues.CycleType.TYPE_EASING) + 2097165357 + (((~((~i81) | 2133041837)) | 723649192) * TypedValues.CycleType.TYPE_EASING));
                                        if (((i82 & i80) | (i80 ^ i82)) == -725904754) {
                                            i15 = 1;
                                            break;
                                        }
                                        i63++;
                                        i48 = i14;
                                        i62 = i76;
                                        str9 = str9;
                                        c = '3';
                                        i30 = 1;
                                        i31 = 0;
                                    } catch (Throwable th4) {
                                        Throwable cause2 = th4.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th4;
                                    }
                                }
                                int i83 = -i15;
                                int i84 = ((i15 & i83) | (i15 ^ i83)) >> 31;
                                int i85 = (~i84) & i6;
                                int i86 = i84 & (i6 ^ 20);
                                int i87 = (i86 & i85) | (i85 ^ i86);
                                byte[] bArr3 = $$a;
                                byte b8 = (byte) (-bArr3[35]);
                                byte b9 = bArr3[28];
                                Object[] objArr15 = new Object[1];
                                f(b8, b9, b9, objArr15);
                                Class<?> cls5 = Class.forName((String) objArr15[0]);
                                Object[] objArr16 = new Object[1];
                                f(bArr3[57], (byte) ($$b - 5), (byte) (-bArr3[40]), objArr16);
                                str5 = (String) cls5.getField((String) objArr16[0]).get(objInvoke);
                                int length5 = str5.length();
                                i16 = 1;
                                i17 = (length5 ^ (-6)) + ((length5 & (-6)) << 1);
                                if (i17 >= 0) {
                                    i18 = iIndexOf;
                                    obj2 = objInvoke;
                                    i10 = i14;
                                    i19 = 0;
                                    break;
                                }
                                i27 = 0;
                                while (true) {
                                    if (i27 <= i17) {
                                        i18 = iIndexOf;
                                        obj2 = objInvoke;
                                        i10 = i14;
                                        i19 = 0;
                                        break;
                                    }
                                    String strSubstring2 = str5.substring(i27, (i27 ^ 6) + ((i27 & 6) << i16));
                                    Object[] objArr17 = new Object[2];
                                    objArr17[i16] = 931995;
                                    objArr17[0] = strSubstring2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 3393;
                                        int edgeSlop = 9 - (ViewConfiguration.getEdgeSlop() >> 16);
                                        byte[] bArr4 = $$d;
                                        byte b10 = (byte) (-bArr4[51]);
                                        Object[] objArr18 = new Object[1];
                                        h(b10, (byte) (b10 - 5), bArr4[37], objArr18);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, longPressTimeout, edgeSlop, 1203525406, false, (String) objArr18[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr17)).longValue();
                                    long j11 = 406350169;
                                    long j12 = 367;
                                    long j13 = (j12 * j11) + (j12 * jLongValue2);
                                    long j14 = -366;
                                    i18 = iIndexOf;
                                    obj2 = objInvoke;
                                    long j15 = -1;
                                    long j16 = jLongValue2 ^ j15;
                                    i10 = i14;
                                    long jUptimeMillis = (int) SystemClock.uptimeMillis();
                                    long j17 = j13 + ((j11 | jLongValue2) * j14) + (j14 * (j11 | ((j16 | jUptimeMillis) ^ j15))) + (((long) 366) * ((j15 ^ (jUptimeMillis | (j16 | j11))) | (((j11 ^ j15) | jLongValue2) ^ j15))) + ((long) (-408420046));
                                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                    i28 = ((int) (j17 >> 32)) & ((-2005432166) + (((~(917467969 | iMaxMemory)) | (-2007988052)) * 104) + ((~((~iMaxMemory) | (-849752834))) * (-104)) + ((iMaxMemory | (-1940272916)) * 104));
                                    int iMyPid = Process.myPid();
                                    i29 = ((int) j17) & (2005432269 + (((~((-1515082548) | iMyPid)) | 1342591778) * 104) + ((~((~iMyPid) | 1515149107)) * (-104)) + ((iMyPid | 1342658338) * 104));
                                    if (((i29 & i28) | (i28 ^ i29)) == -2096167706) {
                                        i19 = 1;
                                        break;
                                    }
                                    i27++;
                                    i17 = i17;
                                    objInvoke = obj2;
                                    iIndexOf = i18;
                                    str5 = str5;
                                    i14 = i10;
                                    i16 = 1;
                                }
                                i20 = ~i6;
                                int i88 = -i19;
                                int i89 = ((i19 & i88) | (i19 ^ i88)) >> 31;
                                int i90 = i6 ^ i87;
                                int i91 = -i90;
                                int i92 = ((i90 & i91) | (i90 ^ i91)) >> 31;
                                int i93 = ((i89 & ((i6 & (-21)) | (i20 & 20))) | ((~i89) & i6)) & (~i92);
                                int i94 = i92 & i87;
                                i11 = (i93 & i94) | (i93 ^ i94);
                                byte[] bArr5 = $$a;
                                byte b11 = (byte) (-bArr5[35]);
                                byte b12 = bArr5[28];
                                Object[] objArr19 = new Object[1];
                                f(b11, b12, b12, objArr19);
                                Class<?> cls6 = Class.forName((String) objArr19[0]);
                                Object[] objArr20 = new Object[1];
                                f(bArr5[57], (byte) ($$b - 5), (byte) (-bArr5[40]), objArr20);
                                Field field = cls6.getField((String) objArr20[0]);
                                obj3 = obj2;
                                String str11 = (String) field.get(obj3);
                                int i95 = i18;
                                int i96 = ~i95;
                                int i97 = -i96;
                                String strSubstring3 = str11.substring(0, i95 & (((i96 & i97) | (i96 ^ i97)) >> 31));
                                int i98 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i99 = i98 * (-574);
                                int i100 = (i99 & (-574)) + (i99 | (-574));
                                int i101 = ~i98;
                                int i102 = -(-(((~((i101 ^ i20) | (i101 & i20))) | (~((-2) | i6))) * 1150));
                                int i103 = (i100 ^ i102) + ((i100 & i102) << 1);
                                int i104 = ~(((-2) ^ i6) | ((-2) & i6));
                                int i105 = ~((i10 ^ 1) | (i10 & 1));
                                int i106 = ((i104 & i105) | (i104 ^ i105)) * (-575);
                                int i107 = ~((i101 & i6) | (i101 ^ i6));
                                int i108 = ~((i98 & i20) | (i20 ^ i98));
                                int i109 = (((i103 & i106) + (i106 | i103)) - (~(((i107 & i108) | (i107 ^ i108)) * 575))) - 1;
                                Object[] objArr21 = new Object[1];
                                c(new char[]{17185, 15637, 9217, 13934}, i109, objArr21);
                                i21 = 0;
                                strArrSplit = strSubstring3.split((String) objArr21[0]);
                                length2 = strArrSplit.length;
                                i22 = 0;
                                while (i22 < length2) {
                                    str6 = strArrSplit[i22];
                                    int i110 = -View.MeasureSpec.getMode(i21);
                                    int i111 = i110 * (-55);
                                    int i112 = (i111 ^ (-3493325)) + ((i111 & (-3493325)) << 1);
                                    int i113 = ~(i110 | i6);
                                    int i114 = ((i113 ^ 63515) | (i113 & 63515)) * 56;
                                    int i115 = (i112 ^ i114) + ((i112 & i114) << 1) + ((~((i110 ^ 63515) | (i110 & 63515))) * (-56));
                                    int i116 = ~(i20 | 63515);
                                    int i117 = ((i110 & i116) | (i110 ^ i116)) * 56;
                                    String[] strArr3 = strArrSplit;
                                    int i118 = -TextUtils.lastIndexOf("", '0', 0);
                                    int i119 = (i118 ^ (-517371673)) + ((i118 & (-517371673)) << 1);
                                    objArr = new Object[1];
                                    e(new char[]{34984, 47135, 52427}, new char[]{0, 0, 0, 0}, (char) ((i115 ^ i117) + ((i115 & i117) << 1)), new char[]{59469, 10632, 7137, 45304}, i119, objArr);
                                    if (str6.split((String) objArr[0]).length > 1) {
                                        synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.myTid() >> 22), 2267 - View.resolveSizeAndState(0, 0, 0), 34 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1))))) {
                                            try {
                                                int i120 = -KeyEvent.keyCodeFromString("");
                                                int i121 = (i120 ^ 16) + ((i120 & 16) << 1);
                                                Object[] objArr22 = new Object[1];
                                                c(new char[]{25493, 11738, 20687, 21359, 2527, 49292, 23199, 46426, 8750, 31160, 60099, 13964, 50754, 35969, 54904, 32912, 65050, 47632}, i121, objArr22);
                                                String str12 = (String) objArr22[0];
                                                try {
                                                    Runtime runtime = Runtime.getRuntime();
                                                    i23 = i20;
                                                    try {
                                                        i24 = length2;
                                                        try {
                                                            Object[] objArr23 = new Object[1];
                                                            e(new char[]{32070, 44509}, new char[]{0, 0, 0, 0}, (char) (52251 - (~ExpandableListView.getPackedPositionChild(0L))), new char[]{22928, 63202, 7029, 972}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr23);
                                                            processExec = runtime.exec((String) objArr23[0], (String[]) null, (File) null);
                                                            try {
                                                                Object[] objArr24 = {processExec.getInputStream()};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                                    try {
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", ""), 2142 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getJumpTapTimeout() >> 16) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                        Throwable cause3 = th.getCause();
                                                                        if (cause3 != null) {
                                                                            throw cause3;
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                Object objNewInstance = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr24);
                                                                try {
                                                                    Object[] objArr25 = {processExec.getErrorStream()};
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                        try {
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 2142 - View.MeasureSpec.getMode(0), (ViewConfiguration.getTouchSlop() >> 8) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                                                        } catch (Throwable th6) {
                                                                            th2 = th6;
                                                                            Throwable cause4 = th2.getCause();
                                                                            if (cause4 != null) {
                                                                                throw cause4;
                                                                            }
                                                                            throw th2;
                                                                        }
                                                                    }
                                                                    Object objNewInstance2 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr25);
                                                                    dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                                                                    try {
                                                                        byte[] bArr6 = $$a;
                                                                        obj3 = obj3;
                                                                        try {
                                                                            Object[] objArr26 = new Object[1];
                                                                            f(bArr6[58], bArr6[34], (byte) (bArr6[60] - 1), objArr26);
                                                                            Class<?> cls7 = Class.forName((String) objArr26[0]);
                                                                            byte b13 = bArr6[28];
                                                                            byte b14 = (byte) 29;
                                                                            i25 = i22;
                                                                            try {
                                                                                Object[] objArr27 = new Object[1];
                                                                                f(b13, (byte) (b13 | 54), b14, objArr27);
                                                                                cls7.getMethod((String) objArr27[0], null).invoke(objNewInstance, null);
                                                                                try {
                                                                                    i11 = i11;
                                                                                    try {
                                                                                        Object[] objArr28 = new Object[1];
                                                                                        f(bArr6[58], bArr6[34], (byte) (bArr6[60] - 1), objArr28);
                                                                                        Class<?> cls8 = Class.forName((String) objArr28[0]);
                                                                                        byte b15 = bArr6[28];
                                                                                        Object[] objArr29 = new Object[1];
                                                                                        f(b15, (byte) (b15 | 54), b14, objArr29);
                                                                                        cls8.getMethod((String) objArr29[0], null).invoke(objNewInstance2, null);
                                                                                        try {
                                                                                            try {
                                                                                                StringBuilder sb = new StringBuilder();
                                                                                                sb.append(str12);
                                                                                                int i122 = -Color.green(0);
                                                                                                int i123 = ((i122 | 1) << 1) - (i122 ^ 1);
                                                                                                Object[] objArr30 = new Object[1];
                                                                                                c(new char[]{28737, 14442, 211, 5277}, i123, objArr30);
                                                                                                sb.append((String) objArr30[0]);
                                                                                                String string = sb.toString();
                                                                                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0);
                                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                                int i124 = iLastIndexOf * (-344);
                                                                                                int i125 = (i124 ^ (-12812624)) + ((i124 & (-12812624)) << 1);
                                                                                                int i126 = ~iLastIndexOf;
                                                                                                int i127 = ~((i126 ^ (-37247)) | (i126 & (-37247)));
                                                                                                int i128 = ~(i126 | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                                                                                int i129 = -(-(((i127 ^ i128) | (i127 & i128)) * 345));
                                                                                                int i130 = (i125 ^ i129) + ((i125 & i129) << 1);
                                                                                                int i131 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                                                                int i132 = ~((i126 ^ i131) | (i131 & i126));
                                                                                                int i133 = ~((-37247) | iLastIndexOf);
                                                                                                int i134 = i130 + (((i132 ^ i133) | (i133 & i132)) * 345);
                                                                                                int i135 = (i126 ^ (-37247)) | (i126 & (-37247));
                                                                                                int i136 = (~((i135 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i135 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) * 345;
                                                                                                int i137 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                                                                                int i138 = ((i137 | (-1788057051)) << 1) - (i137 ^ (-1788057051));
                                                                                                Object[] objArr31 = new Object[1];
                                                                                                e(new char[]{58085, 49867, 31058, 11609, 65377}, new char[]{0, 0, 0, 0}, (char) (((i134 | i136) << 1) - (i136 ^ i134)), new char[]{9504, 27754, 32149, 16785}, i138, objArr31);
                                                                                                dataOutputStream.write(string.getBytes((String) objArr31[0]));
                                                                                                dataOutputStream.flush();
                                                                                                int i139 = -KeyEvent.normalizeMetaState(0);
                                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                                int i140 = i139 * 477;
                                                                                                int i141 = (i140 & (-2375)) + (i140 | (-2375));
                                                                                                int i142 = ~i139;
                                                                                                int i143 = (-6) | i139;
                                                                                                int i144 = ((~((i142 & 5) | (i142 ^ 5))) | (~((i143 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i143 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))) * (-476);
                                                                                                int i145 = (((i141 | i144) << 1) - (i144 ^ i141)) + ((~(((-6) ^ i139) | ((-6) & i139) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) * 952);
                                                                                                int i146 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                                                                int i147 = (i146 & (-6)) | ((-6) ^ i146);
                                                                                                int i148 = (~((i139 & i147) | (i147 ^ i139))) * 476;
                                                                                                int i149 = ((i145 | i148) << 1) - (i148 ^ i145);
                                                                                                Object[] objArr32 = new Object[1];
                                                                                                c(new char[]{65016, 19344, 22143, 22661, 62219, 23019, 15277, 35011}, i149, objArr32);
                                                                                                String str13 = (String) objArr32[0];
                                                                                                Object[] objArr33 = new Object[1];
                                                                                                e(new char[]{58085, 49867, 31058, 11609, 65377}, new char[]{0, 0, 0, 0}, (char) (TextUtils.getOffsetBefore("", 0) + 37245), new char[]{9504, 27754, 32149, 16785}, (-1788057053) - (~(-TextUtils.indexOf((CharSequence) "", '0'))), objArr33);
                                                                                                dataOutputStream.write(str13.getBytes((String) objArr33[0]));
                                                                                                dataOutputStream.flush();
                                                                                                try {
                                                                                                    try {
                                                                                                        long jNanoTime = System.nanoTime();
                                                                                                        long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                                        while (true) {
                                                                                                            try {
                                                                                                                processExec.exitValue();
                                                                                                                dataOutputStream = dataOutputStream;
                                                                                                                break;
                                                                                                            } catch (IllegalThreadStateException unused) {
                                                                                                                if (nanos > 0) {
                                                                                                                    try {
                                                                                                                        Object[] objArr34 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                                        byte[] bArr7 = $$a;
                                                                                                                        Object[] objArr35 = new Object[1];
                                                                                                                        f(bArr7[58], bArr7[34], (byte) (bArr7[60] - 1), objArr35);
                                                                                                                        Class<?> cls9 = Class.forName((String) objArr35[0]);
                                                                                                                        byte b16 = bArr7[28];
                                                                                                                        byte b17 = (byte) (b16 | 58);
                                                                                                                        Object[] objArr36 = new Object[1];
                                                                                                                        f(b16, b17, (byte) (b17 >>> 1), objArr36);
                                                                                                                        cls9.getMethod((String) objArr36[0], Long.TYPE).invoke(null, objArr34);
                                                                                                                    } catch (Throwable th7) {
                                                                                                                        Throwable cause5 = th7.getCause();
                                                                                                                        if (cause5 != null) {
                                                                                                                            throw cause5;
                                                                                                                        }
                                                                                                                        throw th7;
                                                                                                                    }
                                                                                                                }
                                                                                                                long nanos2 = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - jNanoTime);
                                                                                                                if (nanos2 <= 0) {
                                                                                                                    break;
                                                                                                                }
                                                                                                                nanos = nanos2;
                                                                                                                dataOutputStream = dataOutputStream;
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            dataOutputStream.close();
                                                                                                        } catch (IOException unused2) {
                                                                                                        }
                                                                                                        try {
                                                                                                            byte[] bArr8 = $$a;
                                                                                                            Object[] objArr37 = new Object[1];
                                                                                                            f(bArr8[58], bArr8[34], (byte) (bArr8[60] - 1), objArr37);
                                                                                                            Class<?> cls10 = Class.forName((String) objArr37[0]);
                                                                                                            byte b18 = bArr8[58];
                                                                                                            int i150 = $$b;
                                                                                                            byte b19 = (byte) (i150 | 24);
                                                                                                            Object[] objArr38 = new Object[1];
                                                                                                            f(b18, b19, (byte) (b19 & 95), objArr38);
                                                                                                            cls10.getMethod((String) objArr38[0], Long.TYPE).invoke(objNewInstance, 100L);
                                                                                                            try {
                                                                                                                Object[] objArr39 = new Object[1];
                                                                                                                f(bArr8[58], bArr8[34], (byte) (bArr8[60] - 1), objArr39);
                                                                                                                Class<?> cls11 = Class.forName((String) objArr39[0]);
                                                                                                                byte b20 = (byte) (i150 | 24);
                                                                                                                Object[] objArr40 = new Object[1];
                                                                                                                f(bArr8[58], b20, (byte) (b20 & 95), objArr40);
                                                                                                                cls11.getMethod((String) objArr40[0], Long.TYPE).invoke(objNewInstance2, 10L);
                                                                                                                try {
                                                                                                                    processExec.destroy();
                                                                                                                    while (true) {
                                                                                                                        if (i26 < length3) {
                                                                                                                            str7 = strArrSplit2[i26];
                                                                                                                            int i151 = -(-MotionEvent.axisFromString(""));
                                                                                                                            int i152 = -TextUtils.getOffsetBefore("", 0);
                                                                                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                                                            int i153 = (i152 * (-751)) - 4642921;
                                                                                                                            int i154 = ~i152;
                                                                                                                            String[] strArr4 = strArrSplit2;
                                                                                                                            int i155 = ~((i154 ^ (-623376936)) | (i154 & (-623376936)));
                                                                                                                            int i156 = length3;
                                                                                                                            int i157 = ~i152;
                                                                                                                            int i158 = i26;
                                                                                                                            int i159 = -(-((i155 | (~((i157 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i157 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5)))) * 1504));
                                                                                                                            int i160 = (i153 & i159) + (i159 | i153);
                                                                                                                            int i161 = (i154 ^ 623376935) | (i154 & 623376935);
                                                                                                                            int i162 = (i160 - (~((~((i161 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i161 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) * (-1504)))) - 1;
                                                                                                                            int i163 = ~((623376935 & i157) | (i157 ^ 623376935));
                                                                                                                            int i164 = ~((-623376936) | i152);
                                                                                                                            int i165 = (i162 - (~(-(-(((i163 & i164) | (i163 ^ i164)) * 752))))) - 1;
                                                                                                                            objArr2 = new Object[1];
                                                                                                                            e(new char[]{44006, 36681, 17049, 29146, 8649, 23470, 29734, 6610, 32689, 58308, 50517, 24750, 47685, 5309, 50711, 30222, 7827, 29944, 11628}, new char[]{0, 0, 0, 0}, (char) ((i151 & 5542) + (i151 | 5542)), new char[]{10139, 10234, 42277, 17685}, i165, objArr2);
                                                                                                                            if (!str7.startsWith((String) objArr2[0])) {
                                                                                                                                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                                                                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                                                                int i166 = iCombineMeasuredStates * 217;
                                                                                                                                int i167 = ((i166 | (-4300)) << 1) - (i166 ^ (-4300));
                                                                                                                                int i168 = (~((iCombineMeasuredStates ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (iCombineMeasuredStates & iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) * 216;
                                                                                                                                int i169 = ((i167 | i168) << 1) - (i168 ^ i167);
                                                                                                                                int i170 = (iCombineMeasuredStates ^ (-21)) | (iCombineMeasuredStates & (-21));
                                                                                                                                int i171 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                                                                                int i172 = (i169 - (~(((i170 & i171) | (i170 ^ i171)) * (-216)))) - 1;
                                                                                                                                int i173 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                                                                                int i174 = i172 + (((~((i173 & iCombineMeasuredStates) | (i173 ^ iCombineMeasuredStates))) | 20) * 216);
                                                                                                                                objArr3 = new Object[1];
                                                                                                                                c(new char[]{10162, 64706, 51265, 46469, 25450, 19094, 35041, 47164, 64468, 28427, 35987, 9962, 5681, 8985, 22779, 39599, 33632, 63328, 43573, 45695, 38538, 8744}, i174, objArr3);
                                                                                                                                if (str7.startsWith((String) objArr3[0])) {
                                                                                                                                    continue;
                                                                                                                                } else {
                                                                                                                                    int i175 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                                                                    objArr4 = new Object[1];
                                                                                                                                    c(new char[]{10295, 18356, 25403, 58169, 31113, 65275, 27726, 19961, 62369, 42099}, (i175 & 8) + (i175 | 8), objArr4);
                                                                                                                                    if (str7.startsWith((String) objArr4[0])) {
                                                                                                                                        int i176 = -Color.rgb(0, 0, 0);
                                                                                                                                        int i177 = -Color.red(0);
                                                                                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                                                                        int i178 = (i177 * 592) - 55165436;
                                                                                                                                        int i179 = ~i177;
                                                                                                                                        int i180 = -(-((~((i179 ^ (-1535903278)) | (i179 & (-1535903278)))) * (-1182)));
                                                                                                                                        int i181 = (i178 & i180) + (i180 | i178);
                                                                                                                                        int i182 = ~i177;
                                                                                                                                        int i183 = ((~((i182 ^ 1535903277) | (i182 & 1535903277) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault7))) | (~((i177 & (-1535903278)) | (i177 ^ (-1535903278))))) * (-591);
                                                                                                                                        int i184 = (i181 ^ i183) + ((i181 & i183) << 1);
                                                                                                                                        int i185 = iTuitionPaymentFragmentspecialinlinedviewModeldefault7 | i179;
                                                                                                                                        int i186 = -(-(((i185 & 1535903277) | (i185 ^ 1535903277)) * 591));
                                                                                                                                        int i187 = ((i184 | i186) << 1) - (i186 ^ i184);
                                                                                                                                        Object[] objArr41 = new Object[1];
                                                                                                                                        e(new char[]{49959}, new char[]{0, 0, 0, 0}, (char) (((i176 | (-16727772)) << 1) - (i176 ^ (-16727772))), new char[]{53898, 29689, 9380, 8129}, i187, objArr41);
                                                                                                                                        strArrSplit3 = str7.split((String) objArr41[0]);
                                                                                                                                        if (strArrSplit3.length > 1 && strArrSplit3[1].equalsIgnoreCase(str6)) {
                                                                                                                                            int i188 = (~(i6 & 20)) & (i6 | 20);
                                                                                                                                            int i189 = (~(i6 & i11)) & (i6 | i11);
                                                                                                                                            int i190 = -i189;
                                                                                                                                            int i191 = ((i189 & i190) | (i189 ^ i190)) >> 31;
                                                                                                                                            i11 = (i188 & (~i191)) | (i11 & i191);
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i26 = (i158 & 1) + (i158 | 1);
                                                                                                                            length3 = i156;
                                                                                                                            strArrSplit2 = strArr4;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } catch (Exception unused3) {
                                                                                                                }
                                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                                                                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                                                                                                                    int i192 = 2142 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                                                                    int deadChar = 45 - KeyEvent.getDeadChar(0, 0);
                                                                                                                    byte[] bArr9 = $$d;
                                                                                                                    Object[] objArr42 = new Object[1];
                                                                                                                    h((byte) (-bArr9[15]), bArr9[3], bArr9[37], objArr42);
                                                                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, i192, deadChar, 399405187, false, (String) objArr42[0], null);
                                                                                                                }
                                                                                                                sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance).toString());
                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                                                                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                                                                    int i193 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2141;
                                                                                                                    int iMyTid = (Process.myTid() >> 22) + 45;
                                                                                                                    byte[] bArr10 = $$d;
                                                                                                                    Object[] objArr43 = new Object[1];
                                                                                                                    h((byte) (-bArr10[15]), bArr10[3], bArr10[37], objArr43);
                                                                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity, i193, iMyTid, 399405187, false, (String) objArr43[0], null);
                                                                                                                }
                                                                                                                sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance2).toString());
                                                                                                                String string2 = sb2.toString();
                                                                                                                int longPressTimeout2 = ViewConfiguration.getLongPressTimeout() >> 16;
                                                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                                                int i194 = longPressTimeout2 * (-129);
                                                                                                                int i195 = ((i194 | 131) << 1) - (i194 ^ 131);
                                                                                                                int i196 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                                                                                                int i197 = (i196 & (-2)) | ((-2) ^ i196);
                                                                                                                int i198 = (~((i197 & longPressTimeout2) | (i197 ^ longPressTimeout2))) * 130;
                                                                                                                int i199 = ((i195 | i198) << 1) - (i198 ^ i195);
                                                                                                                int i200 = (~(((-2) ^ longPressTimeout2) | ((-2) & longPressTimeout2))) * (-260);
                                                                                                                int i201 = (i199 & i200) + (i200 | i199);
                                                                                                                int i202 = ~longPressTimeout2;
                                                                                                                int i203 = ~((i202 & 1) | (i202 ^ 1));
                                                                                                                int i204 = (longPressTimeout2 & (-2)) | ((-2) ^ longPressTimeout2);
                                                                                                                int i205 = ~((i204 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i204 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                                                                                                int i206 = -(-(((i205 & i203) | (i203 ^ i205)) * 130));
                                                                                                                int i207 = ((i201 | i206) << 1) - (i206 ^ i201);
                                                                                                                Object[] objArr44 = new Object[1];
                                                                                                                c(new char[]{28737, 14442, 211, 5277}, i207, objArr44);
                                                                                                                strArrSplit2 = string2.split((String) objArr44[0]);
                                                                                                                length3 = strArrSplit2.length;
                                                                                                                i26 = 0;
                                                                                                            } catch (Throwable th8) {
                                                                                                                Throwable cause6 = th8.getCause();
                                                                                                                if (cause6 != null) {
                                                                                                                    throw cause6;
                                                                                                                }
                                                                                                                throw th8;
                                                                                                            }
                                                                                                        } catch (Throwable th9) {
                                                                                                            Throwable cause7 = th9.getCause();
                                                                                                            if (cause7 != null) {
                                                                                                                throw cause7;
                                                                                                            }
                                                                                                            throw th9;
                                                                                                        }
                                                                                                    } catch (InterruptedException e2) {
                                                                                                        throw e2;
                                                                                                    }
                                                                                                } catch (Throwable th10) {
                                                                                                    try {
                                                                                                        processExec.destroy();
                                                                                                        throw th10;
                                                                                                    } catch (Exception unused4) {
                                                                                                        throw th10;
                                                                                                    }
                                                                                                }
                                                                                            } catch (IOException unused5) {
                                                                                            }
                                                                                        } catch (Exception unused6) {
                                                                                            int iArgb = Color.argb(0, 0, 0, 0);
                                                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                            int i208 = ~((iArgb ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (iArgb & iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                                                                            int i209 = ((iArgb * 673) - 1605880129) + (((i208 & 1034162559) | (i208 ^ 1034162559)) * 672);
                                                                                            int i210 = ~((~iArgb) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                                                                            int i211 = ~((1034162559 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault9 ^ 1034162559));
                                                                                            int i212 = i209 + (((i210 & i211) | (i210 ^ i211)) * (-672));
                                                                                            int i213 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                                                                            int i214 = ~((i213 & (-1034162560)) | ((-1034162560) ^ i213));
                                                                                            int i215 = ~((iArgb & (-1034162560)) | ((-1034162560) ^ iArgb));
                                                                                            int i216 = -(-(((i214 & i215) | (i214 ^ i215)) * 672));
                                                                                            Object[] objArr45 = new Object[1];
                                                                                            e(new char[]{62394, 6746, 56973, 25145, 47514, 58458, 30430, 35680, 45070, 58831, 43774, 51542, 30181, 35320, 57461, 53781, 44764, 30620, 47721, 1037, 47279, 65075, 28317, 29746, 28422, 22569, 24219}, new char[]{0, 0, 0, 0}, (char) (3695 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), new char[]{32763, 42001, 28477, 22542}, (i212 & i216) + (i216 | i212), objArr45);
                                                                                            throw new IOException((String) objArr45[0]);
                                                                                        }
                                                                                    } catch (Throwable th11) {
                                                                                        th = th11;
                                                                                        Throwable th12 = th;
                                                                                        Throwable cause8 = th12.getCause();
                                                                                        if (cause8 != null) {
                                                                                            throw cause8;
                                                                                        }
                                                                                        throw th12;
                                                                                    }
                                                                                } catch (Throwable th13) {
                                                                                    th = th13;
                                                                                }
                                                                            } catch (Throwable th14) {
                                                                                th = th14;
                                                                                th3 = th;
                                                                                cause = th3.getCause();
                                                                                if (cause != null) {
                                                                                    throw cause;
                                                                                }
                                                                                throw th3;
                                                                            }
                                                                        } catch (Throwable th15) {
                                                                            th = th15;
                                                                            th3 = th;
                                                                            cause = th3.getCause();
                                                                            if (cause != null) {
                                                                                throw cause;
                                                                            }
                                                                            throw th3;
                                                                        }
                                                                    } catch (Throwable th16) {
                                                                        th = th16;
                                                                    }
                                                                } catch (Throwable th17) {
                                                                    th2 = th17;
                                                                }
                                                            } catch (Throwable th18) {
                                                                th = th18;
                                                            }
                                                        } catch (IOException unused7) {
                                                            i11 = i11;
                                                            obj3 = obj3;
                                                            i25 = i22;
                                                        } catch (Exception unused8) {
                                                            int iArgb2 = Color.argb(0, 0, 0, 0);
                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                            int i2010 = ~((iArgb2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (iArgb2 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                                            int i2011 = ((iArgb2 * 673) - 1605880129) + (((i2010 & 1034162559) | (i2010 ^ 1034162559)) * 672);
                                                            int i217 = ~((~iArgb2) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                                            int i218 = ~((1034162559 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 ^ 1034162559));
                                                            int i219 = i2011 + (((i217 & i218) | (i217 ^ i218)) * (-672));
                                                            int i2110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                                            int i2111 = ~((i2110 & (-1034162560)) | ((-1034162560) ^ i2110));
                                                            int i2112 = ~((iArgb2 & (-1034162560)) | ((-1034162560) ^ iArgb2));
                                                            int i2113 = -(-(((i2111 & i2112) | (i2111 ^ i2112)) * 672));
                                                            Object[] objArr46 = new Object[1];
                                                            e(new char[]{62394, 6746, 56973, 25145, 47514, 58458, 30430, 35680, 45070, 58831, 43774, 51542, 30181, 35320, 57461, 53781, 44764, 30620, 47721, 1037, 47279, 65075, 28317, 29746, 28422, 22569, 24219}, new char[]{0, 0, 0, 0}, (char) (3695 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), new char[]{32763, 42001, 28477, 22542}, (i219 & i2113) + (i2113 | i219), objArr46);
                                                            throw new IOException((String) objArr46[0]);
                                                        }
                                                    } catch (IOException unused9) {
                                                        i24 = length2;
                                                        i25 = i22;
                                                        i11 = i11;
                                                        i22 = (i25 & 1) + (i25 | 1);
                                                        strArrSplit = strArr3;
                                                        obj3 = obj3;
                                                        i20 = i23;
                                                        length2 = i24;
                                                        i21 = 0;
                                                    } catch (Exception unused10) {
                                                        int iArgb3 = Color.argb(0, 0, 0, 0);
                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                        int i2012 = ~((iArgb3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (iArgb3 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                                        int i2013 = ((iArgb3 * 673) - 1605880129) + (((i2012 & 1034162559) | (i2012 ^ 1034162559)) * 672);
                                                        int i2114 = ~((~iArgb3) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                                        int i2115 = ~((1034162559 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault11 ^ 1034162559));
                                                        int i2116 = i2013 + (((i2114 & i2115) | (i2114 ^ i2115)) * (-672));
                                                        int i2117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                                        int i2118 = ~((i2117 & (-1034162560)) | ((-1034162560) ^ i2117));
                                                        int i2119 = ~((iArgb3 & (-1034162560)) | ((-1034162560) ^ iArgb3));
                                                        int i21110 = -(-(((i2118 & i2119) | (i2118 ^ i2119)) * 672));
                                                        Object[] objArr47 = new Object[1];
                                                        e(new char[]{62394, 6746, 56973, 25145, 47514, 58458, 30430, 35680, 45070, 58831, 43774, 51542, 30181, 35320, 57461, 53781, 44764, 30620, 47721, 1037, 47279, 65075, 28317, 29746, 28422, 22569, 24219}, new char[]{0, 0, 0, 0}, (char) (3695 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), new char[]{32763, 42001, 28477, 22542}, (i2116 & i21110) + (i21110 | i2116), objArr47);
                                                        throw new IOException((String) objArr47[0]);
                                                    }
                                                } catch (Exception unused11) {
                                                }
                                            } catch (IOException unused12) {
                                                i23 = i20;
                                            }
                                        }
                                        i22 = (i25 & 1) + (i25 | 1);
                                        strArrSplit = strArr3;
                                        obj3 = obj3;
                                        i20 = i23;
                                        length2 = i24;
                                        i21 = 0;
                                    } else {
                                        i11 = i11;
                                        obj3 = obj3;
                                        i23 = i20;
                                        i24 = length2;
                                        i25 = i22;
                                    }
                                    i11 = i11;
                                    i22 = (i25 & 1) + (i25 | 1);
                                    strArrSplit = strArr3;
                                    obj3 = obj3;
                                    i20 = i23;
                                    length2 = i24;
                                    i21 = 0;
                                }
                                obj = obj3;
                            } else {
                                i14 = i48;
                                i15 = 0;
                                int i810 = -i15;
                                int i811 = ((i15 & i810) | (i15 ^ i810)) >> 31;
                                int i812 = (~i811) & i6;
                                int i813 = i811 & (i6 ^ 20);
                                int i814 = (i813 & i812) | (i812 ^ i813);
                                byte[] bArr11 = $$a;
                                byte b21 = (byte) (-bArr11[35]);
                                byte b22 = bArr11[28];
                                Object[] objArr110 = new Object[1];
                                f(b21, b22, b22, objArr110);
                                Class<?> cls12 = Class.forName((String) objArr110[0]);
                                Object[] objArr111 = new Object[1];
                                f(bArr11[57], (byte) ($$b - 5), (byte) (-bArr11[40]), objArr111);
                                str5 = (String) cls12.getField((String) objArr111[0]).get(objInvoke);
                                int length6 = str5.length();
                                i16 = 1;
                                i17 = (length6 ^ (-6)) + ((length6 & (-6)) << 1);
                                if (i17 >= 0) {
                                    i18 = iIndexOf;
                                    obj2 = objInvoke;
                                    i10 = i14;
                                    i19 = 0;
                                    break;
                                }
                                i27 = 0;
                                while (true) {
                                    if (i27 <= i17) {
                                        i18 = iIndexOf;
                                        obj2 = objInvoke;
                                        i10 = i14;
                                        i19 = 0;
                                        break;
                                    }
                                    String strSubstring4 = str5.substring(i27, (i27 ^ 6) + ((i27 & 6) << i16));
                                    Object[] objArr112 = new Object[2];
                                    objArr112[i16] = 931995;
                                    objArr112[0] = strSubstring4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                                        int longPressTimeout3 = (ViewConfiguration.getLongPressTimeout() >> 16) + 3393;
                                        int edgeSlop2 = 9 - (ViewConfiguration.getEdgeSlop() >> 16);
                                        byte[] bArr12 = $$d;
                                        byte b110 = (byte) (-bArr12[51]);
                                        Object[] objArr113 = new Object[1];
                                        h(b110, (byte) (b110 - 5), bArr12[37], objArr113);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf3, longPressTimeout3, edgeSlop2, 1203525406, false, (String) objArr113[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr112)).longValue();
                                    long j18 = 406350169;
                                    long j19 = 367;
                                    long j110 = (j19 * j18) + (j19 * jLongValue3);
                                    long j111 = -366;
                                    i18 = iIndexOf;
                                    obj2 = objInvoke;
                                    long j112 = -1;
                                    long j113 = jLongValue3 ^ j112;
                                    i10 = i14;
                                    long jUptimeMillis2 = (int) SystemClock.uptimeMillis();
                                    long j114 = j110 + ((j18 | jLongValue3) * j111) + (j111 * (j18 | ((j113 | jUptimeMillis2) ^ j112))) + (((long) 366) * ((j112 ^ (jUptimeMillis2 | (j113 | j18))) | (((j18 ^ j112) | jLongValue3) ^ j112))) + ((long) (-408420046));
                                    int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                    i28 = ((int) (j114 >> 32)) & ((-2005432166) + (((~(917467969 | iMaxMemory2)) | (-2007988052)) * 104) + ((~((~iMaxMemory2) | (-849752834))) * (-104)) + ((iMaxMemory2 | (-1940272916)) * 104));
                                    int iMyPid2 = Process.myPid();
                                    i29 = ((int) j114) & (2005432269 + (((~((-1515082548) | iMyPid2)) | 1342591778) * 104) + ((~((~iMyPid2) | 1515149107)) * (-104)) + ((iMyPid2 | 1342658338) * 104));
                                    if (((i29 & i28) | (i28 ^ i29)) == -2096167706) {
                                        i19 = 1;
                                        break;
                                    }
                                    i27++;
                                    i17 = i17;
                                    objInvoke = obj2;
                                    iIndexOf = i18;
                                    str5 = str5;
                                    i14 = i10;
                                    i16 = 1;
                                }
                                i20 = ~i6;
                                int i815 = -i19;
                                int i816 = ((i19 & i815) | (i19 ^ i815)) >> 31;
                                int i910 = i6 ^ i814;
                                int i911 = -i910;
                                int i912 = ((i910 & i911) | (i910 ^ i911)) >> 31;
                                int i913 = ((i816 & ((i6 & (-21)) | (i20 & 20))) | ((~i816) & i6)) & (~i912);
                                int i914 = i912 & i814;
                                i11 = (i913 & i914) | (i913 ^ i914);
                                byte[] bArr13 = $$a;
                                byte b111 = (byte) (-bArr13[35]);
                                byte b112 = bArr13[28];
                                Object[] objArr114 = new Object[1];
                                f(b111, b112, b112, objArr114);
                                Class<?> cls13 = Class.forName((String) objArr114[0]);
                                Object[] objArr210 = new Object[1];
                                f(bArr13[57], (byte) ($$b - 5), (byte) (-bArr13[40]), objArr210);
                                Field field2 = cls13.getField((String) objArr210[0]);
                                obj3 = obj2;
                                String str14 = (String) field2.get(obj3);
                                int i915 = i18;
                                int i916 = ~i915;
                                int i917 = -i916;
                                String strSubstring5 = str14.substring(0, i915 & (((i916 & i917) | (i916 ^ i917)) >> 31));
                                int i918 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i919 = i918 * (-574);
                                int i1010 = (i919 & (-574)) + (i919 | (-574));
                                int i1011 = ~i918;
                                int i1012 = -(-(((~((i1011 ^ i20) | (i1011 & i20))) | (~((-2) | i6))) * 1150));
                                int i1013 = (i1010 ^ i1012) + ((i1010 & i1012) << 1);
                                int i1014 = ~(((-2) ^ i6) | ((-2) & i6));
                                int i1015 = ~((i10 ^ 1) | (i10 & 1));
                                int i1016 = ((i1014 & i1015) | (i1014 ^ i1015)) * (-575);
                                int i1017 = ~((i1011 & i6) | (i1011 ^ i6));
                                int i1018 = ~((i918 & i20) | (i20 ^ i918));
                                int i1019 = (((i1013 & i1016) + (i1016 | i1013)) - (~(((i1017 & i1018) | (i1017 ^ i1018)) * 575))) - 1;
                                Object[] objArr211 = new Object[1];
                                c(new char[]{17185, 15637, 9217, 13934}, i1019, objArr211);
                                i21 = 0;
                                strArrSplit = strSubstring5.split((String) objArr211[0]);
                                length2 = strArrSplit.length;
                                i22 = 0;
                                while (i22 < length2) {
                                    str6 = strArrSplit[i22];
                                    int i1110 = -View.MeasureSpec.getMode(i21);
                                    int i1111 = i1110 * (-55);
                                    int i1112 = (i1111 ^ (-3493325)) + ((i1111 & (-3493325)) << 1);
                                    int i1113 = ~(i1110 | i6);
                                    int i1114 = ((i1113 ^ 63515) | (i1113 & 63515)) * 56;
                                    int i1115 = (i1112 ^ i1114) + ((i1112 & i1114) << 1) + ((~((i1110 ^ 63515) | (i1110 & 63515))) * (-56));
                                    int i1116 = ~(i20 | 63515);
                                    int i1117 = ((i1110 & i1116) | (i1110 ^ i1116)) * 56;
                                    String[] strArr5 = strArrSplit;
                                    int i1118 = -TextUtils.lastIndexOf("", '0', 0);
                                    int i1119 = (i1118 ^ (-517371673)) + ((i1118 & (-517371673)) << 1);
                                    objArr = new Object[1];
                                    e(new char[]{34984, 47135, 52427}, new char[]{0, 0, 0, 0}, (char) ((i1115 ^ i1117) + ((i1115 & i1117) << 1)), new char[]{59469, 10632, 7137, 45304}, i1119, objArr);
                                    if (str6.split((String) objArr[0]).length > 1) {
                                        synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.myTid() >> 22), 2267 - View.resolveSizeAndState(0, 0, 0), 34 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1))))) {
                                            int i1210 = -KeyEvent.keyCodeFromString("");
                                            int i1211 = (i1210 ^ 16) + ((i1210 & 16) << 1);
                                            Object[] objArr212 = new Object[1];
                                            c(new char[]{25493, 11738, 20687, 21359, 2527, 49292, 23199, 46426, 8750, 31160, 60099, 13964, 50754, 35969, 54904, 32912, 65050, 47632}, i1211, objArr212);
                                            String str15 = (String) objArr212[0];
                                            Runtime runtime2 = Runtime.getRuntime();
                                            i23 = i20;
                                            i24 = length2;
                                            Object[] objArr213 = new Object[1];
                                            e(new char[]{32070, 44509}, new char[]{0, 0, 0, 0}, (char) (52251 - (~ExpandableListView.getPackedPositionChild(0L))), new char[]{22928, 63202, 7029, 972}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr213);
                                            processExec = runtime2.exec((String) objArr213[0], (String[]) null, (File) null);
                                            Object[] objArr214 = {processExec.getInputStream()};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", ""), 2142 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getJumpTapTimeout() >> 16) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                            }
                                            Object objNewInstance3 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr214);
                                            Object[] objArr215 = {processExec.getErrorStream()};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 2142 - View.MeasureSpec.getMode(0), (ViewConfiguration.getTouchSlop() >> 8) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                            }
                                            Object objNewInstance4 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr215);
                                            dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                                            byte[] bArr14 = $$a;
                                            obj3 = obj3;
                                            Object[] objArr216 = new Object[1];
                                            f(bArr14[58], bArr14[34], (byte) (bArr14[60] - 1), objArr216);
                                            Class<?> cls14 = Class.forName((String) objArr216[0]);
                                            byte b113 = bArr14[28];
                                            byte b114 = (byte) 29;
                                            i25 = i22;
                                            Object[] objArr217 = new Object[1];
                                            f(b113, (byte) (b113 | 54), b114, objArr217);
                                            cls14.getMethod((String) objArr217[0], null).invoke(objNewInstance3, null);
                                            i11 = i11;
                                            Object[] objArr218 = new Object[1];
                                            f(bArr14[58], bArr14[34], (byte) (bArr14[60] - 1), objArr218);
                                            Class<?> cls15 = Class.forName((String) objArr218[0]);
                                            byte b115 = bArr14[28];
                                            Object[] objArr219 = new Object[1];
                                            f(b115, (byte) (b115 | 54), b114, objArr219);
                                            cls15.getMethod((String) objArr219[0], null).invoke(objNewInstance4, null);
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append(str15);
                                            int i1212 = -Color.green(0);
                                            int i1213 = ((i1212 | 1) << 1) - (i1212 ^ 1);
                                            Object[] objArr310 = new Object[1];
                                            c(new char[]{28737, 14442, 211, 5277}, i1213, objArr310);
                                            sb3.append((String) objArr310[0]);
                                            String string3 = sb3.toString();
                                            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i1214 = iLastIndexOf2 * (-344);
                                            int i1215 = (i1214 ^ (-12812624)) + ((i1214 & (-12812624)) << 1);
                                            int i1216 = ~iLastIndexOf2;
                                            int i1217 = ~((i1216 ^ (-37247)) | (i1216 & (-37247)));
                                            int i1218 = ~(i1216 | iTuitionPaymentFragmentspecialinlinedviewModeldefault12);
                                            int i1219 = -(-(((i1217 ^ i1218) | (i1217 & i1218)) * 345));
                                            int i1310 = (i1215 ^ i1219) + ((i1215 & i1219) << 1);
                                            int i1311 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                            int i1312 = ~((i1216 ^ i1311) | (i1311 & i1216));
                                            int i1313 = ~((-37247) | iLastIndexOf2);
                                            int i1314 = i1310 + (((i1312 ^ i1313) | (i1313 & i1312)) * 345);
                                            int i1315 = (i1216 ^ (-37247)) | (i1216 & (-37247));
                                            int i1316 = (~((i1315 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i1315 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12))) * 345;
                                            int i1317 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                            int i1318 = ((i1317 | (-1788057051)) << 1) - (i1317 ^ (-1788057051));
                                            Object[] objArr311 = new Object[1];
                                            e(new char[]{58085, 49867, 31058, 11609, 65377}, new char[]{0, 0, 0, 0}, (char) (((i1314 | i1316) << 1) - (i1316 ^ i1314)), new char[]{9504, 27754, 32149, 16785}, i1318, objArr311);
                                            dataOutputStream.write(string3.getBytes((String) objArr311[0]));
                                            dataOutputStream.flush();
                                            int i1319 = -KeyEvent.normalizeMetaState(0);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i1410 = i1319 * 477;
                                            int i1411 = (i1410 & (-2375)) + (i1410 | (-2375));
                                            int i1412 = ~i1319;
                                            int i1413 = (-6) | i1319;
                                            int i1414 = ((~((i1412 & 5) | (i1412 ^ 5))) | (~((i1413 & iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | (i1413 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13)))) * (-476);
                                            int i1415 = (((i1411 | i1414) << 1) - (i1414 ^ i1411)) + ((~(((-6) ^ i1319) | ((-6) & i1319) | iTuitionPaymentFragmentspecialinlinedviewModeldefault13)) * 952);
                                            int i1416 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                            int i1417 = (i1416 & (-6)) | ((-6) ^ i1416);
                                            int i1418 = (~((i1319 & i1417) | (i1417 ^ i1319))) * 476;
                                            int i1419 = ((i1415 | i1418) << 1) - (i1418 ^ i1415);
                                            Object[] objArr312 = new Object[1];
                                            c(new char[]{65016, 19344, 22143, 22661, 62219, 23019, 15277, 35011}, i1419, objArr312);
                                            String str16 = (String) objArr312[0];
                                            Object[] objArr313 = new Object[1];
                                            e(new char[]{58085, 49867, 31058, 11609, 65377}, new char[]{0, 0, 0, 0}, (char) (TextUtils.getOffsetBefore("", 0) + 37245), new char[]{9504, 27754, 32149, 16785}, (-1788057053) - (~(-TextUtils.indexOf((CharSequence) "", '0'))), objArr313);
                                            dataOutputStream.write(str16.getBytes((String) objArr313[0]));
                                            dataOutputStream.flush();
                                            long jNanoTime2 = System.nanoTime();
                                            long nanos3 = TimeUnit.MILLISECONDS.toNanos(2000L);
                                            while (true) {
                                                processExec.exitValue();
                                                dataOutputStream = dataOutputStream;
                                                break;
                                            }
                                            dataOutputStream.close();
                                            byte[] bArr15 = $$a;
                                            Object[] objArr314 = new Object[1];
                                            f(bArr15[58], bArr15[34], (byte) (bArr15[60] - 1), objArr314);
                                            Class<?> cls16 = Class.forName((String) objArr314[0]);
                                            byte b116 = bArr15[58];
                                            int i1510 = $$b;
                                            byte b117 = (byte) (i1510 | 24);
                                            Object[] objArr315 = new Object[1];
                                            f(b116, b117, (byte) (b117 & 95), objArr315);
                                            cls16.getMethod((String) objArr315[0], Long.TYPE).invoke(objNewInstance3, 100L);
                                            Object[] objArr316 = new Object[1];
                                            f(bArr15[58], bArr15[34], (byte) (bArr15[60] - 1), objArr316);
                                            Class<?> cls17 = Class.forName((String) objArr316[0]);
                                            byte b23 = (byte) (i1510 | 24);
                                            Object[] objArr48 = new Object[1];
                                            f(bArr15[58], b23, (byte) (b23 & 95), objArr48);
                                            cls17.getMethod((String) objArr48[0], Long.TYPE).invoke(objNewInstance4, 10L);
                                            processExec.destroy();
                                            StringBuilder sb4 = new StringBuilder();
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                                                int i1910 = 2142 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                int deadChar2 = 45 - KeyEvent.getDeadChar(0, 0);
                                                byte[] bArr16 = $$d;
                                                Object[] objArr49 = new Object[1];
                                                h((byte) (-bArr16[15]), bArr16[3], bArr16[37], objArr49);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf4, i1910, deadChar2, 399405187, false, (String) objArr49[0], null);
                                            }
                                            sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance3).toString());
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                int i1911 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2141;
                                                int iMyTid2 = (Process.myTid() >> 22) + 45;
                                                byte[] bArr17 = $$d;
                                                Object[] objArr410 = new Object[1];
                                                h((byte) (-bArr17[15]), bArr17[3], bArr17[37], objArr410);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity2, i1911, iMyTid2, 399405187, false, (String) objArr410[0], null);
                                            }
                                            sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance4).toString());
                                            String string4 = sb4.toString();
                                            int longPressTimeout4 = ViewConfiguration.getLongPressTimeout() >> 16;
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i1912 = longPressTimeout4 * (-129);
                                            int i1913 = ((i1912 | 131) << 1) - (i1912 ^ 131);
                                            int i1914 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                                            int i1915 = (i1914 & (-2)) | ((-2) ^ i1914);
                                            int i1916 = (~((i1915 & longPressTimeout4) | (i1915 ^ longPressTimeout4))) * 130;
                                            int i1917 = ((i1913 | i1916) << 1) - (i1916 ^ i1913);
                                            int i2014 = (~(((-2) ^ longPressTimeout4) | ((-2) & longPressTimeout4))) * (-260);
                                            int i2015 = (i1917 & i2014) + (i2014 | i1917);
                                            int i2016 = ~longPressTimeout4;
                                            int i2017 = ~((i2016 & 1) | (i2016 ^ 1));
                                            int i2018 = (longPressTimeout4 & (-2)) | ((-2) ^ longPressTimeout4);
                                            int i2019 = ~((i2018 & iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | (i2018 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14));
                                            int i2020 = -(-(((i2019 & i2017) | (i2017 ^ i2019)) * 130));
                                            int i2021 = ((i2015 | i2020) << 1) - (i2020 ^ i2015);
                                            Object[] objArr411 = new Object[1];
                                            c(new char[]{28737, 14442, 211, 5277}, i2021, objArr411);
                                            strArrSplit2 = string4.split((String) objArr411[0]);
                                            length3 = strArrSplit2.length;
                                            i26 = 0;
                                            while (true) {
                                                if (i26 < length3) {
                                                    str7 = strArrSplit2[i26];
                                                    int i1511 = -(-MotionEvent.axisFromString(""));
                                                    int i1512 = -TextUtils.getOffsetBefore("", 0);
                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                    int i1513 = (i1512 * (-751)) - 4642921;
                                                    int i1514 = ~i1512;
                                                    String[] strArr6 = strArrSplit2;
                                                    int i1515 = ~((i1514 ^ (-623376936)) | (i1514 & (-623376936)));
                                                    int i1516 = length3;
                                                    int i1517 = ~i1512;
                                                    int i1518 = i26;
                                                    int i1519 = -(-((i1515 | (~((i1517 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | (i1517 & iTuitionPaymentFragmentspecialinlinedviewModeldefault15)))) * 1504));
                                                    int i1610 = (i1513 & i1519) + (i1519 | i1513);
                                                    int i1611 = (i1514 ^ 623376935) | (i1514 & 623376935);
                                                    int i1612 = (i1610 - (~((~((i1611 & iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | (i1611 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15))) * (-1504)))) - 1;
                                                    int i1613 = ~((623376935 & i1517) | (i1517 ^ 623376935));
                                                    int i1614 = ~((-623376936) | i1512);
                                                    int i1615 = (i1612 - (~(-(-(((i1613 & i1614) | (i1613 ^ i1614)) * 752))))) - 1;
                                                    objArr2 = new Object[1];
                                                    e(new char[]{44006, 36681, 17049, 29146, 8649, 23470, 29734, 6610, 32689, 58308, 50517, 24750, 47685, 5309, 50711, 30222, 7827, 29944, 11628}, new char[]{0, 0, 0, 0}, (char) ((i1511 & 5542) + (i1511 | 5542)), new char[]{10139, 10234, 42277, 17685}, i1615, objArr2);
                                                    if (!str7.startsWith((String) objArr2[0])) {
                                                        int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0);
                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault16 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                        int i1616 = iCombineMeasuredStates2 * 217;
                                                        int i1617 = ((i1616 | (-4300)) << 1) - (i1616 ^ (-4300));
                                                        int i1618 = (~((iCombineMeasuredStates2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault16) | (iCombineMeasuredStates2 & iTuitionPaymentFragmentspecialinlinedviewModeldefault16))) * 216;
                                                        int i1619 = ((i1617 | i1618) << 1) - (i1618 ^ i1617);
                                                        int i1710 = (iCombineMeasuredStates2 ^ (-21)) | (iCombineMeasuredStates2 & (-21));
                                                        int i1711 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault16;
                                                        int i1712 = (i1619 - (~(((i1710 & i1711) | (i1710 ^ i1711)) * (-216)))) - 1;
                                                        int i1713 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault16;
                                                        int i1714 = i1712 + (((~((i1713 & iCombineMeasuredStates2) | (i1713 ^ iCombineMeasuredStates2))) | 20) * 216);
                                                        objArr3 = new Object[1];
                                                        c(new char[]{10162, 64706, 51265, 46469, 25450, 19094, 35041, 47164, 64468, 28427, 35987, 9962, 5681, 8985, 22779, 39599, 33632, 63328, 43573, 45695, 38538, 8744}, i1714, objArr3);
                                                        if (str7.startsWith((String) objArr3[0])) {
                                                            int i1715 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            objArr4 = new Object[1];
                                                            c(new char[]{10295, 18356, 25403, 58169, 31113, 65275, 27726, 19961, 62369, 42099}, (i1715 & 8) + (i1715 | 8), objArr4);
                                                            if (str7.startsWith((String) objArr4[0])) {
                                                                int i1716 = -Color.rgb(0, 0, 0);
                                                                int i1717 = -Color.red(0);
                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault17 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                int i1718 = (i1717 * 592) - 55165436;
                                                                int i1719 = ~i1717;
                                                                int i1810 = -(-((~((i1719 ^ (-1535903278)) | (i1719 & (-1535903278)))) * (-1182)));
                                                                int i1811 = (i1718 & i1810) + (i1810 | i1718);
                                                                int i1812 = ~i1717;
                                                                int i1813 = ((~((i1812 ^ 1535903277) | (i1812 & 1535903277) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault17))) | (~((i1717 & (-1535903278)) | (i1717 ^ (-1535903278))))) * (-591);
                                                                int i1814 = (i1811 ^ i1813) + ((i1811 & i1813) << 1);
                                                                int i1815 = iTuitionPaymentFragmentspecialinlinedviewModeldefault17 | i1719;
                                                                int i1816 = -(-(((i1815 & 1535903277) | (i1815 ^ 1535903277)) * 591));
                                                                int i1817 = ((i1814 | i1816) << 1) - (i1816 ^ i1814);
                                                                Object[] objArr412 = new Object[1];
                                                                e(new char[]{49959}, new char[]{0, 0, 0, 0}, (char) (((i1716 | (-16727772)) << 1) - (i1716 ^ (-16727772))), new char[]{53898, 29689, 9380, 8129}, i1817, objArr412);
                                                                strArrSplit3 = str7.split((String) objArr412[0]);
                                                                if (strArrSplit3.length > 1) {
                                                                    continue;
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                    i26 = (i1518 & 1) + (i1518 | 1);
                                                    length3 = i1516;
                                                    strArrSplit2 = strArr6;
                                                }
                                                i22 = (i25 & 1) + (i25 | 1);
                                                strArrSplit = strArr5;
                                                obj3 = obj3;
                                                i20 = i23;
                                                length2 = i24;
                                                i21 = 0;
                                            }
                                        }
                                    } else {
                                        i11 = i11;
                                        obj3 = obj3;
                                        i23 = i20;
                                        i24 = length2;
                                        i25 = i22;
                                    }
                                    i11 = i11;
                                    i22 = (i25 & 1) + (i25 | 1);
                                    strArrSplit = strArr5;
                                    obj3 = obj3;
                                    i20 = i23;
                                    length2 = i24;
                                    i21 = 0;
                                }
                                obj = obj3;
                            }
                        } else {
                            obj = objInvoke;
                            i10 = i48;
                            i11 = i6;
                        }
                        byte[] bArr18 = $$a;
                        byte b24 = (byte) (-bArr18[35]);
                        byte b25 = bArr18[28];
                        Object[] objArr50 = new Object[1];
                        f(b24, b25, b25, objArr50);
                        Class<?> cls18 = Class.forName((String) objArr50[0]);
                        Object[] objArr51 = new Object[1];
                        f(bArr18[57], (byte) ($$b - 5), (byte) (-bArr18[40]), objArr51);
                        String[] strArr7 = {cls18.getField((String) objArr51[0]).get(obj)};
                        Object obj4 = new Object[]{new int[1], strArr7}[0];
                        ((int[]) obj4)[0] = i11;
                        i9 = ((int[]) obj4)[0];
                        String[] strArr8 = strArr7;
                        if ((i7 & 1) == 0) {
                            int threadPriority = Process.getThreadPriority(0);
                            int i220 = ((threadPriority & 20) + (threadPriority | 20)) >> 6;
                            int i221 = -(-KeyEvent.normalizeMetaState(0));
                            int i222 = (i221 ^ 1676114152) + ((i221 & 1676114152) << 1);
                            Object[] objArr52 = new Object[1];
                            e(new char[]{22979, 24454, 19069, 56843, 11246, 2105, 43428, 31142, 62748, 10723, 15154, 47097, 1236}, new char[]{0, 0, 0, 0}, (char) (((i220 | 51052) << 1) - (i220 ^ 51052)), new char[]{59539, 59256, 27747, 62151}, i222, objArr52);
                            try {
                                Object[] objArr53 = {(String) objArr52[0]};
                                int i223 = -(-Color.rgb(0, 0, 0));
                                Object[] objArr54 = new Object[1];
                                c(new char[]{54822, 55930, 55483, 53473, 19374, 1345, 25588, 14081, 45966, 4651, 19917, 36426, 22609, 61719, 20899, 62874, 65108, 41776, 865, 41877, 61372, 37130, 40641, 24401, 42209, 22973}, (i223 & 16777239) + (i223 | 16777239), objArr54);
                                Class<?> cls19 = Class.forName((String) objArr54[0]);
                                int i224 = -TextUtils.getOffsetBefore("", 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault18 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i225 = i224 * (-183);
                                int i226 = ((i225 | 7729115) << 1) - (i225 ^ 7729115);
                                int i227 = ~i224;
                                int i228 = -(-(((i227 & 41779) | (i227 ^ 41779)) * (-368)));
                                int i229 = (i226 & i228) + (i228 | i226);
                                int i230 = ((-41780) & i224) | (i224 ^ (-41780));
                                int i231 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault18;
                                int i232 = i229 + (((i230 & i231) | (i230 ^ i231)) * 184);
                                int i233 = ~i224;
                                int i234 = ~((i233 & (-41780)) | (i233 ^ (-41780)));
                                int i235 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault18;
                                int i236 = ~((i235 & i224) | (i235 ^ i224));
                                int i237 = (i236 & i234) | (i234 ^ i236);
                                int i238 = ~(i224 | 41779);
                                int i239 = ((i238 & i237) | (i237 ^ i238)) * 184;
                                Object[] objArr55 = new Object[1];
                                e(new char[]{49286, 16884, 3898, 31026, 35871, 20884, 51638, 40320, 39785, 53963, 17856, 55620, 37553, 10872, 57925, 16757}, new char[]{0, 0, 0, 0}, (char) ((i232 ^ i239) + ((i239 & i232) << 1)), new char[]{26692, 48456, 13227, 34211}, ExpandableListView.getPackedPositionGroup(0L), objArr55);
                                Object objInvoke2 = cls19.getMethod((String) objArr55[0], String.class).invoke(context, objArr53);
                                if (objInvoke2 == null) {
                                    i12 = i9;
                                    strArr2 = strArr8;
                                    i13 = i6;
                                    break;
                                }
                                Object[] objArr56 = new Object[1];
                                c(new char[]{50779, 40568, 12857, 62313, 54371, 59175, 17240, 13824, 55303, 48076, 28645, 26625, 22787, 43459, 23752, 7925, 17453, 51473, 40388, 21923, 36044, 48802, 48006, 18138, 34314, 17372, 52863, 45290, 2652, 39974, 39854, 6787, 2496, 38960, 51835, 61617, 41718, 22574, 17144, 10683}, 37 - (~(-(-((byte) KeyEvent.getModifierMetaStateMask())))), objArr56);
                                Class<?> cls20 = Class.forName((String) objArr56[0]);
                                int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                int i240 = (scrollDefaultDelay * (-520)) + 7830;
                                int i241 = ~scrollDefaultDelay;
                                int i242 = (i241 & 15) | (i241 ^ 15);
                                int i243 = (~((i242 & i6) | (i242 ^ i6))) * 521;
                                int i244 = (i240 & i243) + (i240 | i243) + ((~(((-16) & scrollDefaultDelay) | ((-16) ^ scrollDefaultDelay))) * (-1042));
                                int i245 = ~(((-16) & scrollDefaultDelay) | ((-16) ^ scrollDefaultDelay));
                                int i246 = ~scrollDefaultDelay;
                                int i247 = ~i6;
                                int i248 = ~(i246 | i247 | 15);
                                int i249 = ((i248 & i245) | (i245 ^ i248)) * 521;
                                int i250 = ((i244 | i249) << 1) - (i249 ^ i244);
                                Object[] objArr57 = new Object[1];
                                c(new char[]{60496, 60401, 50284, 24900, 23174, 18368, 60204, 64408, 45881, 60042, 62190, 36822, 54772, 32441, 5868, 3606, 34227, 56459}, i250, objArr57);
                                List list = (List) cls20.getMethod((String) objArr57[0], null).invoke(objInvoke2, null);
                                if (list == null) {
                                    i12 = i9;
                                    strArr2 = strArr8;
                                    i13 = i6;
                                    break;
                                }
                                Iterator it = list.iterator();
                                loop5: while (true) {
                                    if (!it.hasNext()) {
                                        i12 = i9;
                                        strArr2 = strArr8;
                                        i13 = i6;
                                        break;
                                    }
                                    Object next = it.next();
                                    int i251 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                    int i252 = ((i251 | 30) << 1) - (i251 ^ 30);
                                    Object[] objArr58 = new Object[1];
                                    c(new char[]{61255, 63744, 18142, 40198, 1583, 47040, 13251, 21429, 22976, 13239, 52772, 26537, 54172, 62317, 46072, 40536, 27962, 45735, 10803, 15916, 9670, 52880, 34468, 64189, 55218, 56724, 3438, 22527, 12441, 20432, 21568, 21683}, i252, objArr58);
                                    Class<?> cls21 = Class.forName((String) objArr58[0]);
                                    Object[] objArr59 = new Object[1];
                                    e(new char[]{61554, 43840, 552, 34989, 56297, 63354, 27525, 58438, 59191, 56084, 18700, 18099, 60328, 56867}, new char[]{0, 0, 0, 0}, (char) (28039 - (~(-Color.argb(0, 0, 0, 0)))), new char[]{58629, 18272, 34884, 8557}, TextUtils.getCapsMode("", 0, 0), objArr59);
                                    String str17 = (String) cls21.getMethod((String) objArr59[0], null).invoke(next, null);
                                    int iAxisFromString2 = MotionEvent.axisFromString("");
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault19 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i253 = iAxisFromString2 * (-419);
                                    int i254 = ((i253 | 15998) << 1) - (i253 ^ 15998);
                                    int i255 = -(-((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault19 ^ 38) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault19 & 38))) * TypedValues.CycleType.TYPE_EASING));
                                    int i256 = (i254 & i255) + (i255 | i254);
                                    int i257 = -(-(((~iAxisFromString2) | 38) * (-420)));
                                    int i258 = ((i256 | i257) << 1) - (i256 ^ i257);
                                    int i259 = ~iAxisFromString2;
                                    int i260 = ~((i259 & (-39)) | (i259 ^ (-39)));
                                    int i261 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault19;
                                    int i262 = ~((i261 & 38) | (i261 ^ 38));
                                    int i263 = -(-(((i260 & i262) | (i260 ^ i262)) * TypedValues.CycleType.TYPE_EASING));
                                    int i264 = ((i258 | i263) << 1) - (i263 ^ i258);
                                    Object[] objArr60 = new Object[1];
                                    c(new char[]{50779, 40568, 12857, 62313, 54371, 59175, 17240, 13824, 55303, 48076, 28645, 26625, 22787, 43459, 23752, 7925, 17453, 51473, 40388, 21923, 36044, 48802, 48006, 18138, 34314, 17372, 52863, 45290, 2652, 39974, 39854, 6787, 2496, 38960, 51835, 61617, 41718, 22574, 17144, 10683}, i264, objArr60);
                                    Class<?> cls22 = Class.forName((String) objArr60[0]);
                                    int i265 = -(ViewConfiguration.getTouchSlop() >> 8);
                                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                                    int i266 = iNormalizeMetaState * (-574);
                                    int i267 = (i266 & 272598484) + (i266 | 272598484);
                                    int i268 = ~iNormalizeMetaState;
                                    strArr2 = strArr8;
                                    int i269 = ~(i268 | i10);
                                    Iterator it2 = it;
                                    int i270 = ~(((-1264071211) ^ i6) | ((-1264071211) & i6));
                                    int i271 = ((i269 ^ i270) | (i269 & i270)) * 1150;
                                    i12 = i9;
                                    int i272 = (((i267 & i271) + (i267 | i271)) - (~(((~((i10 ^ 1264071210) | (i10 & 1264071210))) | (~(((-1264071211) ^ i6) | ((-1264071211) & i6)))) * (-575)))) - 1;
                                    int i273 = ~(i268 | i6);
                                    int i274 = ~((iNormalizeMetaState & i247) | (i247 ^ iNormalizeMetaState));
                                    int i275 = ((i273 & i274) | (i273 ^ i274)) * 575;
                                    int i276 = (i272 & i275) + (i275 | i272);
                                    Object[] objArr61 = new Object[1];
                                    e(new char[]{55680, 52420, 59065, 18580, 58948, 47524, 31470, 56100, 59144, 10782, 29201, 53384, 33412, 28839, 5486, 21843, 19915}, new char[]{0, 0, 0, 0}, (char) ((i265 ^ 40713) + ((i265 & 40713) << 1)), new char[]{10767, 22578, 2379, 25503}, i276, objArr61);
                                    if (((Boolean) cls22.getMethod((String) objArr61[0], String.class).invoke(objInvoke2, str17)).booleanValue() && (length = str17.length() - 20) >= 0) {
                                        int i277 = 0;
                                        while (i277 <= length) {
                                            Object[] objArr62 = {str17.substring(i277, ((i277 | 20) << 1) - (i277 ^ 20)), 931995};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                int iIndexOf3 = 3393 - TextUtils.indexOf("", "");
                                                int modifierMetaStateMask = 8 - ((byte) KeyEvent.getModifierMetaStateMask());
                                                byte[] bArr19 = $$d;
                                                byte b26 = (byte) (-bArr19[51]);
                                                Object[] objArr63 = new Object[1];
                                                h(b26, (byte) (b26 - 5), bArr19[37], objArr63);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maximumDrawingCacheSize, iIndexOf3, modifierMetaStateMask, 1203525406, false, (String) objArr63[0], new Class[]{String.class, Integer.TYPE});
                                            }
                                            long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr62)).longValue();
                                            long j20 = 1814950087;
                                            long j21 = (((long) (-523)) * j20) + (((long) 263) * jLongValue4);
                                            long j22 = 262;
                                            int i278 = i277;
                                            Object obj5 = objInvoke2;
                                            long j23 = -1;
                                            long j24 = ((j20 ^ j23) | jLongValue4) ^ j23;
                                            long j25 = jLongValue4 ^ j23;
                                            long j26 = (j25 | j20) ^ j23;
                                            String str18 = str17;
                                            long jNextInt = new Random().nextInt(732759675);
                                            int i279 = length;
                                            int i280 = i247;
                                            long j27 = j21 + ((j24 | j26 | ((j25 | jNextInt) ^ j23)) * j22) + (((long) (-786)) * j26) + (j22 * ((j23 ^ ((jNextInt ^ j23) | j25)) | j24 | j26)) + ((long) (-1817019964));
                                            int i281 = ((int) (j27 >> 32)) & (650847636 + (((~(1606264267 | i6)) | (~(i280 | (-352420163)))) * 497) + (((~(1603896779 | i280)) | 2367488 | (~((-352420163) | i6))) * 497));
                                            int iNextInt = new Random().nextInt();
                                            int i282 = ~(1300233637 | iNextInt);
                                            int i283 = ~iNextInt;
                                            if ((i281 | (((int) j27) & ((-2038855459) + ((i282 | (~((-88375586) | i283))) * 920) + (((~(225368357 | i283)) | (-1300233638)) * 920) + (((~(iNextInt | (-88375586))) | (~(1300233637 | i283)) | (~((-1074865281) | iNextInt))) * 920)))) == 1245577864) {
                                                i13 = (i6 & (-71)) | (i280 & 70);
                                                break loop5;
                                            }
                                            i277 = ((i278 & 1) << 1) + (i278 ^ 1);
                                            objInvoke2 = obj5;
                                            length = i279;
                                            i247 = i280;
                                            str17 = str18;
                                        }
                                    }
                                    it = it2;
                                    objInvoke2 = objInvoke2;
                                    strArr8 = strArr2;
                                    i247 = i247;
                                    i9 = i12;
                                }
                                int i284 = i12;
                                int i285 = ((~i284) & i6) | ((~i6) & i284);
                                int i286 = -i285;
                                int i287 = ((i285 & i286) | (i285 ^ i286)) >> 31;
                                int i288 = i13 & (~i287);
                                int i289 = i284 & i287;
                                i9 = (i288 & i289) | (i288 ^ i289);
                            } catch (Throwable th19) {
                                Throwable cause9 = th19.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th19;
                            }
                        } else {
                            strArr2 = strArr8;
                        }
                        strArr = strArr2;
                    } catch (Throwable th20) {
                        Throwable cause10 = th20.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th20;
                    }
                } else {
                    i9 = i6;
                    strArr = null;
                }
                int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault20 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i290 = ~jumpTapTimeout2;
                int i291 = ~((i290 ^ (-13)) | (i290 & (-13)));
                int i292 = ~((i290 & iTuitionPaymentFragmentspecialinlinedviewModeldefault20) | (i290 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault20));
                int i293 = (((jumpTapTimeout2 * (-751)) - 9012) - (~(((i292 & i291) | (i291 ^ i292)) * 1504))) - 1;
                int i294 = ~jumpTapTimeout2;
                int i295 = i293 + ((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault20 | (i294 ^ 12) | (i294 & 12))) * (-1504));
                int i296 = ~(i294 | 12);
                int i297 = ~((jumpTapTimeout2 & (-13)) | ((-13) ^ jumpTapTimeout2));
                int i298 = -(-(((i297 & i296) | (i296 ^ i297)) * 752));
                int i299 = ((i295 | i298) << 1) - (i298 ^ i295);
                Object[] objArr64 = new Object[1];
                c(new char[]{50019, 37579, 31099, 42783, 52894, 45799, 12855, 65453, 45263, 17420, 48069, 62755, 36258, 27178}, i299, objArr64);
                Object[] objArr65 = {(String) objArr64[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int trimmedLength = 993 - TextUtils.getTrimmedLength("");
                    int i300 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7;
                    byte b27 = (byte) ($$d[3] - 1);
                    byte b28 = b27;
                    Object[] objArr66 = new Object[1];
                    h(b27, b28, (byte) (b28 | 51), objArr66);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumDrawingCacheSize2, trimmedLength, i300, -545305915, false, (String) objArr66[0], new Class[]{String.class});
                }
                long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr65)).longValue();
                long j28 = -616586427;
                long j29 = 522;
                long j30 = -520;
                long j31 = -1042;
                long jNextInt2 = new Random().nextInt(1886582554);
                int i301 = i9;
                long j32 = -1;
                long j33 = jNextInt2 ^ j32;
                long j34 = (j29 * j28) + (j30 * jLongValue5) + ((j28 | ((j33 | jLongValue5) ^ j32)) * j31);
                long j35 = 521;
                long j36 = j28 ^ j32;
                long j37 = j34 + ((jLongValue5 | jNextInt2) * j35) + ((((jLongValue5 | (j33 | j28)) ^ j32) | ((j36 | (jLongValue5 ^ j32)) ^ j32) | ((j36 | jNextInt2) ^ j32)) * j35) + ((long) 1237045711);
                int i302 = ~i6;
                int i303 = ((int) (j37 >> 32)) & ((-1074068614) + (((-139469397) | i302) * 184) + (((~((-944924245) | i302)) | (-1246831189)) * 184));
                int i304 = ((int) j37) & (802172634 + ((1978508861 | i302) * (-369)) + (((~((-879502873) | i302)) | 1978238013) * (-369)) + (((~(879502872 | i6)) | 1099005989 | (~((-270849) | i302))) * 369));
                int i305 = (i303 & i304) | (i303 ^ i304);
                int i306 = -i305;
                int i307 = ((i305 & i306) | (i305 ^ i306)) >> 31;
                int i308 = (~i307) & i6;
                int i309 = i307 & ((i6 & (-51)) | (i302 & 50));
                int i310 = (i309 & i308) | (i308 ^ i309);
                int i311 = ((~i301) & i6) | (i301 & i302);
                int i312 = -i311;
                int i313 = ((i311 & i312) | (i311 ^ i312)) >> 31;
                int i314 = i310 & (~i313);
                int i315 = i301 & i313;
                int i316 = (i314 & i315) | (i314 ^ i315);
                Object[] objArr67 = new Object[1];
                e(new char[]{48025, 12478, 51455, 15995, 53096, 34594, 36129, 3297, 12025, 13174, 25231, 13878, 40949, 19633, 47766, 53552, 52943, 41156, 62860, 9801}, new char[]{0, 0, 0, 0}, (char) TextUtils.getOffsetBefore("", 0), new char[]{59148, 51024, 1754, 50559}, TextUtils.indexOf("", "", 0), objArr67);
                Object[] objArr68 = {(String) objArr67[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char defaultSize = (char) View.getDefaultSize(0, 0);
                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 994;
                    int iLastIndexOf4 = 7 - TextUtils.lastIndexOf("", '0');
                    byte b29 = (byte) ($$d[3] - 1);
                    byte b30 = b29;
                    Object[] objArr69 = new Object[1];
                    h(b29, b30, (byte) (b30 | 51), objArr69);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(defaultSize, iLastIndexOf3, iLastIndexOf4, -545305915, false, (String) objArr69[0], new Class[]{String.class});
                }
                long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr68)).longValue();
                long j38 = -1514212562;
                long j39 = i6;
                long j40 = j39 ^ j32;
                long j41 = j38 ^ j32;
                long j42 = (j29 * j38) + (j30 * jLongValue6) + ((j38 | ((j40 | jLongValue6) ^ j32)) * j31) + ((jLongValue6 | j39) * j35) + (j35 * (((j41 | (jLongValue6 ^ j32)) ^ j32) | ((j41 | j39) ^ j32) | ((jLongValue6 | (j40 | j38)) ^ j32))) + ((long) 2134671846);
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i317 = ~elapsedCpuTime;
                int i318 = (~((-2036705353) | i317)) | 555810824 | (~((-599478942) | i317));
                int i319 = ((int) (j42 >> 32)) & (2007798718 + (((~(elapsedCpuTime | 2080373469)) | i318) * 590) + (i318 * (-1180)) + (((~(599478941 | i317)) | (~(i317 | 2036705352))) * 590));
                int iNextInt2 = new Random().nextInt(1907066180);
                int i320 = (((int) j42) & ((-1685824111) + (((~(1999992813 | iNextInt2)) | 857748072) * (-756)) + (((~iNextInt2) | 1999992813) * 756))) | i319;
                int i321 = (~(i6 & 60)) & (i6 | 60);
                int i322 = -i320;
                int i323 = ((i320 & i322) | (i320 ^ i322)) >> 31;
                int i324 = (~i323) & i6;
                int i325 = i323 & i321;
                int i326 = (i325 & i324) | (i324 ^ i325);
                int i327 = (~(i6 & i316)) & (i6 | i316);
                int i328 = -i327;
                int i329 = ((i327 & i328) | (i327 ^ i328)) >> 31;
                int i330 = (i316 & i329) | (i326 & (~i329));
                int i331 = -Color.red(0);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault21 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i332 = i331 * (-520);
                int i333 = (i332 & 18792) + (i332 | 18792);
                int i334 = ~i331;
                int i335 = i334 | 36;
                int i336 = (~((i335 & iTuitionPaymentFragmentspecialinlinedviewModeldefault21) | (i335 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault21))) * 521;
                int i337 = ((i333 | i336) << 1) - (i333 ^ i336);
                int i338 = ~((i331 & (-37)) | ((-37) ^ i331));
                int i339 = i338 * (-1042);
                int i340 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault21) | i334 | 36);
                int i341 = (((i337 & i339) + (i337 | i339)) - (~(-(-(((i338 & i340) | (i338 ^ i340)) * 521))))) - 1;
                Object[] objArr70 = new Object[1];
                c(new char[]{60249, 9728, 2308, 47169, 2373, 29163, 32754, 12465, 1034, 32368, 1256, 4651, 48901, 36671, 33573, 54486, 38567, 33220, 25937, 25355, 51885, 61007, 59713, 8341, 5900, 59737, 27660, 46501, 17588, 59804, 58015, 32878, 30160, 45708, 41125, 53446, 42810, 58140}, i341, objArr70);
                Object[] objArr71 = {(String) objArr70[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 993;
                    int absoluteGravity = 8 - Gravity.getAbsoluteGravity(0, 0);
                    byte[] bArr20 = $$d;
                    byte b31 = (byte) (-bArr20[41]);
                    byte b32 = (byte) (bArr20[3] - 1);
                    Object[] objArr72 = new Object[1];
                    h(b31, b32, (byte) (b32 | 51), objArr72);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(doubleTapTimeout, scrollDefaultDelay2, absoluteGravity, 349342683, false, (String) objArr72[0], new Class[]{String.class});
                }
                long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr71)).longValue();
                long j43 = -461709993;
                long j44 = -751;
                long j45 = j43 ^ j32;
                long j46 = jLongValue7 ^ j32;
                long j47 = (j44 * j43) + (j44 * jLongValue7) + (((long) 1504) * (((j45 | j46) ^ j32) | ((j45 | j39) ^ j32)));
                long j48 = j45 | jLongValue7;
                long j49 = j47 + (((long) (-1504)) * ((j48 | j39) ^ j32)) + (((long) 752) * ((j48 ^ j32) | ((j46 | j43) ^ j32))) + ((long) (-385368612));
                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                int i342 = ~elapsedCpuTime2;
                int i343 = ((int) (j49 >> 32)) & ((((~(i342 | (-1302371486))) | (~(1555369399 | i342)) | 16814088) * (-397)) + 1696044016 + ((elapsedCpuTime2 | 286626090) * 397));
                int i344 = ~(548826071 | i6);
                int i345 = (((int) j49) & ((((-1456908887) | i344) * (-658)) + 1027475431 + ((i344 | (-1995893720)) * 658))) | i343;
                int i346 = (~(i6 & 80)) & (i6 | 80);
                int i347 = -i345;
                int i348 = ((i345 & i347) | (i345 ^ i347)) >> 31;
                int i349 = (~i348) & i6;
                int i350 = i348 & i346;
                int i351 = (i350 & i349) | (i349 ^ i350);
                int i352 = ((~i330) & i6) | (i330 & i302);
                int i353 = -i352;
                int i354 = ((i352 & i353) | (i352 ^ i353)) >> 31;
                int i355 = i351 & (~i354);
                int i356 = i330 & i354;
                int i357 = (i356 & i355) | (i355 ^ i356);
                int iLastIndexOf5 = TextUtils.lastIndexOf("", '0', 0);
                int i358 = ((iLastIndexOf5 | 1) << 1) - (iLastIndexOf5 ^ 1);
                Object[] objArr73 = new Object[1];
                e(new char[]{62895, 12844, 50660, 4657, 49174, 47609, 3978, 56766, 43060, 12451, 15457, 35684, 22328, 39674, 52716, 47242, 51364, 18812, 18020, 41676, 3664, 11869, 4879, 57312, 43071, 10750, 56934, 1413, 10761, 25346, 38108, 38021, 1443, 35236, 21356, 48082, 6244, 50618, 30526, 15245, 34925, 25395}, new char[]{0, 0, 0, 0}, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 36866), new char[]{56574, 16977, 627, 23440}, i358, objArr73);
                Object[] objArr74 = {(String) objArr73[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int windowTouchSlop = 993 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i359 = 9 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte[] bArr21 = $$d;
                    byte b33 = (byte) (-bArr21[41]);
                    byte b34 = (byte) (bArr21[3] - 1);
                    Object[] objArr75 = new Object[1];
                    h(b33, b34, (byte) (b34 | 51), objArr75);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c2, windowTouchSlop, i359, 349342683, false, (String) objArr75[0], new Class[]{String.class});
                }
                long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr74)).longValue();
                long j50 = -295007961;
                long j51 = (((long) (-523)) * j50) + (((long) 263) * jLongValue8);
                long j52 = 262;
                long j53 = ((j50 ^ j32) | jLongValue8) ^ j32;
                long j54 = jLongValue8 ^ j32;
                long j55 = (j50 | j54) ^ j32;
                long j56 = j51 + ((j53 | j55 | ((j54 | j39) ^ j32)) * j52) + (((long) (-786)) * j55) + (j52 * (((j54 | j40) ^ j32) | j53 | j55)) + ((long) (-552070644));
                int i360 = ((int) (j56 >> 32)) & (1569577550 + (((~((-1123032430) | i6)) | 9441544) * (-140)) + ((~((-1113590886) | i6)) * 70) + (((~((-1734708456) | i6)) | 630559114) * 70));
                int iNextInt3 = new Random().nextInt();
                int i361 = (~(980803363 | iNextInt3)) | (-997588904);
                int i362 = ~iNextInt3;
                int i363 = ((int) j56) & ((-1356627335) + ((i361 | (~((-439637507) | i362))) * 886) + (((~(i362 | (-980803364))) | (-456423047)) * (-1772)) + ((~(i362 | (-456423047))) * 886));
                int i364 = (i360 & i363) | (i360 ^ i363);
                int i365 = (~(i6 & 90)) & (i6 | 90);
                int i366 = -i364;
                int i367 = ((i364 & i366) | (i364 ^ i366)) >> 31;
                int i368 = (~i367) & i6;
                int i369 = i367 & i365;
                int i370 = (i369 & i368) | (i368 ^ i369);
                int i371 = (~(i6 & i357)) & (i6 | i357);
                int i372 = -i371;
                int i373 = ((i371 & i372) | (i371 ^ i372)) >> 31;
                int i374 = i370 & (~i373);
                int i375 = i357 & i373;
                int i376 = (i374 & i375) | (i374 ^ i375);
                int i377 = -(-KeyEvent.keyCodeFromString(""));
                int i378 = (i377 ^ 18) + ((i377 & 18) << 1);
                Object[] objArr76 = new Object[1];
                c(new char[]{2969, 35340, 63133, 63944, 44523, 54871, 42852, 27160, 25204, 24132, 33288, 39771, 30668, 14557, 42686, 52868, 4279, 62547, 64163, 43007}, i378, objArr76);
                Object[] objArr77 = {(String) objArr76[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 993;
                    int i379 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8;
                    byte[] bArr22 = $$d;
                    byte b35 = (byte) (-bArr22[41]);
                    byte b36 = (byte) (bArr22[3] - 1);
                    Object[] objArr78 = new Object[1];
                    h(b35, b36, (byte) (b36 | 51), objArr78);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(windowTouchSlop2, maximumFlingVelocity3, i379, 349342683, false, (String) objArr78[0], new Class[]{String.class});
                }
                long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr77)).longValue();
                long j57 = -311801631;
                long j58 = jLongValue9 ^ j32;
                long j59 = 676;
                long j60 = (((long) 677) * j57) + (((long) (-675)) * jLongValue9) + (((long) (-676)) * (j57 | j39 | j58)) + ((((j58 | j57) ^ j32) | ((j40 | j57) ^ j32)) * j59) + (j59 * ((((j57 ^ j32) | j58) ^ j32) | ((j58 | j40) ^ j32) | (((jLongValue9 | j57) | j39) ^ j32))) + ((long) (-535276974));
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i380 = ((int) (j60 >> 32)) & ((-484646000) + (((~((-409342553) | startUptimeMillis)) | 407110224) * 345) + (((~((-409342553) | (~startUptimeMillis))) | 620773634) * 345) + ((~(startUptimeMillis | (-407110225))) * 345));
                int i381 = ((int) j60) & (1788176917 + ((i302 | 83888128) * (-192)) + (((~(755789492 | i302)) | (-765325046)) * (-384)) + (((~(765325045 | i6)) | (~(i302 | (-9535554))) | (~((-671901365) | i6))) * DerHeader.TAG_CLASS_PRIVATE));
                int i382 = (i380 & i381) | (i380 ^ i381);
                int i383 = (i382 | (-i382)) >> 31;
                int i384 = (i383 & (~(i6 & 100)) & (i6 | 100)) | ((~i383) & i6);
                int i385 = (~(i6 & i376)) & (i6 | i376);
                int i386 = -i385;
                int i387 = ((i385 & i386) | (i385 ^ i386)) >> 31;
                int i388 = i384 & (~i387);
                int i389 = i376 & i387;
                int i390 = (i389 & i388) | (i388 ^ i389);
                int[] iArr = new int[1];
                Object[] objArr79 = {new int[]{i6}, strArr, iArr, new int[]{i390}};
                int i391 = ((~i390) & i6) | (i390 & i302);
                int i392 = -i391;
                int i393 = (((i391 & i392) | (i391 ^ i392)) >> 31) & 16;
                int i394 = 21155039 + (((~((-727152344) | i302)) | 5506180 | (~((-81560973) | i302)) | (~(803207135 | i6))) * (-84));
                int i395 = (~((-81560973) | i6)) | 727152343;
                int i396 = ~(i302 | 81560972);
                int i397 = i394 + ((i395 | i396) * (-84)) + (((-803207136) | i396) * 84);
                int i398 = ((i393 * (-167)) - (~(-(-(i397 * (-167)))))) - 1;
                int i399 = ~i393;
                int i400 = ~i397;
                int i401 = ~((i399 & i400) | (i399 ^ i400));
                int i402 = ~i397;
                int i403 = -(-((i401 | (~((i402 & i6) | (i402 ^ i6)))) * 336));
                int i404 = (i398 & i403) + (i398 | i403);
                int i405 = ~(i393 | i397);
                int i406 = ~((i6 & i393) | (i393 ^ i6));
                int i407 = i404 + (((i406 & i405) | (i405 ^ i406)) * (-168));
                int i408 = ~((i302 ^ i393) | (i302 & i393));
                int i409 = -(-(((i408 & i400) | (i400 ^ i408)) * 168));
                int i410 = (i8 - (~(-(-((i407 ^ i409) + ((i409 & i407) << 1)))))) - 1;
                int i411 = i410 ^ (i410 << 13);
                int i412 = i411 >>> 17;
                int i413 = ((~i411) & i412) | ((~i412) & i411);
                int i414 = i413 << 5;
                iArr[0] = (i413 | i414) & (~(i413 & i414));
                return objArr79;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r6, short r7, byte r8) {
                /*
                    int r7 = r7 * 2
                    int r7 = 3 - r7
                    byte[] r0 = defpackage.WorkerThread.$$c
                    int r8 = 108 - r8
                    int r6 = r6 * 3
                    int r1 = 1 - r6
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r0 != 0) goto L17
                    r3 = r8
                    r4 = r2
                    r8 = r7
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    int r7 = r7 + 1
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L27:
                    r3 = r0[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L2c:
                    int r7 = r7 + r3
                    r3 = r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.WorkerThread.$$g(byte, short, byte):java.lang.String");
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0061 A[PHI: r1 r3
  0x0061: PHI (r1v8 com.bpjstku.presentation.account.setting.EditProfileActivity) = 
  (r1v7 com.bpjstku.presentation.account.setting.EditProfileActivity)
  (r1v13 com.bpjstku.presentation.account.setting.EditProfileActivity)
 binds: [B:15:0x005f, B:12:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x0061: PHI (r3v4 com.bpjstku.domain.user.model.User) = (r3v3 com.bpjstku.domain.user.model.User), (r3v9 com.bpjstku.domain.user.model.User) binds: [B:15:0x005f, B:12:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0066 A[PHI: r1
  0x0066: PHI (r1v10 com.bpjstku.presentation.account.setting.EditProfileActivity) = 
  (r1v7 com.bpjstku.presentation.account.setting.EditProfileActivity)
  (r1v13 com.bpjstku.presentation.account.setting.EditProfileActivity)
 binds: [B:15:0x005f, B:12:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Unit b(EditProfileActivity editProfileActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        EditProfileActivity editProfileActivity2;
        User userAsBinder;
        EditProfileActivity editProfileActivity3;
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 99;
        int i4 = i3 % 128;
        INotificationSideChannel = i4;
        if (i3 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i5 = i2 + 119;
            INotificationSideChannel = i5 % 128;
            int i6 = i5 % 2;
            editProfileActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i7 = i4 + 103;
            onTransact = i7 % 128;
            if (i7 % 2 == 0) {
                editProfileActivity.IconCompatParcelizer();
                AccountVerificationActivity.b bVar = AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                editProfileActivity2 = editProfileActivity;
                userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                int i8 = 98 / 0;
                if (userAsBinder != null) {
                    editProfileActivity3 = editProfileActivity2;
                    str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    editProfileActivity3 = editProfileActivity2;
                    str = null;
                }
            } else {
                editProfileActivity.IconCompatParcelizer();
                AccountVerificationActivity.b bVar2 = AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                editProfileActivity2 = editProfileActivity;
                userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                if (userAsBinder != null) {
                    editProfileActivity3 = editProfileActivity2;
                    str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    editProfileActivity3 = editProfileActivity2;
                    str = null;
                }
            }
            User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String str3 = userAsBinder2 != null ? userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
            if (str3 == null) {
                int i9 = INotificationSideChannel + 71;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                str2 = "";
            } else {
                str2 = str3;
            }
            AccountVerificationActivity.b.b(editProfileActivity3, str, str2, 3, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, 32);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            editProfileActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            int i11 = INotificationSideChannel + 97;
            onTransact = i11 % 128;
            int i12 = i11 % 2;
        } else {
            editProfileActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 83;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(EditProfileActivity editProfileActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        String str2;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            editProfileActivity.MediaBrowserCompat();
            int i2 = INotificationSideChannel + 111;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            str = "loading_request_change_phone_number_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            editProfileActivity.IconCompatParcelizer();
            AccountVerificationActivity.b bVar = AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            EditProfileActivity editProfileActivity2 = editProfileActivity;
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            if (userAsBinder != null) {
                int i4 = INotificationSideChannel + 77;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                str2 = null;
            }
            String str3 = str2 == null ? "" : str2;
            String str4 = editProfileActivity.b;
            Intrinsics.throwUninitializedPropertyAccessException("");
            AccountVerificationActivity.b.b(editProfileActivity2, str3, null, 1, "", null, 32);
            str = "success_request_change_phone_number_result";
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            editProfileActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            str = "failure_request_change_phone_number_result";
        } else {
            editProfileActivity.IconCompatParcelizer();
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_request_change_phone_number_result", str));
        Intrinsics.checkNotNullParameter(editProfileActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        String str;
        EditProfileActivity editProfileActivity = (EditProfileActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 77;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        IntegerRes integerRes = (IntegerRes) editProfileActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            int i4 = onTransact + 9;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 3;
            }
            str = null;
        }
        String strValueOf = String.valueOf(str);
        User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        integerRes.TuitionPaymentFragmentbindingInflater1(new ChangeDataFirstVerificationRequest(strValueOf, String.valueOf(userAsBinder2 != null ? userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null)));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(EditProfileActivity editProfileActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            editProfileActivity.MediaBrowserCompat();
            str = "loading_request_change_email_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = INotificationSideChannel + 69;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            editProfileActivity.IconCompatParcelizer();
            AccountVerificationActivity.b bVar = AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            AccountVerificationActivity.b.b(editProfileActivity, null, null, 2, "", null, 36);
            str = "success_request_change_email_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = INotificationSideChannel + 45;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                editProfileActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            } else {
                editProfileActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            }
            str = "failure_request_change_email_result";
        } else {
            editProfileActivity.IconCompatParcelizer();
            int i5 = onTransact + 11;
            INotificationSideChannel = i5 % 128;
            int i6 = i5 % 2;
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_request_change_email_result", str));
        Intrinsics.checkNotNullParameter(editProfileActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault1(EditProfileActivity editProfileActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 81;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            throw null;
        }
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i3 = INotificationSideChannel + 125;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return userAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(EditProfileActivity editProfileActivity) {
        String str;
        int i = 2 % 2;
        IntegerRes integerRes = (IntegerRes) editProfileActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String str2 = null;
        if (userAsBinder != null) {
            int i2 = onTransact + 13;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 != 0) {
                String str3 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                str2.hashCode();
                throw null;
            }
            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            str = null;
        }
        String strValueOf = String.valueOf(str);
        User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder2 != null) {
            int i3 = onTransact + 41;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
            str2 = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ChangeDataFirstVerificationRequest(strValueOf, String.valueOf(str2)));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        String str;
        final EditProfileActivity editProfileActivity = (EditProfileActivity) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_name", "init_change_phone_number_account"));
        Intrinsics.checkNotNullParameter(editProfileActivity, "");
        Intrinsics.checkNotNullParameter("edit_phone_number_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("edit_phone_number_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("edit_phone_number_account", mapMutableMapOf);
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            int i2 = onTransact + 119;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            str = null;
        }
        StringBuilder sb = new StringBuilder("Sistem akan mengirimkan email kode verifikasi ke alamat email ");
        sb.append(str);
        sb.append(". Apakah Anda yakin akan melanjutkan ke  proses berikutnya?");
        String string = sb.toString();
        String string2 = editProfileActivity.getString(R.string.action_ok_continue);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_email, "Konfirmasi Pengiriman Kode Verifikasi", string, string2, new Function0() { // from class: valueType
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
            }
        }, editProfileActivity.getString(R.string.action_return), new Function0() { // from class: from
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditProfileActivity.d();
            }
        });
        editProfileActivity.a = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        FragmentManager supportFragmentManager = editProfileActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i4 = onTransact + 113;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 != 0) {
                getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                throw null;
            }
            getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 107;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(EditProfileActivity editProfileActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_name", "init_change_profile_photo_account"));
        Intrinsics.checkNotNullParameter(editProfileActivity, "");
        Intrinsics.checkNotNullParameter("change_profile_photo_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("change_profile_photo_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("change_profile_photo_account", mapMutableMapOf);
        ChangeProfilePhotoActivity.Companion companion = ChangeProfilePhotoActivity.INSTANCE;
        ChangeProfilePhotoActivity.Companion.TuitionPaymentFragmentbindingInflater1(editProfileActivity);
        Unit unit = Unit.INSTANCE;
        int i2 = INotificationSideChannel + 41;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit b(final EditProfileActivity editProfileActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_name", "init_change_password_account"));
        Intrinsics.checkNotNullParameter(editProfileActivity, "");
        Intrinsics.checkNotNullParameter("edit_password_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("edit_password_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("edit_password_account", mapMutableMapOf);
        message.Companion companion = message.INSTANCE;
        message messageVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = message.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function3() { // from class: to
            private static final byte[] $$c = {58, -103, 118, 14};
            private static final int $$d = 92;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {56, 94, 119, -19, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 148;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int b = 1;
            private static char[] TuitionPaymentFragmentbindingInflater1 = {45565, 8284, 37540, 1252, 63307, 27027, 56300, 19056, 15503, 44781, 318, 62354, 26065, 54308, 18028, 14464, 43839, 7549, 36814, 32258, 53345, 17058, 13596, 14653, 43153, 6770, 35857, 32658, 57676, 21282, 49905, 46153, 9765, 35298, 31561, 60701, 23778, 52887, 45062, 9180, 38331, 45565, 8284, 37540, 1252, 63307, 27027, 56300, 19056, 15503, 44781, 318, 62354, 26065, 54308, 18028, 14464, 43788, 7551, 36750, 32311, 53364, 17066, 13572, 42839, 6575, 34819, 31300, 60591, 24315, 12612, 41905, 5600, 33850, 30365, 29057, 57381, 21210, 50314, 14124, 45491, 8279, 37556, 1269, 63243, 27027, 56294, 18999, 15512, 44717, 316, 62346, 26079, 54318, 17973, 14538, 43801, 7536, 36821, 32273, 53347, 17083, 13578, 42834, 6569, 34892, 31298, 60581, 63095, 45550, 8285, 37614, 1266, 63297, 27032, 56317, 19001, 15499, 44771, 306, 62346, 26065};
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1512095284565385266L;

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:8:0x0019  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r6, int r7, short r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 + 4
                    int r0 = r8 + 1
                    byte[] r1 = defpackage.to.$$a
                    int r6 = r6 * 14
                    int r6 = 98 - r6
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L13
                    r3 = r7
                    r6 = r8
                    r4 = r2
                    goto L29
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r8) goto L21
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L21:
                    r4 = r1[r7]
                    int r3 = r3 + 1
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L29:
                    int r6 = r6 + r7
                    int r6 = r6 + (-11)
                    int r7 = r3 + 1
                    r3 = r4
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.to.c(short, int, short, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                b = i3 % 128;
                int i4 = i3 % 2;
                EditProfileActivity editProfileActivity2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str = (String) obj;
                if (i4 != 0) {
                    return EditProfileActivity.b(editProfileActivity2, str, (String) obj2, (String) obj3);
                }
                EditProfileActivity.b(editProfileActivity2, str, (String) obj2, (String) obj3);
                throw null;
            }

            private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
                int i4 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i3];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i3) {
                    int i5 = $10 + 19;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i2 + i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 2;
                            byte b3 = (byte) (b2 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), ExpandableListView.getPackedPositionChild(0L) + 2188, Color.argb(0, 0, 0, 0) + 40, 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33018 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 3011 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26, 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 1;
                            byte b7 = (byte) (b6 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - Color.red(0)), View.MeasureSpec.getMode(0) + 3376, 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -968507904, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr = new char[i3];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i3) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 1;
                        byte b9 = (byte) (b8 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36506 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 3375 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17, -968507904, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    int i8 = $10 + 117;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                }
                objArr[0] = new String(cArr);
            }

            /* JADX WARN: Code duplicated, block: B:105:0x076b A[PHI: r25
  0x076b: PHI (r25v1 int) = (r25v0 int), (r25v4 int), (r25v4 int) binds: [B:104:0x0769, B:122:0x076b, B:97:0x075c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:45:0x0368  */
            /* JADX WARN: Code duplicated, block: B:47:0x036e  */
            /* JADX WARN: Code duplicated, block: B:49:0x037a  */
            /* JADX WARN: Code duplicated, block: B:50:0x037e  */
            /* JADX WARN: Code duplicated, block: B:55:0x0386  */
            /* JADX WARN: Code duplicated, block: B:59:0x0403  */
            /* JADX WARN: Code duplicated, block: B:61:0x0422 A[Catch: Exception -> 0x0769, TryCatch #2 {Exception -> 0x0769, blocks: (B:52:0x0380, B:56:0x0393, B:60:0x0415, B:62:0x0434, B:61:0x0422), top: B:126:0x0380 }] */
            /* JADX WARN: Code duplicated, block: B:65:0x044f A[Catch: all -> 0x055a, TryCatch #5 {all -> 0x055a, blocks: (B:63:0x0442, B:65:0x044f, B:66:0x0486), top: B:132:0x0442, outer: #1 }] */
            /* JADX WARN: Code duplicated, block: B:69:0x04f4  */
            /* JADX WARN: Code duplicated, block: B:71:0x0545 A[Catch: Exception -> 0x076b, TRY_LEAVE, TryCatch #1 {Exception -> 0x076b, blocks: (B:70:0x04f5, B:71:0x0545, B:73:0x0554, B:74:0x0557, B:79:0x055d, B:81:0x0563, B:82:0x0564, B:83:0x0565, B:85:0x05b3, B:87:0x062a, B:89:0x0681, B:91:0x06f4, B:96:0x0758, B:100:0x0761, B:102:0x0767, B:103:0x0768, B:92:0x0703, B:94:0x0710, B:95:0x0751, B:63:0x0442, B:65:0x044f, B:66:0x0486), top: B:125:0x0384, inners: #0, #5 }] */
            /* JADX WARN: Code duplicated, block: B:83:0x0565 A[Catch: Exception -> 0x076b, TRY_LEAVE, TryCatch #1 {Exception -> 0x076b, blocks: (B:70:0x04f5, B:71:0x0545, B:73:0x0554, B:74:0x0557, B:79:0x055d, B:81:0x0563, B:82:0x0564, B:83:0x0565, B:85:0x05b3, B:87:0x062a, B:89:0x0681, B:91:0x06f4, B:96:0x0758, B:100:0x0761, B:102:0x0767, B:103:0x0768, B:92:0x0703, B:94:0x0710, B:95:0x0751, B:63:0x0442, B:65:0x044f, B:66:0x0486), top: B:125:0x0384, inners: #0, #5 }] */
            /* JADX WARN: Code duplicated, block: B:94:0x0710 A[Catch: all -> 0x0760, TryCatch #0 {all -> 0x0760, blocks: (B:92:0x0703, B:94:0x0710, B:95:0x0751), top: B:123:0x0703, outer: #1 }] */
            /* JADX WARN: Code duplicated, block: B:98:0x075e  */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i2, int i3, int i4) throws Throwable {
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                Object[] objArr;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                String str;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i16;
                int i17;
                int i18;
                int i19;
                int i20;
                int i21;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                long j;
                long j2;
                int i22;
                int i23 = 2 % 2;
                if (context != null) {
                    int i24 = b;
                    int i25 = (i24 ^ 99) + ((i24 & 99) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
                    if (i25 % 2 != 0) {
                        throw null;
                    }
                    int i26 = (i24 & 111) + (i24 | 111);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
                    int i27 = i26 % 2;
                    try {
                        Object[] objArr3 = new Object[1];
                        a(Color.argb(0, 0, 0, 0), 23 - (~(-(-TextUtils.indexOf((CharSequence) "", '0')))), (char) (ViewConfiguration.getTouchSlop() >> 8), objArr3);
                        Class<?> cls = Class.forName((String) objArr3[0]);
                        int iResolveSize = View.resolveSize(0, 0);
                        int iB = zzrf.b();
                        int i28 = iResolveSize * 471;
                        int i29 = (i28 ^ 10833) + ((i28 & 10833) << 1);
                        int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
                        b = i30 % 128;
                        int i31 = i30 % 2;
                        int i32 = ~iResolveSize;
                        int i33 = ~((i32 & (-24)) | (i32 ^ (-24)));
                        int i34 = ~((-24) | iB);
                        int i35 = (i33 ^ i34) | (i33 & i34);
                        int i36 = ~iB;
                        int i37 = (i36 ^ iResolveSize) | (i36 & iResolveSize);
                        int i38 = ~((i37 ^ 23) | (i37 & 23));
                        int i39 = ((i29 + (((iResolveSize ^ 23) | (iResolveSize & 23)) * (-470))) - (~(-(-(((i35 ^ i38) | (i35 & i38)) * (-470)))))) - 1;
                        int i40 = ((-24) ^ iResolveSize) | ((-24) & iResolveSize);
                        int i41 = ~((i40 & iB) | (i40 ^ iB));
                        int i42 = iResolveSize | (~iB);
                        int i43 = ~((i42 & 23) | (i42 ^ 23));
                        int i44 = (i39 - (~(-(-(((i43 & i41) | (i41 ^ i43)) * 470))))) - 1;
                        int i45 = -(KeyEvent.getMaxKeyCode() >> 16);
                        int iB2 = zzrf.b();
                        int i46 = i45 * 592;
                        int i47 = (i46 & (-10620)) + (i46 | (-10620));
                        int i48 = ~i45;
                        int i49 = i47 + ((~((i48 ^ 18) | (i48 & 18))) * (-1182));
                        int i50 = (i48 & (-19)) | (i48 ^ (-19));
                        int i51 = ~iB2;
                        int i52 = ~((i50 ^ i51) | (i50 & i51));
                        int i53 = ~((i45 ^ 18) | (i45 & 18));
                        int i54 = (i49 - (~(-(-(((i52 ^ i53) | (i52 & i53)) * (-591)))))) - 1;
                        int i55 = ~i45;
                        int i56 = (i55 & iB2) | (iB2 ^ i55);
                        int i57 = -(-(((i56 & (-19)) | (i56 ^ (-19))) * 591));
                        int i58 = (i54 ^ i57) + ((i57 & i54) << 1);
                        int i59 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int i60 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i61 = (i60 & 35) + (i60 | 35);
                        b = i61 % 128;
                        int i62 = i61 % 2;
                        Object[] objArr4 = new Object[1];
                        a(i44, i58, (char) ((35014 ^ i59) + ((i59 & 35014) << 1)), objArr4);
                        Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                        int i63 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int i64 = (i63 ^ 42) + ((i63 & 42) << 1);
                        int offsetBefore = TextUtils.getOffsetBefore("", 0);
                        int iB3 = zzrf.b();
                        int i65 = (offsetBefore * (-500)) - 17000;
                        int i66 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i67 = i66 + 29;
                        b = i67 % 128;
                        int i68 = i67 % 2;
                        int i69 = ~(((-35) & offsetBefore) | ((-35) ^ offsetBefore));
                        int i70 = ~offsetBefore;
                        int i71 = -(-(TypedValues.PositionType.TYPE_TRANSITION_EASING * ((~((i70 ^ 34) | (i70 & 34) | iB3)) | i69)));
                        int i72 = ((((i65 | i71) << 1) - (i71 ^ i65)) - (~((~((i70 ^ (-35)) | (i70 & (-35)))) * 1002))) - 1;
                        int i73 = (~offsetBefore) | (~iB3);
                        int i74 = (~((i73 & 34) | (i73 ^ 34))) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                        int i75 = (i72 ^ i74) + ((i74 & i72) << 1);
                        int i76 = (i66 ^ 55) + ((i66 & 55) << 1);
                        b = i76 % 128;
                        int i77 = i76 % 2;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                        Object[] objArr5 = new Object[1];
                        a(i64, i75, (char) ((1 ^ iLastIndexOf) + ((iLastIndexOf & 1) << 1)), objArr5);
                        Class<?> cls2 = Class.forName((String) objArr5[0]);
                        int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                        int i78 = ((windowTouchSlop | 75) << 1) - (windowTouchSlop ^ 75);
                        int threadPriority = Process.getThreadPriority(0);
                        int i79 = -(((threadPriority & 20) + (threadPriority | 20)) >> 6);
                        Object[] objArr6 = new Object[1];
                        a(i78, (i79 & 5) + (i79 | 5), (char) (49275 - (~TextUtils.indexOf((CharSequence) "", '0', 0))), objArr6);
                        int i80 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                        int i81 = (i2 & (-2)) | ((~i2) & 1);
                        int i82 = -i80;
                        int i83 = ((i80 & i82) | (i80 ^ i82)) >> 31;
                        int i84 = (~i83) & i2;
                        int i85 = i83 & i81;
                        i5 = (i85 & i84) | (i84 ^ i85);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    i5 = i2;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 16949);
                        int gidForName = 2738 - Process.getGidForName("");
                        int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 13;
                        byte[] bArr = $$a;
                        byte b2 = bArr[132];
                        short s = bArr[7];
                        Object[] objArr7 = new Object[1];
                        c(b2, s, (byte) (s | 52), objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(jumpTapTimeout, gidForName, iIndexOf, 1501733736, false, (String) objArr7[0], new Class[0]);
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char pressedStateDuration = (char) (16949 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int mirror = AndroidCharacter.getMirror('0') + 2691;
                        int modifierMetaStateMask = 12 - ((byte) KeyEvent.getModifierMetaStateMask());
                        short s2 = (short) 52;
                        Object[] objArr8 = new Object[1];
                        c($$a[132], s2, (byte) s2, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration, mirror, modifierMetaStateMask, 47863026, false, (String) objArr8[0], null);
                    }
                    boolean z = !set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null));
                    long j3 = 0;
                    if (z) {
                        int i86 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i87 = ((i86 | 29) << 1) - (i86 ^ 29);
                        b = i87 % 128;
                        if (i87 % 2 == 0) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c = (char) (16950 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                int i88 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2738;
                                int doubleTapTimeout = 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                Object[] objArr9 = new Object[1];
                                c($$a[132], (short) 104, (byte) ($$b >>> 2), objArr9);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i88, doubleTapTimeout, 631063962, false, (String) objArr9[0], null);
                            }
                            int i89 = 65 / 0;
                            if (set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                                if (Build.VERSION.SDK_INT == 30) {
                                    i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                                    b = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        throw null;
                                    }
                                    i7 = i2;
                                    i8 = i5;
                                }
                            }
                        } else {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cMyTid = (char) ((Process.myTid() >> 22) + 16949);
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 2740;
                                int i90 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12;
                                Object[] objArr10 = new Object[1];
                                c($$a[132], (short) 104, (byte) ($$b >>> 2), objArr10);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyTid, iIndexOf2, i90, 631063962, false, (String) objArr10[0], null);
                            }
                            if (set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                                if (Build.VERSION.SDK_INT == 30) {
                                    i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                                    b = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        throw null;
                                    }
                                    i7 = i2;
                                    i8 = i5;
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT > 33) {
                            int i91 = b;
                            int i92 = (i91 & 57) + (i91 | 57);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i92 % 128;
                            int i93 = i92 % 2;
                            int iIndexOf3 = TextUtils.indexOf("", "");
                            int iB4 = zzrf.b();
                            int i94 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                            int i95 = i94 % 128;
                            b = i95;
                            int i96 = i94 % 2;
                            int i97 = 69 * iIndexOf3;
                            int i98 = (i97 ^ (-5360)) + ((i97 & (-5360)) << 1);
                            i16 = ~iIndexOf3;
                            int i99 = (i16 ^ (-81)) | (i16 & (-81));
                            i17 = ~iB4;
                            int i100 = ~((i99 & i17) | (i99 ^ i17));
                            int i101 = ~((iIndexOf3 & 80) | (iIndexOf3 ^ 80));
                            int i102 = (i101 & i100) | (i100 ^ i101);
                            int i103 = ~((iB4 & 80) | (iB4 ^ 80));
                            int i104 = (i98 - (~(-(-(((i102 & i103) | (i102 ^ i103)) * (-68)))))) - 1;
                            int i105 = ((i95 | 43) << 1) - (i95 ^ 43);
                            int i106 = i105 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i106;
                            int i107 = i105 % 2;
                            int i108 = (i16 ^ i17) | (i16 & i17);
                            int i109 = (-68) * (~((i108 & 80) | (i108 ^ 80)));
                            i18 = (i104 & i109) + (i109 | i104);
                            i19 = ((i106 | 49) << 1) - (i106 ^ 49);
                            b = i19 % 128;
                            if (i19 % 2 == 0) {
                                int i110 = ~(((-81) & i17) | ((-81) ^ i17));
                                int i111 = (i110 & i16) | (i16 ^ i110);
                                i20 = i18 >>> (((i111 | 68) << 1) - (i111 ^ 68));
                                int i112 = -AndroidCharacter.getMirror('e');
                                i21 = (i112 & 97) + (i112 | 97);
                                j3 = 1;
                            } else {
                                int i113 = ((~((-81) | i17)) | i16) * 68;
                                i20 = ((i18 & i113) << 1) + (i18 ^ i113);
                                i21 = 75 - (~(-AndroidCharacter.getMirror('0')));
                            }
                            Object[] objArr11 = new Object[1];
                            a(i20, i21, (char) ExpandableListView.getPackedPositionGroup(j3), objArr11);
                            Object[] objArr12 = {(String) objArr11[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int fadingEdgeLength = 993 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                int mode = 8 - View.MeasureSpec.getMode(0);
                                byte b3 = $$a[7];
                                byte b4 = b3;
                                Object[] objArr13 = new Object[1];
                                c(b4, (short) (b4 | 141), b3, objArr13);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout2, fadingEdgeLength, mode, 410748506, false, (String) objArr13[0], new Class[]{String.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr12)).longValue();
                            long j4 = 1517344060;
                            long j5 = 85;
                            long j6 = (j5 * j4) + (j5 * jLongValue);
                            long j7 = -84;
                            long j8 = -1;
                            long j9 = j4 ^ j8;
                            long j10 = jLongValue ^ j8;
                            i14 = i5;
                            long j11 = i2;
                            long j12 = j11 ^ j8;
                            long j13 = j4 | jLongValue;
                            long j14 = (j12 | jLongValue) ^ j8;
                            j = j6 + ((((j9 | j10) ^ j8) | ((j9 | j12) ^ j8) | ((j10 | j12) ^ j8) | ((j13 | j11) ^ j8)) * j7) + (j7 * (((j10 | j11) ^ j8) | j4 | j14)) + (((long) 84) * (j14 | (j13 ^ j8))) + ((long) (-1718262297));
                            j2 = j >> 32;
                            int i114 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i22 = (i114 ^ 15) + ((i114 & 15) << 1);
                            b = i22 % 128;
                            if (i22 % 2 != 0) {
                                Process.getElapsedCpuTime();
                                new Random().nextInt(1113205578);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            int i115 = (int) j2;
                            int iUptimeMillis = (int) SystemClock.uptimeMillis();
                            int i116 = ~iUptimeMillis;
                            int i117 = (~(1991108514 | i116)) | (-2008016819);
                            int i118 = ~(iUptimeMillis | (-849724067));
                            int i119 = i115 & ((((i117 | i118) * (-252)) - 2071838346) + ((i118 | (~(i116 | (-16908305)))) * 252));
                            int iMyTid = Process.myTid();
                            int i120 = ((int) j) & (2072280017 + ((~((~iMyTid) | (-1714574849))) * (-116)) + ((281551062 | iMyTid) * 116) + (((~(iMyTid | 1718777472)) | 277348438) * 116));
                            i15 = (i119 & i120) | (i119 ^ i120);
                        } else {
                            i14 = i5;
                            int i121 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                            int i122 = i121 * 217;
                            int i123 = (i122 ^ (-23220)) + ((i122 & (-23220)) << 1);
                            int i124 = (~(i121 | i2)) * 216;
                            int i125 = (i123 & i124) + (i124 | i123);
                            int i126 = b + 79;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i126 % 128;
                            int i127 = i126 % 2;
                            int i128 = (i121 ^ (-109)) | (i121 & (-109));
                            int i129 = ~i2;
                            int i130 = (-216) * ((i128 & i129) | (i128 ^ i129));
                            int i131 = ((i125 | i130) << 1) - (i125 ^ i130);
                            int i132 = ~i2;
                            int i133 = ~((i121 & i132) | (i132 ^ i121));
                            int i134 = -(-(((i133 & 108) | (108 ^ i133)) * 216));
                            int i135 = (i131 ^ i134) + ((i134 & i131) << 1);
                            int i136 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int i137 = i136 * 193;
                            int i138 = b;
                            int i139 = (i138 & 9) + (i138 | 9);
                            int i140 = i139 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i140;
                            int i141 = i139 % 2;
                            int i142 = ((i137 | 193) << 1) - (i137 ^ 193);
                            int i143 = ~i136;
                            int i144 = ~((i143 & 1) | (i143 ^ 1));
                            int i145 = -(-(((i144 & i129) | (i129 ^ i144)) * (-192)));
                            int i146 = ((i142 | i145) << 1) - (i145 ^ i142);
                            int i147 = ~i136;
                            int i148 = (i147 & (-2)) | (i147 ^ (-2));
                            int i149 = ((~(((-2) ^ i132) | (i132 & (-2)))) | (~i148)) * (-384);
                            int i150 = (i146 & i149) + (i149 | i146);
                            int i151 = (i140 & 19) + (i140 | 19);
                            b = i151 % 128;
                            int i152 = i151 % 2;
                            int i153 = ~((i148 & i2) | (i148 ^ i2));
                            int i154 = (-2) | i129;
                            int i155 = ~((i154 & i136) | (i154 ^ i136));
                            int i156 = (i153 & i155) | (i153 ^ i155);
                            int i157 = (i136 & 1) | (i136 ^ 1);
                            int i158 = ~((i157 & i2) | (i157 ^ i2));
                            int i159 = DerHeader.TAG_CLASS_PRIVATE * ((i158 & i156) | (i156 ^ i158));
                            int i160 = (i150 ^ i159) + ((i159 & i150) << 1);
                            int i161 = -TextUtils.getOffsetAfter("", 0);
                            int iB5 = zzrf.b();
                            int i162 = i161 * 221;
                            int i163 = ((i162 | (-4028286)) << 1) - (i162 ^ (-4028286));
                            int i164 = ~i161;
                            int i165 = ~((i164 & (-18395)) | (i164 ^ (-18395)));
                            int i166 = ~iB5;
                            int i167 = (i166 ^ i161) | (i166 & i161);
                            int i168 = i163 + ((i165 | (~((i167 & 18394) | (i167 ^ 18394)))) * 220);
                            int i169 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i170 = ((i169 | 63) << 1) - (i169 ^ 63);
                            b = i170 % 128;
                            int i171 = i170 % 2;
                            int i172 = (i168 - (~((-440) * ((~((i166 ^ 18394) | (i166 & 18394))) | i161)))) - 1;
                            int i173 = (i161 & 18394) | (i161 ^ 18394);
                            Object[] objArr14 = new Object[1];
                            a(i135, i160, (char) (i172 + (((i173 & iB5) | (i173 ^ iB5)) * 220)), objArr14);
                            str = (String) objArr14[0];
                            int i174 = 110 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int i175 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                            int i176 = i175 * (-317);
                            int i177 = (i176 ^ 4147) + ((i176 & 4147) << 1);
                            int i178 = ~i175;
                            int i179 = (i178 & (-14)) | (i178 ^ (-14));
                            int i180 = ~((i179 & i2) | (i179 ^ i2));
                            int i181 = (i129 & i175) | (i129 ^ i175);
                            int i182 = ~((i181 & 13) | (i181 ^ 13));
                            int i183 = -(-(((i182 & i180) | (i180 ^ i182)) * (-318)));
                            int i184 = (i177 & i183) + (i183 | i177);
                            int i185 = b + 15;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i185 % 128;
                            int i186 = i185 % 2;
                            int i187 = ~(((-14) ^ i175) | ((-14) & i175));
                            int i188 = ~((i175 ^ i2) | (i175 & i2));
                            int i189 = (i184 - (~(-(-((-318) * ((i187 & i188) | (i187 ^ i188))))))) - 1;
                            int i190 = ~((~i175) | i2);
                            Object[] objArr15 = new Object[1];
                            a(i174, i189 + (((i190 & (-14)) | ((-14) ^ i190)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET), (char) View.combineMeasuredStates(0, 0), objArr15);
                            objArr2 = new Object[]{(String) objArr15[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cIndexOf = (char) (33601 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 3086;
                                int iResolveSize2 = View.resolveSize(0, 0) + 26;
                                byte b5 = $$a[7];
                                byte b6 = b5;
                                Object[] objArr16 = new Object[1];
                                c(b6, (short) (b6 | 141), b5, objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, packedPositionChild, iResolveSize2, 1411172903, false, (String) objArr16[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                i15 = 1;
                            } else {
                                i15 = 0;
                            }
                        }
                        int i191 = -i15;
                        int i192 = ((i15 & i191) | (i15 ^ i191)) >> 31;
                        int i193 = i3 & 32;
                        int i194 = -i193;
                        int i195 = ((i193 & i194) | (i193 ^ i194)) >> 31;
                        int i196 = ((i192 & ((i2 & (-11)) | ((~i2) & 10))) | ((~i192) & i2)) & (~i195);
                        int i197 = i195 & i2;
                        i7 = (i196 & i197) | (i196 ^ i197);
                        int i198 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                        b = i198 % 128;
                        int i199 = i198 % 2;
                        i8 = i14;
                    } else if (Build.VERSION.SDK_INT == 30) {
                        i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                        b = i6 % 128;
                        if (i6 % 2 == 0) {
                            throw null;
                        }
                        i7 = i2;
                        i8 = i5;
                    } else {
                        try {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i910 = b;
                                    int i911 = (i910 & 57) + (i910 | 57);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i911 % 128;
                                    int i912 = i911 % 2;
                                    int iIndexOf4 = TextUtils.indexOf("", "");
                                    int iB6 = zzrf.b();
                                    int i913 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                                    int i914 = i913 % 128;
                                    b = i914;
                                    int i915 = i913 % 2;
                                    int i916 = 69 * iIndexOf4;
                                    int i917 = (i916 ^ (-5360)) + ((i916 & (-5360)) << 1);
                                    i16 = ~iIndexOf4;
                                    int i918 = (i16 ^ (-81)) | (i16 & (-81));
                                    i17 = ~iB6;
                                    int i1010 = ~((i918 & i17) | (i918 ^ i17));
                                    int i1011 = ~((iIndexOf4 & 80) | (iIndexOf4 ^ 80));
                                    int i1012 = (i1011 & i1010) | (i1010 ^ i1011);
                                    int i1013 = ~((iB6 & 80) | (iB6 ^ 80));
                                    int i1014 = (i917 - (~(-(-(((i1012 & i1013) | (i1012 ^ i1013)) * (-68)))))) - 1;
                                    int i1015 = ((i914 | 43) << 1) - (i914 ^ 43);
                                    int i1016 = i1015 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1016;
                                    int i1017 = i1015 % 2;
                                    int i1018 = (i16 ^ i17) | (i16 & i17);
                                    int i1019 = (-68) * (~((i1018 & 80) | (i1018 ^ 80)));
                                    i18 = (i1014 & i1019) + (i1019 | i1014);
                                    i19 = ((i1016 | 49) << 1) - (i1016 ^ 49);
                                    b = i19 % 128;
                                    if (i19 % 2 == 0) {
                                        int i1110 = ~(((-81) & i17) | ((-81) ^ i17));
                                        int i1111 = (i1110 & i16) | (i16 ^ i1110);
                                        i20 = i18 >>> (((i1111 | 68) << 1) - (i1111 ^ 68));
                                        int i1112 = -AndroidCharacter.getMirror('e');
                                        i21 = (i1112 & 97) + (i1112 | 97);
                                        j3 = 1;
                                    } else {
                                        int i1113 = ((~((-81) | i17)) | i16) * 68;
                                        i20 = ((i18 & i1113) << 1) + (i18 ^ i1113);
                                        i21 = 75 - (~(-AndroidCharacter.getMirror('0')));
                                    }
                                    Object[] objArr17 = new Object[1];
                                    a(i20, i21, (char) ExpandableListView.getPackedPositionGroup(j3), objArr17);
                                    try {
                                        Object[] objArr18 = {(String) objArr17[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char doubleTapTimeout3 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                            int fadingEdgeLength2 = 993 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                            int mode2 = 8 - View.MeasureSpec.getMode(0);
                                            byte b7 = $$a[7];
                                            byte b8 = b7;
                                            Object[] objArr19 = new Object[1];
                                            c(b8, (short) (b8 | 141), b7, objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout3, fadingEdgeLength2, mode2, 410748506, false, (String) objArr19[0], new Class[]{String.class});
                                        }
                                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr18)).longValue();
                                        long j15 = 1517344060;
                                        long j16 = 85;
                                        long j17 = (j16 * j15) + (j16 * jLongValue2);
                                        long j18 = -84;
                                        long j19 = -1;
                                        long j20 = j15 ^ j19;
                                        long j110 = jLongValue2 ^ j19;
                                        i14 = i5;
                                        long j111 = i2;
                                        long j112 = j111 ^ j19;
                                        long j113 = j15 | jLongValue2;
                                        long j114 = (j112 | jLongValue2) ^ j19;
                                        j = j17 + ((((j20 | j110) ^ j19) | ((j20 | j112) ^ j19) | ((j110 | j112) ^ j19) | ((j113 | j111) ^ j19)) * j18) + (j18 * (((j110 | j111) ^ j19) | j15 | j114)) + (((long) 84) * (j114 | (j113 ^ j19))) + ((long) (-1718262297));
                                        j2 = j >> 32;
                                        int i1114 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        i22 = (i1114 ^ 15) + ((i1114 & 15) << 1);
                                        b = i22 % 128;
                                        if (i22 % 2 != 0) {
                                            Process.getElapsedCpuTime();
                                            new Random().nextInt(1113205578);
                                            Object obj2 = null;
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        int i1115 = (int) j2;
                                        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                                        int i1116 = ~iUptimeMillis2;
                                        int i1117 = (~(1991108514 | i1116)) | (-2008016819);
                                        int i1118 = ~(iUptimeMillis2 | (-849724067));
                                        int i1119 = i1115 & ((((i1117 | i1118) * (-252)) - 2071838346) + ((i1118 | (~(i1116 | (-16908305)))) * 252));
                                        int iMyTid2 = Process.myTid();
                                        int i1210 = ((int) j) & (2072280017 + ((~((~iMyTid2) | (-1714574849))) * (-116)) + ((281551062 | iMyTid2) * 116) + (((~(iMyTid2 | 1718777472)) | 277348438) * 116));
                                        i15 = (i1119 & i1210) | (i1119 ^ i1210);
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    i14 = i5;
                                    int i1211 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                    int i1212 = i1211 * 217;
                                    int i1213 = (i1212 ^ (-23220)) + ((i1212 & (-23220)) << 1);
                                    int i1214 = (~(i1211 | i2)) * 216;
                                    int i1215 = (i1213 & i1214) + (i1214 | i1213);
                                    int i1216 = b + 79;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1216 % 128;
                                    int i1217 = i1216 % 2;
                                    int i1218 = (i1211 ^ (-109)) | (i1211 & (-109));
                                    int i1219 = ~i2;
                                    int i1310 = (-216) * ((i1218 & i1219) | (i1218 ^ i1219));
                                    int i1311 = ((i1215 | i1310) << 1) - (i1215 ^ i1310);
                                    int i1312 = ~i2;
                                    int i1313 = ~((i1211 & i1312) | (i1312 ^ i1211));
                                    int i1314 = -(-(((i1313 & 108) | (108 ^ i1313)) * 216));
                                    int i1315 = (i1311 ^ i1314) + ((i1314 & i1311) << 1);
                                    int i1316 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    int i1317 = i1316 * 193;
                                    int i1318 = b;
                                    int i1319 = (i1318 & 9) + (i1318 | 9);
                                    int i1410 = i1319 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1410;
                                    int i1411 = i1319 % 2;
                                    int i1412 = ((i1317 | 193) << 1) - (i1317 ^ 193);
                                    int i1413 = ~i1316;
                                    int i1414 = ~((i1413 & 1) | (i1413 ^ 1));
                                    int i1415 = -(-(((i1414 & i1219) | (i1219 ^ i1414)) * (-192)));
                                    int i1416 = ((i1412 | i1415) << 1) - (i1415 ^ i1412);
                                    int i1417 = ~i1316;
                                    int i1418 = (i1417 & (-2)) | (i1417 ^ (-2));
                                    int i1419 = ((~(((-2) ^ i1312) | (i1312 & (-2)))) | (~i1418)) * (-384);
                                    int i1510 = (i1416 & i1419) + (i1419 | i1416);
                                    int i1511 = (i1410 & 19) + (i1410 | 19);
                                    b = i1511 % 128;
                                    int i1512 = i1511 % 2;
                                    int i1513 = ~((i1418 & i2) | (i1418 ^ i2));
                                    int i1514 = (-2) | i1219;
                                    int i1515 = ~((i1514 & i1316) | (i1514 ^ i1316));
                                    int i1516 = (i1513 & i1515) | (i1513 ^ i1515);
                                    int i1517 = (i1316 & 1) | (i1316 ^ 1);
                                    int i1518 = ~((i1517 & i2) | (i1517 ^ i2));
                                    int i1519 = DerHeader.TAG_CLASS_PRIVATE * ((i1518 & i1516) | (i1516 ^ i1518));
                                    int i1610 = (i1510 ^ i1519) + ((i1519 & i1510) << 1);
                                    int i1611 = -TextUtils.getOffsetAfter("", 0);
                                    int iB7 = zzrf.b();
                                    int i1612 = i1611 * 221;
                                    int i1613 = ((i1612 | (-4028286)) << 1) - (i1612 ^ (-4028286));
                                    int i1614 = ~i1611;
                                    int i1615 = ~((i1614 & (-18395)) | (i1614 ^ (-18395)));
                                    int i1616 = ~iB7;
                                    int i1617 = (i1616 ^ i1611) | (i1616 & i1611);
                                    int i1618 = i1613 + ((i1615 | (~((i1617 & 18394) | (i1617 ^ 18394)))) * 220);
                                    int i1619 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i1710 = ((i1619 | 63) << 1) - (i1619 ^ 63);
                                    b = i1710 % 128;
                                    int i1711 = i1710 % 2;
                                    int i1712 = (i1618 - (~((-440) * ((~((i1616 ^ 18394) | (i1616 & 18394))) | i1611)))) - 1;
                                    int i1713 = (i1611 & 18394) | (i1611 ^ 18394);
                                    Object[] objArr110 = new Object[1];
                                    a(i1315, i1610, (char) (i1712 + (((i1713 & iB7) | (i1713 ^ iB7)) * 220)), objArr110);
                                    str = (String) objArr110[0];
                                    int i1714 = 110 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                    int i1715 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                    int i1716 = i1715 * (-317);
                                    int i1717 = (i1716 ^ 4147) + ((i1716 & 4147) << 1);
                                    int i1718 = ~i1715;
                                    int i1719 = (i1718 & (-14)) | (i1718 ^ (-14));
                                    int i1810 = ~((i1719 & i2) | (i1719 ^ i2));
                                    int i1811 = (i1219 & i1715) | (i1219 ^ i1715);
                                    int i1812 = ~((i1811 & 13) | (i1811 ^ 13));
                                    int i1813 = -(-(((i1812 & i1810) | (i1810 ^ i1812)) * (-318)));
                                    int i1814 = (i1717 & i1813) + (i1813 | i1717);
                                    int i1815 = b + 15;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1815 % 128;
                                    int i1816 = i1815 % 2;
                                    int i1817 = ~(((-14) ^ i1715) | ((-14) & i1715));
                                    int i1818 = ~((i1715 ^ i2) | (i1715 & i2));
                                    int i1819 = (i1814 - (~(-(-((-318) * ((i1817 & i1818) | (i1817 ^ i1818))))))) - 1;
                                    int i1910 = ~((~i1715) | i2);
                                    Object[] objArr111 = new Object[1];
                                    a(i1714, i1819 + (((i1910 & (-14)) | ((-14) ^ i1910)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET), (char) View.combineMeasuredStates(0, 0), objArr111);
                                    try {
                                        objArr2 = new Object[]{(String) objArr111[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char cIndexOf2 = (char) (33601 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 3086;
                                            int iResolveSize3 = View.resolveSize(0, 0) + 26;
                                            byte b9 = $$a[7];
                                            byte b10 = b9;
                                            Object[] objArr112 = new Object[1];
                                            c(b10, (short) (b10 | 141), b9, objArr112);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf2, packedPositionChild2, iResolveSize3, 1411172903, false, (String) objArr112[0], new Class[]{String.class});
                                        }
                                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                            i15 = 1;
                                        } else {
                                            i15 = 0;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            i14 = i5;
                        }
                        int i1911 = -i15;
                        int i1912 = ((i15 & i1911) | (i15 ^ i1911)) >> 31;
                        int i1913 = i3 & 32;
                        int i1914 = -i1913;
                        int i1915 = ((i1913 & i1914) | (i1913 ^ i1914)) >> 31;
                        int i1916 = ((i1912 & ((i2 & (-11)) | ((~i2) & 10))) | ((~i1912) & i2)) & (~i1915);
                        int i1917 = i1915 & i2;
                        i7 = (i1916 & i1917) | (i1916 ^ i1917);
                        int i1918 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                        b = i1918 % 128;
                        int i1919 = i1918 % 2;
                        i8 = i14;
                    }
                    int i200 = (~i8) & i2;
                    int i201 = ~i2;
                    int i202 = i200 | (i8 & i201);
                    int i203 = -i202;
                    int i204 = ((i202 & i203) | (i202 ^ i203)) >> 31;
                    int i205 = i7 & (~i204);
                    int i206 = i8 & i204;
                    int i207 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
                    int i208 = i207 % 128;
                    b = i208;
                    if (i207 % 2 == 0) {
                        i9 = (i205 & i206) | (i205 ^ i206);
                        objArr = new Object[3];
                        objArr[1] = new int[0];
                        objArr[0] = new int[1];
                        objArr[3] = new int[0];
                        int i209 = (~(i2 & i9)) & (i2 | i9);
                        int i210 = -i209;
                        i10 = ((i209 & i210) | (i209 ^ i210)) / 26;
                        i11 = ~i10;
                        i12 = 1;
                    } else {
                        i9 = i205 | i206;
                        objArr = new Object[4];
                        objArr[0] = new int[1];
                        objArr[1] = new int[1];
                        objArr[2] = new int[1];
                        int i211 = (~(i2 & i9)) & (i2 | i9);
                        i10 = (i211 | (-i211)) >> 31;
                        i11 = ~i10;
                        i12 = 0;
                    }
                    int i212 = (i10 & 16) ^ (i11 & i12);
                    ((int[]) objArr[0])[0] = i2;
                    int[] iArr = (int[]) objArr[2];
                    int i213 = (i208 ^ 33) + ((i208 & 33) << 1);
                    int i214 = i213 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i214;
                    int i215 = i213 % 2;
                    iArr[0] = i9;
                    objArr[3] = null;
                    int i216 = (((~(197782017 | i201)) | (~((-238092247) | i2)) | (~(i201 | 238092246))) * 959) + 1380273385 + (((~(197782017 | i2)) | (~(i201 | (-238092247))) | (~(i2 | 238092246))) * 959);
                    int i217 = (i214 ^ 61) + ((i214 & 61) << 1);
                    b = i217 % 128;
                    int i218 = i217 % 2;
                    int i219 = (-432) * i212;
                    int i220 = i216 * 434;
                    int i221 = (i219 & i220) + (i219 | i220);
                    int i222 = ~i212;
                    int i223 = ~i2;
                    int i224 = (i223 & i222) | (i222 ^ i223);
                    int i225 = i221 + ((~((i224 & i216) | (i224 ^ i216))) * 433);
                    int i226 = ~i216;
                    int i227 = (i225 - (~((i222 | (~((i226 & i2) | (i226 ^ i2)))) * (-433)))) - 1;
                    int i228 = ~i212;
                    int i229 = ~((i228 & i2) | (i228 ^ i2));
                    int i230 = ~((i212 ^ i216) | (i212 & i216));
                    int i231 = (i227 - (~(((i229 & i230) | (i229 ^ i230)) * 433))) - 1;
                    int iB8 = zzrf.b();
                    int i232 = (i231 * (-501)) + (i4 * TypedValues.PositionType.TYPE_PERCENT_WIDTH);
                    int i233 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i234 = ((i233 | 75) << 1) - (i233 ^ 75);
                    b = i234 % 128;
                    int i235 = i234 % 2;
                    int i236 = ~i4;
                    int i237 = i236 ^ iB8;
                    if (i235 == 0) {
                        int i238 = i232 % (((~(i237 | (i236 & iB8))) | (~((i231 ^ i4) | (i231 & i4)))) - 502);
                        int i239 = ~iB8;
                        int i240 = (i236 & i239) | (i236 ^ i239);
                        int i241 = -((-502) - (~((i240 & i231) | (i240 ^ i231))));
                        i13 = (i238 ^ i241) + ((i241 & i238) << 1);
                    } else {
                        int i242 = ~(i237 | (i236 & iB8));
                        int i243 = ~((i231 ^ i4) | (i231 & i4));
                        int i244 = ((i242 & i243) | (i242 ^ i243)) * (-502);
                        int i245 = (i232 ^ i244) + ((i232 & i244) << 1);
                        int i246 = ~iB8;
                        int i247 = (i236 & i246) | (i236 ^ i246);
                        i13 = i245 + ((~((i247 & i231) | (i247 ^ i231))) * (-502));
                    }
                    int i248 = ~i4;
                    int i249 = ~i231;
                    int i250 = ~((iB8 & i249) | (i249 ^ iB8));
                    int i251 = (i13 - (~(-(-(TypedValues.PositionType.TYPE_DRAWPATH * ((i250 & i248) | (i248 ^ i250))))))) - 1;
                    int i252 = (i251 << 13) ^ i251;
                    int i253 = i252 >>> 17;
                    int i254 = ((~i252) & i253) | ((~i253) & i252);
                    int i255 = i254 << 5;
                    ((int[]) objArr[1])[0] = (i254 | i255) & (~(i254 & i255));
                    return objArr;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r6, short r7, short r8) {
                /*
                    int r8 = r8 * 4
                    int r8 = r8 + 4
                    int r6 = r6 * 3
                    int r6 = 115 - r6
                    byte[] r0 = defpackage.to.$$c
                    int r7 = r7 * 2
                    int r1 = 1 - r7
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r0 != 0) goto L19
                    r4 = r7
                    r6 = r8
                    r3 = r2
                    goto L2c
                L19:
                    r3 = r2
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L1d:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r7) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L28:
                    r4 = r0[r6]
                    int r3 = r3 + 1
                L2c:
                    int r4 = -r4
                    int r8 = r8 + r4
                    int r6 = r6 + 1
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.to.$$e(byte, short, short):java.lang.String");
            }
        });
        FragmentManager supportFragmentManager = editProfileActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(messageVarTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i2 = INotificationSideChannel + 87;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                messageVarTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(supportFragmentManager, messageVarTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                throw null;
            }
            messageVarTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(supportFragmentManager, messageVarTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(EditProfileActivity editProfileActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_name", "init_add_kpj"));
        Intrinsics.checkNotNullParameter(editProfileActivity, "");
        Intrinsics.checkNotNullParameter("add_kpj_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("add_kpj_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("add_kpj_account", mapMutableMapOf);
        AddKpjActivity.Companion companion = AddKpjActivity.INSTANCE;
        AddKpjActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(editProfileActivity);
        Unit unit = Unit.INSTANCE;
        int i2 = INotificationSideChannel + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(EditProfileActivity editProfileActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        Object obj = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = INotificationSideChannel + 57;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                editProfileActivity.MediaBrowserCompat();
                obj.hashCode();
                throw null;
            }
            editProfileActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i3 = INotificationSideChannel + 41;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            editProfileActivity.IconCompatParcelizer();
            AccountVerificationActivity.b bVar = AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            EditProfileActivity editProfileActivity2 = editProfileActivity;
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String str2 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            if (userAsBinder2 != null) {
                int i5 = INotificationSideChannel + 45;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    str = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i6 = 3 / 0;
                } else {
                    str = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
            } else {
                str = null;
            }
            if (str == null) {
                int i7 = INotificationSideChannel + 115;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                str = "";
            }
            AccountVerificationActivity.b.b(editProfileActivity2, str2, str, 6, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, 32);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            editProfileActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        } else {
            editProfileActivity.IconCompatParcelizer();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onTransact + 55;
        INotificationSideChannel = i9 % 128;
        if (i9 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit a(EditProfileActivity editProfileActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = onTransact + 115;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            ((ActivityEditProfileBinding) ((ViewBinding) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).civProfilePhoto.setImageBitmap((Bitmap) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            CircleImageView circleImageView = ((ActivityEditProfileBinding) ((ViewBinding) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).civProfilePhoto;
            Intrinsics.checkNotNullExpressionValue(circleImageView, "");
            circleImageView.setVisibility(8);
            int i4 = INotificationSideChannel + 113;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(EditProfileActivity editProfileActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        int i2 = onTransact + 39;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            editProfileActivity.MediaBrowserCompat();
            str = "loading_request_new_password_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            editProfileActivity.IconCompatParcelizer();
            String string = editProfileActivity.getString(R.string.message_password_successfully_changed);
            Intrinsics.checkNotNullExpressionValue(string, "");
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
            IntegerRes integerRes = (IntegerRes) editProfileActivity.TuitionPaymentFragmentbindingInflater1.getValue();
            User user = (User) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            Intrinsics.checkNotNull(user);
            String str2 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            User user2 = (User) editProfileActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            Intrinsics.checkNotNull(user2);
            String str3 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("#");
            sb.append(str3);
            integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new LogoutRequest(sb.toString()));
            int i5 = onTransact + 75;
            INotificationSideChannel = i5 % 128;
            int i6 = i5 % 2;
            str = "success_request_new_password_result";
        } else if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            editProfileActivity.IconCompatParcelizer();
            str = "";
        } else {
            int i7 = i3 + 125;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            editProfileActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            str = "failure_request_new_password_result";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_request_new_password_result", str));
        Intrinsics.checkNotNullParameter(editProfileActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(EditProfileActivity editProfileActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        return (Unit) TuitionPaymentFragmentbindingInflater1(116766469, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -116766464, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{editProfileActivity, virtualCameraAdapter1}, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public static /* synthetic */ Unit b(EditProfileActivity editProfileActivity) {
        return (Unit) TuitionPaymentFragmentbindingInflater1(-565586185, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 565586188, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{editProfileActivity}, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(EditProfileActivity editProfileActivity, View view) {
        return (Unit) TuitionPaymentFragmentbindingInflater1(-1739855408, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1739855412, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{editProfileActivity, view}, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(EditProfileActivity editProfileActivity, View view) {
        return (Unit) TuitionPaymentFragmentbindingInflater1(780219797, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -780219797, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{editProfileActivity, view}, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    static {
        notify = 0;
        onTransact();
        INSTANCE = new Companion(null);
        int i = cancelAll + 49;
        notify = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        TuitionPaymentFragmentbindingInflater1(1762837345, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), zzar.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1762837343, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, zzar.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = INotificationSideChannel + 75;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        TuitionPaymentFragmentbindingInflater1(1821692524, CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), zzar.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1821692523, zzar.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, context}, zzar.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    static void onTransact() {
        f456a = new char[]{60034, 60058, 60117, 60088, 60052, 60063, 60045, 60050, 60083, 60048, 60047, 60053, 60060, 60037, 60062, 60056, 60051, 60043, 60041, 60073, 60072, 60054, 60040, 60049, 60055};
        g = (char) 57188;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        EditProfileActivity editProfileActivity = (EditProfileActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 27;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitA = a(editProfileActivity, view);
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        int i5 = onTransact + 77;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return unitA;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.account.setting.EditProfileActivity.$$c
            int r6 = 116 - r6
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.EditProfileActivity.$$i(byte, byte, byte):java.lang.String");
    }
}
