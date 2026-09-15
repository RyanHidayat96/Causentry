package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentCustomBottomDialogBinding;
import com.google.android.material.button.MaterialButton;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0012B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0010R\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\u001a8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0011\u001a\u00020 8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010\u0016\u001a\u00020 8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0016\u0010\u001e\u001a\u00020 8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0018\u0010\u0013\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010%"}, d2 = {"LCamera2CameraControlImplExternalSyntheticLambda5;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function0;", "", "p0", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "onDestroyView", "a", "Lkotlin/jvm/functions/Function0;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "()I", "Lcom/bpjstku/databinding/FragmentCustomBottomDialogBinding;", "Lcom/bpjstku/databinding/FragmentCustomBottomDialogBinding;", "asInterface", "I", "", "cancel", "Ljava/lang/String;", "asBinder", "LCamera2CameraControlImplExternalSyntheticLambda5$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LCamera2CameraControlImplExternalSyntheticLambda5$TuitionPaymentFragmentspecialinlinedviewModeldefault3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraControlImplExternalSyntheticLambda5 extends unregisterMediaButtonEventReceiver {
    private static int INotificationSideChannelStub;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char cancelAll;
    private static char[] onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public TuitionPaymentFragmentspecialinlinedviewModeldefault3 d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentCustomBottomDialogBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private String asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {91, -17, 90, 37};
    private static final int $$f = 61;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {106, -22, 107, 95, -62, -9, -5, 15, -21, -21, -19, 6, -4, 8, -34, -9, -15, -2, 4, -43, -5, -13, 3, 12, -48, -9, -6, -15, -9, 27, -43, -14, 1, -16, -9, -15, 10, 8, -34, -9, -15, -2, 4, -43, -5, -13, 3, 12, -48, -9, -6, -15, -9, 27, -43, -14, 1, -16, -9, -15, 32, -47, -16, 5, -23, -6, 3, -21, 62, -23, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$e = 102;
    private static final byte[] $$a = {87, 51, -85, 78, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 29;
    private static int RemoteActionCompatParcelizer = 1;
    private static int INotificationSideChannel = 0;
    private static int notify = 1;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = i4 | i7;
        int i9 = ~i6;
        int i10 = ~((~i4) | i7);
        int i11 = i + i6 + i3 + (1977613057 * i2) + (454551927 * i5);
        int i12 = i11 * i11;
        int i13 = (1378041352 * i) + 473956352 + (953991674 * i6) + (212024839 * i8) + (i9 * (-212024839)) + ((-212024839) * i10) + (1166016512 * i3) + ((-981467136) * i2) + ((-830472192) * i5) + ((-499122176) * i12);
        int i14 = (i * (-1131120504)) + 246467939 + (i6 * (-1131119078)) + (i8 * (-713)) + (i9 * 713) + (i10 * 713) + (i3 * (-1131119791)) + (i2 * (-1039407535)) + (i5 * 1820920743) + (i12 * 1447034880);
        if (i13 + (i14 * i14 * 1170210816) != 1) {
            return b(objArr);
        }
        int i15 = 2 % 2;
        int i16 = notify + 125;
        INotificationSideChannel = i16 % 128;
        int i17 = i16 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r0 = r6 + 1
            int r8 = r8 * 52
            int r8 = 56 - r8
            byte[] r1 = defpackage.Camera2CameraControlImplExternalSyntheticLambda5.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r7 = r7 + r8
            int r8 = r3 + 1
            int r7 = r7 + (-10)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Camera2CameraControlImplExternalSyntheticLambda5.c(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 29
            int r0 = r5 + 38
            int r7 = r7 * 19
            int r7 = 84 - r7
            int r6 = r6 * 66
            int r6 = 69 - r6
            byte[] r1 = defpackage.Camera2CameraControlImplExternalSyntheticLambda5.$$d
            byte[] r0 = new byte[r0]
            int r5 = r5 + 37
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r5
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r5) goto L2a
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L2a:
            r3 = r1[r6]
        L2c:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-10)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Camera2CameraControlImplExternalSyntheticLambda5.f(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda5(Function0 function0, Function0 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = INotificationSideChannel + 61;
            notify = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            function0 = null;
        }
        if ((i & 2) != 0) {
            int i5 = INotificationSideChannel + 95;
            notify = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
            function1 = null;
        }
        this(function0, function1);
    }

    public Camera2CameraControlImplExternalSyntheticLambda5(Function0<Unit> function0, Function0<Unit> function1) {
        this.TuitionPaymentFragmentbindingInflater1 = function0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
    }

    /* JADX INFO: renamed from: Camera2CameraControlImplExternalSyntheticLambda5$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"LCamera2CameraControlImplExternalSyntheticLambda5$b;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "p3", "Lkotlin/Function0;", "", "p4", "p5", "p6", "LCamera2CameraControlImplExternalSyntheticLambda5;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)LCamera2CameraControlImplExternalSyntheticLambda5;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static Camera2CameraControlImplExternalSyntheticLambda5 TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0, String p1, String p2, String p3, Function0<Unit> p4, String p5, Function0<Unit> p6) {
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            Intrinsics.checkNotNullParameter(p5, "");
            Camera2CameraControlImplExternalSyntheticLambda5 camera2CameraControlImplExternalSyntheticLambda5 = new Camera2CameraControlImplExternalSyntheticLambda5(p4, p6);
            Bundle bundle = new Bundle();
            bundle.putInt("result_dialog_image", p0);
            bundle.putString("result_dialog_title", p1);
            bundle.putString("result_dialog_message", p2);
            bundle.putString("result_dialog_button_text", p3);
            bundle.putString("result_dialog_secondary_button_text", p5);
            camera2CameraControlImplExternalSyntheticLambda5.setArguments(bundle);
            return camera2CameraControlImplExternalSyntheticLambda5;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        int i2 = notify + 9;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentCustomBottomDialogBinding fragmentCustomBottomDialogBindingInflate = FragmentCustomBottomDialogBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fragmentCustomBottomDialogBindingInflate;
        Intrinsics.checkNotNull(fragmentCustomBottomDialogBindingInflate);
        FrameLayout root = fragmentCustomBottomDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        FrameLayout frameLayout = root;
        int i4 = notify + 75;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return frameLayout;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = arguments.getInt("result_dialog_image");
            String string = arguments.getString("result_dialog_title");
            Object obj = null;
            String str = "";
            if (string == null) {
                int i2 = INotificationSideChannel + 11;
                notify = i2 % 128;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                string = "";
            }
            this.asBinder = string;
            String string2 = arguments.getString("result_dialog_message");
            if (string2 == null) {
                int i3 = notify + 9;
                INotificationSideChannel = i3 % 128;
                int i4 = i3 % 2;
                string2 = "";
            }
            this.g = string2;
            String string3 = arguments.getString("result_dialog_button_text");
            if (string3 == null) {
                string3 = "";
            }
            this.a = string3;
            String string4 = arguments.getString("result_dialog_secondary_button_text");
            if (string4 == null) {
                int i5 = notify + 11;
                INotificationSideChannel = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            } else {
                str = string4;
            }
            this.asInterface = str;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        int i = 2 % 2;
        FragmentCustomBottomDialogBinding fragmentCustomBottomDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNull(fragmentCustomBottomDialogBinding);
        fragmentCustomBottomDialogBinding.imgSuccess.setImageResource(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        TextView textView = fragmentCustomBottomDialogBinding.tvResultMessage;
        String str = this.g;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        textView.setText(str);
        MaterialButton materialButton = fragmentCustomBottomDialogBinding.btnResultDialog;
        String str3 = this.a;
        if (str3 == null) {
            int i2 = notify + 75;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            str3 = null;
        }
        materialButton.setText(str3);
        TextView textView2 = fragmentCustomBottomDialogBinding.tvResultTitle;
        String str4 = this.asBinder;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str4 = null;
        }
        textView2.setText(str4);
        String str5 = this.asInterface;
        if (str5 == null) {
            int i4 = INotificationSideChannel + 11;
            notify = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = 34 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            str5 = null;
        }
        if (str5.length() > 0) {
            TextView textView3 = fragmentCustomBottomDialogBinding.btnNo;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(0);
            TextView textView4 = fragmentCustomBottomDialogBinding.btnNo;
            String str6 = this.asInterface;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = notify + 59;
                INotificationSideChannel = i6 % 128;
                int i7 = i6 % 2;
                str6 = null;
            }
            textView4.setText(str6);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            fragmentCustomBottomDialogBinding.tvResultMessage.setJustificationMode(1);
            int i8 = notify + 117;
            INotificationSideChannel = i8 % 128;
            int i9 = i8 % 2;
        }
        String str7 = this.asBinder;
        if (str7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            str2 = str7;
        }
        if (str2.length() == 0) {
            int i10 = notify + 67;
            INotificationSideChannel = i10 % 128;
            int i11 = i10 % 2;
            TextView textView5 = fragmentCustomBottomDialogBinding.tvResultTitle;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            textView5.setVisibility(8);
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        final Camera2CameraControlImplExternalSyntheticLambda5 camera2CameraControlImplExternalSyntheticLambda5 = (Camera2CameraControlImplExternalSyntheticLambda5) objArr[0];
        int i = 2 % 2;
        final FragmentCustomBottomDialogBinding fragmentCustomBottomDialogBinding = camera2CameraControlImplExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNull(fragmentCustomBottomDialogBinding);
        MaterialButton materialButton = fragmentCustomBottomDialogBinding.btnResultDialog;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: Camera2CameraControlImplExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraControlImplExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(fragmentCustomBottomDialogBinding, camera2CameraControlImplExternalSyntheticLambda5, (View) obj);
            }
        }));
        TextView textView = fragmentCustomBottomDialogBinding.btnNo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: Camera2CameraControlImplExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraControlImplExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        int i2 = INotificationSideChannel + 3;
        notify = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        int i = 2 % 2;
        int i2 = notify + 33;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentbindingInflater1();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = notify + 125;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroyView();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            int i3 = 52 / 0;
        } else {
            super.onDestroyView();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        }
        int i4 = notify + 33;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0126  */
    /* JADX WARN: Code duplicated, block: B:34:0x013f  */
    /* JADX WARN: Code duplicated, block: B:37:0x018c A[Catch: all -> 0x034c, TryCatch #0 {all -> 0x034c, blocks: (B:7:0x002a, B:9:0x0038, B:10:0x006e, B:14:0x0089, B:16:0x009a, B:17:0x00cf, B:35:0x0141, B:37:0x018c, B:39:0x0207, B:43:0x021c, B:45:0x0257, B:47:0x02bb), top: B:64:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0205  */
    /* JADX WARN: Code duplicated, block: B:42:0x021a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0257 A[Catch: all -> 0x034c, TryCatch #0 {all -> 0x034c, blocks: (B:7:0x002a, B:9:0x0038, B:10:0x006e, B:14:0x0089, B:16:0x009a, B:17:0x00cf, B:35:0x0141, B:37:0x018c, B:39:0x0207, B:43:0x021c, B:45:0x0257, B:47:0x02bb), top: B:64:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x030c  */
    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = onTransact;
        long j = 0;
        int i4 = 1770390596;
        Object obj2 = null;
        int i5 = 6;
        if (cArr2 != null) {
            int i6 = $11 + 77;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> i5);
                        int iAxisFromString = MotionEvent.axisFromString("") + 2268;
                        int i9 = 34 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, iAxisFromString, i9, -1927765101, false, $$g(b2, b3, (byte) (b3 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                    i8++;
                    j = 0;
                    i4 = 1770390596;
                    i5 = 6;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(cancelAll)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            byte b4 = (byte) 0;
            byte b5 = (byte) (b4 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), 2267 - KeyEvent.keyCodeFromString(""), 'Q' - AndroidCharacter.getMirror('0'), -1927765101, false, $$g(b4, b5, (byte) (b5 - 3)), new Class[]{Integer.TYPE});
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
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $11 + 119;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3260, 30 - (ViewConfiguration.getPressedStateDuration() >> 16), -127612708, false, $$g(b6, b7, (byte) (b7 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), Process.getGidForName("") + 595, 17 - KeyEvent.getDeadChar(0, 0), 1570859318, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                            int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                            } else {
                                int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                            }
                        }
                    }
                } else {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3260, 30 - (ViewConfiguration.getPressedStateDuration() >> 16), -127612708, false, $$g(b10, b11, (byte) (b11 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b12 = (byte) 0;
                                byte b13 = b12;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), Process.getGidForName("") + 595, 17 - KeyEvent.getDeadChar(0, 0), 1570859318, false, $$g(b12, b13, b13), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                            } else {
                                int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i110 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i19];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i110];
                            }
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                int i20 = $11 + 45;
                $10 = i20 % 128;
                int i21 = i20 % 2;
                obj2 = obj;
            }
        }
        for (int i22 = 0; i22 < i; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0224  */
    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getD() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAlpha = (char) (31533 - Color.alpha(0));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
            int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr = $$a;
            byte b = bArr[80];
            byte b2 = bArr[37];
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, maximumFlingVelocity, maximumDrawingCacheSize, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{14, 31, ' ', 25, '\t', 23, Typography.quote, 19, 7, 23, 28, 16, '\r', 23, 18, 2, 22, Typography.quote, 17, '\t', '!', 24}, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 96), 21 - TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{3, '\f', 15, 7, 18, 1, ' ', 1, 1, '\f', 14, 21, 22, 15, 13945}, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 122), 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (31534 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 921;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 29;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c((byte) (bArr2[1] + 1), bArr2[80], bArr2[37], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iKeyCodeFromString, iLastIndexOf, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 921;
                int i2 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27;
                byte b3 = $$a[80];
                Object[] objArr6 = new Object[1];
                c((byte) 37, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, jumpTapTimeout, i2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iMyPid = Process.myPid();
            int i3 = ~iMyPid;
            int i4 = ((1053551265 + (((~((-1279679026) | i3)) | (~((-494400619) | iMyPid))) * (-370))) + ((((~(iMyPid | (-1279679026))) | (~(i3 | (-494400619)))) | (-1568145020)) * (-370))) - 1340781683;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{14, 31, ' ', 25, '\t', 23, Typography.quote, 19, 15, 7, '\n', 21, 0, '!', 21, 22, 3, 22, 23, 14, 24, 19, 24, 2, 19, 1}, (byte) (85 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 27, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, '\f', 13861, 13861, 2, 30, 21, 2, 13863, 13863, 21, 27, 31, '\f', 21, 22, '\b', '#'}, (byte) (TextUtils.indexOf("", "", 0, 0) + 61), View.combineMeasuredStates(0, 0) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i7 = notify + 125;
                int i8 = i7 % 128;
                INotificationSideChannel = i8;
                int i9 = i7 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = i8 + 113;
                    notify = i10 % 128;
                    int i11 = i10 % 2;
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
            e(new char[]{31, 16, 1, 16, 21, 16, 14, 31, '\n', 20, 11, 16, 20, 21, 4, '\f'}, (byte) (43 - ImageFormat.getBitsPerPixel(0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{19, '!', 2, 30, 21, 22, 23, 14, 25, '\f', 20, 19, 29, '\n', 30, 1}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 61), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = INotificationSideChannel + 17;
            notify = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -947709243};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[32];
                byte b5 = b4;
                Object[] objArr13 = new Object[1];
                f(b4, b5, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[94];
                byte b7 = b6;
                Object[] objArr14 = new Object[1];
                f(b6, b7, b7, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) (31534 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int mode = View.MeasureSpec.getMode(0) + 921;
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 29;
                    byte b8 = $$a[80];
                    Object[] objArr15 = new Object[1];
                    c((byte) 37, b8, b8, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, mode, iLastIndexOf2, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new char[]{14, 31, ' ', 25, '\t', 23, Typography.quote, 19, 7, 23, 28, 16, '\r', 23, 18, 2, 22, Typography.quote, 17, '\t', '!', 24}, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 95), TextUtils.getTrimmedLength("") + 22, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new char[]{3, '\f', 15, 7, 18, 1, ' ', 1, 1, '\f', 14, 21, 22, 15, 13945}, (byte) (123 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 15 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (31533 - TextUtils.indexOf("", "", 0, 0));
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 921;
                        int defaultSize = 28 - View.getDefaultSize(0, 0);
                        byte[] bArr4 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) (bArr4[1] + 1), bArr4[80], bArr4[37], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, scrollDefaultDelay, defaultSize, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf2 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        int scrollBarSize = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 28;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[80];
                        byte b10 = bArr5[37];
                        Object[] objArr19 = new Object[1];
                        c(b9, b10, b10, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, scrollBarSize, absoluteGravity, -1048449946, false, (String) objArr19[0], null);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i16 = INotificationSideChannel + 103;
                notify = i16 % 128;
                int i17 = i16 % 2;
                for (String str : strArr) {
                    int i18 = notify + 37;
                    INotificationSideChannel = i18 % 128;
                    int i19 = i18 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        int i20 = notify + 105;
        INotificationSideChannel = i20 % 128;
        int i21 = i20 % 2;
        int i22 = ((int[]) objArr[0])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i23 = (~System.identityHashCode(this)) | 418503195;
        int i24 = i22 + 98803850 + (i23 * 495) + (((~i23) | 281038848) * 495);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr20[0])[0] = i26 ^ (i26 << 5);
        int i27 = INotificationSideChannel + 103;
        notify = i27 % 128;
        if (i27 % 2 != 0) {
            return R.layout.fragment_custom_bottom_dialog;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(FragmentCustomBottomDialogBinding fragmentCustomBottomDialogBinding, Camera2CameraControlImplExternalSyntheticLambda5 camera2CameraControlImplExternalSyntheticLambda5, View view) {
        Function0<Unit> function0;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 67;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            int i4 = 56 / 0;
            if (fragmentCustomBottomDialogBinding.cbAgreeTermCondition.isChecked()) {
                function0 = camera2CameraControlImplExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1;
                if (function0 != null) {
                    function0.invoke();
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = camera2CameraControlImplExternalSyntheticLambda5.d;
                camera2CameraControlImplExternalSyntheticLambda5.dismiss();
            } else {
                String string = camera2CameraControlImplExternalSyntheticLambda5.getString(R.string.message_agreed_tnc);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
                int i5 = INotificationSideChannel + 13;
                notify = i5 % 128;
                int i6 = i5 % 2;
            }
        } else if (fragmentCustomBottomDialogBinding.cbAgreeTermCondition.isChecked()) {
            function0 = camera2CameraControlImplExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1;
            if (function0 != null) {
                function0.invoke();
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = camera2CameraControlImplExternalSyntheticLambda5.d;
            camera2CameraControlImplExternalSyntheticLambda5.dismiss();
        } else {
            String string2 = camera2CameraControlImplExternalSyntheticLambda5.getString(R.string.message_agreed_tnc);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string2, 0).show();
            int i7 = INotificationSideChannel + 13;
            notify = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera2CameraControlImplExternalSyntheticLambda5 camera2CameraControlImplExternalSyntheticLambda5, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = camera2CameraControlImplExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (function0 != null) {
            int i2 = INotificationSideChannel + 83;
            notify = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = camera2CameraControlImplExternalSyntheticLambda5.d;
        camera2CameraControlImplExternalSyntheticLambda5.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannel + 119;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static {
        INotificationSideChannelStub = 0;
        asInterface();
        INSTANCE = new Companion(null);
        int i = RemoteActionCompatParcelizer + 97;
        INotificationSideChannelStub = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Camera2CameraControlImplExternalSyntheticLambda5() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1128366193, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1128366193);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1553739085, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1553739086);
    }

    static void asInterface() {
        onTransact = new char[]{60062, 59753, 60073, 60090, 60045, 59750, 60046, 59751, 60060, 60043, 60072, 60052, 59745, 60058, 59747, 60055, 60054, 60034, 60051, 60040, 60047, 60050, 60117, 59744, 60083, 60079, 60041, 60048, 60088, 59746, 60056, 60063, 60053, 59749, 60049, 59748};
        cancelAll = (char) 57191;
    }

    private static String $$g(short s, int i, short s2) {
        byte[] bArr = $$c;
        int i2 = 116 - i;
        int i3 = s2 * 3;
        int i4 = 4 - (s * 4);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4++;
            i2 = i4 + (-i2);
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i4];
            i4++;
            i2 += -b;
        }
    }
}
