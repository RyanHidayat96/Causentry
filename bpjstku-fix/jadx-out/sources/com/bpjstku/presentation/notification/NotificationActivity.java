package com.bpjstku.presentation.notification;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcher;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.notification.model.request.NotificationActionRequest;
import com.bpjstku.data.notification.model.request.NotificationListRequest;
import com.bpjstku.databinding.ActivityNotificationBinding;
import com.bpjstku.domain.notification.model.Notification;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity$special$$inlined$inject$default$2;
import com.bpjstku.presentation.notification.NotificationActivity;
import com.bpjstku.presentation.util.WebviewFaqCustomActivity;
import com.bpjstku.util.constant.ProgramType;
import com.bpjstku.util.enums.NotificationType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.kennyc.view.MultiStateView;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControl;
import defpackage.Camera2CameraControlExternalSyntheticLambda0;
import defpackage.CameraUseCaseAdapter;
import defpackage.CaptureSession1;
import defpackage.PackageIdentityUtils;
import defpackage.PackageIdentityUtilsSignaturesCompat;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.addCaptureRequestOptionsInternal;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.copyNotificationOntoChannel;
import defpackage.deriveCodec;
import defpackage.getConfigs;
import defpackage.getContentPaddingRight;
import defpackage.getDefaultDarkScrimannotations;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onCaptureSessionEnd;
import defpackage.onResume;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\u0005J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0007\u0010\u0011J\u001d\u0010\n\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\n\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0005J#\u0010\n\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\n\u0010\u001bJ\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u0005R\u0015\u0010\u0007\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0015\u0010#\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010 R\u001a\u0010$\u001a\u00020\u001a8\u0015X\u0095D¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010%R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00020&8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010(R\u0016\u0010\u000b\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0016\u0010\u001f\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010*R\u0014\u0010\t\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,"}, d2 = {"Lcom/bpjstku/presentation/notification/NotificationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityNotificationBinding;", "LaddCaptureRequestOptionsInternal$TuitionPaymentFragmentbindingInflater1;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "", "p0", "", "p1", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "", "Lcom/bpjstku/domain/notification/model/Notification;", "(Ljava/util/List;)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "g", "", "(Ljava/lang/Integer;)V", "(I)V", "onDestroy", "LPackageIdentityUtilsSignaturesCompat;", "d", "Lkotlin/Lazy;", "I", "LPackageIdentityUtils;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Ljava/lang/String;", "Z", "Lcom/bpjstku/presentation/notification/NotificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Lcom/bpjstku/presentation/notification/NotificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationActivity extends BindingBaseActivity<ActivityNotificationBinding> implements addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 {
    private static char INotificationSideChannel;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f572a;
    private static char cancel;
    private static char notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private boolean d;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {114, -115, 48, 84};
    private static final int $$f = 243;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {91, -9, 99, 11, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 8;
    private static int getInterfaceDescriptor = 1;
    private static int onTransact = 0;
    private static int cancelAll = 1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: attachCompleter
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {68, -119, -76, 97, 17, -6, 18, 1, -2, -1, -50, 73, 6, -1, 4, 3, 7, 6, -66, 76, -62, -2, 67, -4, 3, 9, -4, -47, 73, -10, 18, 4, -6, 10, 3, -60, 35, 28, 3, 9, -4, -26, 48, 3, 10, 2, 1, 1, 4, -3, 17, -43, 48, 2, 7, -11, 23, -76, 35, 34, 15, 4, -6, 3, 6, 12, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, 3, 1, -7, 2, 10, -4, 15, 1, 9, 2, 1, 9, -5, 3, 22, -9, 0, 22, -38, 38, -7, 5, 11, -4, 5, 5, -1, 24, -5, 12, -62};
        private static final int $$e = 208;
        private static final byte[] $$a = {17, 104, 102, -28, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 7;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static long b = 9161879919326167689L;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 2
                int r7 = r7 + 84
                int r8 = r8 * 15
                int r0 = 53 - r8
                byte[] r1 = defpackage.attachCompleter.$$a
                int r6 = r6 + 4
                byte[] r0 = new byte[r0]
                int r8 = 52 - r8
                r2 = 0
                if (r1 != 0) goto L17
                r7 = r6
                r3 = r8
                r4 = r2
                goto L30
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r6 = r6 + 1
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L30:
                int r3 = r3 + r6
                int r6 = r3 + (-11)
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.attachCompleter.a(int, byte, short, java.lang.Object[]):void");
        }

        private static void d(int i, short s, byte b2, Object[] objArr) {
            int i2 = (i * 13) + 84;
            byte[] bArr = $$d;
            int i3 = 65 - (s * 62);
            int i4 = b2 * 10;
            byte[] bArr2 = new byte[i4 + 53];
            int i5 = i4 + 52;
            int i6 = -1;
            if (bArr == null) {
                i2 = (i2 + i5) - 4;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i2;
                i3++;
                if (i6 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i2 = (i2 + bArr[i3]) - 4;
            }
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            int i3 = $11 + 17;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i5 = $10 + 1;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getTapTimeout() >> 16)), 2624 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.getCapsMode("", 0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b ^ 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - ExpandableListView.getPackedPositionGroup(0L)), (Process.myPid() >> 22) + 481, ExpandableListView.getPackedPositionGroup(0L) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - Drawable.resolveOpacity(0, 0)), 481 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cAxisFromString = (char) (43041 - MotionEvent.axisFromString(""));
                int i2 = 3112 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int mirror = 'F' - AndroidCharacter.getMirror('0');
                byte[] bArr = $$a;
                byte b2 = bArr[5];
                byte b3 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, i2, mirror, -1272852037, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{11251, 57731, 48904, 29853, 513, 57216, 38156, 41669, 30725, 13718, 49994, 39092, 22047, 25490, 14612, 63110, 35855, 22974, 5904, 11408, 64029, 46994}, KeyEvent.normalizeMetaState(0) + 51839, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{11255, 63179, 37273, 48253, 24373, 31230, 1224, 10163, 49759, 60718, 36844, 43681, 30087, 4174, 13073}, TextUtils.indexOf("", "") + 56629, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cMyTid = (char) ((Process.myTid() >> 22) + 43042);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3111;
                int iMyTid = (Process.myTid() >> 22) + 22;
                byte b4 = $$a[7];
                Object[] objArr5 = new Object[1];
                a((byte) 51, b4, b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, jumpTapTimeout, iMyTid, -1269618118, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) (43043 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 3111;
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 22;
                    byte b5 = (byte) ($$b | 96);
                    byte[] bArr2 = $$a;
                    Object[] objArr6 = new Object[1];
                    a(b5, bArr2[7], bArr2[132], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, packedPositionType, iResolveOpacity, 154975793, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i5 = ((int[]) objArr7[2])[0];
                int i6 = ((int[]) objArr7[1])[0];
                String[] strArr = (String[]) objArr7[3];
                int i7 = (int) Runtime.getRuntime().totalMemory();
                int i8 = ~i7;
                int i9 = (((862333938 + ((((~((-1586634516) | i8)) | (-118396944)) | (~(1586634515 | i7))) * (-564))) + ((~(i7 | (-17596429))) * 1128)) + (((~((-118396944) | i8)) | (-1604230944)) * 564)) - 1001881794;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
                objArr = new Object[]{new int[1], new int[]{i6}, new int[]{i5}, strArr};
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{11256, 44624, 8354, 47898, 15664, 47057, 2593, 35977, 1773, 39175, 5023, 38378, 26693, 58017, 25885, 65394}, 34212 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{11259, 20439, 58293, 1951, 47970, 57182, 29472, 38668, 2770, 44762, 49835, 26257, 39517, 15952, 21048, 63000}, 25633 - KeyEvent.normalizeMetaState(0), objArr9);
                try {
                    Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, -1001881794};
                    byte[] bArr3 = $$d;
                    byte b6 = bArr3[7];
                    byte b7 = b6;
                    Object[] objArr11 = new Object[1];
                    d(b6, b7, b7, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b8 = bArr3[103];
                    byte b9 = b8;
                    Object[] objArr12 = new Object[1];
                    d(b8, b9, b9, objArr12);
                    objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43042);
                        int iRgb = Color.rgb(0, 0, 0) + 16780327;
                        int i12 = 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte b10 = (byte) ($$b | 96);
                        byte[] bArr4 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(b10, bArr4[7], bArr4[132], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay, iRgb, i12, 154975793, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr14 = new Object[1];
                        c(new char[]{11251, 57731, 48904, 29853, 513, 57216, 38156, 41669, 30725, 13718, 49994, 39092, 22047, 25490, 14612, 63110, 35855, 22974, 5904, 11408, 64029, 46994}, 51839 - View.getDefaultSize(0, 0), objArr14);
                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                        Object[] objArr15 = new Object[1];
                        c(new char[]{11255, 63179, 37273, 48253, 24373, 31230, 1224, 10163, 49759, 60718, 36844, 43681, 30087, 4174, 13073}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 56629, objArr15);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16820258);
                            int scrollDefaultDelay = 3111 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int i13 = 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            byte b11 = $$a[7];
                            Object[] objArr16 = new Object[1];
                            a((byte) 51, b11, b11, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, scrollDefaultDelay, i13, -1269618118, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43042);
                            int iAlpha = Color.alpha(0) + 3111;
                            int i14 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21;
                            byte[] bArr5 = $$a;
                            byte b12 = bArr5[5];
                            byte b13 = bArr5[7];
                            Object[] objArr17 = new Object[1];
                            a(b12, b13, b13, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iAlpha, i14, -1272852037, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
            if (i16 != i15) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[3];
                if (strArr2 != null) {
                    int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
                    for (int i18 = i17 % 2 != 0 ? 0 : 1; i18 < strArr2.length; i18++) {
                        arrayList.add(strArr2[i18]);
                    }
                }
                throw new RuntimeException(String.valueOf(i16));
            }
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[3];
            int[] iArr = {i20};
            int[] iArr2 = {i21};
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = 23221314 + (((~((~iIdentityHashCode) | (-1278580194))) | 1142199456) * (-245));
            int i23 = ~(iIdentityHashCode | (-1278580194));
            int i24 = i19 + i22 + (i23 * (-245)) + ((i23 | 426451265) * 245);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr[0])[0] = i26 ^ (i26 << 5);
            Object[] objArr18 = {new int[1], iArr2, iArr, strArr3};
            return NotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.activity_notification;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int asInterface = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3 asBinder = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    public static /* synthetic */ Object b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws IllegalAccessException {
        int i7 = ~i4;
        int i8 = (~i2) | i7;
        int i9 = ~i8;
        int i10 = (~(i7 | i)) | i9;
        int i11 = ~i;
        int i12 = (~(i7 | i11 | i2)) | (~(i8 | i)) | (~(i4 | i | i2));
        int i13 = (~(i2 | i4)) | i | i9;
        int i14 = i4 + i + i6 + (5090439 * i3) + ((-1076018391) * i5);
        int i15 = i14 * i14;
        int i16 = ((1425068070 * i4) - 1475346432) + (1088368604 * i) + (i10 * (-168349733)) + ((-168349733) * i12) + (168349733 * i13) + (1256718336 * i6) + (1616379904 * i3) + ((-1222115328) * i5) + (1028194304 * i15);
        int i17 = (i4 * (-1092730454)) + 799718796 + ((-1092731068) * i) + (i10 * (-307)) + (i12 * (-307)) + (i13 * 307) + (i6 * (-1092730761)) + (i3 * 1582232257) + (i5 * 741505039) + (i15 * (-1125187584));
        switch (i16 + (i17 * i17 * (-410583040))) {
            case 1:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 3:
                NotificationActivity notificationActivity = (NotificationActivity) objArr[0];
                int i18 = 2 % 2;
                int i19 = onTransact + 73;
                cancelAll = i19 % 128;
                int i20 = i19 % 2;
                if (((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null) != (-1134047304) + ((537430410 | i11) * 1324) + (((~(i | (-1503863906))) | (~(673876362 | i))) * (-1324)) + 1710768056) {
                    throw null;
                }
                int i21 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                if (i21 != (((~(iFreeMemory | 592578851)) | 1986477113) * 56) + 457670236 + (((~((~iFreeMemory) | 1986477113)) | 592578851) * 56)) {
                    throw null;
                }
                super.onResume();
                int i22 = onTransact + 43;
                cancelAll = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 5:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 6:
                return asBinder(objArr);
            default:
                return b(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.notification.NotificationActivity.$$a
            int r8 = 145 - r8
            int r9 = r9 * 14
            int r9 = r9 + 84
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2b
        L13:
            r3 = r2
        L14:
            r6 = r9
            r9 = r8
            r8 = r6
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2b:
            int r8 = r8 + 1
            int r9 = r9 + r3
            int r9 = r9 + (-11)
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.notification.NotificationActivity.c(int, int, int, java.lang.Object[]):void");
    }

    public NotificationActivity() {
        final NotificationActivity notificationActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<PackageIdentityUtilsSignaturesCompat>() { // from class: com.bpjstku.presentation.notification.NotificationActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [PackageIdentityUtilsSignaturesCompat, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ PackageIdentityUtilsSignaturesCompat invoke() {
                LifecycleOwner lifecycleOwner = notificationActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PackageIdentityUtilsSignaturesCompat.class);
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
    }

    public static final /* synthetic */ void asInterface(NotificationActivity notificationActivity) throws IOException {
        int i = 2 % 2;
        int i2 = cancelAll + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        notificationActivity.g();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1
    public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Integer num, RecyclerView recyclerView) {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = num.intValue();
        if (this.d) {
            return;
        }
        int i4 = onTransact + 85;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            this.asInterface = iIntValue;
            this.d = true;
            b(iIntValue);
        } else {
            this.asInterface = iIntValue;
            this.d = true;
            b(iIntValue);
        }
        int i5 = onTransact + 13;
        cancelAll = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.notification.NotificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/notification/NotificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "b", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, NotificationActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        int i3 = i2 % 128;
        cancelAll = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i3 + 41;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityNotificationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        NotificationActivity$bindingInflater$1 notificationActivity$bindingInflater$1 = NotificationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = onTransact + 69;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return notificationActivity$bindingInflater$1;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends OnBackPressedCallback {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            super(true);
        }

        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackPressed() throws IOException {
            NotificationActivity.asInterface(NotificationActivity.this);
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    @Deprecated(message = "Override deprecated method for compatibility")
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = cancelAll + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (i3 == 0) {
            onBackPressedDispatcher.addCallback(this, this.asBinder);
        } else {
            onBackPressedDispatcher.addCallback(this, this.asBinder);
            int i4 = 49 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        String stringExtra = getIntent().getStringExtra("key_notification_navigate");
        if (stringExtra == null) {
            int i2 = cancelAll;
            int i3 = i2 + 53;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 71;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 5;
            }
            stringExtra = "";
        }
        this.a = stringExtra;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        NotificationActivity notificationActivity = this;
        Intrinsics.checkNotNullParameter(notificationActivity, "");
        notificationActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityNotificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.title_notification);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        RecyclerView recyclerView = ((ActivityNotificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvNotification;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, 1));
        recyclerView.setAdapter((PackageIdentityUtils) this.TuitionPaymentFragmentbindingInflater1.getValue());
        recyclerView.addOnScrollListener(new b());
        PackageIdentityUtils packageIdentityUtils = (PackageIdentityUtils) this.TuitionPaymentFragmentbindingInflater1.getValue();
        packageIdentityUtils.TuitionPaymentFragmentbindingInflater1 = 20;
        packageIdentityUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault1(((ActivityNotificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvNotification);
        packageIdentityUtils.g = this;
        int i2 = cancelAll + 121;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static final class b extends RecyclerView.OnScrollListener {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((ActivityNotificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlNotification.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: immediateFailedFuture
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                NotificationActivity.b(this.b);
            }
        });
        int i2 = onTransact + 37;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
            int i3 = $11 + 83;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $11 + 59;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (((long) notify) ^ 8611973335120459638L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(cancel)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 47773), 468 - (ViewConfiguration.getScrollBarSize() >> 8), 14 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) f572a) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(INotificationSideChannel)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-16729443) - Color.rgb(0, 0, 0)), View.combineMeasuredStates(0, 0) + 468, '=' - AndroidCharacter.getMirror('0'), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr3[0] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) (-1);
                byte b3 = (byte) (b2 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 2323 - View.getDefaultSize(0, 0), 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1312321721, false, $$i(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object b(Object[] objArr) throws IllegalAccessException {
        NotificationActivity notificationActivity = (NotificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 63;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        notificationActivity.asInterface = 1;
        notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        notificationActivity.d = true;
        ((PackageIdentityUtilsSignaturesCompat) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b(notificationActivity.asInterface);
        b(new Object[]{notificationActivity}, 844373990, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 852585322 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima4_permata).substring(19, 20).codePointAt(0), -844373988, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 145688086, ProgramType.b.TuitionPaymentFragmentbindingInflater1());
        int i4 = cancelAll + 93;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        final NotificationActivity notificationActivity = (NotificationActivity) objArr[0];
        int i = 2 % 2;
        ((PackageIdentityUtilsSignaturesCompat) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(notificationActivity, new Observer() { // from class: areSplashScreensSupported
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws IllegalAccessException {
                NotificationActivity.b(new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj}, -1999047476, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1999047480, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        });
        NotificationActivity notificationActivity2 = notificationActivity;
        ((PackageIdentityUtilsSignaturesCompat) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(notificationActivity2, new Observer() { // from class: transferSplashImage
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws IOException {
                NotificationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((PackageIdentityUtilsSignaturesCompat) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d.observe(notificationActivity2, new Observer() { // from class: getActiveNotifications
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws IllegalAccessException {
                NotificationActivity.b(new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj}, -229472539, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 229472540, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        });
        int i2 = onTransact + 121;
        cancelAll = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable p0, String p1) {
        int i = 2 % 2;
        if (p1 == null) {
            int i2 = cancelAll + 51;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 != 0) {
                int i4 = 59 / 0;
            }
            int i5 = i3 + 35;
            cancelAll = i5 % 128;
            int i6 = i5 % 2;
            p1 = "Unable to load notifications";
        }
        String str = p1;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >= 3) {
            MultiStateView multiStateView = ((ActivityNotificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvNotification;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            if (p0 == null) {
                p0 = new Exception(str);
            }
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView, p0, null, str, null, new Pair(getString(R.string.action_return), new Function0() { // from class: NotificationApiHelperForO
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotificationActivity.d(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            }));
            int i7 = onTransact + 41;
            cancelAll = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        int i9 = cancelAll + 9;
        onTransact = i9 % 128;
        if (i9 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(((ActivityNotificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvNotification, "");
            throw null;
        }
        MultiStateView multiStateView2 = ((ActivityNotificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvNotification;
        Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
        if (p0 == null) {
            p0 = new Exception(str);
        }
        Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView2, p0, null, str, null, new Pair(getString(R.string.action_retry), new Function0() { // from class: lambdagetServiceWrapper0androidxbrowsertrustedConnectionHolder
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
            }
        }));
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(List<Notification> p0) throws IOException {
        int i = 2 % 2;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = p0.iterator();
            int i2 = cancelAll + 49;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            while (!(!it.hasNext())) {
                int i4 = onTransact + 67;
                cancelAll = i4 % 128;
                int i5 = i4 % 2;
                Object next = it.next();
                if (!((Notification) next).isRead) {
                    int i6 = onTransact + 121;
                    cancelAll = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList.add(next);
                }
            }
            ((PackageIdentityUtilsSignaturesCompat) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.saveBoolean("unread_notif", !arrayList.isEmpty());
        } catch (Exception e2) {
            if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                getContentPaddingRight.b("Error checking unread notifications: ".concat(String.valueOf(e2.getMessage())), new Object[0]);
            }
            ((PackageIdentityUtilsSignaturesCompat) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.saveBoolean("unread_notif", false);
        }
    }

    @Override // android.app.Activity
    @Deprecated(message = "Handle back press with modern approach")
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() != 16908332) {
                return super.onOptionsItemSelected(p0);
            }
            int i4 = onTransact + 69;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            g();
            return true;
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    private final void g() throws IOException {
        int i = 2 % 2;
        int i2 = cancelAll + 63;
        onTransact = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                List<Data> list = ((PackageIdentityUtils) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Intrinsics.checkNotNullExpressionValue(list, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2((List<Notification>) list);
                int i3 = 49 / 0;
            } else {
                List<Data> list2 = ((PackageIdentityUtils) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Intrinsics.checkNotNullExpressionValue(list2, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2((List<Notification>) list2);
            }
        } catch (Exception e2) {
            if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                getContentPaddingRight.b("Error checking notifications on back press: ".concat(String.valueOf(e2.getMessage())), new Object[0]);
                int i4 = onTransact + 31;
                cancelAll = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        finish();
    }

    @Override // addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer num) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = cancelAll + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ((PackageIdentityUtils) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1();
        if (num != null) {
            int i4 = cancelAll + 27;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            iIntValue = num.intValue();
        } else {
            iIntValue = this.asInterface;
        }
        this.asInterface = iIntValue;
        b(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    private final void b(int i) {
        String str;
        int i2 = 2 % 2;
        PackageIdentityUtilsSignaturesCompat packageIdentityUtilsSignaturesCompat = (PackageIdentityUtilsSignaturesCompat) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        final MutableLiveData mutableLiveData = new MutableLiveData();
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        NotificationListRequest notificationListRequest = new NotificationListRequest(String.valueOf(i), "20");
        User userAsBinder = packageIdentityUtilsSignaturesCompat.asInterface.asBinder();
        Object obj = null;
        if (userAsBinder != null) {
            int i3 = onTransact + 63;
            cancelAll = i3 % 128;
            if (i3 % 2 == 0) {
                String str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                obj.hashCode();
                throw null;
            }
            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str != null) {
                int i4 = onTransact + 71;
                cancelAll = i4 % 128;
                int i5 = i4 % 2;
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        notificationListRequest.setEmail(str);
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(packageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getNotifications(notificationListRequest)));
        final Function1 function1 = new Function1() { // from class: ScreenOrientationLockType
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return PackageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentbindingInflater1(mutableLiveData, (List) obj2);
            }
        };
        logToString logtostring = new logToString() { // from class: ScreenOrientation
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function1.invoke(obj2);
            }
        };
        final Function1 function2 = new Function1() { // from class: Token
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return PackageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mutableLiveData, (Throwable) obj2);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: deserialize
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function2.invoke(obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        packageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        mutableLiveData.observe(this, new Observer() { // from class: launchBrowserSiteSettings
            private static final byte[] $$c = {104, 27, -72, 120};
            private static final int $$d = 158;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {102, -96, -78, -55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 202;
            private static int b = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {1746560573, -94726730, -1753974675, 841572751, 62829180, -1269607955, 859188520, -2110595337, -591126140, -758259195, 999761748, 1114965646, 709227488, 1839283947, -1965980826, -553051463, 1832526611, 1239952096};

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = defpackage.launchBrowserSiteSettings.$$a
                    int r6 = r6 * 52
                    int r6 = r6 + 4
                    int r1 = 53 - r7
                    int r8 = r8 * 14
                    int r8 = r8 + 84
                    byte[] r1 = new byte[r1]
                    int r7 = 52 - r7
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r7
                    r4 = r2
                    goto L2c
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r7) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L24:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2c:
                    int r8 = -r8
                    int r3 = r3 + r8
                    int r6 = r6 + 1
                    int r8 = r3 + (-11)
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.launchBrowserSiteSettings.a(short, byte, byte, java.lang.Object[]):void");
            }

            private static void c(int[] iArr, int i6, Object[] objArr) throws Throwable {
                int i7 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                long j = 0;
                int i8 = -1870535734;
                int i9 = 1;
                int i10 = 0;
                if (iArr2 != null) {
                    int i11 = $11 + 55;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i13 = 0;
                    while (i13 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i13])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1), 3291 - (ViewConfiguration.getTapTimeout() >> 16), 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1948206109, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr3[i13] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i13++;
                            j = 0;
                            i8 = -1870535734;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i14 = $10 + 125;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = 0;
                    while (i16 < length3) {
                        try {
                            Object[] objArr3 = new Object[i9];
                            objArr3[i10] = Integer.valueOf(iArr5[i16]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) i10;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 3291 - Drawable.resolveOpacity(i10, i10), 31 - (ViewConfiguration.getTouchSlop() >> 8), 1948206109, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr6[i16] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i16++;
                            i9 = 1;
                            i10 = 0;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    iArr5 = iArr6;
                }
                int i17 = i10;
                System.arraycopy(iArr5, i17, iArr4, i17, length2);
                sessionConfigValidatingBuilder.b = 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    cArr[i17] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i18 = $11 + 63;
                    $10 = i18 % 128;
                    int i19 = 2;
                    int i20 = i18 % 2;
                    int i21 = 17;
                    while (i21 > 1) {
                        int i22 = $10 + 69;
                        $11 = i22 % 128;
                        int i23 = i22 % i19;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i21];
                        Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.getMode(0), 2559 - Drawable.resolveOpacity(0, 0), 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 683220507, false, $$e(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i21--;
                        i19 = 2;
                    }
                    int i24 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i25 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr5 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28880 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Process.getGidForName("") + 349, KeyEvent.getDeadChar(0, 0) + 25, -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                    i17 = 0;
                }
                objArr[0] = new String(cArr2, 0, i6);
            }

            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj2) throws Throwable {
                Object[] objArr;
                int i6 = 2 % 2;
                int i7 = b + 73;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                int i8 = i7 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 651;
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 44;
                    byte b2 = $$a[7];
                    byte b3 = b2;
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, capsMode, iKeyCodeFromString, -459846511, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new int[]{-1154775178, -2016951157, 802065493, 303937479, 1312493805, -2021066391, 325534760, -846944729, 377930713, 1104670131, -1226867353, 1174258476, -1116969355, 1519835275}, 22 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new int[]{-1026297593, -76945190, 309962450, 1781996049, -1291576681, 1584386235, -1544109726, -1234473050, 117931230, 1732192416}, 15 - View.combineMeasuredStates(0, 0), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 651;
                    int packedPositionChild = 43 - ExpandableListView.getPackedPositionChild(0L);
                    byte b4 = $$a[5];
                    Object[] objArr5 = new Object[1];
                    a(b4, (byte) 52, b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, edgeSlop, packedPositionChild, -873460649, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int mode = View.MeasureSpec.getMode(0) + 651;
                        int gidForName = 43 - Process.getGidForName("");
                        byte[] bArr = $$a;
                        byte b5 = bArr[5];
                        Object[] objArr6 = new Object[1];
                        a(b5, (byte) (b5 | 14), bArr[7], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, mode, gidForName, -1595579076, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i9 = ((int[]) objArr7[2])[0];
                    int i10 = ((int[]) objArr7[0])[0];
                    int iNextInt = new Random().nextInt();
                    int i11 = ~iNextInt;
                    int i12 = 291618765 + (((~((-138688193) | i11)) | 4203200 | (~(135257382 | i11)) | (~((-772391) | iNextInt))) * (-84));
                    int i13 = (~(iNextInt | 135257382)) | 138688192;
                    int i14 = ~(i11 | (-135257383));
                    int i15 = i12 + ((i13 | i14) * (-84)) + ((772390 | i14) * 84) + 1326912512;
                    int i16 = (i15 << 13) ^ i15;
                    int i17 = i16 ^ (i16 >>> 17);
                    ((int[]) objArr[3])[0] = i17 ^ (i17 << 5);
                } else {
                    try {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 1610, View.resolveSize(0, 0) + 26, 2145681644, false, null, new Class[0]);
                        }
                        Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 1326912512, 0};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                            int iIndexOf = 650 - TextUtils.indexOf((CharSequence) "", '0');
                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45;
                            byte b6 = $$a[5];
                            Object[] objArr9 = new Object[1];
                            a(b6, (byte) 52, b6, objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror, iIndexOf, iIndexOf2, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 695 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.lastIndexOf("", '0', 0) + 99), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - Gravity.getAbsoluteGravity(0, 0)), 793 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 83 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Integer.TYPE, Integer.TYPE});
                        }
                        Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                            int i18 = 651 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int i19 = 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            byte[] bArr2 = $$a;
                            byte b7 = bArr2[5];
                            Object[] objArr11 = new Object[1];
                            a(b7, (byte) (b7 | 14), bArr2[7], objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength, i18, i19, -1595579076, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                        try {
                            Object[] objArr12 = new Object[1];
                            c(new int[]{-1154775178, -2016951157, 802065493, 303937479, 1312493805, -2021066391, 325534760, -846944729, 377930713, 1104670131, -1226867353, 1174258476, -1116969355, 1519835275}, 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            c(new int[]{-1026297593, -76945190, 309962450, 1781996049, -1291576681, 1584386235, -1544109726, -1234473050, 117931230, 1732192416}, ExpandableListView.getPackedPositionType(0L) + 15, objArr13);
                            long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                int i20 = 652 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int iLastIndexOf = 43 - TextUtils.lastIndexOf("", '0');
                                byte b8 = $$a[5];
                                Object[] objArr14 = new Object[1];
                                a(b8, (byte) 52, b8, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(pressedStateDuration, i20, iLastIndexOf, -873460649, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char c2 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                int iIndexOf3 = 651 - TextUtils.indexOf("", "", 0);
                                int i21 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44;
                                byte b9 = $$a[7];
                                byte b10 = b9;
                                Object[] objArr15 = new Object[1];
                                a(b9, b10, b10, objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, iIndexOf3, i21, -459846511, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                            objArr = objArr10;
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
                int i22 = ((int[]) objArr[0])[0];
                int i23 = ((int[]) objArr[2])[0];
                if (i23 == i22) {
                    Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i24 = ((int[]) objArr[3])[0];
                    int i25 = ((int[]) objArr[2])[0];
                    int i26 = ((int[]) objArr[0])[0];
                    int iNextInt2 = new Random().nextInt(474272483);
                    int i27 = ~iNextInt2;
                    int i28 = i24 + (-1777159062) + (((~((-30188349) | i27)) | (-26757539)) * 519) + (((~(i27 | (-25690401))) | (~((-1067139) | iNextInt2))) * (-519)) + (((~(iNextInt2 | (-26757539))) | 30188348) * 519);
                    int i29 = (i28 << 13) ^ i28;
                    int i30 = i29 ^ (i29 >>> 17);
                    ((int[]) objArr16[3])[0] = i30 ^ (i30 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[1];
                    if (strArr != null) {
                        int i31 = b + 85;
                        TuitionPaymentFragmentbindingInflater1 = i31 % 128;
                        int i32 = i31 % 2;
                        int i33 = 0;
                        while (i33 < strArr.length) {
                            arrayList.add(strArr[i33]);
                            i33++;
                            int i34 = TuitionPaymentFragmentbindingInflater1 + 21;
                            b = i34 % 128;
                            int i35 = i34 % 2;
                        }
                    }
                    Toast.makeText((Context) null, i23 / (((i23 - 1) * i23) % 2), 0).show();
                    Object[] objArr17 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i36 = ((int[]) objArr[3])[0];
                    int i37 = ((int[]) objArr[2])[0];
                    int i38 = ((int[]) objArr[0])[0];
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i39 = ~elapsedCpuTime;
                    int i40 = (~((-831570428) | i39)) | 8421786;
                    int i41 = ~(elapsedCpuTime | (-4990977));
                    int i42 = i36 + (-63799915) + ((i40 | i41) * (-502)) + ((i41 | (~(i39 | (-823148642)))) * TypedValues.PositionType.TYPE_DRAWPATH);
                    int i43 = (i42 << 13) ^ i42;
                    int i44 = i43 ^ (i43 >>> 17);
                    ((int[]) objArr17[3])[0] = i44 ^ (i44 << 5);
                }
                NotificationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj2);
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
            private static java.lang.String $$e(short r7, short r8, int r9) {
                /*
                    byte[] r0 = defpackage.launchBrowserSiteSettings.$$c
                    int r9 = r9 * 56
                    int r9 = 122 - r9
                    int r8 = r8 * 3
                    int r8 = 1 - r8
                    int r7 = r7 * 2
                    int r7 = 4 - r7
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r9 = r7
                    r3 = r8
                    r4 = r2
                    goto L2a
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    if (r4 != r8) goto L25
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L25:
                    r3 = r0[r7]
                    r6 = r9
                    r9 = r7
                    r7 = r6
                L2a:
                    int r3 = -r3
                    int r7 = r7 + r3
                    int r9 = r9 + 1
                    r3 = r4
                    r6 = r9
                    r9 = r7
                    r7 = r6
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.launchBrowserSiteSettings.$$e(short, short, int):java.lang.String");
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() throws Exception {
        int i = 2 % 2;
        int i2 = cancelAll + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder.remove();
        super.onDestroy();
        int i4 = onTransact + 25;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        int i = 0;
        NotificationActivity notificationActivity = (NotificationActivity) objArr[0];
        int i2 = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int iAxisFromString = MotionEvent.axisFromString("") + 1032;
            int iMyTid = (Process.myTid() >> 22) + 15;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            c(b3, (short) (b3 | 141), b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iAxisFromString, iMyTid, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{38959, 53317, 28814, 8802, 56081, 19986, 835, 40529, 26717, 32139, 53173, 14256, 9896, 59262, 25967, 13620, 58932, 22466, 30273, 2934, 41849, 35018, 64425, 45667}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{35574, 55611, 761, 58948, 53845, 49814, 62890, 46582, 7872, 9531, 53156, 38870, 62456, 8534, 60634, 33142, 58426, 26211}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int iGreen = 1031 - Color.green(0);
            int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte b4 = $$a[7];
            byte b5 = b4;
            Object[] objArr6 = new Object[1];
            c(b5, (short) (b5 | 89), b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iGreen, scrollBarFadeDuration, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRed = (char) Color.red(0);
                int iArgb = Color.argb(0, 0, 0, 0) + 1031;
                int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
                Object[] objArr7 = new Object[1];
                c((byte) 52, (short) 37, $$a[132], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, iArgb, iIndexOf, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr8[3])[0];
            int i4 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i5 = ((1076289767 + (((-319908739) | (~startUptimeMillis)) * (-490))) + (((~(startUptimeMillis | 216170620)) | (-536079359)) * 490)) - 1915039876;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr2[2])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{12380, 39176, 22412, 20746, 32251, 55376, 28547, 47025, 51948, 11522, 10715, 12692, 1218, 1869, 23193, 6392, 41601, 45656}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{45731, 29787, 41787, 52516, 2069, 18461, 60442, 31348, 28096, 54523, 52131, 50287, 6054, 1778, 44528, 10101, 28136, 8279}, TextUtils.getOffsetBefore("", 0) + 16, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, notificationActivity)).intValue();
            try {
                Object[] objArr11 = {-316918895};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 46038), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1134, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 367548322, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i8 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
                    int i9 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr13 = new Object[1];
                    c(b7, (short) (b7 | 141), b6, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i8, i9, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45994), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1117, 17 - (Process.myPid() >> 22)), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                    Object[] objArr14 = new Object[1];
                    c((byte) 52, (short) 37, $$a[132], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore, pressedStateDuration, minimumFlingVelocity, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{38959, 53317, 28814, 8802, 56081, 19986, 835, 40529, 26717, 32139, 53173, 14256, 9896, 59262, 25967, 13620, 58932, 22466, 30273, 2934, 41849, 35018, 64425, 45667}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{35574, 55611, 761, 58948, 53845, 49814, 62890, 46582, 7872, 9531, 53156, 38870, 62456, 8534, 60634, 33142, 58426, 26211}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_offers).substring(9, 10).length() + 14, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1032;
                        int i10 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr17 = new Object[1];
                        c(b9, (short) (b9 | 89), b8, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, iIndexOf2, i10, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int i11 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int gidForName = 14 - Process.getGidForName("");
                        byte b10 = $$a[7];
                        byte b11 = b10;
                        Object[] objArr18 = new Object[1];
                        c(b11, (short) (b11 | 141), b10, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(modifierMetaStateMask, i11, gidForName, 1357589585, false, (String) objArr18[0], null);
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
        int i12 = ((int[]) objArr2[1])[0];
        int i13 = ((int[]) objArr2[3])[0];
        if (i13 == i12) {
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i14 = ((int[]) objArr2[2])[0];
            int i15 = ((int[]) objArr2[3])[0];
            int i16 = ((int[]) objArr2[1])[0];
            String[] strArr2 = (String[]) objArr2[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i17 = (~(703853755 | iFreeMemory)) | 268435460;
            int i18 = ~iFreeMemory;
            int i19 = i14 + 1849552429 + ((i17 | (~((-24155291) | i18))) * 886) + (((~(i18 | (-703853756))) | 948133925) * (-1772)) + ((~(i18 | 948133925)) * 886);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr19[2])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr2[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    int i22 = onTransact + 123;
                    cancelAll = i22 % 128;
                    int i23 = i22 % 2;
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr2[2])[0];
            int i25 = ((int[]) objArr2[3])[0];
            int i26 = ((int[]) objArr2[1])[0];
            String[] strArr4 = (String[]) objArr2[0];
            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
            int i27 = ~startUptimeMillis2;
            int i28 = i24 + (-1236714119) + ((~(495437247 | i27)) * (-560)) + ((~(startUptimeMillis2 | 536862719)) * (-560)) + (((~((-251157078) | i27)) | 209731605) * 560);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr20[2])[0] = i30 ^ (i30 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c3 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
            int i31 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int iIndexOf3 = TextUtils.indexOf("", "", 0) + 23;
            Object[] objArr21 = new Object[1];
            c((byte) ($$b | 7), (short) 37, $$a[7], objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, i31, iIndexOf3, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c4 = (char) (29944 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                int iKeyCodeFromString = 1755 - KeyEvent.keyCodeFromString("");
                int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
                byte b12 = $$a[7];
                byte b13 = b12;
                Object[] objArr22 = new Object[1];
                c(b13, (short) (b13 | 89), b12, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c4, iKeyCodeFromString, modifierMetaStateMask2, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int iNextInt = new Random().nextInt();
            int i32 = ~iNextInt;
            int i33 = (-653823196) + (((~((-9107557) | i32)) | (~((-203494870) | iNextInt))) * 217) + (((~(iNextInt | (-9107557))) | 4164) * 217) + (((~((-203494870) | i32)) | 9107556) * 217) + 293194929;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            e(new char[]{12380, 39176, 22412, 20746, 32251, 55376, 28547, 47025, 51948, 11522, 10715, 12692, 1218, 1869, 23193, 6392, 41601, 45656}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.offer_not_applied).substring(8, 9).length() + 15, objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            e(new char[]{45731, 29787, 41787, 52516, 2069, 18461, 60442, 31348, 28096, 54523, 52131, 50287, 6054, 1778, 44528, 10101, 28136, 8279}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.telkomsel_instruction_step1).substring(30, 32).length() + 14, objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, notificationActivity)).intValue();
            Object[] objArr26 = {-316918895};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 42050), Color.green(0) + 1726, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), 293194929);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char modifierMetaStateMask3 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 29945);
                int bitsPerPixel = 1754 - ImageFormat.getBitsPerPixel(0);
                int iAlpha = Color.alpha(0) + 23;
                byte b14 = $$a[7];
                byte b15 = b14;
                Object[] objArr27 = new Object[1];
                c(b15, (short) (b15 | 89), b14, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(modifierMetaStateMask3, bitsPerPixel, iAlpha, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
            try {
                Object[] objArr28 = new Object[1];
                e(new char[]{38959, 53317, 28814, 8802, 56081, 19986, 835, 40529, 26717, 32139, 53173, 14256, 9896, 59262, 25967, 13620, 58932, 22466, 30273, 2934, 41849, 35018, 64425, 45667}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new char[]{35574, 55611, 761, 58948, 53845, 49814, 62890, 46582, 7872, 9531, 53156, 38870, 62456, 8534, 60634, 33142, 58426, 26211}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                    int iIndexOf4 = 1755 - TextUtils.indexOf("", "", 0);
                    int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                    byte b16 = $$a[7];
                    short s = b16;
                    Object[] objArr30 = new Object[1];
                    c(b16, s, (byte) s, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(pressedStateDuration2, iIndexOf4, scrollBarFadeDuration2, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char capsMode = (char) (29944 - TextUtils.getCapsMode("", 0, 0));
                    int iIndexOf5 = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int iRed = Color.red(0) + 23;
                    Object[] objArr31 = new Object[1];
                    c((byte) ($$b | 7), (short) 37, $$a[7], objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(capsMode, iIndexOf5, iRed, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i37 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i37 != i36) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr5 != null) {
                int i38 = onTransact + 63;
                cancelAll = i38 % 128;
                int i39 = i38 % 2;
                while (i < strArr5.length) {
                    int i40 = onTransact + 9;
                    cancelAll = i40 % 128;
                    if (i40 % 2 == 0) {
                        arrayList2.add(strArr5[i]);
                        i += 104;
                    } else {
                        arrayList2.add(strArr5[i]);
                        i++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i37));
        }
        int i41 = onTransact + 79;
        cancelAll = i41 % 128;
        int i42 = i41 % 2;
        int i43 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int i44 = ~((int) Process.getStartElapsedRealtime());
        int i45 = i43 + ((((~((-842806907) | i44)) | 304879162) * (-241)) - 1604072290) + (((~(i44 | (-537927745))) | (-935083643)) * 241);
        int i46 = (i45 << 13) ^ i45;
        int i47 = i46 ^ (i46 >>> 17);
        ((int[]) objArr32[3])[0] = i47 ^ (i47 << 5);
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != 502689190 + ((592962679 | i5) * (-757)) + ((~(2010644351 | iIdentityHashCode)) * 1514) + (((~(iIdentityHashCode | (-1417681673))) | (~(i5 | 1422950222)) | 587694129) * 757)) {
            throw null;
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        if (i6 != 346024308 + (((~startUptimeMillis) | 474039648) * 1324) + (((~(startUptimeMillis | 1548974064)) | (~(1030081900 | startUptimeMillis))) * (-1324)) + 1669762920) {
            throw null;
        }
        super.onStart();
        int i7 = cancelAll + 41;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1034757528;
        int i4 = ~i3;
        int i5 = (-1829464504) + (((~((-648767651) | i4)) | 646670466 | (~(1478755193 | i4)) | (~((-1476658010) | i3))) * (-84));
        int i6 = (~(i3 | 1478755193)) | 648767650;
        int i7 = ~(i4 | (-1478755194));
        if (i2 != i5 + ((i6 | i7) * (-84)) + ((1476658009 | i7) * 84)) {
            int i8 = onTransact + 13;
            cancelAll = i8 % 128;
            int i9 = i8 % 2;
            int[] iArr = new int[1976667340];
            iArr[1976667339] = 1;
            int i10 = 884356548 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i11 = cancelAll + 81;
            onTransact = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i14 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i15 = ~i14;
        if (i13 == 98148606 + ((~(1861333660 | i15)) * 979) + ((i14 | 145422329) * (-979)) + (((~(i14 | 1861333660)) | (~(i15 | 145422329))) * 979)) {
            super.onCreate(bundle);
        } else {
            int i16 = (-766758912) % 2;
            throw new ArithmeticException();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NotificationActivity notificationActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
        notificationActivity.asInterface = 1;
        notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        notificationActivity.d = true;
        ((PackageIdentityUtilsSignaturesCompat) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b(notificationActivity.asInterface);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 123;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ PackageIdentityUtils TuitionPaymentFragmentspecialinlinedviewModeldefault1(final NotificationActivity notificationActivity) {
        int i = 2 % 2;
        PackageIdentityUtils packageIdentityUtils = new PackageIdentityUtils(notificationActivity, null, new Function1() { // from class: getServiceWrapper
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationActivity.b(this.b, (Notification) obj);
            }
        }, 2, null);
        int i2 = cancelAll + 75;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return packageIdentityUtils;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(NotificationActivity notificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws IOException {
        String str;
        int i = 2 % 2;
        int i2 = onTransact + 57;
        int i3 = i2 % 128;
        cancelAll = i3;
        int i4 = i2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            notificationActivity.MediaBrowserCompat();
            str = "loading_delete_notification_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i5 = i3 + 109;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            notificationActivity.IconCompatParcelizer();
            notificationActivity.asInterface = 1;
            notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            PackageIdentityUtils packageIdentityUtils = (PackageIdentityUtils) notificationActivity.TuitionPaymentFragmentbindingInflater1.getValue();
            Camera2CameraControl camera2CameraControl = packageIdentityUtils.f253a;
            camera2CameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = camera2CameraControl.b;
            camera2CameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            camera2CameraControl.TuitionPaymentFragmentbindingInflater1 = true;
            packageIdentityUtils.asInterface.addOnScrollListener(packageIdentityUtils.f253a);
            ((PackageIdentityUtilsSignaturesCompat) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b(notificationActivity.asInterface);
            if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                int i7 = cancelAll + 21;
                onTransact = i7 % 128;
                if (i7 % 2 != 0) {
                    getContentPaddingRight.b("Notification deleted successfully", new Object[0]);
                } else {
                    getContentPaddingRight.b("Notification deleted successfully", new Object[0]);
                }
            }
            str = "success_delete_notification_result";
        } else if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            str = "";
        } else {
            notificationActivity.IconCompatParcelizer();
            if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                int i8 = onTransact + 9;
                cancelAll = i8 % 128;
                if (i8 % 2 == 0) {
                    getContentPaddingRight.b("Failed to delete notification: ".concat(String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2)), new Object[0]);
                } else {
                    getContentPaddingRight.b("Failed to delete notification: ".concat(String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2)), new Object[0]);
                }
            }
            if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                int i9 = cancelAll + 73;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                getContentPaddingRight.b("Failed to delete notification", new Object[0]);
                int i11 = onTransact + 33;
                cancelAll = i11 % 128;
                int i12 = i11 % 2;
            }
            str = "failure_delete_notification_result";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_delete_notification_result", str));
        Intrinsics.checkNotNullParameter(notificationActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[Catch: Exception -> 0x0153, TRY_ENTER, TryCatch #0 {Exception -> 0x0153, blocks: (B:8:0x0025, B:11:0x002b, B:13:0x0050, B:17:0x0056, B:18:0x00ce, B:21:0x00e5, B:25:0x0118, B:22:0x00f6, B:24:0x0113), top: B:39:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:22:0x00f6 A[Catch: Exception -> 0x0153, TryCatch #0 {Exception -> 0x0153, blocks: (B:8:0x0025, B:11:0x002b, B:13:0x0050, B:17:0x0056, B:18:0x00ce, B:21:0x00e5, B:25:0x0118, B:22:0x00f6, B:24:0x0113), top: B:39:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0113 A[Catch: Exception -> 0x0153, TryCatch #0 {Exception -> 0x0153, blocks: (B:8:0x0025, B:11:0x002b, B:13:0x0050, B:17:0x0056, B:18:0x00ce, B:21:0x00e5, B:25:0x0118, B:22:0x00f6, B:24:0x0113), top: B:39:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws IOException {
        copyNotificationOntoChannel copynotificationontochannelTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        FragmentManager supportFragmentManager;
        User userAsBinder;
        String str;
        final NotificationActivity notificationActivity = (NotificationActivity) objArr[0];
        Notification notification = (Notification) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 105;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(notification, "");
        if (i3 == 0) {
            int i4 = 96 / 0;
            if (notification != null) {
                try {
                    if (!notification.isRead) {
                        final PackageIdentityUtilsSignaturesCompat packageIdentityUtilsSignaturesCompat = (PackageIdentityUtilsSignaturesCompat) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                        String str2 = notification.notificationCode;
                        Intrinsics.checkNotNullParameter(str2, "");
                        MutableLiveData<VirtualCameraAdapter1<getDefaultDarkScrimannotations>> mutableLiveData = packageIdentityUtilsSignaturesCompat.d;
                        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                        NotificationActionRequest notificationActionRequest = new NotificationActionRequest(str2);
                        userAsBinder = packageIdentityUtilsSignaturesCompat.asInterface.asBinder();
                        if (userAsBinder != null || (str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
                            str = "";
                        }
                        notificationActionRequest.setEmail(str);
                        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(packageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.readNotification(notificationActionRequest)));
                        final Function1 function1 = new Function1() { // from class: TokenContents
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PackageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentbindingInflater1(packageIdentityUtilsSignaturesCompat, (getDefaultDarkScrimannotations) obj);
                            }
                        };
                        logToString logtostring = new logToString() { // from class: r8lambdaCBVg26zUpxC1pz1KzAQxDAVlyy0
                            @Override // defpackage.logToString
                            public final void accept(Object obj) {
                                function1.invoke(obj);
                            }
                        };
                        final Function1 function2 = new Function1() { // from class: getImpl
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PackageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(packageIdentityUtilsSignaturesCompat, (Throwable) obj);
                            }
                        };
                        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: serialize
                            @Override // defpackage.logToString
                            public final void accept(Object obj) {
                                function2.invoke(obj);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                        packageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("notification_code", notification.notificationCode), new Pair("notification_type", notification.type));
                        Intrinsics.checkNotNullParameter(notificationActivity, "");
                        Intrinsics.checkNotNullParameter("read_notification", "");
                        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                        Intrinsics.checkNotNullParameter("read_notification", "");
                        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("read_notification", mapMutableMapOf);
                    }
                    if (Intrinsics.areEqual(notification.type, NotificationType.ESURVEY.getType())) {
                        int i5 = onTransact + 111;
                        cancelAll = i5 % 128;
                        int i6 = i5 % 2;
                        NotificationActivity notificationActivity2 = notificationActivity;
                        String str3 = notification.message;
                        Intrinsics.checkNotNullParameter(notificationActivity2, "");
                        Intrinsics.checkNotNullParameter(str3, "");
                        WebviewFaqCustomActivity.Companion companion2 = WebviewFaqCustomActivity.INSTANCE;
                        WebviewFaqCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(notificationActivity2, str3, "");
                    } else {
                        copyNotificationOntoChannel.Companion bVar = copyNotificationOntoChannel.INSTANCE;
                        copynotificationontochannelTuitionPaymentFragmentspecialinlinedviewModeldefault3 = copyNotificationOntoChannel.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(notification, new Function1() { // from class: ConnectionHolderWrapperFactory
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Notification) obj);
                            }
                        });
                        supportFragmentManager = notificationActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                        if (supportFragmentManager.findFragmentByTag(copynotificationontochannelTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            copynotificationontochannelTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(supportFragmentManager, copynotificationontochannelTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }
                    Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("notification_type", notification.type), new Pair("notification_read_status", String.valueOf(notification.isRead)));
                    Intrinsics.checkNotNullParameter(notificationActivity, "");
                    Intrinsics.checkNotNullParameter("notification_clicked", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                    TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                    Intrinsics.checkNotNullParameter("notification_clicked", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("notification_clicked", mapMutableMapOf2);
                } catch (Exception e2) {
                    if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                        getContentPaddingRight.b("Error handling notification click: ".concat(String.valueOf(e2.getMessage())), new Object[0]);
                    }
                    if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                        int i7 = cancelAll + 111;
                        onTransact = i7 % 128;
                        if (i7 % 2 != 0) {
                            getContentPaddingRight.b("Unable to open notification", new Object[0]);
                        } else {
                            getContentPaddingRight.b("Unable to open notification", new Object[0]);
                        }
                    }
                }
            }
        } else if (notification != null) {
            if (!notification.isRead) {
                final PackageIdentityUtilsSignaturesCompat packageIdentityUtilsSignaturesCompat2 = (PackageIdentityUtilsSignaturesCompat) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                String str4 = notification.notificationCode;
                Intrinsics.checkNotNullParameter(str4, "");
                MutableLiveData<VirtualCameraAdapter1<getDefaultDarkScrimannotations>> mutableLiveData2 = packageIdentityUtilsSignaturesCompat2.d;
                VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                NotificationActionRequest notificationActionRequest2 = new NotificationActionRequest(str4);
                userAsBinder = packageIdentityUtilsSignaturesCompat2.asInterface.asBinder();
                if (userAsBinder != null) {
                    str = "";
                } else {
                    str = "";
                }
                notificationActionRequest2.setEmail(str);
                deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(packageIdentityUtilsSignaturesCompat2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.readNotification(notificationActionRequest2)));
                final Function1 function3 = new Function1() { // from class: TokenContents
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PackageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentbindingInflater1(packageIdentityUtilsSignaturesCompat2, (getDefaultDarkScrimannotations) obj);
                    }
                };
                logToString logtostring2 = new logToString() { // from class: r8lambdaCBVg26zUpxC1pz1KzAQxDAVlyy0
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function3.invoke(obj);
                    }
                };
                final Function1 function4 = new Function1() { // from class: getImpl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PackageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(packageIdentityUtilsSignaturesCompat2, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: serialize
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function4.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                packageIdentityUtilsSignaturesCompat2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("notification_code", notification.notificationCode), new Pair("notification_type", notification.type));
                Intrinsics.checkNotNullParameter(notificationActivity, "");
                Intrinsics.checkNotNullParameter("read_notification", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("read_notification", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("read_notification", mapMutableMapOf3);
            }
            if (Intrinsics.areEqual(notification.type, NotificationType.ESURVEY.getType())) {
                int i8 = onTransact + 111;
                cancelAll = i8 % 128;
                int i9 = i8 % 2;
                NotificationActivity notificationActivity3 = notificationActivity;
                String str5 = notification.message;
                Intrinsics.checkNotNullParameter(notificationActivity3, "");
                Intrinsics.checkNotNullParameter(str5, "");
                WebviewFaqCustomActivity.Companion companion4 = WebviewFaqCustomActivity.INSTANCE;
                WebviewFaqCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(notificationActivity3, str5, "");
            } else {
                copyNotificationOntoChannel.Companion bVar2 = copyNotificationOntoChannel.INSTANCE;
                copynotificationontochannelTuitionPaymentFragmentspecialinlinedviewModeldefault3 = copyNotificationOntoChannel.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(notification, new Function1() { // from class: ConnectionHolderWrapperFactory
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Notification) obj);
                    }
                });
                supportFragmentManager = notificationActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(copynotificationontochannelTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    copynotificationontochannelTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(supportFragmentManager, copynotificationontochannelTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            Map<String, Object> mapMutableMapOf4 = MapsKt.mutableMapOf(new Pair("notification_type", notification.type), new Pair("notification_read_status", String.valueOf(notification.isRead)));
            Intrinsics.checkNotNullParameter(notificationActivity, "");
            Intrinsics.checkNotNullParameter("notification_clicked", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf4, "");
            TargetAspectRatio targetAspectRatio4 = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("notification_clicked", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf4, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("notification_clicked", mapMutableMapOf4);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(NotificationActivity notificationActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.g();
        try {
            notificationActivity.asInterface = 1;
            notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            PackageIdentityUtils packageIdentityUtils = (PackageIdentityUtils) notificationActivity.TuitionPaymentFragmentbindingInflater1.getValue();
            Camera2CameraControl camera2CameraControl = packageIdentityUtils.f253a;
            camera2CameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = camera2CameraControl.b;
            camera2CameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            camera2CameraControl.TuitionPaymentFragmentbindingInflater1 = true;
            packageIdentityUtils.asInterface.addOnScrollListener(packageIdentityUtils.f253a);
            ((PackageIdentityUtilsSignaturesCompat) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b(notificationActivity.asInterface);
            ViewPortBuilder.asBinder();
            int i4 = onTransact + 119;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.asBinder();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(NotificationActivity notificationActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 87;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            ((PackageIdentityUtils) notificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i3 = 29 / 0;
        } else {
            ((PackageIdentityUtils) notificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
        int i4 = onTransact + 85;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void b(NotificationActivity notificationActivity, List list) throws IOException {
        int i = 2 % 2;
        int i2 = cancelAll + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        PackageIdentityUtils packageIdentityUtils = (PackageIdentityUtils) notificationActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        packageIdentityUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault2.clear();
        packageIdentityUtils.notifyDataSetChanged();
        ((PackageIdentityUtils) notificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).b(list);
        notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2((List<Notification>) list);
        int i4 = cancelAll + 83;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(NotificationActivity notificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = cancelAll + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ((PackageIdentityUtils) notificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1();
        ((PackageIdentityUtils) notificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i4 = onTransact + 111;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NotificationActivity notificationActivity, Notification notification) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(notification, "");
        final PackageIdentityUtilsSignaturesCompat packageIdentityUtilsSignaturesCompat = (PackageIdentityUtilsSignaturesCompat) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        String str2 = notification.notificationCode;
        Intrinsics.checkNotNullParameter(str2, "");
        MutableLiveData<VirtualCameraAdapter1<getDefaultDarkScrimannotations>> mutableLiveData = packageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        NotificationActionRequest notificationActionRequest = new NotificationActionRequest(str2);
        User userAsBinder = packageIdentityUtilsSignaturesCompat.asInterface.asBinder();
        if (userAsBinder == null || (str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
            int i2 = onTransact + 77;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        } else {
            int i4 = cancelAll + 85;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        notificationActionRequest.setEmail(str);
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(packageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.deleteNotification(notificationActionRequest)));
        final Function1 function1 = new Function1() { // from class: createToken
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PackageIdentityUtilsSignaturesCompat.b(packageIdentityUtilsSignaturesCompat, (getDefaultDarkScrimannotations) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: compareByteArrays
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: TokenContentsExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PackageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(packageIdentityUtilsSignaturesCompat, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: parseIfNeeded
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        packageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("notification_code", notification.notificationCode), new Pair("notification_type", notification.type));
        Intrinsics.checkNotNullParameter(notificationActivity, "");
        Intrinsics.checkNotNullParameter("delete_notification", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("delete_notification", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("delete_notification", mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(NotificationActivity notificationActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        ((PackageIdentityUtils) notificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).b();
        int i4 = cancelAll + 3;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void g(NotificationActivity notificationActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        ((PackageIdentityUtils) notificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).g();
        int i4 = cancelAll + 33;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws IOException {
        String str;
        final NotificationActivity notificationActivity = (NotificationActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 61;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        notificationActivity.d = false;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            MultiStateView multiStateView = ((ActivityNotificationBinding) ((ViewBinding) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvNotification;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            int i5 = onTransact + 33;
            cancelAll = i5 % 128;
            int i6 = i5 % 2;
            str = "loading_view_notification_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            ((ActivityNotificationBinding) ((ViewBinding) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlNotification.setRefreshing(false);
            MultiStateView multiStateView2 = ((ActivityNotificationBinding) ((ViewBinding) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvNotification;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            final List list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                ((ActivityNotificationBinding) ((ViewBinding) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvNotification.post(new Runnable() { // from class: ConnectionHolderExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        NotificationActivity.b(this.b, list);
                    }
                });
                int i7 = onTransact + 87;
                cancelAll = i7 % 128;
                int i8 = i7 % 2;
            } catch (Exception e2) {
                if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                    getContentPaddingRight.b("Error handling notification success: ".concat(String.valueOf(e2.getMessage())), new Object[0]);
                }
                notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2, "Failed to display notifications");
            }
            str = "success_view_notification_result";
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault3))) {
            ((ActivityNotificationBinding) ((ViewBinding) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlNotification.setRefreshing(false);
            MultiStateView multiStateView3 = ((ActivityNotificationBinding) ((ViewBinding) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvNotification;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            multiStateView3.setViewState(MultiStateView.ViewState.EMPTY);
            ((PackageIdentityUtilsSignaturesCompat) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.saveBoolean("unread_notif", false);
            str = "empty_view_notification_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i9 = i2 + 117;
            cancelAll = i9 % 128;
            int i10 = i9 % 2;
            ((ActivityNotificationBinding) ((ViewBinding) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlNotification.setRefreshing(false);
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            str = "failure_view_notification_result";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_view_notification_result", str), new Pair("current_page", String.valueOf(notificationActivity.asInterface)), new Pair("retry_attempts", String.valueOf(notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2)));
        Intrinsics.checkNotNullParameter(notificationActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws IOException {
        NotificationActivity notificationActivity = (NotificationActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i2 = onTransact + 41;
                cancelAll = i2 % 128;
                int i3 = i2 % 2;
                if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                    getContentPaddingRight.b("Notification marked as read", new Object[0]);
                }
                ((PackageIdentityUtils) notificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).notifyDataSetChanged();
                return null;
            }
            if ((virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                int i4 = cancelAll + 37;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                getContentPaddingRight.b("Failed to mark notification as read: ".concat(String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2)), new Object[0]);
            }
        }
        int i6 = cancelAll + 45;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public static /* synthetic */ Unit d(NotificationActivity notificationActivity) throws IOException {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        notificationActivity.g();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 57;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void b(final NotificationActivity notificationActivity, final VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = cancelAll + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        notificationActivity.d = false;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            ((ActivityNotificationBinding) ((ViewBinding) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvNotification.post(new Runnable() { // from class: FutureUtils
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationActivity.g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            });
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            ((ActivityNotificationBinding) ((ViewBinding) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvNotification.post(new Runnable() { // from class: NotificationApiHelperForM
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, virtualCameraAdapter1);
                }
            });
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ((ActivityNotificationBinding) ((ViewBinding) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvNotification.post(new Runnable() { // from class: ConnectionHolder
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                });
            }
        } else {
            ((ActivityNotificationBinding) ((ViewBinding) notificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvNotification.post(new Runnable() { // from class: launchAsTrustedWebActivity
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            });
            int i4 = cancelAll + 25;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ Unit b(NotificationActivity notificationActivity, Notification notification) {
        return (Unit) b(new Object[]{notificationActivity, notification}, 328690834, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -328690829, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    static {
        RemoteActionCompatParcelizer = 0;
        d();
        INSTANCE = new Companion(null);
        int i = getInterfaceDescriptor + 125;
        RemoteActionCompatParcelizer = i % 128;
        if (i % 2 != 0) {
            int i2 = 35 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() throws IllegalAccessException {
        b(new Object[]{this}, 844373990, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima4_permata).substring(19, 20).codePointAt(0) + 852585322, -844373988, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 145688086, ProgramType.b.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws IllegalAccessException {
        b(new Object[]{this}, -593724707, ProgramType.b.TuitionPaymentFragmentbindingInflater1(), (-1911357714) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_content_desc_image).substring(0, 5).codePointAt(0), 593724707, ProgramType.b.TuitionPaymentFragmentbindingInflater1(), ProgramType.b.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        b(new Object[]{this}, -893200683, ProgramType.b.TuitionPaymentFragmentbindingInflater1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 893200686, ProgramType.b.TuitionPaymentFragmentbindingInflater1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancelAll + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = cancelAll + 31;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws IllegalAccessException {
        b(new Object[]{this, context}, 865447312, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_method_empty).substring(5, 7).codePointAt(1) - 1561536863, ProgramType.b.TuitionPaymentFragmentbindingInflater1(), -865447306, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    static void d() {
        f572a = (char) 20705;
        INotificationSideChannel = (char) 21835;
        notify = (char) 30691;
        cancel = (char) 26755;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r5, int r6, short r7) {
        /*
            byte[] r0 = com.bpjstku.presentation.notification.NotificationActivity.$$c
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r5 = r5 + 4
            int r7 = r7 * 3
            int r7 = 108 - r7
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L14
            r7 = r5
            r3 = r6
            goto L29
        L14:
            r4 = r7
            r7 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            int r7 = r7 + 1
            r1[r2] = r3
            if (r2 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L27:
            r3 = r0[r7]
        L29:
            int r3 = -r3
            int r5 = r5 + r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.notification.NotificationActivity.$$i(byte, int, short):java.lang.String");
    }
}
