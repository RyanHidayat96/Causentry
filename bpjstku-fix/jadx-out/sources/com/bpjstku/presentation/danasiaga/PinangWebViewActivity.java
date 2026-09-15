package com.bpjstku.presentation.danasiaga;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.net.MailTo;
import com.bpjstku.R;
import com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda16;
import com.bpjstku.databinding.ActivityPinangWebviewBinding;
import com.bpjstku.presentation.danasiaga.PinangWebViewActivity;
import com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1;
import defpackage.AutoValue_ImmutableZoomState;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.CameraUseCaseAdapter;
import defpackage.ImmediateFutureImmediateFailedScheduledFuture;
import defpackage.ListFuture2;
import defpackage.OutputConfigurationCompatApi28Impl;
import defpackage.ViewPortBuilder;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.callAllGets;
import defpackage.initSession;
import defpackage.outputFormatToAudioProfile;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\t8\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR$\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0016\u0018\u00010\u001e8\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\t8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u0015\u0010&\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b$\u0010%R\u0015\u0010)\u001a\u00020'8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010\"\u001a\u00020*8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b&\u0010+"}, d2 = {"Lcom/bpjstku/presentation/danasiaga/PinangWebViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/view/KeyEvent;", "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Landroid/view/MenuItem;", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "[Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "I", "TuitionPaymentFragmentbindingInflater1", "b", "Landroid/webkit/ValueCallback;", "Landroid/net/Uri;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Landroid/webkit/ValueCallback;", "g", "LoutputFormatToAudioProfile;", "asBinder", "Lkotlin/Lazy;", "a", "LacquireBuffer;", "d", "asInterface", "Lcom/bpjstku/databinding/ActivityPinangWebviewBinding;", "Lcom/bpjstku/databinding/ActivityPinangWebviewBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PinangWebViewActivity extends AppCompatActivity {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int asInterface;
    private static int cancelAll;
    private static int notify;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    ValueCallback<Uri[]> b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ActivityPinangWebviewBinding g;
    private static final byte[] $$c = {51, -5, 77, 89};
    private static final int $$f = 196;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public String[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    final int TuitionPaymentFragmentbindingInflater1 = 100;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 11;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy a = LazyKt.lazy(new Function0() { // from class: closeMenuOnSubMenuOpened
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PinangWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy asInterface = LazyKt.lazy(new PinangWebViewActivity$special$$inlined$inject$default$1(this));

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = i7 | i3;
        int i10 = (~(i7 | i8)) | (~i9) | (~(i8 | i3));
        int i11 = (~(i6 | i3)) | (~(i7 | i6));
        int i12 = i9 | i8;
        int i13 = i3 + i2 + i4 + (988256597 * i5) + ((-695401848) * i);
        int i14 = i13 * i13;
        int i15 = (((-880163897) * i3) - 1270611968) + ((-1462879173) * i2) + (i10 * 291357638) + (291357638 * i11) + ((-291357638) * i12) + ((-1171521536) * i4) + (479985664 * i5) + (1063256064 * i) + (1273561088 * i14);
        int i16 = (i3 * (-1367684995)) + 376186498 + (i2 * (-1367684423)) + (i10 * (-286)) + (i11 * (-286)) + (i12 * 286) + (i4 * (-1367684709)) + (i5 * 1512018807) + (i * 1127043160) + (i14 * (-418185216));
        return i15 + ((i16 * i16) * 1903099904) != 1 ? b(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001e -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = 207 - r7
            int r0 = r5 + 1
            int r6 = r6 + 84
            byte[] r1 = com.bpjstku.presentation.danasiaga.PinangWebViewActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L10
            r4 = r5
            r3 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L1e
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L1e:
            r4 = r1[r7]
            int r3 = r3 + 1
        L22:
            int r4 = -r4
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.PinangWebViewActivity.e(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 67
            int r9 = 93 - r9
            int r8 = 451 - r8
            byte[] r0 = com.bpjstku.presentation.danasiaga.PinangWebViewActivity.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r5 = r2
            goto L26
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L26:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-3)
            int r8 = r3 + 1
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.PinangWebViewActivity.f(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.danasiaga.PinangWebViewActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/danasiaga/PinangWebViewActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "b", "(Landroid/content/Context;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) PinangWebViewActivity.class);
            intent.putExtra("KEY_URL", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0162  */
    /* JADX WARN: Code duplicated, block: B:38:0x0163  */
    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        long j;
        char[] cArr2;
        Throwable cause;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            j = 0;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i5]), Integer.valueOf(asInterface)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), 3291 - ExpandableListView.getPackedPositionGroup(0L), (Process.myTid() >> 22) + 31, 1199271174, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", ""), 651 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 44, -450685997, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i6 = $11 + 1;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 650 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), 44 - Color.red(0), -450685997, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                j = 0;
            }
            int i7 = $11 + 125;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends WebChromeClient {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(valueCallback, "");
            Intrinsics.checkNotNullParameter(fileChooserParams, "");
            if (PinangWebViewActivity.this.b != null) {
                ValueCallback<Uri[]> valueCallback2 = PinangWebViewActivity.this.b;
                Intrinsics.checkNotNull(valueCallback2);
                valueCallback2.onReceiveValue(null);
                PinangWebViewActivity.this.b = null;
            }
            PinangWebViewActivity.this.b = valueCallback;
            Intent intentCreateIntent = fileChooserParams.createIntent();
            intentCreateIntent.addCategory("android.intent.category.OPENABLE");
            intentCreateIntent.setType("*/*");
            try {
                PinangWebViewActivity pinangWebViewActivity = PinangWebViewActivity.this;
                Intrinsics.checkNotNull(intentCreateIntent);
                pinangWebViewActivity.startActivityForResult(intentCreateIntent, PinangWebViewActivity.this.TuitionPaymentFragmentbindingInflater1);
                return true;
            } catch (Exception unused) {
                PinangWebViewActivity.this.b = null;
                return false;
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onPermissionRequest(PermissionRequest permissionRequest) {
            Intrinsics.checkNotNullParameter(permissionRequest, "");
            permissionRequest.grant(permissionRequest.getResources());
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends WebViewClient {
        private /* synthetic */ ActivityPinangWebviewBinding TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityPinangWebviewBinding activityPinangWebviewBinding) {
            this.TuitionPaymentFragmentbindingInflater1 = activityPinangWebviewBinding;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (StringsKt.startsWith$default(str, "tel:", false, 2, (Object) null) || StringsKt.startsWith$default(str, MailTo.MAILTO_SCHEME, false, 2, (Object) null)) {
                webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            webView.loadUrl(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentbindingInflater1.progressBar.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1428424975
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r43) {
        /*
            Method dump skipped, instruction units count: 14390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.PinangWebViewActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        ValueCallback<Uri[]> valueCallback;
        int i = 2 % 2;
        int i2 = onTransact + 11;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        if (p0 != this.TuitionPaymentFragmentbindingInflater1 || (valueCallback = this.b) == null) {
            return;
        }
        int i5 = i3 + 27;
        onTransact = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (valueCallback != null) {
            int i6 = i3 + 105;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(p1, p2));
            } else {
                valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(p1, p2));
                throw null;
            }
        }
        this.b = null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int p0, KeyEvent p1) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0 ? p0 == 4 : p0 == 4) {
            ActivityPinangWebviewBinding activityPinangWebviewBinding = this.g;
            ActivityPinangWebviewBinding activityPinangWebviewBinding2 = null;
            if (activityPinangWebviewBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityPinangWebviewBinding = null;
            }
            if (activityPinangWebviewBinding.browser.canGoBack()) {
                ActivityPinangWebviewBinding activityPinangWebviewBinding3 = this.g;
                if (activityPinangWebviewBinding3 == null) {
                    int i3 = onTransact + 25;
                    INotificationSideChannel = i3 % 128;
                    if (i3 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i4 = 15 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                } else {
                    activityPinangWebviewBinding2 = activityPinangWebviewBinding3;
                }
                activityPinangWebviewBinding2.browser.goBack();
                int i5 = INotificationSideChannel + 119;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        finish();
        return super.onKeyDown(p0, p1);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = INotificationSideChannel + 101;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = onTransact + 73;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 == 0) {
                return zOnOptionsItemSelected;
            }
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = ((Field) ImmediateFutureImmediateFailedScheduledFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i3 = ~new Random().nextInt(1244247962);
        if (i2 != 1612035585 + (((~(i3 | 229672544)) | 1644626206) * (-160)) + (((~(i3 | 1671923486)) | 229672544) * 160)) {
            throw null;
        }
        int i4 = ((Field) ListFuture2.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
        if (i4 != 795786802 + ((~((-33591565) | i5)) * (-301)) + (((~(578862428 | i5)) | (~((~i5) | 631533266))) * (-301)) + (((~(i5 | (-631533267))) | 578862428) * 301)) {
            int i6 = onTransact + 73;
            INotificationSideChannel = i6 % 128;
            if (i6 % 2 != 0) {
                int[] iArr = new int[1056682315];
                iArr[1056682314] = 0;
                int i7 = 954145454 / 2;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[1056682315];
                iArr2[1056682314] = 1;
                int i8 = 954145454 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i9 = ((Field) callAllGets.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1228775459;
        int i11 = ~((-398758216) | i10);
        int i12 = ~i10;
        if (i9 != 1609284151 + ((i11 | (~((-981476872) | i12))) * (-1808)) + (((~((-88379713) | i10)) | (~(i12 | (-671098369)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(i10 | 981476871)) | 310378503 | (~(398758215 | i12))) * TypedValues.Custom.TYPE_BOOLEAN)) {
            throw new RuntimeException("-1507877627");
        }
        int i13 = ((Field) AutoValue_ImmutableZoomState.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i14 = ~((-1828351849) | iIdentityHashCode);
        int i15 = ~iIdentityHashCode;
        if (i13 != (-549964522) + ((i14 | (~(2096889850 | i15))) * (-406)) + ((~((-1827670081) | i15)) * (-406)) + (((~(iIdentityHashCode | (-269219771))) | (~(1828351848 | i15))) * 406)) {
            int i16 = (-1031040590) % 2;
            throw new ArithmeticException();
        }
        int i17 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i18 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        if (i17 != (-1740845708) + (((~((-386400386) | i18)) | (~((~i18) | (-1216387929)))) * (-318)) + (((~(923550855 | i18)) | (-2139938784)) * (-318)) + (((~(i18 | (-923550856))) | 1753538398) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
            int i19 = INotificationSideChannel + 7;
            onTransact = i19 % 128;
            if (i19 % 2 == 0) {
                int[] iArr3 = new int[608405156];
                iArr3[608405155] = 1;
                Toast.makeText((Context) null, iArr3[-1], 0).show();
            } else {
                int[] iArr4 = new int[608405156];
                iArr4[608405155] = 1;
                int i20 = (-1134259604) % 2;
                Toast.makeText((Context) null, iArr4[-1], 1).show();
            }
        }
        int i21 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i22 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
        int i23 = ~i22;
        if (i21 != (-626175818) + (((~((-260226487) | i23)) | (-1976137818)) * (-602)) + (((~(i22 | (-260226487))) | 167937446 | (~((-1883848778) | i23))) * (-301)) + ((~(i23 | (-1976137818))) * 301)) {
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 40, 19 - TextUtils.indexOf("", "", 0, 0), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 46401), 40 - (ViewConfiguration.getLongPressTimeout() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onResume();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - TextUtils.lastIndexOf("", '0')), 40 - View.combineMeasuredStates(0, 0), MotionEvent.axisFromString("") + 20, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = null;
        Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 46400), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 41, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19, 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj2, null);
            super.onPause();
            int i4 = INotificationSideChannel + 77;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArr3;
        PinangWebViewActivity pinangWebViewActivity = (PinangWebViewActivity) objArr[0];
        int i = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int pressedStateDuration = 1031 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 15;
            byte[] bArr = $$a;
            byte b = (byte) (bArr[0] + 1);
            byte b2 = bArr[7];
            Object[] objArr4 = new Object[1];
            e(b, b2, (short) (b2 | 62), objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, pressedStateDuration, windowTouchSlop, 1357589585, false, (String) objArr4[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr5 = new Object[1];
        c(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 65, (ViewConfiguration.getWindowTouchSlop() >> 8) + 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step3).substring(0, 3).length() + 5, new char[]{17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16}, objArr5);
        Class<?> cls = Class.forName((String) objArr5[0]);
        Object[] objArr6 = new Object[1];
        c(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 144, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_dompetku).substring(0, 16).length() - 1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 32, new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, objArr6);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr6[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRed = (char) Color.red(0);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
            int iCombineMeasuredStates = 15 - View.combineMeasuredStates(0, 0);
            byte[] bArr2 = $$a;
            byte b3 = (byte) (bArr2[0] + 1);
            byte b4 = bArr2[7];
            Object[] objArr7 = new Object[1];
            e(b3, b4, (short) (b4 | 166), objArr7);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, maximumFlingVelocity, iCombineMeasuredStates, 1344079056, false, (String) objArr7[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1031;
                int doubleTapTimeout = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte b5 = $$a[7];
                byte b6 = (byte) (b5 | 14);
                Object[] objArr8 = new Object[1];
                e(b5, b6, (short) (b6 | 48), objArr8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, iResolveOpacity, doubleTapTimeout, 632103528, false, (String) objArr8[0], null);
            }
            Object[] objArr9 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i2 = ((int[]) objArr9[3])[0];
            int i3 = ((int[]) objArr9[1])[0];
            String[] strArr = (String[]) objArr9[0];
            int i4 = ~((int) Runtime.getRuntime().freeMemory());
            int i5 = (-500699770) + (((~(718989141 | i4)) | (-963269312)) * (-983)) + (((~(i4 | (-963269312))) | 675955221) * 983) + 194789674;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr2[2])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr10 = new Object[1];
            c(false, MotionEvent.axisFromString("") + 176, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama4_permata).substring(16, 17).codePointAt(0) - 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 36, new char[]{65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n'}, objArr10);
            Class<?> cls2 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.coming_soon).substring(6, 7).length() + 178, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 30, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4, new char[]{14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3}, objArr11);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr11[0], Object.class).invoke(null, pinangWebViewActivity)).intValue();
            try {
                Object[] objArr12 = {826734766};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46038), 1134 - View.combineMeasuredStates(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 17, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr13 = {Integer.valueOf(iIntValue), 0, 194789674, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr12), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int iCombineMeasuredStates2 = 1031 - View.combineMeasuredStates(0, 0);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 15;
                    byte[] bArr3 = $$a;
                    byte b7 = (byte) (bArr3[0] + 1);
                    byte b8 = bArr3[7];
                    Object[] objArr14 = new Object[1];
                    e(b7, b8, (short) (b8 | 62), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iCombineMeasuredStates2, iKeyCodeFromString, 1298546779, false, (String) objArr14[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 45992), 1117 - KeyEvent.keyCodeFromString(""), 17 - Color.blue(0)), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                    int i8 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                    byte b9 = $$a[7];
                    byte b10 = (byte) (b9 | 14);
                    Object[] objArr15 = new Object[1];
                    e(b9, b10, (short) (b10 | 48), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, i8, minimumFlingVelocity, 632103528, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr16 = new Object[1];
                    c(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 130, TextUtils.indexOf("", "", 0) + 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 28, new char[]{17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16}, objArr16);
                    Class<?> cls3 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(false, Process.getGidForName("") + 181, 15 - KeyEvent.getDeadChar(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 94, new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, objArr17);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        int maxKeyCode = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
                        int iBlue = Color.blue(0) + 15;
                        byte[] bArr4 = $$a;
                        byte b11 = (byte) (bArr4[0] + 1);
                        byte b12 = bArr4[7];
                        Object[] objArr18 = new Object[1];
                        e(b11, b12, (short) (b12 | 166), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar, maxKeyCode, iBlue, 1344079056, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 1);
                        int offsetAfter = 1031 - TextUtils.getOffsetAfter("", 0);
                        int iCombineMeasuredStates3 = View.combineMeasuredStates(0, 0) + 15;
                        byte[] bArr5 = $$a;
                        byte b13 = (byte) (bArr5[0] + 1);
                        byte b14 = bArr5[7];
                        Object[] objArr19 = new Object[1];
                        e(b13, b14, (short) (b14 | 62), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(gidForName, offsetAfter, iCombineMeasuredStates3, 1357589585, false, (String) objArr19[0], null);
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
        int i9 = ((int[]) objArr2[1])[0];
        int i10 = ((int[]) objArr2[3])[0];
        if (i10 == i9) {
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i11 = ((int[]) objArr2[2])[0];
            int i12 = ((int[]) objArr2[3])[0];
            int i13 = ((int[]) objArr2[1])[0];
            String[] strArr2 = (String[]) objArr2[0];
            int iMyPid = Process.myPid();
            int i14 = ~(983425140 | iMyPid);
            int i15 = i11 + (-1584159212) + (((-1050670463) | i14) * (-814)) + ((i14 | (~((~iMyPid) | 739144970)) | 671899648) * 407) + (((~(iMyPid | (-739144971))) | (~((-983425141) | iMyPid)) | 671899648) * 407);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr20[2])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr2[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    int i18 = onTransact + 109;
                    INotificationSideChannel = i18 % 128;
                    int i19 = i18 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i10];
            int i20 = i10 - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i20) % 2) - 1], 1).show();
            Object[] objArr21 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr2[2])[0];
            int i22 = ((int[]) objArr2[3])[0];
            int i23 = ((int[]) objArr2[1])[0];
            String[] strArr4 = (String[]) objArr2[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i24 = i21 + 1739565539 + (((~iFreeMemory) | 10519916) * 1324) + (((~(iFreeMemory | 99403245)) | (~(144876924 | iFreeMemory))) * (-1324)) + 1756215030;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr21[2])[0] = i26 ^ (i26 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
            int iResolveSize = View.resolveSize(0, 0) + 23;
            byte[] bArr6 = $$a;
            byte b15 = (byte) (bArr6[208] - 1);
            byte b16 = bArr6[7];
            Object[] objArr22 = new Object[1];
            e(b15, b16, (short) (b16 | 203), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveOpacity, maximumDrawingCacheSize, iResolveSize, 986134021, false, (String) objArr22[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char packedPositionGroup = (char) (29944 - ExpandableListView.getPackedPositionGroup(0L));
                int defaultSize = View.getDefaultSize(0, 0) + 1755;
                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
                byte[] bArr7 = $$a;
                byte b17 = (byte) (bArr7[0] + 1);
                byte b18 = bArr7[7];
                Object[] objArr23 = new Object[1];
                e(b17, b18, (short) (b18 | 166), objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(packedPositionGroup, defaultSize, doubleTapTimeout2, 1599039318, false, (String) objArr23[0], null);
            }
            Object[] objArr24 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr24[0])[0]}, new int[]{((int[]) objArr24[1])[0]}, (Object[]) objArr24[2], new int[1], (String[]) objArr24[4]};
            int iMyTid = Process.myTid();
            int i27 = 1707100150 + (((-589332545) | iMyTid) * (-381)) + (((~((~iMyTid) | (-590656067))) | 215249470) * 381) + 924425254;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr3[3])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr25 = new Object[1];
            c(false, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 174, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 93, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_card_alto).substring(45, 50).codePointAt(0) - 22, new char[]{65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n'}, objArr25);
            Class<?> cls4 = Class.forName((String) objArr25[0]);
            Object[] objArr26 = new Object[1];
            c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_kioson).substring(0, 6).length() + 173, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_uob).substring(1, 3).codePointAt(1) - 105, 5 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3}, objArr26);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr26[0], Object.class).invoke(null, pinangWebViewActivity)).intValue();
            Object[] objArr27 = {826734766};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 42049), View.resolveSize(0, 0) + 1726, Color.alpha(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr27), -272974618);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char windowTouchSlop2 = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                int trimmedLength = 1755 - TextUtils.getTrimmedLength("");
                int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 24;
                byte[] bArr8 = $$a;
                byte b19 = (byte) (bArr8[0] + 1);
                byte b20 = bArr8[7];
                Object[] objArr28 = new Object[1];
                e(b19, b20, (short) (b20 | 166), objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(windowTouchSlop2, trimmedLength, packedPositionChild2, 1599039318, false, (String) objArr28[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
            try {
                Object[] objArr29 = new Object[1];
                c(false, 177 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_atm_instruction_6).substring(12, 13).length() + 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 28, new char[]{17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16}, objArr29);
                Class<?> cls5 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                c(false, 180 - View.MeasureSpec.getMode(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, objArr30);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr30[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
                    int modifierMetaStateMask = 1754 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                    byte[] bArr9 = $$a;
                    byte b21 = (byte) (bArr9[0] + 1);
                    byte b22 = bArr9[7];
                    Object[] objArr31 = new Object[1];
                    e(b21, b22, (short) (b22 | 114), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cKeyCodeFromString, modifierMetaStateMask, packedPositionType, 1596667560, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf2 = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
                    int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
                    int iIndexOf = 23 - TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr10 = $$a;
                    byte b23 = (byte) (bArr10[208] - 1);
                    byte b24 = bArr10[7];
                    Object[] objArr32 = new Object[1];
                    e(b23, b24, (short) (b24 | 203), objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf2, offsetBefore, iIndexOf, 986134021, false, (String) objArr32[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i30 = onTransact + 115;
                INotificationSideChannel = i30 % 128;
                int i31 = i30 % 2;
                objArr3 = objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i32 = ((int[]) objArr3[1])[0];
        int i33 = ((int[]) objArr3[0])[0];
        if (i33 != i32) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr3[4];
            if (strArr5 != null) {
                int i34 = INotificationSideChannel + 103;
                onTransact = i34 % 128;
                int i35 = i34 % 2;
                for (String str2 : strArr5) {
                    int i36 = INotificationSideChannel + 7;
                    onTransact = i36 % 128;
                    int i37 = i36 % 2;
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i33));
        }
        int i38 = onTransact + 1;
        INotificationSideChannel = i38 % 128;
        int i39 = i38 % 2;
        int i40 = ((int[]) objArr3[3])[0];
        Object[] objArr33 = {new int[]{((int[]) objArr3[0])[0]}, new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[1], (String[]) objArr3[4]};
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int i41 = ~iFreeMemory2;
        int i42 = i40 + 1958285609 + ((~(292647386 | i41)) * (-560)) + ((~(iFreeMemory2 | 368407546)) * (-560)) + (((~((-80044961) | i41)) | 4284800) * 560);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr33[3])[0] = i44 ^ (i44 << 5);
        return null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -353833216
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.PinangWebViewActivity.onStart():void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        ActivityPinangWebviewBinding activityPinangWebviewBinding = (ActivityPinangWebviewBinding) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        activityPinangWebviewBinding.browser.loadUrl(OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentbindingInflater1(str, str2));
        int i4 = onTransact + 21;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1(PinangWebViewActivity pinangWebViewActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(pinangWebViewActivity);
        int i2 = onTransact + 21;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return outputformattoaudioprofile;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = INotificationSideChannel + 63;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(PinangWebViewActivity pinangWebViewActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 69;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            bool.booleanValue();
            obj.hashCode();
            throw null;
        }
        if (!bool.booleanValue()) {
            int i3 = INotificationSideChannel + 31;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                PinangWebViewActivity pinangWebViewActivity2 = pinangWebViewActivity;
                String string = pinangWebViewActivity.getString(R.string.message_storage_permission_required);
                Intrinsics.checkNotNullExpressionValue(string, "");
                AutoValue_LifecycleCameraRepository_Key.b(pinangWebViewActivity2, string);
                throw null;
            }
            PinangWebViewActivity pinangWebViewActivity3 = pinangWebViewActivity;
            String string2 = pinangWebViewActivity.getString(R.string.message_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            AutoValue_LifecycleCameraRepository_Key.b(pinangWebViewActivity3, string2);
            int i4 = INotificationSideChannel + 31;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = INotificationSideChannel + 29;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityPinangWebviewBinding activityPinangWebviewBinding, String str, String str2) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{activityPinangWebviewBinding, str, str2}, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1468740569, -1468740568, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static {
        byte[] bArr = new byte[517];
        System.arraycopy("\u007f+ÙÛñÿ<Äõý\u0005ø\u00044Êð\u0007ï\u0000\u0003\u00023¾\tê\fð\u0006\u0005ò;Èñ\u0000úúA¶þ\bú\u0000ò\b\u0001ïBÞéê\fð\u0006\u0005ò%È\b\nñ\u0001\u0003\u001dÑ\u0000úúüLýÜÊ\u0001\fð\u0001\nò\u0016×\b÷\t\u0000î\b\u0003\u0014èñ\bû\u0000-ø\u0002Ü\tò\b÷þ\u001bìå\t\u0005ô÷+Ñ\u000e÷÷\u0005ô÷þ\u0000\bÿ÷\u0005ò\u0000øÿ\u0000ø\u0006þë\n\u0001ë'Û\büö\u0005üü\u0002é\u0006õ?ñÿ<Êð\u0007ï\u0000\u0003\u00023µ\u0004\u0000ý\u0004éHêË÷\b\b\u000eêñù\rïü Ù\rí\r>Íéó\u0000õ\u000bø\u0004!ßûø\u0000Ü\tò\b÷þ\u001bìå\t\u0005ô÷+Ñ\u000e÷÷\u0005ô÷þ\u0000\bÿ÷\u0005ò\u0000øÿ\u0000ø\u0006þë\n\u0001ë'Û\büö\u0005üü\u0002é\u0006õ@ñÿ<Äõý\u0005ø\u00044Êð\u0007ï\u0000\u0003\u00023Ä÷÷BÂø÷\fð\u0001\nò;¾þþÿò\u0012ùñÿýûþ=±ý\u0015íßì\u000b\u000bê\u0001ëPÀÜ\tò\b÷þ\u001bìå\t\u0005ô÷+Ñ\u000e÷÷\u0005ô÷þ\u0000\bÿ÷\u0005ò\u0000øÿ\u0000ø\u0006þë\n\u0001ë'Û\büö\u0005üü\u0002é\u0006õ>ñÿ<Éï\u0003ôü\u0006óDÇ\u0000ê\u00100ºù\rí\rùø\u00046¹\nõûø\f4ÚÙ\rí\rùø\u0004#Î\u0004ÿî.ßñ\u0005ð\u000e\u000fÜ\bô\u0019êîÿö)éæ!èù\u0005ó÷þ(Ø\u001eáúý\u0000ó\u0019ìüú\u0004\u0010êïû\u0005\u0001ø\u0004@¿ñÿ<Ç\u0000ê\u0010úò\u00056Êð\u0007ï\u0000\u0003\u00023Èñú\n4Âø÷\fð\u0001\nò;èÑú\n\u001cÞ\u0001êü\u0000\n>±û\nò\fì\n\u0014çö%Î\u000eë\b!àê\u0010:ð".getBytes("ISO-8859-1"), 0, bArr, 0, 517);
        $$d = bArr;
        $$e = 215;
        $$a = new byte[]{51, -99, -8, -59, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
        $$b = 144;
        cancelAll = 0;
        notify = 1;
        INotificationSideChannel = 0;
        onTransact = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        int i = cancelAll + 3;
        notify = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1704755787;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{this, context}, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 774967175, -774967175, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 518099116, SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1.b(), length);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        asInterface = -83722449;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, short r8) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = com.bpjstku.presentation.danasiaga.PinangWebViewActivity.$$c
            int r8 = r8 + 119
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r8 = r8 + 1
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.PinangWebViewActivity.$$g(byte, int, short):java.lang.String");
    }
}
